<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%><!-- 引入jstl解析标签 -->
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %><!-- 引入自定义权限标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<%@ page import="org.apache.shiro.web.filter.authc.FormAuthenticationFilter"%>
<%@ page import="org.apache.shiro.authc.LockedAccountException"%>
<%@ page import="com.glacier.basic.exception.IncorrectCaptchaException"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
%>

<!DOCTYPE html>
<html lang="zh-cn">
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>冰川网贷平台</title>
   	<!-- 引入公用的js和样式库 -->
	<jsp:include page="../inc.jsp"/>
	<style type="text/css">
		body {
		    padding-top: 100px;
		}
	</style>
  </head>
  <body>
  <%
    response.setHeader("Cache-Control","no-store");
    response.setDateHeader("Expires", 0);
    response.setHeader("Pragma","no-cache"); 
  %>
<jsp:include page="../nav_mgr/navMember.jsp"/>
       
	    <!-- CONTAINER START======================== -->
	    <div class="container">
	    <div class="row">
		    <div class="col-md-2">
	    		<div class="panel-group" id="accordion">
					  <div class="panel panel-default">
					    <div class="panel-heading">
					      <h4 class="panel-title">
					        <a data-toggle="collapse" data-toggle="collapse" data-parent="#accordion" href="#collapseOne">
					      	   信息中心
					        </a>
					      </h4>
					    </div>
					    <div id="collapseOne" class="panel-collapse collapse">
					      <div class="panel-body">
					        <div class="btn-group-vertical">
					          <a href="${ctx}/member/index.htm" class="btn btn-default" role="button">我的主页</a>
					          <a href="#" onclick="checkRechargeWithdraw('${currentMember.memberId}','${ctx}/financeMember/rechargeWithdraw.htm?p=1');" class="btn btn-default" role="button">充值提现</a>
					          <a href="#" onclick="checksMember('${currentMember.memberId}','${ctx}/member/memberAuth.htm?&p=0');" class="btn btn-default" role="button">平台认证</a>
					          <a href="#" onclick="checksMember('${currentMember.memberId}','${ctx}/messageNotice/intoMessageNotice.htm?&p=1');" class="btn btn-default" role="button">站内信</a>
							  <a href="${ctx}/member/memberDetail.htm" class="btn btn-default" role="button">个人设置</a>
							  <a href="#" onclick="checksMember('${currentMember.memberId}','${ctx}/member/memberPhotoInto.htm');" class="btn btn-default" role="button">头像上传</a>
							  <a href="${ctx}/member/memberEmail.htm" class="btn btn-default" role="button">邮箱设置</a>
							</div>
					      </div>
					    </div>
					  </div>
					  <div class="panel panel-default">
					    <div class="panel-heading">
					      <h4 class="panel-title">
					        <a data-toggle="collapse" data-toggle="collapse" data-parent="#accordion" href="#collapseTwo">
					         	 借款管理
					        </a>
					      </h4>
					    </div>
					    <div id="collapseTwo" class="panel-collapse collapse in">
					      <div class="panel-body">
					        <div class="btn-group-vertical">
							  <a href="#" onclick="doClick('/borrowingLoan/memberBorrow.htm?&p=1&loanState=firstAudit','${currentMember.memberId}');"  class="btn btn-default" role="button">已发布的借款</a>
							  <a href="#" onclick="doClick('/borrowingLoan/memberBorrow.htm?&p=1&loanState=repaymenting','${currentMember.memberId}');" class="btn btn-info" role="button">还款管理</a>
							  <a href="#" onclick="doClick('/borrowingLoan/memberStatistics.htm','${currentMember.memberId}');" class="btn btn-default" role="button">贷款统计</a>
							</div>
					      </div>
					    </div>
					  </div>
					  <div class="panel panel-default">
					    <div class="panel-heading">
					      <h4 class="panel-title">
					        <a data-toggle="collapse" data-toggle="collapse" data-parent="#accordion" href="#collapseThree">
					    	      投资管理
					        </a>
					      </h4>
					    </div>
					    <div id="collapseThree" class="panel-collapse collapse">
					      <div class="panel-body">
					      	<div class="btn-group-vertical">
					      	  <a href="#" onclick="doClick('/investment/memberTenderNotes.htm?&p=1&loanStates=sucessBorrow','${currentMember.memberId}')" class="btn btn-default" role="button">我的投标</a>
	   						  <a href="#" onclick="doClick('/attentionBorrowing/memberAttentionBorrowing.htm?&p=1','${currentMember.memberId}')" class="btn btn-default" role="button">我关注的借款</a>
	                          <a href="#" onclick="doClick('/bankingStatistics/memberBankingStatistics.htm','${currentMember.memberId}')" class="btn btn-default" role="button">投资统计</a>
					      </div>
					    </div>
					  </div>
					</div>
				</div>
	    	</div>
	    	<div class="col-md-10">
	    		<div class="panel panel-default">
				  <div class="panel-heading">
				    <h3 class="panel-title">会员中心 / 借款管理 / 还款明细管理</h3>
				  </div>
				  <div class="panel-body">
					<form id="conductRepayment" name="conductRepayment" class="form-horizontal" role="form" method="post" onsubmit="return validaconductRepaymentSubForm();">
			  		  <table class="table table-bordered">
			          	<thead>
				          <tr>
				            <th colspan="4">借款信息</th>
				          </tr>
				        </thead>
			          	<tbody>
				          <tr>
				            <td>借款标题：</td>
				            <td>${borrowingLoan.loanTitle}</td>
				            <td>借款金额：</td>
				            <td>￥<fmt:formatNumber value='${borrowingLoan.loanTotal}' pattern='#,#00.00'/></td>
				          </tr>
				          <tr>
				            <td>借款利率：</td>
				            <td><fmt:formatNumber value="${borrowingLoan.loanApr * 100}" pattern="#,#00.00"/> %</td>
				            <td>借款期限：</td>
				            <td>${borrowingLoan.loanDeadlinesId}个月</td>
				          </tr>
				          <tr>
				            <td>还款方式：</td>
				            <td>${borrowingLoan.repaymentTypeDisplay}</td>
				            <td>借款时间：</td>
				            <td><fmt:formatDate value="${borrowingLoan.loanDate}" type="date"/></td>
				          </tr>
				      	</tbody>
				      </table>
				      <table class="table table-bordered">
			          	<thead>
				          <tr>
				            <th colspan="4">进行还款</th>
				          </tr>
				        </thead>
			          	<tbody>
				          <tr>
				            <td>账户余额：</td>
				            <td>
				            	<input type="hidden" id="financeMemberId" name="financeMemberId" value="${financeMemberDate.financeMemberId}"/>
				            	￥<fmt:formatNumber value='${financeMemberDate.amount}' pattern='#,#00.00'/>
				            </td>
				            <td>可用余额：</td>
				            <td>￥<fmt:formatNumber value='${financeMemberDate.usableMoney}' pattern='#,#00.00'/></td>
				          </tr>
				          <tr>
				            <td>还款日期： </td>
				            <td><fmt:formatDate value="${repaymentNotesDetailsData.shouldPayDate}" type="date"/></td>
				            <td>待还本息：</td>
				            <td>￥<fmt:formatNumber value='${repaymentNotesDetailsData.currentPayMoeny}' pattern='#,#00.00'/></td>
				          </tr>
				          <tr>
				            <td>逾期罚息：</td>
				            <td>￥<fmt:formatNumber value='${repaymentNotesDetailsData.overdueInterest}' pattern='#,#00.00'/></td>
				            <td>逾期催收费：</td>
				            <td>￥<fmt:formatNumber value='${repaymentNotesDetailsData.overdueUrgeFee}' pattern='#,#00.00'/></td>
				          </tr>
				          <tr>
				            <td>逾期管理费：</td>
				            <td>￥<fmt:formatNumber value='${repaymentNotesDetailsData.overdueManaFee}' pattern='#,#00.00'/></td>
				            <td>需还总额：</td>
				            <td>￥<fmt:formatNumber value='${repaymentNotesDetailsData.currentPayMoeny+repaymentNotesDetailsData.overdueInterest+repaymentNotesDetailsData.overdueUrgeFee+repaymentNotesDetailsData.overdueManaFee}' pattern='#,#00.00'/></td>
				          </tr>
				          <tr>
				            <td class="col-md-2">交易密码：</td>
				            <td class="col-md-3">
				            	<input type="hidden" id="repayNotesDetailId" name="repayNotesDetailId" value="${repaymentNotesDetailsData.repayNotesDetailId}"/>
				            	<input type="hidden" id="loanTitle" name="loanTitle" value="${repaymentNotesDetailsData.loanTitle}"/>
				            	<input type="hidden" id="memberId" name="memberId" value="${currentMember.memberId}" >
				             	<input type="text" autocomplete="off"  id="tradersPassword" name="tradersPassword" maxlength="50" class="inp200x" onfocus="this.type='password'" value=""/>
				           </td>
				            <td class="col-md-2">验证码：</td>
						  	<td class="col-md-5">
								<div class="col-md-6" align="left" style="padding: 0px; width: 120px;">
									<input type="text" id="captcha" name="captcha" maxlength="4" class="form-control" placeholder="验证码"/>
								</div>
								<div class="col-md-6">
									<img style="width:120px;height:32px;" class="img-responsive" id="login_kaptcha" src="${ctx}/resources/images/kaptcha.jpg" />
								</div>
						  	</td>
				          </tr>
				          <tr>
				            <td colspan="4" align="center">
				            	<button id="subSum" type="submit" class="btn btn-default">确认还款</button>
				            	<button type="reset" class="btn btn-default">重置信息</button>
				            </td>
				          </tr>
				      	</tbody>
				      </table>
				    </form>
				  </div>
				</div>
	    	</div>
	    </div>
	    <hr class="featurette-divider2">
	   
	    </div>
	    <!-- CONTAINER START======================== -->
	     <jsp:include page="../foot.jsp"/>
