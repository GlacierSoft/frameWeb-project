<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form  method="post" style="padding:15px">
	<table class="formtable">
		<tr>
			<td>新闻主题：</td>
			<td>
				<input type="hidden" id="news_mgr_news_form_webNewsId" name="webNewsId" value="${newsData.webNewsId}" />
				<input id="news_mgr_news_form_webNewsTheme" name="webNewsTheme" class="easyui-validatebox spinner" style="width:598px" required="true" maxlength="50" value="${newsData.webNewsTheme}"/>
			</td>
		</tr>
		<tr>
			<td>新闻状态：</td>
			<td>
				<input id="news_mgr_news_form_webNewsStatus" name="webNewsStatus" value="${newsData.webNewsStatus}" class="easyui-combobox" style="height:18px;width:600px" data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.status"/>
			</td>
		</tr>
		<tr>
			<td>新闻排序：</td>
			<td>
				<input name="webNewsNum" class="easyui-numberspinner spinner" value="${newsData.webNewsNum}" data-options="min:0,max:999,missingMessage:'请输入新闻排序'" value="10" style="width: 600px;height:18px;" min="1" max="999"/>
			</td>
		</tr>
		<tr>
			<td>新闻内容：</td>
			<td>
				<textarea id="news_mgr_news_form_webNewsContent" name="webNewsContent" style="width:600px;height:280px;">
					${newsData.webNewsContent}
				</textarea>
			</td>
		</tr>
	</table>
</form>
<script>
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
		K.create('#news_mgr_news_form_webNewsContent', {
			themeType : 'qq',
			allowFileManager : true,
			minWidth : "600px",
			uploadJson : '../resources/js/kindeditor/jsp/upload_json.jsp',
            fileManagerJson : '../resources/js/kindeditor/jsp/file_manager_json.jsp',
            allowFileManager : true,
            urlType:'domain',
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
</script>
