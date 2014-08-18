<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>


<form method="post" style="padding:15px">
	<table id="table_member_mgr_memberAuth_form_info" class="formtable">
		<tr id="table_member_mgr_memberAuth_form_info">
			<td>查看会员信息明细：</td>
			<td><a id="infoAuthbtn1" href="#" class="easyui-linkbutton" data-options="">查看</a></td>
		</tr>
		<%-- <tr>
			<td>排序：</td>
			<td><input id="member_mgr_memberAuth_form_infoNum" name="infoNum" class="easyui-numberspinner spinner" value="${memberAuthData.infoNum}" data-options="min:0,max:99,required:true,missingMessage:'请填写序号'" value="10" style="width: 270px;height:18px;" min="1" max="99"/></td>
		</tr> --%>
		<tr>
			<td>审核意见：</td>
			<td>
				<input id="member_mgr_memberAuth_form_memberId" type="hidden" name="memberId" class="spinner" style="width:168px" value="${memberAuthData.memberId}" />
				<input id="member_mgr_memberAuth_form_memberName" type="hidden" name="memberName" class="spinner" style="width:168px" value="${memberAuthData.memberName}" />
				<textarea id="member_mgr_memberAuth_form_infoRemark" name="infoRemark" style="width:400px;" maxlength="255" class="spinner formta">${memberAuthData.infoRemark}</textarea>
			</td>
		</tr>
		<tr>
			<td>审核结果：</td>
			<td>
				<input id="member_mgr_memberAuth_form_infoAuthPass"  name="infoAuth"   type="radio" value="pass"/>审核通过
				<input id="member_mgr_memberAuth_form_infoAuthFailure"  name="infoAuth"  type="radio" value="failure"/>审核不通过
			</td>
		</tr>
	</table>
	<table  id="table_member_mgr_memberAuth_form_vip" class="formtable">
		<%-- <tr>
			<td>vip会员附件：</td>
			<td><textarea id="member_mgr_memberAuth_form_vipAccessory"   name="vipAccessory" class="spinner" style="display:none;width:600px;height:280px;" readonly="readonly">${memberAuthData.vipAccessory}</textarea></td>
		</tr>
		<tr>
			<td>排序：</td>
			<td><input id="member_mgr_memberAuth_form_infoNum" name="infoNum" class="easyui-numberspinner spinner" value="${memberAuthData.infoNum}" data-options="min:0,max:99,required:true,missingMessage:'请填写序号'" value="10" style="width: 270px;height:18px;" min="1" max="99"/></td>
		</tr> --%>
		<tr>
			<td>审核意见：</td>
			<td>
				<input id="member_mgr_memberAuth_form_memberId" type="hidden" name="memberId" class="spinner" style="width:168px" value="${memberAuthData.memberId}" />
				<textarea id="member_mgr_memberAuth_form_vipRemark" name="vipRemark" style="width:400px;" maxlength="255" class="spinner formta">${memberAuthData.vipRemark}</textarea>
			</td>
		</tr>
		<tr>
			<td>审核结果：</td>
			<td>
				<input id="member_mgr_memberAuth_form_vipAuthPass" name="vipAuth"  type="radio" value="pass"/>审核通过
				<input id="member_mgr_memberAuth_form_vipAuthFailure" name="vipAuth"  type="radio" value="failure"/>审核不通过
			</td>
		</tr>
	</table>
	<table id="table_member_mgr_memberAuth_form_email" class="formtable">
		<tr>
			<td>邮箱附件：</td>
			<td colspan="3"><textarea id="member_mgr_memberAuth_form_emailAccessory"  name="emailAccessory" class="spinner" style="display:none;width:600px;height:280px;" readonly="readonly">${memberAuthData.emailAccessory}</textarea></td>
		</tr>
		<tr>
			<td>审核意见：</td>
			<td>
				<input id="member_mgr_memberAuth_form_memberId" type="hidden" name="memberId" class="spinner" style="width:168px" value="${memberAuthData.memberId}" />
				<textarea id="member_mgr_memberAuth_form_emailRemark" name="emailRemark" style="width:600px;" maxlength="255" class="spinner formta">${memberAuthData.emailRemark}</textarea>
			</td>
		</tr>
		<tr>
			<td>审核结果：</td>
			<td>
				<input id="member_mgr_memberAuth_form_emailAuthPass" name="emailAuth"  type="radio" value="pass"/>审核通过
				<input id="member_mgr_memberAuth_form_emailAuthFailure" name="emailAuth"  type="radio" value="failure"/>审核不通过
			</td>
		</tr>
	</table>
	<table id="table_member_mgr_memberAuth_form_mobile" class="formtable">
		<tr>
			<td>手机附件：</td>
			<td><textarea id="member_mgr_memberAuth_form_mobileAccessory"   name="mobileAccessory" class="spinner" style="display:none;width:600px;height:280px;" readonly="readonly">${memberAuthData.mobileAccessory}</textarea></td>
		</tr>
		<tr>
			<td>审核意见：</td>
			<td>
				<input id="member_mgr_memberAuth_form_memberId" type="hidden" name="memberId" class="spinner" style="width:168px" value="${memberAuthData.memberId}" />
				<textarea id="member_mgr_memberAuth_form_mobileRemark" name="mobileRemark" style="width:600px;" maxlength="255" class="spinner formta">${memberAuthData.mobileRemark}</textarea>
			</td>
		</tr>
		<tr>
			<td>审核结果：</td>
			<td>
				<input id="member_mgr_memberAuth_form_mobileAuthPass" name="mobileAuth"  type="radio" value="pass"/>审核通过
				<input id="member_mgr_memberAuth_form_mobileAuthFailure" name="mobileAuth"  type="radio" value="failure"/>审核不通过
			</td>
		</tr>
	</table>
	<table  id="table_member_mgr_memberAuth_form_credit" class="formtable">
		<tr>
			<td>信用附件：</td>
			<td><textarea id="member_mgr_memberAuth_form_creditAccessory"   name="creditAccessory" class="spinner" style="display:none;width:600px;height:280px;" readonly="readonly">${memberAuthData.creditAccessory}</textarea></td>
		</tr>
		<tr>
			<td>审核意见：</td>
			<td>
				<input id="member_mgr_memberAuth_form_memberId" type="hidden" name="memberId" class="spinner" style="width:168px" value="${memberAuthData.memberId}" />
				<textarea id="member_mgr_memberAuth_form_creditRemark" name="creditRemark" style="width:600px;" maxlength="255" class="spinner formta">${memberAuthData.creditRemark}</textarea>
			</td>
		</tr>
		<tr>
			<td>审核结果：</td>
			<td>
				<input id="member_mgr_memberAuth_form_creditAuthPass" name="creditAuth"  type="radio" value="pass"/>审核通过
				<input id="member_mgr_memberAuth_form_creditAuthFailure" name="creditAuth"  type="radio" value="failure"/>审核不通过
			</td>
		</tr>
	</table>
	<table id="table_member_mgr_memberAuth_form_company" class="formtable">
		<tr>
			<td>企业附件：</td>
			<td><textarea id="member_mgr_memberAuth_form_companyAccessory"   name="companyAccessory" class="spinner" style="display:none;width:600px;height:280px;" readonly="readonly">${memberAuthData.companyAccessory}</textarea></td>
		</tr>
		<tr>
			<td>审核意见：</td>
			<td>
				<input id="member_mgr_memberAuth_form_memberId" type="hidden" name="memberId" class="spinner" style="width:168px" value="${memberAuthData.memberId}" />
				<textarea id="member_mgr_memberAuth_form_companyRemark" name="companyRemark" style="width:600px;" maxlength="255" class="spinner formta">${memberAuthData.companyRemark}</textarea>
			</td>
		</tr>
		<tr>
			<td>审核结果：</td>
			<td>
				<input id="member_mgr_memberAuth_form_companyAuthPass" name="companyAuth"  type="radio" value="pass"/>审核通过
				<input id="member_mgr_memberAuth_form_companyAuthFailure" name="companyAuth"  type="radio" value="failure"/>审核不通过
			</td>
		</tr>
		
	</table>
	<table id="table_member_mgr_memberAuth_form_realName" class="formtable">
		<tr>
			<td>实名附件：</td>
			<td><textarea id="member_mgr_memberAuth_form_realNameAccessory"   name="realNameAccessory" class="spinner" style="display:none;width:600px;height:280px;" readonly="readonly">${memberAuthData.realNameAccessory}</textarea></td>
		</tr>
		<tr>
			<td>审核意见：</td>
			<td>
				<input id="member_mgr_memberAuth_form_memberId" type="hidden" name="memberId" class="spinner" style="width:168px" value="${memberAuthData.memberId}" />
				<textarea id="member_mgr_memberAuth_form_realNameRemark" name="realNameRemark" style="width:600px;" maxlength="255" class="spinner formta">${memberAuthData.realNameRemark}</textarea>
			</td>
		</tr>
		<tr>
			<td>审核结果：</td>
			<td>
				<input id="member_mgr_memberAuth_form_realNameAuthPass" name="realNameAuth"  type="radio" value="pass"/>审核通过
				<input id="member_mgr_memberAuth_form_realNameAuthFailure" name="realNameAuth"  type="radio" value="failure"/>审核不通过
			</td>
		</tr>
		
	</table>
	<table id="table_member_mgr_memberAuth_form_idCard" class="formtable">
		<tr>
			<td>身份证附件：</td>
			<td><textarea id="member_mgr_memberAuth_form_idCardAccessory"   name="idCardAccessory" class="spinner" style="display:none;width:600px;height:280px;" readonly="readonly">${memberAuthData.idCardAccessory}</textarea></td>
		</tr>
		<tr>
			<td>审核意见：</td>
			<td>
				<input id="member_mgr_memberAuth_form_memberId" type="hidden" name="memberId" class="spinner" style="width:168px" value="${memberAuthData.memberId}" />
				<textarea id="member_mgr_memberAuth_form_idCardRemark" name="idCardRemark" style="width:600px;" maxlength="255" class="spinner formta">${memberAuthData.idCardRemark}</textarea>
			</td>
		</tr>
		<tr>
			<td>审核结果：</td>
			<td>
				<input id="member_mgr_memberAuth_form_idCardAuthPass" name="idCardAuth"  type="radio" value="pass"/>审核通过
				<input id="member_mgr_memberAuth_form_idCardAuthFailure" name="idCardAuth"  type="radio" value="failure"/>审核不通过
			</td>
		</tr>
	</table>
	<table id="table_member_mgr_memberAuth_form_work" class="formtable">
		<%-- <tr>
			<td>工作附件：</td>
			<td><textarea id="member_mgr_memberAuth_form_workAccessory"  name="workAccessory" class="spinner" style="display:none;width:600px;height:280px;" readonly="readonly">${memberAuthData.workAccessory}</textarea></td>
		</tr> --%>
		<tr id="table_member_mgr_memberAuth_form_info">
			<td>查看会员工作信息：</td>
			<td><a id="workAuthbtn1" href="#" class="easyui-linkbutton" data-options="">查看</a></td>
		</tr>
		<tr>
			<td>审核意见：</td>
			<td>
				<input id="member_mgr_memberAuth_form_memberId" type="hidden" name="memberId" class="spinner" style="width:168px" value="${memberAuthData.memberId}" />
				<textarea id="member_mgr_memberAuth_form_workRemark" name="workRemark" style="width:400px;" maxlength="255" class="spinner formta">${memberAuthData.workRemark}</textarea>
			</td>
		</tr>
		<tr>
			<td>审核结果：</td>
			<td>
				<input id="member_mgr_memberAuth_form_workAuthPass" name="workAuth"  type="radio" value="pass" readonly="readonly"/>审核通过
				<input id="member_mgr_memberAuth_form_workAuthFailure" name="workAuth"  type="radio" value="failure" readonly="readonly"/>审核不通过
			</td>
		</tr>
		
	</table>
