<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui" uri="http://com.glacier.permissions.com.cn/tag/easyui"%>

<script type="text/javascript">

	$.util.namespace('glacier.member_mgr.secretSecurity_mgr.secretSecurity');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)
	
	//定义toolbar的操作，对操作进行控制
	glacier.member_mgr.secretSecurity_mgr.secretSecurity.param = {
			toolbarId : 'secretSecurityDataGrid_toolbar',
			actions : {
				edit:{flag:'edit',controlType:'single'},
				del:{flag:'del',controlType:'multiple'}
			}
	};
	
	//初始化客服DataGrid
	glacier.member_mgr.secretSecurity_mgr.secretSecurity.secretSecurityDataGrid = $('#secretSecurityDataGrid').datagrid({
		fit:true,//控件自动resize占满窗口大小
		iconCls:'icon-save',//图标样式
		border:false,//是否存在边框
		fitColumns:true,//自动填充行
		nowrap: true,//禁止单元格中的文字自动换行
		autoRowHeight: false,//禁止设置自动行高以适应内容
		striped: true,//true就是把行条纹化。（即奇偶行使用不同背景色）
		singleSelect:true,//限制单选
		checkOnSelect:false,//选择复选框的时候选择该行
		selectOnCheck:false,//选择的时候复选框打勾
		url: ctx + '/do/secretSecurity/list.json',
		sortName: 'createTime',//排序字段名称
		sortOrder: 'DESC',//升序还是降序
		remoteSort: true,//开启远程排序，默认为false
		idField:'secretSecurityId',
		columns:[[
			{
				field:'secretSecurityId',
				title:'ID',
				checkbox:true
			},{
				field:'questionDes',
				title:'密保问题描述',
				width:120,
				sortable:true
			},{
				field:'memberRealName',
				title:'会员名称',
				width:120,
				sortable:true
			},{
				field:'answer',
				title:'密保问题答案',
				width:120,
				sortable:true
			},{
				field:'createTime',
				title:'创建时间',
				width:160,
				sortable:true
			}
		]],
		pagination : true,//True 就会在 datagrid 的底部显示分页栏
		psecretSecuritySize : 10,//注意，psecretSecuritySize必须在psecretSecurityList存在
		psecretSecurityList : [2,10,50,100],//从session中获取
		rownumbers:true,//True 就会显示行号的列
		toolbar:'#secretSecurityDataGrid_toolbar',
		onCheck:function(rowIndex,rowData){//选择行事件触发
			action_controller(glacier.member_mgr.secretSecurity_mgr.secretSecurity.param,this).check();
		},
		onCheckAll:function(rows){//取消勾选行状态触发事件
			action_controller(glacier.member_mgr.secretSecurity_mgr.secretSecurity.param,this).check();
		},
		onUncheck:function(rowIndex,rowData){//选择行事件触发
			action_controller(glacier.member_mgr.secretSecurity_mgr.secretSecurity.param,this).unCheck();
		},
		onUncheckAll:function(rows){//取消勾选行状态触发事件
			action_controller(glacier.member_mgr.secretSecurity_mgr.secretSecurity.param,this).unCheck();
		},
		onSelect:function(rowIndex, rowData){//选择行事件触发
			action_controller(glacier.member_mgr.secretSecurity_mgr.secretSecurity.param,this).select();
		},
		onUnselectAll:function(rows){
			action_controller(glacier.member_mgr.secretSecurity_mgr.secretSecurity.param,this).unSelect();
		},
		onLoadSuccess:function(index, record){//加载数据成功触发事件
			$(this).datagrid('clearSelections');
			$(this).datagrid('clearChecked');
			var rows=$(this).datagrid("getRows");
			if(rows.length==0){   
				var body = $(this).data().datagrid.dc.body2;
				body.find('table tbody').append('<tr><td width="' + body.width() + '" style="height: 25px; text-align: center;color:red">暂时没有记录</td></tr>');
			}
		},
		onDblClickRow:function(rowIndex, rowData){
			$.easyui.showDialog({
				title: '密保问题详细信息',
				href : ctx + '/do/secretSecurity/intoDetail.htm?secretSecurityId='+rowData.secretSecurityId,//从controller请求jsp页面进行渲染
				width : 325,
				height : 220,
				resizable: false,
				enableApplyButton : false,
				enableSaveButton : false
			});
		}
	});
	//点击删除按钮触发方法
	glacier.member_mgr.secretSecurity_mgr.secretSecurity.delSecretSecurity = function(){
		var rows = glacier.member_mgr.secretSecurity_mgr.secretSecurity.secretSecurityDataGrid.datagrid("getChecked");
		var secretSecurityIds = [];//删除的id标识
		var questionDess = [];//日志记录引用名称
		for(var i =0;i<rows.length;i++){
			secretSecurityIds.push(rows[i].secretSecurityId);
			questionDess.push(rows[i].questionDes);
		}
		if(secretSecurityIds.length > 0){
			$.messager.confirm('请确认', '是否要删除该记录', function(r){
				if (r){
					$.ajax({
						   type: "POST",
						   url: ctx + '/do/secretSecurity/del.json',
						   data: {secretSecurityIds:secretSecurityIds.join(','),questionDess:questionDess.join(',')},
						   dataType:'json',
						   success: function(r){
							   if(r.success){//因为失败成功的方法都一样操作，这里故未做处理
								   $.messager.show({
										title:'提示',
										timeout:3000,
										msg:r.msg
									});
								   glacier.member_mgr.secretSecurity_mgr.secretSecurity.secretSecurityDataGrid.datagrid('reload');
							   }else{
									$.messager.show({//后台验证弹出错误提示信息框
										title:'错误提示',
										width:380,
										height:120,
										msg: '<span style="color:red">'+r.msg+'<span>',
										timeout:4500
									});
								}
						   }
					});
				}
			});
		}
	};
	
</script>

<!-- 所有客服列表面板和表格 -->
<div class="easyui-layout" data-options="fit:true">
	<div id="secretSecurityGridPanel" data-options="region:'center',border:true" >
		<table id="secretSecurityDataGrid">
			<glacierui:toolbar panelEnName="SecretSecurityList" toolbarId="secretSecurityDataGrid_toolbar" menuEnName="secretSecurity"/><!-- 自定义标签：自动根据菜单获取当前用户权限，动态注册方法 -->
		</table>
	</div>
	
	
	<div data-options="region:'north',split:true"
		style="height: 40px; padding-left: 10px;">
		<form id="secretSearchForm">
			<table>
				<tr>
					<td>会员名称：</td>
					<td><input name="memberRealName" style="width: 80px;"
						class="spinner" /></td>
				  <td>创建时间：</td>
					<td><input name="createStartTime" class="easyui-datetimebox"
						style="width: 100px;" /> - <input name="createEndTime"
						class="easyui-datetimebox" style="width: 100px;" /></td>
					<td><a href="javascript:void(0);" class="easyui-linkbutton"
						data-options="iconCls:'icon-standard-zoom-in',plain:true"
						onclick="glacier.member_mgr.secretSecurity_mgr.secretSecurity.secretSecurityDataGrid.datagrid('load',glacier.serializeObject($('#secretSearchForm')));">查询</a>
						<a href="javascript:void(0);" class="easyui-linkbutton"
						data-options="iconCls:'icon-standard-zoom-out',plain:true"
						onclick="$('#secretSearchForm input').val('');glacier.member_mgr.secretSecurity_mgr.secretSecurity.secretSecurityDataGrid.datagrid('load',{});">重置条件</a>
					</td>
				</tr>
			</table>
		</form>
	</div>
</div>