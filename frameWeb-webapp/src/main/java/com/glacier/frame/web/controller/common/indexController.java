/**
 * @Title: CommonController.java 
 * @Package com.glacier.frame.web.controller 
 * @author zhenfei.zhang   
 * @email 289556866@qq.com
 * @date 2014-1-16 上午10:50:38 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2014-1-16
				修改人：zhenfei.zhang 
				修改内容简介 ：
			</p>              
 * @Review (审核人) ：zhenfei.zhang
 * 
 */
package com.glacier.frame.web.controller.common;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @ClassName: CommonController
 * @Description: TODO(公用控制器)
 * @author zhenfei.zhang
 * @email 289556866@qq.com
 * @date 2014-1-16 上午10:50:38
 */
@Controller
@RequestMapping(value="/index")
public class indexController {
    
//    @Autowired
//    private BorrowingLoanService borrowingLoanService;
//    
//    @Autowired
//    private MemberAuthService memberAuthService;
//    
//    @Autowired
//    private FinanceRechargeService financeRechargeService;
//    
//    @Autowired
//    private FinanceWithdrawService financeWithdrawService;
//    
//    @Autowired
//    private FinanceBankCardService financeBankCardService;
//    
//    @Autowired
//    private MemberApplyAmountService memberApplyAmountService;
//    
//    @Autowired
//    private MemberEstateService memberEstateService;
    
    @RequestMapping(value = "/center", method = RequestMethod.GET)
    public Object intoIndex() {
        
        ModelAndView mav = new ModelAndView("layout/center");
//        //借款管理
//        mav.addObject("borrowingLoanNumFirstAudit", borrowingLoanService.getBorrowingLoanNumByLoanState("firstAudit"));//查询初审中的借款记录条数
//        mav.addObject("borrowingLoanNumSecondAuditor", borrowingLoanService.getBorrowingLoanNumByLoanState("secondAuditor"));//查询复审中的借款记录条数
//        
//        //资金管理
//        mav.addObject("financeRechargeNumAuthstr", financeRechargeService.getFinanceRechargeNumByAuditState("Authstr"));//查询审核中的会员充值记录条数
//        mav.addObject("financeWithdrawNumAuthstr", financeWithdrawService.getFinanceWithdrawNumByAuditState("Authstr"));//查询审核中的会员提现记录条数
//        mav.addObject("bankCardNumAuthstr", financeBankCardService.getBankCardNumByBankCardAuths("authstr"));//查询审核中的会员银行卡记录条数
//        mav.addObject("applyAmountNumAuthstr", memberApplyAmountService.getApplyAmountNumByAuditState("Authstr"));//查询审核中的会员额度申请记录条数
//        mav.addObject("memberEstateNumAuthstr", memberEstateService.getEstateNumByAuditState("Authstr"));//查询审核中的会员房产信息记录条数
//        
//        //认证管理
//        mav.addObject("infoAuthNum", memberAuthService.getInfoAuthNumByInfoAuth("authstr"));//查询会员审核中的基本资料认证记录条数
//        mav.addObject("vipAuthNum", memberAuthService.getVipAuthNumByVipAuth("authstr"));//查询会员审核中的Vip认证记录条数
//        mav.addObject("emailAuthNum", memberAuthService.getEmailAuthNumByEmailAuth("authstr"));//查询会员审核中的邮箱认证记录条数
//        mav.addObject("mobileAuthNum", memberAuthService.getMobileAuthNumByMobileAuth("authstr"));//查询会员审核中的电话认证记录条数
//        mav.addObject("creditAuthNum", memberAuthService.getCreditAuthNumByCreditAuth("authstr"));//查询会员审核中的信用认证记录条数
//        mav.addObject("companyAuthNum", memberAuthService.getCompanyAuthNumByCompanyAuth("authstr"));//查询会员审核中的企业认证记录条数
//        mav.addObject("realNameAuthNum", memberAuthService.getRealNameAuthNumByRealNameAuth("authstr"));//查询会员审核中的真实姓名认证记录条数
//        mav.addObject("idCardAuthNum", memberAuthService.getIdCardAuthNumByIdCardAuth("authstr"));//查询会员审核中的身份证认证记录条数
//        mav.addObject("workAuthNum", memberAuthService.getWorkAuthNumByWorkAuth("authstr"));//查询会员审核中的工作认证记录条数
        return mav;
    }
}
