<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui" uri="http://com.glacier.permissions.com.cn/tag/easyui"%>

<script type="text/javascript">

	$.util.namespace('glacier.website_mgr.service_mgr.service');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)
	
	//定义toolbar的操作，对操作进行控制
	glacier.website_mgr.service_mgr.service.param = {
			toolbarId : 'serviceDataGrid_toolbar',
			actions : {
				edit:{flag:'edit',controlType:'single'},
				del:{flag:'del',controlType:'multiple'}
			}
	};
	
	//初始化客服DataGrid
	glacier.website_mgr.service_mgr.service.serviceDataGrid = $('#serviceDataGrid').datagrid({
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
		url: ctx + '/do/service/list.json',
		sortName: 'webServiceNum',//排序字段名称
		sortOrder: 'desc',//升序还是降序
		remoteSort: true,//开启远程排序，默认为false
		idField:'webServiceId',
		columns:[[
			{
				field:'webServiceId',
				title:'ID',
				checkbox:true
			},{
				field:'webServiceName',
				title:'客服名称',
				width:180,
				sortable:true
			},{
				field:'webServiceQq',
				title:'QQ号',
				width:180,
				sortable:true
			},{
				field:'webServicePhoto',
				title:'客服头像',
				width:120,
				sortable:true
			},{
				field:'webServiceStatus',
				title:'客服状态',
				width:120,
				sortable:true,
				formatter: function(value,row,index){//数据格式化，例如man显示是，woman显示女
					return renderGridValue(value,fields.status);
				}
			},{
				field:'webServiceNum',
				title:'序号',
				width:120,
				sortable:true
			},{
				field:'accessory',
				title:'附件',
				width:120,
				sortable:true
			},{
				field:'remark',
				title:'备注',
				width:120,
				sortable:true
			},{
				field:'createrDisplay',
				title:'创建人',
				sortable:true,
				width:100
			},{
				field:'createTime',
				title:'创建时间',
				sortable:true,
				width:200
			},{
				field:'updaterDisplay',
				title:'更新人',
				sortable:true,
				width:100
			},{
				field:'updateTime',
				title:'更新时间',
				sortable:true,
				width:200
			}
		]],
		pagination : true,//True 就会在 datagrid 的底部显示分页栏
		pserviceSize : 10,//注意，pserviceSize必须在pserviceList存在
		pserviceList : [2,10,50,100],//从session中获取
		rownumbers:true,//True 就会显示行号的列
		toolbar:'#serviceDataGrid_toolbar',
		onCheck:function(rowIndex,rowData){//选择行事件触发
			action_controller(glacier.website_mgr.service_mgr.service.param,this).check();
		},
		onCheckAll:function(rows){//取消勾选行状态触发事件
			action_controller(glacier.website_mgr.service_mgr.service.param,this).check();
		},
		onUncheck:function(rowIndex,rowData){//选择行事件触发
			action_controller(glacier.website_mgr.service_mgr.service.param,this).unCheck();
		},
		onUncheckAll:function(rows){//取消勾选行状态触发事件
			action_controller(glacier.website_mgr.service_mgr.service.param,this).unCheck();
		},
		onSelect:function(rowIndex, rowData){//选择行事件触发
			action_controller(glacier.website_mgr.service_mgr.service.param,this).select();
		},
		onUnselectAll:function(rows){
			action_controller(glacier.website_mgr.service_mgr.service.param,this).unSelect();
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
				title: "【"+rowData.webServiceName+"】的客服服务详细信息",
				href : ctx + '/do/service/intoDetail.htm?webServiceId='+rowData.webServiceId,//从controller请求jsp页面进行渲染
				width : 550,
				height : 315,
				resizable: false,
				enableApplyButton : false,
				enableSaveButton : false
			});
		}
	});

	// 增加客服
	glacier.website_mgr.service_mgr.service.addService = function(){
		glacier.website_mgr.service_mgr.service.newServiceDialog('【客服服务】- 增加客服',false,'/do/service/add.json');
	};
	//编辑客服
	glacier.website_mgr.service_mgr.service.editService = function(){
		glacier.website_mgr.service_mgr.service.newServiceDialog('【客服服务】- 编辑客服',true,'/do/service/edit.json');
	};
	/**
		打开新建或者编辑窗口
		title:要打开的窗口标题
		editModel: true or false ，是否复制当前选择行数据到form中
		url:点击保存按钮请求的url
	*/
	glacier.website_mgr.service_mgr.service.newServiceDialog = function(title,editModel,url){
		$.easyui.showDialog({
			href : ctx + '/do/service/intoForm.htm',//从controller请求jsp页面进行渲染
			width : 420,
			height : 400,
			resizable: false,
			enableSaveButton : false,
			enableApplyButton : false,
			title : title,
			buttons : [{
				text : '保存',
				iconCls : 'icon-save',
				handler : function(dia) {
					$('#service_mgr_service_form').form('submit', {
						url: ctx + url,
						success: function(r){
							glacier.show({msg:r.msg,result:r.success});
							glacier.website_mgr.service_mgr.service.serviceDataGrid.datagrid('reload');
						    dia.dialog("close"); 
						}
					});
				}
			}],
			onLoad : function() {
				if(editModel){//编辑模式
					var row = glacier.website_mgr.service_mgr.service.serviceDataGrid.datagrid("getSelected");
					if(row){
						$('#service_mgr_service_form').form('load', row );
					}else{
						$.messager.show({//提示用户
							title : '提示',
							timeout:3000,
							msg : '请选择一行数据进行编辑'
						});
					}
				}
			}
		});
	};
	
	//点击删除按钮触发方法
	glacier.website_mgr.service_mgr.service.delService = function(){
		var rows = glacier.website_mgr.service_mgr.service.serviceDataGrid.datagrid("getChecked");
		var webServiceIds = [];//删除的id标识
		var webServiceNames = [];//客服主题
		for(var i=0;i<rows.length;i++){
			webServiceIds.push(rows[i].webServiceId);
			webServiceNames.push(rows[i].webServiceName);
		}
		if(webServiceIds.length > 0){
			$.messager.confirm('请确认', '是否要删除该记录', function(r){
				if (r){
					$.ajax({
						   type: "POST",
						   url: ctx + '/do/service/del.json',
						   data: {webServiceIds:webServiceIds.join(','),webServiceNames:webServiceNames.join(',')},
						   dataType:'json',
						   success: function(r){
							   if(r.success){//因为失败成功的方法都一样操作，这里故未做处理
								   $.messager.show({
										title:'提示',
										timeout:3000,
										msg:r.msg
									});
								   glacier.website_mgr.service_mgr.service.serviceDataGrid.datagrid('reload');
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
	//客服资料模糊查询
	glacier.website_mgr.service_mgr.service.quickquery = function(value,name){
		var obj = $.parseJSON('{"'+name+'":"'+value+'"}');//将值和对象封装成obj作为参数传递给后台
		glacier.website_mgr.service_mgr.service.serviceDataGrid.datagrid('load',obj);
	};
	
</script>

<!-- 所有客服列表面板和表格 -->
<div class="easyui-layout" data-options="fit:true">
	<div id="serviceGridPanel" data-options="region:'center',border:true" >
		<table id="serviceDataGrid">
			<glacierui:toolbar panelEnName="ServiceList" toolbarId="serviceDataGrid_toolbar" menuEnName="service"/><!-- 自定义标签：自动根据菜单获取当前用户权限，动态注册方法 -->
		</table>
	</div>
</div>