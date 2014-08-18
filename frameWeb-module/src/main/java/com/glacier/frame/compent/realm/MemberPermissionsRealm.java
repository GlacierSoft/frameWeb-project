/**
 * @author xichao.dong   
 * @email 406592176@qq.com
 * @date 2014-8-15 上午8:50:38 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) : 2014-8-15 上午8:50:38  xichao.dong 
 * @Review (审核人) ：xichao.dong 
 */
package com.glacier.frame.compent.realm; 

import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.DisabledAccountException;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.cache.Cache;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.SimplePrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import com.glacier.basic.util.RandomGUID;
import com.glacier.frame.dao.basicdatas.ParameterIntegralTypeMapper;
import com.glacier.frame.dao.member.MemberIntegralMapper;
import com.glacier.frame.dao.member.MemberMapper;
import com.glacier.frame.dao.member.MemberTokenMapper;
import com.glacier.frame.dao.system.UserMapper;
import com.glacier.frame.entity.basicdatas.ParameterIntegralType;
import com.glacier.frame.entity.basicdatas.ParameterIntegralTypeExample;
import com.glacier.frame.entity.member.Member;
import com.glacier.frame.entity.member.MemberIntegral;
import com.glacier.frame.entity.member.MemberToken;
import com.glacier.frame.entity.member.MemberTokenExample;
import com.glacier.frame.entity.system.User;
import com.glacier.frame.entity.system.UserExample;
import com.glacier.frame.service.system.UserService;
import com.glacier.security.util.Encodes;
 
/**
 * 
 * @ClassName: MemberPermissionsRealm
 * @Description: TODO(会员进行自定义执行认证和授权的类)
 * @author xichao.dong  
 * @email 406592176@qq.com
 * @date 2014-8-15 上午11:19:33
 */
public class MemberPermissionsRealm extends AuthorizingRealm {

    @Autowired
    private MemberTokenMapper memberTokenMapper;
    
    @Autowired
    private MemberMapper memberMapper;
    
    @Autowired
    private ParameterIntegralTypeMapper parameterIntegralTypeMapper;
    
    @Autowired
    private UserMapper userMapper;
    
    @Autowired
    private MemberIntegralMapper memberIntegralMapper;
    
    public MemberPermissionsRealm() {
        setName("MemberPermissionsRealm");
    }

    /*
     * (non-Javadoc) <p>Title: doGetAuthorizationInfo</p> <p>Description: 授权</p>
     * <p>当缓存中没有用户的授权信息的时候会从该方法中加载，缓存到文件中</p>
     * 
     * @param principals
     * 
     * @return
     * 
     * @see
     * org.apache.shiro.realm.AuthorizingRealm#doGetAuthorizationInfo(org.apache
     * .shiro.subject.PrincipalCollection)
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        return null;
    }

    /*
     * (non-Javadoc) <p>Title: doGetAuthenticationInfo</p> <p>Description:
     * 认证回调函数,登录时调用.</p>
     * 
     * @param authtoken
     * 
     * @return
     * 
     * @throws AuthenticationException
     * 
     * @see
     * org.apache.shiro.realm.AuthenticatingRealm#doGetAuthenticationInfo(org
     * .apache.shiro.authc.AuthenticationToken)
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authcToken) throws AuthenticationException {
    	CaptchaUsernamePasswordToken token = (CaptchaUsernamePasswordToken) authcToken;
        String username = token.getUsername(); 
        if (null != username && !"".equals(username)) {
            MemberTokenExample memberTokenExample = new MemberTokenExample();
            memberTokenExample.createCriteria().andUsernameEqualTo(username);
            MemberToken tokenMember= memberTokenMapper.selectByExample(memberTokenExample).get(0);
            if (null != tokenMember) {
                // 用户状态为启用或隐藏让其通过认证
                byte[] salt = Encodes.decodeHex(tokenMember.getSalt());
                //通过会员id来获取会员信息
                Member principalMember = memberMapper.selectByPrimaryKey(tokenMember.getMemberId());
                AuthenticationInfo info = new SimpleAuthenticationInfo(principalMember, tokenMember.getPassword(), ByteSource.Util.bytes(salt), getName());// 将用户的所有信息作为认证对象返回
                clearCache(info.getPrincipals());// 认证成功后清除之前的缓存
                updatePrincipalMemberInfo(token, principalMember);// 更新用户登录信息
                return info;
            } else {
                throw new DisabledAccountException();
            }
        }
        return null;
    }

    /**
     * @param token
     * @param principalUser
     * @Title: updatePrincipalUserInfo
     * @Description: TODO(更新用户登录信息)
     * @param
     * @throws NoSuchMethodException
     * @throws InvocationTargetException
     * @throws InstantiationException
     * @throws IllegalAccessException
     * @throws 备注
     *             <p>
     *             已检查测试:Green
     *             <p>
     */