</form>

<script type="text/javascript">
		
		
		
		//初始化是否审核单选按钮。
		if('${memberAuthData.infoAuth}' == 'pass'){
			$('#member_mgr_memberAuth_form_infoAuthPass').attr("checked","checked");
		}else if('${memberAuthData.infoAuth}' == 'failure'){
			$('#member_mgr_memberAuth_form_infoAuthFailure').attr("checked","checked");
		}
		if('${memberAuthData.workAuth}' == 'pass'){
			$('#member_mgr_memberAuth_form_workAuthPass').attr("checked","checked");
		}else if('${memberAuthData.workAuth}' == 'failure'){
			$('#member_mgr_memberAuth_form_workAuthFailure').attr("checked","checked");
		}
		if('${memberAuthData.realNameAuth}' == 'pass'){
			$('#member_mgr_memberAuth_form_realNameAuthPass').attr("checked","checked");
		}else if('${memberAuthData.realNameAuth}' == 'failure'){
			$('#member_mgr_memberAuth_form_realNameAuthFailure').attr("checked","checked");
		}
		if('${memberAuthData.idCardAuth}' == 'pass'){
			$('#member_mgr_memberAuth_form_idCardAuthPass').attr("checked","checked");
		}else if('${memberAuthData.idCardAuth}' == 'failure'){
			$('#member_mgr_memberAuth_form_idCardAuthFailure').attr("checked","checked");
		}
		if('${memberAuthData.companyAuth}' == 'pass'){
			$('#member_mgr_memberAuth_form_companyAuthPass').attr("checked","checked");
		}else if('${memberAuthData.companyAuth}' == 'failure'){
			$('#member_mgr_memberAuth_form_companyAuthFailure').attr("checked","checked");
		}
		if('${memberAuthData.creditAuth}' == 'pass'){
			$('#member_mgr_memberAuth_form_creditAuthPass').attr("checked","checked");
		}else if('${memberAuthData.creditAuth}' == 'failure'){
			$('#member_mgr_memberAuth_form_creditAuthFailure').attr("checked","checked");
		}
		if('${memberAuthData.mobileAuth}' == 'pass'){
			$('#member_mgr_memberAuth_form_mobileAuthPass').attr("checked","checked");
		}else if('${memberAuthData.mobileAuth}' == 'failure'){
			$('#member_mgr_memberAuth_form_mobileAuthFailure').attr("checked","checked");
		}
		if('${memberAuthData.emailAuth}' == 'pass'){
			$('#member_mgr_memberAuth_form_emailAuthPass').attr("checked","checked");
		}else if('${memberAuthData.emailAuth}' == 'failure'){
			$('#member_mgr_memberAuth_form_emailAuthFailure').attr("checked","checked");
		}
		if('${memberAuthData.vipAuth}' == 'pass'){
			$('#member_mgr_memberAuth_form_vipAuthPass').attr("checked","checked");
		}else if('${memberAuthData.vipAuth}' == 'failure'){
			$('#member_mgr_memberAuth_form_vipAuthFailure').attr("checked","checked");
		}
		
		//页面一进来就先全部隐藏
		$('#table_member_mgr_memberAuth_form_info').hide();
		$('#table_member_mgr_memberAuth_form_vip').hide();
		$('#table_member_mgr_memberAuth_form_email').hide();
		$('#table_member_mgr_memberAuth_form_mobile').hide();
		$('#table_member_mgr_memberAuth_form_credit').hide();
		$('#table_member_mgr_memberAuth_form_company').hide();
		$('#table_member_mgr_memberAuth_form_realName').hide();
		$('#table_member_mgr_memberAuth_form_idCard').hide();
		$('#table_member_mgr_memberAuth_form_work').hide();

		//判断是通过哪个按钮进来的
		if('${auth}'== '基本信息认证'){
			$('#table_member_mgr_memberAuth_form_info').show();
		}else if('${auth}'== 'VIP认证'){
			$('#table_member_mgr_memberAuth_form_vip').show();
		}else if('${auth}'== '邮箱认证'){
			$('#table_member_mgr_memberAuth_form_email').show();
		}else if('${auth}'== '手机认证'){
			$('#table_member_mgr_memberAuth_form_mobile').show();
		}else if('${auth}'== '信用认证'){
			$('#table_member_mgr_memberAuth_form_credit').show();
		}else if('${auth}'== '企业认证'){
			$('#table_member_mgr_memberAuth_form_company').show();
		}else if('${auth}'== '真实姓名认证'){
			$('#table_member_mgr_memberAuth_form_realName').show();
		}else if('${auth}'== '身份证认证'){
			$('#table_member_mgr_memberAuth_form_idCard').show();
		}else{
			$('#table_member_mgr_memberAuth_form_work').show();
		}
		
		//基本信息认证的
	    $('#infoAuthbtn1').bind('click', function(){    
	    	 $.easyui.showDialog({
					title: '${memberAuthData.memberName}'+"基本信息",
					href : ctx + '/do/member/intoDetail.htm?memberId='+'${memberAuthData.memberId}',//从controller请求jsp页面进行渲染
					width : 645,
					height : 450,
					resizable: false,
					enableApplyButton : false,
					enableSaveButton : false
				});
	    }); 
	  //基本信息认证的
	    $('#workAuthbtn1').bind('click', function(){    
	    	 $.easyui.showDialog({
					title: '${memberAuthData.memberName}'+"工作信息",
					href : ctx + '/do/member/intoDetail.htm?memberId='+'${memberAuthData.memberId}',//从controller请求jsp页面进行渲染
					width : 645,
					height : 450,
					resizable: false,
					enableApplyButton : false,
					enableSaveButton : false
				});
	    }); 
	  //编辑器
		KindEditor.ready(function(Detail) {
			Detail.create('#member_mgr_memberAuth_form_idCardAccessory', {
				themeType : 'qq',
				items : [],
				readonlyMode : true
			});
		});
		//编辑器
		KindEditor.ready(function(Detail) {
			Detail.create('#member_mgr_memberAuth_form_vipAccessory', {
				themeType : 'qq',
				items : [],
				readonlyMode : true
			});
		});
		//编辑器
		KindEditor.ready(function(Detail) {
			Detail.create('#member_mgr_memberAuth_form_emailAccessory', {
				themeType : 'qq',
				items : [],
				readonlyMode : true
			});
		});
		//编辑器
		KindEditor.ready(function(Detail) {
			Detail.create('#member_mgr_memberAuth_form_mobileAccessory', {
				themeType : 'qq',
				items : [],
				readonlyMode : true
			});
		});
		//编辑器
		KindEditor.ready(function(Detail) {
			Detail.create('#member_mgr_memberAuth_form_creditAccessory', {
				themeType : 'qq',
				items : [],
				readonlyMode : true
			});
		});
		//编辑器
		KindEditor.ready(function(Detail) {
			Detail.create('#member_mgr_memberAuth_form_companyAccessory', {
				themeType : 'qq',
				items : [],
				readonlyMode : true
			});
		});
		//编辑器
		KindEditor.ready(function(Detail) {
			Detail.create('#member_mgr_memberAuth_form_realNameAccessory', {
				themeType : 'qq',
				items : [],
				readonlyMode : true
			});
		});
		//编辑器
		KindEditor.ready(function(Detail) {
			Detail.create('#member_mgr_memberAuth_form_workAccessory', {
				themeType : 'qq',
				items : [],
				readonlyMode : true
			});
		});
</script>
