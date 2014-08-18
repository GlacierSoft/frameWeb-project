<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%><!-- 引入jstl解析标签 -->
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form id="member_mgr_memberAuth_form" method="post" style="padding:15px">
	<table id="memberAuthDetailDataGrid" class="detailtable" data-options="fit:true" >
		<thead>   
	        <tr>   
	            <th style="width: 190px;">认证名称：</th>   
	            <th style="width: 190px;">状态：</th>   
	            <th style="width: 190px;">操作：</th>   
	        </tr>   
	    </thead> 
	    <tbody>
			<tr>
				<td><input id="member_mgr_memberAuth_form_infoName" name="infoName" class="spinner" style="width:168px" value="${memberAuthData.infoName}" readonly="readonly"/></td>
				<td>
				<c:choose>
				    <c:when test="${memberAuthData.infoAuth == 'authstr'}"> 
						<input id="member_mgr_memberAuth_form_infoAuth" name="infoAuth" class="spinner" style="width:168px;color: red;font-weight: bold;" value="${memberAuthData.infoAuth}" readonly="readonly"/>
		            </c:when>
		   			<c:otherwise> 
			   			<input id="member_mgr_memberAuth_form_infoAuth" name="infoAuth" class="spinner" style="width:168px" value="${memberAuthData.infoAuth}" readonly="readonly"/>
		   		    </c:otherwise>
				</c:choose>
				</td>
				<td>
				<c:choose>
				    <c:when test="${memberAuthData.infoAuth == 'noapply'}"> 
						<a id="infoAuthbtn" href="#" class="easyui-linkbutton" disabled='true' data-options="" >审核</a>
		            </c:when>
		   			<c:otherwise> 
		   				<a id="infoAuthbtn" href="#" class="easyui-linkbutton l-btn" data-options="">审核</a>
		   		    </c:otherwise>
				</c:choose>
				</td>
			</tr>
			<tr>
				<td><input id="member_mgr_memberAuth_form_vipName" name="vipName" class="spinner" style="width:168px" value="${memberAuthData.vipName}" readonly="readonly"/></td>
				<td>
				<c:choose>
				    <c:when test="${memberAuthData.vipAuth == 'authstr'}"> 
						<input id="member_mgr_memberAuth_form_vipAuth" name="vipAuth" class="spinner" style="width:168px;color: red;font-weight: bold;" value="${memberAuthData.vipAuth}" readonly="readonly"/>
		            </c:when>
		   			<c:otherwise> 
		   				<input id="member_mgr_memberAuth_form_vipAuth" name="vipAuth" class="spinner" style="width:168px" value="${memberAuthData.vipAuth}" readonly="readonly"/>
		   		    </c:otherwise>
				</c:choose>
				</td>
				<td>
				<c:choose>
				    <c:when test="${memberAuthData.vipAuth == 'noapply'}"> 
						<a id="vipAuthbtn" href="#" class="easyui-linkbutton" disabled="disabled" data-options="">审核</a>
		            </c:when>
		   			<c:otherwise> 
		   				<a id="vipAuthbtn" href="#" class="easyui-linkbutton" data-options="">审核</a>
		   		    </c:otherwise>
				</c:choose>
				</td>
			</tr>
			<%--<tr>
				<td><input id="member_mgr_memberAuth_form_emailName" name="emailName" class="spinner" style="width:168px" value="${memberAuthData.emailName}" readonly="readonly"/></td>
				<td>
				<c:choose>
				    <c:when test="${memberAuthData.emailAuth == 'authstr'}"> 
						<input id="member_mgr_memberAuth_form_emailAuth" name="emailAuth" class="spinner" style="width:168px;color: red;font-weight: bold;" value="${memberAuthData.emailAuth}" readonly="readonly"/>
		            </c:when>
		   			<c:otherwise> 
		   				<input id="member_mgr_memberAuth_form_emailAuth" name="emailAuth" class="spinner" style="width:168px" value="${memberAuthData.emailAuth}" readonly="readonly"/>
		   		    </c:otherwise>
				</c:choose>
				</td>
				<td><a id="emailAuthbtn" href="#" class="easyui-linkbutton" data-options="">审核</a></td>
			</tr>
			 <tr>
				<td><input id="member_mgr_memberAuth_form_mobileName" name="mobileName" class="spinner" style="width:168px" value="${memberAuthData.mobileName}" readonly="readonly"/></td>
				<td>
				<c:choose>
				    <c:when test="${memberAuthData.mobileAuth == 'authstr'}"> 
						<input id="member_mgr_memberAuth_form_mobileAuth" name="mobileAuth" class="spinner" style="width:168px;color: red;font-weight: bold;" value="${memberAuthData.mobileAuth}" readonly="readonly"/>
		            </c:when>
		   			<c:otherwise> 
		   				<input id="member_mgr_memberAuth_form_mobileAuth" name="mobileAuth" class="spinner" style="width:168px" value="${memberAuthData.mobileAuth}" readonly="readonly"/>
		   		    </c:otherwise>
				</c:choose>
				</td>
				<td><a id="mobileAuthbtn" href="#" class="easyui-linkbutton" data-options="">审核</a></td>
			</tr> --%>
			<tr>
				<td><input id="member_mgr_memberAuth_form_creditName" name="creditName" class="spinner" style="width:168px" value="${memberAuthData.creditName}" readonly="readonly"/></td>
				<td>
				<c:choose>
				    <c:when test="${memberAuthData.creditAuth == 'authstr'}"> 
						<input id="member_mgr_memberAuth_form_creditAuth" name="creditAuth" class="spinner" style="width:168px;color: red;font-weight: bold;" value="${memberAuthData.creditAuth}" readonly="readonly"/>
		            </c:when>
		   			<c:otherwise> 
		   				<input id="member_mgr_memberAuth_form_creditAuth" name="creditAuth" class="spinner" style="width:168px" value="${memberAuthData.creditAuth}" readonly="readonly"/>
		   		    </c:otherwise>
				</c:choose>
				</td>
				<td>
				<c:choose>
				    <c:when test="${memberAuthData.creditAuth == 'noapply'}"> 
						<a id="vipAuthbtn" href="#" class="easyui-linkbutton" disabled="disabled"  data-options="">审核</a>
		            </c:when>
		   			<c:otherwise> 
		   				<a id="creditAuthbtn" href="#" class="easyui-linkbutton" data-options="">审核</a>
		   		    </c:otherwise>
				</c:choose>
				</td>
			</tr>
			<tr>
				<td><input id="member_mgr_memberAuth_form_companyName" name="companyName" class="spinner" style="width:168px" value="${memberAuthData.companyName}" readonly="readonly"/></td>
				<td>
				<c:choose>
				    <c:when test="${memberAuthData.companyAuth == 'authstr'}"> 
						<input id="member_mgr_memberAuth_form_companyAuth" name="companyAuth" class="spinner" style="width:168px;color: red;font-weight: bold;" value="${memberAuthData.companyAuth}" readonly="readonly"/>
		            </c:when>
		   			<c:otherwise> 
		   				<input id="member_mgr_memberAuth_form_companyAuth" name="companyAuth" class="spinner" style="width:168px" value="${memberAuthData.companyAuth}" readonly="readonly"/>
		   		    </c:otherwise>
				</c:choose>
				</td>
				<td>
				<c:choose>
				    <c:when test="${memberAuthData.companyAuth == 'noapply'}"> 
						<a id="companyAuthbtn" href="#" class="easyui-linkbutton" disabled="disabled" data-options="">审核</a>
		            </c:when>
		   			<c:otherwise> 
		   				<a id="companyAuthbtn" href="#" class="easyui-linkbutton" data-options="">审核</a>
		   		    </c:otherwise>
				</c:choose>
				</td>
			</tr>
			<%-- <tr>
				<td><input id="member_mgr_memberAuth_form_realName" name="realName" class="spinner" style="width:168px" value="${memberAuthData.realName}" readonly="readonly"/></td>
				<td>
				<c:choose>
				    <c:when test="${memberAuthData.realNameAuth == 'authstr'}"> 
						<input id="member_mgr_memberAuth_form_realNameAuth" name="realNameAuth" class="spinner" style="width:168px;color: red;font-weight: bold;" value="${memberAuthData.realNameAuth}" readonly="readonly"/>
		            </c:when>
		   			<c:otherwise> 
		   				<input id="member_mgr_memberAuth_form_realNameAuth" name="realNameAuth" class="spinner" style="width:168px" value="${memberAuthData.realNameAuth}" readonly="readonly"/>
		   		    </c:otherwise>
				</c:choose>
				</td>
				<td>
				<c:choose>
				    <c:when test="${memberAuthData.realNameAuth == 'noapply'}"> 
						<a id="realNameAuthbtn" href="#" class="easyui-linkbutton" disabled="disabled" data-options="">审核</a>
		            </c:when>
		   			<c:otherwise> 
		   				<a id="realNameAuthbtn" href="#" class="easyui-linkbutton" data-options="">审核</a>
		   		    </c:otherwise>
				</c:choose>
				</td>
			</tr> --%>
			<tr>
				<td><input id="member_mgr_memberAuth_form_idCardName" name="idCardName" class="spinner" style="width:168px" value="${memberAuthData.idCardName}" readonly="readonly"/></td>
				<td>
				<c:choose>
				    <c:when test="${memberAuthData.idCardAuth == 'authstr'}"> 
						<input id="member_mgr_memberAuth_form_idCardAuth" name="idCardAuth" class="spinner" style="width:168px;color: red;font-weight: bold;" value="${memberAuthData.idCardAuth}" readonly="readonly"/>
		            </c:when>
		   			<c:otherwise> 
						<input id="member_mgr_memberAuth_form_idCardAuth" name="idCardAuth" class="spinner" style="width:168px" value="${memberAuthData.idCardAuth}" readonly="readonly"/>
		   		    </c:otherwise>
				</c:choose>
				</td>
				<td>
				<c:choose>
				    <c:when test="${memberAuthData.idCardAuth == 'noapply'}"> 
						<a id="idCardAuthbtn" href="#" class="easyui-linkbutton" disabled="disabled" data-options="">审核</a>
		            </c:when>
		   			<c:otherwise> 
		   				<a id="idCardAuthbtn" href="#" class="easyui-linkbutton" data-options="">审核</a>
		   		    </c:otherwise>
				</c:choose>
				</td>
			</tr>
			<tr>
				<td><input id="member_mgr_memberAuth_form_workName" name="workName" class="spinner" style="width:168px" value="${memberAuthData.workName}" readonly="readonly"/></td>
				<td>
				<c:choose>
				    <c:when test="${memberAuthData.workAuth == 'authstr'}"> 
						<input id="member_mgr_memberAuth_form_workAuth" name="workAuth" class="spinner" style="width:168px;color: red;font-weight: bold;" value="${memberAuthData.workAuth}" readonly="readonly"/>
		            </c:when>
		   			<c:otherwise> 
						<input id="member_mgr_memberAuth_form_workAuth" name="workAuth" class="spinner" style="width:168px" value="${memberAuthData.workAuth}" readonly="readonly"/>
		   		    </c:otherwise>
				</c:choose>
				</td>
				<td>
				<c:choose>
				    <c:when test="${memberAuthData.workAuth == 'noapply'}"> 
						<a id="" href="#" class="easyui-linkbutton" disabled="disabled" data-options="">审核</a>
		            </c:when>
		   			<c:otherwise> 
		   				<a id="workAuthbtn" href="#" class="easyui-linkbutton" data-options="">审核</a>
		   		    </c:otherwise>
				</c:choose>
				</td>
			</tr>
		</tbody>
	</table>
