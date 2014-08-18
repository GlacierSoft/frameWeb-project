<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form method="post" style="padding:15px">
	<table class="detailtable">
		<tr>
			<td>发件人：</td>
			<td><!--class="forminputtable" 当表格行存在两个要显示的td,使用该forminputtable样式可以进行适当的空间调整  -->
				<input class="spinner" style="width:168px"  value="${messageNoticeData.senderDisplay}" readonly="readonly"/></td>
			<td>&nbsp;&nbsp;收件人：</td>
			<td><input id="messageNotice_mgr_messageNotice_form_addresseeDisplay"  value="${messageNoticeData.addresseeDisplay}" class="spinner" style="width:168px"  readonly="readonly"/></td>
		 </tr>
		<tr>
		<td>状态：</td>
			<td><input id="messageNotice_mgr_messageNotice_form_letterstatus" class="spinner" style="width:168px"  readonly="readonly"/></td>
		<td>&nbsp;&nbsp;信件类型：</td>
		 <td>
		      <input id="messageNotice_mgr_messageNotice_form_lettertype" class="spinner" style="width:168px"  readonly="readonly"/>
	 	</td> 
		</tr>
		<tr>
			<td>标题：</td>
			<td><input  class="spinner" style="width:168px"  value="${messageNoticeData.title}" readonly="readonly"/></td>
			<td>&nbsp;&nbsp;发送日期：</td>
			<td><input  class="spinner" style="width:168px"  value="<fmt:formatDate value="${messageNoticeData.sendtime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		
		</tr>
		<tr>
			<td>内容：</td>
		 	<td colspan="3"><textarea class="spinner" style="width:416px" readonly="readonly">${messageNoticeData.content}</textarea></td>
		
				<%--   <textarea id="messageNotice_mgr_messageNotice_form_content" name="content" style="width:410px;height: 23px;text-align: left;" class="spinner formta" readonly="readonly">
					${messageNoticeData.content}
				</textarea>  
				<div style="width:400px;" >
					${messageNoticeData.content}
				</div> --%>
	 
		</tr> 
	</table>
</form>
<script type="text/javascript">
	$('#messageNotice_mgr_messageNotice_form_letterstatus').val(renderGridValue('${messageNoticeData.letterstatus}',fields.letterstatus));
	$('#messageNotice_mgr_messageNotice_form_lettertype').val(renderGridValue('${messageNoticeData.lettertype}',fields.lettertype));
</script>
