<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %> 
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form method="post" style="padding:15px">
	<table class="formtable">
		<tr>
			<td>发件人：</td>
			<td colspan="3">
				<input type="hidden" id="messageNotice_mgr_messageNotice_form_messageNoticeId" name="messageNoticeId" value="${messageNoticeData.messageNoticeId}" />
				<!-- <input id="messageNotice_mgr_messageNotice_form_sender" name="sender" style="width:590px" value="" readonly="readonly"/> -->
				<shiro:principal property="userCnName"/>
			</td>
		</tr>
		<tr>
			<td>收件人：</td>
			<td>
				<input id="messageNotice_mgr_messageNotice_form_addressee" style="width:268px;" name="addressee" value="${messageNoticeData.addressee}"/>
			</td>
		</tr>
		<tr>
			<td>信件状态：</td>
			<td>
				<input id="messageNotice_mgr_messageNotice_form_letterstatus" style="width:268px;" name="letterstatus" value="${messageNoticeData.letterstatus}"/>
			</td>
		</tr>
		<tr>
			<td>标题：</td>
			<td>
			<input id="messageNotice_mgr_messageNotice_form_title" name="title"  style="width:268px;" value="${messageNoticeData.title}" class="easyui-validatebox spinner"  required="true"  validType="length[1,12]" invalidMessage="标题必须在1到12个字符之间"/>
			</td>
		</tr>
		<tr>
			<td>内容：</td>
			<td>
				<textarea id="messageNotice_mgr_messageNotice_form_content" name="content" style="width:268px;" class="spinner formta">
					${messageNoticeData.content}
				</textarea>
			</td>
		</tr>
		<%-- <tr>
			<td>备注：</td>
			<td>
				<textarea id="messageNotice_mgr_messageNotice_form_remark" name="remark" style="width:268px;" maxlength="255" class="spinner formta">
					${messageNoticeData.remark}
				</textarea>
			</td>
		</tr> --%>
	</table>
</form>

