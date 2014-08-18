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
import com.glacier.frame.dao.basicdatas.ParameterCreditTypeMapper;
import com.glacier.frame.dao.system.UserMapper;
import com.glacier.frame.entity.basicdatas.ParameterCreditType;
import com.glacier.frame.entity.basicdatas.ParameterCreditTypeExample;
import com.glacier.frame.entity.system.User;
import com.glacier.frame.util.MethodLog;

/**
 * @ClassName: ParameterCreditTypeService 
 * @Description: TODO(信用积分类型service) 
 * @author yuzexu
 * @email 804346249@QQ.com
 * @date 2014-3-26下午2:11:05
 */
@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class ParameterCreditTypeService {

	@Autowired
    private ParameterCreditTypeMapper creditTypeMapper;
	
	@Autowired
    private UserMapper userMapper;

	/**
	 * @Title: getCreditType 
	 * @Description: TODO(通过creditTypeId获取信用积分类型信息) 
	 * @param  @param creditTypeId
	 * @param  @return设定文件
	 * @return Object  返回类型
	 * @throws 
	 *
	 */
    public Object getCreditType(String creditTypeId) {
        return creditTypeMapper.selectByPrimaryKey(creditTypeId);
    }
    
    /**
     * @Title: listAsGrid 
     * @Description: TODO(以表格结构展示信用积分类型列表) 
     * @param @param pager
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(JqPager pager) {
        JqGridReturn returnResult = new JqGridReturn();
        ParameterCreditTypeExample parameterCreditTypeExample = new ParameterCreditTypeExample();
        if (null != pager.getPage() && null != pager.getRows()) {// 设置排序信息
        	parameterCreditTypeExample.setLimitStart((pager.getPage() - 1) * pager.getRows());
        	parameterCreditTypeExample.setLimitEnd(pager.getRows());
        }
        if (StringUtils.isNotBlank(pager.getSort()) && StringUtils.isNotBlank(pager.getOrder())) {// 设置排序信息
        	parameterCreditTypeExample.setOrderByClause(pager.getOrderBy("temp_parameter_credit_type_"));
        }
        List<ParameterCreditType>  parameterCreditTypes = creditTypeMapper.selectByExample(parameterCreditTypeExample); // 查询所有信用积分类型列表
        int total = creditTypeMapper.countByExample(parameterCreditTypeExample); // 查询总页数
        returnResult.setRows(parameterCreditTypes);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }

    /**
     * @Title: addCreditType 
     * @Description: TODO(增加信用积分类型) 
     * @param @param parameterCreditType
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "CreditTypeList_add")
    public Object addCreditType(ParameterCreditType parameterCreditType) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ParameterCreditTypeExample parameterCreditTypeExample = new ParameterCreditTypeExample();
        int count = 0;
        // 防止信用积分类型名称重复
        parameterCreditTypeExample.createCriteria().andCreditTypeEqualTo(parameterCreditType.getCreditType());
        count = creditTypeMapper.countByExample(parameterCreditTypeExample);// 查找相同名称的信用积分类型数量
        if (count > 0) {
            returnResult.setMsg("信用积分类型重复");
            return returnResult;
        }
        parameterCreditType.setCreditTypeId(RandomGUID.getRandomGUID());
        parameterCreditType.setCreater(pricipalUser.getUserId());
        parameterCreditType.setCreateTime(new Date());
        parameterCreditType.setUpdater(pricipalUser.getUserId());
        parameterCreditType.setUpdateTime(new Date());
        count = creditTypeMapper.insert(parameterCreditType);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + parameterCreditType.getCreditType() + "] 信用积分类型信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，信用积分类型信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: editCreditType 
     * @Description: TODO(修改信用积分类型) 
     * @param @param parameterCreditType
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "CreditTypeList_edit")
    public Object editCreditType(ParameterCreditType parameterCreditType) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ParameterCreditTypeExample parameterCreditTypeExample = new ParameterCreditTypeExample();
        int count = 0;
        // 防止信用积分类型名称重复
        parameterCreditTypeExample.createCriteria().andCreditTypeIdNotEqualTo(parameterCreditType.getCreditTypeId()).andCreditTypeEqualTo(parameterCreditType.getCreditType());
        count = creditTypeMapper.countByExample(parameterCreditTypeExample);// 查找相同名称的信用积分类型数量
        if (count > 0) {
            returnResult.setMsg("信用积分类型名称重复");
            return returnResult;
        }
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        parameterCreditType.setUpdater(pricipalUser.getUserId());
        parameterCreditType.setUpdateTime(new Date());
        count = creditTypeMapper.updateByPrimaryKeySelective(parameterCreditType);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + parameterCreditType.getCreditType() + "] 信用积分类型信息已变更");
        } else {
            returnResult.setMsg("发生未知错误，信用积分类型信息修改失败");
        }
        return returnResult;
    }

    /**
     * @Title: delCreditTypes 
     * @Description: TODO(删除信用积分类型) 
     * @param @param creditTypeIds 信用积分类型Id
     * @param @param creditTypes 信用积分类型名字
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "CreditTypeList_del")
    public Object delCreditTypes(List<String> creditTypeIds, List<String> creditTypes) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        if (creditTypeIds.size() > 0) {
        	ParameterCreditTypeExample parameterCreditTypeExample = new ParameterCreditTypeExample();
        	parameterCreditTypeExample.createCriteria().andCreditTypeIdIn(creditTypeIds);
            count = creditTypeMapper.deleteByExample(parameterCreditTypeExample);
            if (count > 0) {
                returnResult.setSuccess(true);
                returnResult.setMsg("成功删除了[ " + CollectionsUtil.convertToString(creditTypes, ",") + " ]信用积分类型");
            } else {
                returnResult.setMsg("发生未知错误，信用积分类型信息删除失败");
            }
        }
        return returnResult;
    }
}
