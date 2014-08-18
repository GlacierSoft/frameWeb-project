package com.glacier.frame.web.controller.member;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.glacier.core.controller.AbstractController;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.frame.dto.query.member.MemberSecretQueryDTO;
import com.glacier.frame.service.member.MemberSecretSecurityService;
 
/*** 
 * @ClassName:  MemberSecretSecurityController
 * @Description: TODO(会员密保Controller)
 * @author songjundong
 * @email 985776597@QQ.com
 * @date 2014-8-18  下午5:06:56
 */
@Controller
@RequestMapping(value = "/secretSecurity")
public class MemberSecretSecurityController extends AbstractController{

    @Autowired
    private MemberSecretSecurityService secretSecurityService;// 注入会员密保业务Bean
    // 进入会员密保列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPsecretSecurity() {
        ModelAndView mav = new ModelAndView("member_mgr/secretSecurity_mgr/secretSecurity");
        return mav;
    }
    
    // 进入会员密保Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoSecretSecurityDetailPage(String secretSecurityId) {
        ModelAndView mav = new ModelAndView("member_mgr/secretSecurity_mgr/secretSecurity_detail");
        if(StringUtils.isNotBlank(secretSecurityId)){
            mav.addObject("secretSecurityData", secretSecurityService.getSecretSecurity(secretSecurityId));
        }
        return mav;
    }
    
    // 获取表格结构的所有会员密保数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listSecretSecurityAsGridByMenuId(JqPager secretSecurity,MemberSecretQueryDTO  memberSecretQueryDTO) {
        return secretSecurityService.listAsGrid(secretSecurity,memberSecretQueryDTO);
    }
    // 批量删除消息通知
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delSecretSecurity(@RequestParam List<String> secretSecurityIds,@RequestParam List<String> questionDess) {
    	return secretSecurityService.delSecretSecurity(secretSecurityIds, questionDess);
    }
   
}
