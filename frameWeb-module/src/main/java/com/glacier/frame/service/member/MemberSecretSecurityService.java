/**
 * @Title: MemberSecretSecurityService.java 
 * @Package com.glacier.frame.service.member 
 * @author songjundong   
 * @email 985776597@qq.com
 * @date 2014-8-18  下午5:18:11
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2014-8-18
				修改人：songjundong 
				修改内容简介 ：
			</p>              
 * @Review (审核人) ：songjundong
 * 
 */
package com.glacier.frame.service.member;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.glacier.basic.util.CollectionsUtil;
import com.glacier.basic.util.RandomGUID;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.frame.dao.member.MemberSecretSecurityMapper;
import com.glacier.frame.dao.member.MemberMessageNoticeMapper;
import com.glacier.frame.dao.system.UserMapper;
import com.glacier.frame.dto.query.member.MemberSecretQueryDTO;
import com.glacier.frame.entity.member.MemberSecretSecurity;
import com.glacier.frame.entity.member.MemberSecretSecurityExample;
import com.glacier.frame.entity.member.MemberSecretSecurityExample.Criteria;
import com.glacier.frame.util.MethodLog;

 /*** 
  * @ClassName:  MemberSecretSecurityService
  * @Description: TODO(会员密保管理)
  * @author songjundong
  * @email 985776597@QQ.com
  * @date 2014-8-18  下午5:18:11
  */
@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class MemberSecretSecurityService {

	@Autowired
    private MemberSecretSecurityMapper secretSecurityMapper;
	
	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private MemberMessageNoticeMapper memberMessageNoticeMapper;
	

	/**
	 * @Title: getSecretSecurity
	 * @Description: TODO(根据密保Id获取密保信息) 
	 * @param @param memberSecretSecurityId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public Object getSecretSecurity(String secretSecurityId) {
    	MemberSecretSecurity memberSecretSecurity = secretSecurityMapper.selectByPrimaryKey(secretSecurityId);
        return memberSecretSecurity;
    }
    
    /**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有密保信息) 
     * @param @param psecretSecurityr
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(JqPager secretSecurity,MemberSecretQueryDTO memberSecretQueryDTO) {
        
        JqGridReturn returnResult = new JqGridReturn();
        MemberSecretSecurityExample memberSecretSecurityExample = new MemberSecretSecurityExample();
        Criteria queryCriteria = memberSecretSecurityExample.createCriteria();
        memberSecretQueryDTO.setQueryCondition(queryCriteria);
        if (null != secretSecurity.getPage() && null != secretSecurity.getRows()) {// 设置排序信息
        	memberSecretSecurityExample.setLimitStart((secretSecurity.getPage() - 1) * secretSecurity.getRows());
        	memberSecretSecurityExample.setLimitEnd(secretSecurity.getRows());
        }
        if (StringUtils.isNotBlank(secretSecurity.getSort()) && StringUtils.isNotBlank(secretSecurity.getOrder())) {// 设置排序信息
        	memberSecretSecurityExample.setOrderByClause(secretSecurity.getOrderBy("temp_member_secret_security_"));
        }
        List<MemberSecretSecurity>  memberSecretSecuritys = secretSecurityMapper.selectByExample(memberSecretSecurityExample); // 查询所有会员积分列表
        int total = secretSecurityMapper.countByExample(memberSecretSecurityExample); // 查询总页数
        returnResult.setRows(memberSecretSecuritys);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }
    
    /**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有密保信息) 
     * @param @param psecretSecurityr
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGridWebsite(String memberId,JqPager secretSecurity) {
        
        JqGridReturn returnResult = new JqGridReturn();
        MemberSecretSecurityExample memberSecretSecurityExample = new MemberSecretSecurityExample();
        memberSecretSecurityExample.createCriteria().andMemberIdEqualTo(memberId);
        if (null != secretSecurity.getPage() && null != secretSecurity.getRows()) {// 设置排序信息
        	memberSecretSecurityExample.setLimitStart((secretSecurity.getPage() - 1) * secretSecurity.getRows());
        	memberSecretSecurityExample.setLimitEnd(secretSecurity.getRows());
        }
        if (StringUtils.isNotBlank(secretSecurity.getSort()) && StringUtils.isNotBlank(secretSecurity.getOrder())) {// 设置排序信息
        	memberSecretSecurityExample.setOrderByClause(secretSecurity.getOrderBy("temp_member_secret_security_"));
        }
        List<MemberSecretSecurity>  memberSecretSecuritys = secretSecurityMapper.selectByExample(memberSecretSecurityExample); // 查询所有会员积分列表
        int total = secretSecurityMapper.countByExample(memberSecretSecurityExample); // 查询总页数
        returnResult.setRows(memberSecretSecuritys);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }
    
    /**
     * @Title: addSecretSecurity 
     * @Description: TODO(新增密保) 
     * @param @param secretSecurity
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    public Object addSecretSecurity(MemberSecretSecurity secretSecurity) {
    	
        //Subject pricipalSubject = SecurityUtils.getSubject();
        //User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        secretSecurity.setSecretSecurityId(RandomGUID.getRandomGUID());
        //secretSecurity.setCreater(pricipalUser.getUserId());
        secretSecurity.setCreateTime(new Date());
        //secretSecurity.setUpdater(pricipalUser.getUserId());
        secretSecurity.setUpdateTime(new Date());
        count = secretSecurityMapper.insert(secretSecurity);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("会员密保信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，会员密保信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: delAge 
     * @Description: TODO(删除密保问题信息) 
     * @param @param secretSecurityId
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "SecretSecurityList_del")
    public Object delSecretSecurity(List<String> secretSecurityIds ,List<String> questionDess) {
    	JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
    	int count = 0;
    	if(secretSecurityIds.size() >0){
    		MemberSecretSecurityExample memberSecretSecurityExample = new MemberSecretSecurityExample();
    		memberSecretSecurityExample.createCriteria().andSecretSecurityIdIn(secretSecurityIds);
        	count = secretSecurityMapper.deleteByExample(memberSecretSecurityExample);
    		if(count >0){
        		returnResult.setMsg("成功删除了[ " + CollectionsUtil.convertToString(questionDess, ",") + " ]操作");
        		returnResult.setSuccess(true);
        	}else{
        		returnResult.setMsg("发生未知错误，密保问题信息删除失败");
        	}
    	}
		return returnResult;
     }
    
    /**
     * @Title: delAge 
     * @Description: TODO(删除密保问题信息) 
     * @param @param secretSecurityId
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    public Object delSecretSecurityWebsit(List<String> secretSecurityIds) {
    	JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
    	int count = 0;
    	if(secretSecurityIds.size() >0){
    		MemberSecretSecurityExample memberSecretSecurityExample = new MemberSecretSecurityExample();
    		memberSecretSecurityExample.createCriteria().andSecretSecurityIdIn(secretSecurityIds);
        	count = secretSecurityMapper.deleteByExample(memberSecretSecurityExample);
    		if(count >0){
        		returnResult.setMsg("成功删除了");
        		returnResult.setSuccess(true);
        	}else{
        		returnResult.setMsg("发生未知错误，密保问题信息删除失败");
        	}
    	}
		return returnResult;
     }
   
}
