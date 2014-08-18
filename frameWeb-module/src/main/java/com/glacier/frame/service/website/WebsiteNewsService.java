/*
 * @(#)WebsiteNewsService.java
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
import com.glacier.frame.dao.website.WebsiteNewsMapper;
import com.glacier.frame.entity.system.User;
import com.glacier.frame.entity.website.WebsiteNews;
import com.glacier.frame.entity.website.WebsiteNewsExample;
import com.glacier.frame.util.MethodLog;

/** 
 * @ClassName: WebsiteNewsService 
 * @Description: TODO(新闻业务类) 
 * @author xichao.dong
 * @email 406592176@QQ.com
 * @date 2014-1-21 下午2:22:22  
 */
@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class WebsiteNewsService {

	@Autowired
    private WebsiteNewsMapper newsMapper;

	@Autowired
    private UserMapper userMapper;
	
	/**
	 * @Title: getNews 
	 * @Description: TODO(根据新闻Id获取新闻信息) 
	 * @param @param webNewsId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public Object getNews(String webNewsId) {
    	WebsiteNews news = newsMapper.selectByPrimaryKey(webNewsId); 
        return news;
    }
    
    /**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有新闻信息) 
     * @param @param pnewsr
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(JqPager pager) {
        JqGridReturn returnResult = new JqGridReturn();
        WebsiteNewsExample websiteNewsExample = new WebsiteNewsExample();
        if (null != pager.getPage() && null != pager.getRows()) {// 设置排序信息
        	websiteNewsExample.setLimitStart((pager.getPage() - 1) * pager.getRows());
        	websiteNewsExample.setLimitEnd(pager.getRows());
        }
        if (StringUtils.isNotBlank(pager.getSort()) && StringUtils.isNotBlank(pager.getOrder())) {// 设置排序信息
        	websiteNewsExample.setOrderByClause(pager.getOrderBy("temp_website_news_"));
        }
        List<WebsiteNews>  websiteNewss = newsMapper.selectByExample(websiteNewsExample); // 查询所有新闻列表
        int total = newsMapper.countByExample(websiteNewsExample); // 查询总页数
        returnResult.setRows(websiteNewss);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }

    public Object listAsWebsite(JqPager pager, int p) {
    	JqGridReturn returnResult = new JqGridReturn();
        WebsiteNewsExample websiteNewsExample = new WebsiteNewsExample();
        websiteNewsExample.createCriteria().andWebNewsStatusEqualTo("enable");
        if (null != pager.getPage() && null != pager.getRows()) {// 设置排序信息
        	websiteNewsExample.setLimitStart((pager.getPage() - 1) * pager.getRows());
        	websiteNewsExample.setLimitEnd(pager.getRows());
        }
        pager.setSort("webNewsNum");// 定义排序字段
        pager.setOrder("DESC");// 升序还是降序
        if (StringUtils.isNotBlank(pager.getSort()) && StringUtils.isNotBlank(pager.getOrder())) {// 设置排序信息
        	websiteNewsExample.setOrderByClause(pager.getOrderBy("temp_website_news_"));
        }
        int startTemp = ((p-1)*10);//根据前台返回的页数进行设置
        websiteNewsExample.setLimitStart(startTemp);
        websiteNewsExample.setLimitEnd(10);
        List<WebsiteNews>  websiteNewss = newsMapper.selectByExample(websiteNewsExample); // 查询所有新闻列表
        int total = newsMapper.countByExample(websiteNewsExample); // 查询总页数
        returnResult.setRows(websiteNewss);
        returnResult.setTotal(total);
        returnResult.setP(p);
        return returnResult;// 返回ExtGrid表
    }

    /**
     * @Title: addNews 
     * @Description: TODO(新增新闻) 
     * @param @param news
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "NewsList_add")
    public Object addNews(WebsiteNews news) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        WebsiteNewsExample newsExample = new WebsiteNewsExample();
        int count = 0;
        // 防止新闻主题重复
        newsExample.createCriteria().andWebNewsThemeEqualTo(news.getWebNewsTheme());
        count = newsMapper.countByExample(newsExample);// 查找相同主题的新闻数量
        if (count > 0) {
            returnResult.setMsg("新闻主题重复");
            return returnResult;
        }
        news.setWebNewsId(RandomGUID.getRandomGUID());
        news.setCreater(pricipalUser.getUserId());
        news.setCreateTime(new Date());
        news.setUpdater(pricipalUser.getUserId());
        news.setUpdateTime(new Date());
        count = newsMapper.insert(news);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + news.getWebNewsTheme() + "] 新闻信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，新闻信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: editNews 
     * @Description: TODO(修改新闻) 
     * @param @param news
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "NewsList_edit")
    public Object editNews(WebsiteNews news) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        WebsiteNewsExample newsExample = new WebsiteNewsExample();
        int count = 0;
        // 防止新闻主题重复
        newsExample.createCriteria().andWebNewsIdNotEqualTo(news.getWebNewsId()).andWebNewsThemeEqualTo(news.getWebNewsTheme());
        count = newsMapper.countByExample(newsExample);// 查找相同主题的新闻数量
        if (count > 0) {
            returnResult.setMsg("新闻主题重复");
            return returnResult;
        }
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        news.setUpdater(pricipalUser.getUserId());
        news.setUpdateTime(new Date());
        count = newsMapper.updateByPrimaryKeySelective(news);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + news.getWebNewsTheme() + "] 新闻信息已修改");
        } else {
            returnResult.setMsg("发生未知错误，新闻信息修改失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: delNews 
     * @Description: TODO(删除新闻) 
     * @param @param newsId
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "NewsList_del")
    public Object delNews(List<String> webNewsIds, List<String> webNewsThemes) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        if (webNewsIds.size() > 0) {
        	WebsiteNewsExample newsExample = new WebsiteNewsExample();
        	newsExample.createCriteria().andWebNewsIdIn(webNewsIds);
            count = newsMapper.deleteByExample(newsExample);
            if (count > 0) {
                returnResult.setSuccess(true);
                returnResult.setMsg("成功删除了[ " + CollectionsUtil.convertToString(webNewsThemes, ",") + " ]新闻");
            } else {
                returnResult.setMsg("发生未知错误，新闻信息删除失败");
            }
        }
        return returnResult;
    }
}
