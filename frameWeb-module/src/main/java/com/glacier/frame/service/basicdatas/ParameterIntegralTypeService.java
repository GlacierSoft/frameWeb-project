/*
 * @(#)ParameterCreditTypeService.java
 * @author xichao.dong
 * Copyright (c) 2013 Glacier SoftWare Company Limited. All Rights Reserved.
 */
package com.glacier.frame.service.basicdatas;

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
import com.glacier.frame.dao.basicdatas.ParameterIntegralTypeMapper;
import com.glacier.frame.dao.system.UserMapper;
import com.glacier.frame.entity.basicdatas.ParameterIntegralType;
import com.glacier.frame.entity.basicdatas.ParameterIntegralTypeExample;
import com.glacier.frame.entity.system.User;
import com.glacier.frame.util.MethodLog;

/**
 * @ClassName: ParameterIntegralTypeService 
 * @Description: TODO(积分类型service) 
 * @author yuzexu
 * @email 804346249@QQ.com
 * @date 2014-3-26下午2:11:05
 */
@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class ParameterIntegralTypeService {

	@Autowired
    private ParameterIntegralTypeMapper integralTypeMapper;
	
	@Autowired
    private UserMapper userMapper;

	/**
	 * @Title: getCreditType 
	 * @Description: TODO(通过integarlTypeId获取积分类型信息) 
	 * @param  @param creditTypeId
	 * @param  @return设定文件
	 * @return Object  返回类型
	 * @throws 
	 */
    public Object getCreditType(String integralTypeId) {
        return integralTypeMapper.selectByPrimaryKey(integralTypeId);
    }
    
    /**
     * @Title: listAsGrid 
     * @Description: TODO(以表格结构展示积分类型列表) 
     * @param @param pager
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(JqPager pager) {
        JqGridReturn returnResult = new JqGridReturn();
        ParameterIntegralTypeExample parameterIntegralTypeExample = new ParameterIntegralTypeExample();
        if (null != pager.getPage() && null != pager.getRows()) {// 设置排序信息
        	parameterIntegralTypeExample.setLimitStart((pager.getPage() - 1) * pager.getRows());
        	parameterIntegralTypeExample.setLimitEnd(pager.getRows());
        }
        if (StringUtils.isNotBlank(pager.getSort()) && StringUtils.isNotBlank(pager.getOrder())) {// 设置排序信息
        	parameterIntegralTypeExample.setOrderByClause(pager.getOrderBy("temp_parameter_integral_type_"));
        }
        List<ParameterIntegralType>  parameterIntegralTypes = integralTypeMapper.selectByExample(parameterIntegralTypeExample); // 查询所有积分类型列表
        int total = integralTypeMapper.countByExample(parameterIntegralTypeExample); // 查询总页数
        returnResult.setRows(parameterIntegralTypes);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }

    /**
     * @Title: addCreditType 
     * @Description: TODO(增加积分类型) 
     * @param @param parameterCreditType
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "CreditTypeList_add")
    public Object addCreditType(ParameterIntegralType parameterIntegralType) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ParameterIntegralTypeExample parameterIntegralTypeExample = new ParameterIntegralTypeExample();
        int count = 0;
        // 防止积分类型名称重复
        parameterIntegralTypeExample.createCriteria().andIntegralTypeEqualTo(parameterIntegralType.getIntegralType());
        count = integralTypeMapper.countByExample(parameterIntegralTypeExample);// 查找相同名称的积分类型数量
        if (count > 0) {
            returnResult.setMsg("积分类型重复");
            return returnResult;
        }
        parameterIntegralType.setIntegralTypeId(RandomGUID.getRandomGUID());
        parameterIntegralType.setCreater(pricipalUser.getUserId());
        parameterIntegralType.setCreateTime(new Date());
        parameterIntegralType.setUpdater(pricipalUser.getUserId());
        parameterIntegralType.setUpdateTime(new Date());
        count = integralTypeMapper.insert(parameterIntegralType);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + parameterIntegralType.getIntegralType() + "] 积分类型信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，积分类型信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: editCreditType 
     * @Description: TODO(修改积分类型) 
     * @param @param parameterCreditType
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "CreditTypeList_edit")
    public Object editCreditType(ParameterIntegralType parameterIntegralType) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ParameterIntegralTypeExample parameterIntegralTypeExample = new ParameterIntegralTypeExample();
        int count = 0;
        // 防止积分类型名称重复
        parameterIntegralTypeExample.createCriteria().andIntegralTypeIdNotEqualTo(parameterIntegralType.getIntegralType()).andIntegralTypeEqualTo(parameterIntegralType.getIntegralType()).andIntegralTypeIdNotEqualTo(parameterIntegralType.getIntegralTypeId());
        count = integralTypeMapper.countByExample(parameterIntegralTypeExample);// 查找相同名称的积分类型数量
        if (count > 0) {
            returnResult.setMsg("积分类型名称重复");
            return returnResult;
        }
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        parameterIntegralType.setUpdater(pricipalUser.getUserId());
        parameterIntegralType.setUpdateTime(new Date());
        count = integralTypeMapper.updateByPrimaryKeySelective(parameterIntegralType);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + parameterIntegralType.getIntegralType() + "] 积分类型信息已变更");
        } else {
            returnResult.setMsg("发生未知错误，积分类型信息修改失败");
        }
        return returnResult;
    }

    /**
     * @Title: delCreditTypes 
     * @Description: TODO(删除积分类型) 
     * @param @param creditTypeIds 积分类型Id
     * @param @param creditTypes 积分类型名字
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "CreditTypeList_del")
    public Object delCreditTypes(List<String> integralTypeIds, List<String> integralTypes) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        if (integralTypeIds.size() > 0) {
        	ParameterIntegralTypeExample parameterIntegralTypeExample = new ParameterIntegralTypeExample();
        	parameterIntegralTypeExample.createCriteria().andIntegralTypeIdIn(integralTypeIds);
            count = integralTypeMapper.deleteByExample(parameterIntegralTypeExample);
            if (count > 0) {
                returnResult.setSuccess(true);
                returnResult.setMsg("成功删除了[ " + CollectionsUtil.convertToString(integralTypes, ",") + " ]积分类型");
            } else {
                returnResult.setMsg("发生未知错误，积分类型信息删除失败");
            }
        }
        return returnResult;
    }
}
