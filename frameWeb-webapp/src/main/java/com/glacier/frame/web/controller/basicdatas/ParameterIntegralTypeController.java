/*
 * @(#)ParameterCreditTypeController.java
 * @author xichao.dong
 * Copyright (c) 2013 Glacier SoftWare Company Limited. All Rights Reserved.
 */
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
import com.glacier.frame.entity.basicdatas.ParameterIntegralType; 
import com.glacier.frame.service.basicdatas.ParameterIntegralTypeService;

/**
 * @ClassName: ParameterIntegralTypeController 
 * @Description: TODO(积分类型控制层) 
 * @author yuzexu
 * @email 804346249@QQ.com
 * @date 2014-3-26下午2:34:48
 */
@Controller
@RequestMapping(value = "/integralType")
public class ParameterIntegralTypeController extends AbstractController{

    @Autowired
    private ParameterIntegralTypeService integralTypeService;// 注入积分类型业务Bean
    
    // 进入积分类型列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPcreditType() {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/integralType_mgr/integralType");
        return mav;
    }
    
    // 进入积分类型Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoCreditTypeFormPcreditType(String integralTypeId) {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/integralType_mgr/integralType_form");
        if(StringUtils.isNotBlank(integralTypeId)){
            mav.addObject("creditTypeData", integralTypeService.getCreditType(integralTypeId));
        }
        return mav;
    }
    
    // 进入积分类型Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoCreditTypeDetailPage(String integralTypeId) {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/integralType_mgr/integralType_detail");
        if(StringUtils.isNotBlank(integralTypeId)){
            mav.addObject("creditTypeData", integralTypeService.getCreditType(integralTypeId));
        }
        return mav;
    }
    
    // 获取表格结构的所有菜单数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listActionAsGridByMenuId(JqPager pager) {
        return integralTypeService.listAsGrid(pager);
    }
    
    // 增加积分类型
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addCreditType(@Valid ParameterIntegralType parameterIntegralType, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return integralTypeService.addCreditType(parameterIntegralType);
    }
    
    // 修改积分类型
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editRole(@Valid ParameterIntegralType parameterIntegralType, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return integralTypeService.editCreditType(parameterIntegralType);
    }
    
    // 批量删除积分类型
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delCreditTypes(@RequestParam List<String> creditTypeIds,@RequestParam List<String> creditTypes) {
    	return integralTypeService.delCreditTypes(creditTypeIds, creditTypes);
    }
}
