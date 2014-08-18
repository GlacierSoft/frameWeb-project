<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%><!-- 引入jstl解析标签 -->
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %><!-- 引入自定义权限标签 -->
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
					          <a href="#" onclick="checksMember('${currentMember.memberId}','${ctx}/member/memberAuth.htm?&p=0');" class="btn btn-default" role="button">平台认证</a>
					          <a href="#" onclick="checksMember('${currentMember.memberId}','${ctx}/messageNotice/intoMessageNotice.htm?&p=1');" class="btn btn-default" role="button">站内信</a>
							  
							  <a href="${ctx}/member/memberDetail.htm" class="btn btn-info" role="button">个人设置</a>
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
				    <h3 class="panel-title">个人设置</h3>
				  </div>
				  <div class="panel-body">
				   <div class="bs-example bs-example-tabs">
				     <ul id="myTab" class="nav nav-tabs">
				      <c:if test="${empty addBankCard && empty updateSecretSecurity}">
				       <li class="active"><a href="${ctx}/member/memberDetail.htm" class="btn " role="button">个人详细信息</a></li>
				       <li id="tabchangeMobileLi"><a  id="tabchangeMobileTab" href="#tabUpdatePassword" data-toggle="tab">修改密码</a></li>
				       <li><a href="#tabchangeMobile" data-toggle="tab">更换手机</a></li>
				       <li><a href="#tabnotification" data-toggle="tab">通知设置</a></li>
				       <li id="tabbankCardTabs"><a href="#tabbankCard" id="tabbankCardTab" data-toggle="tab">银行卡设置</a></li>
				       <li id="updateSecretSecurityLi"><a id="updateSecretSecurityTab" href="#updateSecretSecurity" data-toggle="tab">修改密保设置</a></li>
				       <li id="tabchangeMobileLi2"><a id="tabchangeMobileTab2" href="#tabUpdatePassword2" data-toggle="tab">修改交易密码</a></li>
				       </c:if>
				       <c:if test="${addBankCard == 'addBankCard' }">
				       	   <li><a href="${ctx}/member/memberDetail.htm" class="btn " role="button">个人详细信息</a></li>
					       <li id="tabchangeMobileLi"><a id="tabchangeMobileTab" href="#tabUpdatePassword" data-toggle="tab">修改密码</a></li>
					       <li><a href="#tabchangeMobile" data-toggle="tab">更换手机</a></li>
					       <li><a href="#tabnotification" data-toggle="tab">通知设置</a></li>
					       <li id="tabbankCardTabs" class="active"><a href="#tabbankCard" id="tabbankCardTab" data-toggle="tab">银行卡设置</a></li>
					       <li id="updateSecretSecurityLi"><a  id="updateSecretSecurityTab" href="#updateSecretSecurity" data-toggle="tab">修改密保设置</a></li>
				           <li id="tabchangeMobileLi2"><a  id="tabchangeMobileTab2" href="#tabUpdatePassword2" data-toggle="tab">修改交易密码</a></li>
				       </c:if>
				        <c:if test="${!empty updateSecretSecurity }">
				       	   <li><a href="${ctx}/member/memberDetail.htm" class="btn " role="button">个人详细信息</a></li>
					       <li id="tabchangeMobileLi"><a id="tabchangeMobileTab" href="#tabUpdatePassword" data-toggle="tab">修改密码</a></li>
					       <li><a href="#tabchangeMobile" data-toggle="tab">更换手机</a></li>
					       <li><a href="#tabnotification" data-toggle="tab">通知设置</a></li>
					       <li id="tabbankCardTabs"><a href="#tabbankCard" id="tabbankCardTab" data-toggle="tab">银行卡设置</a></li>
					       <li id="updateSecretSecurityLi" class="active"><a id="updateSecretSecurityTab" href="#updateSecretSecurity" data-toggle="tab">修改密保设置</a></li>
				           <li id="tabchangeMobileLi2"><a  id="tabchangeMobileTab2" href="#tabUpdatePassword2" data-toggle="tab">修改交易密码</a></li>
				       </c:if>
				     </ul>
				      <br>
				     <div id="myTabContent" class="tab-content">
				     	<c:if test="${empty addBankCard && empty updateSecretSecurity}">
				        <div class="tab-pane fade in active" id="tabPersonalDetails">
				        </c:if>
				        <c:if test="${addBankCard == 'addBankCard' || !empty updateSecretSecurity}">
				        <div class="tab-pane fade" id="tabPersonalDetails">
				        </c:if>
				       		<form id="personalMessageForm"  class=" form-horizontal" role="form"  method="post" onsubmit="return checkAll();">
				       		<div class="bs-example bs-example-tabs">
						     <ul id="myTab" class="nav nav-tabs">
						       <li class="active"><a href="#tabPersonalBase" data-toggle="tab">基本信息</a></li>
						       <li><a href="#tabPersonalContact" data-toggle="tab">联系信息</a></li>
						       <li><a href="#tabPersonalWork" data-toggle="tab">工作信息</a></li>
						     </ul>
						     <div id="myTabContent" class="tab-content">
						       <div class="tab-pane fade in active" id="tabPersonalBase">
						       		 <br>
						        <blockquote>
							  		<p class="text-primary">* 为必填项，所有资料均会严格保密。*成为借款人必填项。</p>
								</blockquote>
								  
							  		  <div class="form-group">
							  		  	<input type="hidden" class="form-control" id="memberId" name="memberId" value="${currentMember.memberId}" >
									    <!-- 判断是按保存按钮还是保存并提交审核按钮 -->
									    <input type="hidden" class="form-control" id="postAuth" name="postAuth" value="">
									    <label for="memberRealName" class="col-sm-2 control-label">*真实姓名:</label>
									    <div class="col-sm-4">
									      <input type="text" maxlength="8" class="form-control" onblur="checkMemberRealName();" id="memberRealName" name="memberRealName" value="${currentMember.memberRealName}" onkeyup="value=value.replace(/[\d]/ig,'')"  placeholder="真实姓名" >
									      <span id="memberRealNameSpan"></span>
									    </div>
									  </div>
									  
									  <div class="form-group">
									    <label for="cardId" class="col-sm-2 control-label">*身份证:</label>
									    <div class="col-sm-4">
									      <input type="text" class="form-control" maxlength="23" onblur="checkCardId();" id="cardId" name="cardId" value="${currentMember.cardId}"  placeholder="身份证"  >
									      <span id="cardIdSpan"></span>
									     </div>
									      <span style="color:#F00;margin-left: 70px"> * 演示站点不发送短信验证</span>
									  </div>
									  <div class="form-group" >
									    <label for="mobileNumber" class="col-sm-2 control-label">*手机号码:</label>
									    <div class="col-sm-4" style="width: 300px;float: left;">
									      <input type="tel"  class="form-control" maxlength="11" onblur="checkMobileNumber();" style="width: 170px;float: left;" name="mobileNumber" id="mobileNumber" value="${currentMember.mobileNumber}"  placeholder="手机号码" >
									      <button id="updatePhoneForm_form-group" type="submit" style="float: right;" disabled="disabled" class="btn btn-default">获取验证码</button>
									      <span id="mobileNumberSpan"></span>
									      
					                 </div>
					                 
					                 <div class="form-group" style="float: left;width: 400px" >
									   <label for="mobileNumber" class="col-sm-2 control-label" style="float: left;width: 150px;margin-left: 38px" >*短信验证码:</label>
									      <div class="col-sm-4" style="float: left;">
									       <input type="tel" class="form-control"  maxlength="6" style="width: 170px"  name="yz" id="yz"   placeholder="手机短信验证码" >
									    
									     </div> 
									      </div>
									     
									     
									  </div>
									  
									  <div class="form-group">
									    <label for="sex" class="col-sm-2 control-label">性别:</label>
									  	<div class="col-sm-4">
									       <select class="form-control col-sm-6" name="sex" id="sex" >
											  <option value="man">男</option>
											  <option value="woman">女</option>
											  <option value="secret">保密</option>
											</select>
									    </div>
									    <label for="maritalStatus" class="col-sm-2 control-label">婚姻状况:</label>
									    <div class="col-sm-4">
									       <select class="form-control col-sm-6" name="maritalStatus" id="maritalStatus" >
											  <option value="single">单身</option>
											   <option value="married">已婚</option>
											  <option value="secret">保密</option>
											</select>
									    </div>
									  </div>
									  <div class="form-group">
									    <label for="educational" class="col-sm-2 control-label">最高学历:</label>
									    <div class="col-sm-4">
									       <select class="form-control col-sm-6" name="educational" id="educational" >
											  <option value="高中或以下">高中或以下</option>
											  <option value="大专">大专</option>
											  <option value="本科">本科</option>
											  <option value="研究生或以上">研究生或以上</option>
											  <option value="其他">其他</option>
											</select>
									    </div>
									    <label for="memberAge" class="col-sm-2 control-label">会员年龄:</label>
									    <div class="col-sm-4">
									      <input type="text" class="form-control" maxlength="3" name="memberAge" id="memberAge" value="${currentMember.memberAge}" placeholder="会员年龄">
									    </div>
									  </div>
									  <div class="form-group">
									     <label for="hometown" class="validate[required] col-sm-2 control-label">籍贯:</label>
									    <div class="col-sm-4">
									      <input type="text" maxlength="20" class=" form-control" name="hometown" id="hometown" value="${currentMember.hometown}"  placeholder="籍贯" onchange="value=value.replace(/[^\u4E00-\u9FA5]/g,'')" 
									      onbeforepaste="clipboardData.setData('text',clipboardData.getData('text').replace(/[^\u4E00-\u9FA5]/g,''))" >
									    </div>
									    <label for="homePhone" class="col-sm-2 control-label">住宅电话:</label>
									    <div class="col-sm-4">
									      <input type="text" class="form-control" maxlength="11" name="homePhone" id="homePhone" value="${currentMember.homePhone}"  placeholder="住宅电话">
									    </div>
									  </div>
									  <div class="form-group">
									    <label for="liveAddress" class="col-sm-2 control-label">*现居住地址:</label>
									    <div class="col-sm-10">
									      <input type="text" class="form-control" maxlength="25" onblur="checkLiveAddress();" name="liveAddress" id="liveAddress" value="${currentMember.liveAddress}"  placeholder="现居住地址">
									      <span id="liveAddressSpan"></span>
									    </div>
									  </div>
			 						  <div class="form-group">
									    <label for="personalDes" class="col-sm-2 control-label">个人描述:</label>
									    <div class="col-sm-10">
									      <textarea class="form-control" rows="3" name="personalDes" id="personalDes" >${currentMember.personalDes}</textarea>
									    </div>
									  </div>
						       </div>
						       <div class="tab-pane fade" id="tabPersonalContact">
						          <br>
						        <blockquote>
							  		<p class="text-primary">* 为必填项，所有资料均会严格保密。*成为借款人必填项。</p>
								</blockquote>
						  				<div class="form-group">
									    <label for="firstContact" class="col-sm-2 control-label">*第一联系人:</label>
									    <div class="col-sm-4">
									      <input type="text" class="form-control" maxlength="8" onblur="checkFirstContact();" name="firstContact" id="firstContact" value="${currentMember.firstContact}" onkeyup="value=value.replace(/[\d]/ig,'')"  placeholder="第一联系人">
									      <span id="firstContactSpan"></span>
									    </div>
									     <label for="firstContactRelation" class="col-sm-2 control-label">第一联系人关系:</label>
									    <div class="col-sm-4">
									       <select class="form-control col-sm-6" name="firstContactRelation" id="firstContactRelation" >
											  <option value="family">家人</option>
											  <option value="friend">朋友</option>
											  <option value="business">合作伙伴</option>
											</select>
									    </div>
									  </div>
									  <div class="form-group">
									    <label for="firstContactPhone" class="col-sm-2 control-label" style="width: 150px">*联系人手机号码:</label>
									    <div class="col-sm-4">
									      <input type="text" class="form-control" maxlength="11" onblur="checkFirstContactPhone();" name="firstContactPhone" id="firstContactPhone"  value="${currentMember.firstContactPhone}" placeholder="第一联系人手机号码">
									      <span id="firstContactPhoneSpan"></span>
									    </div>
									    <label for="firstContactAddress" class="col-sm-2 control-label">*第一联系人地址:</label>
									    <div class="col-sm-4">
									      <input type="text" class="form-control" maxlength="25" onblur="checkFirstContactAddress();" name="firstContactAddress" id="firstContactAddress" value="${currentMember.firstContactAddress}"  placeholder="第一联系人地址">
									      <span id="firstContactAddressSpan"></span>
									    </div>
									  </div>
									  <div class="form-group">
									    <label for="secondContact" class="col-sm-2 control-label">第二联系人:</label>
									    <div class="col-sm-4">
									      <input type="text" class="form-control" maxlength="8" name="secondContact" id="secondContact" value="${currentMember.secondContact}" onkeyup="value=value.replace(/[\d]/ig,'')"  placeholder="第二联系人">
									    </div>
									    <label for="secondContactRelation" class="col-sm-2 control-label">第二联系人关系:</label>
									    <div class="col-sm-4">
									       <select class="form-control col-sm-6" name="secondContactRelation" id="secondContactRelation" >
											  <option value="family">家人</option>
											  <option value="friend">朋友</option>
											  <option value="business">合作伙伴</option>
											</select>
									    </div>
									  </div>
									  <div class="form-group">
									    <label for="secondContactPhone" class="col-sm-2 control-label">联系人手机号码:</label>
									    <div class="col-sm-4">
									      <input type="text" class="form-control" maxlength="11" name="secondContactPhone" id="secondContactPhone" value="${currentMember.secondContactPhone}"  placeholder="第二联系人手机号码">
									    </div>
									    <label for="secondContactAddress" class="col-sm-2 control-label">第二联系人地址:</label>
									    <div class="col-sm-4">
									      <input type="text" class="form-control" maxlength="25" name="secondContactAddress" id="secondContactAddress" value="${currentMember.secondContactAddress}"  placeholder="第二联系人地址">
									    </div>
									  </div>
						       </div>
						       <div class="tab-pane fade" id="tabPersonalWork">
						         <br>
						        <blockquote>
							  		<p class="text-primary">* 为必填项，所有资料均会严格保密。*成为借款人必填项。</p>
								</blockquote>
						  		  <div class="form-group">
								    <label for="unitName" class="col-sm-2 control-label">*单位名称:</label>
								    <div class="col-sm-4">
								      <input type="text" maxlength="20" class="form-control" onblur="checkUnitName();" id="unitName" name="unitName" value="${currentMemberWork.unitName}"  placeholder="单位名称">
								      <span id="unitNameSpan"></span>
								    </div>
								  </div>
								  <div class="form-group">
								    <label for="unitAdress" class="col-sm-2 control-label">*单位地址:</label>
								    <div class="col-sm-4">
								      <input type="text" class="form-control" onblur="checkNull();" maxlength="25" id="unitAdress" name="unitAdress" value="${currentMemberWork.unitAdress}"  placeholder="单位地址">
								      <span id="unitAdressSpan"></span>
								    </div>
								    <label for="unitPhone" class="col-sm-2 control-label">*单位电话:</label>
								    <div class="col-sm-4">
								      <input type="text" class="form-control" maxlength="11" onblur="checkUnitPhone();" id="unitPhone" name="unitPhone" value="${currentMemberWork.unitPhone}"  placeholder="单位电话">
								      <span id="unitPhoneSpan"></span>
								    </div>
								  </div>
								  <div class="form-group">
								    <label for="workAge" class="col-sm-2 control-label">工作年限:</label>
								    <div class="col-sm-4">
								      <input type="text" class="form-control" id="workAge" maxlength="3" name="workAge" value="${currentMemberWork.workAge}"  placeholder="工作年限">
								    </div>
								    <label for="salary" class="col-sm-2 control-label">年薪:</label>
								    <div class="col-sm-4">
								      <input type="text" class="form-control" id="salary" maxlength="12" name="salary" value="${currentMemberWork.salary}"  placeholder="年薪">
								    </div>
								  </div>
								  <div class="form-group">
								    <label for="proofPerson" class="col-sm-2 control-label">*证明人:</label>
								    <div class="col-sm-4">
								      <input type="text" class="form-control" maxlength="8" onblur="checkProofPerson();" id="proofPerson" name="proofPerson" value="${currentMemberWork.proofPerson}" onkeyup="value=value.replace(/[\d]/ig,'')"  placeholder="证明人">
								      <span id="proofPersonSpan"></span>
								    </div>
								    <label for="proofPhone" class="col-sm-2 control-label">*证明人手机号码:</label>
								    <div class="col-sm-4">
								      <input type="text" class="form-control" onblur="checkProofPhone();" maxlength="11" id="proofPhone" name="proofPhone" value="${currentMemberWork.proofPhone}"  placeholder="证明人手机号码">
								      <span id="proofPhoneSpan"></span>
								    </div>
								  </div>
						       </div>
						     </div>
						   </div><!-- /example -->
						   <div class="form-group">
						    <div class="col-sm-2"></div>
						    <div class="col-sm-10">
						      <p class="text-warning">温馨提示:按保存并提交审核按钮之后，将不能再修改用户信息。填写资料越详细，审核几率将会更高。</p>
						    </div>
						  </div>
						    <div class="form-group">
						    <div class="col-sm-offset-2 col-sm-10">
						      <button id="onlyPost" type="submit" class="btn btn-primary btn-lg" onclick="return checkAll();">保  存</button>
						      <button id="postAuthBut" type="submit" class="btn btn-primary btn-lg" onclick="return checkAll();">保存并提交审核</button>
						      <div style="float: right;margin-top: 10px;margin-right:300px;"><span id="tieshi"></span></div>
						    </div>
						  	</div>
						   </form>  
				       </div>
				    
				       <div class="tab-pane fade" id="tabUpdatePassword">
				         <form id="updatememberPasswordForm" class="form-horizontal" role="form" method="post" >
						  <div class="form-group">
						    <label for="memberName" class="col-sm-3 control-label" style="color:red;">会员登录密码修改</label>
						    <div class="col-sm-9">
						    </div>
						  </div>
						  <div class="form-group">
						    <label for="memberName" class="col-sm-3 control-label">原密码:</label>
						    <div class="col-sm-9">
						      <input type="hidden" class="form-control" id="memberId" name="memberId" value="${currentMember.memberId}" >
						      <input type="text" autocomplete="off" onfocus="this.type='password'" class="form-control" id="oldPassword_form-group" name="oldPassword" placeholder="输入您现在的帐号密码"  value="" />
						    </div>
						  </div>
						  <div class="form-group">
						    <label for="memberPassword" class="col-sm-3 control-label">新密码:</label>
						    <div class="col-sm-9">
						      <input type="text" autocomplete="off" onfocus="this.type='password'" class="form-control" id="memberPassword_form-group" name="memberPassword" placeholder="输入您的新密码"  value="" />
						    </div>
						  </div>
						  <div class="form-group">
						    <label for="comfirPassword" class="col-sm-3 control-label">确认新密码:</label>
						    <div class="col-sm-9">
						      <input type="text" autocomplete="off" onfocus="this.type='password'" class="form-control" id="comfirPassword_form-group" name="comfirPassword" placeholder="请再次输入您的新密码" value="" />
						    </div>
						  </div>
						  <div class="form-group">
						    <div class="col-sm-offset-3 col-sm-9">
						      <button id="updatememberPasswordForm_form-group" type="submit" class="btn btn-primary">提    交</button>
						    </div>
						  </div>
						</form>
				       </div>
				       <!-- sjd------------------------- -->
				           <div class="tab-pane fade" id="tabUpdatePassword2">
				         <form id="updatememberPasswordForm2" class="form-horizontal" role="form" method="post" >
						  <div class="form-group">
						    <label for="memberName" class="col-sm-3 control-label" style="color:red;">交易密码修改</label>
						    <div class="col-sm-9">
						    </div>
						  </div>
						  <div class="form-group">
						    <label for="memberName" class="col-sm-3 control-label">原交易密码:</label>
						    <div class="col-sm-9">
						      <input type="hidden" class="form-control" id="memberId" name="memberId" value="${currentMember.memberId}" >
						      <input type="text" autocomplete="off" onfocus="this.type='password'" class="form-control" id="oldPassword_form-group2" name="oldPassword" placeholder="输入您现在的交易密码" value="" />
						    </div>
						  </div>
						  <div class="form-group">
						    <label for="memberPassword" class="col-sm-3 control-label">新交易密码:</label>
						    <div class="col-sm-9">
						      <input type="text" autocomplete="off" onfocus="this.type='password'" class="form-control" id="memberPassword_form-group2" name="memberPassword" placeholder="输入您的新交易密码" value="" />
						    </div>
						  </div>
						  <div class="form-group">
						    <label for="comfirPassword" class="col-sm-3 control-label">确认新密码:</label>
						    <div class="col-sm-9">
						      <input type="text" autocomplete="off" onfocus="this.type='password'" class="form-control" id="comfirPassword_form-group2" name="comfirPassword" placeholder="请再次输入您的新交易密码" value=""/>
						    </div>
						  </div>
						  <div class="form-group">
						    <div class="col-sm-offset-3 col-sm-9">
						      <button id="updatememberPasswordForm_form-group" type="submit" class="btn btn-primary">提    交</button>
						    </div>
						  </div>
						</form>
				       </div>
				       
				       
				       <div class="tab-pane fade" id="tabchangeMobile">
				          <form id="updatePhoneForm" class="form-horizontal" role="form" method="post" >
						  <div class="form-group">
						    <label for="memberName" class="col-sm-3 control-label" style="color:red;">手机绑定</label>
						    <div class="col-sm-9">
						    </div>
						  </div>
						  <div class="form-group">
						    <label for="memberName" class="col-sm-3 control-label"></label>
						    <%-- <label for="memberName" class="col-sm-2 ">手机号码：${currentMember.mobileNumber}</label> --%>
						    <div class="col-sm-9">
						  	  手机号码：${currentMember.mobileNumber}
						    </div> 
						  </div>
						  <div class="form-group">
						    <label for="memberName" class="col-sm-3 control-label" style="color:red;">手机变更</label>
						    <div class="col-sm-9">
						    </div>
						  </div>
						  <div class="form-group">
						    <label for="mobileNumber" class="col-sm-3 control-label">手机号码:</label>
						    <div class="col-sm-6">
						      <input type="hidden" class="form-control" id="memberId" name="memberId" value="${currentMember.memberId}" >
						      <input type="text" class="form-control" id="mobileNumber_form-group" maxlength="15" name="mobileNumber" placeholder="输入您要更改的手机号码" onkeyup="value=value.replace(/[^\d]/g,'') "
                               onbeforepaste="clipboardData.setData('text',clipboardData.getData('text').replace(/[^\d]/g,''))"  />
						    </div>
						    <div class="col-sm-3">
						       <button id="updatePhoneForm_form-group" type="submit" disabled="disabled" class="btn btn-primary">发送手机验证码</button>
						    </div>
						  </div>
						  <div class="form-group">
						    <label for="memberPassword" class="col-sm-3 control-label">验证码:</label>
						    <div class="col-sm-6">
						      <input type="text" class="form-control" id="memberPassword_form-group" maxlength="6" name="memberPassword" placeholder="输入手机验证码"  />
						    </div>
						     <div class="col-sm-3">
						    </div>
						  </div>
						  <div class="form-group">
						    <label for="comfirPassword" class="col-sm-3 control-label">变更原因:</label>
						    <div class="col-sm-9">
						      <textarea class="form-control" rows="3" name="changeReason" id="changeReason" ></textarea>
						    </div>
						  </div>
						  <div class="form-group">
						    <div class="col-sm-offset-3 col-sm-9">
						      <button id="updatePhoneForm_form-group" type="submit" disabled="disabled" class="btn btn-primary">手机变更</button>
						   &nbsp;<span style="color:#F00"> * 演示站点不发送短信</span>
						    </div>
						  </div>
						</form>
				       </div>
				       <div class="tab-pane fade" id="tabnotification">
				         <p>通知设置</p>
				       </div>
				       <c:if test="${empty addBankCard}">
				        <div class="tab-pane fade" id="tabbankCard">
				        </c:if>
				        <c:if test="${addBankCard == 'addBankCard' }">
				        <div class="tab-pane fade in active" id="tabbankCard">
				        </c:if>
				         <form id="bankCardForm" class="form-horizontal" role="form" method="post" >
						  <div class="form-group">
						    <label for="memberName" class="col-sm-2 control-label" style="color:red;">提现银行</label>
						    <div class="col-sm-10">
						    </div>
						  </div>
						  <div class="form-group">
						    <label for="mobileNumber" class="col-sm-3 control-label">真实姓名:</label>
						    <div class="col-sm-9">
						    <div style="margin-top: 5px">  ${currentMember.memberRealName}</div>
						      <input type="hidden" class="form-control" id="memberId" name="memberId" value="${currentMember.memberId}" >
						    </div>
						  </div>
						  <div class="form-group">
						    <label for="openingBank" class="col-sm-3 control-label">开户行:</label>
						    <div class="col-sm-6">
						      <input type="text" class="form-control" id="openingBank_form-group" name="openingBank" placeholder="输入您的开户银行名称" 
						      onchange="value=value.replace(/[^\u4E00-\u9FA5]/g,'')" onbeforepaste="clipboardData.setData('text',clipboardData.getData('text').replace(/[^\u4E00-\u9FA5]/g,''))"/>
						    </div>
						     <div class="col-sm-3">
						    </div>
						  </div>
						  <div class="form-group">
						    <label for="subbranch" class="col-sm-3 control-label">支行:</label>
						    <div class="col-sm-6">
						      <input type="text" class="form-control" id="subbranch_form-group" name="subbranch" placeholder="输入您的开户支行"  onchange="value=value.replace(/[^\u4E00-\u9FA5]/g,'')"
						      onbeforepaste="clipboardData.setData('text',clipboardData.getData('text').replace(/[^\u4E00-\u9FA5]/g,''))" />
						    </div>
						     <div class="col-sm-3">
						    </div>
						  </div>
						   <div class="form-group">
						    <label for="cardNumber" class="col-sm-3 control-label">卡号:</label>
						    <div class="col-sm-6">
						      <input type="text" class="form-control" id="cardNumber_form-group" name="cardNumber" placeholder="输入您的卡号"  maxlength="19" onkeyup="value=value.replace(/[^\d]/g,'') "
                                              onbeforepaste="clipboardData.setData('text',clipboardData.getData('text').replace(/[^\d]/g,''))" />
						    </div>
						     <div class="col-sm-3">
						    </div>
						  </div>
						  <div class="form-group">
						    <label for="cardName" class="col-sm-3 control-label">银行卡名称:</label>
						    <div class="col-sm-6">
						      <input type="text" class="form-control" id="cardName_form-group" name="cardName" placeholder="输入您的银行卡名称" onchange="value=value.replace(/[^\u4E00-\u9FA5]/g,'')"
						      onbeforepaste="clipboardData.setData('text',clipboardData.getData('text').replace(/[^\u4E00-\u9FA5]/g,''))" />
						    </div>
						     <div class="col-sm-3">
						    </div>
						  </div>
						  <div class="form-group">
						    <div class="col-sm-offset-3 col-sm-9">
						      <button id="bankCardForm_form-group" type="submit" class="btn btn-primary">提  交</button>
						    </div>
						  </div>
						</form>
						<blockquote style="margin-top:50px;">
						       	<h5 class="text-danger"><strong>银行卡列表：</strong></h5>
						</blockquote>
				         <table id="bankCardTable" class="table table-bordered" style="text-align:center;vertical-align: middle;">
				         	<tbody>
				            <tr>
				              <td><strong>真实姓名</strong></td>
				              <td><strong>开户行</strong></td>
				              <td><strong>支行</strong></td>
				              <td><strong>卡号</strong></td>
				              <td><strong>状态</strong></td>
				              <td><strong>操作</strong></td>
				            </tr><c:if test="${empty memberBankCardDatas}">
										<tr>
							           		<td colspan="6" style="text-align:center;vertical-align: middle;"><strong>暂无信息</strong></td>
							          	</tr>
									</c:if>	  	
				            <c:forEach items="${memberBankCardDatas}" var="bankCard" varStatus="indexStatus">
						      	<tr>
						      	  <td>${currentMember.memberRealName}</td>
					              <td>${bankCard.openingBank}</td>
					              <td>${bankCard.subbranch}</td>
					              <td>${bankCard.cardNumber}</td>
					              <td id="auditState${indexStatus.index}" class="auditState">
					              ${bankCard.status}
					              <script type="text/javascript">
					             $('#auditState'+${indexStatus.index}).html(renderGridValue('${bankCard.status}',fields.auditState));
					              </script>
					              </td>
					              <td>
					              <c:choose>
									   <c:when test="${bankCard.status == 'pass'}">  
						         		 <a href="#"><strong>申请变更</strong></a>
									   </c:when>
									   <c:when test="${bankCard.status == 'authstr' || bankCard.status == 'failure'}"> 
							         	<a id="bandCardCancel${indexStatus.index}" class="${bankCard.bankCardId}" href="javascript:void(0);"><strong>取消</strong></a>
							         	<script type="text/javascript">
										    $("#bandCardCancel"+${indexStatus.index}).bind('click', function(){   
										    	var valCalss=$("#bandCardCancel"+${indexStatus.index}).attr("class");//这里获取class值
										    	var url = ctx+"/bankCard/del.htm?bankCardId="+valCalss+"&addBankCard=addBankCard";
										    	comfireDeletedialog(url);
										    	/* $.ajax({
													   type: "GET",
													   url: ctx+"/bankCard/del.htm?bankCardId="+valCalss,
													   dataType: "json",
									 			   	 success: function(r) {
									 			   		deletedialog(r);
									                 },
									                 error: function() {
									                     alert("删除出错！");
									                 }
													}); */
										    });
										</script>
							         	<%-- <a href="${ctx}/member/memberPhotoInto.htm" class="btn btn-default" role="button"><strong>取消</strong></a> --%>
									   </c:when>
									</c:choose>
					              </td>
					            </tr>
					      	</c:forEach> 
				            </tbody>
				            <tfoot>
					          <tr>
					            <th colspan="6">
					            	<div align="right">
									    <ul id='pageBankCard'></ul>
									</div>
								</th>
					          </tr>
					        </tfoot>
				        </table>
				       </div>
				       <!-- 银行卡tab结束 -->
				       <c:if test="${empty updateSecretSecurity}">
				        <div class="tab-pane fade" id="updateSecretSecurity">
				        </c:if>
				        <c:if test="${!empty updateSecretSecurity}">
				        <div class="tab-pane fade in active" id="updateSecretSecurity">
				        </c:if>
				       	<c:if test="${empty SecretSecurityResult.rows || updateSecretSecurity == 'updateSecretSecurity'}">
				         <form id="updateSecretSecurityForm" class="form-horizontal" role="form" method="post" >
						  <div class="form-group">
						    <label for="memberName" class="col-sm-3 control-label" style="color:red;">会员申请密码保护</label>
						    <div class="col-sm-9">
						    </div>
						  </div>
						  <div class="form-group">
						    <label for="questions" class="col-sm-3 control-label">问题一:</label>
						    <div class="col-sm-9">
						      <input type="hidden" class="form-control" id="memberId" name="memberId" value="${currentMember.memberId}" >
						      <select class="form-control" name="questions1" id="questions1"  required="required">
						      		<option value="">请选择</option>
						      	<c:forEach items="${parameterQuestionResult.rows}" var="question" varStatus="indexStatus">
						      		<option value="${question.questionId }">${question.questionDes }</option>
						      	</c:forEach>
							 </select>
						    </div>
						  </div>
						  <div class="form-group">
						    <label for="updateSecretSecurityForm_answers1" class="col-sm-3 control-label">问题一答案:</label>
						    <div class="col-sm-9">
						      <input type="text" class="form-control" id="updateSecretSecurityForm_answers1" name="answers1" placeholder="请输入问题一的答案"  />
						    </div>
						  </div>
						  <div class="form-group">
						    <label for="questions" class="col-sm-3 control-label">问题二:</label>
						    <div class="col-sm-9">
						      <select class="form-control" name="questions2" id="questions2" required="required" >
						      		<option value="">请选择</option>
								  <c:forEach items="${parameterQuestionResult.rows}" var="question" varStatus="indexStatus">
						      		<option value="${question.questionId }">${question.questionDes }</option>
						      	  </c:forEach>
							 </select>
						    </div>
						  </div>
						  <div class="form-group">
						    <label for="updateSecretSecurityForm_answers2" class="col-sm-3 control-label">问题二答案:</label>
						    <div class="col-sm-9">
						      <input type="text" class="form-control" id="updateSecretSecurityForm_answers2" name="answers2" placeholder="请输入问题二的答案"  />
						    </div>
						  </div>
						  <div class="form-group">
						    <label for="questions" class="col-sm-3 control-label">问题三:</label>
						    <div class="col-sm-9">
						      <select class="form-control" name="questions3" id="questions3" required="required" >
						      		<option value="">请选择</option>
								  <c:forEach items="${parameterQuestionResult.rows}" var="question" varStatus="indexStatus">
						      		<option value="${question.questionId }">${question.questionDes }</option>
						      	</c:forEach>
							 </select>
						    </div>
						  </div>
						  <div class="form-group">
						    <label for="updateSecretSecurityForm_answers3" class="col-sm-3 control-label">问题三答案:</label>
						    <div class="col-sm-9">
						      <input type="text" class="form-control" id="updateSecretSecurityForm_answers3" name="answers3" placeholder="请输入问题三的答案" />
						    </div>
						  </div>
						  <div class="form-group">
						    <div class="col-sm-offset-3 col-sm-9">
						      <button id="updatememberPasswordForm_form-group" type="submit" class="btn btn-primary">提    交</button>
						    </div>
						  </div>
						</form>
						</c:if>
						<c:if test="${!empty SecretSecurityResult && updateSecretSecurity != 'updateSecretSecurity'}">
				         <form id="answerSecretSecurityForm" class="form-horizontal" role="form" method="post" >
						  <div class="form-group">
						    <label for="memberName" class="col-sm-3 control-label" style="color:red;">用户安全问题保护验证 </label>
						    <div class="col-sm-9">
						    </div>
						  </div>
						  <div class="form-group">
						    <label for="questions" class="col-sm-3 control-label">问题一:</label>
						    <div class="col-sm-9">
						      <input type="hidden" class="form-control" id="memberId" name="memberId" value="${currentMember.memberId}" >
						      <input type="hidden" class="form-control" id="questionId1" name="questionId1" value="${SecretSecurityResult.rows[0].questionId}" >
						      <label class="control-label">${SecretSecurityResult.rows[0].questionDes}</label>
						    </div>
						  </div>
						  <div class="form-group">
						    <label for="updateSecretSecurityForm_answers1" class="col-sm-3 control-label">问题一答案:</label>
						    <div class="col-sm-9">
						      <input type="text" class="form-control" id="updateSecretSecurityForm_answers1" name="answers1" placeholder="请输入问题一的答案"  />
						    </div>
						  </div>
						  <div class="form-group">
						    <label for="questions" class="col-sm-3 control-label">问题二:</label>
						    <div class="col-sm-9">
						     <input type="hidden" class="form-control" id="questionId2" name="questionId2" value="${SecretSecurityResult.rows[1].questionId}" >
						     <label for="questions" class="control-label">${SecretSecurityResult.rows[1].questionDes}</label>
						    </div>
						  </div>
						  <div class="form-group">
						    <label for="updateSecretSecurityForm_answers2" class="col-sm-3 control-label">问题二答案:</label>
						    <div class="col-sm-9">
						      <input type="text" class="form-control" id="updateSecretSecurityForm_answers2" name="answers2" placeholder="请输入问题二的答案"  />
						    </div>
						  </div>
						  <div class="form-group">
						    <label for="questions" class="col-sm-3 control-label">问题三:</label>
						    <div class="col-sm-9">
						      <input type="hidden" class="form-control" id="questionId3" name="questionId3" value="${SecretSecurityResult.rows[2].questionId}" >	
						      <label for="questions" class="control-label">${SecretSecurityResult.rows[2].questionDes}</label>
						    </div>
						  </div>
						  <div class="form-group">
						    <label for="updateSecretSecurityForm_answers3" class="col-sm-3 control-label">问题三答案:</label>
						    <div class="col-sm-9">
						      <input type="text" class="form-control" id="updateSecretSecurityForm_answers3" name="answers3" placeholder="请输入问题三的答案" />
						    </div>
						  </div>
						  <div class="form-group" id="diverrorAnswer" style="display: none;">
						    <div class="col-sm-offset-3 col-sm-9"><label id="errorAnswer" class="control-label" style="color:red;"></label></div>
						  </div>
						  <div class="form-group">
						    <div class="col-sm-offset-3 col-sm-9">
						      <button id="updatememberPasswordForm_form-group" type="submit" class="btn btn-primary">提    交</button>
						     <button id="updatememberPasswordForm_form-group" type="submit" disabled="disabled" style="margin-left: 30px" class="btn  btn-default">忘记密保？发送到手机</button>
						     &nbsp;<span style="color:#F00;margin-left: 20px"> * 演示站点不发送短信验证</span>
						  
						   
						    
						    </div>
						  </div>
						</form>
						</c:if>
				       </div>
				       <!-- 一个tab结束 -->
				     </div>
				   </div><!-- /example -->
				  </div>
				</div>
	    	</div>
	    </div>
	    <hr class="featurette-divider2">
	    
	    </div>
	    <jsp:include page="../foot.jsp"/>
	    <!-- CONTAINER START======================== -->
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

	    /*-------------------------------------------------基本信息验证开始---------------------------------------------*/
	  	//验证所有
		function checkAll(){
			return checkMemberRealName()&&checkCardId()&&checkMobileNumber()&&checkLiveAddress()&&checkFirstContactPhone()&&checkFirstContactAddress()&&checkNull()&&checkUnitPhone()&&checkProofPerson()&&checkProofPhone();
		}
		
		//联系人名称验证
		function checkFirstContact(){
			var firstContact = $("#firstContact").val();
			if(firstContact == ""){
				document.getElementById("firstContactSpan").innerHTML="<font style='color: #F00;font-weight: bold;float:left;'>第一联系人名称不能为空!</font>";
				$("#tieshi").html("<font style='color: #F00;font-weight: bold;float:left;'>还有必填信息为空，请填写!</font>");
				return false;
			}else{
				document.getElementById("firstContactSpan").innerHTML="";
				$("#tieshi").html("");
				return true;
			}
		}
		
		//单位名称验证
		function checkUnitName(){
			var unitName = $("#unitName").val();
			if(unitName == ""){
				document.getElementById("unitNameSpan").innerHTML="<font style='color: #F00;font-weight: bold;float:left;'>单位名称不能为空!</font>";
				$("#tieshi").html("<font style='color: #F00;font-weight: bold;float:left;'>还有必填信息为空，请填写!</font>");
				return false;
			}else{
				document.getElementById("unitNameSpan").innerHTML="";
				$("#tieshi").html("");
				return true;
			}
		 }
		
		
		//联系人手机号码验证
		function checkFirstContactPhone(){
			var firstContactPhone = $("#firstContactPhone").val();
			if(firstContactPhone == ""){
				document.getElementById("firstContactPhoneSpan").innerHTML="<font style='color: #F00;font-weight: bold;float:left;'>第一联系人手机号码不能为空!</font>";
				$("#tieshi").html("<font style='color: #F00;font-weight: bold;float:left;'>还有必填信息为空，请填写!</font>");
				return false;
			}else{
				document.getElementById("firstContactPhoneSpan").innerHTML="";
				$("#tieshi").html("");
				return true;
			}
		 }
		
		//联系人地址验证
		function checkFirstContactAddress(){
			var firstContactAddress = $("#firstContactAddress").val();
			if(firstContactAddress == ""){
				document.getElementById("firstContactAddressSpan").innerHTML="<font style='color: #F00;font-weight: bold;float:left;'>联系人地址不能为空!</font>";
				$("#tieshi").html("<font style='color: #F00;font-weight: bold;float:left;'>还有必填信息为空，请填写!</font>");
				return false;
			}else{
				document.getElementById("firstContactAddressSpan").innerHTML="";
				$("#tieshi").html("");
				return true;
			}
		}
		
		
    	//真实姓名验证
	 	function checkMemberRealName(){
			var memberRealName = $("#memberRealName").val();
			if(memberRealName == ""){
				document.getElementById("memberRealNameSpan").innerHTML="<font style='color: #F00;font-weight: bold;float:left;'>真实姓名不能为空!</font>";
				$("#tieshi").html("<font style='color: #F00;font-weight: bold;float:left;'>还有必填信息为空，请填写!</font>");
				return false;
			}else{
				document.getElementById("memberRealNameSpan").innerHTML="";
				$("#tieshi").html("");
				return true;
			}
		}
    	
		//身份证验证
		function checkCardId(){
			var cardId = $("#cardId").val();
			if(cardId == ""){
				document.getElementById("cardIdSpan").innerHTML="<font style='color: #F00;font-weight: bold;float:left;'>身份证号码不能为空!</font>";
				$("#tieshi").html("<font style='color: #F00;font-weight: bold;float:left;'>还有必填信息为空，请填写!</font>");
				return false;
			}else{
				document.getElementById("cardIdSpan").innerHTML="";
				$("#tieshi").html("");
				return true;
			}
		}
		
		//身份证验证
		function checkMobileNumber(){
			var mobileNumber = $("#mobileNumber").val();
			if(mobileNumber == ""){
				document.getElementById("mobileNumberSpan").innerHTML="<font style='color: #F00;font-weight: bold;float:left;'>手机号码不能为空!</font>";
				$("#tieshi").html("<font style='color: #F00;font-weight: bold;float:left;'>还有必填信息为空，请填写!</font>");
				return false;
			}else{
				document.getElementById("mobileNumberSpan").innerHTML="";
				$("#tieshi").html("");
				return true;
			}
		}
	
		//居住地址验证
		function checkLiveAddress(){
			var liveAddress = $("#liveAddress").val();
			if(liveAddress == ""){
				document.getElementById("liveAddressSpan").innerHTML="<font style='color: #F00;font-weight: bold;float:left;'>居住地址不能为空!</font>";
				$("#tieshi").html("<font style='color: #F00;font-weight: bold;float:left;'>还有必填信息为空，请填写!</font>");
				return false;
			}else{
				document.getElementById("liveAddressSpan").innerHTML="";
				$("#tieshi").html("");
				return true;
			}
		}
		
    	//证明人验证
		function checkProofPhone(){
			var proofPhone = $("#proofPhone").val();
			if(proofPhone == ""){
				document.getElementById("proofPhoneSpan").innerHTML="<font style='color: #F00;font-weight: bold;float:left;'>证明人手机号码不能为空!</font>";
				$("#tieshi").html("<font style='color: #F00;font-weight: bold;float:left;'>还有必填信息为空，请填写!</font>");
				return false;
			}else{
				document.getElementById("proofPhoneSpan").innerHTML="";
				$("#tieshi").html("");
				return true;
			}
		}
	
		//证明人验证
		function checkProofPerson(){
			var proofPerson = $("#proofPerson").val();
			if(proofPerson == ""){
				document.getElementById("proofPersonSpan").innerHTML="<font style='color: #F00;font-weight: bold;float:left;'>证明人不能为空!</font>";
				$("#tieshi").html("<font style='color: #F00;font-weight: bold;float:left;'>还有必填信息为空，请填写!</font>");
				return false;
			}else{
				document.getElementById("proofPersonSpan").innerHTML="";
				$("#tieshi").html("");
				return true;
			}
		}
	
		//单位地址验证
		function checkNull(){
			var unitAdress = $("#unitAdress").val();
			if(unitAdress == ""){
				document.getElementById("unitAdressSpan").innerHTML="<font style='color: #F00;font-weight: bold;float:left;'>单位地址不能为空!</font>";
				$("#tieshi").html("<font style='color: #F00;font-weight: bold;float:left;'>还有必填信息为空，请填写!</font>");
				return false;
			}else{
				document.getElementById("unitAdressSpan").innerHTML="";
				$("#tieshi").html("");
				return true;
			}
		}
		//单位电话验证
		function checkUnitPhone(){
			var unitPhone  = $("#unitPhone").val();
			if(unitPhone == ""){
				document.getElementById("unitPhoneSpan").innerHTML="<font style='color: #F00;font-weight: bold;float:left;'>单位电话不能为空!</font>";
				$("#tieshi").html("<font style='color: #F00;font-weight: bold;float:left;'>还有必填信息为空，请填写!</font>");
				return false;
			}else{
				document.getElementById("unitPhoneSpan").innerHTML="";
				$("#tieshi").html("");
				return true;
			}
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
	    
	  	/*-------------------------------------------------基本信息验证结束---------------------------------------------*/
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
	    $('#tabchangeMobileTab').bind('click', function(){    
	      	if("${SecretSecurityResult.rows[0].secretSecurityId}" == ''){
	    		//notClonedialog("请先设置密保问题");
	    		alert("请先设置密保问题");
	    		window.location.href="${ctx}/member/memberDetail.htm?updateSecretSecurity=updateSecretSecurity";
	    	}else{
	    		//notClonedialog("请先回答安全问题");
	    		alert("请先回答安全问题");
	    		window.location.href="${ctx}/member/memberDetail.htm?updateSecretSecurity=updatePassword";
	    	}
	    }); 
	    
	    $('#tabbankCardTab').bind('click', function(){    
	    	if("${currentMember.memberRealName}" == ""){
	    		alert("请先完善个人信息!");
	    		window.location.href="${ctx}/member/memberDetail.htm";
	    	}else{
		      	if("${SecretSecurityResult.rows[0].secretSecurityId}" == ''){
		    		//notClonedialog("请先设置密保问题");
		    		alert("请先设置密保问题");
		    		window.location.href="${ctx}/member/memberDetail.htm?updateSecretSecurity=updateSecretSecurity";
		    	}else{
		    		//notClonedialog("请先回答安全问题");
		    		alert("请先回答安全问题");
		    		window.location.href="${ctx}/member/memberDetail.htm?updateSecretSecurity=cardTab";
		    	}
	    	}
	    }); 
	   //--------------------
        $('#tabchangeMobileTab2').bind('click', function(){    
	      	if("${SecretSecurityResult.rows[0].secretSecurityId}" == ''){
	    		//notClonedialog("请先设置密保问题");
	    		alert("请先设置密保问题");
	    		window.location.href="${ctx}/member/memberDetail.htm?updateSecretSecurity=updateSecretSecurity";
	    	}else{
	    		//notClonedialog("请先回答安全问题");
	    		alert("请先回答安全问题");
	    		window.location.href="${ctx}/member/memberDetail.htm?updateSecretSecurity=updatePassword2";
	    	}
	    }); 
	    ////======================
	    $('#updateSecretSecurityTab').bind('click', function(){    
	      	if("${SecretSecurityResult.rows[0].secretSecurityId}" == ''){
	    		//notClonedialog("请先设置密保问题");
	    		alert("请先设置密保问题");
	    		window.location.href="${ctx}/member/memberDetail.htm?updateSecretSecurity=updateSecretSecurity";
	    	}else{
	    		//notClonedialog("请先回答密保问题"); 
	    		alert("请先回答密保问题");
	    		window.location.href="${ctx}/member/memberDetail.htm?updateSecretSecurity=updatejiaoyi";
	    	}
	    }); 
	  	//通过设置这个隐藏文本的值来判断是保存按钮还是保存并提交审核按钮。进行相应的操作。
	    $('#postAuthBut').bind('click', function(){    
	    	$("#postAuth").val("postAuth");
	        }); 
	  	//通过判断是待审核或已审核，将表单改为只读状态。
		 if('${requestScope.infoAndWorAuthstr}' == 'infoAndWorRealOnly'){
			$("form[id='personalMessageForm'] input,textarea[id='personalDes']").prop("readonly", true);
			$("form[id='personalMessageForm'] select,button[id='onlyPost'],button[id='postAuthBut']").prop("disabled", true);
			$("button[id='onlyPost']").prop("disabled", true);
			
		} ;
      	$(function() {
			$(".alert").alert();
			//用jq将下列框的值初始化。
	 		$('#sex').val('${currentMember.sex}');
		    $('#maritalStatus').val('${currentMember.maritalStatus}');
	      	$('#educational').val('${currentMember.educational}');
	      	$('#firstContactRelation').val('${currentMember.firstContactRelation}');
	      	$('#secondContactRelation').val('${currentMember.secondContactRelation}');
			
	      	var perfectRegisterSuccess = '${perfectRegister.success}';
	      	var perfectRegisterMessage = '${perfectRegister.msg}';
	      	if(perfectRegisterSuccess){
	      		$('#success_alert').fadeIn();
				$('#success_alert h4').html(perfectRegisterMessage);
				setTimeout(function(){//延迟3秒隐藏
					$('#success_alert').fadeOut();
				},3000);
			};		
	      	
	      	$("#personalMessageForm").validate({
	    		rules:{
	    			memberRealName:"required",
	    			cardId:{
	    				required:true,
	    				isIdCardNo:true
	    			},
	    			mobileNumber:{
	    				required:true,
	    				isMobile:true
	    			}, 
	    			homePhone:"isPhone",
	    			memberAge:{
	    				min:18,
	    				max:100,
	    				digits:true 
	    			},
	    			firstContactPhone:"required",
	    			firstContactAddress:"required",
	    			firstContact:"required",
	    			firstContactRelation:"required",
	    			workAge:"number",
	    			salary:"number",
	    			proofPhone:"isMobile",
	    			unitName:{
	    				required:true,
	    				rangelength:[1,10]
	    			},
	    			unitPhone:"isPhone",
	    			firstContactPhone:"isMobile"
	    		},
	    		messages:{
	    			memberRealName:"真实姓名不能为空",
	    			cardId:{
	    				required:"身份证不能为空",
	    				
	    			},
	    			mobileNumber:{
	    				required:"手机号码不能为空",	
	    			}, 
	    			memberAge:{
	    				min:" 年龄不能低于18岁",
	    				max:"年龄不能大于100岁",
	    				digits:"请输入整数"
	    			},
	    			firstContactPhone:"请填写正确的号码",
	    			firstContactAddress:"请填写联系人地址",
	    			firstContact:"请填写联系人名称",
	    			firstContactRelation:"请填写与联系人的关系",
	    			workAge:"只能为数字",
	    			salary:"只能为数字",
	    			unitName:{
	    				required:"单位名称不能为空",
	    				rangelength:"单位名称长度为1-10个字符"
	    			}
	    		},errorPlacement: function(error, element) {     
	    			if (element.attr("name") == "mobileNumber" )  
	    		        error.insertAfter(element.next()); 
	    			else
	    				error.insertAfter(element); 
	    		  },
	    		submitHandler:function(){ 
	    			$.ajax({
	    				   type: "POST",
	    				   url: ctx+"/perfectRegister.htm",
	    				   dataType: "json",
	    				   data: $("#personalMessageForm").serialize(),
		    			   success: function(r) { 
		   					$("#onlyPost").attr('disabled',"true");
	    						successdialog(r);
	    						 if(r.obj == 'infoAndWorRealOnly'){
	    								$("form[id='personalMessageForm'] input,textarea[id='personalDes']").prop("readonly", true);
	    								$("form[id='personalMessageForm'] select,button[id='onlyPost'],button[id='postAuthBut']").prop("disabled", true);
	    							}
		                    },
		                    error: function() {
		                        alert("提交出错！");
		                    }
	    				});
	    			
	    			
	    		} 
	    	});
	      	$("#bankCardForm").validate({
	    		rules:{
	    			openingBank:"required",
	    			subbranch:"required",
	    			cardNumber:{
	    				required:true,
	    				digits:true,
	    				isBankCardNum:true
	    			},
	    			cardName:"required"
	    		},
	    		messages:{
	    			openingBank:"开户行不能为空",
	    			subbranch:"支行不能为空",
	    			cardNumber:{
	    				required:"卡号不能为空",
	    				digits:"卡号必须为数字",
	    			},
	    			cardName:"银行卡名称不能为空"
	    		},
	    		submitHandler:function(){
	    			$.ajax({
	    				   type: "POST",
	    				   url: ctx+"/bankCard/addBankCard.htm",
	    				   dataType: "json",
	    				   data: $("#bankCardForm").serialize(),
		    			   success: function(r) {
		    				   successAddBankCard(r); 
		                    },
		                    error: function() {
		                        alert("提交出错！");
		                    }
	    				});
	    		} 
	    	});
	      	//////////////////////-----------------
	      	$("#updatePhoneForm").validate({
	      	    rules:{
	      	     	mobileNumber:{
    				    required:true,
    				    isMobile:true
    			     } 
	      	    },
	      	    messages:{ 
	      	    	mobileNumber:{
		    				required:"手机号码不能为空",
		    				rangelength:"密码长度必须为为11位"
		    			}
	      	    }
	      	});
	      	
	      	$("#updatememberPasswordForm").validate({
	      		rules:{
	    			oldPassword:{
	    				required:true,
	    				rangelength:[6,12]
	    			},
	    			memberPassword:{
	    				required:true,
	    				rangelength:[6,12]
	    			},
	    			comfirPassword:{
	    				required:true,
	    				rangelength:[6,12],
	    				equalTo:"#memberPassword_form-group"
	    			}
	    		},
	    		messages:{
	    			oldPassword:{
	    				required:"原密码不能为空",
	    				rangelength:"密码长度必须为为6-12位"
	    			},
	    			memberPassword:{
	    				required:"新密码不能为空",	
	    				rangelength:"密码长度必须为为6-12位"
	    			},
	    			comfirPassword:{
	    				required:"确认密码不能为空",
	    				rangelength:"密码长度必须为为6-12位",
	    				equalTo:"确认密码必须和新密码一致"
	    			}
	    		},
	    		submitHandler:function(){
	    			 $.ajax({
	    				   type: "POST",
	    				   url: ctx+"/member/updatememberPassword.htm",
	    				   dataType: "json",
	    				   data: $("#updatememberPasswordForm").serialize(),
		    			   success: function(r) {
		    				    
	    						if(r.success){
	    							$('#success_alert').fadeIn();
		    						$('#success_alert h4').html(r.msg);
		    						setTimeout(function(){//延迟3秒隐藏
		    							$('#success_alert').fadeOut();
		    						},3000)
		    						
		    						$("#oldPassword_form-group").val("");
		    						$("#memberPassword_form-group").val("");
		    						$("#comfirPassword_form-group").val("");
	    						}else{
	    							$('#danger_alert').fadeIn();
		    						$('#danger_alert h4').html(r.msg);
		    						setTimeout(function(){//延迟3秒隐藏
		    							$('#danger_alert').fadeOut();
		    						},3000)
	    						}
	    						
		                    },
		                    error: function() {
		                        alert("提交出错！");
		                    }
	    				}); 
	    		} 
	      	});
      	});  
      	
	        	
      	//修改交易密码
      	$("#updatememberPasswordForm2").validate({
	      		rules:{
	    			oldPassword:{
	    				required:true,
	    				rangelength:[6,12]
	    			},
	    			memberPassword:{
	    				required:true,
	    				rangelength:[6,12]
	    			},
	    			comfirPassword:{
	    				required:true,
	    				rangelength:[6,12],
	    				equalTo:"#memberPassword_form-group2"
	    			}
	    		},
	    		messages:{
	    			oldPassword:{
	    				required:"原密码不能为空",
	    				rangelength:"密码长度必须为为6-12位"
	    			},
	    			memberPassword:{
	    				required:"新密码不能为空",	
	    				rangelength:"密码长度必须为为6-12位"
	    			},
	    			comfirPassword:{
	    				required:"确认密码不能为空",
	    				rangelength:"密码长度必须为为6-12位",
	    				equalTo:"确认密码必须和新密码一致"
	    			}
	    		},
	    		submitHandler:function(){
	    			 $.ajax({
	    				   type: "POST",
	    				   url: ctx+"/member/updatebusinessPassword.htm",
	    				   dataType: "json",
	    				   data: $("#updatememberPasswordForm2").serialize(),
		    			   success: function(r) { 
	    						if(r.success){
	    							$('#success_alert').fadeIn();
		    						$('#success_alert h4').html(r.msg);
		    						setTimeout(function(){//延迟3秒隐藏
		    							$('#success_alert').fadeOut();
		    						},3000)
		    						
		    						$("#oldPassword_form-group2").val("");
		    						$("#memberPassword_form-group2").val("");
		    						$("#comfirPassword_form-group2").val("");
	    						}else{
	    							$('#danger_alert').fadeIn();
		    						$('#danger_alert h4').html(r.msg);
		    						setTimeout(function(){//延迟3秒隐藏
		    							$('#danger_alert').fadeOut();
		    						},3000);
	    						} 
		                    },
		                    error: function() {
		                        alert("提交出错！");
		                    }
	    				}); 
	    		} 
	      	}); 
      	$("#updateSecretSecurityForm").validate({
    		rules:{
    			answers1:"required",
    			answers2:"required",
    			answers3:"required",
    			questions1:{
    				//min:1
    			},
    			questions2:{
    				//min:1
    			},
    			questions3:{
    				//min:1
    			} 
    		},
    		messages:{
    			answers1:"问题答案一不能为空",
    			answers2:"问题答案二不能为空",
    			answers3:"问题答案三不能为空",
    			questions1:{
    				required:'问题一必选'
    			},
    			questions2:{
    				required:'问题二必选'
    			},
    			questions3:{
    				required:'问题三必选'
    			} 
    		},
    		submitHandler:function(){
    			var flag = true;
    			if($("#questions1").val() == $("#questions2").val() || $("#questions1").val() == $("#questions3").val() ||$("#questions2").val() == $("#questions3").val() ){
    				notClonedialog("所选问题不能重复");
    				flag = false;
    			}
    			if(flag){
       			 $.ajax({
  				   type: "POST",
  				   url: ctx+"/secretSecurity/addSecretSecurity.json",
  				   dataType: "json",
  				   data: $("#updateSecretSecurityForm").serialize(),
	    			   success: function(r) {
	    				   addSecretSecuritydialog(r);
	                    },
	                    error: function() {
	                        alert("提交出错！");
	                    }
  				}); 
    			}
    		} 
    	});
      	$("#answerSecretSecurityForm").validate({
    		rules:{
    			answers1:"required",
    			answers2:"required",
    			answers3:"required",
    		},
    		messages:{
    			answers1:"问题答案一不能为空",
    			answers2:"问题答案二不能为空",
    			answers3:"问题答案三不能为空",
    		},
    		submitHandler:function(){
    			$("#diverrorAnswer").hide();
       			 $.ajax({
  				   type: "POST",
  				   url: ctx+"/secretSecurity/compareSecretSecurity.json",
  				   dataType: "json",
  				   data: $("#answerSecretSecurityForm").serialize(),
	    			   success: function(r) {
	    				   if(r.success){
	    					   if("${updateSecretSecurity}" == 'updatePassword'){
	    						   $("#tabchangeMobileLi").attr("class","active");
	    						   $("#tabchangeMobileLi2").attr("class",""); 
		    					   $("#tabUpdatePassword").attr("class","tab-pane fade in active");
	    						   $("#updateSecretSecurityLi").attr("class","");
	    						   $("#updateSecretSecurity").attr("class","tab-pane fade");
	    						   $("#tabUpdatePassword2").attr("class","tab-pane fade");
	    					   }else if("${updateSecretSecurity}" == 'updatePassword2'){
	    						   $("#tabchangeMobileLi2").attr("class","active"); 
	    						   $("#tabchangeMobileLi").attr("class","");
	    						   $("#tabUpdatePassword").attr("class","tab-pane fade ");
	    						   $("#tabUpdatePassword2").attr("class","tab-pane fade in active");
	    						   $("#updateSecretSecurityLi").attr("class","");
	    						   $("#updateSecretSecurity").attr("class","tab-pane fade");
	    					   }else if("${updateSecretSecurity}" == 'cardTab'){//银行卡设置
	    						   $("#tabchangeMobileLi2").attr("class",""); 
	    						   $("#tabchangeMobileLi").attr("class","");
	    						   $("#tabUpdatePassword").attr("class","tab-pane fade ");
	    						   $("#tabbankCard").attr("class","tab-pane fade in active");//设置隐藏的面板
	    						   $("#updateSecretSecurityLi").attr("class","");
	    						   $("#updateSecretSecurity").attr("class","tab-pane fade");
	    						   $("#tabbankCardTabs").attr("class","active");//设置显示标题
	    					   }else if("${updateSecretSecurity}" == 'updatejiaoyi'){
	    						   $("#tabchangeMobileLi2").attr("class",""); 
	    						   $("#tabchangeMobileLi").attr("class","");
	    						   $("#tabUpdatePassword").attr("class","tab-pane fade ");
	    						   $("#updateSecretSecurity").attr("class","tab-pane fade in active");//设置隐藏的面板
	    						   //$("#updateSecretSecurityLi").attr("class","active");
	    						   $("#updateSecretSecurityLi").attr("class","tab-pane fade in active");
	    						   
	    					   }else{
	    						   window.location.href="${ctx}/member/memberDetail.htm?updateSecretSecurity=updateSecretSecurity";
	    					   }
	    				   }else{
	    					   var msgs = r.obj;
	    					   var msg = '';
	    					   for(var i =0;i<msgs.length;i++){
	    							msg +=msgs[i]+"\n";
	    						}
	    					   $("#errorAnswer").html(msg);
	    					   $("#diverrorAnswer").show();
	    				   }
	                    },
	                    error: function() {
	                        alert("提交出错！");
	                    }
  				}); 
    		} 
    	});
      	function successdialog(data){
      	var boo=$("#postAuthBut").attr("disabled");
      	if(boo==true){
      		 $("#onlyPost").attr("disabled",true);
      	}else{
      		 $("#onlyPost").removeAttr("disabled");
      	}
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
					        }
						});
			});
		}
			function successAddBankCard(data){
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
						                		window.location.href="${ctx}/member/memberDetail.htm?addBankCard=addBankCard";
						                	}else{
						                		//$("form[id='bankCardForm'] input").val("");	
						                	}
						                }
						        }
							});
				});
			}
      	function addSecretSecuritydialog(data){
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
					                		window.location.href="${ctx}/member/memberDetail.htm";
					                }
					        }
						});
			});
		}
      	function comfireDeletedialog(url){
			KindEditor.ready(function(K) {
			var dialog = K.dialog({
					        width : 300,
					        title : '删除提示',
					        body : '<div style="margin:10px;"><strong>确定删除？</strong></div>',
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
      	function notClonedialog(msg){
			KindEditor.ready(function(K) {
			var dialog = K.dialog({
					        width : 300,
					        title : '提示信息',
					        body : '<div style="margin:10px;"><strong>'+msg+'</strong></div>',
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
      	function notClonedialog(data){
			KindEditor.ready(function(K) {
			var dialog = K.dialog({
					        width : 300,
					        title : '提示信息',
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
					        }
						});
			});
		}
		</script>
		
		 <div id="success_alert" style="width:100%;position: absolute;top:0px;z-index:5000;display: none;"> 
	      <div class="alert alert-success fade in">
	        <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
	        <h4 style="text-align:center;"></h4>
	      </div> 
	    </div>
	    <div id="danger_alert" style="width:100%;position: absolute;top:0px;z-index:5000;display: none;"> 
	      <div class="alert alert-danger fade in">
	        <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
	        <h4 style="text-align:center;"></h4>
	      </div> 
	    </div>
  </body>
</html>
