<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form method="post" style="padding:15px">
	<table class="detailtable">
		<tr>
			<td>新闻主题：</td>
			<td class="forminputtable" colspan="3"><!-- 当表格行存在两个要显示的td,使用该forminputtable样式可以进行适当的空间调整  -->
				<input type="hidden" name="webNewsId" value="${newsData.webNewsId}" />
				<input class="spinner" style="width:605px"  value="${newsData.webNewsTheme}" readonly="readonly"/>
			</td>
		</tr>
		<tr>
			<td>新闻状态：</td>
			<td><input id="news_mgr_news_detail_webNewsStatus" class="spinner" style="width:250px"  readonly="readonly"/></td>
			<td>新闻排序：</td>
			<td><input class="spinner" style="width:270px"  value="${newsData.webNewsNum}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>创建人：</td>
			<td><input class="spinner" style="width:250px" value="${newsData.createrDisplay}" readonly="readonly"/></td>
			<td>创建时间：</td>
			<td><input class="spinner" style="width:270px" value="<fmt:formatDate value="${newsData.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>更新人：</td>
			<td><input class="spinner" style="width:250px" value="${newsData.updaterDisplay}" readonly="readonly"/></td>
			<td>更新时间：</td>
			<td><input class="spinner" style="width:270px" value="<fmt:formatDate value="${newsData.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>新闻内容：</td>
			<td colspan="3"><textarea id="news_mgr_news_detail_webNewsContent" name="webNewsContent" class="spinner" style="width:600px;height:280px;" readonly="readonly">${newsData.webNewsContent}</textarea></td>
		</tr>

	</table>
	
	<%-- <div style="">
		<div id="newName" style="float: left;">
			<span style="float: left;">新闻主题：</span>
			<div style="float: left;">
				<input type="hidden" name="webNewsId" value="${newsData.webNewsId}" />
				<input class="spinner" style="width:585px"  value="${newsData.webNewsTheme}" readonly="readonly"/>
			</div>
		</div>
		
		<div id="newStauts" style="margin-top: 10px;float: left;">
			<span style="float: left;">新闻状态：</span>
			<div style="float: left;">
				<input id="news_mgr_news_detail_webNewsStatus" class="spinner" style="width:250px"  readonly="readonly"/>
			</div>
			<span style="float: left;margin-left: 23px;">新闻排序：</span>
			<div style="float: left;">
				<input class="spinner" style="width:250px"  value="${newsData.webNewsNum}" readonly="readonly"/>
			</div>
		</div>
		
		<div id="newCreate" style="margin-top: 10px;float: left;">
			<span style="float: left;">创建人：</span>
			<div style="float: left;margin-left: 12px;">
				<input class="spinner" style="width:250px" value="${newsData.createrDisplay}" readonly="readonly"/>
			</div>
			<span style="float: left;margin-left: 23px;">创建时间：</span>
			<div style="float: left;">
				<input class="spinner" style="width:250px" value="<fmt:formatDate value="${newsData.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/>
			</div>
		</div>
		
		<div id="newUpdate" style="margin-top: 10px;float: left;">
			<span style="float: left;">更新人：</span>
			<div style="float: left;margin-left: 12px;">
				<input class="spinner" style="width:250px" value="${newsData.updaterDisplay}" readonly="readonly"/>
			</div>
			<span style="float: left;margin-left: 23px;">更新时间：</span>
			<div style="float: left;">
				<input class="spinner" style="width:250px" value="<fmt:formatDate value="${newsData.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/>
			</div>
		</div>
		
		<div id="newNeiRong" style="margin-top: 10px;float: left;">
			<span style="float: left;">新闻内容：</span>
			<div style="float: left;">
				<textarea id="news_mgr_news_detail_webNewsContent" name="webNewsContent" class="spinner" style="width:585px;height:280px;" readonly="readonly">${newsData.webNewsContent}</textarea>
			</div>
			<textarea id="news_mgr_news_detail_webNewsContent" name="webNewsContent"  style="width:585px;height:280px;" readonly="readonly">${newsData.webNewsContent}</textarea>
		</div>
	</div> --%>
	
</form>
<script>
	KindEditor.ready(function(Detail) {
		Detail.create('#news_mgr_news_detail_webNewsContent', {
			themeType : 'qq',
			items : [],
			minWidth : "600px",//设置最小宽度为600px
			readonlyMode : false
		});
	});
</script>
<script type="text/javascript">
	$('#news_mgr_news_detail_webNewsStatus').val(renderGridValue('${newsData.webNewsStatus}',fields.status));
</script>