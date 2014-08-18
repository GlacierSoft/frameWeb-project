<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form method="post" style="padding:15px"> 
	<div style="float: left;"><input type="hidden" name="webServiceId" value="${serviceData.webServiceId}" />
		<img src="${serviceData.webServicePhoto}" width="130" height="125">
	</div>
	<div style="float: left;margin-left: 10px;">
		客服序号：<input class="spinner"  style="width:90px;border-left: 0px;border-right: 0px;border-top: 0px;" value="${serviceData.webServiceNum}" readonly="readonly"/>
	</div>
	<div style="float: left;margin-left: 10px;">
		客服名称：<input class="spinner" style="width:120px;border-left: 0px;border-right: 0px;border-top: 0px;"  value="${serviceData.webServiceName}" readonly="readonly"/>
	</div>
	
	<div style="float: left;margin-left: 10px;margin-top: 20px;">
		客服qq：&nbsp;&nbsp;<input class="spinner" style="width:90px;border-left: 0px;border-right: 0px;border-top: 0px;"  value="${serviceData.webServiceQq}" readonly="readonly"/>
	</div>
	
	<div style="float: left;margin-left: 10px;margin-top: 20px;">
		客服状态：<input class="spinner" style="width:120px;border-left: 0px;border-right: 0px;border-top: 0px;"  id="service_mgr_service_form_webServiceStatus" readonly="readonly"/>
	</div>
	
	<div style="float: left;margin-left: 10px;margin-top: 20px;">
		创建者：&nbsp;&nbsp;&nbsp;<input class="spinner" style="width:90px;border-left: 0px;border-right: 0px;border-top: 0px;"  value="${serviceData.createrDisplay}" readonly="readonly"/>
	</div>
	
	<div style="float: left;margin-left: 10px;margin-top: 20px;">
		创建时间：<input class="spinner" style="width:120px;border-left: 0px;border-right: 0px;border-top: 0px;"  value="<fmt:formatDate value="${serviceData.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/>
	</div>
	
	<div style="float: left;margin-left: 10px;margin-top: 20px;">
		更新者：&nbsp;&nbsp;&nbsp;<input class="spinner" style="width:90px;border-left: 0px;border-right: 0px;border-top: 0px;"  value="${serviceData.updaterDisplay}" readonly="readonly"/>
	</div>
	
	<div style="float: left;margin-left: 10px;margin-top: 20px;">
		更新时间：<input class="spinner" style="width:120px;border-left: 0px;border-right: 0px;border-top: 0px;"  value="<fmt:formatDate value="${serviceData.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/>
	</div>
	
	<div style="float: right;margin-right: 27px;margin-top: 20px;">
			备注：&nbsp;&nbsp;&nbsp;<textarea class="spinner" style="width:280px;border-left: 0px;border-right: 0px;border-top: 0px;" readonly="readonly">${serviceData.remark}</textarea>
	</div>
	
</form>

<script type="text/javascript">
	$('#service_mgr_service_form_webServiceStatus').val(renderGridValue('${serviceData.webServiceStatus}',fields.status));
</script>
