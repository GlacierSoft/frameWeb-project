<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form id="member_mgr_member_form" method="post" style="padding:15px">
<div title="基本信息" style="padding:15px">
    	<fieldset id="user_mgr_user_form_userGenfieldset" style="padding:10px;" class="spinner">
			<legend>会员定义</legend>  
			<table  class="detailtable">
					<tr>
						<td>会员名称：</td>
						<td>
							<input type="hidden" id="member_mgr_member_form_memberId" name="memberId" value="${memberData.memberId}" />
							<input id="member_mgr_member_form_memberName" name="memberName" class="spinner" style="width:168px" value="${memberData.memberName}"  readonly="readonly"/>
						</td>
						<td style="padding-left:10px;">注册时间：</td>
						<td ><input id="member_mgr_member_form_registrationTime" name="registrationTime" class="spinner" style="width:168px;" value="<fmt:formatDate value="${memberData.registrationTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
					<tr>
						<td>会员真实姓名：</td>
						<td><input id="member_mgr_member_form_memberRealName" name="memberRealName" class="spinner" style="width:168px" value="${memberData.memberRealName}"  readonly="readonly"/></td>
						<td style="padding-left:10px;">会员年龄：</td>
						<td ><input id="member_mgr_member_form_memberAge" name="memberAge" class="spinner" style="width:168px;" value="${memberData.memberAge}" readonly="readonly"/></td>
					</tr>
					<tr>
						<td>积分：</td>
						<td><input id="member_mgr_member_form_integral" name="integral" class="spinner" style="width:168px" value="<fmt:formatNumber value='${memberData.integral}' pattern="#,#00.00"/>" readonly="readonly"/></td>
						<td style="padding-left:10px;">信用积分：</td>
						<td><input id="member_mgr_member_form_creditIntegral" name="creditIntegral" class="spinner" style="width:168px" value="<fmt:formatNumber value='${memberData.creditIntegral}' pattern="#,#00.00"/>" readonly="readonly"/></td>
					</tr>
					<tr>
					  <td>可用信用额度:</td>
					  <td><input id="member_mgr_member_form_integral" name="creditamount" class="spinner" style="width:168px" value="<fmt:formatNumber value='${memberData.creditamount}' pattern="#,#00.00元"/>" readonly="readonly"/></td>
					  <td style="padding-left:10px;">最高学历：</td>
					  <td><input id="member_mgr_member_form_educational" name="educational" class="spinner" style="width:168px" value="${memberData.educational}" readonly="readonly"/></td>
					 </tr>
					<tr>
						<td>婚姻状况：</td>
						<td><input id="member_mgr_member_form_maritalStatus" name="maritalStatus" class="spinner" style="width:168px" value="${memberData.maritalStatus}" readonly="readonly"/></td>
						<td style="padding-left:10px;">性别：</td>
						<td><input id="member_mgr_member_form_sex" name="sex" class="spinner" style="width:168px" value="${memberData.sex}" readonly="readonly"/></td>
					</tr>
					<tr>
						<td>会员状态：</td>
						<td><input id="member_mgr_member_form_status" name="status" class="spinner" style="width:168px" value="${memberData.status}" readonly="readonly"/></td>
						<td style="padding-left:10px;">会员类型：</td>
						<td><input id="member_mgr_member_form_type" name="type" class="spinner" style="width:168px" value="${memberData.type}" readonly="readonly"/></td>
					</tr>
					<tr>
						<td>等级开始时间：</td>
						<td><input class="spinner" style="width:168px" value="<fmt:formatDate value="${memberData.validTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
						<td style="padding-left:10px;">等级到期时间：</td>
						<td><input class="spinner" style="width:168px" value="<fmt:formatDate value="${memberData.expireTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
					</tr>
					<tr>
						<td>附件：</td>
						<td colspan="3"><input id="member_mgr_member_form_accessory" name="accessory" class="spinner" style="width:435px" value="${memberData.accessory}" readonly="readonly"/></td>
					</tr>
					<tr>
						<td>个人描述：</td>
						<td colspan="3"> <textarea id="member_mgr_member_form_personalDes" name="personalDes" class="spinner" style="width:435px;" readonly="readonly" >${memberData.personalDes}</textarea></td>
					</tr>
				</table>
		</fieldset>
    </div>
    <div title="联系方式" style="padding:15px">
    	<fieldset id="user_mgr_user_form_connetGenfieldset" style="padding:10px;" class="spinner">
			<legend>联系信息</legend>  
			<table  class="detailtable">
					<tr>
						<td>手机号码：</td>
						<td>
							<input id="member_mgr_member_form_mobileNumber" name="mobileNumber" value="${memberData.mobileNumber}" class="spinner" style="width:168px" readonly="readonly"/>
						</td>
						<td style="padding-left:10px;">住宅电话：</td>
						<td><input id="member_mgr_member_form_homePhone" name="homePhone" value="${memberData.homePhone}" class="spinner" style="width:168px" readonly="readonly"/></td>
					</tr>
						<tr>
						<td>身份证：</td>
						<td><input id="member_mgr_member_form_cardId" name="cardId" value="${memberData.cardId}" class="spinner" style="width:168px" readonly="readonly" /></td>
						<td style="padding-left:10px;">邮件：</td>
						<td><input id="member_mgr_member_form_email" name="email" value="${memberData.email}" class="spinner" style="width:168px" readonly="readonly" /></td>
					</tr>
					<tr>
						<td>籍贯：</td>
						<td><input id="member_mgr_member_form_hometown" name="hometown" class="spinner" style="width:168px" value="${memberData.hometown}" readonly="readonly"/></td>
						<td style="padding-left:10px;">现居住地址：</td>
						<td><input id="member_mgr_member_form_liveAddress" name="liveAddress" class="spinner" style="width:168px" value="${memberData.liveAddress}"  readonly="readonly" /></td>
					</tr>
					<tr>
						<td>第一联系人：</td>
						<td><input id="member_mgr_member_form_firstContact" name="firstContact"  class="spinner" style="width:168px" value="${memberData.firstContact}" readonly="readonly"/></td>
						<td style="padding-left:10px;">第一联系人关系：</td>
						<td><input id="member_mgr_member_form_firstContactRelation" name="firstContactRelation" class="spinner" style="width:168px" value="${memberData.firstContactRelation}" readonly="readonly"/></td>
					</tr>
					<tr>
						<td>第一联系人手机号码：</td>
						<td><input id="member_mgr_member_form_firstContactPhone" name="firstContactPhone" class="spinner" style="width:168px" value="${memberData.firstContactPhone}" readonly="readonly"/></td>
						<td style="padding-left:10px;">第一联系人地址：</td>
						<td><input id="member_mgr_member_form_firstContactAddress" name="firstContactAddress" class="spinner" style="width:168px" value="${memberData.firstContactAddress}" readonly="readonly" /></td>
					</tr>
					<tr>
						<td>第二联系人：</td>
						<td><input id="member_mgr_member_form_secondContact" name="secondContact" class="spinner" style="width:168px" value="${memberData.secondContact}" readonly="readonly"/></td>
						<td style="padding-left:10px;">第二联系人关系：</td>
						<td><input id="member_mgr_member_form_secondContactRelation" name="secondContactRelation" class="spinner" style="width:168px" value="${memberData.secondContactRelation}" readonly="readonly"/></td>
					</tr>
					<tr>
						<td>第二联系人手机号码：</td>
						<td><input id="member_mgr_member_form_secondContactPhone" name="secondContactPhone" value="${memberData.secondContactPhone}" class="spinner" style="width:168px" readonly="readonly"/></td>
						<td style="padding-left:10px;">第二联系人地址：</td>
						<td><input id="member_mgr_member_form_secondContactAddress" name="secondContactAddress" value="${memberData.secondContactAddress}" class="spinner" style="width:168px" readonly="readonly"/></td>
					</tr>
					<tr>
						<td>创建人：</td>
						<td><input class="spinner" style="width:168px" value="${memberData.createrDisplay}" readonly="readonly"/></td>
						<td style="padding-left:10px;">创建时间：</td>
						<td><input class="spinner" style="width:168px" value="<fmt:formatDate value="${memberData.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
					</tr>
					<tr>
						<td>更新人：</td>
						<td><input class="spinner" style="width:168px" value="${memberData.updaterDisplay}" readonly="readonly"/></td>
						<td style="padding-left:10px;">更新时间：</td>
						<td><input class="spinner" style="width:168px" value="<fmt:formatDate value="${memberData.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
					</tr>
				</table>
		</fieldset>
    </div>
     <div title="工作信息" style="padding:15px">
    	<fieldset id="user_mgr_user_form_connetGenfieldset" style="padding:10px;" class="spinner">
			<legend>工作信息</legend>  
				<table  class="detailtable">
					<tr>
						<td>单位名称：</td>
						<td colspan="3">
							<input id="member_mgr_member_form_unitName" name="unitName" value="${memberWorkData.unitName}" class="spinner" style="width:168px" readonly="readonly" />
						</td>
					</tr>
					<tr>
						<td>单位电话：</td>
						<td><input id="member_mgr_member_form_unitPhone" name="unitPhone" value="${memberWorkData.unitPhone}" class="spinner" style="width:168px" readonly="readonly"/></td>
						<td style="padding-left:10px;">单位地址：</td>
						<td><input id="member_mgr_member_form_unitAdress" name="unitAdress"  value="${memberWorkData.unitAdress}" class="spinner" style="width:168px" readonly="readonly"/></td>
					</tr>
					<tr>
						<td>工作年限：</td>
						<td><input id="member_mgr_member_form_workAge" name="workAge" value="${memberWorkData.workAge}" class="spinner" style="width:168px" readonly="readonly"/></td>
						<td style="padding-left:10px;">年薪：</td>
						<td><input id="member_mgr_member_form_salary" name="salary" value="${memberWorkData.salary}" class="spinner" style="width:168px" readonly="readonly"/></td>
					</tr>
					<tr>
						<td>证明人：</td>
						<td><input id="member_mgr_member_form_proofPerson" name="proofPerson" value="${memberWorkData.proofPerson}" class="spinner" style="width:168px" readonly="readonly"/></td>
						<td style="padding-left:10px;">证明人手机号码：</td>
						<td><input id="member_mgr_member_form_proofPhone" name="proofPhone" value="${memberWorkData.proofPhone}" class="spinner" style="width:168px" readonly="readonly"/></td>
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
	$('#member_mgr_member_form_maritalStatus').val(renderGridValue('${memberData.maritalStatus}',fields.maritalStatus));
	$('#member_mgr_member_form_sex').val(renderGridValue('${memberData.sex}',fields.sex));
	$('#member_mgr_member_form_status').val(renderGridValue('${memberData.status}',fields.status));
	$('#member_mgr_member_form_type').val(renderGridValue('${memberData.type}',fields.type));
	$('#member_mgr_member_form_firstContactRelation').val(renderGridValue('${memberData.firstContactRelation}',fields.contactRelation));
	$('#member_mgr_member_form_secondContactRelation').val(renderGridValue('${memberData.secondContactRelation}',fields.contactRelation));
</script>
