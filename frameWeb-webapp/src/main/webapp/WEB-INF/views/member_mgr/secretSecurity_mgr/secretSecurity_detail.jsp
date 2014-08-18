<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form method="post" style="padding:15px">
	<table class="detailtable">
		<tr>
			<td>密保问题描述：</td>
			<td ><!-- 当表格行存在两个要显示的td,使用该forminputtable样式可以进行适当的空间调整 class="forminputtable" -->
				<input class="spinner" style="width:168px"  value="${secretSecurityData.questionDes}" readonly="readonly"/>
		 
			</td>
		 </tr><tr> 
		 		<td>密保问题答案：</td>
			<td><input id="secretSecurity_mgr_secretSecurity_form_addresseeDisplay"  value="${secretSecurityData.answer}" class="spinner" style="width:168px"  readonly="readonly"/></td>
		
		</tr><tr>
			<td>会员名称：</td>
			<td><input id="secretSecurity_mgr_secretSecurity_form_addresseeDisplay"  value="${secretSecurityData.memberRealName}" class="spinner" style="width:168px"  readonly="readonly"/></td>
			
		</tr><tr>
		<td>创建时间：</td>
			<td><input class="spinner" style="width:168px" value="<fmt:formatDate value="${secretSecurityData.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
	</table>
</form>
