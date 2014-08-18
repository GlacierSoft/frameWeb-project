<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form id="member_mgr_memberAuth_form" method="post" style="padding:15px">
<div title="基础资料认证" style="padding:15px;">
    	<fieldset id="member_mgr_memberAuth_form_memberAuthGenfieldset" style="padding:10px;" class="spinner">
			<legend>基础资料认证</legend>  
			<table  class="detailtable">
					<tr>
						<td>认证名称：</td>
						<td><input id="member_mgr_memberAuth_form_infoName" name="infoName" class="spinner" style="width:168px" value="${memberAuthData.infoName}"  readonly="readonly"/></td>
						<td style="padding-left:10px;">认证状态：</td>
						<td ><input id="member_mgr_memberAuth_form_infoAuth" name="infoAuth" class="spinner" style="width:168px" value="${memberAuthData.infoAuth}" readonly="readonly"/></td>
					<tr>
						<td>审核人：</td>
						<td><input id="member_mgr_memberAuth_form_infoAuditorDisplay" name="infoAuditorDisplay" class="spinner" style="width:168px" value="${memberAuthData.infoAuditorDisplay}" readonly="readonly"/></td>
					 	<td style="padding-left:10px;">审核时间：</td>
						<td><input id="member_mgr_memberAuth_form_infoTime" name="infoTime" class="spinner" style="width:168px" value="<fmt:formatDate value="${memberAuthData.infoTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
					</tr>
					<tr>
						<td>序号：</td>
						<td ><input id="member_mgr_memberAuth_form_infoNum" name="infoNum" class="spinner" style="width:168px;" value="${memberAuthData.infoNum}" readonly="readonly"/></td>
					<tr>
						<td>审核说明：</td>
						<td colspan="3"><textarea class="spinner" style="width:600px" readonly="readonly">${memberAuthData.infoRemark}</textarea></td>
					</tr>
					<%-- <tr>
						<td>附件：</td>
						<td colspan="3"><textarea id="member_mgr_memberAuth_form_infoAccessory" name="infoAccessory" class="spinner" style="width:600px;height:280px;" readonly="readonly">${memberAuthData.infoAccessory}</textarea></td>
					</tr> --%>
					<tr id="member_mgr_memberAuth_form_info">
						<td>查看会员信息明细：</td>
						<td><a id="infoAuthbtn1" href="#" class="easyui-linkbutton" data-options="">查看</a></td>
					</tr>
				</table>
		</fieldset>
    </div>
     <div title="VIP认证" style="padding:15px">
    	<fieldset id="member_mgr_memberAuth_form_memberAuthGenfieldset" style="padding:10px;" class="spinner">
			<legend>VIP认证</legend>  
			<table  class="detailtable" style="width: 712px">
					<tr>
						<td>认证名称：</td>
						<td><input id="member_mgr_memberAuth_form_vipName" name="vipName" class="spinner" style="width:168px" value="${memberAuthData.vipName}"  readonly="readonly"/></td>
						<td style="padding-left:10px;">认证状态：</td>
						<td ><input id="member_mgr_memberAuth_form_vipAuth" name="vipAuth" class="spinner" style="width:168px" value="${memberAuthData.vipAuth}" readonly="readonly"/></td>
					<tr>
						<td>审核人：</td>
						<td><input id="member_mgr_memberAuth_form_vipAuditorDisplay" name="vipAuditorDisplay" class="spinner" style="width:168px" value="${memberAuthData.vipAuditorDisplay}" readonly="readonly"/></td>
						<td style="padding-left:10px;">审核时间：</td>
						<td><input id="member_mgr_memberAuth_form_vipTime" name="vipTime" class="spinner" style="width:168px" value="<fmt:formatDate value="${memberAuthData.vipTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
					</tr>
					<tr>
						<td>序号：</td>
						<td ><input id="member_mgr_memberAuth_form_vipNum" name="vipNum" class="spinner" style="width:168px;" value="${memberAuthData.vipNum}" readonly="readonly"/></td>
					<tr>
						<td>审核说明：</td>
						<td colspan="3"><textarea class="spinner" style="width:600px" readonly="readonly">${memberAuthData.vipRemark}</textarea></td>
					</tr>
					<tr>
						<td>附件：</td>
						<td colspan="3"><textarea id="member_mgr_memberAuth_form_vipAccessory" name="vipAccessory" class="spinner" style="width:600px;height:140px;" readonly="readonly">${memberAuthData.vipAccessory}</textarea></td>
					</tr>
				</table>
		</fieldset>
    </div>
    <div title="邮件认证" style="padding:15px">
    	<fieldset id="member_mgr_memberAuth_form_memberAuthGenfieldset" style="padding:10px;" class="spinner">
			<legend>邮件认证</legend>  
			<table  class="detailtable" style="width: 712px">
					<tr>
						<td>认证名称：</td>
						<td><input id="member_mgr_memberAuth_form_emailName" name="emailName" class="spinner" style="width:168px" value="${memberAuthData.emailName}"  readonly="readonly"/></td>
						<td style="padding-left:10px;">认证状态：</td>
						<td ><input id="member_mgr_memberAuth_form_emailAuth" name="emailAuth" class="spinner" style="width:168px" value="${memberAuthData.emailAuth}" readonly="readonly"/></td>
					<tr>
						<td>审核人：</td>
						<td><input id="member_mgr_memberAuth_form_emailAuditorDisplay" name="emailAuditorDisplay" class="spinner" style="width:168px" value="${memberAuthData.emailAuditorDisplay}" readonly="readonly"/></td>
						<td style="padding-left:10px;">审核时间：</td>
						<td><input id="member_mgr_memberAuth_form_emailTime" name="emailTime" class="spinner" style="width:168px" value="<fmt:formatDate value="${memberAuthData.emailTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
					</tr>
					<tr>
						<td>序号：</td>
						<td ><input id="member_mgr_memberAuth_form_emailNum" name="emailNum" class="spinner" style="width:168px;" value="${memberAuthData.emailNum}" readonly="readonly"/></td>
					<tr>
						<td>审核说明：</td>
						<td colspan="3"><textarea class="spinner" style="width:600px" readonly="readonly">${memberAuthData.emailRemark}</textarea></td>
					</tr>
					<%-- <tr>
						<td>附件：</td>
						<td colspan="3"><textarea id="member_mgr_memberAuth_form_emailAccessory" name="emailAccessory" class="spinner" style="width:600px;height:280px;" readonly="readonly">${memberAuthData.emailAccessory}</textarea></td>
					</tr> --%>
				</table>
		</fieldset>
    </div>
   <div title="手机认证" style="padding:15px">
    	<fieldset id="member_mgr_memberAuth_form_memberAuthGenfieldset" style="padding:10px;" class="spinner">
			<legend>手机认证</legend>  
			<table  class="detailtable" style="width: 712px">
					<tr>
						<td>认证名称：</td>
						<td><input id="member_mgr_memberAuth_form_mobileName" name="mobileName" class="spinner" style="width:168px" value="${memberAuthData.mobileName}"  readonly="readonly"/></td>
						<td style="padding-left:10px;">认证状态：</td>
						<td ><input id="member_mgr_memberAuth_form_mobileAuth" name="mobileAuth" class="spinner" style="width:168px" value="${memberAuthData.mobileAuth}" readonly="readonly"/></td>
					<tr>
						<td>审核人：</td>
						<td><input id="member_mgr_memberAuth_form_mobileAuditorDisplay" name="mobileAuditorDisplay" class="spinner" style="width:168px" value="${memberAuthData.mobileAuditorDisplay}" readonly="readonly"/></td>
						<td style="padding-left:10px;">审核时间：</td>
						<td><input id="member_mgr_memberAuth_form_mobileTime" name="mobileTime" class="spinner" style="width:168px" value="<fmt:formatDate value="${memberAuthData.mobileTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
					</tr>
					<tr>
						<td>序号：</td>
						<td ><input id="member_mgr_memberAuth_form_mobileNum" name="mobileNum" class="spinner" style="width:168px;" value="${memberAuthData.mobileNum}" readonly="readonly"/></td>
					<tr>
						<td>审核说明：</td>
						<td colspan="3"><textarea class="spinner" style="width:600px" readonly="readonly">${memberAuthData.mobileRemark}</textarea></td>
					</tr>
					<%-- <tr>
						<td>附件：</td>
						<td colspan="3"><textarea id="member_mgr_memberAuth_form_mobileAccessory" name="mobileAccessory" class="spinner" style="width:600px;height:280px;" readonly="readonly">${memberAuthData.mobileAccessory}</textarea></td>
					</tr> --%>
				</table>
		</fieldset>
    </div>
    <div title="信用认证" style="padding:15px">
    	<fieldset id="member_mgr_memberAuth_form_memberAuthGenfieldset" style="padding:10px;" class="spinner">
			<legend>信用认证</legend>  
			<table  class="detailtable" style="width: 712px">
					<tr>
						<td>认证名称：</td>
						<td><input id="member_mgr_memberAuth_form_creditName" name="creditName" class="spinner" style="width:168px" value="${memberAuthData.creditName}"  readonly="readonly"/></td>
						<td style="padding-left:10px;">认证状态：</td>
						<td ><input id="member_mgr_memberAuth_form_creditAuth" name="creditAuth" class="spinner" style="width:168px" value="${memberAuthData.creditAuth}" readonly="readonly"/></td>
					<tr>
						<td>审核人：</td>
						<td><input id="member_mgr_memberAuth_form_infoAuditorDisplay" name="infoAuditorDisplay" class="spinner" style="width:168px" value="${memberAuthData.infoAuditorDisplay}" readonly="readonly"/></td>
						<td style="padding-left:10px;">审核时间：</td>
						<td><input id="member_mgr_memberAuth_form_creditTime" name="creditTime" class="spinner" style="width:168px" value="<fmt:formatDate value="${memberAuthData.creditTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
					</tr>
					<tr>
						<td>序号：</td>
						<td ><input id="member_mgr_memberAuth_form_creditNum" name="creditNum" class="spinner" style="width:168px;" value="${memberAuthData.creditNum}" readonly="readonly"/></td>
					<tr>
						<td>审核说明：</td>
						<td colspan="3"><textarea class="spinner" style="width:600px" readonly="readonly">${memberAuthData.creditRemark}</textarea></td>
					</tr>
					<tr>
						<td>附件：</td>
						<td colspan="3"><textarea id="member_mgr_memberAuth_form_creditAccessory" name="creditAccessory" class="spinner" style="width:600px;height:140px;" readonly="readonly">${memberAuthData.creditAccessory}</textarea></td>
					</tr>
				</table>
		</fieldset>
    </div>
    <div title="企业认证" style="padding:15px">
    	<fieldset id="member_mgr_memberAuth_form_memberAuthGenfieldset" style="padding:10px;" class="spinner">
			<legend>企业认证</legend>  
			<table  class="detailtable" style="width: 712px">
					<tr>
						<td>认证名称：</td>
						<td><input id="member_mgr_memberAuth_form_companyName" name="companyName" class="spinner" style="width:168px" value="${memberAuthData.companyName}"  readonly="readonly"/></td>
						<td style="padding-left:10px;">认证状态：</td>
						<td ><input id="member_mgr_memberAuth_form_companyAuth" name="companyAuth" class="spinner" style="width:168px" value="${memberAuthData.companyAuth}" readonly="readonly"/></td>
					<tr>
						<td>审核人：</td>
						<td><input id="member_mgr_memberAuth_form_companyAuditorDisplay" name="companyAuditorDisplay" class="spinner" style="width:168px" value="${memberAuthData.companyAuditorDisplay}" readonly="readonly"/></td>
						<td style="padding-left:10px;">审核时间：</td>
						<td><input id="member_mgr_memberAuth_form_companyTime" name="companyTime" class="spinner" style="width:168px" value="<fmt:formatDate value="${memberAuthData.companyTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
					</tr>
					<tr>
						<td>序号：</td>
						<td ><input id="member_mgr_memberAuth_form_companyNum" name="companyNum" class="spinner" style="width:168px;" value="${memberAuthData.companyNum}" readonly="readonly"/></td>
					<tr>
						<td>审核说明：</td>
						<td colspan="3"><textarea class="spinner" style="width:600px" readonly="readonly">${memberAuthData.companyRemark}</textarea></td>
					</tr>
					<tr>
						<td>附件：</td>
						<td colspan="3"><textarea id="member_mgr_memberAuth_form_companyAccessory" name="companyAccessory" class="spinner" style="width:600px;height:140px;" readonly="readonly">${memberAuthData.companyAccessory}</textarea></td>
					</tr>
				</table>
		</fieldset>
    </div>
    <div title="实名认证" style="padding:15px">
    	<fieldset id="member_mgr_memberAuth_form_memberAuthGenfieldset" style="padding:10px;" class="spinner">
			<legend>实名认证</legend>  
			<table  class="detailtable" style="width: 712px">
					<tr>
						<td>认证名称：</td>
						<td><input id="member_mgr_memberAuth_form_realName" name="realName" class="spinner" style="width:168px" value="${memberAuthData.realName}"  readonly="readonly"/></td>
						<td style="padding-left:10px;">认证状态：</td>
						<td ><input id="member_mgr_memberAuth_form_realNameAuth" name="realNameAuth" class="spinner" style="width:168px" value="${memberAuthData.realNameAuth}" readonly="readonly"/></td>
					<tr>
						<td>审核人：</td>
						<td><input id="member_mgr_memberAuth_form_realNameAuditorDisplay" name="realNameAuditorDisplay" class="spinner" style="width:168px" value="${memberAuthData.realNameAuditorDisplay}" readonly="readonly"/></td>
						<td style="padding-left:10px;">审核时间：</td>
						<td><input id="member_mgr_memberAuth_form_realNameTime" name="realNameTime" class="spinner" style="width:168px" value="<fmt:formatDate value="${memberAuthData.realNameTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
					</tr>
					<tr>
						<td>序号：</td>
						<td ><input id="member_mgr_memberAuth_form_realNameNum" name="realNameNum" class="spinner" style="width:168px;" value="${memberAuthData.realNameNum}" readonly="readonly"/></td>
					<tr>
						<td>审核说明：</td>
						<td colspan="3"><textarea class="spinner" style="width:600px" readonly="readonly">${memberAuthData.realNameRemark}</textarea></td>
					</tr>
					<tr>
						<td>附件：</td>
						<td colspan="3"><textarea id="member_mgr_memberAuth_form_realNameAccessory" name="realNameAccessory" class="spinner" style="width:600px;height:140px;" readonly="readonly">${memberAuthData.realNameAccessory}</textarea></td>
					</tr>
				</table>
		</fieldset>
    </div>
    <div title="身份证认证" style="padding:15px">
    	<fieldset id="member_mgr_memberAuth_form_memberAuthGenfieldset" style="padding:10px;" class="spinner">
			<legend>身份证认证</legend>  
			<table  class="detailtable" style="width:712px">
					<tr>
						<td>认证名称：</td>
						<td><input id="member_mgr_memberAuth_form_idCardName" name="idCardName" class="spinner" style="width:168px" value="${memberAuthData.idCardName}"  readonly="readonly"/></td>
						<td style="padding-left:10px;">认证状态：</td>
						<td ><input id="member_mgr_memberAuth_form_idCardAuth" name="idCardAuth" class="spinner" style="width:168px" value="${memberAuthData.idCardAuth}" readonly="readonly"/></td>
					<tr>
						<td>审核人：</td>
						<td><input id="member_mgr_memberAuth_form_idCardAuditorDisplay" name="idCardAuditorDisplay" class="spinner" style="width:168px" value="${memberAuthData.idCardAuditorDisplay}" readonly="readonly"/></td>
						<td style="padding-left:10px;">审核时间：</td>
						<td><input id="member_mgr_memberAuth_form_idCardTime" name="idCardTime" class="spinner" style="width:168px" value="<fmt:formatDate value="${memberAuthData.idCardTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
					</tr>
					<tr>
						<td>序号：</td>
						<td ><input id="member_mgr_memberAuth_form_idCardNum" name="idCardNum" class="spinner" style="width:168px;" value="${memberAuthData.idCardNum}" readonly="readonly"/></td>
					<tr>
						<td>审核说明：</td>
						<td colspan="3"><textarea class="spinner" style="width:600px" readonly="readonly">${memberAuthData.idCardRemark}</textarea></td>
					</tr>
					<tr>
						<td>附件：</td>
						<td colspan="3"><textarea id="member_mgr_memberAuth_form_idCardAccessory" name="idCardAccessory" class="spinner" style="width:600px;height:140px;" readonly="readonly">${memberAuthData.idCardAccessory}</textarea></td>
					</tr>
				</table>
		</fieldset>
    </div>
    <div title="工作认证" style="padding:15px">
    	<fieldset id="member_mgr_memberAuth_form_memberAuthGenfieldset" style="padding:10px;" class="spinner">
			<legend>工作认证</legend>  
			<table  class="detailtable">
					<tr>
						<td>认证名称：</td>
						<td><input id="member_mgr_memberAuth_form_workName" name="workName" class="spinner" style="width:168px" value="${memberAuthData.workName}"  readonly="readonly"/></td>
						<td style="padding-left:10px;">认证状态：</td>
						<td ><input id="member_mgr_memberAuth_form_workAuth" name="workAuth" class="spinner" style="width:168px" value="${memberAuthData.workAuth}" readonly="readonly"/></td>
					<tr>
						<td>审核人：</td>
						<td><input id="member_mgr_memberAuth_form_workAuditorDisplay" name="workAuditorDisplay" class="spinner" style="width:168px" value="${memberAuthData.workAuditorDisplay}" readonly="readonly"/></td>
						<td style="padding-left:10px;">审核时间：</td>
						<td><input id="member_mgr_memberAuth_form_workTime" name="workTime" class="spinner" style="width:168px" value="<fmt:formatDate value="${memberAuthData.workTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
					</tr>
					<tr>
						<td>序号：</td>
						<td ><input id="member_mgr_memberAuth_form_workNum" name="workNum" class="spinner" style="width:168px;" value="${memberAuthData.workNum}" readonly="readonly"/></td>
					<tr>
						<td>审核说明：</td>
						<td colspan="3"><textarea class="spinner" style="width:600px" readonly="readonly">${memberAuthData.workRemark}</textarea></td>
					</tr>
					<tr id="member_mgr_memberAuth_form_workinfo">
						<td>查看会员工作信息：</td>
						<td><a id="workAuthbtn1" href="#" class="easyui-linkbutton" data-options="">查看</a></td>
					</tr>
					<%-- <tr>
						<td>附件：</td>
						<td colspan="3"><textarea id="member_mgr_memberAuth_form_workAccessory" name="workAccessory" class="spinner" style="width:600px;height:280px;" readonly="readonly">${memberAuthData.workAccessory}</textarea></td>
					</tr> --%>
				</table>
		</fieldset>
    </div> 
</form>
<script type="text/javascript">

	//基本信息认证的
	$('#infoAuthbtn1').bind('click', function(){    
		 $.easyui.showDialog({
				title: '【${memberAuthData.memberName}'+"】基本信息",
				href : ctx + '/do/member/intoDetail.htm?memberId='+'${memberAuthData.memberId}',//从controller请求jsp页面进行渲染
				width : 645,
				height : 450,
				border : true,
				resizable: false,
				enableApplyButton : false,
				enableSaveButton : false
			});
	}); 
	//工作认证的
	$('#workAuthbtn1').bind('click', function(){    
		 $.easyui.showDialog({
				title: '【${memberAuthData.memberName}'+"】基本信息",
				href : ctx + '/do/member/intoDetail.htm?memberId='+'${memberAuthData.memberId}',//从controller请求jsp页面进行渲染
				width : 645,
				height : 450,
				resizable: false,
				enableApplyButton : false,
				enableSaveButton : false
			});
	}); 
	//tab
	$('#member_mgr_memberAuth_form').tabs({ 
		border:true,
		onSelect:function(){
			$("div").remove(".validatebox-tip");//解决关闭窗体偶尔出现验证条bug
		}
	});
	
	//下拉项emun的值
	$('#member_mgr_memberAuth_form_infoAuth').val(renderGridValue('${memberAuthData.infoAuth}',fields.auths));
 	$('#member_mgr_memberAuth_form_vipAuth').val(renderGridValue('${memberAuthData.vipAuth}',fields.auths));
 	$('#member_mgr_memberAuth_form_emailAuth').val(renderGridValue('${memberAuthData.emailAuth}',fields.auths));
 	$('#member_mgr_memberAuth_form_mobileAuth').val(renderGridValue('${memberAuthData.mobileAuth}',fields.auths));
	$('#member_mgr_memberAuth_form_creditAuth').val(renderGridValue('${memberAuthData.creditAuth}',fields.auths));
 	$('#member_mgr_memberAuth_form_companyAuth').val(renderGridValue('${memberAuthData.companyAuth}',fields.auths));
	$('#member_mgr_memberAuth_form_realNameAuth').val(renderGridValue('${memberAuthData.realNameAuth}',fields.auths));
	$('#member_mgr_memberAuth_form_idCardAuth').val(renderGridValue('${memberAuthData.idCardAuth}',fields.auths));
	$('#member_mgr_memberAuth_form_workAuth').val(renderGridValue('${memberAuthData.workAuth}',fields.auths));  
	
	//编辑器
	KindEditor.ready(function(Detail) {
		Detail.create('#member_mgr_memberAuth_form_infoAccessory', {
			themeType : 'qq',
			items : [],
			readonlyMode : true
		});
	});
 	KindEditor.ready(function(Detail) {
		Detail.create('#member_mgr_memberAuth_form_vipAccessory', {
			themeType : 'qq',
			items : [],
			readonlyMode : true
		});
	});
 	KindEditor.ready(function(Detail) {
		Detail.create('#member_mgr_memberAuth_form_emailAccessory', {
			themeType : 'qq',
			items : [],
			readonlyMode : true
		});
	});
 	KindEditor.ready(function(Detail) {
		Detail.create('#member_mgr_memberAuth_form_mobileAccessory', {
			themeType : 'qq',
			items : [],
			readonlyMode : true
		});
	});
	KindEditor.ready(function(Detail) {
		Detail.create('#member_mgr_memberAuth_form_creditAccessory', {
			themeType : 'qq',
			items : [],
			readonlyMode : true
		});
	});
 	KindEditor.ready(function(Detail) {
		Detail.create('#member_mgr_memberAuth_form_companyAccessory', {
			themeType : 'qq',
			items : [],
			readonlyMode : true
		});
	});
	KindEditor.ready(function(Detail) {
		Detail.create('#member_mgr_memberAuth_form_realNameAccessory', {
			themeType : 'qq',
			items : [],
			readonlyMode : true
		});
	});
	KindEditor.ready(function(Detail) {
		Detail.create('#member_mgr_memberAuth_form_idCardAccessory', {
			themeType : 'qq',
			items : [],
			readonlyMode : true
		});
	});
	KindEditor.ready(function(Detail) {
		Detail.create('#member_mgr_memberAuth_form_workAccessory', {
			themeType : 'qq',
			items : [],
			readonlyMode : true
		});
	}); 
	
</script>
