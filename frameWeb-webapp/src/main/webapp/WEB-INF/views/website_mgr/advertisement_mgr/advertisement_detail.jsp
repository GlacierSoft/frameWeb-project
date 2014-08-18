<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form method="post" style="padding:15px">
	<table class="detailtable">
		<tr>
			<td>广告主题：</td>
			<td class="forminputtable"><!-- 当表格行存在两个要显示的td,使用该forminputtable样式可以进行适当的空间调整  -->
				<input type="hidden" name="webAdvId" value="${advertisementData.webAdvId}" />
				<input class="spinner" style="width:250px"  value="${advertisementData.webAdvTheme}" readonly="readonly"/>
			</td>
			<td>点击次数：</td>
			<td><input class="spinner" style="width:270px"  value="${advertisementData.clicks}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>广告状态：</td>
			<td><input id="advertisement_mgr_advertisement_detail_webAdvStatus" class="spinner" style="width:250px"  readonly="readonly"/></td>
			<td>广告排序：</td>
			<td><input class="spinner" style="width:270px"  value="${advertisementData.webAdvNum}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>创建人：</td>
			<td><input class="spinner" style="width:250px" value="${advertisementData.createrDisplay}" readonly="readonly"/></td>
			<td>创建时间：</td>
			<td><input class="spinner" style="width:270px" value="<fmt:formatDate value="${advertisementData.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>更新人：</td>
			<td><input class="spinner" style="width:250px" value="${advertisementData.updaterDisplay}" readonly="readonly"/></td>
			<td>更新时间：</td>
			<td><input class="spinner" style="width:270px" value="<fmt:formatDate value="${advertisementData.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>广告内容：</td>
			<td colspan="3"><textarea id="advertisement_mgr_advertisement_detail_webAdvContent" name="webAdvContent" class="spinner" style="width:600px;height:280px;" readonly="readonly">${advertisementData.webAdvContent}</textarea></td>
		</tr>

	</table>
</form>
<script>
	KindEditor.ready(function(Detail) {
		Detail.create('#advertisement_mgr_advertisement_detail_webAdvContent', {
			themeType : 'qq',
			items : [],
			minWidth : "600px",
			readonlyMode : true
		});
	});
</script>
<script type="text/javascript">
	$('#advertisement_mgr_advertisement_detail_webAdvStatus').val(renderGridValue('${advertisementData.webAdvStatus}',fields.status));
</script>