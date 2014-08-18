<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form method="post" style="padding:15px">
	<table class="formtable">
		<tr>
			<td>友情链接名称：</td>
			<td>
				<input type="hidden" id="link_mgr_link_form_webLinkId" name="webLinkId" value="${linkData.webLinkId}" />
				<input id="link_mgr_link_form_webLinkName" name="webLinkName" class="easyui-validatebox spinner" style="width:268px" required="true" value="${linkData.webLinkName}" validType="customReg['^[\u0391-\uFFE5]{1,20}$','<fmt:message key="WebsiteLink.webLinkName.illegal"/>']"/>
			</td>
		</tr>
		<tr>
			<td>友情链接Url：</td>
			<td><input id="link_mgr_link_form_webLinkUrl" name="webLinkUrl" class="easyui-validatebox spinner" style="width:268px" required="true" value="${linkData.webLinkUrl}" validType="customReg['^[^\u4e00-\u9fa5]{0,100}$','<fmt:message key="WebsiteLink.webLinkUrl.illegal"/>']"/></td>
		</tr>
		<tr>
			<td>友情链接图像：</td>
			<td><input id="link_mgr_link_form_webLinkPhoto" name="webLinkPhoto" class="easyui-validatebox spinner" style="width:268px" required="true" value="${linkData.webLinkPhoto}"/></td>
		</tr>
		<tr>
			<td>友情链接状态：</td>
			<td><input id="link_mgr_link_form_webAnnStatus" name="webLinkStatus" required="true" value="${linkData.webLinkStatus}"/></td>
		</tr>
		<tr>
			<td>排序：</td>
			<td><input id="area_mgr_area_form_webLinkNum" name="webLinkNum" class="easyui-numberspinner spinner" value="${linkData.webLinkNum}" data-options="min:0,max:999,missingMessage:'请输入友情链接排序'" value="10" style="width: 270px;height:18px;" min="1" max="999"/></td>
		</tr>
		<tr>
			<td>备注：</td>
			<td><textarea id="link_mgr_link_form_remark" name="remark" style="width:268px;" maxlength="255" class="spinner formta">${linkData.remark}</textarea></td>
		</tr>
	</table>
</form>
<script type="text/javascript">
	// 初始化友情链接状态下拉框
	$('#link_mgr_link_form_webAnnStatus').combobox({  
		valueField : 'value',
		height:18,
		width:270,
		textField : 'label',
		panelHeight : 'auto',
		editable : false,
		required:true,
		data : fields.status
	});
</script>