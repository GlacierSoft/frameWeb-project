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
					    <div id="collapseOne" class="panel-collapse collapse in">
					      <div class="panel-body">
					        <div class="btn-group-vertical">
					    <a href="${ctx}/member/index.htm" class="btn btn-default" role="button">我的主页</a>
					          <a href="#" onclick="checkRechargeWithdraw('${currentMember.memberId}','${ctx}/financeMember/rechargeWithdraw.htm?p=1');" class="btn btn-default" role="button">充值提现</a>
					          <a href="#" onclick="checksMember('${currentMember.memberId}','${ctx}/member/memberAuth.htm?&p=0');" class="btn btn-info" role="button">平台认证</a>
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
							  <a  href="#" onclick="doClick('borrowingLoan/memberBorrow.htm?&p=1&loanState=repaymenting','${currentMember.memberId}');" class="btn btn-default" role="button">还款管理</a>
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
					    <div id="collapseThree" class="panel-collapse collapse">
					      <div class="panel-body">
					      	<div class="btn-group-vertical">
					      	  <a href="#" onclick="doClick('investment/memberTenderNotes.htm?&p=1&loanStates=sucessBorrow','${currentMember.memberId}')" class="btn btn-default" role="button">我的投标</a>
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
				    <h3 class="panel-title">冰川网贷认证</h3>
				  </div>
				  <div class="panel-body">
				   <div class="bs-example bs-example-tabs">
				     <ul id="myTab" class="nav nav-tabs">
				     <c:choose>
					   <c:when test="${empty memberIntegraldo && empty memberApplyAmountpage}">  
			         		 <li class="active"><a href="#netLoanAuth" data-toggle="tab" class="btn " role="button">冰川网贷认证</a></li>
						     <li><a href="#uploasdData" data-toggle="tab">资料上传</a></li>
						     <li><a href="#applicationMemberVIP" data-toggle="tab">申请会员VIP</a></li>
						     <li><a href="#applyCreditAmount" data-toggle="tab">额度申请</a></li>
						     <li><a href="#memberIntegral" data-toggle="tab">会员积分记录</a></li>
					   </c:when>
					   <c:when test="${memberIntegraldo == 'memberIntegraldo' && empty memberApplyAmountpage}">  
			         		 <li><a href="#netLoanAuth" data-toggle="tab">冰川网贷认证</a></li>
						     <li><a href="#uploasdData" data-toggle="tab">资料上传</a></li>
						      <li><a href="#applicationMemberVIP" data-toggle="tab">申请会员VIP</a></li>
						     <li><a href="#applyCreditAmount" data-toggle="tab">额度申请</a></li>
						     <li class="active"><a href="#memberIntegral" data-toggle="tab"  class="btn " role="button">会员积分记录</a></li>
					   </c:when>
					   <c:when test="${empty memberIntegraldo && memberApplyAmountpage == 'memberApplyAmountpage'}">  
			         		 <li><a href="#netLoanAuth" data-toggle="tab">冰川网贷认证</a></li>
						     <li><a href="#uploasdData" data-toggle="tab">资料上传</a></li>
						     <li><a href="#applicationMemberVIP" data-toggle="tab">申请会员VIP</a></li>
						     <li class="active"><a href="#applyCreditAmount"  data-toggle="tab" class="btn " role="button">额度申请</a></li>
						     <li><a href="#memberIntegral" data-toggle="tab">会员积分记录</a></li>
					   </c:when>
					</c:choose>
				     </ul>
				      <br>
				     <div id="myTabContent" class="tab-content">
				       <c:choose>
						   <c:when test="${empty memberIntegraldo && empty memberApplyAmountpage}">  
			         		 <div class="tab-pane fade in active" id="netLoanAuth">
						   </c:when>
						   <c:when test="${memberIntegraldo == 'memberIntegraldo' && empty memberApplyAmountpage}">  
				         		 <div class="tab-pane" id="netLoanAuth">
						   </c:when>
						   <c:when test="${empty memberIntegraldo && memberApplyAmountpage == 'memberApplyAmountpage'}">  
				         		 <div class="tab-pane" id="netLoanAuth">
						   </c:when>
						</c:choose>
				       		<table class="table table-bordered" style="text-align:center;margin:0 auto;">
				       			<tr>
					              <td colspan="8">信用等级及信用对应分数</td>
					            </tr> 
					            <tr >
					              <td >等级</td>
					              <c:forEach var="parameterCredit" items="${requestScope.parameterCredits}" varStatus="status">
								  	<td> 
      								<c:out value="${parameterCredit.creditName}" escapeXml="false"/>
      								</td>
								  </c:forEach>
					            </tr>
					            <tr>
					              <td>分数</td>
					               <c:forEach var="parameterCredit" items="${requestScope.parameterCredits}" varStatus="status">
								  	<td> 
								  	<c:if test="${parameterCredit.creditBeginIntegral == 100}">
								  		100以上
								  	</c:if>
								  	<c:if test="${parameterCredit.creditBeginIntegral != 100 && parameterCredit.creditBeginIntegral != 0}">
								  		<c:out value="${parameterCredit.creditBeginIntegral}" escapeXml="false"/> -
      									<c:out value="${parameterCredit.creditEndIntegral}" escapeXml="false"/>
								  	</c:if>
      								<c:if test="${parameterCredit.creditBeginIntegral == 0}">
								  		30以下
								  	</c:if>
      								</td>
								  </c:forEach>
					            </tr>
					            <tr>
					            	<td>标志</td>
					              <c:forEach var="parameterCredit" items="${requestScope.parameterCredits}" varStatus="status">
								  	<td> 
      								<img id="creditPhotoDivImg"  src="${parameterCredit.creditPhoto}" style="width: 34px;height: 24px ;" />
      								</td>
								  </c:forEach>
					            </tr>
					        </table>
					        <br>
					        <table class="table table-bordered" style="text-align:center;vertical-align: middle;">
				       			 <tr>
					              <td id="totalCreditIntegral" colspan="4">
					              <%-- <strong>信用总分：${requestScope.totalIntegralCredit}分</strong> --%>
					              <strong>信用总分：${currentMember.creditIntegral}分</strong>
					              <img id="creditPhotoDivImg"  src="${requestScope.totalCreditPhoto}" style="width: 34px;height: 24px ;" />
					              </td>
					            </tr>
					            <tr>
					              <td>项目</td>
					              <td>认证类型</td>
					              <td>状态</td>
					              <td>信用分数</td>
					            </tr> 
					            <tr>
					              <td rowspan="2" style="text-align:center;vertical-align: middle;">基本信息</td>
					              <td>${requestScope.memberAuthWithBLOBs.infoName}</td>
					              <td id="memberAuth_form_infoAuth"></td>
					              <td id="memberAuth_form_infoAuth_creditIntegral">0</td>
					            </tr>
					            <tr>
					              <td>${requestScope.memberAuthWithBLOBs.workName}</td>
					              <td id="memberAuth_form_workAuth"></td>
					              <td id="memberAuth_form_workAuth_creditIntegral">0</td>
					            </tr>
					            <tr>
					              <td rowspan="7" style="vertical-align: middle;">必要信用认证</td>
					              <td>${requestScope.memberAuthWithBLOBs.idCardName}</td>
					              <td id="memberAuth_form_idCardAuth"></td>
					              <td id="memberAuth_form_idCardAuth_creditIntegral">0</td>
					            </tr>
					            <tr>
					              <td>${requestScope.memberAuthWithBLOBs.emailName}</td>
					              <td id="memberAuth_form_emailAuth"></td>
					              <td id="memberAuth_form_emailAuth_creditIntegral">0</td>
					            </tr>
					            <tr>
					              <td>${requestScope.memberAuthWithBLOBs.mobileName}</td>
					              <td id="memberAuth_form_mobileAuth"></td>
					              <td id="memberAuth_form_mobileAuth_creditIntegral">0</td>
					            </tr>
					            <tr>
					              <td>${requestScope.memberAuthWithBLOBs.creditName}</td>
					              <td id="memberAuth_form_creditAuth"></td>
					              <td id="memberAuth_form_creditAuth_creditIntegral">0</td>
					            </tr>
					            <tr>
					              <td>${requestScope.memberAuthWithBLOBs.companyName}</td>
					              <td id="memberAuth_form_companyAuth"></td>
					              <td id="memberAuth_form_companyAuth_creditIntegral">0</td>
					            </tr>
					           <%--  <tr>
					              <td>${requestScope.memberAuthWithBLOBs.realName}</td>
					              <td id="memberAuth_form_realNameAuth"></td>
					              <td id="memberAuth_form_realNameAuth_creditIntegral">0</td>
					            </tr> --%>
					            <tr>
					              <td>${requestScope.memberAuthWithBLOBs.vipName}</td>
					              <td id="memberAuth_form_vipAuth"></td>
					              <td id="memberAuth_form_vipAuth_creditIntegral">0</td>
					            </tr>
					        </table>
				       </div>
				       <div class="tab-pane fade" id="uploasdData">
					        <p class="text-primary">温馨提示：冰川网贷对于用户上传的所有信息，都将进行加密处理。您可以在此放心上传个人材料，您的个人信用将不会被以任何形式外泄。</p>
					        <p class="text-danger">注：认证资料上传完毕后，等待后台进行审核。</p>
					       	<blockquote>
					       	<h4>必要信用认证</h4>
					       	</blockquote>
					       	<p class="text-primary">为了保证审核效率，确保贷款用户尽快通过审核，我们将优先为五项必要认证材料上传齐全的用户提供审核服务。五项必要认证 缺失的用户，无法得到贷款。</p>	
					  		<!-- Three columns of text below the carousel -->
					      <div class="row center-block" style="text-align: center;">
					        <div class="col-lg-4 center-block" style="border: 1px solid #DDDDDD;">
				        	<div style="text-align: right;">
				        	<button id="idCard_auth"  type="button" class="btn btn-success" disabled="disabled">审核通过</button>
				        	</div>
					          <img src="${pageContext.request.contextPath}/resources/images/index/4.jpg"  alt="Generic placeholder image">
					          <h3>身份认证</h3>
					          <div class="bs-example " style="padding-bottom:24px;"> 
							    <c:choose>   
                                <c:when test="${requestScope.memberAuthWithBLOBs.idCardAuth == 'noapply' || requestScope.memberAuthWithBLOBs.idCardAuth == 'failure' }">  
                                    <button id="but1" class="btn btn-primary btn-lg"  data-backdrop="static" data-toggle="modal" data-target="#idCardAccessoryModal"  >
							        	点击上传
							      </button>
                                </c:when>   
                             <c:otherwise>  
							      <button id="but1" class="btn btn-primary btn-lg"  disabled="disabled" data-backdrop="static" data-toggle="modal" data-target="#idCardAccessoryModal"  >
							        	点击上传
							      </button>
                            </c:otherwise>  
                            </c:choose>  
							    </div><!-- /example -->
					        </div><!-- /.col-lg-4 -->
					        <div class="col-lg-4 center-block" style="border: 1px solid #DDDDDD;">
					        <div style="text-align: right;">
				        	<button id="company_auth" type="button" class="btn btn-success" disabled="disabled">审核通过</button>
				        	</div>
					          <img src="${pageContext.request.contextPath}/resources/images/index/5.jpg" alt="Generic placeholder image">
					          <h3>企业认证</h3>
					         <div class="bs-example " style="padding-bottom:24px;">  
							   <c:choose>   
                                <c:when test="${requestScope.memberAuthWithBLOBs.companyAuth == 'noapply' || requestScope.memberAuthWithBLOBs.companyAuth == 'failure' }">  
                                     <button id="but2" class="btn btn-primary btn-lg " data-backdrop="static" data-toggle="modal" data-target="#companyAccessoryModal">
							        	点击上传
							      </button> 
                                </c:when>   
                             <c:otherwise> 
                               <button id="but2" class="btn btn-primary btn-lg " disabled="disabled" data-backdrop="static" data-toggle="modal" data-target="#companyAccessoryModal">
							        	点击上传
							      </button> 
                            </c:otherwise>  
                            </c:choose>      
							    </div><!-- /example -->
					        </div><!-- /.col-lg-4 -->
					        <div class="col-lg-4 center-block" style="border: 1px solid #DDDDDD;">
					        <div style="text-align: right;">
				        	<button id="credit_auth" type="button" class="btn  btn-success" disabled="disabled">审核通过</button>
				        	</div>
					          <img src="${pageContext.request.contextPath}/resources/images/index/6.jpg"   alt="Generic placeholder image">
					          <h3>信用认证</h3>
					          <div class="bs-example " style="padding-bottom:24px;"> 
					             <c:choose>   
                                <c:when test="${requestScope.memberAuthWithBLOBs.creditAuth == 'noapply' || requestScope.memberAuthWithBLOBs.creditAuth == 'failure' }">  
                                    <button id="but3" class="btn btn-primary btn-lg " data-backdrop="static" data-toggle="modal" data-target="#creditAccessoryModal">
							        	点击上传
							      </button>
                                </c:when>   
                             <c:otherwise> 
                               <button id="but3" class="btn btn-primary btn-lg " disabled="disabled" data-backdrop="static" data-toggle="modal" data-target="#creditAccessoryModal">
							        	点击上传
							      </button>
                            </c:otherwise>  
                            </c:choose> 
					           
							      
							    </div><!-- /example -->
					        </div><!-- /.col-lg-4 -->
					      </div><!-- /.row -->	 
					       <!-- sample modal content -->
						    <div id="idCardAccessoryModal" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="idCardAccessoryModalLabel" aria-hidden="true">
						      <div class="modal-dialog">
						        <div class="modal-content">
						           <form id="member_idCardAccessoryForm"  class=" form-horizontal" role="form"  method="post" >
							          <div class="modal-header">
							            <h4 class="modal-title" id="myModalLabel">会员认证</h4>
							          </div>
							          <div class="modal-body">
							            <h5>身份认证：</h5>
							            <p>您上传的身份证扫描件需和您绑定的身份证一致，否则将无法通过认证。</p>
							            <h5>认证说明：</h5>
							            <p>1、您上传的身份证扫描件需和您绑定的身份证一致，否则将无法通过认证。</p>
							            <p>2、本人近期生活照。</p>
							            <p>3、请确认您上传的资料是清晰的、未经修改的照片，每张照片最大限制为1M。</p>
							            <h4>文件上传</h4>
							            <c:choose>
										    <c:when test="${memberAuthWithBLOBs.idCardAuth=='pass'}"> 
												<textarea id="member_idCardAccessory_readonly" name="webHelpContent" readonly="readonly" style="width:500px;height:150px;">
													 ${memberAuthWithBLOBs.idCardAccessory}
												</textarea>
								            </c:when>
								   			<c:otherwise> 
									   			<textarea id="member_idCardAccessory" name="webHelpContent" style="width:500px;height:150px;">
													 ${memberAuthWithBLOBs.idCardAccessory}
												</textarea>
								   		    </c:otherwise>
										</c:choose>
										<br>
							            <p class="text-danger"><strong>注意：</strong>冰川网贷是一个注重诚信的网络平台。如果我们发现您上传的资料系伪造或有人工修改痕迹，冰川网贷会将你加入系统黑名单，永久取消您在冰川网贷的借款资格。</p>
							          </div>
							          <div class="modal-footer">
							          	<c:choose>
										    <c:when test="${memberAuthWithBLOBs.idCardAuth=='pass'}"> 
												<button type="button" class="btn btn-primary" data-dismiss="modal">保  存</button>
								            </c:when>
								   			<c:otherwise> 
									   			<button type="button" class="btn btn-primary" onclick="submitIdCardAccessoryForm();">保  存</button>
								   		    </c:otherwise>
										</c:choose>
							            <button type="button" class="btn btn-default" data-dismiss="modal">关  闭</button>
							          </div>
									</form>
						        </div><!-- /.modal-content -->
						      </div><!-- /.modal-dialog -->
						    </div><!-- /.modal --> 		
						    <!-- sample modal content -->
						    <div id="companyAccessoryModal" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="companyAccessoryModalModalLabel" aria-hidden="true">
						      <div class="modal-dialog">
						        <div class="modal-content">
						        <form id="member_companyAccessoryForm"  class=" form-horizontal" role="form"  method="post" >
						          <div class="modal-header">
						            <h4 class="modal-title" id="myModalLabel">会员认证</h4>
						          </div>
						          <div class="modal-body">
						            <h4>企业认证：</h4>
						            <p>您的工作状况是冰川网贷评估您信用状况的主要依据。请您填写真实可靠的工作信息。</p>
									<hr>
						            <h5>认证说明：</h5>
							            <ul class="list-unstyled">
										  <li>1、工薪阶层（入职须6个月以上）：
										  	<ul class="list-unstyled">
										  		<li>a）为必须上传资料，b）和c）任选一项或者两项</li>
										  		<li>b）正式劳动合同</li>
										  		<li>c）盖有单位公章的在职证明</li>
										  		<li>d）带有姓名及照片的工作证</li>
										  	</ul>
										  </li>
										  <li>2、企业私营业主（经营须一年以上）：</li>
										  <li>请上传以下全部资料的照片：
										  	<ul class="list-unstyled">
										  		<li>a）企业的营业执照（彩色）</li>
										  		<li>b）企业的税务登记证</li>
										  		<li>c）企业的机构代码证</li>
										  		<li>d）店面照片（照片内需能看见营业执照）</li>
										  	</ul>
										  </li>
										  <li>3、 请确认您上传的资料是清晰的、未经修改的照片，每张照片最大限制为1M</li>
										</ul>
						            <h4>文件上传</h4>
						            <c:choose>
									    <c:when test="${memberAuthWithBLOBs.companyAuth=='pass'}"> 
											<textarea id="member_companyAccessory_readonly" name="webHelpContent" readonly="readonly" style="width:500px;height:200px;">
												 ${memberAuthWithBLOBs.companyAccessory} 
											</textarea>
							            </c:when>
							   			<c:otherwise> 
								   			<textarea id="member_companyAccessory" name="webHelpContent" style="width:500px;height:200px;">
												 ${memberAuthWithBLOBs.companyAccessory} 
											</textarea>
							   		    </c:otherwise>
									</c:choose>
									<br>
						            <p class="text-danger"><strong>注意：</strong>冰川网贷是一个注重诚信的网络平台。如果我们发现您上传的资料系伪造或有人工修改痕迹，冰川网贷会将你加入系统黑名单，永久取消您在冰川网贷的借款资格。</p>
						          </div>
						          <div class="modal-footer">
						           <c:choose>
									    <c:when test="${memberAuthWithBLOBs.companyAuth=='pass'}"> 
											<button type="button" class="btn btn-primary" data-dismiss="modal">保  存</button>
							            </c:when>
							   			<c:otherwise> 
								   			<button type="button" class="btn btn-primary" onclick="submitCompanyAccessoryForm();">保  存</button>
							   		    </c:otherwise>
									</c:choose>
						            <button type="button" class="btn btn-default" data-dismiss="modal">关  闭</button>
						          </div>
								</form>
						        </div><!-- /.modal-content -->
						      </div><!-- /.modal-dialog -->
						    </div><!-- /.modal --> 		
						    <!-- sample modal content -->
						    <div id="creditAccessoryModal" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="creditAccessoryModalLabel" aria-hidden="true">
						      <div class="modal-dialog">
						        <div class="modal-content">
						        <form id="member_creditAccessoryForm"  class=" form-horizontal" role="form"  method="post" >
						          <div class="modal-header">
						            <h4 class="modal-title" id="myModalLabel">会员认证</h4>
						          </div>
						          <div class="modal-body">
						            <h4>信用认证：</h4>
						            <p>
						            	个人信用报告是由中国人民银行出具，全面记录个人信用活动，反映个人信用基本状况的文件。
						            	本报告是冰川网贷了解您信用状况的一个重要参考资料。 您信用报告内体现的信用记录，和信用卡额度等数据，
						            	将在您发布借款时经冰川网贷工作人员整理，在充分保护您隐私的前提下披露给冰川网贷借出者，
						            	作为借出者投标的依据。
						            </p>
									<hr>
						            <h5>认证说明：</h5>
						            <p>1、上传近20日内的央行个人信用报告 </p>
						            <p>2、上传您的个人信用报告原件的照片，每页信用报告须独立照相，并将整份信用报告按页码先后顺序完整上传。</p>
						            <p>3、请确认您上传的资料是清晰的、未经修改的照片，每张照片最大限制为1M。</p>
						            <h4>文件上传</h4>
									<c:choose>
									    <c:when test="${memberAuthWithBLOBs.creditAuth=='pass'}"> 
								         	<textarea id="member_creditAccessory_readonly" name="webHelpContent" readonly="readonly" style="width:500px;height:150px;">
												${memberAuthWithBLOBs.creditAccessory}
											</textarea>
							            </c:when>
							   			<c:otherwise> 
								   			<textarea id="member_creditAccessory" name="webHelpContent" style="width:500px;height:150px;">
												${memberAuthWithBLOBs.creditAccessory}
											</textarea>
							   		    </c:otherwise>
									</c:choose>
									<br>
						            <p class="text-danger"><strong>注意：</strong>冰川网贷是一个注重诚信的网络平台。如果我们发现您上传的资料系伪造或有人工修改痕迹，冰川网贷会将你加入系统黑名单，永久取消您在冰川网贷的借款资格。</p>
						          </div>
						          <div class="modal-footer">
						          <c:choose>
									    <c:when test="${memberAuthWithBLOBs.creditAuth=='pass'}"> 
											<button type="button" class="btn btn-primary" data-dismiss="modal">保  存</button>
							            </c:when>
							   			<c:otherwise> 
								   			<button type="button" class="btn btn-primary" onclick="submitCreditAccessoryForm();">保  存</button>
							   		    </c:otherwise>
									</c:choose>
						            <button type="button" class="btn btn-default" data-dismiss="modal">关  闭</button>
						          </div>
								</form>
						        </div><!-- /.modal-content -->
						      </div><!-- /.modal-dialog -->
						    </div><!-- /.modal --> 		
				       </div>
				      <c:choose>
						   <c:when test="${empty memberIntegraldo && empty memberApplyAmountpage}">  
			         		 <div class="tab-pane fade" id="memberIntegral">
						   </c:when>
						   <c:when test="${memberIntegraldo == 'memberIntegraldo' && empty memberApplyAmountpage}">  
				         		 <div class="tab-pane fade in active" id="memberIntegral">
						   </c:when>
						   <c:when test="${empty memberIntegraldo && memberApplyAmountpage == 'memberApplyAmountpage'}">  
				         		 <div class="tab-pane fade" id="memberIntegral">
						   </c:when>
						</c:choose>
				         <table id="memberIntegralTable" class="table table-bordered" style="text-align:center;vertical-align: middle;">
				         	<tbody>
				         	<tr>
				              <td colspan="4"><strong>${totalIntegral}分</strong></td>
				            </tr>
				            <tr>
				              <td><strong>积分类型</strong></td>
				              <td><strong>积分</strong></td>
				              <td><strong>备注</strong></td>
				              <td><strong>时间</strong></td>
				            </tr>
							 <c:if test="${empty memberIntegralDatas.rows}">
								 <tr>
							       <td colspan="4" style="text-align:center;vertical-align: middle;"><strong>暂无信息</strong></td>
							      </tr>
							 </c:if>	   
							  <c:if test="${!empty memberIntegralDatas.rows}">
							 		
				            <c:forEach items="${memberIntegralDatas.rows}" var="memberIntegral" varStatus="status">
						      	<tr>
						         <td id="memberIntegral_type${status.index}" class="memberIntegral_type">
					             <!--  <script type="text/javascript">
					             $('#memberIntegral_type'+${status.index}).html(renderGridValue('${memberIntegral.type}',fields.type));
					              </script> --> 
					             	<c:if test="${memberIntegral.type eq 'login' }">登录</c:if>
					                <c:if test="${memberIntegral.type eq 'recharge' }">充值</c:if>
					                <c:if test="${memberIntegral.type eq 'withdraw' }">提现</c:if>
					                <c:if test="${memberIntegral.type eq 'invest' }">投资</c:if>
		    			             <c:if test="${memberIntegral.type eq 'borrow' }">借款</c:if>
					           <%--     <c:out value="${memberIntegral.type}" />   <c:if test="${memberIntegral.type eq 'te'}">正确
					              
					              <c:if>--%>
					              </td>
					              <td>${memberIntegral.changeValue}</td>
					              <td>${memberIntegral.remark}</td>
					              <td><fmt:formatDate value="${memberIntegral.createTime}" type="both"/></td>
					              
					            </tr>
					      	</c:forEach>
					      	</c:if>
				            </tbody>
				            <tfoot>
					          <tr>
					            <th colspan="4">
					            	<div align="right">
									    <ul id='pagememberIntegral'></ul>
									</div>
								</th>
					          </tr>
					        </tfoot>
				        </table>
				       </div>
			         	<div class="tab-pane fade" id="applicationMemberVIP">
			         	<p style="color:red;">只需交纳少量会员费即可成为网站会员，会员可享受以下特权。</p>
			         	<p style="color:red;">投资者：</p>
			         	<p style="color:red;">网站合作商提供投资担保，享受100%本金保障。对于担保标、推荐标，还能100%保利息。（普通用户仅保障本金） 有专业客服跟踪服务，体验尊贵感受。 享有尊贵VIP身份标识。</p>
			         	<p style="color:red;">借款者：</p>
			         	<p style="color:red;">享有借款资格，及时缓解资金压力。 参与网站举行的各种活动。</p>
			         	<br/>
				        <div class="row">
				        	<div class="col-md-3"></div>
				        	<div class="col-md-3">您的状态是：</div>
  							<div id="memberType" class="col-md-3">${currentMember.memberName}</div>
  							<div class="col-md-3"></div>
				        </div>
				        <div class="row">
				        	<div class="col-md-3"></div>
				        	<div class="col-md-3">用 户 名：</div>
  							<div class="col-md-3">${currentMember.memberName}</div>
  							<div class="col-md-3"></div>
				        </div>
				        <div class="row">
				        	<div class="col-md-3"></div>
				        	<div class="col-md-3">姓 名：</div>
  							<div class="col-md-3">${currentMember.memberRealName}</div>
  							<div class="col-md-3"></div>
				        </div>
				        <div class="row">
				        	<div class="col-md-3"></div>
				        	<div class="col-md-3">邮 箱：</div>
  							<div class="col-md-3">${currentMember.email}</div>
  							<div class="col-md-3"></div>
				        </div>
				        <div class="row">
				        	<div class="col-md-3"></div>
				        	<div class="col-md-3">会员VIP申请状态：</div>
  							<div id="memberVIPType" class="col-md-3"></div>
  							<div class="col-md-3"></div>
				        </div>
				        <br/>
				        <p class="text-warning">温馨提示：只有通过基本信息认证，工作认证，身份证认证，邮箱认证，手机认证，信用认证，企业认证等，
				        	才能申请VIP会员。</p>
				         <div class="row">
				        	<div class="col-md-3"></div>
				        	<c:choose>
							    <c:when test="${memberAuthWithBLOBs.creditAuth=='pass' && memberAuthWithBLOBs.infoAuth=='pass'
							    				&& memberAuthWithBLOBs.emailAuth=='pass' 
							    				&& memberAuthWithBLOBs.companyAuth=='pass' && memberAuthWithBLOBs.idCardAuth=='pass'
							    				&& memberAuthWithBLOBs.workAuth=='pass'}"> 
							    	<c:if test="${memberAuthWithBLOBs.vipAuth=='noapply' || memberAuthWithBLOBs.vipAuth=='failure'}">
							    		<div class="col-md-3"><a id="applicationVIPBtn" href="javascript:void(0);" class="btn btn-default" role="button">确定申请</a></div>
							    	</c:if>
							    	<c:if test="${memberAuthWithBLOBs.vipAuth=='authstr' || memberAuthWithBLOBs.vipAuth=='pass'}">
							    		<div class="col-md-3"><a id="applicationVIPBtn" href="javascript:void(0);" class="btn btn-default" disabled = "true" role="button">确定申请</a></div>
							    	</c:if>
					            </c:when>
					   			<c:otherwise> 
					   				<div class="col-md-3"><a id="applicationVIPBtn" href="javascript:void(0);" class="btn btn-default" disabled = "true" role="button">确定申请</a></div>
					   		    </c:otherwise>
							</c:choose>
  							<div class="col-md-3"></div>
  							<div class="col-md-3"></div>
				        </div>
				       </div>
						 <c:choose>
						   <c:when test="${empty memberIntegraldo && empty memberApplyAmountpage}">  
			         		  <div class="tab-pane fade" id="applyCreditAmount">
						   </c:when>
						   <c:when test="${memberIntegraldo == 'memberIntegraldo' && empty memberApplyAmountpage}">  
				         		  <div class="tab-pane fade" id="applyCreditAmount">
						   </c:when>
						   <c:when test="${empty memberIntegraldo && memberApplyAmountpage == 'memberApplyAmountpage'}">  
				         		 <div class="tab-pane fade in active" id="applyCreditAmount">
						   </c:when>
						</c:choose>
					   	<blockquote>
						  <span class="text-muted"><strong>当前信用额度：<span class="text-danger">￥<fmt:formatNumber value='${currentMember.creditamount}' pattern='#,#00.00'/></span>元 </strong></span>
						</blockquote>
						<hr>
						<form id="member_applyCreditAmountForm"  class=" form-horizontal" role="form"  method="post" >
						 <div class="form-group">
						    <label for="memberName" class="col-sm-3 control-label">申请账户:</label>
						    <div class="col-sm-4"><div style="margin-top: 5px">
								<span>${currentMember.memberName}</span> </div>					    
						    </div>
						 </div>
						 <div class="form-group">
						    <label for="applyType" class="col-sm-3 control-label">申请类型:</label>
						    <div class="col-sm-4"><div style="margin-top: 5px">
						    	<span>信用额度</span></div>
						      <input type="hidden" class="form-control" id="applyType" name="applyType" value="internet"  placeholder="" >
						    </div>
						 </div>
						 <div class="form-group">
						    <label for="applyMoney" class="col-sm-3 control-label">申请额度:</label>
						    <div class="col-sm-4">
						      <input type="text" class="form-control" id="applyMoney" name="applyMoney" value=""  placeholder="申请额度" >
						    </div>
						 </div>
						 <div class="form-group">
						    <label for="applyExplanation" class="col-sm-3 control-label">详细说明:</label>
						    <div class="col-sm-8">
						      <textarea class="form-control" rows="3" name="applyExplanation" id="applyExplanation" ></textarea>
						      <p class="text-warning">温馨提示：额度申请原则上每次最多申请1万。 额度申请后，无论申请是否批准，
									必须隔一个月后才能再次申请，每个月只能申请一次。如有问题,请与客服联系</p>
						    </div>
						 </div>
						 <div class="form-group">
						 	<label for="personalDes" class="col-sm-3 control-label"></label>
						    <div class=" col-sm-9">
						      <button id="sub" type="submit" class="btn btn-primary btn-lg">确定</button>
						    </div>
						 </div>
				        </form>
				       
				      	<blockquote style="margin-top:50px;">
						       	<h5 class="text-danger"><strong>额度申请列表：</strong></h5>
						</blockquote>
				         <table id="memberApplyAmountTable" class="table table-bordered" style="text-align:center;vertical-align: middle;">
				         	<tbody>
				            <tr>
				              <td><strong>序号</strong></td>
				              <td><strong>申请类型</strong></td>
				              <td><strong>申请额度</strong></td>
				              <td><strong>通过额度</strong></td>
				              <td><strong>状态</strong></td>
				              <td><strong>申请时间</strong></td>
				            </tr>
							<c:if test="${empty memberApplyAmountDatas.rows}">
								<tr>
						            <td colspan="11" style="text-align:center;vertical-align: middle;"><strong>暂无信息</strong></td>
						        </tr>
							</c:if>	
							<c:if test="${!empty memberApplyAmountDatas.rows}">	
				            <c:forEach items="${memberApplyAmountDatas.rows}" var="memberApplyAmount" varStatus="status">
						      	<tr>
						      	  <td>${status.index+1}</td>
					              <td id="applyType${status.index}" class="applyType">
					              <script type="text/javascript">
					             $('#applyType'+${status.index}).html(renderGridValue('${memberApplyAmount.applyType}',fields.applyType));
					              </script>
					              </td>
					              <td>￥<fmt:formatNumber value='${memberApplyAmount.applyMoney}' pattern='#,#00.00'/></td>
					              <td>￥<fmt:formatNumber value='${memberApplyAmount.authorizedAmount}' pattern='#,#00.00'/></td>
					              <td id="auditState${status.index}" class="auditState">
					              ${memberApplyAmount.auditState}
					              <script type="text/javascript">
					             $('#auditState'+${status.index}).html(renderGridValue('${memberApplyAmount.auditState}',fields.auditState));
					              </script>
					              </td>
					              <td><fmt:formatDate value="${memberApplyAmount.applyDate}" type="both"/></td>
					            </tr>
					      	</c:forEach>
					      	</c:if>
				            </tbody>
				            <tfoot>
					          <tr>
					            <th colspan="6">
					            	<div align="right">
									    <ul id='pagememberApplyAmount'></ul>
									</div>
								</th>
					          </tr>
					        </tfoot>
				        </table>
				       </div>
				     </div>
				</div>
			</div><!-- /example -->
			
		</div>
		</div>		    
	    
	    </div>
	    <hr class="featurette-divider2">
	   
	    </div>
	    <!-- CONTAINER START======================== -->
	    <jsp:include page="../foot.jsp"/>
  </body>
	<script type="text/javascript">
	function checkIdCardIsNull(){
		
		
	}
	
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
	
	//为对应的会员type显示对应的文字
	$('#memberType').html(renderGridValue('${currentMember.type}',fields.type));
	$('#memberVIPType').html(renderGridValue('${memberAuthWithBLOBs.vipAuth}',fields.auths));
	//点击申请会员vip按钮
	$("#applicationVIPBtn").bind('click', function(){   
    	$.ajax({
			   type: "GET",
			   url: ctx+"/member/applicationVIP.json?memberId=${currentMember.memberId}",
			   dataType: "json",
			   success: function(r) {
				   $('#memberVIPType').html(renderGridValue(r.obj.vipAuth,fields.auths));
				   $("#applicationVIPBtn").attr("disabled", true);
				   $('#memberAuth_form_vipAuth').html(renderGridValue(r.obj.vipAuth,fields.auths));
				   vipdialog(r);
                },
                error: function() {
                    alert("申请会员VIP出错！");
                }
			});
    });
	  
		
	$("#member_applyCreditAmountForm").validate({
		rules:{
			applyMoney:{
				required:true,
				number:true,
				min:100,
				max:10000, 
			}
		},
		messages:{
			applyMoney:{
				required:"申请额度不能为空",
				number:"申请额度只能为数字",
				min:"申请额度不能低于100",
				max:"不能高于10000", 
			}
		},
		submitHandler:function(){
			$.ajax({
				   type: "POST",
				   url: ctx+"/applyAmount/add.htm",
				   dataType: "json",
				   data: $("#member_applyCreditAmountForm").serialize(),
    			   success: function(r) {
    				   
						$("#applyMoney").val("")
						$("#applyExplanation").val("");
	    				successdialog(r);
                    },
                    error: function() {
                        alert("提交出错！");
                    }
				});
		} 
	});
	
		var json = '${requestScope.json}';
		var parseJson = $.parseJSON(json);
		var memberCreditIntegrals = '${requestScope.memberCreditIntegrals}';
		//循环遍历出每个认证的信用积分，再将每个积分相加。
		for(var i = 0;i<parseJson.length;i++){
			if(parseJson[i].integralType == 'infoAuth'){
				$('#memberAuth_form_infoAuth_creditIntegral').html(parseJson[i].changeValue);
			} else if(parseJson[i].integralType == 'vipAuth'){
				$('#memberAuth_form_vipAuth_creditIntegral').html(parseJson[i].changeValue);
			}else if(parseJson[i].integralType == 'emailAuth'){
				$('#memberAuth_form_emailAuth_creditIntegral').html(parseJson[i].changeValue);
			}else if(parseJson[i].integralType == 'mobileAuth'){
				$('#memberAuth_form_mobileAuth_creditIntegral').html(parseJson[i].changeValue);
			}else if(parseJson[i].integralType == 'creditAuth'){
				$('#memberAuth_form_creditAuth_creditIntegral').html(parseJson[i].changeValue);
			}else if(parseJson[i].integralType == 'companyAuth'){
				$('#memberAuth_form_companyAuth_creditIntegral').html(parseJson[i].changeValue);
			}else if(parseJson[i].integralType == 'realNameAuth'){
				$('#memberAuth_form_realNameAuth_creditIntegral').html(parseJson[i].changeValue);
			}else if(parseJson[i].integralType == 'idCardAuth'){
				$('#memberAuth_form_idCardAuth_creditIntegral').html(parseJson[i].changeValue);
			}else if(parseJson[i].integralType == 'workAuth'){
				$('#memberAuth_form_workAuth_creditIntegral').html(parseJson[i].changeValue);
			} 
		} 
		//$('#totalCreditIntegral').html("<strong>信用总分："+totalIntegralCredit+"分</strong>");
		
		//通过renderGridValue方法。将数据库的枚举类型转换为相对应的中文名称
		$('#idCard_auth').html(renderGridValue('${requestScope.memberAuthWithBLOBs.idCardAuth}',fields.auths));	
		$('#company_auth').html(renderGridValue('${requestScope.memberAuthWithBLOBs.companyAuth}',fields.auths));	
		$('#credit_auth').html(renderGridValue('${requestScope.memberAuthWithBLOBs.creditAuth}',fields.auths));	
		
		//下拉项emun的值
	/* 	$('#memberAuth_form_infoAuth').html(renderGridValue('${requestScope.memberAuthWithBLOBs.infoAuth}',fields.auths));
	 	$('#memberAuth_form_vipAuth').html(renderGridValue('${requestScope.memberAuthWithBLOBs.vipAuth}',fields.auths));
	 	$('#memberAuth_form_emailAuth').html(renderGridValue('${requestScope.memberAuthWithBLOBs.emailAuth}',fields.auths));
	 	$('#memberAuth_form_mobileAuth').html(renderGridValue('${requestScope.memberAuthWithBLOBs.mobileAuth}',fields.auths));
		$('#memberAuth_form_creditAuth').html(renderGridValue('${requestScope.memberAuthWithBLOBs.creditAuth}',fields.auths));
	 	$('#memberAuth_form_companyAuth').html(renderGridValue('${requestScope.memberAuthWithBLOBs.companyAuth}',fields.auths));
		$('#memberAuth_form_realNameAuth').html(renderGridValue('${requestScope.memberAuthWithBLOBs.realNameAuth}',fields.auths));
		$('#memberAuth_form_idCardAuth').html(renderGridValue('${requestScope.memberAuthWithBLOBs.idCardAuth}',fields.auths));
		$('#memberAuth_form_workAuth').html(renderGridValue('${requestScope.memberAuthWithBLOBs.workAuth}',fields.auths));   
		
		 */ 
		if("${requestScope.memberAuthWithBLOBs.infoAuth}" == 'pass'){
			$('#memberAuth_form_infoAuth').html('<img src="${ctx}/resources/images/borrow/auth_pass.jpg" alt="auth_pass">');
		}else{
			$('#memberAuth_form_infoAuth').html(renderGridValue('${requestScope.memberAuthWithBLOBs.infoAuth}',fields.auths));	
		}
		if("${requestScope.memberAuthWithBLOBs.vipAuth}" == 'pass'){
			$('#memberAuth_form_vipAuth').html('<img src="${ctx}/resources/images/borrow/auth_pass.jpg" alt="auth_pass">');
		}else{
			$('#memberAuth_form_vipAuth').html(renderGridValue('${requestScope.memberAuthWithBLOBs.vipAuth}',fields.auths));
		}
		if("${requestScope.memberAuthWithBLOBs.emailAuth}" == 'pass'){
			$('#memberAuth_form_emailAuth').html('<img src="${ctx}/resources/images/borrow/auth_pass.jpg" alt="auth_pass">');
		 }else{
			$('#memberAuth_form_emailAuth').html(renderGridValue('${requestScope.memberAuthWithBLOBs.emailAuth}',fields.auths));
		}
		if("${requestScope.memberAuthWithBLOBs.mobileAuth}" == 'pass'){
			$('#memberAuth_form_mobileAuth').html('<img src="${ctx}/resources/images/borrow/auth_pass.jpg" alt="auth_pass">');
		}else{
			$('#memberAuth_form_mobileAuth').html(renderGridValue('${requestScope.memberAuthWithBLOBs.mobileAuth}',fields.auths));
		}
		if("${requestScope.memberAuthWithBLOBs.companyAuth}" == 'pass'){
			$('#memberAuth_form_companyAuth').html('<img src="${ctx}/resources/images/borrow/auth_pass.jpg" alt="auth_pass">');
		}else{
			$('#memberAuth_form_companyAuth').html(renderGridValue('${requestScope.memberAuthWithBLOBs.companyAuth}',fields.auths));	
		}
		if("${requestScope.memberAuthWithBLOBs.creditAuth}" == 'pass'){
			$('#memberAuth_form_creditAuth').html('<img src="${ctx}/resources/images/borrow/auth_pass.jpg" alt="auth_pass">');
		}else{
			$('#memberAuth_form_creditAuth').html(renderGridValue('${requestScope.memberAuthWithBLOBs.creditAuth}',fields.auths));	
		}
		if("${requestScope.memberAuthWithBLOBs.realNameAuth}" == 'pass'){
			$('#memberAuth_form_realNameAuth').html('<img src="${ctx}/resources/images/borrow/auth_pass.jpg" alt="auth_pass">');
		}else{
			$('#memberAuth_form_realNameAuth').html(renderGridValue('${requestScope.memberAuthWithBLOBs.realNameAuth}',fields.auths));
		}
		if("${requestScope.memberAuthWithBLOBs.idCardAuth}" == 'pass'){
			$('#memberAuth_form_idCardAuth').html('<img src="${ctx}/resources/images/borrow/auth_pass.jpg" alt="auth_pass">');
		}else{
			$('#memberAuth_form_idCardAuth').html(renderGridValue('${requestScope.memberAuthWithBLOBs.idCardAuth}',fields.auths));
		}
		if("${requestScope.memberAuthWithBLOBs.workAuth}" == 'pass'){
			$('#memberAuth_form_workAuth').html('<img src="${ctx}/resources/images/borrow/auth_pass.jpg" alt="auth_pass">');
		}else{
			$('#memberAuth_form_workAuth').html(renderGridValue('${requestScope.memberAuthWithBLOBs.workAuth}',fields.auths));   
		}
		 
		 
		//编辑器
		var idCardeditor;
		var crediteditor;
		var companyeditor;
		var idCardeditor_readonly;
		var crediteditor_readonly;
		var companyeditor_readonly;
		KindEditor.options.filterMode = false;
		KindEditor.ready(function(K) {
			idCardeditor = K.create('#member_idCardAccessory', {
				width : "500px",
				minWidth : "500px",
				height : "200px",
				minHeight : "200px",
				resizeType : 0,
				//uploadJson : ctx+'/member/uploadFile.htm',
				uploadJson : ctx+'/resources/js/kindeditor/jsp/upload_json.jsp',
				allowFileManager : true,
				allowImageRemote : false,
				urlType:'domain',
				items : ['image']
			});
			companyeditor = K.create('#member_companyAccessory', {
				width : "500px",
				minWidth : "500px",
				height : "200px",
				minHeight : "200px",
				resizeType : 0,
				//uploadJson : ctx+'/member/uploadFile.htm',
				uploadJson : ctx+'/resources/js/kindeditor/jsp/upload_json.jsp',
				allowFileManager : true,
				allowImageRemote : false,
				urlType:'domain',
				items : ['image']
			});
			crediteditor = K.create('#member_creditAccessory', {
				width : "500px",
				minWidth : "500px",
				height : "200px",
				minHeight : "200px",
				resizeType : 0,
				//uploadJson : ctx+'/member/uploadFile.htm',
				uploadJson : ctx+'/resources/js/kindeditor/jsp/upload_json.jsp',
				allowFileManager : true,
				allowImageRemote : false,
				urlType:'domain',
				items : ['image']
			});  
			idCardeditor_readonly = K.create('#member_idCardAccessory_readonly', {
				width : "500px",
				minWidth : "500px",
				height : "200px",
				minHeight : "200px",
				resizeType : 0,
				items : [],
				readonlyMode : true
			});
			companyeditor_readonly = K.create('#member_companyAccessory_readonly', {
				width : "500px",
				minWidth : "500px",
				height : "200px",
				minHeight : "200px",
				resizeType : 0,
				items : [],
				readonlyMode : true
			});
			crediteditor_readonly = K.create('#member_creditAccessory_readonly', {
				width : "500px",
				minWidth : "500px",
				height : "200px",
				minHeight : "200px",
				resizeType : 0,
				items : [],
				readonlyMode : true
			});  
			
		});
		function submitIdCardAccessoryForm()
		{
			idCardeditor.sync();//赋值操作
			var $idCard = document.getElementById('member_idCardAccessory').value;
			if($idCard == ""){
				alert("提交的内容不能为空！");
			}else{
				$.ajax({
					type: "POST",
					url: ctx+'/member/memberAccessoryForm.htm?whichAuth=idCardAuth',
					data: {"member_Accessory":idCardeditor.html()},
					success: function(data){
						var data = $.parseJSON(data);
						if(data.success){
							$('#memberAuth_form_idCardAuth').html(renderGridValue(data.obj.idCardAuth,fields.auths));
							$('#idCard_auth').html(renderGridValue(data.obj.idCardAuth,fields.auths));	
							successdialog(data);
							document.getElementById("member_idCardAccessory").value="";
							$("#but1").attr('disabled',"true");
						}
					} 
				});
			}
		}
		function submitCreditAccessoryForm()
		{
			//var crediteditor;
			crediteditor.sync();//赋值操作
			var $credit = document.getElementById('member_creditAccessory').value;
			if($credit.length <= 0){
				alert("提交的内容不能为空！");
			}else{
				$.ajax({
					type: "POST",
					url: ctx+'/member/memberAccessoryForm.htm?whichAuth=creditAuth',
					data: {"member_Accessory":crediteditor.html()},
					success: function(data){
						var data = $.parseJSON(data);
						if(data.success){
							$('#memberAuth_form_creditAuth').html(renderGridValue(data.obj.creditAuth,fields.auths));
							$('#credit_auth').html(renderGridValue(data.obj.creditAuth,fields.auths));	
							successdialog(data); 
							$("#but3").attr('disabled',"true");
						}
					}
				});
			}
		}
		function submitCompanyAccessoryForm()
		{
			//var companyeditor;
			companyeditor.sync();//赋值操作
			var $company = document.getElementById('member_companyAccessory').value;
			if($company.length <= 0){
				alert("提交的内容不能为空！");
				return false;
			}else{
				$.ajax({
					type: "POST",
					url: ctx+'/member/memberAccessoryForm.htm?whichAuth=companyAuth',
					data: {"member_Accessory":companyeditor.html()},
					success: function(data){
						var data = $.parseJSON(data);
						if(data.success){
							$('#memberAuth_form_companyAuth').html(renderGridValue(data.obj.companyAuth,fields.auths));
							$('#company_auth').html(renderGridValue(data.obj.companyAuth,fields.auths));	
							successdialog(data);
							$("#but2").attr('disabled',"true");
						}
					}
				});
			}
		}
		function successdialog(data){
			KindEditor.ready(function(K) {
			var dialog = K.dialog({
					        width : 300,
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
					                        $('#idCardAccessoryModal').modal('hide');
					                        $('#companyAccessoryModal').modal('hide');
					                        $('#creditAccessoryModal').modal('hide');
					                        
					                		dialog.remove();
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
		function vipdialog(data){
			KindEditor.ready(function(K) {
			var dialog = K.dialog({
					        width : 300,
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
					                }
					        },
						});
			});
		}
	  	<!-- 分页显示表格数据 -->
		$(function(){
			//获得浏览器参数
			$.extend({
				getUrlVars: function(){
					var vars = [], hash;
					var hashes = window.location.href.slice(window.location.href.indexOf('?') + 1).split('&');
					//alert("  aa   "+hashes);
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
		var composeUrlParams1=function(){
			var param='';
			$.each($.getUrlVars(), function(i, item) {
				if(item!='p'){
					var val=$.getUrlVar(item);
					if(val) param += "&" + item+"="+val;
				}
			});
			//alert("aa  "+param);
			return param;
		}
		//封装浏览器参数
		var composeUrlParams2=function(){
			var param='';
			$.each($.getUrlVars(), function(i, item) {
				if(item!='p'){
					var val=$.getUrlVar(item);
					if(val) param += "&" + item+"="+val;
				}
			});
			//alert("aa  "+param);
			return param;
		}
		
		var elementpagememberIntegral = $('#pagememberIntegral');
		var elementpagememberApplyAmount = $('#pagememberApplyAmount');
		
		//积分的设置分页的总页数
		var totalmemberIntegral=${memberIntegralDatas.total}/10;
		if(parseInt(totalmemberIntegral)==totalmemberIntegral){
			var totalmemberIntegral = parseInt(totalmemberIntegral);
		}else {
			var totalmemberIntegral = parseInt(totalmemberIntegral)+1;
		}
		
		var memberIntegralOptions = {
		    bootstrapMajorVersion:3,
		    currentPage: ${memberIntegralDatas.p},
		    numberOfPages: 5,
		    totalPages:totalmemberIntegral,
		    pageUrl: function(type, page, current){
		    	return "${ctx}/member/memberAuth.htm?"+composeUrlParams1()+"&p="+page;
		    	}
		}
		
		//额度申请的设置分页的总页数
		var totalmemberApplyAmount=${memberApplyAmountDatas.total}/5;
		if(parseInt(totalmemberApplyAmount)==totalmemberApplyAmount){
			var totalmemberApplyAmount = parseInt(totalmemberApplyAmount);
		}else {
			var totalmemberApplyAmount = parseInt(totalmemberApplyAmount)+1;
		}
		
		var memberApplyAmountOptions = {
		    bootstrapMajorVersion:3,
		    currentPage: ${memberApplyAmountDatas.p},
		    numberOfPages: 5,
		    totalPages:totalmemberApplyAmount,
		    pageUrl: function(type, page, current){
		    	return "${ctx}/applyAmount/applyAmountPage.htm?"+composeUrlParams1()+"&p="+page;
		    	}
		}
		
		elementpagememberIntegral.bootstrapPaginator(memberIntegralOptions);
		elementpagememberApplyAmount.bootstrapPaginator(memberApplyAmountOptions);
		})
</script>
</html>