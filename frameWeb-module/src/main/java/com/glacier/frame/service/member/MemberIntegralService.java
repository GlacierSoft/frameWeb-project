/**
 * @Title: MemberIntegralService.java 
 * @Package com.glacier.frame.service.member 
 * @author xichao.dong
 * @email 406592176@QQ.com
 * @date 2014-08-17  下午2:22:22  
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2014-08-17 
				修改人：xichao.dong 
				修改内容简介 ：
			</p>              
 * @Review (审核人) ：xichao.dong
 * 
 */
package com.glacier.frame.service.member;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.glacier.basic.util.RandomGUID;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.frame.dao.member.MemberIntegralMapper;
import com.glacier.frame.dto.query.member.MemberIntegralQueryDTO;
import com.glacier.frame.entity.member.Member;
import com.glacier.frame.entity.member.MemberIntegral;
import com.glacier.frame.entity.member.MemberIntegralExample;
import com.glacier.frame.entity.member.MemberIntegralExample.Criteria;
import com.glacier.frame.entity.system.User;
import com.glacier.frame.util.MethodLog;

/** 
 * @ClassName: MemberIntegralService 
 * @Description: TODO(会员积分记录业务类) 
 * @author xichao.dong
 * @email 406592176@QQ.com
 * @date 2014-08-17  下午2:22:22  
 */
@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class MemberIntegralService {

	@Autowired
    private MemberIntegralMapper integralMapper;

	/**
	 * @Title: getIntegral
	 * @Description: TODO(根据会员积分记录Id获取会员积分记录信息) 
	 * @param @param memberIntegralId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public Object getIntegral(String memberIntegralId) {
    	MemberIntegral memberIntegral = integralMapper.selectByPrimaryKey(memberIntegralId);
        return memberIntegral;
    }
    
    /**
     * @Description: TODO(前台会员积分显示列表) 
     * @param  @param pager
     * @param  @param p
     * @param  @return设定文件
     * @return Object  返回类型
     * @throws  
     */
    public Object listAsWebsite(JqPager pager, int p) {
        
    	JqGridReturn returnResult = new JqGridReturn();
    	MemberIntegralExample memberIntegralExample = new MemberIntegralExample();
    	
    	Subject pricipalSubject = SecurityUtils.getSubject();
    	Member pricipalMember = (Member) pricipalSubject.getPrincipal();
    	
    	memberIntegralExample.createCriteria().andMemberIdEqualTo(pricipalMember.getMemberId());
    	 
        pager.setSort("createTime");// 定义排序字段
        pager.setOrder("DESC");// 升序还是降序
        if (StringUtils.isNotBlank(pager.getSort()) && StringUtils.isNotBlank(pager.getOrder())) {// 设置排序信息
        	memberIntegralExample.setOrderByClause(pager.getOrderBy("temp_member_integral_"));
        }
        int startTemp = ((p-1)*10);//根据前台返回的页数进行设置
        memberIntegralExample.setLimitStart(startTemp);
        memberIntegralExample.setLimitEnd(10);
        List<MemberIntegral>  memberIntegrals = integralMapper.selectByExample(memberIntegralExample); // 查询所有公告列表
        
        int total = integralMapper.countByExample(memberIntegralExample); // 查询总页数
        returnResult.setRows(memberIntegrals);
        returnResult.setTotal(total);
        returnResult.setP(p);
        Map<String,Object> integralMap = new HashMap<String,Object>();
        integralMap.put("returnResult", returnResult);
        integralMap.put("totalIntegral", totalIntegral());
        return integralMap;// 返回ExtGrid表
    } 
    
    /*** 
     * @Title: totalIntegral  
     * @Description: TODO(获取会员总积分)  
     * @param @return    设定文件  
     * @return int    返回类型  
     * @throws
     */
    public int totalIntegral(){
    	
    	MemberIntegralExample memberIntegralExampleAll = new MemberIntegralExample(); 
    	Subject pricipalSubject = SecurityUtils.getSubject();
    	Member pricipalMember = (Member) pricipalSubject.getPrincipal(); 
    	memberIntegralExampleAll.createCriteria().andMemberIdEqualTo(pricipalMember.getMemberId());
    	List<MemberIntegral>  memberIntegralAll = integralMapper.selectByExample(memberIntegralExampleAll); // 查询所有公告列表
        int totalIntegral = 0;
        for(MemberIntegral memberIntegral : memberIntegralAll){
        	if(memberIntegral.getChangeType().equals("increase")){
        		totalIntegral +=memberIntegral.getChangeValue();
        	}else if(memberIntegral.getChangeType().equals("reduction")){
        		totalIntegral -=memberIntegral.getChangeValue();
        	}
        	
        }
        return totalIntegral;
    }
    
    /**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有会员积分记录信息) 
     * @param @param pintegralr
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(MemberIntegralQueryDTO  memberIntegralQueryDTO, JqPager pintegralr) {
        
        JqGridReturn returnResult = new JqGridReturn();
        MemberIntegralExample memberIntegralExample = new MemberIntegralExample(); 
        Criteria queryCriteria = memberIntegralExample.createCriteria();
        memberIntegralQueryDTO.setQueryCondition(queryCriteria); 
        if (null != pintegralr.getPage() && null != pintegralr.getRows()) {// 设置排序信息
        	memberIntegralExample.setLimitStart((pintegralr.getPage() - 1) * pintegralr.getRows());
        	memberIntegralExample.setLimitEnd(pintegralr.getRows());
        }
        if (StringUtils.isNotBlank(pintegralr.getSort()) && StringUtils.isNotBlank(pintegralr.getOrder())) {// 设置排序信息
        	memberIntegralExample.setOrderByClause(pintegralr.getOrderBy("temp_member_integral_"));
        }
        List<MemberIntegral>  memberIntegrals = integralMapper.selectByExample(memberIntegralExample); // 查询所有会员积分列表
        int total = integralMapper.countByExample(memberIntegralExample); // 查询总页数
        returnResult.setRows(memberIntegrals);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }

    /**
     * @Title: addIntegral 
     * @Description: TODO(新增会员积分记录) 
     * @param @param integral
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "IntegralList_add")
    public Object addIntegral(MemberIntegral integral) {
    	
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal(); 
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        integral.setMemberIntegralId(RandomGUID.getRandomGUID());
        integral.setCreater(pricipalUser.getUserId());
        integral.setCreateTime(new Date());
        integral.setUpdater(pricipalUser.getUserId());
        integral.setUpdateTime(new Date());
        count = integralMapper.insert(integral);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("会员积分信息记录已保存");
        } else {
            returnResult.setMsg("发生未知错误，会员积分信息记录保存失败");
        }
        return returnResult;
    }
}
