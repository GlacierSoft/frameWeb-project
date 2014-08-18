<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入jstl解析标签 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- 获取项目根path -->
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<!-- 加入富文本编辑器kindeditor声明-->
<script type="text/javascript" charset="utf-8">
	   var ctx = '${ctx}';//项目访问路径
</script>

<!-- 引入网站标识icon -->
<link rel="shortcut icon" href="${ctx}/resources/images/favicon/favicon.ico"></link>
<link rel="icon" href="${ctx}/resources/images/favicon/favicon.ico"></link>

<!-- jquery form验证 css -->
<link rel="stylesheet" href="${ctx}/resources/css/jqFormValidata/screen.css"></link>

<!-- 引入bootstrap样式 -->
<link rel="stylesheet" href="${ctx}/resources/js/bootstrap-3.0.3-dist/dist/css/bootstrap.min.css"></link>
<link rel="stylesheet" href="${ctx}/resources/js/bootstrap-switch/bootstrap-switch.min.css"></link>
<link rel="stylesheet" href="${ctx}/resources/js/bootstrap-3.0.3-dist/dist/css/sticky-footer-navbar.css"></link>

<!-- bootstrap-datetimepicker日期css -->
<link rel="stylesheet" href="${ctx}/resources/js/bootstrap-datetimepicker/css/bootstrap-datetimepicker.min.css"></link>

<!-- 自定义主页样式 -->
<link rel="stylesheet" href="${ctx}/resources/css/index.css"></link>

<!-- 自定义借款页面样式 -->
<link rel="stylesheet" href="${ctx}/resources/css/borrow.css"></link>

<!-- 自定义借款页面样式 -->
<link rel="stylesheet" href="${ctx}/resources/js/kindeditor/themes/default/default.css"></link>

 <!--[if lt IE 9]>
 	<link rel="stylesheet" href="${ctx}/resources/css/ie8.css"></link>
 </script><![endif]-->

 <!--[if lt IE 9]>
   <script src="http://cdn.bootcss.com/html5shiv/3.7.0/html5shiv.min.js"></script>
   <script src="http://cdn.bootcss.com/respond.js/1.3.0/respond.min.js"></script>
 <![endif]-->

<!-- CDN加速的可以用自己的JS替换 -->
<!-- <script src="http://cdn.bootcss.com/jquery/1.10.2/jquery.min.js"></script> -->
<script src="${ctx}/resources/js/jquery/jquery-2.0.3.js" type="text/javascript"></script>
<script src="http://cdn.bootcss.com/holder/2.0/holder.min.js"></script>

<script src="${ctx}/resources/js/bootstrap-3.0.3-dist/dist/js/bootstrap.min.js"></script>
<script src="${ctx}/resources/js/bootstrap-switch/bootstrap-switch.min.js" type="text/javascript"></script>
<script src="${ctx}/resources/js/bootstrap-3.0.3-dist/dist/js/alert.js" type="text/javascript"></script>
<script src="${ctx}/resources/js/bootstrap-3.0.3-dist/dist/js/popover.js" type="text/javascript"></script>
<!-- 工具提示 tooltip.js -->
<script src="${ctx}/resources/js/bootstrap-3.0.3-dist/dist/js/tooltip.js" type="text/javascript"></script>
<!-- jquery form验证 -->
<script src="${ctx}/resources/js/jquery/jquery.validate.js" type="text/javascript"></script>
<script src="${ctx}/resources/js/jquery/jquery.netloan_website_validate.js" type="text/javascript"></script>

<!-- bootstrap分页插件 -->
<script src="${ctx}/resources/js/bootstrap-3.0.3-dist/dist/js/bootstrap-paginator.js"></script>
<script src="${ctx}/resources/js/bootstrap-3.0.3-dist/dist/js/qunit-1.11.0.js"></script>

<!-- bootstrap-datetimepicker日期插件 -->
<script type="text/javascript" src="${ctx}/resources/js/bootstrap-datetimepicker/bootstrap-datetimepicker.js"></script>
<script type="text/javascript" src="${ctx}/resources/js/bootstrap-datetimepicker/locales/bootstrap-datetimepicker.zh-CN.js" charset="UTF-8"></script>

<!-- 自定义js -->
<%-- <script src="${ctx}/resources/js/common/extJquery.js" type="text/javascript"></script>  
<script src="${ctx}/resources/js/common/glacier.util.js" type="text/javascript"></script> --%>
<script src="${ctx}/resources/js/glacier/glacier.js" type="text/javascript"></script>
<!-- 时间插件js -->
<script src="${ctx}/resources/js/datePicker/WdatePicker.js" type="text/javascript"></script>


<!-- 加入富文本编辑器kindeditor-->
<script src="${ctx}/resources/js/kindeditor/kindeditor.js" type="text/javascript" charset="utf-8"></script>
<script src="${ctx}/resources/js/kindeditor/lang/zh_CN.js" type="text/javascript" charset="utf-8"></script>
<!-- 加入富文本编辑器kindeditor声明-->
<script type="text/javascript" charset="utf-8">
	   var ctx = '${ctx}';//项目访问路径
	 //该变量在kindeditor控件有需要哦！！！
		var basePath = '${pageContext.request.scheme}://${pageContext.request.serverName}:${pageContext.request.serverPort}${pageContext.request.contextPath}/';
		var fields = eval('(${fields})');//加载系统字段
       KindEditor.ready(function(K) {
       });
	   
</script>