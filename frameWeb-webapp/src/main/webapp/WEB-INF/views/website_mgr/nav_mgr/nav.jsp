<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui" uri="http://com.glacier.permissions.com.cn/tag/easyui"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<script type="text/javascript">

	$.util.namespace('glacier.website_mgr.nav_mgr.nav');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)
	
	//定义toolbar的操作，对操作进行控制
	glacier.website_mgr.nav_mgr.nav.navParam = {
			toolbarId : 'navTreeGridToolbar',
			actions : {
				edit:{flag:'edit',controlType:'single'},
				del:{flag:'del',controlType:'single'}
			}
	};
		
	//初始化资源菜单navTreeGrid
	glacier.website_mgr.nav_mgr.nav.navTreeGrid = $('#navTreeGrid').treegrid({
		fit:true,//控件自动navize占满窗口大小
		border:false,//是否存在边框
		fitColumns:true,//自动填充行
		autoRowHeight: false,//禁止设置自动行高以适应内容
		url : ctx + '/do/nav/list.json',//请求的URL
		idField : 'webNavId',
		treeField : 'webNavName',//定义树节点字段
		parentField : 'webNavPid',//treegrid父节点
		smooth: true,//该属性用以启用当前 easyui-treegrid 控件对平滑数据格式的支持,默认使用字段pid,可自定义
		enableHeaderClickMenu: false,//启用表头菜单
        enableHeaderContextMenu: true,//启用表头右键菜单
        enableRowContextMenu: false,//启用表行右键菜单
		rowTooltip: false, //表行数据提示
		toolbar : '#navTreeGridToolbar',
		onSelect:function(rowData){//选择行事件触发
			action_controller(glacier.website_mgr.nav_mgr.nav.navParam,this).select();
		},
		onUnselectAll:function(rows){//取消选择行状态触发事件
			action_controller(glacier.website_mgr.nav_mgr.nav.navParam,this).unSelect();
		},
		onLoadSuccess:function(index, record){//加载数据成功触发事件
			$.fn.treegrid.extensions.onLoadSuccess.apply(this, arguments);//这句一定要加上
			$(this).treegrid('unselectAll');
		},
		onDblClickRow: function(row){
			glacier.website_mgr.nav_mgr.nav.navDetails(row);
		},
		frozenColumns : [ [{//冻结列，当表格宽度压缩展示不全时候，该列不会缩小
			field : 'webNavId' , title : 'ID' , hidden:true
		},{
			field : 'webNavName' , title : '导航' , width : 300
		}]],
		columns : [ [{
			field : 'webNavUrl' , title : '导航url' , width : 300
		},{
			field : 'webNavNum' , title : '排序' , width : 150
		},{
			field : 'webNavStatus' , title : '状态' , width : 150 ,
			formatter: function(value,row,index){//数据格式化，例如man显示是，woman显示女
				return renderGridValue(value,fields.status);
			}
		},{
			field : 'remark' , title : '备注' , width : 150
		}]]
	});
	
	//点击增加按钮触发方法
	glacier.website_mgr.nav_mgr.nav.addNav = function(){
		glacier.basicAddOrEditDialog({
			title : '【导航信息】- 增加',
			width : 380,
			height : 328,
			queryUrl : ctx + '/do/nav/intoForm.htm',
			submitUrl : ctx + '/do/nav/add.json',
			successFun : function (){
				glacier.website_mgr.nav_mgr.nav.navTreeGrid.treegrid('reload');
			}
		});
	};
	
	//点击编辑按钮触发方法
	glacier.website_mgr.nav_mgr.nav.editNav = function(){
		var row = glacier.website_mgr.nav_mgr.nav.navTreeGrid.treegrid("getSelected");
		glacier.basicAddOrEditDialog({
			title : '【导航信息】- 编辑('+row.webNavName+')',
			width : 380,
			height : 328,
			queryUrl : ctx + '/do/nav/intoForm.htm',
			submitUrl : ctx + '/do/nav/edit.json',
			queryParams : {
				webNavId : row.webNavId
			},
			successFun : function (){
				glacier.website_mgr.nav_mgr.nav.navTreeGrid.treegrid('reload');
			}
		});
	};
	//点击删除按钮触发方法
	glacier.website_mgr.nav_mgr.nav.delNav = function(){
		var row = glacier.website_mgr.nav_mgr.nav.navTreeGrid.treegrid("getSelected");
		$.messager.confirm('请确认', '是否要删除所选导航，删除后不可恢复!', function(r){
			if (r){
				$.ajax({
					   type: "POST",
					   url: ctx + '/do/nav/del.json',
					   data: row,
					   dataType:'json',
					   success: function(r){
						   if(r.success){//操作成功刷新列表
							   $.messager.show({
									title:'提示',
									msg:r.msg,
									icon:'info',
									showType:'fade'
								});
							   glacier.website_mgr.nav_mgr.nav.navTreeGrid.treegrid('reload');
						   }else{
							   $.messager.show({
									title:'提示',
									msg:r.msg,
									icon:'error',
									showType:'fade'
								});
						   }
					   }
				});
			}
		});
	};
	//双击查看下拉项详细信息
	glacier.website_mgr.nav_mgr.nav.navDetails = function(row){
		$('<div/>').dialog({
			href : ctx + '/do/nav/intoDetail.htm?webNavId='+row.webNavId,//从controller请求jsp页面进行渲染
			width : 550,
			height : 285,
			modal : true,
			resizable: false,
			title : "【"+row.webNavName+"】的导航详细信息",
			onClose : function() {//提高浏览器性能，点击关闭窗口时候注销
				$(this).dialog('destroy');
			},
			onLoad : function() {
				$('#nav_mgr_nav_details').form('load', row);
			}
		});
	};
</script>

<!-- 所有导航列表面板和表格 -->
<div class="easyui-layout" data-options="fit:true">
   		<div id="navGridPanel" data-options="region:'center',border:true" >
   			<table id="navTreeGrid">
	    		<glacierui:toolbar panelEnName="NavTree" toolbarId="navTreeGridToolbar" menuEnName="nav"/><!-- 自定义标签：自动根据菜单获取当前用户权限，动态注册方法 -->
	    	</table>
   		</div>
</div>