<script type="text/javascript">


//禁用Enter键表单自动提交
    document.onkeydown = function(event) {
        var target, code, tag;
        if (!event) {
            event = window.event; //针对ie浏览器
            target = event.srcElement;
            code = event.keyCode;
            if (code == 13) {
                tag = target.tagName;
                if (tag == "TEXTAREA") {
                	return true; 
                } else {
                	return false;
                }
            }
        }else {
            target = event.target; //针对遵循w3c标准的浏览器，如Firefox
            code = event.keyCode;
            if (code == 13) {
                tag = target.tagName;
                if (tag == "INPUT") { 
                	return false;
                	
                	}else{ 
                		return true; 
                	} 
            }
        }
    };








	//功能判断
	function checksMember(memberId,url){
		$.ajax({
			   type: "POST",
			   url: ctx+"/member/judgeCheckMember.json",
			   dataType: "json",
			   data: 'memberId='+memberId,
		   success: function(r) {
			   successHint(r,url);
	       },
	       error: function() {
	    	   location.href="${ctx}/login.htm";
	       }
		});
	}
	
	//充值提现判断
	function checkRechargeWithdraw(memberId,url){
		$.ajax({
			   type: "POST",
			   url: ctx+"/financeMember/judgeCheckRechargeWithdraw.json",
			   dataType: "json",
			   data: 'memberId='+memberId,
		   success: function(r) {
			   successHint(r,url);
	        },
	        error: function() {
	        	location.href="${ctx}/login.htm";
	        }
		});
	}
	
	function successHint(data,url){
		//如果不存在，则转到借款页面
		if(data.success){
		window.location.href=url;
	}else{//如果存在，则提示错误信息
		KindEditor.ready(function(K) {
			var dialog = K.dialog({
			       width : 500,
			       title : "提示",
			       body : '<div style="margin:10px;"><strong>'+data.msg+'</strong></div>',
			       closeBtn : {
		               name : '关闭',
		               click : function(e) {
		                       dialog.remove();
		                       window.location.href="${ctx}/member/memberDetail.htm";
		                }
		        	},
			        yesBtn : {
		                name : '关闭',
		                click : function(e) {
		                	dialog.remove();
		                	window.location.href="${ctx}/member/memberDetail.htm";
		                }
			        }
				});
			});
	  	}
	}


   //构建表单
   function doClick(url,str){ 
		// 创建Form  
		var form = $('<form></form>');  
		// 设置属性  
	    form.attr('action', '<%=basePath%>'+url);  
	    form.attr('method', 'post');  
	    // form的target属性决定form在哪个页面提交  (_self -> 当前页面 _blank -> 新页面)  
	    form.attr('target', '_self');  
	    // 创建Input  
	    var my_input = $('<input type="text" name="memberId" />');  
	    my_input.attr('value', str);  
	    // 附加到Form  
	    form.append(my_input);  
	    //表单的构建是否 完成
	    form.appendTo(document.body).submit();
    }
	
   window.onload=function(){  
		    if("${repaymentNotesDetailsData.repayState}"=="alreadRepay"){
		    	doClick('/borrowingLoan/memberBorrow.htm?&p=1&loanState=repaymenting','${currentMember.memberId}');
		    }
		}
  
	validaconductRepaymentSubForm = function(){
		var $subSum = $('#subSum');
		if(${repaymentNotesDetailsData.alsoNeedMoney} > ${financeMemberDate.usableMoney}){
			 vipdialog("您的可用余额不足以进行此期还款!");
			 return false;
		}
		
		
	}
	
	$("#conductRepayment").validate({
    	rules:{
    		tradersPassword:"required",
			captcha:"required"
		},
		messages:{
			tradersPassword:"交易密码不能为空",
			captcha:"验证码不能为空"
		},submitHandler:function(){
			$('#subSum').attr('disabled',"true");//提交就禁用按钮
   			$.ajax({
   				   type: "POST",
   				   url: ctx+"/repaymentNotesDetail/repayment.json",
   				   dataType: "json",
   				   data: $("#conductRepayment").serialize(),
    			   success: function(r) {
    				   successAddRecharge(r); 
                    },
                    error: function() {
                        alert("提交出错！");  
                        $('#subSum').removeAttr("disabled");
                    }
   				});
   		} 
   	});
    
    function successAddRecharge(data){
    	$('#subSum').removeAttr("disabled");
		KindEditor.ready(function(K) {
		var dialog = K.dialog({
				        width : 500,
				        title : '提示信息',
				        body : '<div style="margin:10px;"><strong>'+data.msg+'</strong></div>',
				        closeBtn : {
				                name : '关闭',
				                click : function(e) {
				                        dialog.remove(); 
				                }
				        },
				        yesBtn : {
				                name : '确定',
				                click : function(e) {   
				                	 dialog.remove(); 
				                	if(data.success){
				                		window.location.href="${ctx}/borrowingLoan/memberRepaymentDetail.htm?&loanId=${borrowingLoan.loanId}&memberId=${currentMember.memberId}&p=1";
				                	}else{ 
				                		dialog.remove();  
				                	}
				                }
				        }
					});
		});
	};
	//验证码验证
	$(function() {
		$('#login_kaptcha').click(function() {  
			$('#captcha').val('');
        	$(this).hide().attr('src','${pageContext.request.contextPath}/resources/images/kaptcha.jpg?' + Math.floor(Math.random() * 100)).fadeIn();     
	    });
	});
	function vipdialog(data){
		KindEditor.ready(function(K) {
		var dialog = K.dialog({
				        width : 300,
				        title : '信息提示',
				        body : '<div style="margin:10px;"><strong>'+data+'</strong></div>',
				        closeBtn : {
				                name : '关闭',
				                click : function(e) {
				                        dialog.remove();
				                }
				        },
				        yesBtn : {
				                name : '确定',
				                click : function(e) { 
				                		dialog.remove();
				                }
				        },
					});
		});
	}
	
	//构建表单
	function doClick(url,str){
		// 创建Form  
		var form = $('<form></form>');  
		// 设置属性  
	    form.attr('action', '<%=basePath%>'+url);  
	    form.attr('method', 'post');  
	    // form的target属性决定form在哪个页面提交  (_self -> 当前页面 _blank -> 新页面)  
	    form.attr('target', '_self');  
	    // 创建Input  
	    var my_input = $('<input type="text" name="memberId" />');  
	    my_input.attr('value', str);  
	    // 附加到Form  
	    form.append(my_input);  
	    //表单的构建是否 完成
	    form.appendTo(document.body).submit();
	 }
</script>
  </body>
</html>