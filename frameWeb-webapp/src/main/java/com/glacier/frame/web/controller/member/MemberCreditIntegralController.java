package com.glacier.frame.web.controller.member;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.glacier.core.controller.AbstractController;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.frame.dto.query.member.MemberCreditIntegralQueryDTO;
import com.glacier.frame.service.member.MemberCreditIntegralService;
 
/*** 
 * @ClassName:  MemberCreditIntegralController
 * @Description: TODO(会员信用积分的控制器)
 * @author songjundong
 * @email 985776597@QQ.com
 * @date 2014-8-18  下午5:08:39
 */
@Controller
@RequestMapping(value = "/creditIntegral")
public class MemberCreditIntegralController extends AbstractController{

    @Autowired
    private MemberCreditIntegralService creditIntegralService;// 注入会员信用积分业务Bean
    
    // 进入会员信用积分列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexCreditIntegral() {
        ModelAndView mav = new ModelAndView("member_mgr/creditIntegral_mgr/creditIntegral");
        return mav;
    }
    
    // 进入会员申请额度Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoCreditIntegralDetailPage(String creditIntegralId) {
        ModelAndView mav = new ModelAndView("member_mgr/creditIntegral_mgr/creditIntegral_detail");
        if(StringUtils.isNotBlank(creditIntegralId)){
            mav.addObject("creditIntegralData", creditIntegralService.getCreditIntegral(creditIntegralId));
        }
        return mav;
    }
    
    // 获取表格结构的所有会员信用积分数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listCreditIntegralAsGridByMenuId(MemberCreditIntegralQueryDTO memberCreditIntegralQueryDTO,JqPager pcreditIntegralr) {
        return creditIntegralService.listAsGrid(memberCreditIntegralQueryDTO, pcreditIntegralr);
    }
    
}
