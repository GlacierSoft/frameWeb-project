/*
 * @(#)WebsiteAdvertisementService.java
 * @author xichao.dong
 * Copyright (c) 2013 Glacier SoftWare Company Limited. All Rights Reserved.
 */
package com.glacier.frame.service.website;

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
import com.glacier.frame.dao.system.UserMapper;
import com.glacier.frame.dao.website.WebsiteAdvertisementMapper;
import com.glacier.frame.entity.system.User;
import com.glacier.frame.entity.website.WebsiteAdvertisement;
import com.glacier.frame.entity.website.WebsiteAdvertisementExample;
import com.glacier.frame.util.MethodLog;

/** 
 * @ClassName: WebsiteAdvertisementService 
 * @Description: TODO(广告业务类) 
 * @author xichao.dong
 * @email 406592176@QQ.com
 * @date 2014-1-21 下午2:22:22  
 */
@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class WebsiteAdvertisementService {

	@Autowired
    private WebsiteAdvertisementMapper advertisementMapper;

	@Autowired
    private UserMapper userMapper;
	
	/**
	 * @Title: getAdvertisement 
	 * @Description: TODO(根据广告Id获取广告信息) 
	 * @param @param webAdvId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    @Transactional(readOnly = false)
    public Object getAdvertisement(String webAdvId) {
    	WebsiteAdvertisement websiteAdvertisement = advertisementMapper.selectByPrimaryKey(webAdvId);
    	websiteAdvertisement.setClicks(websiteAdvertisement.getClicks()+1);
    	return websiteAdvertisement;
    }
    
    /**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有广告信息) 
     * @param @param padvertisementr
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(JqPager padvertisementr) {
        JqGridReturn returnResult = new JqGridReturn();
        WebsiteAdvertisementExample websiteAdvertisementExample = new WebsiteAdvertisementExample();
        if (null != padvertisementr.getPage() && null != padvertisementr.getRows()) {// 设置排序信息
        	websiteAdvertisementExample.setLimitStart((padvertisementr.getPage() - 1) * padvertisementr.getRows());
        	websiteAdvertisementExample.setLimitEnd(padvertisementr.getRows());
        }
        if (StringUtils.isNotBlank(padvertisementr.getSort()) && StringUtils.isNotBlank(padvertisementr.getOrder())) {// 设置排序信息
        	websiteAdvertisementExample.setOrderByClause(padvertisementr.getOrderBy("temp_website_advertisement_"));
        }
        List<WebsiteAdvertisement>  websiteAdvertisements = advertisementMapper.selectByExample(websiteAdvertisementExample); // 查询所有广告列表
        int total = advertisementMapper.countByExample(websiteAdvertisementExample); // 查询总页数
        returnResult.setRows(websiteAdvertisements);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }

    /**
     * @Title: addAdvertisement 
     * @Description: TODO(新增广告) 
     * @param @param advertisement
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "AdvertisementList_add")
    public Object addAdvertisement(WebsiteAdvertisement advertisement) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        WebsiteAdvertisementExample advertisementExample = new WebsiteAdvertisementExample();
        int count = 0;
        // 防止广告主题重复
        advertisementExample.createCriteria().andWebAdvThemeEqualTo(advertisement.getWebAdvTheme());
        count = advertisementMapper.countByExample(advertisementExample);// 查找相同主题的广告数量
        if (count > 0) {
            returnResult.setMsg("广告主题重复");
            return returnResult;
        }
        advertisement.setWebAdvId(RandomGUID.getRandomGUID());
        advertisement.setClicks(0);
        advertisement.setCreater(pricipalUser.getUserId());
        advertisement.setCreateTime(new Date());
        advertisement.setUpdater(pricipalUser.getUserId());
        advertisement.setUpdateTime(new Date());
        count = advertisementMapper.insert(advertisement);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + advertisement.getWebAdvTheme() + "] 广告信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，广告信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: editAdvertisement 
     * @Description: TODO(修改广告) 
     * @param @param advertisement
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "AdvertisementList_edit")
    public Object editAdvertisement(WebsiteAdvertisement advertisement) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        WebsiteAdvertisementExample advertisementExample = new WebsiteAdvertisementExample();
        int count = 0;
        // 防止广告主题重复
        advertisementExample.createCriteria().andWebAdvIdNotEqualTo(advertisement.getWebAdvId()).andWebAdvThemeEqualTo(advertisement.getWebAdvTheme());
        count = advertisementMapper.countByExample(advertisementExample);// 查找相同主题的广告数量
        if (count > 0) {
            returnResult.setMsg("广告主题重复");
            return returnResult;
        }
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        advertisement.setUpdater(pricipalUser.getUserId());
        advertisement.setUpdateTime(new Date());
        count = advertisementMapper.updateByPrimaryKeySelective(advertisement);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + advertisement.getWebAdvTheme() + "] 广告信息已修改");
        } else {
            returnResult.setMsg("发生未知错误，广告信息修改失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: delAdvertisement 
     * @Description: TODO(删除广告) 
     * @param @param webAdvIds
     * @param @param advThemes
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "AdvertisementList_del")
    public Object delAdvertisement(List<String> webAdvIds, List<String> webAdvThemes) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        if (webAdvIds.size() > 0) {
        	WebsiteAdvertisementExample advertisementExample = new WebsiteAdvertisementExample();
        	advertisementExample.createCriteria().andWebAdvIdIn(webAdvIds);
            count = advertisementMapper.deleteByExample(advertisementExample);
            if (count > 0) {
                returnResult.setSuccess(true);
                returnResult.setMsg("成功删除了[ " + CollectionsUtil.convertToString(webAdvThemes, ",") + " ]广告");
            } else {
                returnResult.setMsg("发生未知错误，广告信息删除失败");
            }
        }
        return returnResult;
    }
}
