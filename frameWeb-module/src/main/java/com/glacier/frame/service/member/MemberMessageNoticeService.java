/**
 * @Title: MemberMessageNoticeService.java 
 * @Package com.glacier.frame.service.member 
 * @author songjundong   
 * @email 985776597@qq.com
 * @date 2014-8-18  下午5:24:55
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
import com.glacier.frame.dao.member.MemberMessageNoticeMapper;
import com.glacier.frame.dto.query.member.MemberMessageNoticeQueryDTO;
import com.glacier.frame.entity.member.MemberMessageNotice;
import com.glacier.frame.entity.member.MemberMessageNoticeExample;
import com.glacier.frame.entity.member.MemberMessageNoticeExample.Criteria;
import com.glacier.frame.entity.system.User;
import com.glacier.frame.util.MethodLog;

/*** 
 * @ClassName:  MemberMessageNoticeService
 * @Description: TODO(消息通知管理)
 * @author songjundong
 * @email 985776597@QQ.com
 * @date 2014-8-18  下午5:24:55
 */
@Service
@Transactional(readOnly = true , propagation = Propagation.REQUIRED)
public class MemberMessageNoticeService {

	@Autowired
	private MemberMessageNoticeMapper memberMessageNoticeMapper;
	
	/**
	 * @Title: getMemberMessageNotice 
	 * @Description: TODO(根据消息通知Id获取消息通知信息) 
	 * @param @param messageNoticeId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public Object getMemberMessageNotice(String messageNoticeId) {
    	MemberMessageNotice memberMessageNotice = memberMessageNoticeMapper.selectByPrimaryKey(messageNoticeId);
        return memberMessageNotice;
    }
    
    /**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有消息通知信息) 
     * @param @param pager
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGridWebsite(MemberMessageNoticeQueryDTO memberMessageNoticeQueryDTO,JqPager pager,int p) {
        
        JqGridReturn returnResult = new JqGridReturn();
        MemberMessageNoticeExample memberMessageNoticeExample = new MemberMessageNoticeExample();;
        
        Criteria queryCriteria = memberMessageNoticeExample.createCriteria();
        memberMessageNoticeQueryDTO.setQueryCondition(queryCriteria);

        pager.setSort("createTime");// 定义排序字段
	    pager.setOrder("DESC");// 升序还是降序
        if (StringUtils.isNotBlank(pager.getSort()) && StringUtils.isNotBlank(pager.getOrder())) {// 设置排序信息
        	memberMessageNoticeExample.setOrderByClause(pager.getOrderBy("temp_member_message_notice_"));
        }
        int startTemp = ((p-1)*10);//根据前台返回的页数进行设置
        memberMessageNoticeExample.setLimitStart(startTemp);
        memberMessageNoticeExample.setLimitEnd(10);
        List<MemberMessageNotice>  memberMessageNotices = memberMessageNoticeMapper.selectByExample(memberMessageNoticeExample); // 查询所有消息通知列表
        
        int total = memberMessageNoticeMapper.countByExample(memberMessageNoticeExample); // 查询总页数
        returnResult.setRows(memberMessageNotices);
        returnResult.setTotal(total);
        returnResult.setP(p);
        return returnResult;// 返回ExtGrid表
    }
    
    /**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有消息通知信息) 
     * @param @param pager
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(MemberMessageNoticeQueryDTO memberMessageNoticeQueryDTO,JqPager pager) {
        
        JqGridReturn returnResult = new JqGridReturn();
        MemberMessageNoticeExample memberMessageNoticeExample = new MemberMessageNoticeExample();;
        
        Criteria queryCriteria = memberMessageNoticeExample.createCriteria();
        memberMessageNoticeQueryDTO.setQueryCondition(queryCriteria);

        if (null != pager.getPage() && null != pager.getRows()) {// 设置排序信息
        	memberMessageNoticeExample.setLimitStart((pager.getPage() - 1) * pager.getRows());
        	memberMessageNoticeExample.setLimitEnd(pager.getRows());
        }
        if (StringUtils.isNotBlank(pager.getSort()) && StringUtils.isNotBlank(pager.getOrder())) {// 设置排序信息
        	memberMessageNoticeExample.setOrderByClause(pager.getOrderBy("temp_member_message_notice_"));
        }
        List<MemberMessageNotice>  memberMessageNotices = memberMessageNoticeMapper.selectByExample(memberMessageNoticeExample); // 查询所有消息通知列表
        int total = memberMessageNoticeMapper.countByExample(memberMessageNoticeExample); // 查询总页数
        returnResult.setRows(memberMessageNotices);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }
    
    /**
     * @Title: editMemberMessageNotice 
     * @Description: TODO(修改消息通知) 
     * @param @param memberMessageNotice
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    public Object editMessageNoticeWebsit(MemberMessageNotice memberMessageNotice) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
       /* Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        memberMessageNotice.setUpdater(pricipalUser.getUserId());*/
        memberMessageNotice.setUpdateTime(new Date());
        count = memberMessageNoticeMapper.updateByPrimaryKeySelective(memberMessageNotice);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + memberMessageNotice.getTitle() + "] 消息通知信息已修改");
        } else {
            returnResult.setMsg("发生未知错误，消息通知信息修改失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: addMemberMessageNotice 
     * @Description: TODO(新增消息通知) 
     * @param @param memberMessageNotice
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "MessageNoticList_add")
    public Object addMemberMessageNotice(MemberMessageNotice memberMessageNotice) {
    	
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal(); 
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        memberMessageNotice.setMessageNoticeId(RandomGUID.getRandomGUID());
        memberMessageNotice.setSender(pricipalUser.getUserId());
        memberMessageNotice.setSendtime(new Date());
        memberMessageNotice.setLetterstatus("unread");
        memberMessageNotice.setLettertype("system");
        memberMessageNotice.setCreater(pricipalUser.getUserId());
        memberMessageNotice.setCreateTime(new Date());
        memberMessageNotice.setUpdater(pricipalUser.getUserId());
        memberMessageNotice.setUpdateTime(new Date());
        count = memberMessageNoticeMapper.insert(memberMessageNotice);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + memberMessageNotice.getTitle() + "] 消息通知信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，消息通知信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: editMemberMessageNotice 
     * @Description: TODO(修改消息通知) 
     * @param @param memberMessageNotice
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "MessageNoticList_edit")
    public Object editMemberMessageNotice(MemberMessageNotice memberMessageNotice) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        memberMessageNotice.setUpdater(pricipalUser.getUserId());
        memberMessageNotice.setUpdateTime(new Date());
        count = memberMessageNoticeMapper.updateByPrimaryKeySelective(memberMessageNotice);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + memberMessageNotice.getTitle() + "] 消息通知信息已修改");
        } else {
            returnResult.setMsg("发生未知错误，消息通知信息修改失败");
        }
        return returnResult;
    }
    
   /**
     * @Title: delMemberMessageNotice 
     * @Description: TODO(删除消息通知) 
     * @param @param messageNoticeIds
     * @param @param annThemes
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "MessageNoticList_del")
    public Object delMemberMessageNotice(List<String> messageNoticeIds, List<String> titles) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        if (messageNoticeIds.size() > 0) {
        	MemberMessageNoticeExample memberMessageNoticeExample = new MemberMessageNoticeExample();
        	memberMessageNoticeExample.createCriteria().andMessageNoticeIdIn(messageNoticeIds);
            count = memberMessageNoticeMapper.deleteByExample(memberMessageNoticeExample);
            if (count > 0) {
                returnResult.setSuccess(true);
                returnResult.setMsg("成功删除了[ " + CollectionsUtil.convertToString(titles, ",") + " ]操作");
            } else {
                returnResult.setMsg("发生未知错误，消息通知信息删除失败");
            }
        }
        return returnResult;
    }
    
    /**
     * @Title: delMemberMessageNotice 
     * @Description: TODO(删除消息通知) 
     * @param @param messageNoticeIds
     * @param @param annThemes
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    public Object delMessageNoticeWebsit(List<String> messageNoticeIds) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        if (messageNoticeIds.size() > 0) {
        	MemberMessageNoticeExample memberMessageNoticeExample = new MemberMessageNoticeExample();
        	memberMessageNoticeExample.createCriteria().andMessageNoticeIdIn(messageNoticeIds);
            count = memberMessageNoticeMapper.deleteByExample(memberMessageNoticeExample);
            if (count > 0) {
                returnResult.setSuccess(true);
                returnResult.setMsg("成功删除");
            } else {
                returnResult.setMsg("发生未知错误，消息通知信息删除失败");
            }
        }
        return returnResult;
    }
}
