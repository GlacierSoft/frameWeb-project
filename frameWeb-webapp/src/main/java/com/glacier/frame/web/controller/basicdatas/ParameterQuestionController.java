package com.glacier.frame.web.controller.basicdatas;

import java.util.List;
import javax.validation.Valid;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.glacier.core.controller.AbstractController;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.frame.entity.basicdatas.ParameterQuestion;
import com.glacier.frame.service.basicdatas.ParameterQuestionService;

/**
 *  
 * @ClassName: ParameterQuestionController 
 * @Description: TODO(密保问题的控制类) 
 * @author yuzexu
 * @email 804346249@QQ.com
 * @date 2014-1-22上午9:33:19
 */
@Controller()
@RequestMapping(value="/question")
public class ParameterQuestionController extends AbstractController{

	@Autowired
	private ParameterQuestionService parameterQuestionService;// 注入密保问题业务Bean
	
    // 进入密保问题业务列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPage() {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/question_mgr/question");
        return mav;
    }
    
    // 进入密保问题Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoCreditFormPage(String questionId) {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/question_mgr/question_form");
        if(StringUtils.isNotBlank(questionId)){
            mav.addObject("questionData", parameterQuestionService.getQuestion(questionId));
        }
        return mav;
    }
    
    // 进入密保问题Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoCreditDetailPage(String questionId) {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/question_mgr/question_detail");
        if(StringUtils.isNotBlank(questionId)){
            mav.addObject("questionData", parameterQuestionService.getQuestion(questionId));
        }
        return mav;
    }
    
    // 获取表格结构的所有密保问题数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listCreditAsGridByMenuId(String menuId, JqPager pager) {
        return parameterQuestionService.listAsGrid(pager);
    }
    // 增加密保问题
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addCredit(@Valid ParameterQuestion parameterQuestion, BindingResult bindingResult) {	
    	if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
    	}
        return parameterQuestionService.addParameterQuestion(parameterQuestion);
    }
    
    // 修改密保问题
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editCredit(@Valid ParameterQuestion parameterQuestion, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return parameterQuestionService.editParameterQuestion(parameterQuestion);
    }
    
    // 删除密保问题
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    private Object delCredit(@RequestParam List<String> questionIds,@RequestParam List<String> questionDess) {
        return parameterQuestionService.delQuestion(questionIds, questionDess);
    }
}
