/**
 * @Title: MemberAuthService.java 
 * @Package com.glacier.frame.service.member 
 * @author songjundong
 * @email 985776597@QQ.com
 * @date 2014-8-18  下午5:32:31
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2014-08-18 
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
import com.glacier.frame.dao.basicdatas.ParameterCreditTypeMapper;
import com.glacier.frame.dao.member.MemberAuthMapper;
import com.glacier.frame.dao.member.MemberCreditIntegralMapper;
import com.glacier.frame.dao.member.MemberMapper;
import com.glacier.frame.dao.member.MemberMessageNoticeMapper;
import com.glacier.frame.dto.query.member.MemberAuthQueryDTO;
import com.glacier.frame.entity.basicdatas.ParameterCreditType;
import com.glacier.frame.entity.basicdatas.ParameterCreditTypeExample;
import com.glacier.frame.entity.member.Member;
import com.glacier.frame.entity.member.MemberAuth;
import com.glacier.frame.entity.member.MemberAuthExample;
import com.glacier.frame.entity.member.MemberCreditIntegral;
import com.glacier.frame.entity.member.MemberAuthExample.Criteria;
import com.glacier.frame.entity.member.MemberAuthWithBLOBs;
import com.glacier.frame.entity.member.MemberCreditIntegralExample;
import com.glacier.frame.entity.member.MemberMessageNotice;
import com.glacier.frame.entity.system.User;

/*** 
 * @ClassName:  MemberAuthService
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author songjundong
 * @email 985776597@QQ.com
 * @date 2014-8-18  下午5:32:31
 */
@Service
@Transactional(readOnly = true , propagation = Propagation.REQUIRED)
public class MemberAuthService {
	
	@Autowired
	private MemberAuthMapper memberAuthMapper;
	
	@Autowired
	private MemberCreditIntegralMapper memberCreditIntegralMapper;
	
	@Autowired
    private ParameterCreditTypeMapper creditTypeMapper;
	
	@Autowired
	private MemberMapper memberMapper;
	
	@Autowired
	private MemberMessageNoticeMapper memberMessageNoticeMapper;
	
	/**
	 * @Title: getMemberAuth 
	 * @Description: TODO(根据会员认证Id获取会员认证信息) 
	 * @param @param memberId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public Object getMemberAuth(String memberId) {
    	MemberAuth memberAuth = memberAuthMapper.selectByPrimaryKey(memberId);
        return memberAuth;
    }
    
    /**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有会员认证信息) 
     * @param @param pager
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
   	public Object listAsGrid(MemberAuthQueryDTO memberAuthQueryDTO,JqPager pager) {
        
        JqGridReturn returnResult = new JqGridReturn();
        MemberAuthExample memberAuthExample = new MemberAuthExample();  
        Criteria queryCriteria = memberAuthExample.createCriteria();
        memberAuthQueryDTO.setQueryCondition(queryCriteria);

        if (null != pager.getPage() && null != pager.getRows()) {// 设置排序信息
        	memberAuthExample.setLimitStart((pager.getPage() - 1) * pager.getRows());
        	memberAuthExample.setLimitEnd(pager.getRows());
        }
        if (StringUtils.isNotBlank(pager.getSort()) && StringUtils.isNotBlank(pager.getOrder())) {// 设置排序信息
        	memberAuthExample.setOrderByClause(pager.getOrderBy("temp_member_auth_"));
        }
        List<MemberAuth>  memberAuths = memberAuthMapper.selectByExample(memberAuthExample); // 查询所有会员认证列表
        int total = memberAuthMapper.countByExample(memberAuthExample); // 查询总页数
        returnResult.setRows(memberAuths);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }
   	
   	/**
   	 * @Title: addMessageNotice 
   	 * @Description: TODO(对审核认证后添加相对应的信息通知) 
   	 * @param  @param memberMessageNotice
   	 * @param  @return设定文件
   	 * @return int  返回类型
   	 * @throws  
   	 */
   	public int addMessageNotice(MemberMessageNotice memberMessageNotice,String memberId){
   		//获取当前登录用户
   		Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        //查询所属会员个人的额度申请列表
   		memberMessageNotice.setMessageNoticeId(RandomGUID.getRandomGUID());
   		memberMessageNotice.setSender(pricipalUser.getUserId());
   		memberMessageNotice.setAddressee(memberId);
        memberMessageNotice.setSendtime(new Date());
        memberMessageNotice.setLetterstatus("unread");
        memberMessageNotice.setLettertype("system");
        memberMessageNotice.setCreater(pricipalUser.getUserId());
        memberMessageNotice.setCreateTime(new Date());
        memberMessageNotice.setUpdater(pricipalUser.getUserId());
        memberMessageNotice.setUpdateTime(new Date());
        int count = memberMessageNoticeMapper.insert(memberMessageNotice);
        return count;
   	}
   	
