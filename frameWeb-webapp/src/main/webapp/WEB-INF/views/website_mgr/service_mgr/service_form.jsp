<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form id="service_mgr_service_form" method="post" style="padding:15px">
	<table class="formtable">
		<tr>
			<td>客服名称：</td>
			<td>
				<input type="hidden" id="service_mgr_service_form_webServiceId" name="webServiceId" value="${serviceData.webServiceId}" />
				<input id="service_mgr_service_form_webServiceName"  name="webServiceName" class="easyui-validatebox spinner" style="width:268px" value="${serviceData.webServiceName}" required="true"  validType="length[1,25]" invalidMessage="客服名称必须在1到25个字符之间"/>
			</td>
		</tr>
		<tr>
			<td>客服qq：</td>
			<td><input id="service_mgr_service_form_webServiceQq" name="webServiceQq" class="easyui-validatebox spinner" style="width:268px"  data-options="required:true,validType:'qq'" value="${serviceData.webServiceQq}"/></td>
		</tr>
		<tr>
			<td>客服状态：</td>
			<td><input id="service_mgr_service_form_webServiceStatus" name="webServiceStatus" required="true" value="${serviceData.webServiceStatus}"/></td>
		</tr>
		<tr>
			<td>客服序号：</td>
			<td><input id="service_mgr_service_form_webServiceNum" name="webServiceNum" class="easyui-numberspinner spinner" value="${serviceData.webServiceNum}" data-options="min:0,max:999,required:true,missingMessage:'请填写客服序号'" value="10" style="width: 270px;height:18px;" min="1" max="999"/></td>
		</tr>
		<tr>
			<td>客服头像：</td>
			<td>
				<input id="url" name="webServicePhoto" class="ke-input-text" type="text" style="width:180px" required="true" value="${serviceData.webServicePhoto}"/>
				<input type="button" id="uploadButton" value="上传"/>
			</td>
		</tr>
		 <tr>
			<td></td>
			<td>
			<div id="creditPhotoDiv" style="border: 1px #DDDDDD;">
				<img id="creditPhotoDivImg"  src="${serviceData.webServicePhoto}" style="width: 34px;height: 24px ;" />
			</div>
			</td>
		</tr>
		<tr>
			<td>附件：</td>
			<td><input id="service_mgr_service_form_accessory" name="accessory" class="easyui-validatebox spinner" style="width:268px" value="${serviceData.accessory}"/></td>
		</tr>
		<tr>
			<td>备注：</td>
			<td><textarea id="service_mgr_service_form_remark" name="remark" style="width:268px;" maxlength="255" class="spinner formta">${serviceData.remark}</textarea></td>
		</tr>
	</table>
</form>

<script type="text/javascript">

	KindEditor.ready(function(K) {
		var uploadbutton = K.uploadbutton({
			button : K('#uploadButton')[0],
			fieldName : 'imgFile',
			//url : ctx+'/member/uploadFile.htm?dir=image',
			url : ctx+'/resources/js/kindeditor/jsp/upload_json.jsp?dir=image',
				//'../php/upload_json.php?dir=file'
			afterUpload : function(data) {
				if (data.error === 0) {
					var url = K.formatUrl(data.url, 'domain');
					K('#url').val(url);
					//K('#url').html(url);
					$("#creditPhotoDivImg").attr("src",url);
				} else {
					alert("添加成功");
				}
			},
			afterError : function(str) {
				alert('自定义错误信息: ');
			}
		});
		uploadbutton.fileBox.change(function(e) {
			uploadbutton.submit();
		});
	});

	// 初始化新闻状态下拉框
	$('#service_mgr_service_form_webServiceStatus').combobox({  
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
