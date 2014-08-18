org.springframework.validation.BindException<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="org.apache.shiro.web.filter.authc.FormAuthenticationFilter"%>
<%@ page import="org.apache.shiro.authc.ExcessiveAttemptsException"%>
<%@ page import="org.apache.shiro.authc.IncorrectCredentialsException"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<html>
<head>
	<title>400 - 用户请求出错 </title>
</head>
<SCRIPT>window.wpo={start:new Date*1,pid:109,page:'qing'}</SCRIPT>
<link href="${ctx}/resources/css/404.css" type=text/css rel=stylesheet><!--<![endif]-->
<style type=text/css>.mod-notfound {
	BORDER-RIGHT: #e1e1e1 1px solid; BORDER-TOP: #e1e1e1 1px solid; MARGIN-TOP: 10px; BACKGROUND: #fff; BORDER-LEFT: #e1e1e1 1px solid; BORDER-BOTTOM: #e1e1e1 1px solid; HEIGHT: 585px; TEXT-ALIGN: center; border-radius: 10px
}
</style>
<body>
	<!-- <h2>400 - 用户输入错误.</h2> -->
	<SECTION class=mod-page-body >
<div class="mod-page-main wordwrap clearfix" >
	<div class=x-page-container>
		<div class="mod-notfound grid-98">
			<div style="margin-top: 100px;width: 500px;margin-left: 250px;text-align: left;">
				<%-- <IMG class=img-notfound height=60 src="${ctx}/resources/images/error/403.jpg" width=60>
				<div style="float: left;">
				<font style="color: orange;">禁止访问</font>
				</div> --%>
				<div style="position: absolute;margin-left: 310px;margin-top: -30px;"><IMG class=img-notfound height=200 src="${ctx}/resources/images/error/400.jpg" width=200></div>
				<table height="160">
					<tr>
						<%-- <td rowspan="4" valign="top" style="padding: 5px;"><IMG class=img-notfound height=60 src="${ctx}/resources/images/error/501.jpg" width=60></td> --%>
						<td><font style="color: orange;font-weight: bold;margin-left: 30px;">用户请求出错</font></td>
					</tr>
					<tr>
						<td valign="top"><font style="color: gray;font-size: 13px;margin-left: 30px;">HTTP &nbsp;&nbsp;错误: 400</font></td>
					</tr>
					<tr>
						<td valign="top"><font style="color: black;margin-left: 30px;">语法格式有误，无法理解此请求</font></td>
					</tr>
					<tr>
						<td valign="top"><font style="color: black;margin-left: 30px;">不作修改，客户程序就无法重复此请求</font></td>
					</tr>
				</table>
			</div>
			<P style="FONT-SIZE: 24px; LINE-HEIGHT: 70px">啊~哦~ 由于语法格式有误，服务器无法理解此请求！</P>
			<P style="MARGIN-BOTTOM: 30px">请检查提交的数据，如果不作修改，客户程序就无法重复此请求，或者点击链接继续浏览其他页面</P>
			<P style="FONT-SIZE: 14px; LINE-HEIGHT: 20px">
				您可以回到 
				<A href="<c:url value="/"/>">网站首页</A> 
				或到
				<A href="${ctx}/contactUs.htm" target=_blank>联系我们</A><BR>
				如若不能解决您的问题，您可<a href="javascript:history.go(-1)">返回上一步</a>，继续执行其他操作，对您万分抱歉^_^
			</P>
		</div>
	</div>
</div>
</SECTION>
<FOOTER class="mod-footer mod-cs-footer">
	<div class="clearfix hidden-box"></div>
	<div class=footer-box>
		<div class=inner-box>
			<A href="${ctx}/contactUs.htm" target=_blank>联系我们</A>
			<SPAN>&nbsp;|&nbsp;</SPAN>
			<A href="${ctx}/others/otherAddress.htm" target=_blank>公司地图</A>
			<SPAN>&nbsp;|&nbsp;</SPAN>
			<A href="http://www.glaciersoft.cn/index.html" target=_blank>冰川软件</A><!-- 
			<SPAN>&nbsp;|&nbsp;</SPAN>
			<A href="#" target=_blank>冰川协议</A> -->
		</div>
		<div class=copy-box>©2014&nbsp;BingChuan</div>
	</div>
</FOOTER>
</body>
</html>
