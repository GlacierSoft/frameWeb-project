/*
 * @(#)ParameterAreaService.java
 * @author xichao.dong
 * Copyright (c) 2013 Glacier SoftWare Company Limited. All Rights Reserved.
 */
package com.glacier.frame.service.basicdatas;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.glacier.basic.util.JackJson;
import com.glacier.basic.util.RandomGUID;
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.jqueryui.util.Tree;
import com.glacier.frame.dao.basicdatas.ParameterAreaMapper;
import com.glacier.frame.dao.system.UserMapper;
import com.glacier.frame.entity.basicdatas.ParameterArea;
import com.glacier.frame.entity.basicdatas.ParameterAreaExample;
import com.glacier.frame.entity.system.User;
import com.glacier.frame.util.MethodLog;

/** 
 * @ClassName: ParameterAreaService 
 * @Description: TODO(地区业务类) 
 * @author xichao.dong
 * @email 406592176@QQ.com
 * @date 2014-1-21 下午2:22:22  
 */
@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class ParameterAreaService {

	@Autowired
    private ParameterAreaMapper areaMapper;
	
	@Autowired
    private UserMapper userMapper;
	
	/**
	 * @Title: getArea 
	 * @Description: TODO(根据地区Id获取地区信息) 
	 * @param @param areaId 地区Id
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public Object getArea(String areaId) {
        return areaMapper.selectByPrimaryKey(areaId);
    }

    /**
     * @Title: listAsTree 
     * @Description: TODO(获取地区下的树结构的所有地区数据) 
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsTree() {
        return areaMapper.selectByExample(new ParameterAreaExample());
    }
    
    /**
     * @Title: addArea 
     * @Description: TODO(新增地区) 
     * @param @param area
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "AreaTree_add")
    public Object addArea(ParameterArea area) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ParameterAreaExample areaExample = new ParameterAreaExample();
        int count = 0;
        // 防止地区名称重复
        areaExample.createCriteria().andAreaNameEqualTo(area.getAreaName());
        count = areaMapper.countByExample(areaExample);// 查找相同名称的地区数量
        if (count > 0) {
            returnResult.setMsg("地区名称重复");
            return returnResult;
        }
        area.setAreaId(RandomGUID.getRandomGUID());
        if (area.getAreaPid().equals("ROOT") || area.getAreaPid().equals("")) {// 如果父级地区的Id为"ROOT"或为空，则将父级地区的值设置为null保存到数据库
        	area.setAreaPid(null);
        }
        area.setCreater(pricipalUser.getUserId());
        area.setCreateTime(new Date());
        area.setUpdater(pricipalUser.getUserId());
        area.setUpdateTime(new Date());
        count = areaMapper.insert(area);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + area.getAreaName() + "] 地区信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，地区信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * 
     * @Title: getAllTreeAreaNode
     * @Description: TODO(获取全部的地区数据组装成EasyUI树节点JSON)
     * @param @param virtualRoot 是否构建虚拟ROOT -> 系统地区作为导航
     * @param @return 设定文件
     * @return String 返回类型
     * @throws
     */
    public String getAllTreeAreaNode(boolean virtualRoot) {
        List<Tree> items = new ArrayList<Tree>();
        if (virtualRoot) {
            Tree areaItem = new Tree();// 增加总的树节点作为地区导航
            areaItem.setId("ROOT");
            areaItem.setText("地区导航");
            items.add(areaItem);
        }
        ParameterAreaExample areaExample = new ParameterAreaExample();
        areaExample.setOrderByClause("temp_parameter_area.area_num asc");
        List<ParameterArea> areaList = areaMapper.selectByExample(areaExample);
        if (null != areaList && areaList.size() > 0) {
            for (ParameterArea area : areaList) {
                Tree item = new Tree();// 将查询到的地区记录某些属性值设置在ComboTreeItem中，用于页面的ComboTree的数据绑定
                item.setId(area.getAreaId());
                item.setText(area.getAreaName());
                if (StringUtils.isNotBlank(area.getAreaPid())) {
                    item.setPid(area.getAreaPid());
                } else if (virtualRoot) {
                    item.setPid("ROOT");// 如果父节点为空说明上一级为总节点
                }
                items.add(item);
            }
        }
        return JackJson.fromObjectToJson(items);
    }
    
    /**
     * @Title: editArea 
     * @Description: TODO(修改地区) 
     * @param @param area
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "AreaTree_edit")
    public Object editArea(ParameterArea area) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        List<String> retrunAreaList = new ArrayList<String>();// 修改上级所属地区时，禁止选择地区本身及子级地区作为地区的父级地区
        retrunAreaList = getAreaChild(area.getAreaId(), retrunAreaList);// 查找地区本身及子级地区
        retrunAreaList.add(area.getAreaId());
        if (retrunAreaList.contains(area.getAreaPid())) {// 如果用户是选择地区本身及子级地区作为地区的父级地区，则返回错误提示信息
        	returnResult.setMsg("禁止选择该地区本身以及子地区作为上级地区");
            return returnResult;
        }
        ParameterAreaExample areaExample = new ParameterAreaExample();
        int count = 0;
        // 防止地区名称重复
        areaExample.createCriteria().andAreaIdNotEqualTo(area.getAreaId()).andAreaNameEqualTo(area.getAreaName());
        count = areaMapper.countByExample(areaExample);// 查找相同名称的地区数量
        if (count > 0) {
            returnResult.setMsg("地区名称重复");
            return returnResult;
        }
        if (area.getAreaPid().equals("ROOT") || area.getAreaPid().equals("")) {// 如果父级地区的Id为"ROOT"或为空，则将父级地区的值设置为null保存到数据库
        	area.setAreaPid(null);
        }
        ParameterArea oldArea = areaMapper.selectByPrimaryKey(area.getAreaId()) ;
        area.setCreater(oldArea.getCreater());
        area.setCreateTime(oldArea.getCreateTime());
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        area.setUpdater(pricipalUser.getUserId());
        area.setUpdateTime(new Date());
        count = areaMapper.updateByPrimaryKey(area);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + area.getAreaName() + "] 地区信息已修改");
        } else {
            returnResult.setMsg("发生未知错误，地区信息修改失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: getAreaChild
     * @Description: TODO(递归获取地区和地区子节点)
     * @param @param areaId 要获取的当前地区
     * @param @param retrunAreaList 返回的所有地区信息
     * @param @return 设定文件
     * @return List<String> 返回类型
     * @throws
     */
    private List<String> getAreaChild(String areaId, List<String> retrunAreaList) {
    	ParameterAreaExample areaExample = new ParameterAreaExample();
    	areaExample.createCriteria().andAreaPidEqualTo(areaId);// 查询子地区
        List<ParameterArea> areaList = areaMapper.selectByExample(areaExample);
        if (areaList.size() > 0) {// 如果存在子地区则遍历
            for (ParameterArea area : areaList) {
                this.getAreaChild(area.getAreaId(), retrunAreaList);// 递归查询是否存在子地区
            }
        }
        retrunAreaList.add(areaId);
        return retrunAreaList;
    }
    
    /**
     * @Title: delArea 
     * @Description: TODO(删除地区) 
     * @param @param areaId
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "AreaTree_del")
    public Object delArea(String areaId) {
    	JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
    	if (StringUtils.isBlank(areaId)) {// 判断是否选择一条地区信息
            returnResult.setMsg("请选择一条地区信息，再进行删除");
            return returnResult;
        }
    	ParameterAreaExample parameterAreaExample = new ParameterAreaExample();
    	parameterAreaExample.createCriteria().andAreaPidEqualTo(areaId);
        if (areaMapper.countByExample(parameterAreaExample) > 0) {// 判断该地区是否存在子级地区，有则不能删除
            returnResult.setMsg("该地区存在子级地区，如需删除请先删除子地区");
        }else {
        	ParameterArea area= areaMapper.selectByPrimaryKey(areaId);
            int result = areaMapper.deleteByPrimaryKey(areaId);//根据地区Id，进行删除地区
            if (result == 1) {
                returnResult.setSuccess(true);
                returnResult.setMsg("[" + area.getAreaName() + "] 地区信息已删除");
            } else {
                returnResult.setMsg("发生未知错误，地区信息删除失败");
            }
        }
		return returnResult;
     }
}
