<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form method="post" style="padding:15px">
	<table class="detailtable">
		<tr>
			<td>帮助中心主题：</td>
			<td class="forminputtable"><!-- 当表格行存在两个要显示的td,使用该forminputtable样式可以进行适当的空间调整  -->
				<input type="hidden" name="webHelpId" value="${helpData.webHelpId}" />
				<input class="spinner" style="width:168px"  value="${helpData.webHelpTheme}" readonly="readonly"/></td>
			<td>帮助中心内容：</td>
			<td><input class="spinner" style="width:168px" value="${helpData.webHelpContent}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>帮助中心类型：</td>
			<td><input id="service_mgr_service_form_webHelpType" class="spinner" style="width:168px"  readonly="readonly"/></td>
			<td>帮助中心状态：</td>
			<td><input id="service_mgr_service_form_webHelpStatus" class="spinner" style="width:168px"  readonly="readonly"/></td>
		</tr>
		<tr>
			<td>附件：</td>
			<td><input  class="spinner" style="width:168px"  value="${helpData.accessory}" readonly="readonly"/></td>
			<td>客服序号：</td>
			<td><input class="spinner" style="width:168px"  value="${helpData.webClaNum}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>创建者：</td>
			<td><input class="spinner" style="width:168px" value="${helpData.creater}" readonly="readonly"/></td>
			<td>创建时间：</td>
			<td><input class="spinner" style="width:168px" value="<fmt:formatDate value="${helpData.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>更新者：</td>
			<td><input class="spinner" style="width:168px" value="${helpData.updater}" readonly="readonly"/></td>
			<td>更新时间：</td>
			<td><input class="spinner" style="width:168px" value="<fmt:formatDate value="${helpData.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>备注：</td>
			<td colspan="3"><textarea class="spinner" style="width:416px" readonly="readonly">${helpData.remark}</textarea></td>
		</tr>
	</table>
</form>

<script type="text/javascript">
	var webHelpStatus = '${helpData.webHelpStatus}';
	var webHelpType = '${helpData.webHelpType}';
	if(webHelpStatus == "enable"){
		$('#service_mgr_service_form_webHelpStatus').val("启用");
	}else{
		$('#service_mgr_service_form_webHelpStatus').val("禁用");
	}  
	if(webHelpType == "borrow"){
		$('#service_mgr_service_form_webHelpType').val("借款");
	}else if(webHelpType == "invest"){
		$('#service_mgr_service_form_webHelpType').val("投资");
	}else{
		$('#service_mgr_service_form_webHelpType').val("基金");
	}  
</script>
