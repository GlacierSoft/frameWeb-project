<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%><!-- 引入jstl解析标签 -->
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %><!-- 引入自定义权限标签 -->
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html lang="zh-cn">
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>冰川网贷平台</title>
   	<!-- 引入公用的js和样式库 -->
	<jsp:include page="../inc.jsp"/>
	<style type="text/css">
		body {
		    padding-top: 100px;
		}
		ol, ul {
		    list-style: none outside none;
		    margin: 0;
    		padding: 0;
		}
	</style>
  </head>

  <body>
  <jsp:include page="../nav_mgr/navAbout.jsp"/>
       
	    <div class="container">
	  	<div class="row">
		    <div class="col-md-2">
			    <div class="panel-group" id="accordion">
			    	<div class="panel panel-default">
				  		<div class="bs-example">
					      <ul class="nav nav-pills nav-stacked" style="max-width: 300px;">
					        <li><a href="${ctx}/aboutUs.htm">公司简介</a></li>
					        <li><a href="${ctx}/announcement/announcement.htm?&p=1">网站公告</a></li>
						    <li><a href="${ctx}/news/news.htm?&p=1">网站新闻</a></li>
					        <li><a href="${ctx}/hiring/hiring.htm?&p=1">招纳贤士</a></li>
					        <li class="active"><a href="${ctx}/contactUs.htm">联系我们</a></li>
					        <li><a href="${ctx}/others/otherAddress.htm">公司地图</a></li>
					        <li><a href="${ctx}/others/others.htm">其他业务</a></li>
					      </ul>
				  		</div>
				  	</div>
				  	<div class="panel panel-default">
						<img src="${pageContext.request.contextPath}/resources/images/newbie/about001.jpg" alt="联系我们">
					</div>
					<div class="panel panel-default">
						<img src="${pageContext.request.contextPath}/resources/images/index/weixin.jpg" width="163" height="163" alt="联系我们">
						<p>扫描二维码关注冰川贷微信，获取冰川贷最新动态 </p>
					</div>
			  	</div>
	  		</div>
	    	<div class="col-md-10">
	    		<div class="panel panel-default">
				  <div class="panel-heading">
				    <h3 class="panel-title">关于我们 / 联系我们</h3>
				  </div>
				  <div class="panel-body">
				        <div>
				          <h2>联系我们</h2>
				          <div>
				            <p>冰川贷当前的服务已覆盖了全国30余个省的2000多个地区，在北京的西直门和五道口均设有办公场所，在上海设有专业的信审服务中心。</p>
				          </div>
				          <div>
				            <h3>广东总部</h3>
				            <ul>
				              <li>地址：广东省珠海市香洲区唐家湾镇</li>
				              <li>邮编：515900</li>
				            </ul>
				          </div>
				          <div>
				            <h3>北京分部</h3>
				            <ul>
				              <li>地址：北京市海淀区五道口优盛大厦18层</li>
				              <li>邮编：100083</li>
				            </ul>
				          </div>
				          <div>
				            <h3>客服电话</h3>
				            <ul>
				              <li>如果您在使用冰川贷(glacier.com)的过程中有任何疑问请您与冰川贷客服人员联系。</li>
				              <li>客服电话：400-027-8080</li>
				              <li>在线帮助：<a href="http://www.glaciersoft.cn/index.html" target="_blank">http://www.glaciersoft.cn/index.html</a></li>
				            </ul>
				          </div>
				          <div>
				            <h3>媒体采访</h3>
				            <p>如果有媒体采访需求，请将您的媒体名称、采访提纲、联系方式发至：<br><a href="mailto:PR@glacier.com" target="_blank">PR@glacier.com</a>，我们会尽快与您联系。</p>
				          </div>
				          <div>
				            <h3>商务合作</h3>
				            <p>如果贵公司希望与我们建立商务合作关系，形成优势互补，请将合作意向进行简要描述并发送邮件至：<br><a href="mailto:BD@glacier.com" target="_blank">BD@glacier.com</a>，我们会尽快与您联系。</p>
				          </div>
				          <div>
				            <h3>信息同步</h3>
				            <p>如果您还希望了解我们更多信息，请关注我们的新浪微博、腾讯微博、微信或博客。</p>
				            <ul>
				              <li>新浪博客：<a href="http://blog.sina.com.cn/glacier" target="_blank">blog.sina.com.cn/glacier</a></li>
				              <li>新浪微博：<a href="http://e.weibo.com/glacier" target="_blank">e.weibo.com/glacier</a></li>
				              <li>腾讯微博：<a href="http://t.qq.com/glacier" target="_blank">t.qq.com/glacier</a></li>
				              <li>微信公众平台：glacier</li>
				            </ul>
				            <div>
				              <p><img src="${pageContext.request.contextPath}/resources/images/index/weixin.jpg" width="150" height="150" alt="微信二维码"></p>
				              <p>扫描二维码关注冰川贷微信，获取冰川贷最新动态 </p>
				            </div>
				          </div>
				        </div>
				  </div>
				</div>
	    	</div>
	    </div>
	    <hr class="featurette-divider2">
	    </div>
	    <jsp:include page="../foot.jsp"/>
  </body>
</html>