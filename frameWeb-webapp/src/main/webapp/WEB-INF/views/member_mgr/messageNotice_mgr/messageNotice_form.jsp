<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %> 
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form method="post" style="padding:15px">
	<table class="formtable">
		<tr>
			<td>发件人：</td>
			<td colspan="3">
				<input type="hidden" id="messageNotice_mgr_messageNotice_form_messageNoticeId" name="messageNoticeId" value="${messageNoticeData.messageNoticeId}"  />
				<!-- <input id="messageNotice_mgr_messageNotice_form_sender" name="sender" style="width:590px" value="" readonly="readonly"/> -->
				<shiro:principal property="userCnName"/>
			</td>
		</tr>
		<tr>
			<td>收件人：</td>
			<td>
				<input id="messageNotice_mgr_messageNotice_form_addressee" style="width:268px;" name="addressee" value="${messageNoticeData.addressee}"/>
			</td>
		</tr>
		<tr>
			<td>信件状态：</td>
			<td>
				<input id="messageNotice_mgr_messageNotice_form_letterstatus" style="width:268px;" name="letterstatus" value="${messageNoticeData.letterstatus}"/>
			</td>
		</tr>
		<tr>
			<td>标题：</td>
			<td>
			<input id="messageNotice_mgr_messageNotice_form_title" name="title"  style="width:268px;height: 18px" value="${messageNoticeData.title}" class="easyui-validatebox spinner"  required="true"  validType="length[1,12]" invalidMessage="标题必须在1到12个字符之间"/>
			</td>
		</tr>
		<tr>
			<td>内容：</td>
			<td>
				<textarea id="messageNotice_mgr_messageNotice_form_content" name="content" style="width:268px;" class="spinner formta">${messageNoticeData.content}</textarea>
			</td>
		</tr>
	</table>
</form>

<script type="text/javascript">
	//初始化新闻状态下拉框
	$('#messageNotice_mgr_messageNotice_form_letterstatus').combobox({  
		valueField : 'value',
		height:21,
		width:268,
		textField : 'label',
		panelHeight : 'auto',
		editable : false,
		required:true,
		data : fields.letterstatus
	});
	//用于combogrid的客户信息绑定
	$('#messageNotice_mgr_messageNotice_form_addressee').combogrid({
		panelWidth:450, 
		fit:true,//控件自动resize占满窗口大小
		//iconCls:'icon-save',//图标样式
		border:false,//是否存在边框
		fitColumns:true,//自动填充行
		nowrap: true,//禁止单元格中的文字自动换行
		autoRowHeight: false,//禁止设置自动行高以适应内容
		striped: true,//true就是把行条纹化。（即奇偶行使用不同背景色）
		singleSelect:true,//限制单选
		checkOnSelect:false,//选择复选框的时候选择该行
		selectOnCheck:false,//选择的时候复选框打勾
	    value:'${messageNoticeData.addressee}',    
	    idField:'memberId',    
	    textField:'memberName',    
	    url: ctx + '/do/member/list.json',
	    sortName: 'createTime',//排序字段名称
		sortOrder: 'ASC',//升序还是降序
		remoteSort: true,//开启远程排序，默认为false
		required : true,
	    columns : [ [ 
   		{
   			field:'memberId',
   			title:'ID',
   			checkbox:true
   		},{
   			field : 'memberName',
   			title : '会员姓名',
   			width : 80,
   			sortable:true
   		}, {
   			field : 'sex',
   			title : '客户性别',
   			width : 60,
   			sortable:true,
   			formatter: function(value,row,index){//数据格式化，例如man显示是，woman显示女
   				return renderGridValue(value,fields.sex);
   			}
   		}, {
   			field : 'mobileNumber',
   			title : '手机号码',
   			width : 100,
   			sortable:true
   		}, {
   			field : 'cardId',
   			title : '身份证号码',
   			width : 150,
   			sortable:true
   		} ] ],
   		pagination : true,//True 就会在 datagrid 的底部显示分页栏
   		pageSize : 10,//注意，pageSize必须在pageList存在
   		pageList : [2,10,50,100],//从session中获取
   		rownumbers : true,//True 就会显示行号的列
		loadMsg : '数据加载中....',
		mode : 'remote',
		delay : 200
	});
</script>
