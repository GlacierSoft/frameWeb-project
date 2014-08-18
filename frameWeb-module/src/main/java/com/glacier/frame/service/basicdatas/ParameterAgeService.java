/*
 * @(#)ParameterAgeService.java
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
import com.glacier.frame.dao.basicdatas.ParameterAgeMapper;
import com.glacier.frame.dao.system.UserMapper;
import com.glacier.frame.entity.basicdatas.ParameterAge;
import com.glacier.frame.entity.basicdatas.ParameterAgeExample;
import com.glacier.frame.entity.system.User;
import com.glacier.frame.util.MethodLog;

/** 
 * @ClassName: ParameterAgeService 
 * @Description: TODO(会员年龄别称业务类) 
 * @author xichao.dong
 * @email 406592176@QQ.com
 * @date 2014-1-21 下午2:22:22  
 */
@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class ParameterAgeService {

	@Autowired
    private ParameterAgeMapper ageMapper;
	
	@Autowired
    private UserMapper userMapper;

	/**
	 * @Title: getAge 
	 * @Description: TODO(根据会员年龄别称Id获取会员年龄别称信息) 
	 * @param @param ageId 会员年龄别称Id
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public Object getAge(String ageId) {
        return ageMapper.selectByPrimaryKey(ageId);
    }
    
    /**
     * @Title: listAsGrid 
     * @Description: TODO(以表格结构展示会员年龄别称列表) 
     * @param @param pager
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(JqPager pager) {
        JqGridReturn returnResult = new JqGridReturn();
        ParameterAgeExample parameterAgeExample = new ParameterAgeExample();
        if (null != pager.getPage() && null != pager.getRows()) {// 设置排序信息
        	parameterAgeExample.setLimitStart((pager.getPage() - 1) * pager.getRows());
        	parameterAgeExample.setLimitEnd(pager.getRows());
        }
        if (StringUtils.isNotBlank(pager.getSort()) && StringUtils.isNotBlank(pager.getOrder())) {// 设置排序信息
        	parameterAgeExample.setOrderByClause(pager.getOrderBy("temp_parameter_age_"));
        }
        List<ParameterAge>  parameterAges = ageMapper.selectByExample(parameterAgeExample); // 查询所有会员年龄别称列表
        int total = ageMapper.countByExample(parameterAgeExample); // 查询总页数
        returnResult.setRows(parameterAges);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }

    /**
     * @Title: addAge 
     * @Description: TODO(增加会员年龄别称) 
     * @param @param age
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "AgeList_add")
    public Object addAge(ParameterAge age) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ParameterAgeExample ageExample = new ParameterAgeExample();
        int count = 0;
        // 防止会员年龄别称名称重复
        ageExample.createCriteria().andAgeNameEqualTo(age.getAgeName());
        count = ageMapper.countByExample(ageExample);// 查找相同名称的会员年龄别称数量
        if (count > 0) {
            returnResult.setMsg("会员年龄别称重复");
            return returnResult;
        }
        if(age.getAgeEnd() <= age.getAgeBegin()){
        	 returnResult.setMsg("会员结束年龄必须大于开始年龄!");
             return returnResult;
        }
        age.setAgeId(RandomGUID.getRandomGUID());
        age.setCreater(pricipalUser.getUserId());
        age.setCreateTime(new Date());
        age.setUpdater(pricipalUser.getUserId());
        age.setUpdateTime(new Date());
        count = ageMapper.insert(age);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + age.getAgeName() + "] 会员年龄别称信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，会员年龄别称信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: editAge 
     * @Description: TODO(修改会员年龄别称) 
     * @param @param age
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "AgeList_edit")
    public Object editAge(ParameterAge age) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        // 防止会员年龄别称名称重复
        ParameterAgeExample ageExample = new ParameterAgeExample();
        ageExample.createCriteria().andAgeIdNotEqualTo(age.getAgeId()).andAgeNameEqualTo(age.getAgeName());
        count = ageMapper.countByExample(ageExample);// 查找相同名称的会员年龄别称数量
        if(age.getAgeEnd() <= age.getAgeBegin()){
       	 returnResult.setMsg("会员结束年龄必须大于开始年龄!");
            return returnResult;
       }
        if(age.getAgeBegin() >= age.getAgeEnd()){
        	returnResult.setMsg("开始年龄必须小于结束年龄!");
            return returnResult;
        }
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        age.setUpdater(pricipalUser.getUserId());
        age.setUpdateTime(new Date());
        count = ageMapper.updateByPrimaryKeySelective(age);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + age.getAgeName() + "] 会员年龄别称信息已变更");
        } else {
            returnResult.setMsg("发生未知错误，会员年龄别称信息修改失败");
        }
        return returnResult;
    }

    /**
     * @Title: delAges 
     * @Description: TODO(删除会员年龄别称) 
     * @param @param ageIds 会员年龄别称Id
     * @param @param ageNames 会员年龄别称名字
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "AgeList_del")
    public Object delAges(List<String> ageIds, List<String> ageNames) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        if (ageIds.size() > 0) {
        	ParameterAgeExample ageExample = new ParameterAgeExample();
        	ageExample.createCriteria().andAgeIdIn(ageIds);
            count = ageMapper.deleteByExample(ageExample);
            if (count > 0) {
                returnResult.setSuccess(true);
                returnResult.setMsg("成功删除了[ " + CollectionsUtil.convertToString(ageNames, ",") + " ]会员年龄别称");
            } else {
                returnResult.setMsg("发生未知错误，会员年龄别称信息删除失败");
            }
        }
        return returnResult;
    }
}
