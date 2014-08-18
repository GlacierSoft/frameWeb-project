<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form method="post" style="padding:15px">
	<table class="detailtable">
		<tr>
			<td>主题：</td>
			<td class="forminputtable" colspan="3"><!-- 当表格行存在两个要显示的td,使用该forminputtable样式可以进行适当的空间调整  -->
				<input type="hidden" name="webHelpId" value="${helpData.webHelpId}" />
				<input class="spinner" style="width:605px"  value="${helpData.webHelpTheme}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>类型：</td>
			<td><input id="help_mgr_help_form_webHelpType" class="spinner" style="width:250px"  readonly="readonly"/></td>
			<td>状态：</td>
			<td><input id="help_mgr_help_form_webHelpStatus" class="spinner" style="width:270px"  readonly="readonly"/></td>
		</tr>
		<tr>
			<td>附件：</td>
			<td><input  class="spinner" style="width:250px"  value="${helpData.accessory}" readonly="readonly"/></td>
			<td>客服序号：</td>
			<td><input class="spinner" style="width:270px"  value="${helpData.webClaNum}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>创建者：</td>
			<td><input class="spinner" style="width:250px" value="${helpData.createrDisplay}" readonly="readonly"/></td>
			<td>创建时间：</td>
			<td><input class="spinner" style="width:270px" value="<fmt:formatDate value="${helpData.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>更新者：</td>
			<td><input class="spinner" style="width:250px" value="${helpData.updaterDisplay}" readonly="readonly"/></td>
			<td>更新时间：</td>
			<td><input class="spinner" style="width:270px" value="<fmt:formatDate value="${helpData.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>公告内容：</td>
			<td colspan="3"><textarea id="help_mgr_help_form_webHelpContent" name="webHelpContent" class="spinner" style="width:600px;height:280px;" readonly="readonly">${helpData.webHelpContent}</textarea></td>
		</tr>
		<%-- <tr>
			<td>备注：</td>
			<td colspan="3"><textarea class="spinner" style="width:416px" readonly="readonly">${helpData.remark}</textarea></td>
		</tr> --%>
	</table>
</form>
<script>
	KindEditor.ready(function(Detail) {
		Detail.create('#help_mgr_help_form_webHelpContent', {
			themeType : 'qq',
			items : [],
			minWidth : "600px",
			readonlyMode : true
		});
	});
</script>
<script type="text/javascript">
	$('#help_mgr_help_form_webHelpStatus').val(renderGridValue('${helpData.webHelpStatus}',fields.status));
	$('#help_mgr_help_form_webHelpType').val(renderGridValue('${helpData.webHelpType}',fields.webHelpType));
</script>
