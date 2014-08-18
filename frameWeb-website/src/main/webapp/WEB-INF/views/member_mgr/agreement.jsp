<%@page import="com.glacier.netloan.entity.borrow.ReceivablesNotes"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%><!-- 引入jstl解析标签 -->
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %><!-- 引入自定义权限标签 -->
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<%    
String path = request.getContextPath();    
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";    
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
		
		#topAgreement {
			margin-left: 60px;
			margin-bottom: 20px;
		}
		
		#topAgreement div{
			margin-top: 5px;
		}
		
		#centerAgreement {
			margin-left: 60px;
			margin-bottom: 20px;
			margin-top: 20px;
		}
		
		#centerAgreement div{
			margin-top: 5px;
		}
		
		#buttomAgreement {
			margin-left: 60px;
			margin-bottom: 20px;
			margin-top: 20px;
		}
		
		#buttomAgreement div{
			margin-top: 5px;
		}
		
		#buttomsAgreement {
			margin-left: 60px;
			margin-bottom: 20px;
			margin-top: 50px;
		}
		
		#buttomsAgreement div{
			margin-top: 5px;
		}
	</style>
  </head>
  <body>
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
					    <div id="collapseTwo" class="panel-collapse collapse">
					      <div class="panel-body">
					        <div class="btn-group-vertical">
							  <a href="#" onclick="doClick('borrowingLoan/memberBorrow.htm?&p=1&loanState=firstAudit','${currentMember.memberId}');"  class="btn btn-default" role="button">已发布的借款</a>
							  <a href="#" onclick="doClick('borrowingLoan/memberBorrow.htm?&p=1&loanState=repaymenting','${currentMember.memberId}');" class="btn btn-default" role="button">还款管理</a>
							  <a href="#" onclick="doClick('borrowingLoan/memberStatistics.htm','${currentMember.memberId}');" class="btn btn-default" role="button">贷款统计</a>
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
					    <div id="collapseThree" class="panel-collapse collapse in">
					      <div class="panel-body">
					      	<div class="btn-group-vertical">
					      	  <a href="#" onclick="doClick('investment/memberTenderNotes.htm?&p=1&loanStates=sucessBorrow','${currentMember.memberId}')" class="btn btn-info" role="button">我的投标</a>
						      <a href="#" onclick="doClick('attentionBorrowing/memberAttentionBorrowing.htm?&p=1','${currentMember.memberId}')" class="btn btn-default" role="button">我关注的借款</a>
			 	              <a href="#" onclick="doClick('bankingStatistics/memberBankingStatistics.htm','${currentMember.memberId}')" class="btn btn-default" role="button">投资统计</a>
					      </div>
					    </div>
					  </div>
					</div>
				</div>
	    	</div>
	    	<div class="col-md-10">
	    		<div class="panel panel-default">
				  <div class="panel-heading">
				    <h3 class="panel-title">借款协议</h3>
				  </div>
				  <div style="padding-top:10px;padding-bottom: 20px;">
						   <div style="width:920px;border: 0px solid black;margin-top: 20px;">
						       <h2 style="font-size: 20px;text-align: center;color: black;font-weight: bold;">借款协议</h2>
						       <div id="topAgreement">
							       <div class="BorrowAgreeDiv">合同编号：<b><u>P2P—<fmt:formatDate value="${repaymentNotesStartTime[0].shouldPayDate }" pattern='yyyyMMddhhmm'/></u></b></div>
							       <div class="BorrowAgreeDiv">签约日期：<fmt:formatDate value="${repaymentNotesStartTime[0].shouldPayDate }" pattern='yyyy年MM月dd日'/></div>
							       <div class="BorrowAgreeDiv">协议三方定义: </div>
							       <div class="BorrowAgreeDiv">贷出者：${currentMember.memberName} ，以下称“贷出方”</div>
							       <div class="BorrowAgreeDiv">管理方：冰川网贷，以下称“管理方”</div>
							       <div class="BorrowAgreeDiv"></div>
							       <div class="BorrowAgreeDiv">郑重承诺：</div>
							       <div class="BorrowAgreeDiv">贷出者：</div>
							       <div class="BorrowAgreeDiv"></div>
						       </div>
						       <div style="wdith:860;margin-left: 60px;height: 100px;border: 0px solid red;line-height: 20px;font-size: 12px;">
						          <table style="width: 860px;height: 100px;border: 1px solid black;text-align: center;" class="table_one">
						               <tr style="background: #D9D9D9">
						                   <td>出借人名称</td><td> 借出金额(人民币) </td><td> 借款期限 </td><td> 年利率 </td><td> 借款开始日期 </td><td> 借款到期日期 </td><td></td><td>总还款本息(人民币)</td>
						               </tr>
						               <c:forEach items="${receivablesNotesList}" var="receivablesNotes" varStatus="status">
						               	<tr>
						               		<td>${receivablesNotes.memberDisplay }</td><td>￥<fmt:formatNumber value='${receivablesNotes.shouldRecePrincipal }' pattern='#0.00'/></td>
						               		<td>${borrowingLoan.loanDeadlinesId} </td><td><fmt:formatNumber value="${repaymentNotes[0].loanApr * 100}" pattern="#,#00.00"/> %</td>
						               		<td><fmt:formatDate value="${repaymentNotesStartTime[0].shouldPayDate }" pattern='yyyy-MM-dd'/></td>
						               		<td><fmt:formatDate value="${repaymentNotesEndTime[0].shouldPayDate }" pattern='yyyy-MM-dd'/></td>
						               		<td></td><td>￥${receivablesNotes.shouldReceMoney }</td>
						               	</tr>
						               </c:forEach>
						               <%
						               		double shouldRecePrincipal=0;
						               		double shouldReceMoney=0;
						               		List receivablesNotesList = (List)request.getAttribute("receivablesNotesList");
						               		for(int i=0;i<receivablesNotesList.size();i++){
						               			ReceivablesNotes receivablesNotes =  (ReceivablesNotes)receivablesNotesList.get(i);
						               			shouldRecePrincipal+=receivablesNotes.getShouldRecePrincipal();
						               			shouldReceMoney+=receivablesNotes.getShouldReceMoney();
						               		}
						               %>
						               <tr>
						                   <td>总金额：</td><td>￥<fmt:formatNumber value='<%=shouldRecePrincipal %>' pattern='#0.00'/></td><td></td><td></td><td></td><td></td><td>总还本息：</td><td>￥<fmt:formatNumber value='<%=shouldReceMoney %>' pattern='#0.00'/></td>
						               </tr>
						          </table>
						       </div>
						       <div id="centerAgreement">
						       <div class="BorrowAgreeDiv"></div>
						       <div class="BorrowAgreeDiv">借入者 : ${member.memberName }(${fn:substring(member.cardId, 0, 12)}******)</div>
						       <div class="BorrowAgreeDiv">管理方: <b><u>冰川网贷</u></b></div>
						       <div class="BorrowAgreeDiv">三方约定:</div>
						       <div class="BorrowAgreeDiv">由管理方负责将贷出方的款项划转至借款方开立的账户。 </div>
						       <div class="BorrowAgreeDiv">第一条 借款基本信息 </div>
						       </div>
						        <div style="wdith:560;margin-left: 200px;height: 200px;border: 0px solid red;line-height: 20px;font-size: 12px;">
						          <table style="width: 560px;height: 200px;border: 1px solid black;" class="table_one">
						               <tr style="background: #D9D9D9"> <td>借款人名称</td><td>${borrowingLoan.memberDisplay }</td></tr>
						                <tr ><td> 借款本金数额: </td><td>￥<fmt:formatNumber value='${borrowingLoan.loanTotal }' pattern='#0.00'/></td></tr>
						                <tr style="background: #D9D9D9"><td> 应偿还本息数额: </td><td>￥<fmt:formatNumber value='${repaymentNotes[0].shouldPayMoney }' pattern='#0.00'/></td></tr>
						                <tr > <td> 还款分期月数: </td><td>${borrowingLoan.loanDeadlinesId}</td></tr>
						                <tr style="background: #D9D9D9"><td> 借款利率: </td><td><fmt:formatNumber value="${repaymentNotes[0].loanApr * 100}" pattern="#,#00.00"/> %</td></tr>
						                <tr ><td> 还款方式: </td><td>${borrowingLoan.repaymentTypeDisplay}</td></tr>
						                 <tr ><td>  借款描述: : </td><td>${borrowingLoan.loanDetail}</td></tr>
						                 <tr style="background: #D9D9D9"><td>  还款日: </td><td>每月<fmt:formatDate value="${repaymentNotesStartTime[0].shouldPayDate }" pattern='dd'/>日（24：00前，节假日不顺延）</td></tr>
						                 <tr ><td>还款起止日期: </td><td><fmt:formatDate value="${repaymentNotesStartTime[0].shouldPayDate }" pattern='yyyy-MM-dd'/> 至 <fmt:formatDate value="${repaymentNotesEndTime[0].shouldPayDate }" pattern='yyyy-MM-dd'/> 止</td></tr>
						          </table>
						       </div>
						       <div id="buttomAgreement">
						       <div class="BorrowAgreeDiv"></div>
						       <div class="BorrowAgreeDiv">分期还款明细列表</div>
						       <div class="BorrowAgreeDiv"></div>
						       </div>
						       <div class="BorrowAgreeDiv"></div>
						       <div style="wdith:860;margin-left: 60px;height: 40px;border: 0px solid red;line-height: 20px;font-size: 12px;">
						         <table style="width: 860px;height: 30px;border: 1px solid black;text-align: center;" class="table_one">
						                <tr style="background: #D9D9D9">
						                   <td>期数</td><td> 应还时间 </td><td> 应还本息 </td><td> 还款本金 </td><td> 还款利息 </td><td>还款状态</td>
						               </tr>
						               <c:forEach items="${repaymentNotesList}" var="repaymentNotes" varStatus="status">
						               	<tr>
						               		<td>${repaymentNotes.numberPeriod}</td><td><fmt:formatDate value="${repaymentNotes.shouldPayDate }" pattern='yyyy-MM-dd'/></td>
						               		<td>￥<fmt:formatNumber value='${repaymentNotes.currentPayMoeny}' pattern='#0.00'/></td><td>￥<fmt:formatNumber value='${repaymentNotes.currentPayPrincipal}' pattern='#0.00'/></td>
						               		<td>￥<fmt:formatNumber value='${repaymentNotes.currentPayInterest}' pattern='#0.00'/></td>
						               		<td>
						               			<c:if test="${repaymentNotes.repayState=='notRepay'}">
						               				未还
						               			</c:if>
						               			<c:if test="${repaymentNotes.repayState=='alreadRepay'}">
						               				已还
						               			</c:if>
						               		</td>
						               	</tr>
						               </c:forEach>
						          </table>
						        </div>
						       <div id="buttomsAgreement" style="padding-top: 40px">
						       <div class="BorrowAgreeDiv"></div>
						       <div class="BorrowAgreeDiv">第二条 各方权利和义务</div>
						       <div class="BorrowAgreeDiv">贷出方的权利和义务 : </div>
						       <div class="BorrowAgreeDiv">贷出者：${currentMember.memberName} </div>
						       <div class="BorrowAgreeDiv">借入者：${member.memberName }(${fn:substring(member.cardId, 0, 12)}******)</div>
						       <div class="BorrowAgreeDiv">通信地址：<b><u>珠海香洲区</u></b></div>
						       <div class="BorrowAgreeDiv">管理方：冰川网贷<b><u>冰川网贷</u></b></div>
						       </div>
						   </div>
						</div>
				</div>
	    	</div>
	    </div>
	    <hr class="featurette-divider2">
	   
	    </div>
	    <!-- CONTAINER START======================== -->
	     <jsp:include page="../foot.jsp"/>  
  </body>
  	<script type="text/javascript">
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
	</script>
</html>