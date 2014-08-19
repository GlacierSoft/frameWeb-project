/**
 * @Title: MemberService.java 
 * @Package com.glacier.frame.service.system 
 * @author songjundong   
 * @email 985776597@qq.com
 * @date 2014-8-18 下午5:11:53
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

import java.net.InetAddress;
import java.net.UnknownHostException;
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

import com.glacier.basic.util.CollectionsUtil;
import com.glacier.basic.util.RandomGUID;
import com.glacier.frame.dao.basicdatas.ParameterCreditTypeMapper;
import com.glacier.frame.dao.basicdatas.ParameterIntegralTypeMapper;
import com.glacier.frame.dao.member.MemberAuthMapper;
import com.glacier.frame.dao.member.MemberCreditIntegralMapper;
import com.glacier.frame.dao.member.MemberIntegralMapper;
import com.glacier.frame.dao.member.MemberMapper;
import com.glacier.frame.dao.member.MemberMessageNoticeMapper;
import com.glacier.frame.dao.member.MemberTokenMapper;
import com.glacier.frame.dao.member.MemberWorkMapper;
import com.glacier.frame.dao.system.UserMapper;
import com.glacier.frame.dto.query.member.MemberQueryDTO;
import com.glacier.frame.entity.basicdatas.ParameterCredit;
import com.glacier.frame.entity.basicdatas.ParameterCreditType;
import com.glacier.frame.entity.basicdatas.ParameterCreditTypeExample;
import com.glacier.frame.entity.basicdatas.ParameterIntegralType;
import com.glacier.frame.entity.basicdatas.ParameterIntegralTypeExample;
import com.glacier.frame.entity.member.Member;
import com.glacier.frame.entity.member.MemberAuthExample;
import com.glacier.frame.entity.member.MemberAuthWithBLOBs;
import com.glacier.frame.entity.member.MemberCreditIntegral;
import com.glacier.frame.entity.member.MemberExample;
import com.glacier.frame.entity.member.MemberExample.Criteria;
import com.glacier.frame.entity.member.MemberIntegral;
import com.glacier.frame.entity.member.MemberMessageNotice;
import com.glacier.frame.entity.member.MemberToken;
import com.glacier.frame.entity.member.MemberWork;
import com.glacier.frame.entity.member.MemberWorkExample;
import com.glacier.frame.entity.system.User;
import com.glacier.frame.entity.system.UserExample;
import com.glacier.frame.service.basicdatas.ParameterCreditService;
import com.glacier.frame.util.MethodLog;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.security.util.Digests;
import com.glacier.security.util.Encodes;

/*** 
 * @ClassName:  MemberService
 * @Description: TODO(会员表业务类)
 * @author songjundong
 * @email 985776597@QQ.com
 * @date 2014-8-18  下午5:11:53
 */
@Service
@Transactional(readOnly = true ,propagation = Propagation.REQUIRED)
public class MemberService {

	@Autowired
	private MemberMapper memberMapper;
	
	@Autowired
	private MemberTokenMapper memberTokenMapper;
	
	@Autowired
	private MemberWorkMapper memberWorkMapper;
	
	@Autowired
	private MemberAuthMapper memberAuthMapper;
	
	@Autowired
    private ParameterCreditTypeMapper creditTypeMapper;
	
	@Autowired
	private MemberCreditIntegralMapper memberCreditIntegralMapper;
	
	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private MemberMessageNoticeMapper memberMessageNoticeMapper;
	
	@Autowired
	private ParameterCreditService parameterCreditService;
	
	@Autowired
	private ParameterIntegralTypeMapper parameterIntegralTypeMapper;
	
	@Autowired
	private MemberIntegralMapper memberIntegralMapper;
	
	/*** 
	 * @Title: checkMemberDatum  
	 * @Description: TODO(判断用用户的信息是否完善)  
	 * @param @param memberId
	 * @param @return    设定文件  
	 * @return Object    返回类型  
	 * @throws
	 */
	
	public Object checkMemberDatum(String memberId){
		System.out.println("ID名称:"+memberId);
		JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
		MemberExample memberExample = new MemberExample();
		memberExample.createCriteria().andMemberIdEqualTo(memberId);
		List<Member> MemberList = memberMapper.selectByExample(memberExample); 
		if(MemberList.get(0).getMemberRealName() == null){
			returnResult.setMsg("此操作需要完善用户资料！");
			returnResult.setSuccess(false);
			return returnResult;
		}
		returnResult.setSuccess(true);
		return returnResult;
	}
	
