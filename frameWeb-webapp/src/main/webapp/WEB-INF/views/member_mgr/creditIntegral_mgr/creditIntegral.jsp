<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui" uri="http://com.glacier.permissions.com.cn/tag/easyui"%>

<script type="text/javascript">

	$.util.namespace('glacier.member_mgr.creditIntegral_mgr.creditIntegral');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)
	
	//定义toolbar的操作，对操作进行控制
	glacier.member_mgr.creditIntegral_mgr.creditIntegral.param = {
			toolbarId : 'creditIntegralDataGrid_toolbar',
			actions : {
				edit:{flag:'edit',controlType:'single'},
				del:{flag:'del',controlType:'multiple'}
			}
	};
	
	//初始化会员信用积分DataGrid
	glacier.member_mgr.creditIntegral_mgr.creditIntegral.creditIntegralDataGrid = $('#creditIntegralDataGrid').datagrid({
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
		url: ctx + '/do/creditIntegral/list.json',
		sortName: 'createTime',//排序字段名称
		sortOrder: 'DESC',//升序还是降序
		remoteSort: true,//开启远程排序，默认为false
		idField:'creditIntegralId',
		columns:[[
			{
				field:'creditIntegralId',
				title:'ID',
				checkbox:true
			},{
				field:'memberRealName',
				title:'会员名称',
				width:120,
				sortable:true
			},{
				field:'integralType',
				title:'信用类型',
				width:120,
				sortable:true,
				formatter: function(value,row,index){//数据格式化，例如('borrow'借款,'invest'投资)
					return renderGridValue(value,fields.creditIntegralType);
				}
			},{
				field:'changeType',
				title:'改变类型',
				width:120,
				sortable:true,
				formatter: function(value,row,index){//数据格式化，例如('increase'增加,'reduction'减少)
					return renderGridValue(value,fields.changeType);
				}
			},{
				field:'changeValue',
				title:'改变值',
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
		pcreditIntegralSize : 10,//注意，pcreditIntegralSize必须在pcreditIntegralList存在
		pcreditIntegralList : [2,10,50,100],//从session中获取
		rownumbers:true,//True 就会显示行号的列
		toolbar:'#creditIntegralDataGrid_toolbar',
		onCheck:function(rowIndex,rowData){//选择行事件触发
			action_controller(glacier.member_mgr.creditIntegral_mgr.creditIntegral.param,this).check();
		},
		onCheckAll:function(rows){//取消勾选行状态触发事件
			action_controller(glacier.member_mgr.creditIntegral_mgr.creditIntegral.param,this).check();
		},
		onUncheck:function(rowIndex,rowData){//选择行事件触发
			action_controller(glacier.member_mgr.creditIntegral_mgr.creditIntegral.param,this).unCheck();
		},
		onUncheckAll:function(rows){//取消勾选行状态触发事件
			action_controller(glacier.member_mgr.creditIntegral_mgr.creditIntegral.param,this).unCheck();
		},
		onSelect:function(rowIndex, rowData){//选择行事件触发
			action_controller(glacier.member_mgr.creditIntegral_mgr.creditIntegral.param,this).select();
		},
		onUnselectAll:function(rows){
			action_controller(glacier.member_mgr.creditIntegral_mgr.creditIntegral.param,this).unSelect();
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
				title: '【'+rowData.memberRealName+'】信用记录详细信息',
				href : ctx + '/do/creditIntegral/intoDetail.htm?creditIntegralId='+rowData.creditIntegralId,//从controller请求jsp页面进行渲染
				width : 530,
				height : 270,
				resizable: false,
				enableApplyButton : false,
				enableSaveButton : false
			});
		}
	});
 
	//下拉项的值
	$('#memberCreditIntegralSearchForm_integralType').combobox({  
		valueField : 'value',
		height:18,
		width:130,
		textField : 'label',
		panelHeight : 'auto',
		editable : false,
		//required:true,
		data : fields.creditIntegralType
	});
	$('#memberCreditIntegralSearchForm_changeType').combobox({  
		valueField : 'value',
		height:18,
		width:80,
		textField : 'label',
		panelHeight : 'auto',
		editable : false,
		//required:true,
		data : fields.changeType
	});
	
</script>

<!-- 所有会员信用积分列表面板和表格 -->
<div class="easyui-layout" data-options="fit:true">
 	<div id="creditIntegralGridPanel" data-options="region:'center',border:true" >
		<table id="creditIntegralDataGrid">
		<!--  <glacierui:toolbar panelEnName="CreditIntegralList" toolbarId="creditIntegralDataGrid_toolbar" menuEnName="creditIntegral"/>自定义标签：自动根据菜单获取当前用户权限，动态注册方法 -->
		</table>
	</div>  
	<div data-options="region:'north',split:true" style="height:40px;padding-left:10px;">
		<form id="memberCreditIntegralSearchForm">
			<table>
				<tr>
					<td>会员名称：</td>
					<td><input name="memberRealName" style="width: 80px;" class="spinner"/></td>
					<td>信用类型：</td>
					<td><input id="memberCreditIntegralSearchForm_integralType" name="integralType" style="width: 80px;" class="spinner"/></td>
					<td>改变类型：</td>
					<td><input id="memberCreditIntegralSearchForm_changeType" name="changeType" style="width: 80px;" class="spinner"/></td>
					<td>录入时间：</td>
					<td>
						<input name="createStartTime" class="easyui-datetimebox" style="width: 150px;" />
						-
						<input name="createEndTime" class="easyui-datetimebox" style="width: 150px;" />
					</td>
					<td>
						<a href="javascript:void(0);" class="easyui-linkbutton" data-options="iconCls:'icon-standard-zoom-in',plain:true" onclick="glacier.member_mgr.creditIntegral_mgr.creditIntegral.creditIntegralDataGrid.datagrid('load',glacier.serializeObject($('#memberCreditIntegralSearchForm')));">查询</a>
						<a href="javascript:void(0);" class="easyui-linkbutton" data-options="iconCls:'icon-standard-zoom-out',plain:true" onclick="$('#memberCreditIntegralSearchForm input').val('');glacier.member_mgr.creditIntegral_mgr.creditIntegral.creditIntegralDataGrid.datagrid('load',{});">重置条件</a>
					</td>
				</tr>
			</table>
		</form>
	</div>
</div>