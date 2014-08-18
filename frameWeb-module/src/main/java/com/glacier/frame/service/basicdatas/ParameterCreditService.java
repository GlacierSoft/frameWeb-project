package com.glacier.frame.service.basicdatas;

import java.util.Date;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.glacier.basic.util.CollectionsUtil;
import com.glacier.basic.util.RandomGUID;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.frame.dao.basicdatas.ParameterCreditMapper;
import com.glacier.frame.dao.system.UserMapper;
import com.glacier.frame.entity.basicdatas.ParameterCredit;
import com.glacier.frame.entity.basicdatas.ParameterCreditExample;
import com.glacier.frame.entity.system.User;
import com.glacier.frame.util.MethodLog;

/**
 * 
 * @ClassName: ParameterCreditService 
 * @Description: TODO(会员信用级别业务类) 
 * @author yuzexu
 * @email 804346249@QQ.com
 * @date 2014-1-22上午9:12:04
 */
@Service
@Transactional(readOnly= true ,propagation= Propagation.REQUIRED)
public class ParameterCreditService {
	
	@Autowired
	private ParameterCreditMapper parameterCreditMapper;
	
	@Autowired
    private UserMapper userMapper;
	
	/**
	 * @Title: getCredit 
	 * @Description: TODO(根据会员信用等级id进行查询) 
	 * @param  @param creditId
	 * @param  @return设定文件
	 * @return Object  返回类型
	 * @throws 
	 *
	 */
	public Object getCredit(String creditId){
		ParameterCredit parameterCredit = parameterCreditMapper.selectByPrimaryKey(creditId);
        return parameterCredit;
	}
	
	/**
     * @Title: listAsGrid
     * @Description: TODO(以表格结构展示会员信用级别列表)
     * @param @param menuId 动作对应的菜单Id
     * @param @param pager 分页参数
     * @param @return 设定文件
     * @return Object 返回类型
     * @throws
     */
    public Object listAsGrid(JqPager pager) {
        JqGridReturn returnResult = new JqGridReturn();
        ParameterCreditExample parameterCreditExample = new ParameterCreditExample();
        if (null != pager.getPage() && null != pager.getRows()) {// 设置排序信息
        	parameterCreditExample.setLimitStart((pager.getPage() - 1) * pager.getRows());
        	parameterCreditExample.setLimitEnd(pager.getRows());
        }
        if (StringUtils.isNotBlank(pager.getSort()) && StringUtils.isNotBlank(pager.getOrder())) {// 设置排序信息
        	parameterCreditExample.setOrderByClause(pager.getOrderBy("temp_parameter_credit_"));
        }
        List<ParameterCredit>  parameterCredits = parameterCreditMapper.selectByExample(parameterCreditExample); // 查询所有操作列表
        int total = parameterCreditMapper.countByExample(parameterCreditExample); // 查询总页数
        returnResult.setRows(parameterCredits);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }

    /**
     * 
     * @Title: addparameterCredit 
     * @Description: TODO(新增会员信用级别) 
     * @param  @param parameterCredit
     * @param  @return设定文件
     * @return Object  返回类型
     * @throws 
     *
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "CreditList_add")
    public Object addParameterCredit(ParameterCredit parameterCredit) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ParameterCreditExample parameterCreditExample = new ParameterCreditExample();
        int count = 0;
        // 防止会员信用级别名称重复
        parameterCreditExample.createCriteria().andCreditNameEqualTo(parameterCredit.getCreditName());
        count = parameterCreditMapper.countByExample(parameterCreditExample);// 查找相同信用等级名称的会员数量
        if (count > 0) {
            returnResult.setMsg("会员信用级别名称重复");
            return returnResult;
        }
        if(parameterCredit.getCreditBeginIntegral() > parameterCredit.getCreditEndIntegral()){
        	returnResult.setMsg("开始积分不能大于结束积分");
            return returnResult;
        }
        parameterCredit.setCreditId(RandomGUID.getRandomGUID());
        parameterCredit.setCreater(pricipalUser.getUserId());
        parameterCredit.setCreateTime(new Date());
        parameterCredit.setUpdater(pricipalUser.getUserId());
        parameterCredit.setUpdateTime(new Date());
        count = parameterCreditMapper.insert(parameterCredit);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + parameterCredit.getCreditName() + "] 会员信用级别信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，会员信用级别信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * 
     * @Title: editParameterCredit 
     * @Description: TODO(修改会员信用级别) 
     * @param  @param parameterCredit
     * @param  @return设定文件
     * @return Object  返回类型
     * @throws 
     *
     */
    @Transactional(readOnly = false)
    @MethodLog(opera="CreditList_edit")
    public Object editParameterCredit(ParameterCredit parameterCredit) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ParameterCreditExample parameterCreditExample = new ParameterCreditExample();
        int count = 0;
        // 防止会员信用级别名称重复
        parameterCreditExample.createCriteria().andCreditIdNotEqualTo(parameterCredit.getCreditId()).andCreditNameEqualTo(parameterCredit.getCreditName());
        count = parameterCreditMapper.countByExample(parameterCreditExample);// 查找相同信用等级名称的会员数量
        if (count > 0) {
            returnResult.setMsg("会员信用级别名称重复");
            return returnResult;
        }
        if(parameterCredit.getCreditBeginIntegral() > parameterCredit.getCreditEndIntegral()){
        	returnResult.setMsg("开始积分不能大于结束积分");
            return returnResult;
        }
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        parameterCredit.setUpdater(pricipalUser.getUserId());
        parameterCredit.setUpdateTime(new Date());
        count = parameterCreditMapper.updateByPrimaryKeySelective(parameterCredit);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + parameterCredit.getCreditName() + "] 会员信用级别信息已变更");
        } else {
            returnResult.setMsg("发生未知错误，会员信用级别信息修改保存失败");
        }
        return returnResult;
    }
    /**
     * @Title: delAge 
     * @Description: TODO(删除会员信用级别) 
     * @param @param creditId
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "CreditList_del")
    public Object delCredit(List<String> creditIds ,List<String> creditNames) {
    	JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
    	int count = 0;
    	if(creditIds.size() >0){
    		ParameterCreditExample parameterCreditExample = new ParameterCreditExample();
        	parameterCreditExample.createCriteria().andCreditIdIn(creditIds);
        	count = parameterCreditMapper.deleteByExample(parameterCreditExample);
    		if(count >0){
        		returnResult.setMsg("成功删除了[ " + CollectionsUtil.convertToString(creditNames, ",") + " ]操作");
        		returnResult.setSuccess(true);
        	}else{
        		returnResult.setMsg("发生未知错误，会员信用级别删除失败");
        	}
    	}
		return returnResult;
    }
    
    /**
     * @Title: listCredits 
     * @Description: TODO(查询基础信用积分信息) 
     * @param  @return设定文件
     * @return Object  返回类型
     * @throws 
     *
     */
    public Object listCredits(){
    	ParameterCreditExample parameterCreditExample = new ParameterCreditExample();
    	JqPager pager = new JqPager();
    	pager.setSort("creditNum");
    	pager.setOrder("DESC");
    	parameterCreditExample.setOrderByClause(pager.getOrderBy("temp_parameter_credit_"));
    	List<ParameterCredit>  parameterCredits = parameterCreditMapper.selectByExample(parameterCreditExample); // 查询所有操作列表
        return parameterCredits;
    }
}
