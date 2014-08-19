package com.glacier.frame.web.controller.member;


import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.glacier.core.controller.AbstractController;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.frame.dto.query.member.MemberSecretQueryDTO;
import com.glacier.frame.entity.member.MemberSecretSecurity;
import com.glacier.frame.service.basicdatas.ParameterQuestionService;
import com.glacier.frame.service.member.MemberSecretSecurityService;

/**
 * @ClassName: MemberSecretSecurityController 
 * @Description: TODO(前台密保管理的Controller) 
 * @author yuzexu
 * @email 804346249@QQ.com
 * @date 2014-4-16下午4:15:29
 */
@Controller
@RequestMapping(value = "/secretSecurity")
public class MemberSecretSecurityController extends AbstractController{

    @Autowired
    private MemberSecretSecurityService secretSecurityService;// 注入会员密保业务Bean
    
    @Autowired
    private ParameterQuestionService parameterQuestionService;
     
    // 获取表格结构的所有会员密保数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listSecretSecurityAsGridByMenuId(JqPager secretSecurity,MemberSecretQueryDTO  memberSecretQueryDTO) {
        return secretSecurityService.listAsGrid(secretSecurity,memberSecretQueryDTO);
    }
    /**
     * @Title: addSecretSecurityWebsite 
     * @Description: TODO(增加密保信息，如果有已存在的，先删除后添加) 
     * @param  @param memberId
     * @param  @param questions1
     * @param  @param questions2
     * @param  @param questions3
     * @param  @param answers1
     * @param  @param answers2
     * @param  @param answers3
     * @param  @return设定文件
     * @return Object  返回类型
     * @throws 
     *
     */
    @RequestMapping(value ="/addSecretSecurity.json")
    @ResponseBody
    private Object addSecretSecurityWebsite(String memberId,String questions1,String questions2,String questions3,String answers1,String answers2,String answers3){
    	//对于前台查询列表，设置pager的值
        JqPager pager = new JqPager();
        pager.setSort("createTime");// 定义排序字段
        pager.setOrder("DESC");// 升序还是降序
        JqGridReturn memberSecretSecuritysResult = (JqGridReturn) secretSecurityService.listAsGridWebsite(memberId, pager);
        @SuppressWarnings("unchecked")
		List<MemberSecretSecurity> memberSecretSecuritys = (List<MemberSecretSecurity>) memberSecretSecuritysResult.getRows();
        List<String> secretSecurityIds = new ArrayList<String>();
        boolean falg = false;
        if(memberSecretSecuritys.size() > 0){
        	for(MemberSecretSecurity memberSecretSecurity : memberSecretSecuritys){
            	secretSecurityIds.add(memberSecretSecurity.getSecretSecurityId());
            }
        	secretSecurityService.delSecretSecurityWebsit(secretSecurityIds);
        	falg = true;
        }
    	//插入三条密保信息
    	MemberSecretSecurity secretSecurity = new MemberSecretSecurity();
    	secretSecurity.setMemberId(memberId);
    	secretSecurity.setAnswer(answers1);
    	secretSecurity.setQuestionId(questions1);
    	secretSecurityService.addSecretSecurity(secretSecurity);
    	secretSecurity.setAnswer(answers2);
    	secretSecurity.setQuestionId(questions2);
    	secretSecurityService.addSecretSecurity(secretSecurity);
    	secretSecurity.setAnswer(answers3);
    	secretSecurity.setQuestionId(questions3);
    	JqReturnJson returnResult = (JqReturnJson)secretSecurityService.addSecretSecurity(secretSecurity);
    	if(falg){
    		returnResult.setMsg("修改密保成功");
    	}
    	return returnResult;
    }
    /**
     * @Title: compareSecretSecurity 
     * @Description: TODO(判断会员输入的密保问题答案是否正确) 
     * @param  @param memberId
     * @param  @param questionId1
     * @param  @param questionId2
     * @param  @param questionId3
     * @param  @param answers1
     * @param  @param answers2
     * @param  @param answers3
     * @param  @return设定文件
     * @return Object  返回类型
     * @throws 
     *
     */
    @RequestMapping(value = "/compareSecretSecurity.json")
    @ResponseBody
    private Object compareSecretSecurity(String memberId,String questionId1,String questionId2,String questionId3,String answers1,String answers2,String answers3){
    	JqReturnJson returnResult = new JqReturnJson();
    	int falg = 0;
    	List<String> msgs = new ArrayList<String>();
    	//对于前台查询列表，设置pager的值
        JqPager pager = new JqPager();
        pager.setSort("createTime");// 定义排序字段
        pager.setOrder("DESC");// 升序还是降序
        JqGridReturn memberSecretSecuritysResult = (JqGridReturn) secretSecurityService.listAsGridWebsite(memberId, pager);
    	@SuppressWarnings("unchecked")
		List<MemberSecretSecurity> memberSecretSecuritys = (List<MemberSecretSecurity>) memberSecretSecuritysResult.getRows();
    	for(MemberSecretSecurity memberSecretSecurity : memberSecretSecuritys){
    		if(memberSecretSecurity.getQuestionId().equals(questionId1.trim())){
    			if(memberSecretSecurity.getAnswer().equals(answers1.trim())){
    				
    			}else{
    				falg +=1;
    				msgs.add("问题一答案不正确.");
    			}
    		}
    		if(memberSecretSecurity.getQuestionId().equals(questionId2.trim())){
    			if(memberSecretSecurity.getAnswer().equals(answers2.trim())){
    				
    			}else{
    				falg +=1;
    				msgs.add("问题二答案不正确.");
    			}
    		}
    		if(memberSecretSecurity.getQuestionId().equals(questionId3.trim())){
    			if(memberSecretSecurity.getAnswer().equals(answers3.trim())){
    				
    			}else{
    				falg +=1;
    				msgs.add("问题三答案不正确.");
    			}
    		}
    	}
    	if(falg > 0){
    		returnResult.setSuccess(false);
    	}else if(falg == 0){
    		returnResult.setSuccess(true);
    	}
    	returnResult.setObj(msgs);
    	return returnResult;
    }
   
}
