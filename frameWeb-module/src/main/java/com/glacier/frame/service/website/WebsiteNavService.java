package com.glacier.frame.service.website;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.glacier.basic.util.JackJson;
import com.glacier.basic.util.RandomGUID;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.jqueryui.util.Tree;
import com.glacier.frame.dao.system.UserMapper;
import com.glacier.frame.dao.website.WebsiteNavMapper;
import com.glacier.frame.entity.system.User;
import com.glacier.frame.entity.website.WebsiteNav;
import com.glacier.frame.entity.website.WebsiteNavExample;
import com.glacier.frame.util.MethodLog;

/**
 * @ClassName: WebsiteNavService 
 * @Description: TODO(网站导航业务类) 
 * @author yuzexu
 * @email 804346249@QQ.com
 * @date 2014-2-10下午5:09:28
 */
@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class WebsiteNavService {
	
	@Autowired
	private WebsiteNavMapper websiteNavMapper;
	
	@Autowired
    private UserMapper userMapper;
	
	/**
	 * @Title: getNav 
	 * @Description: TODO(根据导航Id获取下拉项信息) 
	 * @param @param webNavId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
	public Object getNav(String webNavId) {
	    WebsiteNav websiteNav = websiteNavMapper.selectByPrimaryKey(webNavId);
        return websiteNav;
	}
	
	/**
	 * @Title: getNav 
	 * @Description: TODO(取出一级导航信息的数据) 
	 * @param @param
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
	public Object getOneLevelWebNav(){
		WebsiteNavExample websiteNavExample = new WebsiteNavExample();
		websiteNavExample.createCriteria().andWebNavPidIsNull();
		List<WebsiteNav> websiteNavList =  websiteNavMapper.selectByExample(websiteNavExample);
		return websiteNavList;
	}
	
	/**
	 * @Title: getNav 
	 * @Description: TODO(取出一级导航信息的数据) 
	 * @param @param
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
	public Object getSubitemWebNav(String webNavId){
		WebsiteNavExample websiteNavExample = new WebsiteNavExample();
		websiteNavExample.createCriteria().andWebNavPidEqualTo(webNavId);
		List<WebsiteNav> websiteNavList =  websiteNavMapper.selectByExample(websiteNavExample);
		return websiteNavList;
	}
	
	/**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有导航信息) 
     * @param @param pnavr
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(JqPager pager) {
        JqGridReturn returnResult = new JqGridReturn();
        WebsiteNavExample websiteNavExample = new WebsiteNavExample();
        if (null != pager.getPage() && null != pager.getRows()) {// 设置排序信息
        	websiteNavExample.setLimitStart((pager.getPage() - 1) * pager.getRows());
        	websiteNavExample.setLimitEnd(pager.getRows());
        }
        if (StringUtils.isNotBlank(pager.getSort()) && StringUtils.isNotBlank(pager.getOrder())) {// 设置排序信息
        	websiteNavExample.setOrderByClause(pager.getOrderBy("temp_website_nav_"));
        }
        List<WebsiteNav> websiteNavs = websiteNavMapper.selectByExample(websiteNavExample); // 查询所有导航列表
        int total = websiteNavMapper.countByExample(websiteNavExample); // 查询总页数
        returnResult.setRows(websiteNavs);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }
    
    public Object listAsTree() {
        List<WebsiteNav> navList = websiteNavMapper.selectByExample(new WebsiteNavExample());
        return navList;
    }
    
    /**
     * @Title: addNav 
     * @Description: TODO(新增导航) 
     * @param @param nav
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "NavTree_add")
    public Object addNav(WebsiteNav nav) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        WebsiteNavExample websiteNavExample = new WebsiteNavExample();
        int count = 0;
        // 防止导航名称重复
        websiteNavExample.createCriteria().andWebNavNameEqualTo(nav.getWebNavName());
        count = websiteNavMapper.countByExample(websiteNavExample);// 查找相同名称的导航数量
        if (count > 0) {
            returnResult.setMsg("导航名称重复");
            return returnResult;
        }
        nav.setWebNavId(RandomGUID.getRandomGUID());
        if (nav.getWebNavPid().equals("ROOT") || nav.getWebNavPid().equals("")) {// 如果父级导航的Id为"ROOT"或为空，则将父级导航的值设置为null保存到数据库
        	nav.setWebNavPid(null);
        }
        nav.setCreater(pricipalUser.getUserId());
        nav.setCreateTime(new Date());
        nav.setUpdater(pricipalUser.getUserId());
        nav.setUpdateTime(new Date());
        count = websiteNavMapper.insert(nav);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + nav.getWebNavName() + "] 导航信息已保存");
        } else {
            returnResult.setMsg("导航信息保存失败，请联系管理员!");
        }
        return returnResult;
    }
    
    /**
     * 
     * @Title: getAllTreeNavNode
     * @Description: TODO(获取全部的导航数据组装成EasyUI树节点JSON)
     * @param @param virtualRoot 是否构建虚拟ROOT -> 系统导航作为导航
     * @param @return 设定文件
     * @return String 返回类型
     * @throws
     */
    public String getAllTreeNavNode(boolean virtualRoot, String roleId) {
        List<Tree> items = new ArrayList<Tree>();
        if (virtualRoot) {
            Tree navItem = new Tree();// 增加总的树节点作为导航信息导航
            navItem.setId("ROOT");
            navItem.setText("导航信息");
            items.add(navItem);
        }
        WebsiteNavExample websiteNavExample = new WebsiteNavExample();
        websiteNavExample.setOrderByClause("temp_website_nav.web_nav_num asc");
        List<WebsiteNav> navList = websiteNavMapper.selectByExample(websiteNavExample);
        if (null != navList && navList.size() > 0) {
            for (WebsiteNav nav : navList) {
                Tree item = new Tree();// 将查询到的导航记录某些属性值设置在ComboTreeItem中，用于页面的ComboTree的数据绑定
                item.setId(nav.getWebNavId());
                item.setText(nav.getWebNavName());
                if (StringUtils.isNotBlank(nav.getWebNavPid())) {
                    item.setPid(nav.getWebNavPid());
                } else if (virtualRoot) {
                    item.setPid("ROOT");// 如果父节点为空说明上一级为总节点
                }

                items.add(item);
            }
        }
        return JackJson.fromObjectToJson(items);
    }
    
    /**
     * @Title: editNav 
     * @Description: TODO(修改导航) 
     * @param @param nav
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "NavTree_edit")
    public Object editNav(WebsiteNav nav) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        
        List<String> returnNavList = new ArrayList<String>();// 修改上级所属导航时，禁止选择导航本身及子级导航作为导航的父级导航
        returnNavList = this.getNavChild(nav.getWebNavId(), returnNavList);// 查找导航本身及子级导航
        if(returnNavList.contains(nav.getWebNavPid())){// 如果用户是选择导航本身及子级导航作为地区的父级导航，则返回错误提示信息
        	returnResult.setMsg("禁止选择该导航本身以及子导航作为上级导航");
            return returnResult;
        }
        WebsiteNavExample websiteNavExample = new WebsiteNavExample();
        int count = 0;
        // 防止导航名称重复
        websiteNavExample.createCriteria().andWebNavIdNotEqualTo(nav.getWebNavId()).andWebNavNameEqualTo(nav.getWebNavName());
        count = websiteNavMapper.countByExample(websiteNavExample);// 查找相同中文名称的导航数量
        if (count > 0) {
            returnResult.setMsg("导航名称重复");
            return returnResult;
        }
        if (nav.getWebNavPid().equals("ROOT") || nav.getWebNavPid().equals("")) {// 如果父级导航的Id为"ROOT"或为空，则将父级导航的值设置为null保存到数据库
        	nav.setWebNavPid(null);
        }
        WebsiteNav oldNav = websiteNavMapper.selectByPrimaryKey(nav.getWebNavId());
        nav.setCreater(oldNav.getCreater());
        nav.setCreateTime(oldNav.getCreateTime());
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        nav.setUpdater(pricipalUser.getUserId());
        nav.setUpdateTime(new Date());
        count = websiteNavMapper.updateByPrimaryKey(nav);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + nav.getWebNavName() + "] 导航信息已修改");
        } else {
            returnResult.setMsg("发生未知错误，导航信息修改失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: getNavChild 
     * @Description: TODO(递归获取导航和导航子节点) 
     * @param  @param navId
     * @param  @param returnNavList
     * @param  @return设定文件
     * @return List<String>  返回类型
     * @throws 
     */
    private List<String> getNavChild(String navId,List<String> returnNavList){
    	WebsiteNavExample websiteNavExample = new WebsiteNavExample();
    	websiteNavExample.createCriteria().andWebNavPidEqualTo(navId);// 查询子导航
    	List<WebsiteNav> navs = websiteNavMapper.selectByExample(websiteNavExample);
    	if(navs.size()>0){// 如果存在子导航则遍历
    		for(WebsiteNav nav : navs){
        		this.getNavChild(nav.getWebNavId(), returnNavList);// 递归查询是否存在子导航
        	}	
    	}
    	returnNavList.add(navId);
    	return returnNavList;
    }
    
    /**
     * @Title: delNav 
     * @Description: TODO(删除导航) 
     * @param @param navId
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "NavTree_del")
    public Object delNav(String navId) {
    	WebsiteNav nav= websiteNavMapper.selectByPrimaryKey(navId);
    	WebsiteNavExample websiteNavExample = new WebsiteNavExample();
        int count = 0;
        // 防止删除有子类的父类
        websiteNavExample.createCriteria().andWebNavPidEqualTo(navId);
        count = websiteNavMapper.countByExample(websiteNavExample);// 查找有导航子类数量
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        System.out.println("count :" +count);
        if(count >0){
        	returnResult.setMsg("导航信息删除失败，不能删除有子导航的导航!");
        }else{
        	int result = websiteNavMapper.deleteByPrimaryKey(navId);//根据导航Id，进行删除导航
        	System.out.println("result :" +result);
        	if (result == 1) {
                returnResult.setSuccess(true);
                returnResult.setMsg("[" + nav.getWebNavName() + "] 导航信息已删除");
            } else {
                returnResult.setMsg("发生未知错误，导航信息删除失败");
            }
        }
        return returnResult;
     }
}
