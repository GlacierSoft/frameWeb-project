<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui" uri="http://com.glacier.permissions.com.cn/tag/easyui"%>

<script type="text/javascript">

	$.util.namespace('glacier.member_mgr.memberAuth_mgr.memberAuth');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)
	
	//定义toolbar的操作，对操作进行控制
	glacier.member_mgr.memberAuth_mgr.memberAuth.param = {
			toolbarId : 'memberAuthDataGrid_toolbar',
			actions : {
				auth:{flag:'auth',controlType:'single'},
				del:{flag:'del',controlType:'multiple'}
			}
	};
	
	//初始化客服DataGrid
	glacier.member_mgr.memberAuth_mgr.memberAuth.memberAuthDataGrid = $('#memberAuthDataGrid').datagrid({
		fit:true,//控件自动resize占满窗口大小
		iconCls:'icon-save',//图标样式
		border:false,//是否存在边框
		//fitColumns:true,//自动填充行
		fitColumns:false,//自动填充行,出现滚动条
		nowrap: true,//禁止单元格中的文字自动换行
		autoRowHeight: false,//禁止设置自动行高以适应内容
		striped: true,//true就是把行条纹化。（即奇偶行使用不同背景色）
		singleSelect:true,//限制单选
		checkOnSelect:false,//选择复选框的时候选择该行
		selectOnCheck:false,//选择的时候复选框打勾
		url: ctx + '/do/memberAuth/list.json',
		sortName: 'memberId',//排序字段名称
		sortOrder: 'DESC',//升序还是降序
		remoteSort: true,//开启远程排序，默认为false
		idField:'memberId',
		columns:[[
			{
				field:'memberId',
				title:'ID',
				checkbox:true
			},{
				field:'memberName',
				title:'会员名称',
				width:120,
				sortable:true
			},{
				field:'memberRealName',
				title:'会员真实名称',
				width:120,
				sortable:true
			},{
				field:'infoAuth',
				title:'基本资料认证状态',
				width:120,
				sortable:true,
				formatter: function(value,row,index){//数据格式化，例如man显示是，woman显示女
					return renderGridValue(value,fields.auths);
				}
			},{
				field:'vipAuth',
				title:'VIP认证状态',
				width:120,
				sortable:true,
				formatter: function(value,row,index){//数据格式化，例如man显示是，woman显示女
					return renderGridValue(value,fields.auths);
				}
			},{
				field:'emailAuth',
				title:'邮箱认证状态',
				width:120,
				sortable:true,
				formatter: function(value,row,index){//数据格式化，例如man显示是，woman显示女
					return renderGridValue(value,fields.auths);
				}
			},{
				field:'mobileAuth',
				title:'手机认证状态',
				width:120,
				sortable:true,
				formatter: function(value,row,index){//数据格式化，例如man显示是，woman显示女
					return renderGridValue(value,fields.auths);
				}
			},{
				field:'creditAuth',
				title:'信用认证状态',
				width:120,
				sortable:true,
				formatter: function(value,row,index){//数据格式化，例如man显示是，woman显示女
					return renderGridValue(value,fields.auths);
				}
			},{
				field:'companyAuth',
				title:'企业认证状态',
				width:120,
				sortable:true,
				formatter: function(value,row,index){//数据格式化，例如man显示是，woman显示女
					return renderGridValue(value,fields.auths);
				}
			},/* {
				field:'realNameAuth',
				title:'真实姓名认证状态',
				width:120,
				sortable:true,
				formatter: function(value,row,index){//数据格式化，例如man显示是，woman显示女
					return renderGridValue(value,fields.auths);
				}
			}, */{
				field:'idCardAuth',
				title:'身份证认证状态',
				width:120,
				sortable:true,
				formatter: function(value,row,index){//数据格式化，例如man显示是，woman显示女
					return renderGridValue(value,fields.auths);
				}
			},{
				field:'workAuth',
				title:'工作认证状态',
				width:120,
				sortable:true,
				formatter: function(value,row,index){//数据格式化，例如man显示是，woman显示女
					return renderGridValue(value,fields.auths);
				}
			}
		]],
		pagination : true,//True 就会在 datagrid 的底部显示分页栏
		pmemberSize : 10,//注意，pmemberSize必须在pmemberList存在
		pmemberList : [2,10,50,100],//从session中获取
		rownumbers:true,//True 就会显示行号的列
		toolbar:'#memberAuthDataGrid_toolbar',
		onCheck:function(rowIndex,rowData){//选择行事件触发
			action_controller(glacier.member_mgr.memberAuth_mgr.memberAuth.param,this).check();
		},
		onCheckAll:function(rows){//取消勾选行状态触发事件
			action_controller(glacier.member_mgr.memberAuth_mgr.memberAuth.param,this).check();
		},
		onUncheck:function(rowIndex,rowData){//选择行事件触发
			action_controller(glacier.member_mgr.memberAuth_mgr.memberAuth.param,this).unCheck();
		},
		onUncheckAll:function(rows){//取消勾选行状态触发事件
			action_controller(glacier.member_mgr.memberAuth_mgr.memberAuth.param,this).unCheck();
		},
		onSelect:function(rowIndex, rowData){//选择行事件触发
			action_controller(glacier.member_mgr.memberAuth_mgr.memberAuth.param,this).select();
		},
		onUnselectAll:function(rows){
			action_controller(glacier.member_mgr.memberAuth_mgr.memberAuth.param,this).unSelect();
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
				title: '【'+rowData.memberName+'】认证详细信息',
				href : ctx + '/do/memberAuth/intoDetail.htm?memberId='+rowData.memberId,//从controller请求jsp页面进行渲染
				width : 810,
				height : 486,
				border : true,
				resizable: false,
				enableApplyButton : false,
				enableSaveButton : false
			});
		}
	});

	//点击审核按钮触发方法
	glacier.member_mgr.memberAuth_mgr.memberAuth.authMemberAuth = function(){
		var row = glacier.member_mgr.memberAuth_mgr.memberAuth.memberAuthDataGrid.datagrid("getSelected");
/* 		glacier.basicAddOrEditDialog({
			title : '认证【'+row.memberName+'】',
			width : 835,
			height : 395,
			queryUrl : ctx + '/do/memberAuth/intoForm.htm',
			//submitUrl : ctx + '/do/memberAuth/auth.json',
			queryParams : {
				memberId : row.memberId
			},
			successFun : function (){
				glacier.member_mgr.memberAuth_mgr.memberAuth.memberAuthDataGrid.datagrid('reload');
			}
		}); */
		$.easyui.showDialog({
			id: 'memberAuthShow',
			title: '认证【'+row.memberName+'】',
			href : ctx + '/do/memberAuth/intoForm.htm?memberId='+row.memberId,//从controller请求jsp页面进行渲染
			width : 500,
			height : 380,
			border : true,
			resizable: false,
			enableApplyButton : false,
			enableSaveButton : false
		});
	};
	
	//点击增加按钮触发方法
	glacier.member_mgr.memberAuth_mgr.memberAuth.addMember = function(){
		glacier.basicAddOrEditDialog({
			title : '增加会员信息',
			width : 835,
			height : 395,
			queryUrl : ctx + '/do/memberAuth/intoForm.htm',
			submitUrl : ctx + '/do/memberAuth/add.json',
			successFun : function (){
				glacier.member_mgr.memberAuth_mgr.memberAuth.memberAuthDataGrid.datagrid('reload');
			}
		});
	};
	
	//点击编辑按钮触发方法
	glacier.member_mgr.memberAuth_mgr.memberAuth.editMember = function(){
		var row = glacier.member_mgr.memberAuth_mgr.memberAuth.memberAuthDataGrid.datagrid("getSelected");
		glacier.basicAddOrEditDialog({
			title : '编辑【'+row.memberAuthName+'】',
			width : 835,
			height : 395,
			queryUrl : ctx + '/do/memberAuth/intoForm.htm',
			//submitUrl : ctx + '/do/memberAuth/edit.json',
			//queryParams : {
			//	memberId : row.memberId
			//},
			successFun : function (){
				glacier.member_mgr.memberAuth_mgr.memberAuth.memberAuthDataGrid.datagrid('reload');
			}
		});
	};
	//点击删除按钮触发方法
	glacier.member_mgr.memberAuth_mgr.memberAuth.delMember = function(){
		var rows = glacier.member_mgr.memberAuth_mgr.memberAuth.memberAuthDataGrid.datagrid("getChecked");
		var memberIds = [];//删除的id标识
		var memberNames = [];//客服主题
		for(var i=0;i<rows.length;i++){
			memberIds.push(rows[i].memberId);
			memberNames.push(rows[i].memberName);
		}
		if(memberIds.length > 0){
			$.messager.confirm('请确认', '是否要删除该记录', function(r){
				if (r){
					$.ajax({
						   type: "POST",
						   url: ctx + '/do/member/del.json',
						   data: {memberIds:memberIds.join(','),memberNames:memberNames.join(',')},
						   dataType:'json',
						   success: function(r){
							   if(r.success){//因为失败成功的方法都一样操作，这里故未做处理
								   $.messager.show({
										title:'提示',
										timeout:3000,
										msg:r.msg
									});
								   glacier.member_mgr.memberAuth_mgr.memberAuth.memberAuthDataGrid.datagrid('reload');
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
	//下拉项的值
	$('#memberAuthSearchForm_authType').combobox({  
		valueField : 'value',
		//height:18,
		width:100,
		textField : 'label',
		panelHeight : 'auto',
		editable : false,
		//required:true,
		data : fields.authType
	});
	$('#memberAuthSearchForm_auths').combobox({  
		valueField : 'value',
		//height:18,
		width:100,
		textField : 'label',
		panelHeight : 'auto',
		editable : false,
		//required:true,
		data : fields.auths
	});
</script>

<!-- 所有客服列表面板和表格 -->
<div class="easyui-layout" data-options="fit:true">
	<div id="memberGridPanel" data-options="region:'center',border:true" >
		<table id="memberAuthDataGrid">
			<glacierui:toolbar panelEnName="MemberAuthList" toolbarId="memberAuthDataGrid_toolbar" menuEnName="memberAuth"/><!-- 自定义标签：自动根据菜单获取当前用户权限，动态注册方法 -->
		</table>
	</div>
	<div data-options="region:'north',split:true" style="height:40px;padding-left:10px;">
		<form id="memberAuthSearchForm">
			<table>
				<tr>
					<td>会员名称：</td>
					<td><input name="memberName" style="width: 80px;" class="spinner"/></td>
					<td>会员真实姓名：</td>
					<td><input name="memberRealName" style="width: 80px;" class="spinner"/></td>
					<td>认证：</td>
					<td><input id="memberAuthSearchForm_authType" name="authType" class="spinner"/></td>
					<td>状态：</td>
					<td><input id="memberAuthSearchForm_auths" name="auths" class="spinner"/></td>
					
					<td>
						<a href="javascript:void(0);" class="easyui-linkbutton" data-options="iconCls:'icon-standard-zoom-in',plain:true" onclick="glacier.member_mgr.memberAuth_mgr.memberAuth.memberAuthDataGrid.datagrid('load',glacier.serializeObject($('#memberAuthSearchForm')));">查询</a>
						<a href="javascript:void(0);" class="easyui-linkbutton" data-options="iconCls:'icon-standard-zoom-out',plain:true" onclick="$('#memberAuthSearchForm input').val('');glacier.member_mgr.memberAuth_mgr.memberAuth.memberAuthDataGrid.datagrid('load',{});">重置条件</a>
					</td>
				</tr>
			</table>
		</form>
	</div>
</div>