    private void updatePrincipalMemberInfo(CaptchaUsernamePasswordToken token, Member principalMember) {
                Member lastTokenMember = new Member();
                UserExample userExample = new UserExample();
      		    userExample.createCriteria().andUsernameEqualTo("admin");
      		    List<User> users = userMapper.selectByExample(userExample); 
      		    String usid=users.get(0).getUserId();
                //取出会员上次登录的时间
                lastTokenMember=memberMapper.selectByPrimaryKey(principalMember.getMemberId());
                Date da=principalMember.getLastLoginTime();
                Date datime=new Date();
                @SuppressWarnings("deprecation")
				int boo=(da.getYear()+da.getDay())-(datime.getYear()+datime.getDay()); 
                if(boo!=0){
                     //如果上一次登录时间和现在登录时间不是同一天，那就更改会员的积分，和新增登录积分记录
                     //取出登录奖励积分对象
        			 ParameterIntegralTypeExample  parameterIntegralTypeExample=new ParameterIntegralTypeExample();
        			 parameterIntegralTypeExample.createCriteria().andIntegralTypeEqualTo("login");
        			 parameterIntegralTypeExample.createCriteria().andChangeTypeEqualTo("increase");
	         		 List<ParameterIntegralType> memberStatistics = parameterIntegralTypeMapper.selectByExample(parameterIntegralTypeExample);
	         		 ParameterIntegralType parameterIntegralType=memberStatistics.get(0);
	         		 //赋值会员积分
	         		 lastTokenMember.setIntegral(lastTokenMember.getIntegral()+parameterIntegralType.getChangeValue());//会员积分=原有积分+新增积分
	         		 //增加该会员的一条积分记录信息 
	     		     MemberIntegral memberIntegral=new MemberIntegral();
	     		     memberIntegral.setMemberIntegralId(RandomGUID.getRandomGUID());
	     		     memberIntegral.setMemberId(lastTokenMember.getMemberId()); 
	     		     memberIntegral.setChangeType(parameterIntegralType.getChangeType());//积分类型
	     		     memberIntegral.setChangeValue(parameterIntegralType.getChangeValue());//增加积分的值
	     		     memberIntegral.setType(parameterIntegralType.getIntegralType());//登录奖励积分
	     		     memberIntegral.setRemark(parameterIntegralType.getRemark());
	     		     memberIntegral.setCreater(usid);//创建人
	     		     memberIntegral.setCreateTime(new Date());
	     		     memberIntegral.setUpdater(usid);
	     		     memberIntegral.setUpdateTime(new Date());
                     memberIntegralMapper.insert(memberIntegral);//新增会员积分记录 
                } 
                 lastTokenMember.setLoginCount(principalMember.getLoginCount() + 1);
                 lastTokenMember.setLastLoginIpAddress(token.getHost());
                 lastTokenMember.setLastLoginTime(new Date());// 设定最后登录时间
                 memberMapper.updateByPrimaryKeySelective(lastTokenMember);//更新会员信息
            
    }
    /**
     * 更新用户授权信息缓存.
     */
    public void clearCachedAuthorizationInfo(String principal) {
        SimplePrincipalCollection principals = new SimplePrincipalCollection(principal, getName());
        clearCachedAuthorizationInfo(principals);
    }

    /**
     * 清除所有用户授权信息缓存.
     */
    public void clearAllCachedAuthorizationInfo() {
        Cache<Object, AuthorizationInfo> cache = getAuthorizationCache();
        if (cache != null) {
            for (Object key : cache.keys()) {
                cache.remove(key);
            }
        }
    }

    /**
     * 设定Password校验的Hash算法与迭代次数.
     */
    @PostConstruct
    public void initCredentialsMatcher() {
        HashedCredentialsMatcher matcher = new HashedCredentialsMatcher(UserService.HASH_ALGORITHM);
        matcher.setHashIterations(UserService.HASH_INTERATIONS);
        setCredentialsMatcher(matcher);
    }
    
}
