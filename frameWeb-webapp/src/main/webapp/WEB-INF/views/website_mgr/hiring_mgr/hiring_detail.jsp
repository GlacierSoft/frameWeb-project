<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form method="post" style="padding:15px">
	<table class="detailtable">
		<tr>
			<td>主题：</td>
			<td class="forminputtable"><!-- 当表格行存在两个要显示的td,使用该forminputtable样式可以进行适当的空间调整  -->
				<input type="hidden" name="webHiringId" value="${hiringData.webHiringId}" />
				<input class="spinner" style="width:250px"  value="${hiringData.webHiringTheme}" readonly="readonly"/></td>
				<td>序号：</td>
				<td><input class="spinner" style="width:270px"  value="${hiringData.webHiringNum}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>状态：</td>
			<td><input id="hiring_mgr_hiring_form_webHiringStatus" class="spinner" style="width:250px"  readonly="readonly"/></td>
			<td>附件：</td>
			<td><input class="spinner" style="width:270px"  value="${hiringData.accessory}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>创建者：</td>
			<td><input class="spinner" style="width:250px" value="${hiringData.createrDisplay}" readonly="readonly"/></td>
			<td>创建时间：</td>
			<td><input class="spinner" style="width:270px" value="<fmt:formatDate value="${hiringData.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>更新人：</td>
			<td><input class="spinner" style="width:250px" value="${hiringData.updaterDisplay}" readonly="readonly"/></td>
			<td>更新时间：</td>
			<td><input class="spinner" style="width:270px" value="<fmt:formatDate value="${hiringData.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>公告内容：</td>
			<td colspan="3"><textarea id="hiring_mgr_hiring_form_webHiringContent" name="webHiringContent" class="spinner" style="width:600px;height:280px;" readonly="readonly">${hiringData.webHiringContent}</textarea></td>
		</tr>
		<%-- <tr>
			<td>备注：</td>
			<td colspan="3"><textarea class="spinner" style="width:416px" readonly="readonly">${hiringData.remark}</textarea></td>
		</tr> --%>
	</table>
</form>
<script>
	KindEditor.ready(function(Detail) {
		Detail.create('#hiring_mgr_hiring_form_webHiringContent', {
			themeType : 'qq',
			items : [],
			minWidth : "600px",
			readonlyMode : true
		});
	});
</script>
<script type="text/javascript">
	$('#hiring_mgr_hiring_form_webHiringStatus').val(renderGridValue('${hiringData.webHiringStatus}',fields.status));
</script>
