<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%><!-- 引入jstl解析标签 -->
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %><!-- 引入自定义权限标签 -->
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
				    <h3 class="panel-title">我的投标</h3>
				  </div>
				  <div class="panel-body">
				  <div id="tenderNotesList">
				  <div style="padding-top:10px;padding-bottom: 20px;">
				  		<c:choose>
						   <c:when test="${buttonState == 'sucessBorrow'}">  
						   	<a id="sucessBorrow" href="#" onclick="doClick('investment/memberTenderNotes.htm?&p=1&loanStates=sucessBorrow','${currentMember.memberId}');" class="btn btn-success" role="button">成功借出</a>
							<a id="tenderingBorrow" href="#" onclick="doClick('investment/memberTenderNotes.htm?&p=1&loanStates=tenderingBorrow','${currentMember.memberId}');" class="btn btn-primary" role="button">招标中借款</a>
							<a id="receingBorrow" href="#" onclick="doClick('receivablesNotes/memberReceivablesNotes.htm?&p=1&loanStates=repaymentingBorrow','${currentMember.memberId}');" class="btn btn-primary" role="button">回收中借款</a>
							<a href="#" onclick="doClick('receivablesNotes/memberReceivablesNotes.htm?&p=1&loanDetailStates=alreadReceivables','${currentMember.memberId}');" class="btn btn-primary" role="button">已回收借款</a>
							<a href="#" onclick="doClick('receivablesNotes/memberReceivablesNotes.htm?&p=1&loanStates=backAccountBorrow','${currentMember.memberId}');" class="btn btn-primary" role="button">回账查询</a> 
						   </c:when>
						   <c:when test="${buttonState == 'tenderingBorrow'}">  
						   	<a id="sucessBorrow" href="#" onclick="doClick('investment/memberTenderNotes.htm?&p=1&loanStates=sucessBorrow','${currentMember.memberId}');" class="btn btn-primary" role="button">成功借出</a>
							<a id="tenderingBorrow" href="#" onclick="doClick('investment/memberTenderNotes.htm?&p=1&loanStates=tenderingBorrow','${currentMember.memberId}');"class="btn btn-success" role="button">招标中借款</a>
							<a id="receingBorrow" href="#" onclick="doClick('receivablesNotes/memberReceivablesNotes.htm?&p=1&loanStates=repaymentingBorrow','${currentMember.memberId}');" class="btn btn-primary" role="button">回收中借款</a>
							<a href="#" onclick="doClick('receivablesNotes/memberReceivablesNotes.htm?&p=1&loanDetailStates=alreadReceivables','${currentMember.memberId}');" class="btn btn-primary" role="button">已回收借款</a>
							<a href="#" onclick="doClick('receivablesNotes/memberReceivablesNotes.htm?&p=1&loanStates=backAccountBorrow','${currentMember.memberId}');" class="btn btn-primary" role="button">回账查询</a> 
						   </c:when>
						   <c:when test="${buttonState == 'repaymentingBorrow'}">  
						   	<a id="sucessBorrow" href="#" onclick="doClick('investment/memberTenderNotes.htm?&p=1&loanStates=sucessBorrow','${currentMember.memberId}');" class="btn btn-primary" role="button">成功借出</a>
							<a id="tenderingBorrow" href="#" onclick="doClick('investment/memberTenderNotes.htm?&p=1&loanStates=tenderingBorrow','${currentMember.memberId}');"class="btn btn-primary" role="button">招标中借款</a>
							<a id="receingBorrow" href="#" onclick="doClick('receivablesNotes/memberReceivablesNotes.htm?&p=1&loanStates=repaymentingBorrow','${currentMember.memberId}');" class="btn btn-success" role="button">回收中借款</a>
							<a href="#" onclick="doClick('receivablesNotes/memberReceivablesNotes.htm?&p=1&loanDetailStates=alreadReceivables','${currentMember.memberId}');" class="btn btn-primary" role="button">已回收借款</a>
							<a href="#" onclick="doClick('receivablesNotes/memberReceivablesNotes.htm?&p=1&loanStates=backAccountBorrow','${currentMember.memberId}');" class="btn btn-primary" role="button">回账查询</a> 
						   </c:when>
						   <c:when test="${buttonState == 'alreadReceivablesBorrow'}">  
						   	<a id="sucessBorrow" href="#" onclick="doClick('investment/memberTenderNotes.htm?&p=1&loanStates=sucessBorrow','${currentMember.memberId}');" class="btn btn-primary" role="button">成功借出</a>
							<a id="tenderingBorrow" href="#" onclick="doClick('investment/memberTenderNotes.htm?&p=1&loanStates=tenderingBorrow','${currentMember.memberId}');" class="btn btn-primary" role="button">招标中借款</a>
							<a id="receingBorrow" href="#" onclick="doClick('receivablesNotes/memberReceivablesNotes.htm?&p=1&loanStates=repaymentingBorrow','${currentMember.memberId}');" class="btn btn-primary" role="button">回收中借款</a>
							<a href="#" onclick="doClick('receivablesNotes/memberReceivablesNotes.htm?&p=1&loanDetailStates=alreadReceivables','${currentMember.memberId}');" class="btn btn-success" role="button">已回收借款</a>
							<a href="#" onclick="doClick('receivablesNotes/memberReceivablesNotes.htm?&p=1&loanStates=backAccountBorrow','${currentMember.memberId}');" class="btn btn-primary" role="button">回账查询</a> 
						   </c:when>
						   <c:when test="${buttonState == 'backAccountBorrow'}">  
						   	<a id="sucessBorrow" href="#" onclick="doClick('investment/memberTenderNotes.htm?&p=1&loanStates=sucessBorrow','${currentMember.memberId}');" class="btn btn-primary" role="button">成功借出</a>
							<a id="tenderingBorrow" href="#" onclick="doClick('investment/memberTenderNotes.htm?&p=1&loanStates=tenderingBorrow','${currentMember.memberId}');" class="btn btn-primary" role="button">招标中借款</a>
							<a id="receingBorrow" href="#" onclick="doClick('receivablesNotes/memberReceivablesNotes.htm?&p=1&loanStates=repaymentingBorrow','${currentMember.memberId}');" class="btn btn-primary" role="button">回收中借款</a>
							<a href="#" onclick="doClick('receivablesNotes/memberReceivablesNotes.htm?&p=1&loanDetailStates=alreadReceivables','${currentMember.memberId}');" class="btn btn-primary" role="button">已回收借款</a>
							<a href="#" onclick="doClick('receivablesNotes/memberReceivablesNotes.htm?&p=1&loanStates=backAccountBorrow','${currentMember.memberId}');" class="btn btn-success" role="button">回账查询</a> 
						   </c:when>
						</c:choose>
				  </div>
				 <c:choose>
					   <c:when test="${(buttonState == 'sucessBorrow') or (buttonState == 'tenderingBorrow') }">  
					   <div class="panel panel-default">
						  <div class="panel-heading">
						    <h4 class="panel-title"><strong>条件筛选</strong></h3>
						  </div>
						  <div class="panel-body"><!-- style="text-align:center;vertical-align: middle;" -->
						     <c:choose>
							   <c:when test="${buttonState == 'sucessBorrow'}">  
							   <form id="sucessBorrowForm"  class=" form-horizontal" role="form"  method="post" action="${ctx}/investment/memberTenderNotes.htm?&p=1&loanStates=sucessBorrow&memberId=${currentMember.memberId}" >
							   	  <!-- <input type="hidden" id="dtp_input2" name="loanStates" value="sucessBorrow" /> -->
							   </c:when>
							   <c:when test="${buttonState == 'tenderingBorrow'}">  
							   <form id="sucessBorrowForm"  class=" form-horizontal" role="form"  method="post" action="${ctx}/investment/memberTenderNotes.htm?&p=1&loanStates=tenderingBorrow&memberId=${currentMember.memberId}" >
							   	 <!-- <input type="hidden" id="dtp_input2" name="loanStates" value="tenderingBorrow" /> -->
							   </c:when>
							</c:choose>
				      		<%-- <input type="hidden" id="dtp_input3" name="memberId" value="${currentMember.memberId}" />
						     <form id="sucessBorrowForm"  class=" form-horizontal" role="form"  method="post" action="${ctx}/investment/memberTenderNotes.htm?&p=1" > --%>
						      <div class="form-group">
						      	
						        <label for="cardId" class="col-sm-2 control-label" >发布时间</label>
							    <div class="col-sm-4">
								    <div class="input-group date form_datetime" data-link-field="dtp_input1">
								    	
					                    <input id="createStartTime" name="createStartTime" class="form-control" size="16" type="text" value="<fmt:formatDate value="${tenderNotesQueryDTO.createStartTime}" pattern='yyyy-MM-dd'/>" readonly>
					                    <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
										<span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
					                </div>
									
							    </div>
							    <label for="cardId" class="col-sm-1 control-label" style="text-align:center;vertical-align: middle;">到</label>
							    <div class="col-sm-4">
							    	<div class="input-group date form_datetime" data-link-field="dtp_input1">
					                    <input id="createEndTime" name="createEndTime" class="form-control" size="16" type="text" value="<fmt:formatDate value="${tenderNotesQueryDTO.createEndTime}" pattern='yyyy-MM-dd'/>" readonly>
					                    <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
										<span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
					                </div>
							    </div>
							    <label for="cardId" class="col-sm-1 control-label" ></label>
							  </div>
							   <div class="form-group">
							    <label for="loanTitle" class="col-sm-1 control-label" >标题</label>
							    <div class="col-sm-3"><input type="text" class="form-control" id="loanTitle" name="loanTitle" value="${tenderNotesQueryDTO.loanTitle}"  placeholder="借款标题"  /></div>
							    <div class="col-sm-3 text-center"><button id="sucessBorrowFormButton" type="submit" class="btn btn-primary btn-lg btn-block">查&nbsp;&nbsp;询</button></div>
							    <div class="col-sm-3">
							    <!-- <button id="sucessBorrowFormButtonReset" type="reset" class="btn btn-primary btn-lg btn-block">重&nbsp;&nbsp;置</button> -->
							    <button id="sucessBorrowFormButton" type="reset" onclick="re()" class="btn btn-primary btn-lg btn-block">重置条件</button>
							     </div>
							  	<div class="col-sm-2"></div>
							  	</div>
						     </form>
						  </div>
						</div>
					   <table id="tenderNotesTable" class="table table-bordered" style="text-align:center;vertical-align: middle;">
				  		<thead>
				  			<tr style="height:50px;">
				              <td>借款人</td>
				              <td width=144px>标题</td>
				              <td>类型</td>
				              <td>还款方式</td>
				              <td width="97px">我的投标金额（元）</td>
				              <td>年利率</td>
				              <td>期限</td>
				              <td>发布时间</td>
				        <c:choose>
						   <c:when test="${buttonState == 'sucessBorrow'}">  
						   	  <td>信用等级</td>
				              <td width="80px">协议书</td>
						   </c:when>
						   <c:when test="${buttonState == 'tenderingBorrow'}">  
						   	  <td>进度/剩余时间</td>
				              <td>信用等级</td>
						   </c:when>
						</c:choose>
				            </tr>
				  		</thead>
				         	<tbody>
							<c:if test="${empty tenderNotesDatas.rows}">
							<tr>
					            <td colspan="10"><strong>暂无信息</strong></td>
					          </tr>
							</c:if>	  		
							<c:if test="${!empty tenderNotesDatas.rows}">  		
				            <c:forEach items="${tenderNotesDatas.rows}" var="tenderNotes" varStatus="status">
						      	<tr >
						      	  <td>${tenderNotes.loanMemberDisplay}</td>
					              <td   style="border-bottom-width:0px;display:block;width:144px; height:43px; text-align:center; heword-break:keep-all;white-space:nowrap;overflow:hidden;text-overflow:ellipsis;">
					              <a href="#" onclick="doClicks('investment/investmentdetail.htm?&p=1','${tenderNotes.loanMemberId }','${tenderNotes.loanId }');">
					              ${tenderNotes.loanTitle}
					              </a>
					              </td>
					              <td>${tenderNotes.loanTenderDisplay}</td>
					              <td>${tenderNotes.repaymentTypeDisplay}</td>
					              <c:choose>
									   <c:when test="${tenderNotes.subTotal == '0.0'}">  
									   	 	<td>￥<fmt:formatNumber value="${tenderNotes.tenderMoney }" pattern="#,#00.00"/></td>
									   </c:when>
									   <c:when test="${tenderNotes.subTotal != '0.0'}">  
									   		<td>￥<fmt:formatNumber value="${tenderNotes.lowestSub * tenderNotes.subSum }" pattern="#,#00.00"/></td>
									   </c:when>
								  </c:choose>
					              <td><fmt:formatNumber value="${tenderNotes.loanApr * 100}" pattern="#,#00.00"/>%</td>
					              <td>${tenderNotes.loanDeadlinesId}个月</td>
					              <td><fmt:formatDate value="${tenderNotes.loanDate}" pattern='yyyy-MM-dd'/></td>
					              <c:choose>
									   <c:when test="${buttonState == 'sucessBorrow'}">  
									   	 <td><img id="creditPhotoDivImg"  src="${tenderNotes.creditPhoto}" style="width: 34px;height: 24px ;" /></td>
					              		 <td><a href="#" onclick="doClicks('memberTenderNotes/agreement.htm','${tenderNotes.loanMemberId }','${tenderNotes.loanId }');">查看协议</a></td>
									   </c:when>
									   <c:when test="${buttonState == 'tenderingBorrow'}">  
									      <td><fmt:formatNumber value='${tenderNotes.alrTenderPro*100}' pattern='#0.00'/>%</td>
									   	  <td><img id="creditPhotoDivImg"  src="${tenderNotes.creditPhoto}" style="width: 34px;height: 24px ;" /></td>
									   </c:when>
									</c:choose>
					            </tr>
					      	</c:forEach>
					      	</c:if>	<!-- <span id="alrTenderPro${status.index}"><fmt:formatNumber value='${borrowingLoan.alrTenderPro*100}' pattern='#0.00'/></span>% -->
				            </tbody>
				            <c:if test="${!empty tenderNotesDatas.rows}">  
				            <tfoot>
					          <tr>
					            <th colspan="10">
					            	<div align="right">
									    <ul id='pagetenderNotes'></ul>
									</div>
								</th>
					          </tr>
					        </tfoot>
					       </c:if>	
				        </table>
					   </c:when>
					   <c:when test="${buttonState == 'repaymentingBorrow' or buttonState == 'alreadReceivablesBorrow'}">  
					  <div class="panel panel-default">
						  <div class="panel-heading">
						    <h4 class="panel-title"><strong>条件筛选</strong></h3>
						  </div>
						  <div class="panel-body"><!-- style="text-align:center;vertical-align: middle;" -->
						     <c:choose>
								   <c:when test="${buttonState == 'repaymentingBorrow'}">  
								   <form id="receivablesNotesForm"  class=" form-horizontal" role="form"  method="post" action="${ctx}/receivablesNotes/memberReceivablesNotes.htm?&p=1&loanStates=repaymentingBorrow&memberId=${currentMember.memberId}" >
								   </c:when>
								   <c:when test="${buttonState == 'alreadReceivablesBorrow'}"> 
								   <form id="receivablesNotesForm"  class=" form-horizontal" role="form"  method="post" action="${ctx}/receivablesNotes/memberReceivablesNotes.htm?&p=1&loanDetailStates=alreadReceivables&memberId=${currentMember.memberId}" > 
								   </c:when>
								</c:choose>
							   <div class="form-group">
							    <label for="loanTitle" class="col-sm-1 control-label" >标题</label>
							    <div class="col-sm-3">
							    <input type="text" class="form-control" id="loanTitle" name="loanTitle" value="${receivablesNotesQueryDTO.loanTitle}"  placeholder="借款标题"  /></div>
							    <div class="col-sm-3 text-center"><button id="sucessBorrowFormButton" type="submit" class="btn btn-primary btn-lg btn-block">查&nbsp;&nbsp;询</button></div>
							    <div class="col-sm-3">
							     <button id="sucessBorrowFormButton" type="reset" onclick="re()" class="btn btn-primary btn-lg btn-block">重置条件</button>
							    
							    </div>
							  	<div class="col-sm-2"></div>
							  	</div>
						     </form>
						  </div>
						</div>
					  <table id="receivablesNotesTable" class="table table-bordered" style="text-align:center;vertical-align: middle;">
				  		<thead>
				  			<tr>
				              <td>借款人</td>
				              <td width=144px>标题</td>
				              <td>类型</td>
				              <td>信用等级</td>
				              <td>年利率</td>
				              <td>期限</td>
				              <td>投标金额(元)</td>
				              <td>已收金额(元)</td>
				              <td>操作</td>
				            </tr>
				  		</thead>
				         	<tbody>
							<c:if test="${empty receivablesNotesDatas.rows}">
							<tr>
					            <td colspan="10"><strong>暂无信息</strong></td>
					          </tr>
							</c:if>	  		
							<c:if test="${!empty receivablesNotesDatas.rows}">  		
				            <c:forEach items="${receivablesNotesDatas.rows}" var="receivablesNotes" varStatus="status">
						      	<tr>
						      	  <td>${receivablesNotes.loanMemberDisplay}</td>
					              <td  style="border-bottom-width:0px;display:block;width:144px; height:43px; text-align:center; heword-break:keep-all;white-space:nowrap;overflow:hidden;text-overflow:ellipsis;">
					              <a href="#" onclick="doClicks('investment/investmentdetail.htm?&p=1','${receivablesNotes.loanMemberId }','${receivablesNotes.loanId }');">
					              ${receivablesNotes.loanTitle}
					              </a>
					              </td>
					              <td>${receivablesNotes.loanTenderDisplay}</td>
					              <td><img id="creditPhotoDivImg"  src="${receivablesNotes.creditPhoto}" style="width: 34px;height: 24px ;" /></td>
					              <td><fmt:formatNumber value="${receivablesNotes.loanApr * 100}" pattern="#,#00.00"/>%</td>
					              <td>${receivablesNotes.loanDeadlinesId}个月</td>
					              <c:choose>
									   <c:when test="${receivablesNotes.subTotal == '0.0'}">  
									   	 	<td>￥<fmt:formatNumber value="${receivablesNotes.tenderMoney }" pattern="#,#00.00"/></td>
									   </c:when>
									   <c:when test="${receivablesNotes.subTotal != '0.0'}">  
									   		<td>￥<fmt:formatNumber value="${receivablesNotes.lowestSub * receivablesNotes.subSum }" pattern="#,#00.00"/></td>
									   </c:when>
								  </c:choose>
								  <td>￥<fmt:formatNumber value='${receivablesNotes.alrReceMoney}' pattern='#,#00.00'/></td>
								  <td>
								  <div class="bs-example">
								      <!-- <button id="receivablesNotesDetailButton" class="btn btn-primary btn-xs"  data-backdrop="static" data-toggle="modal" data-target="#receivablesNotesDetailModal"  > -->
								      <c:choose>
										   <c:when test="${buttonState == 'repaymentingBorrow'}">  
										   	 <button id="receivablesNotesDetailButton${status.index}" class="btn btn-primary btn-xs"  data-backdrop="static" data-toggle="modal"   >
										        	<input id="receNotesId${status.index}" type="hidden" value="${receivablesNotes.receNotesId}"/>
										        	<input id="receDetailState${status.index}" type="hidden" value=""/>
										        	 查看详情
										      </button>
										   </c:when>
										   <c:when test="${buttonState == 'alreadReceivablesBorrow'}">  
										   	  <button id="receivablesNotesDetailButton${status.index}" class="btn btn-primary btn-xs"  data-backdrop="static" data-toggle="modal"   >
										        	<input id="receNotesId${status.index}" type="hidden" value="${receivablesNotes.receNotesId}"/>
										        	<input id="receDetailState${status.index}" type="hidden" value="alreadReceivables"/>
										        	 查看详情
										      </button>
										   </c:when>
										</c:choose>
								      <script type="text/javascript">
								      $("#receivablesNotesDetailButton"+${status.index}).click(function(){
								    	  	var receNotesIdNew = $("#receNotesId"+${status.index}).val();
								    	  	var receDetailState = $("#receDetailState"+${status.index}).val();
								    	  	$.ajax({
								 			   type: "GET",
								 			   url: ctx+"/receivablesNotesDetail/receivablesNotesDetailList.json?&p=1&memberId=${currentMember.memberId}&receNotesId="+receNotesIdNew+"&receDetailState="+receDetailState,
								 			   dataType: "json",
								 			   success: function(r) {
								 				  var receivablesNotesTbody = $("#receivablesNotesTbody")
								 				  for(var i=0;i<r.total;i++){
								 					   var row = r.rows[i]; 
								 					   var str=row.actualReceDate; 
								 					   if (typeof(str) == "undefined")
								 					   { 
								 						  str="未知";
								 					    }
													   $("#receivablesNotesTbody").append(
															   "<tr>"+
						   										"<td>"+row.numberPeriod+"/"+r.total+"</td>"+
						   										"<td>"+str+"</td>"+
						   										"<td>"+FormatNumber(row.currentRecePrincipal,2)+"元</td>"+
						   										"<td>"+FormatNumber(row.currentReceInterest,2)+"元</td>"+
						   										"<td>"+FormatNumber(row.surplusPrincipal,2)+"元</td>"+
						   										"<td>"+FormatNumber(row.interestManaFee,2)+"</td>"+
						   										"<td>"+renderGridValue(row.isOverdue,fields.isOverdue)+"</td>"+
						   										"<td>"+FormatNumber(row.overdueInterest,2)+"元</td>"+
						   										"<td>"+FormatNumber(row.income,2)+"元</td>"+
						   										"<td>"+renderGridValue(row.receState,fields.receDetailState)+"</td>"+
						   										"<td>"+row.loanMemberDisplay+"</td>"+
						   									   "</tr>");
													   
													 }
								 				  $("#receivablesNotesDetailModal").modal({
								 					 backdrop: 'static'  
								 				  });
								                 },
								                 error: function() {
								                     alert("查看收款记录明细出错！");
								                 }
								 			});
								    	});
								      </script>
							      </div><!-- /example --> 
								  </td>
					            </tr>
					      	</c:forEach>
					      	</c:if>
				            </tbody>
				            <c:if test="${!empty receivablesNotesDatas.rows}">  
				            <tfoot>
					          <tr>
					            <th colspan="10">
					            	<div align="right">
									    <ul id='pagereceivablesNotes'></ul>
									</div>
								</th>
					          </tr>
					        </tfoot>
					       </c:if>	
				        </table>
				        <!-- sample modal content -->
						    <div id="receivablesNotesDetailModal" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="idCardAccessoryModalLabel" aria-hidden="true">
						      <div class="modal-dialog" style="width: 1100px;">
						        <div class="modal-content">
						           <form id="member_idCardAccessoryForm"  class=" form-horizontal" role="form"  method="post" >
							          <div class="modal-header">
							          	<a id="receNotesDetailClose" class="close" data-dismiss="modal">×</a>
							            <h4 class="modal-title" id="myModalLabel">收款记录明细</h4>
							          </div>
							          <div class="modal-body">
							           <table id="receivablesNotesTable" class="table table-bordered" style="text-align:center;vertical-align: middle;">
								  		<thead>
								  			<tr>
								              <td>期数</td>
								              <td>还款时间</td>
								              <td>本期应收本金</td>
								              <td>本期应收利息</td>
								              <td>剩余本金</td>
								              <td>利息管理费</td>
								              <td>是否逾期</td>
								              <td>逾期罚息</td>
								              <td>收益</td>
								              <td>收款状态</td>
								              <td>还款人</td>
								            </tr>
								  		</thead>
							         	<tbody id="receivablesNotesTbody">
							            </tbody>
							            <tfoot>
								          <tr>
								            <th colspan="11">
								            	<div align="right">
												    <ul id=''></ul>
												</div>
											</th>
								          </tr>
								        </tfoot>
								        </table>
							          </div>
							          <div class="modal-footer">
							            <button id="receivablesNotesDetailButton" type="button" class="btn btn-default" data-dismiss="modal">关  闭</button>
							          </div>
									</form>
						        </div><!-- /.modal-content -->
						      </div><!-- /.modal-dialog -->
						    </div><!-- /.modal --> 		
					   </c:when>
					   <c:when test="${buttonState == 'backAccountBorrow'}">  
					   <blockquote>
						  <h4 style="color: red;">个人贷款：</h4>
						</blockquote>
					   <table id="receivablesNotesTable" class="table table-bordered" style="text-align:center;vertical-align: middle;">
						   <tr>
						   		<td></td>
						   		<td>未来一个月</td>
						   		<td>未来三个月</td>
						   		<td>未来一年</td>
						   		<td>全部</td>
						   </tr>
						   <tr> 
						   		<td>待收本息</td>
						   		<td>￥<fmt:formatNumber value="${requestScope.notReceMoney.nextMonth}" pattern="#,#00.00"/></td>
						   		<td>￥<fmt:formatNumber value="${requestScope.notReceMoney.nextThreeMonth}" pattern="#,#00.00"/></td>
						   		<td>￥<fmt:formatNumber value="${requestScope.notReceMoney.nextYear}" pattern="#,#00.00"/></td>
						   		<td>￥<fmt:formatNumber value="${requestScope.notReceMoney.nextAll}" pattern="#,#00.00"/></td>
						   	</tr>
					   </table>
					   <div class="panel panel-default">
						  <div class="panel-heading">
						    <h4 class="panel-title"><strong>条件筛选</strong></h3>
						  </div>
						  <div class="panel-body"><!-- style="text-align:center;vertical-align: middle;" -->
						     <form id="backAccountBorrowForm"  class=" form-horizontal" role="form"  method="post" action="${ctx}/receivablesNotes/memberReceivablesNotes.htm?&p=1&loanStates=backAccountBorrow&memberId=${currentMember.memberId}" >
						      <div class="form-group">
						        <label for="cardId" class="col-sm-2 control-label" >发布时间</label>
							    <div class="col-sm-4">
								    <div class="input-group date form_datetime" data-link-field="dtp_input1">
					                    <input id="loanDateCreateStartTime" name="loanDateCreateStartTime" class="form-control" size="16" type="text" value="<fmt:formatDate value="${receivablesNotesQueryDTO.loanDateCreateStartTime}" pattern='yyyy-MM-dd'/>" readonly>
					                    <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
										<span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
					                </div>
					                <%-- <input type="hidden" id="dtp_input2" name="loanStates" value="backAccountBorrow" />
						      		<input type="hidden" id="dtp_input3" name="memberId" value="${currentMember.memberId}" /> --%>
							    </div>
							    <label for="cardId" class="col-sm-1 control-label" style="text-align:center;vertical-align: middle;">到</label>
							    <div class="col-sm-4">
							    	<div class="input-group date form_datetime" data-link-field="dtp_input1">
					                    <input id="loanDateCreateEndTime" name="loanDateCreateEndTime" class="form-control" size="16" type="text" value="<fmt:formatDate value="${receivablesNotesQueryDTO.loanDateCreateEndTime}" pattern='yyyy-MM-dd'/>" readonly>
					                    <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
										<span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
					                </div>
							    </div>
							    <label for="cardId" class="col-sm-1 control-label" ></label>
							  </div>
							   <div class="form-group">
							    <label for="loanTitle" class="col-sm-1 control-label" >标题</label>
							    <div class="col-sm-3"><input type="text" class="form-control" id="loanTitle" name="loanTitle" value="${receivablesNotesQueryDTO.loanTitle}"  placeholder="借款标题"  /></div>
							    <div class="col-sm-3 text-center"><button id="backAccountBorrowButton" type="submit" class="btn btn-primary btn-lg btn-block">查&nbsp;&nbsp;询</button></div>
						        <div class="col-sm-3 "><button id="backAccountBorrowReButton" onclick="reTwo()"  type="reset" class="btn btn-primary btn-lg btn-block">重置条件</button></div>
							  	<div class="col-sm-2"></div>
							  	</div>
						     </form>
						  </div>
						</div>
					  <table id="receivablesNotesTable" class="table table-bordered" style="text-align:center;vertical-align: middle;">
				  		<thead>
				  			<tr>
				              <td>借款人</td>
				              <td width="144px">标题</td>
				              <td>类型</td>
				              <td>年利率</td>
				              <td>期限</td>
				              <td>投标金额(元)</td>
				              <td>已收金额(元)</td>
				              <td>待收金额(元)</td>
				              <td>查看协议</td>
				            </tr>
				  		</thead>
				         	<tbody>
							<c:if test="${empty receivablesNotesDatas.rows}">
							<tr>
					            <td colspan="10"><strong>暂无信息</strong></td>
					          </tr>
							</c:if>	  		
							<c:if test="${!empty receivablesNotesDatas.rows}">  		
				            <c:forEach items="${receivablesNotesDatas.rows}" var="receivablesNotes" varStatus="status">
						      	<tr>
						      	  <td>${receivablesNotes.loanMemberDisplay}</td>
					              <td  style="border-bottom-width:0px;display:block;width:144px; height:43px; text-align:center; heword-break:keep-all;white-space:nowrap;overflow:hidden;text-overflow:ellipsis;">
					              <a href="#" onclick="doClicks('investment/investmentdetail.htm?&p=1','${receivablesNotes.loanMemberId }','${receivablesNotes.loanId }');">
					              ${receivablesNotes.loanTitle}
					              </a>
					              </td>
					              <td>${receivablesNotes.loanTenderDisplay}</td>
					              <td><fmt:formatNumber value="${receivablesNotes.loanApr * 100}" pattern="#,#00.00"/>%</td>
					              <td>${receivablesNotes.loanDeadlinesId}个月</td>
					              <c:choose>
									   <c:when test="${receivablesNotes.subTotal == '0.0'}">  
									   	 	<td>￥<fmt:formatNumber value="${receivablesNotes.tenderMoney }" pattern="#,#00.00"/></td>
									   </c:when>
									   <c:when test="${receivablesNotes.subTotal != '0.0'}">  
									   		<td>￥<fmt:formatNumber value="${receivablesNotes.lowestSub * receivablesNotes.subSum }" pattern="#,#00.00"/></td>
									   </c:when>
								  </c:choose>
								  <td>￥<fmt:formatNumber value='${receivablesNotes.alrReceMoney}' pattern='#,#00.00'/></td>
								  <td>￥<fmt:formatNumber value='${receivablesNotes.notReceMoney}' pattern='#,#00.00'/></td>
								  <td><a href="#" onclick="doClicks('memberTenderNotes/agreement.htm','${receivablesNotes.loanMemberId }','${receivablesNotes.loanId }');">查看协议</a></td>
					            </tr>
					      	</c:forEach>
					      	</c:if>
				            </tbody>
				            <c:if test="${!empty receivablesNotesDatas.rows}">  
				            <tfoot>
					          <tr>
					            <th colspan="10">
					            	<div align="right">
									    <ul id='pagereceivablesNotes'></ul>
									</div>
								</th>
					          </tr>
					        </tfoot>
					       </c:if>	
				        </table>
					   </c:when>
				  </c:choose> 
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
  	
  	//点击重置按钮，清空表单
  	$("#sucessBorrowFormButtonReset").click(function(){
  		$("#loanTitle").val('');
  		$("#createStartTime").val('');
  		$("#createEndTime").val('');
  	}); 
  	
  	//bootstrap日期控件
  	$(".form_datetime").datetimepicker({
  		language:  'zh-CN',
        format: "yyyy-mm-dd",
        autoclose: true,
        todayBtn: true,
        todayHighlight: true,
        minView: 2,
        pickerPosition: "bottom-left"
    });
  	
  	//记录明细列表的模态框，关闭的时候，remove已经动态添加的数据
  	$("#receivablesNotesDetailButton").click(function(){
  		$("#receivablesNotesTbody tr").remove();
  		$("#receivablesNotesDetailModal").modal('hide');
  	});
    //记录明细列表的模态框，关闭的时候，remove已经动态添加的数据
  	$("#receNotesDetailClose").click(function(){
  		$("#receivablesNotesTbody tr").remove();
  		$("#receivablesNotesDetailModal").modal('hide');
  	});
  	
  	
	  <!-- 分页显示表格数据 开始 -->
		$(function(){
			//获得浏览器参数
			$.extend({
				getUrlVars: function(){
					var vars = [], hash;
					var hashes = window.location.href.slice(window.location.href.indexOf('?') + 1).split('&');
					for(var i = 0; i < hashes.length; i++){
						hash = hashes[i].split('=');
						vars.push(hash[0]);
						vars[hash[0]] = hash[1];
					}
					return vars;
				},
				getUrlVar: function(name){
					return $.getUrlVars()[name];
				}
			});
		
		//封装浏览器参数
		var composeUrlParams=function(){
			var param='';
			$.each($.getUrlVars(), function(i, item) {
				if(item!='p'){
					var val=$.getUrlVar(item);
					if(val) param += "&" + item+"="+val;
				}
			});
			return param;
		}
		
		var elementpagetenderNotes = $('#pagetenderNotes');
		var elementpagereceivablesNotes = $('#pagereceivablesNotes');

		//投标的设置分页的总页数
			var totaltenderNotes=${tenderNotesDatas.total}/10;
			if(parseInt(totaltenderNotes)==totaltenderNotes){
				var totaltenderNotes = parseInt(totaltenderNotes);
			}else {
				var totaltenderNotes = parseInt(totaltenderNotes)+1;
			}
			//投标的
			var tenderNotesOptions = {
			    bootstrapMajorVersion:3,
			    currentPage: ${tenderNotesDatas.p},
			    numberOfPages: 10,
			    totalPages:totaltenderNotes,
			    pageUrl: function(type, page, current){
			    	return "${ctx}/investment/memberTenderNotes.htm?"+composeUrlParams()+"&p="+page
			    													+"&createStartTime="+$('#createStartTime').val()
			    													+"&createEndTime="+$('#createEndTime').val()
			    													+"&loanTitle="+$("#loanTitle").val();
			    	}
			}
			
			//投标的
			elementpagetenderNotes.bootstrapPaginator(tenderNotesOptions);
		
		
			//收款的设置分页的总页数
			var totalreceivablesNotes=${receivablesNotesDatas.total}/10;
			if(parseInt(totalreceivablesNotes)==totalreceivablesNotes){
				var totalreceivablesNotes = parseInt(totalreceivablesNotes);
			}else {
				var totalreceivablesNotes = parseInt(totalreceivablesNotes)+1;
			}
			
			//收款的
			var receivablesNotesOptions = {
				    bootstrapMajorVersion:3,
				    currentPage: ${receivablesNotesDatas.p},
				    numberOfPages: 10,
				    totalPages:totalreceivablesNotes,
				    pageUrl: function(type, page, current){
				    	return "${ctx}/receivablesNotes/memberReceivablesNotes.htm?"+composeUrlParams()+"&p="+page+"&createStartTime="
				    																				+$('#createStartTime').val()
																									+"&createEndTime="+$('#createEndTime').val()
																									+"&loanTitle="+$("#loanTitle").val();
				    	}
				}
			//收款的
			elementpagereceivablesNotes.bootstrapPaginator(receivablesNotesOptions);
		
		})
	<!-- 分页显示表格数据 结束 -->
	
		//警告对话框
		function promptdialog(data){
			KindEditor.ready(function(K) {
			var dialog = K.dialog({
					        width : 300,
					        title : '警告',
					        body : '<div style="margin:10px;color:red;"><strong>'+data+'</strong></div>',
					        css : {
				                border : '1px solid #A0A0A0',
				                background : 'red'
				       	 	},
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
					        }
						});
			});
		}
		//信息提示对话框
		function messagedialog(data,url){
			KindEditor.ready(function(K) {
			var dialog = K.dialog({
					        width : 300,
					        title : '信息提示',
					        body : '<div style="margin:10px;"><strong>'+data+'</strong></div>',
					        css : {
				                border : '1px solid #A0A0A0',
				                background : 'red'
				       	 	},
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
					                		window.location.href=url;
					                }
					        },
					        noBtn : {
					                name : '取消',
					                click : function(e) {
					                        dialog.remove();
					                }
				        }
						});
			});
		}
		//编写FormatNumber方法，通过jquery格式化数据格式
		function FormatNumber(srcStr,nAfterDot){
			　　var srcStr,nAfterDot;
			　　var resultStr,nTen;
			　　srcStr = ""+srcStr+"";
			　　strLen = srcStr.length;
			　　dotPos = srcStr.indexOf(".",0);
			　　if (dotPos == -1){
			　　　　resultStr = srcStr+".";
			　　　　for (i=0;i<nAfterDot;i++){
			　　　　　　resultStr = resultStr+"0";
			　　　　}
			　　　　return resultStr;
			　　}
			　　else{
			　　　　if ((strLen - dotPos - 1) >= nAfterDot){
			　　　　　　nAfter = dotPos + nAfterDot + 1;
			　　　　　　nTen =1;
			　　　　　　for(j=0;j<nAfterDot;j++){
			　　　　　　　　nTen = nTen*10;
			　　　　　　}
			　　　　　　resultStr = Math.round(parseFloat(srcStr)*nTen)/nTen;
			　　　　　　return resultStr;
			　　　　}
			　　　　else{
			　　　　　　resultStr = srcStr;
			　　　　　　for (i=0;i<(nAfterDot - strLen + dotPos + 1);i++){
			　　　　　　　　resultStr = resultStr+"0";
			　　　　　　}
			　　　　　　return resultStr;
			　　　　}
			　　}
			};
			//重置按钮
			function re(){ 
				 $("#createStartTime").attr("value"," ");
				 $("#createEndTime").attr("value"," ");
				 $("#loanTitle").attr("value","");
			}
			
			//个人贷款重置按钮
			function reTwo(){
				$("#loanTitle").val('');
		  		$("#loanDateCreateStartTime").attr("value"," ");
		  		$("#loanDateCreateEndTime").val('');
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
			  

			  //构建表单2
			function doClicks(url,str,loanid){
				// 创建Form  
				var form = $('<form></form>');  
				// 设置属性  
			    form.attr('action', '<%=basePath%>'+url);  
			    form.attr('method', 'post');  
			    // form的target属性决定form在哪个页面提交  (_self -> 当前页面 _blank -> 新页面)  
			    form.attr('target', '_self');  
			    // 创建Input  
			    var my_input = $('<input type="text" name="memberId" />');  
			    var my_input2 = $('<input type="text" name="loanId" />');  
			    
			    my_input.attr('value', str);  
			    my_input2.attr('value', loanid); 
			    
			    // 附加到Form  
			    form.append(my_input);  
			    form.append(my_input2)
			    //表单的构建是否 完成
			    form.appendTo(document.body).submit();
			 }
	</script>
</html>
