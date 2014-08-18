<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form method="post" style="padding:15px">
	<table class="detailtable">
		<tr>
			<td>友情链接名称：</td>
			<td colspan="3"><!-- 当表格行存在两个要显示的td,使用该forminputtable样式可以进行适当的空间调整  -->
				<input type="hidden" name="roleId" value="${linkData.webLinkId}" />
				<input class="spinner" style="width:416px"  value="${linkData.webLinkName}" readonly="readonly"/>
			</td>
		</tr>
		<tr>
			<td>友情链接Url：</td>
			<td colspan="3"><input class="spinner" style="width:416px"  value="${linkData.webLinkUrl}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>友情链接图像：</td>
			<td colspan="3"><input class="spinner" style="width:416px"  value="${linkData.webLinkPhoto}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>友情链接状态：</td>
			<td><input id="link_mgr_link_detail_webLinkStatus" class="spinner" style="width:168px" readonly="readonly"/></td>
			<td>链接排序：</td>
			<td><input class="spinner" style="width:168px"  value="${linkData.webLinkNum}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>创建人：</td>
			<td><input class="spinner" style="width:168px" value="${linkData.createrDisplay}" readonly="readonly"/></td>
			<td>创建时间：</td>
			<td><input class="spinner" style="width:168px" value="<fmt:formatDate value="${linkData.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>更新人：</td>
			<td><input class="spinner" style="width:168px" value="${linkData.updaterDisplay}" readonly="readonly"/></td>
			<td>跟新时间：</td>
			<td><input class="spinner" style="width:168px" value="<fmt:formatDate value="${linkData.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>备注：</td>
			<td colspan="3"><textarea class="spinner" style="width:416px" readonly="readonly">${linkData.remark}</textarea></td>
		</tr>
	</table>
</form>
<script type="text/javascript">
	$('#link_mgr_link_detail_webLinkStatus').val(renderGridValue('${linkData.webLinkStatus}',fields.status));
</script>