   	/**
   	 * @Title: editMemberAuth 
   	 * @Description: TODO(修改会员认证) 
   	 * @param  @param memberAuth
   	 * @param  @return设定文件
   	 * @return Object  返回类型
   	 * @throws  
   	 */
   	@Transactional(readOnly = false)
	public Object editMemberAuth(MemberAuthWithBLOBs memberAuthWithBLOBs,String auth) {
		JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
		int count = 0;
		int creditCount = 0;
		float memberChangeCredit = 0;
		int ChangeCreditCount = 0;
		int MessageNoticeCount = 0;
		List<MemberCreditIntegral> memberCreditIntegrals = null;
		ParameterCreditType parameterCreditType = null;
		//获取当前登录用户，也就是审核人
		Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        //获取当前被操作会员信息
        Member member = memberMapper.selectByPrimaryKey(memberAuthWithBLOBs.getMemberId());
        //创建会员信用积分对象
        MemberCreditIntegral memberCreditIntegral = new MemberCreditIntegral();
        //创建信息通知对象
        MemberMessageNotice memberMessageNotice = new MemberMessageNotice();
        ParameterCreditTypeExample parameterCreditTypeExample = new ParameterCreditTypeExample();
        MemberCreditIntegralExample memberCreditIntegralExample = new MemberCreditIntegralExample();
        	//判断是通过哪个按钮进来的
      		if(auth.trim().equals("基本信息认证")){
      			if(memberAuthWithBLOBs.getInfoAuth().equals("")){ 
      	        	returnResult.setMsg("操作失败,请选择审核状态!");
      	        	return returnResult; 
      	         }
      			//判断是否有重复的信用认证积分
      			memberCreditIntegralExample.createCriteria().andMemberIdEqualTo(memberAuthWithBLOBs.getMemberId()).andIntegralTypeEqualTo("infoAuth");
      			memberCreditIntegrals = memberCreditIntegralMapper.selectByExample(memberCreditIntegralExample);
      		 	if(memberAuthWithBLOBs.getInfoAuth().equals("pass")){
      				
      				if(memberCreditIntegrals.size() == 0){
    	      			//判断是哪个认证，添加信用积分记录
    	      			parameterCreditTypeExample.createCriteria().andCreditTypeEqualTo("infoAuth").andChangeTypeEqualTo("increase");
    	      			//调用方法为会员信用积分设置值，因为很多地方都是一样的，所以抽出来作为一个方法。
    	      			this.memberCreditSet(parameterCreditTypeExample, parameterCreditType, memberCreditIntegral);  
    	      			//手机认证也是属于基本信息认证
    	      	        MemberCreditIntegral parame = new MemberCreditIntegral(); 
    	      	        ParameterCreditTypeExample pramExample = new ParameterCreditTypeExample();
    	      	        pramExample.createCriteria().andCreditTypeEqualTo("mobileAuth").andChangeTypeEqualTo("increase"); 
    	      	        List<ParameterCreditType>  pas=creditTypeMapper.selectByExample(pramExample);
    	      	        ParameterCreditType creditType=pas.get(0);
    	      	        parame.setIntegralType(creditType.getCreditType());
    	      	        parame.setChangeType(creditType.getChangeType());
    	      	        parame.setChangeValue(creditType.getChangeValue());  
    	      			//新增会员信用积分。
    	    	        String creditIntegralId = RandomGUID.getRandomGUID();
    	    	        parame.setMemberId(memberAuthWithBLOBs.getMemberId());
    	    	        parame.setCreditIntegralId(creditIntegralId);
    	    	        parame.setCreater(pricipalUser.getUserId());
    	    	        parame.setCreateTime(new Date());
    	    	        parame.setUpdater(pricipalUser.getUserId());
    	    	        parame.setUpdateTime(new Date()); 
    	    	        memberCreditIntegralMapper.insert(parame);
    	    	        //改变会员表里面的信用积分的值  
    	    	        member.setCreditIntegral(member.getCreditIntegral() + memberCreditIntegral.getChangeValue()); 
    	    	        memberMapper.updateByPrimaryKeySelective(member);
    	    	        memberAuthWithBLOBs.setMobileAuth("pass"); 
    	    	        memberAuthWithBLOBs.setMobileAuditor(pricipalUser.getUserId());
    	    	        memberAuthWithBLOBs.setMobileTime(new Date());
    	      	  	}
      				//为信息通知对象设置值,并新增相应的信息通知
	      			memberMessageNotice.setTitle("基本信息认证审核通知");
	      			memberMessageNotice.setContent("您的基本信息认证审核状况:通过");
	      			MessageNoticeCount = this.addMessageNotice(memberMessageNotice,member.getMemberId()); 
	      			
      			}else if(memberAuthWithBLOBs.getInfoAuth().equals("failure")){
      				if(memberCreditIntegrals.size() != 0){
      					//调用方法为会员信用积分总分设置值，因为很多地方都是一样的，所以抽出来作为一个方法。
      					this.memberCreditTotleSet(memberCreditIntegrals, memberChangeCredit, member, ChangeCreditCount);
      				}
      				//为信息通知对象设置值,并新增相应的信息通知
	      			memberMessageNotice.setTitle("基本信息认证审核通知");
	      			memberMessageNotice.setContent("您的基本信息认证审核状况:不通过");  
	      			MessageNoticeCount = this.addMessageNotice(memberMessageNotice,member.getMemberId());
      			    memberAuthWithBLOBs.setMobileAuth("failure"); 
	    	        memberAuthWithBLOBs.setMobileAuditor(pricipalUser.getUserId());
	    	        memberAuthWithBLOBs.setMobileTime(new Date());
	    	    }
      			//修改认证记录表
      			memberAuthWithBLOBs.setInfoTime(new Date());
                memberAuthWithBLOBs.setInfoAuditor(pricipalUser.getUserId());
      		}else if(auth.trim().equals("VIP认证")){
      			if(memberAuthWithBLOBs.getVipAuth().equals("")){ 
      	        	returnResult.setMsg("操作失败,请选择审核状态!");
      	        	return returnResult; 
      	         }
      			//判断是否有重复的信用认证积分
      			memberCreditIntegralExample.createCriteria().andMemberIdEqualTo(memberAuthWithBLOBs.getMemberId()).andIntegralTypeEqualTo("vipAuth");
      			memberCreditIntegrals = memberCreditIntegralMapper.selectByExample(memberCreditIntegralExample);
      			if(memberAuthWithBLOBs.getVipAuth().equals("pass")){
      				//计算出当前时间到下一年的时间,设置会员VIP的有效时间
      		        long dateTimes = new Date().getTime()+(365*24*60*60*1000L);
      		        member.setType("vip");
      		        member.setExpireTime(new Date(dateTimes));
      		        member.setValidTime(new Date());
      		        member.setUpdater(pricipalUser.getUserId());
      		        member.setUpdateTime(new Date());
      				if(memberCreditIntegrals.size() == 0){
    	      			//判断是哪个认证，添加信用积分记录
    	      			parameterCreditTypeExample.createCriteria().andCreditTypeEqualTo("vipAuth");
    	      			//调用方法为会员信用积分设置值，因为很多都是一样的，所以抽出来作为一个方法。
    	      			this.memberCreditSet(parameterCreditTypeExample, parameterCreditType, memberCreditIntegral);
          			}
      				//为信息通知对象设置值,并新增相应的信息通知
	      			memberMessageNotice.setTitle("VIP认证审核通知");
	      			memberMessageNotice.setContent("您的VIP认证审核状况:通过");
	      			MessageNoticeCount = this.addMessageNotice(memberMessageNotice,member.getMemberId());
      			}else if(memberAuthWithBLOBs.getVipAuth().equals("failure")){
      				if(memberCreditIntegrals.size() != 0){
      					//调用方法为会员信用积分总分设置值，因为很多地方都是一样的，所以抽出来作为一个方法。
      					this.memberCreditTotleSet(memberCreditIntegrals, memberChangeCredit, member, ChangeCreditCount);
      				}
      				//为信息通知对象设置值,并新增相应的信息通知
	      			memberMessageNotice.setTitle("VIP认证审核通知");
	      			memberMessageNotice.setContent("您的VIP认证审核状况:不通过");
	      			MessageNoticeCount = this.addMessageNotice(memberMessageNotice,member.getMemberId());
      			}	
      			//修改认证记录表
      			memberAuthWithBLOBs.setVipAuditor(pricipalUser.getUserId());
            	memberAuthWithBLOBs.setVipTime(new Date());
      		}else if(auth.trim().equals("邮箱认证")){
      			//邮箱认证可以忽略
      		}else if(auth.trim().equals("信用认证")){
      			if(memberAuthWithBLOBs.getCreditAuth().equals("")){ 
      	        	returnResult.setMsg("操作失败,请选择审核状态!");
      	        	return returnResult; 
      	         }
      			//判断是否有重复的信用认证积分
      			memberCreditIntegralExample.createCriteria().andMemberIdEqualTo(memberAuthWithBLOBs.getMemberId()).andIntegralTypeEqualTo("creditAuth");
      			memberCreditIntegrals = memberCreditIntegralMapper.selectByExample(memberCreditIntegralExample);
      			if(memberAuthWithBLOBs.getCreditAuth().equals("pass")){
      				if(memberCreditIntegrals.size() == 0){
  	      				//判断是哪个认证，添加信用积分记录
  		      			parameterCreditTypeExample.createCriteria().andCreditTypeEqualTo("creditAuth");
  		      			//调用方法为会员信用积分设置值，因为很多都是一样的，所以抽出来作为一个方法。
    	      			this.memberCreditSet(parameterCreditTypeExample, parameterCreditType, memberCreditIntegral);
      	      			}
      				//为信息通知对象设置值,并新增相应的信息通知
	      			memberMessageNotice.setTitle("信用认证审核通知");
	      			memberMessageNotice.setContent("您的信用认证审核状况:通过");
	      			MessageNoticeCount = this.addMessageNotice(memberMessageNotice,member.getMemberId());
      			}else if(memberAuthWithBLOBs.getCreditAuth().equals("failure")){
      				if(memberCreditIntegrals.size() != 0){
      					//调用方法为会员信用积分总分设置值，因为很多地方都是一样的，所以抽出来作为一个方法。
      					this.memberCreditTotleSet(memberCreditIntegrals, memberChangeCredit, member, ChangeCreditCount);
      				}
      				//为信息通知对象设置值,并新增相应的信息通知
	      			memberMessageNotice.setTitle("信用认证审核通知");
	      			memberMessageNotice.setContent("您的信用认证审核状况:不通过");
	      			MessageNoticeCount = this.addMessageNotice(memberMessageNotice,member.getMemberId());
      			}	
      			//修改认证记录表
      			memberAuthWithBLOBs.setCreditAuditor(pricipalUser.getUserId());
            	memberAuthWithBLOBs.setCreditTime(new Date());
      		}else if(auth.trim().equals("企业认证")){
      			if(memberAuthWithBLOBs.getCompanyAuth().equals("")){ 
      	        	returnResult.setMsg("操作失败,请选择审核状态!");
      	        	return returnResult; 
      	         }
      			//判断是否有重复的信用认证积分
      			memberCreditIntegralExample.createCriteria().andMemberIdEqualTo(memberAuthWithBLOBs.getMemberId()).andIntegralTypeEqualTo("companyAuth");
      			memberCreditIntegrals = memberCreditIntegralMapper.selectByExample(memberCreditIntegralExample);
      			if(memberAuthWithBLOBs.getCompanyAuth().equals("pass")){
      				if(memberCreditIntegrals.size() == 0){
    	      			//判断是哪个认证，添加信用积分记录
    	      			parameterCreditTypeExample.createCriteria().andCreditTypeEqualTo("companyAuth");
    	      			//调用方法为会员信用积分设置值，因为很多都是一样的，所以抽出来作为一个方法。
    	      			this.memberCreditSet(parameterCreditTypeExample, parameterCreditType, memberCreditIntegral);
          			}
      				//为信息通知对象设置值,并新增相应的信息通知
	      			memberMessageNotice.setTitle("企业认证审核通知");
	      			memberMessageNotice.setContent("您的企业认证审核状况:通过");
	      			MessageNoticeCount = this.addMessageNotice(memberMessageNotice,member.getMemberId());
      			}else if(memberAuthWithBLOBs.getCompanyAuth().equals("failure")){
      				if(memberCreditIntegrals.size() != 0){
      					//调用方法为会员信用积分总分设置值，因为很多地方都是一样的，所以抽出来作为一个方法。
      					this.memberCreditTotleSet(memberCreditIntegrals, memberChangeCredit, member, ChangeCreditCount);
      				}
      				//为信息通知对象设置值,并新增相应的信息通知
	      			memberMessageNotice.setTitle("企业认证审核通知");
	      			memberMessageNotice.setContent("您的企业认证审核状况:不通过");
	      			MessageNoticeCount = this.addMessageNotice(memberMessageNotice,member.getMemberId());
      			}	
      			//修改认证记录表
      			memberAuthWithBLOBs.setCompanyAuditor(pricipalUser.getUserId());
            	memberAuthWithBLOBs.setCompanyTime(new Date());
      		}else if(auth.trim().equals("真实姓名认证")){
      			if(memberAuthWithBLOBs.getRealNameAuth().equals("")){ 
      	        	returnResult.setMsg("操作失败,请选择审核状态!");
      	        	return returnResult; 
      	         }
      			//判断是否有重复的信用认证积分
      			memberCreditIntegralExample.createCriteria().andMemberIdEqualTo(memberAuthWithBLOBs.getMemberId()).andIntegralTypeEqualTo("realNameAuth");
      			memberCreditIntegrals = memberCreditIntegralMapper.selectByExample(memberCreditIntegralExample);
      			if(memberAuthWithBLOBs.getRealNameAuth().equals("pass")){
      				if(memberCreditIntegrals.size() == 0){
    	      			//判断是哪个认证，添加信用积分记录
    	      			parameterCreditTypeExample.createCriteria().andCreditTypeEqualTo("realNameAuth");
    	      			//调用方法为会员信用积分设置值，因为很多都是一样的，所以抽出来作为一个方法。
    	      			this.memberCreditSet(parameterCreditTypeExample, parameterCreditType, memberCreditIntegral);
          			}
      				//为信息通知对象设置值,并新增相应的信息通知
	      			memberMessageNotice.setTitle("真实姓名认证审核通知");
	      			memberMessageNotice.setContent("您的真实姓名认证审核状况:通过");
	      			MessageNoticeCount = this.addMessageNotice(memberMessageNotice,member.getMemberId());
      			}else if(memberAuthWithBLOBs.getRealNameAuth().equals("failure")){
      				if(memberCreditIntegrals.size() != 0){
      					//调用方法为会员信用积分总分设置值，因为很多地方都是一样的，所以抽出来作为一个方法。
      					this.memberCreditTotleSet(memberCreditIntegrals, memberChangeCredit, member, ChangeCreditCount);
      				}
      				//为信息通知对象设置值,并新增相应的信息通知
	      			memberMessageNotice.setTitle("真实姓名认证审核通知");
	      			memberMessageNotice.setContent("您的真实姓名认证审核状况:不通过");
	      			MessageNoticeCount = this.addMessageNotice(memberMessageNotice,member.getMemberId());
      			}	
      			//修改认证记录表
      			memberAuthWithBLOBs.setRealNameAuditor(pricipalUser.getUserId());
            	memberAuthWithBLOBs.setRealNameTime(new Date());
      		}else if(auth.trim().equals("身份证认证")){
      			if(memberAuthWithBLOBs.getIdCardAuth().equals("")){ 
      	        	returnResult.setMsg("操作失败,请选择审核状态!");
      	        	return returnResult; 
      	         }
      			//判断是否有重复的信用认证积分
      			memberCreditIntegralExample.createCriteria().andMemberIdEqualTo(memberAuthWithBLOBs.getMemberId()).andIntegralTypeEqualTo("idCardAuth");
      			memberCreditIntegrals = memberCreditIntegralMapper.selectByExample(memberCreditIntegralExample);
      			if(memberAuthWithBLOBs.getIdCardAuth().equals("pass")){
      				if(memberCreditIntegrals.size() == 0){
    	      			//判断是哪个认证，添加信用积分记录
    	      			parameterCreditTypeExample.createCriteria().andCreditTypeEqualTo("idCardAuth");
    	      			//调用方法为会员信用积分设置值，因为很多都是一样的，所以抽出来作为一个方法。
    	      			this.memberCreditSet(parameterCreditTypeExample, parameterCreditType, memberCreditIntegral);
          			}
      				//为信息通知对象设置值,并新增相应的信息通知
	      			memberMessageNotice.setTitle("身份证认证审核通知");
	      			memberMessageNotice.setContent("您的身份证认证审核状况:通过");
	      			MessageNoticeCount = this.addMessageNotice(memberMessageNotice,member.getMemberId());
      			}else if(memberAuthWithBLOBs.getIdCardAuth().equals("failure")){
      				if(memberCreditIntegrals.size() != 0){
      					//调用方法为会员信用积分总分设置值，因为很多地方都是一样的，所以抽出来作为一个方法。
      					this.memberCreditTotleSet(memberCreditIntegrals, memberChangeCredit, member, ChangeCreditCount);
      				}
      				//为信息通知对象设置值,并新增相应的信息通知
	      			memberMessageNotice.setTitle("身份证认证审核通知");
	      			memberMessageNotice.setContent("您的身份证认证审核状况:不通过");
	      			MessageNoticeCount = this.addMessageNotice(memberMessageNotice,member.getMemberId());
      			}	
      			//修改认证记录表
      			memberAuthWithBLOBs.setIdCardAuditor(pricipalUser.getUserId());
            	memberAuthWithBLOBs.setIdCardTime(new Date());
      		}else if(auth.trim().equals("工作认证")){
      			if(memberAuthWithBLOBs.getWorkAuth().equals("")){ 
      	        	returnResult.setMsg("操作失败,请选择审核状态!");
      	        	return returnResult; 
      	         }
      			//判断是否有重复的信用认证积分
      			memberCreditIntegralExample.createCriteria().andMemberIdEqualTo(memberAuthWithBLOBs.getMemberId()).andIntegralTypeEqualTo("workAuth");
      			memberCreditIntegrals = memberCreditIntegralMapper.selectByExample(memberCreditIntegralExample);
      			if(memberAuthWithBLOBs.getWorkAuth().equals("pass")){
      				if(memberCreditIntegrals.size() == 0){
    	      			//判断是哪个认证，添加信用积分记录
    	      			parameterCreditTypeExample.createCriteria().andCreditTypeEqualTo("workAuth");
    	      			//调用方法为会员信用积分设置值，因为很多都是一样的，所以抽出来作为一个方法。
    	      			this.memberCreditSet(parameterCreditTypeExample, parameterCreditType, memberCreditIntegral);
          			}
      				//为信息通知对象设置值,并新增相应的信息通知
	      			memberMessageNotice.setTitle("工作认证审核通知");
	      			memberMessageNotice.setContent("您的工作认证审核状况:通过");
	      			MessageNoticeCount = this.addMessageNotice(memberMessageNotice,member.getMemberId());
      			}else if(memberAuthWithBLOBs.getWorkAuth().equals("failure")){
      				if(memberCreditIntegrals.size() != 0){
      					//调用方法为会员信用积分总分设置值，因为很多地方都是一样的，所以抽出来作为一个方法。
      					this.memberCreditTotleSet(memberCreditIntegrals, memberChangeCredit, member, ChangeCreditCount);
      				}
      				//为信息通知对象设置值,并新增相应的信息通知
	      			memberMessageNotice.setTitle("工作认证审核通知");
	      			memberMessageNotice.setContent("您的工作认证审核状况:不通过");
	      			MessageNoticeCount = this.addMessageNotice(memberMessageNotice,member.getMemberId());
      			}	
      			//修改认证记录表
      			memberAuthWithBLOBs.setWorkAuditor(pricipalUser.getUserId());
            	memberAuthWithBLOBs.setWorkTime(new Date());
      		}
      	if(memberCreditIntegrals.size() == 0 && memberCreditIntegral.getChangeValue() != null && memberCreditIntegral.getIntegralType() != null){
			//新增会员信用积分。
	        String creditIntegralId = RandomGUID.getRandomGUID();
	        memberCreditIntegral.setMemberId(memberAuthWithBLOBs.getMemberId());
	        memberCreditIntegral.setCreditIntegralId(creditIntegralId);
	        memberCreditIntegral.setCreater(pricipalUser.getUserId());
	        memberCreditIntegral.setCreateTime(new Date());
	        memberCreditIntegral.setUpdater(pricipalUser.getUserId());
	        memberCreditIntegral.setUpdateTime(new Date());
	        
	        creditCount = memberCreditIntegralMapper.insert(memberCreditIntegral);
	        //改变会员表里面的信用积分的值，如果是审核vip会员，会相对应的改变会员的有效期限。
	        memberChangeCredit = member.getCreditIntegral();
	        memberChangeCredit += memberCreditIntegral.getChangeValue();
	        member.setCreditIntegral(memberChangeCredit);
	        ChangeCreditCount = memberMapper.updateByPrimaryKeySelective(member);
      	}else{
      		creditCount = 1;
      		ChangeCreditCount = 1;
      		MessageNoticeCount = 1;
      	}
        count = memberAuthMapper.updateByPrimaryKeySelective(memberAuthWithBLOBs);
        if (count == 1 && creditCount == 1 && ChangeCreditCount ==1 && MessageNoticeCount == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + memberAuthWithBLOBs.getMemberName() + "]会员认证信息审核成功");
        } else {
            returnResult.setMsg("发生未知错误，会员认证信息审核失败");
        }
		return returnResult;
	}
   	
   	/**
   	 * @Title: memberCreditSet 
   	 * @Description: TODO(是一些公用的代码提取出来作为方法，以供调用) 
   	 * @param  @param parameterCreditTypeExample
   	 * @param  @param parameterCreditType
   	 * @param  @param memberCreditIntegral设定文件
   	 * @return void  返回类型
   	 * @throws  
   	 */
   	public void memberCreditSet(ParameterCreditTypeExample parameterCreditTypeExample,ParameterCreditType parameterCreditType,MemberCreditIntegral memberCreditIntegral){
   			List<ParameterCreditType>  parameterCreditTypes = creditTypeMapper.selectByExample(parameterCreditTypeExample); // 查询所有信用积分类型列表
			parameterCreditType = parameterCreditTypes.get(0);
			memberCreditIntegral.setIntegralType(parameterCreditType.getCreditType());
			memberCreditIntegral.setChangeType(parameterCreditType.getChangeType());
			memberCreditIntegral.setChangeValue(parameterCreditType.getChangeValue());
   	}
   	
   	/**
   	 * @Title: memberCreditTotleSet 
   	 * @Description: TODO(是一些公用的代码提取出来作为方法，以供调用) 
   	 * @param  @param memberCreditIntegrals
   	 * @param  @param memberChangeCredit
   	 * @param  @param member
   	 * @param  @param ChangeCreditCount设定文件
   	 * @return void  返回类型
   	 * @throws  
   	 */
   	public void memberCreditTotleSet(List<MemberCreditIntegral> memberCreditIntegrals,float memberChangeCredit,Member member,int ChangeCreditCount){
   		MemberCreditIntegral memberCreditIntegral2 = memberCreditIntegrals.get(0);
		memberChangeCredit = member.getCreditIntegral();
		memberChangeCredit -= memberCreditIntegral2.getChangeValue();
      	member.setCreditIntegral(memberChangeCredit);
      	ChangeCreditCount = memberMapper.updateByPrimaryKeySelective(member);
      	//审核不通过删除，相对应的信用积分记录
      	memberCreditIntegralMapper.deleteByPrimaryKey(memberCreditIntegral2.getCreditIntegralId());
   	}
   	
   	/**
   	 * @Title: editMemberAuthReception 
   	 * @Description: TODO(前台修改会员认证) 
   	 * @param  @param memberAuth
   	 * @param  @return设定文件
   	 * @return Object  返回类型
   	 * @throws  
   	 */
   	@Transactional(readOnly = false)
	public Object editMemberAuthReception(MemberAuthWithBLOBs memberAuthWithBLOBs) {
		JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
		int count = 0; 
		Subject pricipalSubject = SecurityUtils.getSubject();
        Member pricipalMember = (Member) pricipalSubject.getPrincipal(); 
        memberAuthWithBLOBs.setInfoTime(new Date());
        memberAuthWithBLOBs.setInfoAuditor(pricipalMember.getMemberId()); 
        count = memberAuthMapper.updateByPrimaryKeySelective(memberAuthWithBLOBs); 
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setObj(memberAuthWithBLOBs);
            returnResult.setMsg("[" + memberAuthWithBLOBs.getMemberName() + "]会员认证资料已上传");
        } else {
            returnResult.setMsg("发生未知错误，会员认证资料上传失败");
        }
        
		return returnResult;
	}
   	
    /**
     * @Title: getInfoAuthNumByInfoAuth
     * @Description: TODO(根据会员的基本资料认证状态来查询记录条数)
     * @param @param infoAuth
     * @param @return
     * @throws 备注
     *             <p>
     *             已检查测试:Green
     *             <p>
     */
    public Object getInfoAuthNumByInfoAuth(String infoAuth) {
        MemberAuthExample memberAuthExample = new MemberAuthExample();
        memberAuthExample.createCriteria().andInfoAuthEqualTo(infoAuth);
        int infoAuthNum = memberAuthMapper.countByExample(memberAuthExample);
        return infoAuthNum;
    }

    /**
     * @Title: getVipAuthNumByVipAuth
     * @Description: TODO(根据会员的Vip认证状态来查询记录条数)
     * @param @param vipAuth
     * @param @return
     * @throws 备注
     *             <p>
     *             已检查测试:Green
     *             <p>
     */
    public Object getVipAuthNumByVipAuth(String vipAuth) {
        MemberAuthExample memberAuthExample = new MemberAuthExample();
        memberAuthExample.createCriteria().andVipAuthEqualTo(vipAuth);
        int vipAuthNum = memberAuthMapper.countByExample(memberAuthExample);
        return vipAuthNum;
    }

    /**
     * @Title: getEmailAuthNumByEmailAuth
     * @Description: TODO(根据会员的邮箱认证状态来查询记录条数)
     * @param @param emailAuth
     * @param @return
     * @throws 备注
     *             <p>
     *             已检查测试:Green
     *             <p>
     */
    public Object getEmailAuthNumByEmailAuth(String emailAuth) {
        MemberAuthExample memberAuthExample = new MemberAuthExample();
        memberAuthExample.createCriteria().andEmailAuthEqualTo(emailAuth);
        int emailAuthNum = memberAuthMapper.countByExample(memberAuthExample);
        return emailAuthNum;
    }

    /**
     * @Title: getMobileAuthNumByMobileAuth
     * @Description: TODO(根据会员的电话认证状态来查询记录条数)
     * @param @param mobileAuth
     * @param @return
     * @throws 备注
     *             <p>
     *             已检查测试:Green
     *             <p>
     */
    public Object getMobileAuthNumByMobileAuth(String mobileAuth) {
        MemberAuthExample memberAuthExample = new MemberAuthExample();
        memberAuthExample.createCriteria().andMobileAuthEqualTo(mobileAuth);
        int mobileAuthNum = memberAuthMapper.countByExample(memberAuthExample);
        return mobileAuthNum;
    }

    /**
     * @Title: getCreditAuthNumByCreditAuth
     * @Description: TODO(根据会员的信用认证状态来查询记录条数)
     * @param @param creditAuth
     * @param @return
     * @throws 备注
     *             <p>
     *             已检查测试:Green
     *             <p>
     */
    public Object getCreditAuthNumByCreditAuth(String creditAuth) {
        MemberAuthExample memberAuthExample = new MemberAuthExample();
        memberAuthExample.createCriteria().andCreditAuthEqualTo(creditAuth);
        int creditAuthNum = memberAuthMapper.countByExample(memberAuthExample);
        return creditAuthNum;
    }

    /**
     * @Title: getCompanyAuthNumByCompanyAuth
     * @Description: TODO(根据会员的基本资料认证状态来查询记录条数)
     * @param @param companyAuth
     * @param @return
     * @throws 备注
     *             <p>
     *             已检查测试:Green
     *             <p>
     */
    public Object getCompanyAuthNumByCompanyAuth(String companyAuth) {
        MemberAuthExample memberAuthExample = new MemberAuthExample();
        memberAuthExample.createCriteria().andCompanyAuthEqualTo(companyAuth);
        int companyAuthNum = memberAuthMapper.countByExample(memberAuthExample);
        return companyAuthNum;
    }

    /**
     * @Title: getRealNameAuthNumByRealNameAuth
     * @Description: TODO(根据会员的真实姓名认证状态来查询记录条数)
     * @param @param realNameAuth
     * @param @return
     * @throws 备注
     *             <p>
     *             已检查测试:Green
     *             <p>
     */
    public Object getRealNameAuthNumByRealNameAuth(String realNameAuth) {
        MemberAuthExample memberAuthExample = new MemberAuthExample();
        memberAuthExample.createCriteria().andRealNameAuthEqualTo(realNameAuth);
        int realNameAuthNum = memberAuthMapper.countByExample(memberAuthExample);
        return realNameAuthNum;
    }

    /**
     * @Title: getIdCardAuthNumByIdCardAuth
     * @Description: TODO(根据会员的身份证认证状态来查询记录条数)
     * @param @param idCardAuth
     * @param @return
     * @throws 备注
     *             <p>
     *             已检查测试:Green
     *             <p>
     */
    public Object getIdCardAuthNumByIdCardAuth(String idCardAuth) {
        MemberAuthExample memberAuthExample = new MemberAuthExample();
        memberAuthExample.createCriteria().andIdCardAuthEqualTo(idCardAuth);
        int idCardAuthNum = memberAuthMapper.countByExample(memberAuthExample);
        return idCardAuthNum;
    }

    /**
     * @Title: getWorkAuthNumByWorkAuth
     * @Description: TODO(根据会员的工作认证状态来查询记录条数)
     * @param @param workAuth
     * @param @return
     * @throws 备注
     *             <p>
     *             已检查测试:Green
     *             <p>
     */
    public Object getWorkAuthNumByWorkAuth(String workAuth) {
        MemberAuthExample memberAuthExample = new MemberAuthExample();
        memberAuthExample.createCriteria().andWorkAuthEqualTo(workAuth);
        int workAuthNum = memberAuthMapper.countByExample(memberAuthExample);
        return workAuthNum;
    }
    
    /**
     * @Title: getAuthNumByStateAndMemberId 
     * @Description: TODO(查询该会员不同状态下的认证条数) 
     * @param  @param State
     * @param  @param MemberId
     * @param  @return
     * @throws 
     * 备注<p>已检查测试:Green<p>
     */
    public Object getAuthNumByStateAndMemberId(String State, String MemberId) {
        int authNum = 0;
        if (null != State && StringUtils.isNotBlank(State)) {
            if (State.equals("noapply")) {
                int authNumNoapply = getAuthNumByState("noapply",MemberId);
                return authNumNoapply;
            }
            if (State.equals("authstr")) {
                int authNumAuthstr = getAuthNumByState("authstr",MemberId);
                return authNumAuthstr;
            }
            if (State.equals("pass")) {
                int authNumPass = getAuthNumByState("pass",MemberId);
                return authNumPass;
            }
            if (State.equals("failure")) {
                int authNumFailure = getAuthNumByState("failure",MemberId);
                return authNumFailure;
            }
        }   
        return authNum;
    }
    
    /**
     * @Title: getAuthNumByState 
     * @Description: TODO(查询该会员下的认证记录不同状态的认证条数) 
     * @param  @param State
     * @param  @param MemberId
     * @param  @return
     * @throws 
     * 备注<p>已检查测试:Green<p>
     */
    public int getAuthNumByState (String State, String MemberId) {
        int authNum = 0;
        if (null != State && StringUtils.isNotBlank(State)) {    
            MemberAuthExample memberAuthExampleInfo = new MemberAuthExample();
            memberAuthExampleInfo.createCriteria().andMemberIdEqualTo(MemberId).andInfoAuthEqualTo(State);
            authNum += memberAuthMapper.countByExample(memberAuthExampleInfo);
        }
        if (null != State && StringUtils.isNotBlank(State)) {
            MemberAuthExample memberAuthExampleVip = new MemberAuthExample();
            memberAuthExampleVip.createCriteria().andMemberIdEqualTo(MemberId).andVipAuthEqualTo(State);
            authNum += memberAuthMapper.countByExample(memberAuthExampleVip);
        }
        if (null != State && StringUtils.isNotBlank(State)) {
            MemberAuthExample memberAuthExampleEmail = new MemberAuthExample();
            memberAuthExampleEmail.createCriteria().andMemberIdEqualTo(MemberId).andEmailAuthEqualTo(State);
            authNum += memberAuthMapper.countByExample(memberAuthExampleEmail);
        }
        if (null != State && StringUtils.isNotBlank(State)) {
            MemberAuthExample memberAuthExampleMobile = new MemberAuthExample();
            memberAuthExampleMobile.createCriteria().andMemberIdEqualTo(MemberId).andMobileAuthEqualTo(State);
            authNum += memberAuthMapper.countByExample(memberAuthExampleMobile);
        }
        if (null != State && StringUtils.isNotBlank(State)) {
            MemberAuthExample memberAuthExampleCredit = new MemberAuthExample();
            memberAuthExampleCredit.createCriteria().andMemberIdEqualTo(MemberId).andCreditAuthEqualTo(State);
            authNum += memberAuthMapper.countByExample(memberAuthExampleCredit);
        }
        if (null != State && StringUtils.isNotBlank(State)) {
            MemberAuthExample memberAuthExampleCompany = new MemberAuthExample();
            memberAuthExampleCompany.createCriteria().andMemberIdEqualTo(MemberId).andCompanyAuthEqualTo(State);
            authNum += memberAuthMapper.countByExample(memberAuthExampleCompany);
        }
        if (null != State && StringUtils.isNotBlank(State)) {
            MemberAuthExample memberAuthExampleRealName = new MemberAuthExample();
            memberAuthExampleRealName.createCriteria().andMemberIdEqualTo(MemberId).andRealNameAuthEqualTo(State);
            authNum += memberAuthMapper.countByExample(memberAuthExampleRealName);
        }
        if (null != State && StringUtils.isNotBlank(State)) {
            MemberAuthExample memberAuthExampleIdCard = new MemberAuthExample();
            memberAuthExampleIdCard.createCriteria().andMemberIdEqualTo(MemberId).andIdCardAuthEqualTo(State);
            authNum += memberAuthMapper.countByExample(memberAuthExampleIdCard);
        }
        if (null != State && StringUtils.isNotBlank(State)) {
            MemberAuthExample memberAuthExampleWorkAuth = new MemberAuthExample();
            memberAuthExampleWorkAuth.createCriteria().andMemberIdEqualTo(MemberId).andWorkAuthEqualTo(State);
            authNum += memberAuthMapper.countByExample(memberAuthExampleWorkAuth);
        }
        return authNum;
    }
}
