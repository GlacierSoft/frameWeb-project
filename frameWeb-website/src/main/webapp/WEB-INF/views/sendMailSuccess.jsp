<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- 引入jstl解析标签 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
%>
<!DOCTYPE html>
<html lang="zh-cn">
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>冰川网贷平台</title>
   	<!-- 引入公用的js和样式库 -->
	<jsp:include page="inc.jsp"/>
	<!-- Custom styles for this template -->
    <link href="${ctx}/resources/css/signin.css" rel="stylesheet">
    <style type="text/css">
		body {
		    padding-top: 100px;
		}
	</style>
	<script type="text/javascript">
    
    function reloadValidateCode(){
        $("#validateCodeImg").attr("src","<%=basePath%>/validateCode.htm?data=" + new Date() + Math.floor(Math.random()*24));
    }
    
    </script>
  </head>

  <body>
      <jsp:include page="nav.jsp"/>
      <div class="container">
      	<div class="panel panel-primary">
		  <div class="panel-heading panel-title">邮箱验证</div>
		  <div class="panel-body"  style="height: 170px">
      		邮件已发送，请在10分钟之内登录邮箱，点击链接完成注册.<br>
		  </div>
		</div>
		
      </div>
      <jsp:include page="foot.jsp"/>
  </body>
</html>