</form>
<p style="color:red;">温馨提示：状态为未申请不能进行审核操作！</p>
<script type="text/javascript">
	//下拉项emun的值
	$('#member_mgr_memberAuth_form_infoAuth').val(renderGridValue('${memberAuthData.infoAuth}',fields.auths));
	$('#member_mgr_memberAuth_form_vipAuth').val(renderGridValue('${memberAuthData.vipAuth}',fields.auths));
	$('#member_mgr_memberAuth_form_emailAuth').val(renderGridValue('${memberAuthData.emailAuth}',fields.auths));
	$('#member_mgr_memberAuth_form_mobileAuth').val(renderGridValue('${memberAuthData.mobileAuth}',fields.auths));
	$('#member_mgr_memberAuth_form_creditAuth').val(renderGridValue('${memberAuthData.creditAuth}',fields.auths));
	$('#member_mgr_memberAuth_form_companyAuth').val(renderGridValue('${memberAuthData.companyAuth}',fields.auths));
	//$('#member_mgr_memberAuth_form_realNameAuth').val(renderGridValue('${memberAuthData.realNameAuth}',fields.auths));
	$('#member_mgr_memberAuth_form_idCardAuth').val(renderGridValue('${memberAuthData.idCardAuth}',fields.auths));
	$('#member_mgr_memberAuth_form_workAuth').val(renderGridValue('${memberAuthData.workAuth}',fields.auths));  
	
	
    $('#infoAuthbtn').bind('click', function(){    
    /* 	if('${memberAuthData.memberName}' != 'authstr'){
    		
    	} */
	    if('${memberAuthData.infoAuth}' == 'authstr'){
	    	glacier.basicAddOrEditDialog({
	 			title : '${memberAuthData.memberName}'+"基本信息认证",
	 			width : 600,
				height : 310,
				border : true,
	 			queryUrl : ctx + '/do/memberAuth/intoAuthDetail.htm?memberId='+'${memberAuthData.memberId}'+'&auth='+'${memberAuthData.infoName}',
	 			submitUrl : ctx + '/do/memberAuth/edit.json?auth='+'${memberAuthData.infoName}',
	 			successFun : function (){
	 				glacier.member_mgr.memberAuth_mgr.memberAuth.memberAuthDataGrid.datagrid('reload');
	 				$('#memberAuthShow').dialog('destroy');//关闭窗体
	 			}
	 		});
	    }
    }); 
    $('#vipAuthbtn').bind('click', function(){
    	if('${memberAuthData.vipAuth}' == 'authstr'){
    		glacier.basicAddOrEditDialog({
    			title : '${memberAuthData.memberName}'+"会员vip认证",
    			width : 600,
    			height : 310,
    			queryUrl : ctx + '/do/memberAuth/intoAuthDetail.htm?memberId='+'${memberAuthData.memberId}'+'&auth='+'${memberAuthData.vipName}',
    			submitUrl : ctx + '/do/memberAuth/edit.json?auth='+'${memberAuthData.vipName}',
    			successFun : function (){
    				glacier.member_mgr.memberAuth_mgr.memberAuth.memberAuthDataGrid.datagrid('reload');
    				$('#memberAuthShow').dialog('destroy');//关闭窗体
    			}
    		});
    	}
   }); 
    $('#emailAuthbtn').bind('click', function(){
    	if('${memberAuthData.emailAuth}' == 'authstr'){
    		glacier.basicAddOrEditDialog({
    			title : '${memberAuthData.memberName}'+"邮箱认证",
    			width : 760,
    			height : 560,
    			queryUrl : ctx + '/do/memberAuth/intoAuthDetail.htm?memberId='+'${memberAuthData.memberId}'+'&auth='+'${memberAuthData.emailName}',
    			submitUrl : ctx + '/do/memberAuth/edit.json?auth='+'${memberAuthData.emailName}',
    			successFun : function (){
    				glacier.member_mgr.memberAuth_mgr.memberAuth.memberAuthDataGrid.datagrid('reload');
    				$('#memberAuthShow').dialog('destroy');//关闭窗体
    			}
    		});
    	}
   }); 
    $('#mobileAuthbtn').bind('click', function(){    
    	if('${memberAuthData.mobileAuth}' == 'authstr'){
	   	 glacier.basicAddOrEditDialog({
				title : '${memberAuthData.memberName}'+"手机认证",
				width : 760,
				height : 560,
				queryUrl : ctx + '/do/memberAuth/intoAuthDetail.htm?memberId='+'${memberAuthData.memberId}'+'&auth='+'${memberAuthData.mobileName}',
				submitUrl : ctx + '/do/memberAuth/edit.json?auth='+'${memberAuthData.mobileName}',
				successFun : function (){
					glacier.member_mgr.memberAuth_mgr.memberAuth.memberAuthDataGrid.datagrid('reload');
					$('#memberAuthShow').dialog('destroy');//关闭窗体
				}
			});
    	}
   }); 
    $('#creditAuthbtn').bind('click', function(){    
    	if('${memberAuthData.creditAuth}' == 'authstr'){
	   	 glacier.basicAddOrEditDialog({
				title : '${memberAuthData.memberName}'+"信用认证",
				width : 760,
				height : 560,
				queryUrl : ctx + '/do/memberAuth/intoAuthDetail.htm?memberId='+'${memberAuthData.memberId}'+'&auth='+'${memberAuthData.creditName}',
				submitUrl : ctx + '/do/memberAuth/edit.json?auth='+'${memberAuthData.creditName}',
				successFun : function (){
					glacier.member_mgr.memberAuth_mgr.memberAuth.memberAuthDataGrid.datagrid('reload');
					$('#memberAuthShow').dialog('destroy');//关闭窗体
				}
			});
    	}
   }); 
    $('#companyAuthbtn').bind('click', function(){    
    	if('${memberAuthData.companyAuth}' == 'authstr'){
	   	 glacier.basicAddOrEditDialog({
				title : '${memberAuthData.memberName}'+"企业认证",
				width : 760,
				height : 560,
				queryUrl : ctx + '/do/memberAuth/intoAuthDetail.htm?memberId='+'${memberAuthData.memberId}'+'&auth='+'${memberAuthData.companyName}',
				submitUrl : ctx + '/do/memberAuth/edit.json?auth='+'${memberAuthData.companyName}',
				successFun : function (){
					glacier.member_mgr.memberAuth_mgr.memberAuth.memberAuthDataGrid.datagrid('reload');
					$('#memberAuthShow').dialog('destroy');//关闭窗体
				}
			});
    	}
   }); 
    $('#realNameAuthbtn').bind('click', function(){    
    	if('${memberAuthData.realNameAuth}' == 'authstr'){
	   	 glacier.basicAddOrEditDialog({
				title : '${memberAuthData.memberName}'+"实名认证",
				width : 760,
				height : 560,
				queryUrl : ctx + '/do/memberAuth/intoAuthDetail.htm?memberId='+'${memberAuthData.memberId}'+'&auth='+'${memberAuthData.realName}',
				submitUrl : ctx + '/do/memberAuth/edit.json?auth='+'${memberAuthData.realName}',
				successFun : function (){
					glacier.member_mgr.memberAuth_mgr.memberAuth.memberAuthDataGrid.datagrid('reload');
					$('#memberAuthShow').dialog('destroy');//关闭窗体
				}
			});
    	}
   }); 
    $('#idCardAuthbtn').bind('click', function(){    
    	if('${memberAuthData.idCardAuth}' == 'authstr'){
	   	 glacier.basicAddOrEditDialog({
				title : '${memberAuthData.memberName}'+"身份证认证",
				width : 790,
				height : 560,
				queryUrl : ctx + '/do/memberAuth/intoAuthDetail.htm?memberId='+'${memberAuthData.memberId}'+'&auth='+'${memberAuthData.idCardName}',
				submitUrl : ctx + '/do/memberAuth/edit.json?auth='+'${memberAuthData.idCardName}',
				successFun : function (){
					glacier.member_mgr.memberAuth_mgr.memberAuth.memberAuthDataGrid.datagrid('reload');
					$('#memberAuthShow').dialog('destroy');//关闭窗体
				}
			});
    	}
   }); 
    $('#workAuthbtn').bind('click', function(){    
    	if('${memberAuthData.workAuth}' == 'authstr'){
	   	 glacier.basicAddOrEditDialog({
				title : '${memberAuthData.memberName}'+"工作认证",
				width : 600,
				height : 310,
				queryUrl : ctx + '/do/memberAuth/intoAuthDetail.htm?memberId='+'${memberAuthData.memberId}'+'&auth='+'${memberAuthData.workName}',
				submitUrl : ctx + '/do/memberAuth/edit.json?auth='+'${memberAuthData.workName}',
				successFun : function (){
					glacier.member_mgr.memberAuth_mgr.memberAuth.memberAuthDataGrid.datagrid('reload');
					$('#memberAuthShow').dialog('destroy');//关闭窗体
				}
			});
    	}
   }); 
</script>