	 /**
     * 加密方式
     */
    public static final String HASH_ALGORITHM = "SHA-1";

    /**
     * 计算次数
     */
    public static final int HASH_INTERATIONS = 1024;

    /**
     * 盐值长度
     */
    public static final int SALT_SIZE = 8;
	
    /**
     * 设定盐值和设定安全的密码，生成随机的salt并经过1024次 sha-1 hash
     */
    private void entryptPassword(MemberToken memberToken) {
        byte[] salt = Digests.generateSalt(SALT_SIZE);
        memberToken.setSalt(Encodes.encodeHex(salt));
        byte[] hashPassword = Digests.sha1(memberToken.getPassword().getBytes(), salt, HASH_INTERATIONS);
        memberToken.setPassword(Encodes.encodeHex(hashPassword));
    }
    
    
    /**
     * 设定盐值和设定安全的交易密码，生成随机的salt并经过1024次 sha-1 hash
     */
    private void entryptTradersPassword(MemberToken memberToken) {
        byte[] salt = Digests.generateSalt(SALT_SIZE);
        memberToken.setTradersSalt(Encodes.encodeHex(salt));
        byte[] hashPassword = Digests.sha1(memberToken.getTratersPassword().getBytes(), salt, HASH_INTERATIONS); 
        memberToken.setTratersPassword(Encodes.encodeHex(hashPassword));
    }
     
	/**
	 * @Title: getMember 
	 * @Description: TODO(根据会员Id获取会员信息) 
	 * @param @param memberId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public Object getMember(String memberId) {
    	Member member = memberMapper.selectByPrimaryKey(memberId);
    	//查询基础信用积分的所有数据
        @SuppressWarnings("unchecked")
		List<ParameterCredit> parameterCredits = (List<ParameterCredit>) parameterCreditService.listCredits();
        //通过嵌套for循环，将会员的信用图标加到会员对象中去
        	for(ParameterCredit parameterCredit : parameterCredits){
    			if(member.getCreditIntegral() >= parameterCredit.getCreditBeginIntegral() && member.getCreditIntegral() < parameterCredit.getCreditEndIntegral()){
    				member.setCreditPhoto(parameterCredit.getCreditPhoto());
        			break;
        		}	
        	}
        return member;
    }
    
    /**
	 * @Title: getMemberWork 
	 * @Description: TODO(根据会员Id获取会员工作信息) 
	 * @param @param memberId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public Object getMemberWork(String memberId) {
    	MemberWork memberWork = memberWorkMapper.selectByPrimaryKey(memberId);
        return memberWork;
    }
    
    /**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有会员信息) 
     * @param @param pager
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(JqPager jqPager, MemberQueryDTO memberQueryDTO, String q) {
        JqGridReturn returnResult = new JqGridReturn();
        MemberExample memberExample = new MemberExample(); 
        Criteria queryCriteria = memberExample.createCriteria();
        memberQueryDTO.setQueryCondition(queryCriteria, q); 
        if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
        	memberExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
        	memberExample.setLimitEnd(jqPager.getRows());
        }
        if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
        	memberExample.setOrderByClause(jqPager.getOrderBy("temp_member_"));
        }
        List<Member>  members = memberMapper.selectByExample(memberExample); // 查询所有会员列表
        int total = memberMapper.countByExample(memberExample); // 查询总页数
        returnResult.setRows(members);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }
    
    /**
     * @Title: isUsernameRepeat 
     * @Description: TODO(判断会员名是否重复) 
     * @param  @param member
     * @param  @return设定文件
     * @return Object  返回类型
     * @throws 
     */
    public Object isUsernameRepeat(Member member){
    	  JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
          MemberExample memberExample = new MemberExample();
          // 防止会员名称重复
          memberExample.createCriteria().andMemberNameEqualTo(member.getMemberName());
          int count = memberMapper.countByExample(memberExample);// 查找相同名称的会员数量
          if (count > 0) {
              returnResult.setMsg("会员名称重复");
          }else{
        	  returnResult.setSuccess(true);
          }
          return returnResult;
    }
    /**
     * @Title: isEmailRepeat 
     * @Description: TODO(判断邮箱是否重复) 
     * @param  @param member
     * @param  @return设定文件
     * @return Object  返回类型
     * @throws 
     *
     */
    public Object isEmailRepeat(Member member){
  	   JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        MemberExample memberExample = new MemberExample();
        // 防止邮箱重复
        memberExample.createCriteria().andEmailEqualTo(member.getEmail());
        int count = memberMapper.countByExample(memberExample);// 查找相同邮箱的会员数量
        if (count > 0) {
            returnResult.setMsg("该邮箱已注册！");
        }else{
      	  returnResult.setSuccess(true);
        }
        return returnResult;
  }
    private void updateentryptPassword(MemberToken memberToken) {
        byte[] salt = Digests.generateSalt(SALT_SIZE);
        memberToken.setSalt(Encodes.encodeHex(salt));
        byte[] hashPassword = Digests.sha1(memberToken.getPassword().getBytes(), salt, HASH_INTERATIONS);
        memberToken.setPassword(Encodes.encodeHex(hashPassword));
    }
    
