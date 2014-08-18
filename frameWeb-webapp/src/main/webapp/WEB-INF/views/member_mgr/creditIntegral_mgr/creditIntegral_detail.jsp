<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form method="post" style="padding:15px">
	<table class="detailtable">
		<tr>
			<td>会员名称：</td>
			<td class="forminputtable"><!-- 当表格行存在两个要显示的td,使用该forminputtable样式可以进行适当的空间调整  -->
				<input type="hidden" name="roleId" value="${creditIntegralData.creditIntegralId}" />
				<input class="spinner" style="width:168px"  value="${creditIntegralData.memberRealName}" readonly="readonly"/>
			</td>
			<td>信用类型：</td>
			<td><input id="creditIntegral_mgr_creditIntegral_detail_integralType" class="spinner" style="width:168px" readonly="readonly"/></td>
		</tr>

		<tr>
			<td>改变类型：</td>
			<td><input id="creditIntegral_mgr_creditIntegral_detail_changeType" class="spinner" style="width:168px" readonly="readonly"/></td>
			<td>改变值：</td>
			<td><input class="spinner" style="width:168px" value="${creditIntegralData.changeValue}" readonly="readonly"/></td>
		</tr>
		
		<tr>
			<td>创建人：</td>
			<td><input class="spinner" style="width:168px" value="${creditIntegralData.createrDisplay}" readonly="readonly"/></td>
			<td>创建时间：</td>
			<td><input class="spinner" style="width:168px" value="<fmt:formatDate value="${creditIntegralData.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>更新人：</td>
			<td><input class="spinner" style="width:168px" value="${creditIntegralData.updaterDisplay}" readonly="readonly"/></td>
			<td>更新时间：</td>
			<td><input class="spinner" style="width:168px" value="<fmt:formatDate value="${creditIntegralData.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>备注：</td>
			<td colspan="3"><textarea class="spinner" style="width:416px" readonly="readonly">${creditIntegralData.remark}</textarea></td>
		</tr>
	</table>
</form>
<script type="text/javascript">
	$('#creditIntegral_mgr_creditIntegral_detail_integralType').val(renderGridValue('${creditIntegralData.integralType}',fields.creditIntegralType));
	$('#creditIntegral_mgr_creditIntegral_detail_changeType').val(renderGridValue('${creditIntegralData.changeType}',fields.changeType));
</script>
