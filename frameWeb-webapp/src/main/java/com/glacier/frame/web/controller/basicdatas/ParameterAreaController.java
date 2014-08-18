/*
 * @(#)ParameterareaController.java
 * @author xichao.dong
 * Copyright (c) 2013 Glacier SoftWare Company Limited. All Rights Reserved.
 */
package com.glacier.frame.web.controller.basicdatas;

import javax.validation.Valid;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.glacier.core.controller.AbstractController;
import com.glacier.frame.entity.basicdatas.ParameterArea;
import com.glacier.frame.service.basicdatas.ParameterAreaService;

/** 
 * @ClassName: ParameterareaController 
 * @Description: TODO(地区的控制器) 
 * @author xichao.dong
 * @email 406592176@QQ.com
 * @date 2014-1-21 下午2:39:20  
 */
@Controller
@RequestMapping(value = "/area")
public class ParameterAreaController extends AbstractController{

    @Autowired
    private ParameterAreaService areaService;// 注入地区业务Bean
    
    // 进入地区列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexParea() {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/area_mgr/area");
        return mav;
    }
    
    // 获取地区下的树结构的所有地区数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listAreaAsTreeByAreaId() {
        return areaService.listAsTree();
    }
    
    // 进入地区Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoareaFormParea(String areaId) {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/area_mgr/area_form");
        mav.addObject("allAreaTreeNodeData", areaService.getAllTreeAreaNode(true));
        if(StringUtils.isNotBlank(areaId)){
            mav.addObject("areaData", areaService.getArea(areaId));
        }
        return mav;
    }
    
    // 进入地区Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoAreaDetailPage(String areaId) {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/area_mgr/area_detail");
        if(StringUtils.isNotBlank(areaId)){
            mav.addObject("areaData", areaService.getArea(areaId));
        }
        return mav;
    }
    
    // 增加地区
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addarea(@Valid ParameterArea area, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return areaService.addArea(area);
    }
    
    // 修改地区
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editRole(@Valid ParameterArea area, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return areaService.editArea(area);
    }
    
    // 删除地区
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object del(String areaId) {
    	return areaService.delArea(areaId);
    }
}