    private void updateentryptRraterPassword(MemberToken memberToken) {
        byte[] salt = Digests.generateSalt(SALT_SIZE);
        memberToken.setTradersSalt(Encodes.encodeHex(salt));
        byte[] hashPassword = Digests.sha1(memberToken.getTratersPassword().getBytes(), salt, HASH_INTERATIONS);
        memberToken.setTratersPassword(Encodes.encodeHex(hashPassword));
    }
    
    /**
     * @Title: isequalsPassword 
     * @Description: TODO(会员密码修改) 
     * @param  @param member
     * @param  @param oldPassword
     * @param  @param memberPassword
     * @param  @return设定文件
     * @return Object  返回类型
     * @throws 
     */
    @Transactional(readOnly = false)
    public Object isequalsPassword(Member member,String oldPassword,String memberPassword){
    	JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
    	Member m1 = memberMapper.selectByPrimaryKey(member.getMemberId());//通过memberid获取member
    	MemberToken mt = memberTokenMapper.selectByPrimaryKey(member.getMemberId());//通过memberId获取memberToken
        //将前台传来的密码进行加密，
    	byte[] salt = Encodes.decodeHex(mt.getSalt());
    	byte[] hashPassword = Digests.sha1(oldPassword.getBytes(), salt, HASH_INTERATIONS);
    	String encodeHexPwd = Encodes.encodeHex(hashPassword);
    	int count = 0;
    	int countMT = 0; 
    	//将加密后的密码和存在数据库里的密码进行比较。
        if ((m1.getMemberPassword()).equals(encodeHexPwd)) {
        	//会员表的修改
            member.setUpdater(getuserId());
            member.setUpdateTime(new Date());
            mt.setPassword(memberPassword);
            //将新密码进行加密
            this.updateentryptPassword(mt);
            //更新member和memberToken 
            member.setMemberPassword(mt.getPassword());
            countMT = memberTokenMapper.updateByPrimaryKeySelective(mt);
            count = memberMapper.updateByPrimaryKeySelective(member);
            if(count ==1 && countMT==1){
            	returnResult.setSuccess(true);
            	returnResult.setMsg("密码修改成功！");
            }else{
            	returnResult.setMsg("密码修改失败！");
            }
        }else{
      	  returnResult.setMsg("原密码不正确！");
        }  
        return returnResult;
    }
     
    /**
     * @Title: isequalsbusinessPassword 
     * @Description: TODO(会员交易密码修改) 
     * @param  @param member
     * @param  @param oldPassword
     * @param  @param memberPassword
     * @param  @return设定文件
     * @return Object  返回类型
     * @throws 
     */
    @Transactional(readOnly = false)
    public Object isequalsbusinessPassword(Member member,String oldPassword,String memberPassword){
    	JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
    	Member m1 = memberMapper.selectByPrimaryKey(member.getMemberId());//通过memberid获取member
    	MemberToken mt = memberTokenMapper.selectByPrimaryKey(member.getMemberId());//通过memberId获取memberToken
       //将前台传来的密码进行加密，
    	byte[] salt = Encodes.decodeHex(mt.getTradersSalt());
    	byte[] hashPassword = Digests.sha1(oldPassword.getBytes(), salt, HASH_INTERATIONS);
    	String encodeHexPwd = Encodes.encodeHex(hashPassword); 
    	int count = 0;
    	int countMT = 0; 
    	//将加密后的密码和存在数据库里的密码进行比较。
        if ((m1.getTradersPassword()).equals(encodeHexPwd)) { 
        	//会员表的修改
        	m1.setUpdater(getuserId());
        	m1.setUpdateTime(new Date());
            mt.setTratersPassword(memberPassword);
            //将新密码进行加密
            this.updateentryptRraterPassword(mt);
            //更新member和memberToken
            m1.setTradersPassword(mt.getTratersPassword());
            countMT = memberTokenMapper.updateByPrimaryKeySelective(mt);
            count = memberMapper.updateByPrimaryKeySelective(m1);
            if(count == 1 && countMT == 1 ){
            	returnResult.setSuccess(true);
            	returnResult.setMsg("交易密码修改成功！");
            }else{
            	returnResult.setMsg("交易密码修改失败！");
            }
          }else{
      	  returnResult.setMsg("原交易密码不正确！");
        }
        return returnResult;
    }
    
