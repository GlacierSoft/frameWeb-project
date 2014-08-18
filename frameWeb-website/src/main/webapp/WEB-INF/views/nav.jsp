<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入jstl解析标签 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- 获取项目根path -->
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

    	<!-- NAVBAR START============================= -->
	    <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
	      <div class="container">
	        <div class="navbar-header">
	          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
	            <span class="sr-only">Toggle navigation</span>
	            <span class="icon-bar"></span>
	            <span class="icon-bar"></span>
	            <span class="icon-bar"></span>
	          </button>
	          <a class="navbar-brand" href="${ctx}/index.htm">冰川网贷平台</a>
	        </div>
	        <div class="navbar-collapse collapse">
	          <ul class="nav navbar-nav">
	            <li class="active"><a href="${ctx}/index.htm">主页</a></li>
	            <li class="dropdown">
	              <a href="${ctx}/investment/index.htm?&p=1">我要投资</a>
	             </li>
	            <li><a href="${ctx}/borrow.htm">我要借款</a></li>
	            <li class="dropdown">
	              <a href="${ctx}/borrowingProcess.htm" class="dropdown-toggle" data-toggle="dropdown">新手引导<b class="caret"></b></a>
	              <ul class="dropdown-menu">
	                <li><a href="${ctx}/borrowingProcess.htm">借款流程</a></li>
	                <li><a href="${ctx}/investmentProcess.htm">投资流程</a></li>
	                <li><a href="${ctx}/riskGuarantee.htm">风险保障</a></li>
	              </ul>
	            </li>
	            <li><a href="${ctx}/member/index.htm">个人中心</a></li>
	            <li class="dropdown">
	              <a href="${ctx}/aboutUs.htm" class="dropdown-toggle" data-toggle="dropdown">关于我们<b class="caret"></b></a>
	              <ul class="dropdown-menu">
	                <li><a href="${ctx}/aboutUs.htm">公司简介</a></li>
	                <li><a href="${ctx}/announcement/announcement.htm?&p=1">网站公告</a></li>
					<li><a href="${ctx}/news/news.htm?&p=1">网站新闻</a></li>
	                <li><a href="${ctx}/hiring/hiring.htm?&p=1">招纳贤士</a></li>
	                <li><a href="${ctx}/contactUs.htm">联系我们</a></li>
	                <li><a href="${ctx}/others/otherAddress.htm">公司地图</a></li>
	                <li><a href="${ctx}/others/others.htm?&str=IPNumber">其他业务</a></li>
	             </ul>
	            </li>
	          </ul>
	          	<p class="navbar-text navbar-right">
	          	<c:choose>
				   <c:when test="${empty currentMember}">  
		         		<span>您好！| <a href="${ctx}/login.htm" class="navbar-link">登录</a> |</span>
		         		<span><a href="${ctx}/intoregister.htm" class="navbar-link">注册</a></span>
				   </c:when>
			   	<c:otherwise> 
				   		<span>您好！${currentMember.memberName}
				   		  <c:choose>
				   		      <c:when test="${empty currentMember.memberRealName}">
				   		     	 <a  href="${ctx}/member/memberDetail.htm?&p=1" class="navbar-link">
				   		         <span id="nav_messageNoticCount" class="badge">${messageNoticCount}</span>
				   		         </a>  
				   		      </c:when>
				   		      <c:otherwise>
				   		      	 <a  href="${ctx}/messageNotice/intoMessageNotice.htm?&p=1" class="navbar-link">
				   		         <span id="nav_messageNoticCount" class="badge">${messageNoticCount}</span>
				   		        </a> 
				   		      </c:otherwise>
				   		 </c:choose>|</span>
				   		<span><a href="${ctx}/member/index.htm" class="navbar-link">个人中心</a> |</span>
				   		<span><a href="${ctx}/logout.htm" class="navbar-link">退出</a></span>
				   </c:otherwise>
				</c:choose>
   				</p>
	        </div>
	      </div>
	    </nav>
	    <!-- NAVBAR END============================= -->
