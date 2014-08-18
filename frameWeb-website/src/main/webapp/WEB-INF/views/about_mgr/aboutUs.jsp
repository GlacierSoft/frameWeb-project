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
					        <li class="active"><a href="${ctx}/aboutUs.htm">公司简介</a></li>
					        <li><a href="${ctx}/announcement/announcement.htm?&p=1">网站公告</a></li>
						    <li><a href="${ctx}/news/news.htm?&p=1">网站新闻</a></li>
					        <li><a href="${ctx}/hiring/hiring.htm?&p=1">招纳贤士</a></li>
					        <li><a href="${ctx}/contactUs.htm">联系我们</a></li>
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
				    <h3 class="panel-title">关于我们 / 公司简介</h3>
				  </div>
				  <div class="panel-body">
			          <h2>公司简介</h2>
			          <div>
			            <p>冰川贷(glacier.com)，系冰川软件集团旗下公司及独立品牌。</p>
			            <p>自2010年5月成立至今，人人贷的服务已覆盖了全国30余个省的2000多个地区，服务了几十万名客户，成功帮助他们通过信用申请获得融资借款，或通过自主出借获得稳定收益。</p>
			            <p>作为中国最早的一批基于互联网的P2P信用借贷服务平台，人人贷以其诚信、透明、公平、高效、创新的特征赢得了良好的用户口碑。现在，人人贷已成为行业内最具影响力的品牌之一。</p>
			          </div>
			          <div>
			            <h3>使命</h3>
			            <p>实现个人的信用自主和金融自由。</p>
			          </div>
			          <div>
			            <h3>愿景</h3>
			            <p>打造一个人人参与、人人自由、人人平等的互联网个人金融服务平台。</p>
			          </div>
			          <div>
			            <h3>核心价值</h3>
			              <h5>释放用户借款和理财的自主权利</h5>
			              <p>借款人通过个人信用申请借款，获得资金；理财人通过公开信息自主选择进行投资，获得收益。</p>
			              <h5>建立互联网时代的个人金融风险定价体系</h5>
			              <p>通过有效的个人信用模型和大数据挖掘，逐步建立并完善符合时代特征的个人金融风险定价体系。</p>
			              <h5>实现更低借款成本和更稳健投资收益</h5>
			              <p>受益于精准的个人金融风险定价体系和安全分散有保障的投资机制，借款人和理财人的权益均可得到充分的<br>保障和满足。</p>
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