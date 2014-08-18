<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form id="nav_mgr_nav_form" method="post" style="padding:15px">
	<table class="formtable">
		<tr>
			<td>导航：</td>
			<td class="forminputtable">
				<input id="nav_mgr_nav_form_webNavId" type="hidden" name="webNavId" value="${websiteNavData.webNavId}" />
<%-- 				<input id="nav_mgr_nav_form_webNavName" name="webNavName" class="easyui-validatebox spinner" style="width:240px" required="true" value="${websiteNavData.webNavName}" validType="customReg['^[\u0391-\uFFE5]{2,10}$','<fmt:message key="WebsiteNav.webNavName.illegal"/>']"/> --%>
				<input id="nav_mgr_nav_form_webNavName" name="webNavName" class="easyui-validatebox spinner" style="width:240px" required="true" value="${websiteNavData.webNavName}" validType="length[1,25]" invalidMessage="导航名称必须在1到25个字符之间"/>
			</td>
		</tr>
		<tr>
			<td>父级导航：</td>
			<td>
				<input id="nav_mgr_nav_form_webNavPid" name="webNavPid"  class="easyui-validatebox spinner" value="${websiteNavData.webNavPid}"/>
			</td>
		</tr>
		<tr>
			<td>导航URL：</td>
			<td><input id="nav_mgr_nav_form_webNavUrl" name="webNavUrl" class="easyui-validatebox spinner" style="width:240px" required="true"  value="${websiteNavData.webNavUrl}"/></td>
		</tr>
		<tr>
			<td>客服状态：</td>
			<td><input id="nav_mgr_nav_form_webNavStatus" name="webNavStatus" value="${websiteNavData.webNavStatus}"/></td>
		</tr>
		<tr>
			<td>排序：</td>
			<td>
				<input id="nav_mgr_nav_form_webNavNum" name="webNavNum" class="easyui-numberspinner spinner" value="${websiteNavData.webNavNum}" data-options="min:0,max:999,required:true,missingMessage:'请填写导航序号'" value="10" style="width: 243px;height:18px;" min="1" max="999"/>
			</td>
		</tr>
		<tr>
			<td>备注：</td>
			<td><textarea id="nav_mgr_nav_form_remark" name="remark" style="width:240px;" maxlength="255" class="spinner formta">${websiteNavData.remark}</textarea></td>
		</tr>
	</table>
</form>

<script type="text/javascript">
	//初始化上级菜单
	$("#nav_mgr_nav_form_webNavPid").combotree({
		data : $.parseJSON('${allWebsiteNavTreeNodeData}'),
		width:240,
		height:18,
	    missingMessage:'请选择上级导航',
	    smooth: true,       //该属性用以启用当前 easyui-tree 控件对平滑数据格式的支持
	    lines : true
	});	

	// 初始化新闻状态下拉框
	$('#nav_mgr_nav_form_webNavStatus').combobox({  
		valueField : 'value',
		height:18,
		width:242,
		textField : 'label',
		panelHeight : 'auto',
		editable : false,
		required:true,
		data : fields.status
	});
</script>