    /**
     * @Title: addMemberReception 
     * @Description: TODO(前台注册会员，同时生成工作表和认证表) 
     * @param  @param member
     * @param  @return设定文件
     * @return Object  返回类型
     * @throws 
     */
    @Transactional(readOnly = false)
    public Object addMemberReception(Member member){  
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        //判断是否已经成功注册，如果成功注册，则提示已经注册信息，跳转到登录页面
        Member memberTemp = new Member();
        memberTemp = memberMapper.selectByMemberName(member.getMemberName());
        if (memberTemp != null){
            returnResult.setSuccess(true);
            returnResult.setMsg("您已经注册成功，请登录。");
            return returnResult;
        }
        int count = 0;
        int countWork = 0;
        int countToken = 0;
        int creditCount = 0;
        int MessageNoticeCount = 0;
        String memberId = RandomGUID.getRandomGUID();  
        //设置membertoken信息
        MemberToken memberToken = new MemberToken();
        memberToken.setMemberId(memberId);
        memberToken.setUsername(member.getMemberName());
        memberToken.setPassword(member.getMemberPassword()); 
        this.entryptPassword(memberToken); 
        
        //增加邮箱认证信用积分
        ParameterCreditType parameterCreditType = null;
        ParameterCreditTypeExample parameterCreditTypeExample = new ParameterCreditTypeExample();
        MemberCreditIntegral memberCreditIntegral = new MemberCreditIntegral();
        parameterCreditTypeExample.createCriteria().andCreditTypeEqualTo("emailAuth");
		List<ParameterCreditType>  parameterCreditTypes = creditTypeMapper.selectByExample(parameterCreditTypeExample); // 查询所有信用积分类型列表
		parameterCreditType = parameterCreditTypes.get(0);
        //增加会员信息 
        member.setMemberId(memberId);
        member.setMemberPassword(memberToken.getPassword()); 
        member.setCreditIntegral(0f);
        member.setCreditamount(0f); 
        member.setType("general");
        member.setStatus("enable");
        member.setFirstContactRelation("family");
        member.setSecondContactRelation("family");
        member.setIntegral((float) 0);
        //初始化信用认证积分
        member.setCreditIntegral((float)parameterCreditType.getChangeValue());
        member.setRegistrationTime(new Date());
        member.setLastLoginTime(new Date());
        member.setLoginCount(1); 
        member.setMemberPhoto("http://bdmu.v068041.10000net.cn/frame-website/resources/images/member/member.jpg");//会员注册后的默认头像
        member.setCreater(getuserId());
        member.setCreateTime(new Date());
        member.setUpdater(getuserId());
        member.setUpdateTime(new Date());
        member.setTradersPassword(memberToken.getPassword());//会员交易密码
        count = memberMapper.insert(member); 
        //增加membertoken信息 要先增加member记录，才能再生成外键表的记录
        memberToken.setTradersSalt(memberToken.getSalt());
        memberToken.setTratersPassword(memberToken.getPassword());//交易密码
        countToken = memberTokenMapper.insert(memberToken);
        
        //增加会员工作信息
        MemberWork memberWork = new MemberWork();
        memberWork.setMemberId(memberId);
        countWork = memberWorkMapper.insert(memberWork);
         
        //生成会员认证表信息
        MemberAuthWithBLOBs memberAuthWithBLOBs = new MemberAuthWithBLOBs();
        memberAuthWithBLOBs.setMemberId(memberId);
        memberAuthWithBLOBs.setInfoName("基本信息认证");
        memberAuthWithBLOBs.setInfoAuth("noapply");
        memberAuthWithBLOBs.setVipName("VIP认证");
        memberAuthWithBLOBs.setVipAuth("noapply");
        memberAuthWithBLOBs.setEmailName("邮箱认证");
        memberAuthWithBLOBs.setEmailAuth("pass");
        memberAuthWithBLOBs.setEmailAuditor(getuserId());
        memberAuthWithBLOBs.setEmailRemark("邮箱验证通过");
        memberAuthWithBLOBs.setEmailTime(new Date());
        memberAuthWithBLOBs.setMobileName("手机认证");
        memberAuthWithBLOBs.setMobileAuth("noapply");
        memberAuthWithBLOBs.setCreditName("信用认证");
        memberAuthWithBLOBs.setCreditAuth("noapply");
        memberAuthWithBLOBs.setCompanyName("企业认证");
        memberAuthWithBLOBs.setCompanyAuth("noapply");
        memberAuthWithBLOBs.setRealName("真实姓名认证");
        memberAuthWithBLOBs.setRealNameAuth("noapply");
        memberAuthWithBLOBs.setIdCardName("身份证认证");
        memberAuthWithBLOBs.setIdCardAuth("noapply");
        memberAuthWithBLOBs.setWorkName("工作认证");
        memberAuthWithBLOBs.setWorkAuth("noapply");
        memberAuthMapper.insert(memberAuthWithBLOBs); 
		String creditIntegralId = RandomGUID.getRandomGUID();
		memberCreditIntegral.setCreditIntegralId(creditIntegralId);
		memberCreditIntegral.setMemberId(memberId); 
		memberCreditIntegral.setIntegralType(parameterCreditType.getCreditType());
		memberCreditIntegral.setChangeType(parameterCreditType.getChangeType());
		memberCreditIntegral.setChangeValue(parameterCreditType.getChangeValue()); 
        memberCreditIntegral.setCreater(getuserId());
        memberCreditIntegral.setCreateTime(new Date());
        memberCreditIntegral.setUpdater(getuserId());
        memberCreditIntegral.setUpdateTime(new Date()); 
        creditCount = memberCreditIntegralMapper.insert(memberCreditIntegral);
        
        //增加邮箱认证审核通过的信息通知
        MemberMessageNotice memberMessageNotice = new MemberMessageNotice();
        memberMessageNotice.setMessageNoticeId(RandomGUID.getRandomGUID());
   		memberMessageNotice.setSender(getuserId());
   		memberMessageNotice.setAddressee(memberId);
   		memberMessageNotice.setTitle("邮箱认证审核通知");
		memberMessageNotice.setContent("您的邮箱认证审核状况:通过");
        memberMessageNotice.setSendtime(new Date());
        memberMessageNotice.setLetterstatus("unread");
        memberMessageNotice.setLettertype("system");
        memberMessageNotice.setCreater(getuserId());
        memberMessageNotice.setCreateTime(new Date());
        memberMessageNotice.setUpdater(getuserId());
        memberMessageNotice.setUpdateTime(new Date());
        MessageNoticeCount = memberMessageNoticeMapper.insert(memberMessageNotice); 
        if (count == 1 && countWork == 1 && countToken == 1 && creditCount == 1 && MessageNoticeCount == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + member.getMemberName() + "] 会员信息已保存");
            returnResult.setObj(member);
        } else {
            returnResult.setMsg("发生未知错误，会员信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: applicationVIP 
     * @Description: TODO(会员前台申请vip审核) 
     * @param  @param memberId
     * @param  @return设定文件
     * @return Object  返回类型
     * @throws 
     */
    @Transactional(readOnly = false)
    public Object applicationVIP(String memberId){
    	JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
    	int count = 0; 
        MemberAuthWithBLOBs memberAuthWithBLOBs = memberAuthMapper.selectByPrimaryKey(memberId);
        memberAuthWithBLOBs.setVipAuth("authstr");
    	count = memberAuthMapper.updateByPrimaryKeySelective(memberAuthWithBLOBs);
        //count = memberMapper.updateByPrimaryKeySelective(member);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("申请会员VIP成功，等待审核");
        } else {
            returnResult.setMsg("发生未知错误，申请会员VIP失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: editMemberReception 
     * @Description: TODO(前台个人信息的修改) 
     * @param  @return设定文件
     * @return Object  返回类型
     * @throws 
     */
    @Transactional(readOnly = false)
    public Object editMemberReception(Member member,MemberWork memberWork,String postAuth){
    	JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false  
    	int count = 0;
        int countWork = 0;
        //会员表的修改
        member.setUpdater(getuserId());
        member.setUpdateTime(new Date());
        count = memberMapper.updateByPrimaryKeySelective(member);
        //工作表的修改
        countWork = memberWorkMapper.updateByPrimaryKeySelective(memberWork);
        //将基本信息和工作信息提交审核手机认证提交审核
        if(postAuth.equalsIgnoreCase("postAuth")){
        	MemberAuthWithBLOBs memberAuthWithBLOBs = memberAuthMapper.selectByPrimaryKey(member.getMemberId());
        	memberAuthWithBLOBs.setInfoAuth("authstr");
        	memberAuthWithBLOBs.setWorkAuth("authstr");
        	memberAuthWithBLOBs.setMobileAuth("authstr");  
        	memberAuthMapper.updateByPrimaryKeySelective(memberAuthWithBLOBs);
        }
        if (count == 1 && countWork == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("会员信息保存成功");
            //returnResult.setMsg("[" + member.getMemberName() + "] 会员信息已修改");
        } else {
            returnResult.setMsg("发生未知错误，会员信息修改失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: editMemberPhotoReception 
     * @Description: TODO(上传个人头像) 
     * @param  @param member
     * @param  @return设定文件
     * @return Object  返回类型
     * @throws 
     */
    @Transactional(readOnly = false)
    public Object editMemberPhotoReception(Member member){
    	JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false 
    	int count = 0;
        //会员表的修改
        member.setUpdater(getuserId());
        member.setUpdateTime(new Date());
        count = memberMapper.updateByPrimaryKeySelective(member); 
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("个人头像保存成功");
        } else {
            returnResult.setMsg("发生未知错误，个人头像上传失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: addMemberandWorkandAuth 
     * @Description: TODO(新增会员,工作，认证) 
     * @param @param member
     * @param @param memberWork
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "MemberList_add")
    public Object addMemberandWorkandAuth(Member member,MemberWork memberWork) { 
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal(); 
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        MemberExample memberExample = new MemberExample();
        int count = 0;
        int countWork = 0;
        int countToken = 0;
        String memberId = RandomGUID.getRandomGUID();
        // 防止会员名称重复
        memberExample.createCriteria().andMemberNameEqualTo(member.getMemberName());
        count = memberMapper.countByExample(memberExample);// 查找相同名称的会员数量
        if (count > 0) {
            returnResult.setMsg("会员名称重复");
            return returnResult;
        } 
        //设置membertoken信息
        MemberToken memberToken = new MemberToken();
        memberToken.setMemberId(memberId);
        memberToken.setUsername(member.getMemberName());
        memberToken.setPassword(member.getMemberPassword());
        memberToken.setTratersPassword(member.getTradersPassword());
        this.entryptPassword(memberToken);
        this.entryptTradersPassword(memberToken); 
        //增加会员信息
        if(member.getFirstContactRelation() == null || member.getFirstContactRelation().equals("")){
        	member.setFirstContactRelation("family");
        }
        if(member.getSecondContactRelation() == null || member.getSecondContactRelation().equals("")){
        	member.setSecondContactRelation("family");
        } 
        member.setMemberId(memberId);
        member.setMemberPassword(memberToken.getPassword());
        member.setTradersPassword(memberToken.getTratersPassword());
        member.setIntegral((float) 0);
        member.setCreditIntegral((float) 0);
        member.setRegistrationTime(new Date());
        member.setCreater(pricipalUser.getUserId());
        member.setCreateTime(new Date());
        member.setUpdater(pricipalUser.getUserId());
        member.setUpdateTime(new Date());
        count = memberMapper.insert(member); 
        //增加membertoken信息 要先增加member记录，才能再生成外键表的记录
        countToken = memberTokenMapper.insert(memberToken); 
        //增加会员工作信息
        memberWork.setMemberId(memberId);
        countWork = memberWorkMapper.insert(memberWork); 
        //生成会员认证表信息
        MemberAuthWithBLOBs memberAuthWithBLOBs = new MemberAuthWithBLOBs();
        memberAuthWithBLOBs.setMemberId(memberId);
        memberAuthWithBLOBs.setInfoName("基本信息认证");
        memberAuthWithBLOBs.setInfoAuth("noapply");
        memberAuthWithBLOBs.setVipName("VIP认证");
        memberAuthWithBLOBs.setVipAuth("noapply");
        memberAuthWithBLOBs.setEmailName("邮箱认证");
        memberAuthWithBLOBs.setEmailAuth("noapply");
        memberAuthWithBLOBs.setMobileName("手机认证");
        memberAuthWithBLOBs.setMobileAuth("noapply");
        memberAuthWithBLOBs.setCreditName("信用认证");
        memberAuthWithBLOBs.setCreditAuth("noapply");
        memberAuthWithBLOBs.setCompanyName("企业认证");
        memberAuthWithBLOBs.setCompanyAuth("noapply");
        memberAuthWithBLOBs.setRealName("真实姓名认证");
        memberAuthWithBLOBs.setRealNameAuth("noapply");
        memberAuthWithBLOBs.setIdCardName("身份证认证");
        memberAuthWithBLOBs.setIdCardAuth("noapply");
        memberAuthWithBLOBs.setWorkName("工作认证");
        memberAuthWithBLOBs.setWorkAuth("noapply");
        memberAuthMapper.insert(memberAuthWithBLOBs); 
        if (count == 1 && countWork == 1 && countToken == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + member.getMemberName() + "] 会员信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，会员信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: editMemberandWork 
     * @Description: TODO(修改会员，工作) 
     * @param @param member
     * @param @param memberWork
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "MemberList_edit")
    public Object editMemberandWork(Member member,MemberWork memberWork) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        MemberExample memberExample = new MemberExample();
        int count = 0;
        int countWork = 0;
        // 防止会员名称重复
        memberExample.createCriteria().andMemberIdNotEqualTo(member.getMemberId()).andMemberNameEqualTo(member.getMemberName());
        count = memberMapper.countByExample(memberExample);// 查找相同名称的会员数量
        if (count > 0) {
            returnResult.setMsg("会员名称重复");
            return returnResult;
        } 
        //会员表的修改
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        member.setUpdater(pricipalUser.getUserId());
        member.setUpdateTime(new Date());
        count = memberMapper.updateByPrimaryKeySelective(member); 
        //工作表的修改
        countWork = memberWorkMapper.updateByPrimaryKeySelective(memberWork); 
        if (count == 1 && countWork == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + member.getMemberName() + "] 会员信息已修改");
        } else {
            returnResult.setMsg("发生未知错误，会员信息修改失败");
        }
        return returnResult;
    }
    
   /**
     * @Title: delMemberandWorkandAuth 
     * @Description: TODO(删除会员，工作，认证) 
     * @param @param memberIds
     * @param @param annThemes
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "MemberList_del")
    public Object delMemberandWorkandAuth(List<String> memberIds, List<String> memberNames) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        int countWork = 0;
        int countAuth = 0;
        if (memberIds.size() > 0) {
            //工作表的删除
            MemberWorkExample memberWorkExample = new MemberWorkExample();
            memberWorkExample.createCriteria().andMemberIdIn(memberIds);
            countWork = memberWorkMapper.deleteByExample(memberWorkExample);
            
            //会员认证表的删除
            MemberAuthExample memberAuthExample = new MemberAuthExample();
            memberAuthExample.createCriteria().andMemberIdIn(memberIds);
            countAuth = memberAuthMapper.deleteByExample(memberAuthExample);
            
            //会员表的删除
        	MemberExample memberExample = new MemberExample();
        	memberExample.createCriteria().andMemberIdIn(memberIds);
            count = memberMapper.deleteByExample(memberExample);
            if (count > 0 && countWork >0 && countAuth > 0) {
                returnResult.setSuccess(true);
                returnResult.setMsg("成功删除了[ " + CollectionsUtil.convertToString(memberNames, ",") + " ]操作");
            } else {
                returnResult.setMsg("发生未知错误，会员信息删除失败");
            }
        }
        return returnResult;
    }
    
    /**
     * @Title: retrieveEmail 
     * @Description: TODO(判断该邮箱是否存在) 
     * @param @param member
     * @param @param  
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false) 
    public Member retrieveEmail(String email) {  
        MemberExample memberExample = new MemberExample();
        memberExample.createCriteria().andEmailEqualTo(email);
        List<Member> memberlist= memberMapper.selectByExample(memberExample); 
        //如果取出来的是没数据的，就返回null,否则就把集合里的第一条数据返回
        return memberlist.size()==0?null:memberlist.get(0);
    }
     
    /**
     * @Title: retrieveName 
     * @Description: TODO(判断该会员名称是否存在) 
     * @param @param member
     * @param @param  
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false) 
    public Member retrieveName(String name) {  
        MemberExample memberExample = new MemberExample();
        memberExample.createCriteria().andMemberNameEqualTo(name);
        List<Member> memberlist= memberMapper.selectByExample(memberExample); 
        //如果取出来的是没数据的，就返回null,否则就把集合里的第一条数据返回
        return memberlist.size()==0?null:memberlist.get(0);
    }
    
    /**
     * @Title: retrievePassword 
     * @Description: TODO(会员忘记密码通过邮箱找回密码，设置新密码) 
     * @param @param member
     * @param @param  
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false) 
    public Object setNewPassword(String email,String newPassword) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        MemberExample memberExample = new MemberExample();
        memberExample.createCriteria().andEmailEqualTo(email);
        List<Member> list=new ArrayList<Member>();
        list  = memberMapper.selectByExample(memberExample);
        Member member=list.get(0);
        int countMT=0;
        int count=0;
        if(member==null||newPassword.equals("")){ 
    	   returnResult.setMsg("会话失效，请重新发邮件找回密码"); 
        }else{ 
    	    returnResult.setSuccess(true); 
    	    MemberToken mt = memberTokenMapper.selectByPrimaryKey(member.getMemberId());//通过memberId获取memberToken
    	    //将前台传来的密码进行加密，
            mt.setPassword(newPassword);
            this.updateentryptPassword(mt);
            //更新member和memberToken
            member.setMemberPassword(mt.getPassword());
            countMT = memberTokenMapper.updateByPrimaryKeySelective(mt);
            count = memberMapper.updateByPrimaryKeySelective(member);
            if(count ==1 && countMT == 1){
            	returnResult.setSuccess(true);
            	returnResult.setMsg("密码修改成功！");
            }else{
            	returnResult.setMsg("密码修改失败！");
            } 
         }
    	 return returnResult;
    }
     
    /**
     * @Title: updateIntegra 
     * @Description: TODO(会员登录，如果是当天第一次登陆就新增登录积分，同时修改会员的积分) 
     * @param @param member
     * @param @param  
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */ 
    @Transactional(readOnly = false) 
    public void updateIntegra(String memberId) {    
      ParameterIntegralTypeExample parameterIntegralTypeExample=new ParameterIntegralTypeExample(); 
      parameterIntegralTypeExample.createCriteria().andIntegralTypeEqualTo("login");
 	  parameterIntegralTypeExample.createCriteria().andChangeTypeEqualTo("increase");
      Member member=memberMapper.selectByPrimaryKey(memberId);
      Date da=member.getLastLoginTime();
      Date datime=new Date();
      @SuppressWarnings("deprecation")
	  int boo=(da.getYear()+da.getMonth()+da.getDay())-(datime.getYear()+datime.getMonth()+datime.getDay()); 
      if(boo!=0){ 
      try{ 
    	  ParameterIntegralType parameterIntegralType=parameterIntegralTypeMapper.selectByExample(parameterIntegralTypeExample).get(0);
    	 if(parameterIntegralType!=null){ 
       	     MemberIntegral memberIntegral=new MemberIntegral();
        	 memberIntegral.setMemberIntegralId(RandomGUID.getRandomGUID());
        	 memberIntegral.setMemberId(memberId);
        	 memberIntegral.setType(parameterIntegralType.getIntegralType());
        	 memberIntegral.setChangeType(parameterIntegralType.getChangeType());
        	 memberIntegral.setChangeValue(parameterIntegralType.getChangeValue());
        	 memberIntegral.setRemark(parameterIntegralType.getRemark());
        	 memberIntegral.setCreater(getuserId());
        	 memberIntegral.setCreateTime(new Date());
        	 memberIntegral.setUpdateTime(new Date());
        	 memberIntegral.setUpdater(getuserId());
        	 memberIntegralMapper.insert(memberIntegral);  
        	 member.setIntegral(member.getIntegral()+parameterIntegralType.getChangeValue());
        	 memberMapper.updateByPrimaryKeySelective(member);  
    	 }  
         }catch(Exception ce){
    	  System.out.println(ce);
      } 
      member.setLoginCount(member.getLoginCount() + 1);
      try {
		member.setLastLoginIpAddress(InetAddress.getLocalHost().getHostAddress());
	} catch (UnknownHostException e){
		e.printStackTrace();
	}
      member.setLastLoginTime(new Date());// 设定最后登录时间
      memberMapper.updateByPrimaryKeySelective(member);//更新会员信息
      } 
   } 
      
      /*** 
       * @Title: getuserId  
       * @Description: TODO(获取管理员id)  
       * @param @return    设定文件  
       * @return String    返回类型  
       * @throws
       */
      public String getuserId(){ 
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUsernameEqualTo("admin");
        List<User> users = userMapper.selectByExample(userExample);
        return users.get(0).getUserId();
       }
}
