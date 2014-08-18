<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form method="post" style="padding:15px">
	<table class="formtable">
		<tr>
			<td>主题：</td>
			<td colspan="3">
				<input type="hidden" id="help_mgr_help_form_webHelpId" name="webHelpId" value="${helpData.webHelpId}" />
				<input id="help_mgr_help_form_webHelpTheme" name="webHelpTheme" style="width:600px" value="${helpData.webHelpTheme}" class="easyui-validatebox spinner"  required="true"  validType="length[1,50]" invalidMessage="帮助中心主题必须在1到50个字符之间"/>
			</td>
		</tr>
		<tr>
			<td>类型：</td>
			<td><input id="help_mgr_help_form_webHelpType" name="webHelpType" value="${helpData.webHelpType}"/></td>
			<td>状态：</td>
			<td><input id="help_mgr_help_form_webHelpStatus" name="webHelpStatus" value="${helpData.webHelpStatus}" style="width:285px"/></td>
		</tr>
		<tr>
			<td>序号：</td>
			<td><input id="help_mgr_help_form_webClaNum" name="webClaNum" class="easyui-numberspinner spinner" value="${helpData.webClaNum}" data-options="min:0,max:999,required:true,missingMessage:'请填写序号'" value="10" style="width: 270px;height:18px;" min="1" max="999"/></td>
			<td>附件：</td>
			<td><input id="help_mgr_help_form_accessory" name="accessory" class="easyui-validatebox spinner" style="width:285px" value="${helpData.accessory}"/></td>
		</tr>
		<tr>
			<td>内容：</td>
			<td colspan="3">
				<textarea id="help_mgr_help_form_webHelpContent" name="webHelpContent" style="width:600px;height:280px;">
					${helpData.webHelpContent}
				</textarea>
			</td>
		</tr>
	<%-- 	<tr>
			<td>备注：</td>
			<td><textarea id="help_mgr_help_form_remark" name="remark" style="width:268px;" maxlength="255" class="spinner formta">${helpData.remark}</textarea></td>
		</tr> --%>
	</table>
</form>

<script type="text/javascript">
	KindEditor.options.filterMode = false;
	KindEditor.ready(function(K) {
		K.each({
			'plug-align' : {
				name : '对齐方式',
				method : {
					'justifyleft' : '左对齐',
					'justifycenter' : '居中对齐',
					'justifyright' : '右对齐'
				}
			},
			'plug-order' : {
				name : '编号',
				method : {
					'insertorderedlist' : '数字编号',
					'insertunorderedlist' : '项目编号'
				}
			},
			'plug-indent' : {
				name : '缩进',
				method : {
					'indent' : '向右缩进',
					'outdent' : '向左缩进'
				}
			}
		},function( pluginName, pluginData ){
			var lang = {};
			lang[pluginName] = pluginData.name;
			KindEditor.lang( lang );
			KindEditor.plugin( pluginName, function(K) {
				var self = this;
				self.clickToolbar( pluginName, function() {
					var menu = self.createMenu({
							name : pluginName,
							width : pluginData.width || 100
						});
					K.each( pluginData.method, function( i, v ){
						menu.addItem({
							title : v,
							checked : false,
							iconClass : pluginName+'-'+i,
							click : function() {
								self.exec(i).hideMenu();
							}
						});
					})
				});
			});
		});
		K.create('#help_mgr_help_form_webHelpContent', {
			themeType : 'qq',
			allowFileManager : true,
			minWidth : "600px",
			uploadJson : '../resources/js/kindeditor/jsp/upload_json.jsp',
            fileManagerJson : '../resources/js/kindeditor/jsp/file_manager_json.jsp',
			afterBlur : function() {
				this.sync();
				K.ctrl(document, 13, function() {
					K('form[name=myform]')[0].submit();
				});
				K.ctrl(this.edit.doc, 13, function() {
					K('form[name=myform]')[0].submit();
				});
			},
			items : [
				'bold','italic','underline','fontname','fontsize','forecolor','hilitecolor','plug-align','plug-order','plug-indent','link','code','emoticons','flash','table','lineheight','fullscreen','image'
			]
		});
	});
	// 初始化新闻状态下拉框
	$('#help_mgr_help_form_webHelpStatus').combobox({  
		valueField : 'value',
		height:18,
		width:287,
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
