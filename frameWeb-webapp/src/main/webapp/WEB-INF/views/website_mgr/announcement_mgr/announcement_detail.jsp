<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form method="post" style="padding:15px">
	<table class="detailtable">
		<tr>
			<td>公告主题：</td>
			<td class="forminputtable"><!-- 当表格行存在两个要显示的td,使用该forminputtable样式可以进行适当的空间调整  -->
				<input type="hidden" name="webAnnId" value="${announcementData.webAnnId}" />
				<input class="spinner" style="width:250px"  value="${announcementData.webAnnTheme}" readonly="readonly"/>
			</td>
			<td>点击次数：</td>
			<td><input class="spinner" style="width:270px"  value="${announcementData.clicks}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>公告状态：</td>
			<td><input id="announcement_mgr_announcement_detail_webAnnStatus" class="spinner" style="width:250px"  readonly="readonly"/></td>
			<td>公告排序：</td>
			<td><input class="spinner" style="width:270px"  value="${announcementData.webAnnNum}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>创建人：</td>
			<td><input class="spinner" style="width:250px" value="${announcementData.createrDisplay}" readonly="readonly"/></td>
			<td>创建时间：</td>
			<td><input class="spinner" style="width:270px" value="<fmt:formatDate value="${announcementData.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>更新人：</td>
			<td><input class="spinner" style="width:250px" value="${announcementData.updaterDisplay}" readonly="readonly"/></td>
			<td>更新时间：</td>
			<td><input class="spinner" style="width:270px" value="<fmt:formatDate value="${announcementData.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>公告内容：</td>
			<td colspan="3"><textarea id="announcement_mgr_announcement_detail_webAnnContent" name="webAnnContent" class="spinner" style="width:600px;height:280px;" readonly="readonly">${announcementData.webAnnContent}</textarea></td>
		</tr>

	</table>
</form>
<script>
	KindEditor.ready(function(Detail) {
		Detail.create('#announcement_mgr_announcement_detail_webAnnContent', {
			themeType : 'qq',
			items : [],
			minWidth : "600px",
			readonlyMode : true
		});
	});
</script>
<script type="text/javascript">
	$('#announcement_mgr_announcement_detail_webAnnStatus').val(renderGridValue('${announcementData.webAnnStatus}',fields.status));
</script>