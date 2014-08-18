<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<form id="member_mgr_member_form" method="post" style="padding:15px">
<div title="基本信息" style="padding:15px;">
    	<fieldset id="user_mgr_user_form_userGenfieldset" style="padding:10px;width: 749px" class="spinner">
			<legend>会员定义</legend>  
			<table class="formtable">
					<tr>	
						<td>会员名称：</td>
						<td>
							<input type="hidden" id="member_mgr_member_form_memberId" name="memberId" value="${memberData.memberId}" />
							<input onkeyup="value=value.replace(/[\d]/g,'') " onbeforepaste="clipboardData.setData('text',clipboardData.getData('text').replace(/[\d]/g,''))" id="member_mgr_member_form_memberName" name="memberName" style="width:268px" value="${memberData.memberName}" class="easyui-validatebox spinner"  required="true"  validType="length[1,10]" invalidMessage="会员名称必须在1到10个字符之间"/>
						</td>
						<td style="padding-left:10px;">会员真实姓名：</td>
						<td><input onkeyup="value=value.replace(/[^\u4E00-\u9FA5]/g,'')" onbeforepaste="clipboardData.setData('text',clipboardData.getData('text').replace(/[^\u4E00-\u9FA5]/g,''))" id="member_mgr_member_form_memberRealName" name="memberRealName" style="width:268px" value="${memberData.memberRealName}" class="easyui-validatebox spinner"  required="true"  validType="length[1,10]" invalidMessage="会员真实姓名必须在1到10个字符之间"/></td>
					</tr>
					<tr> 
						<td>最高学历：</td>
						<td><input onkeyup="value=value.replace(/[^\u4E00-\u9FA5]/g,'')" onbeforepaste="clipboardData.setData('text',clipboardData.getData('text').replace(/[^\u4E00-\u9FA5]/g,''))" id="member_mgr_member_form_educational" name="educational" class="easyui-validatebox spinner" style="width:268px" value="${memberData.educational}"/></td>
					
						<td style="padding-left:10px;">会员年龄：</td>
						<td><input id="member_mgr_member_form_memberAge" name="memberAge" value="${memberData.memberAge}" class="easyui-numberspinner spinner" data-options="min:0,max:99,required:true,missingMessage:'请填写年龄'" value="10" style="width: 270px;height:18px;" min="1" max="99"/></td>
					 </tr>
					<tr>
						<td>婚姻状况：</td>
						<td><input id="member_mgr_member_form_maritalStatus" name="maritalStatus" value="${memberData.maritalStatus}"/></td>
						<td style="padding-left:10px;">性别：</td>
						<td><input id="member_mgr_member_form_sex" name="sex" value="${memberData.sex}"/></td>
					</tr>
					<tr>
						<td>会员状态：</td>
						<td><input id="member_mgr_member_form_status" name="status" value="${memberData.status}"/></td>
						<td style="padding-left:10px;">会员类型：</td>
						<td><input id="member_mgr_member_form_type" name="type" value="${memberData.type}"/></td>
					</tr>
					<tr>
						<td>附件：</td>
						<td><input id="member_mgr_member_form_accessory" name="accessory" class="easyui-validatebox spinner" style="width:268px" value="${memberData.accessory}"/></td>
					</tr>
					<tr>
						<td>个人描述：</td>
						<td colspan="3"> <textarea id="member_mgr_member_form_personalDes" name="personalDes" style="width:635px;height:50px;" maxlength="255" class="spinner formta">${memberData.personalDes}</textarea></td>
					</tr>
				</table>
		</fieldset>
    </div>
    <div title="联系方式" style="padding:15px">
    	<fieldset id="user_mgr_user_form_connetGenfieldset" style="padding:10px;" class="spinner">
			<legend>联系信息</legend>  
			<table class="formtable">
					<tr>
						<td>手机号码：</td>
						<td>
							<input invalidMessage="手机号码必须为11位，如:1372627392X" id="member_mgr_member_form_mobileNumber" name="mobileNumber" value="${memberData.mobileNumber}" style="width:268px" class="easyui-validatebox spinner" required="true" validType="customReg['^[1][3458][0-9]{9}$','<fmt:message key="Member.mobileNumber.illegal"/>']"/>
						</td>
						<td style="padding-left:10px;">住宅电话：</td>
						<td><input id="member_mgr_member_form_homePhone" name="homePhone" value="${memberData.homePhone}" style="width:268px" class="easyui-validatebox spinner" data-options="validType:'tel'"/></td>
					</tr>
						<tr>
						<td>身份证：</td>
						<td><input invalidMessage="身份证必须符合国家格式，位数通常为15为或18位" id="member_mgr_member_form_cardId" name="cardId" value="${memberData.cardId}" style="width:268px" class="easyui-validatebox spinner" data-options="required:true,validType:'idCard'" /></td>
						<td style="padding-left:10px;">邮件：</td>
						<td><input invalidMessage="格式：XXX@163.com" id="member_mgr_member_form_email" name="email" value="${memberData.email}" style="width:268px" class="easyui-validatebox spinner" data-options="required:true,validType:'email'" /></td>
					</tr>
					<tr>
						<td>籍贯：</td>
						<td><input onkeyup="value=value.replace(/[^\u4E00-\u9FA5]/g,'')" onbeforepaste="clipboardData.setData('text',clipboardData.getData('text').replace(/[^\u4E00-\u9FA5]/g,''))" id="member_mgr_member_form_hometown" name="hometown" class="easyui-validatebox spinner" style="width:268px" required="true" value="${memberData.hometown}"/></td>
						<td style="padding-left:10px;">现居住地址：</td>
						<td><input id="member_mgr_member_form_liveAddress" name="liveAddress" class="easyui-validatebox spinner" style="width:268px" value="${memberData.liveAddress}"  required="true" /></td>
					</tr>
					<tr>
						<td>第一联系人：</td>
						<td><input id="member_mgr_member_form_firstContact" name="firstContact" class="easyui-validatebox spinner" style="width:268px" value="${memberData.firstContact}"/></td>
						<td style="padding-left:10px;">第一联系人关系：</td>
						<td><input id="member_mgr_member_form_firstContactRelation" name="firstContactRelation" value="${memberData.firstContactRelation}"/></td>
					</tr>
					<tr>
						<td>第一联系人手机号码：</td>
						<td><input id="member_mgr_member_form_firstContactPhone" name="firstContactPhone" style="width:268px" value="${memberData.firstContactPhone}" class="easyui-validatebox spinner" validType="customReg['^[1][3458][0-9]{9}$','<fmt:message key="Member.mobileNumber.illegal"/>']"/></td>
						<td style="padding-left:10px;">第一联系人地址：</td>
						<td><input id="member_mgr_member_form_firstContactAddress" name="firstContactAddress" value="${memberData.firstContactAddress}" class="easyui-validatebox spinner" style="width:268px"  /></td>
					</tr>
					<tr>
						<td>第二联系人：</td>
						<td><input id="member_mgr_member_form_secondContact" name="secondContact" class="easyui-validatebox spinner" style="width:268px" value="${memberData.secondContact}"/></td>
						<td style="padding-left:10px;">第二联系人关系：</td>
						<td><input id="member_mgr_member_form_secondContactRelation" name="secondContactRelation" value="${memberData.secondContactRelation}"/></td>
					</tr>
					<tr>
						<td>第二联系人手机号码：</td>
						<td><input id="member_mgr_member_form_secondContactPhone" name="secondContactPhone" value="${memberData.secondContactPhone}" style="width:268px" class="easyui-validatebox spinner" validType="customReg['^[1][3458][0-9]{9}$','<fmt:message key="Member.mobileNumber.illegal"/>']"/></td>
						<td style="padding-left:10px;">第二联系人地址：</td>
						<td><input id="member_mgr_member_form_secondContactAddress" name="secondContactAddress" value="${memberData.secondContactAddress}" style="width:268px"  class="easyui-validatebox spinner"/></td>
					</tr> 
				</table>
		</fieldset>
    </div>
     <div title="工作信息" style="padding:15px">
    	<fieldset id="user_mgr_user_form_connetGenfieldset" style="padding:10px;width: 749px" class="spinner">
			<legend>工作信息</legend>  
			<table class="formtable">
					<tr>
						<td>单位名称：</td>
						<td colspan="3">
							<input onkeyup="value=value.replace(/[^\u4E00-\u9FA5]/g,'')" onbeforepaste="clipboardData.setData('text',clipboardData.getData('text').replace(/[^\u4E00-\u9FA5]/g,''))" type="hidden" id="memberWork_mgr_memberWork_form_memberId" name="memberId" value="${memberWorkData.memberId}" />
							<input id="member_mgr_member_form_unitName" name="unitName" value="${memberWorkData.unitName}" style="width:268px"  class="easyui-validatebox spinner" data-options="required:true,validType:'length[1,25]'" invalidMessage="单位名称必须在1到25个字符之间" />
						</td>
					</tr>
					<tr>
						<td>单位电话：</td>
						<td><input id="member_mgr_member_form_unitPhone" name="unitPhone" value="${memberWorkData.unitPhone}" style="width:268px" class="easyui-validatebox spinner" data-options="validType:'tel'"/></td>
						<td style="padding-left:10px;">单位地址：</td>
						<td><input id="member_mgr_member_form_unitAdress" name="unitAdress"  value="${memberWorkData.unitAdress}" style="width:268px" class="easyui-validatebox spinner" /></td>
					</tr>
					<tr>
						<td>工作年限：</td>
						<td><input id="member_mgr_member_form_workAge" name="workAge" value="${memberWorkData.workAge}" class="easyui-numberspinner spinner"  data-options="min:0,max:99,missingMessage:'请填写年龄'" value="10" style="width: 270px;height:18px;" min="1" max="99"/></td>
						<td style="padding-left:10px;">年薪：</td>
						<%-- <td><input id="member_mgr_member_form_salary" name="salary" value="${memberWorkData.salary}" style="width:268px"  class="easyui-validatebox spinner" data-options="required:true,validType:'numeric('Float')'" /></td> --%>
						<td><input id="member_mgr_member_form_salary" name="salary" value="${memberWorkData.salary}" style="width:268px"  class="easyui-validatebox spinner" validType="customReg['^(([0-9]+\.[0-9]*[1-9][0-9]*)|([0-9]*[1-9][0-9]*\.[0-9]+)|([0-9]*[1-9][0-9]*))$','<fmt:message key="MemberWork.salary.illegal"/>']" />万</td>
					</tr>
					<tr>
						<td>证明人：</td>
						<td><input id="member_mgr_member_form_proofPerson" name="proofPerson" value="${memberWorkData.proofPerson}" style="width:268px" class="easyui-validatebox spinner"  data-options="validType:'length[1,10]'" invalidMessage="证明人必须在1到10个字符之间"/></td>
						<td style="padding-left:10px;">证明人手机号码：</td>
						<td><input id="member_mgr_member_form_proofPhone" name="proofPhone" value="${memberWorkData.proofPhone}" style="width:268px" class="easyui-validatebox spinner" validType="customReg['^[1][3458][0-9]{9}$','<fmt:message key="Member.mobileNumber.illegal"/>']"/></td>
					</tr>
				</table> 
		</fieldset>
    </div>
