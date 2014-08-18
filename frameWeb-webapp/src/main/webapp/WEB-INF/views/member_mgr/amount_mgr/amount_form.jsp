<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form method="post" style="padding:15px">
	<table class="formtable">
		<tr>
			<td>帮助中心主题：</td>
			<td>
				<input type="hidden" id="help_mgr_help_form_webHelpId" name="webHelpId" value="${helpData.webHelpId}" />
<%-- 				<input id="help_mgr_help_form_webHelpTheme" name="webHelpTheme" style="width:268px" value="${helpData.webHelpTheme}" class="easyui-validatebox spinner"  required="true"  validType="customReg['^[\\u4E00-\\u9FA5\\uf900-\\ufa2d\\w]{2,16}$','<fmt:message key="WebsiteHelp.webHelpTheme.illegal"/>']"/> --%>
				<input id="help_mgr_help_form_webHelpTheme" name="webHelpTheme" style="width:268px" value="${helpData.webHelpTheme}" class="easyui-validatebox spinner"  required="true"  validType="length[2,10]" invalidMessage="帮助中心主题必须在2到10个字符之间"/>
			</td>
		</tr>
		<tr>
			<td>帮助中心内容：</td>
			<td><input id="help_mgr_help_form_webHelpContent" name="webHelpContent" class="easyui-validatebox spinner" style="width:268px" required="true" value="${helpData.webHelpContent}"/></td>
		</tr>
		<tr>
			<td>帮助中心类型：</td>
			<td><input id="help_mgr_help_form_webHelpType" name="webHelpType" required="true" value="${helpData.webHelpType}"/></td>
		</tr>
		<tr>
			<td>帮助中心状态：</td>
			<td><input id="help_mgr_help_form_webHelpStatus" name="webHelpStatus" required="true" value="${helpData.webHelpStatus}"/></td>
		</tr>
		<tr>
			<td>序号：</td>
			<td><input id="help_mgr_help_form_webClaNum" name="webClaNum" class="easyui-numberspinner spinner" value="${helpData.webClaNum}" data-options="min:0,max:999,required:true,missingMessage:'请填写序号'" value="10" style="width: 270px;height:18px;" min="1" max="99"/></td>
		</tr>
		<tr>
			<td>附件：</td>
			<td><input id="help_mgr_help_form_accessory" name="accessory" class="easyui-validatebox spinner" style="width:268px" value="${helpData.accessory}"/></td>
		</tr>
		<tr>
			<td>备注：</td>
			<td><textarea id="help_mgr_help_form_remark" name="remark" style="width:268px;" maxlength="255" class="spinner formta">${helpData.remark}</textarea></td>
		</tr>
	</table>
</form>

<script type="text/javascript">
	// 初始化新闻状态下拉框
	$('#help_mgr_help_form_webHelpStatus').combobox({  
		valueField : 'value',
		height:18,
		width:270,
		textField : 'label',
		panelHeight : 'auto',
		editable : false,
		required:true,
		data : fields.status
	});
	$('#help_mgr_help_form_webHelpType').combobox({  
		valueField : 'value',
		height:18,
		width:270,
		textField : 'label',
		panelHeight : 'auto',
		editable : false,
		required:true,
		data : fields.webHelpType
	});
</script>