</form>

<script type="text/javascript">
	$('#member_mgr_member_form').tabs({ 
		border:true,
		onSelect:function(){
			$("div").remove(".validatebox-tip");//解决关闭窗体偶尔出现验证条bug
		}
	});
	// 初始化下拉框
	$('#member_mgr_member_form_maritalStatus').combobox({  
		valueField : 'value',
		height:18,
		width:270,
		textField : 'label',
		panelHeight : 'auto',
		editable : false,
		required:true,
		data : fields.maritalStatus
	});
	$('#member_mgr_member_form_sex').combobox({  
		valueField : 'value',
		height:18,
		width:270,
		textField : 'label',
		panelHeight : 'auto',
		editable : false,
		required:true,
		data : fields.sex
	});
	$('#member_mgr_member_form_status').combobox({  
		valueField : 'value',
		height:18,
		width:270,
		textField : 'label',
		panelHeight : 'auto',
		editable : false,
		required:true,
		data : fields.status
	});
	$('#member_mgr_member_form_type').combobox({  
		valueField : 'value',
		height:18,
		width:270,
		textField : 'label',
		panelHeight : 'auto',
		editable : false,
		required:true,
		data : fields.type
	});
	$('#member_mgr_member_form_firstContactRelation').combobox({  
		valueField : 'value',
		height:18,
		width:270,
		textField : 'label',
		panelHeight : 'auto',
		editable : false,
		//required:true,
		data : fields.contactRelation
	});
	$('#member_mgr_member_form_secondContactRelation').combobox({  
		valueField : 'value',
		height:18,
		width:270,
		textField : 'label',
		panelHeight : 'auto',
		editable : false,
		//required:true,
		data : fields.contactRelation
	});
</script>
