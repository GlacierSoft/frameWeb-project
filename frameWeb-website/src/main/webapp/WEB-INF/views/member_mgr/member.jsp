<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%><!-- 引入jstl解析标签 -->
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %><!-- 引入自定义权限标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<%    
String path = request.getContextPath();    
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";    
%>
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
					          <a href="${ctx}/member/index.htm" class="btn btn-info" role="button">我的主页</a>
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
					    <div id="collapseThree" class="panel-collapse collapse">
					      <div class="panel-body">
					      	<div class="btn-group-vertical">
					      	  <a href="#" onclick="doClick('investment/memberTenderNotes.htm?&p=1&loanStates=sucessBorrow','${currentMember.memberId}')" class="btn btn-default" role="button">我的投标</a>
					      	  <a href="#" onclick="doClick('attentionBorrowing/memberAttentionBorrowing.htm?p=1','${currentMember.memberId}')" class="btn btn-default" role="button">我关注的借款</a>
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
				    <h3 class="panel-title">我的个人信息</h3>
				  </div>
				  <div class="panel-body"><!-- style="text-align:center;vertical-align: middle;" -->
				     <table class="table" >
			            <tr><!-- style="width:100px;heigth:100px" -->
			              <td rowspan="5" >
			              <div style=" text-align:center;vertical-align: middle;">
			              <img src="${currentMember.memberPhoto}" style="width: 120px;height: 120px ;"/>
			              <a href="${ctx}/member/memberPhotoInto.htm" role="button"><p style="padding:10px;">更换头像</p></a>
			              </div>
			              </td>
			              <td>用户名：</td>
			              <td>${currentMember.memberName}</td>
			              <td>信用积分</td>
			              <td><img id="creditPhotoDivImg"  src="${requestScope.totalCreditPhoto}" style="width: 34px;height: 24px ;" /></td>
			            </tr>
			            <tr>
			              <td>注册时间：</td>
			              <td><fmt:formatDate value="${currentMember.registrationTime}" type="both"/></td>
			              <td>会员到期：</td>
			              <td><fmt:formatDate value="${currentMember.expireTime}" type="both"/></td>
			            </tr>
			            <tr>
			              <td>会员积分：</td>
			              <td><fmt:formatNumber value='${currentMember.integral}' pattern='#,#00'/></td>
			              <td>最后登录ip：</td>
			              <td>${currentMember.lastLoginIpAddress}</td>
			            </tr>
			            <tr>
			              <td>信用额度：</td>
			              <td>￥<fmt:formatNumber value='${currentMember.creditamount}' pattern='#,#00.00'/></td>
			              <td>账户可用余额：</td>
			              <td>￥<fmt:formatNumber value='${financeMemberData.usableMoney}' pattern='#,#00.00'/></td>
			            </tr>
			             <tr>
			              <td>个人统计:</td>
			              <td>${borrowingLoanNum}条借款记录，${tenderNotesNum}条投标记录</td>
			              <td></td>
			              <td></td>
			            </tr>
			        </table>
			        <div style="border: 1px solid #DDDDDD;">
			        <div class="row" style="padding:10px;">
					  <div class="col-md-2 text-right"><img alt="" src="${ctx}/resources/images/member/wenxintisi.jpg"><span class="text-danger"><strong>温馨提示：</strong></span></div>
					  <div class="col-md-2"><span>未读站内信<a  href="#" onclick="doClick('messageNotice/intoMessageNotice.htm?&p=1','${currentMember.memberId}')" class="navbar-link"><span class="badge">${messageNoticCount}</span></a>封</span></div>
					 
					 </div>
					<div class="row" style="padding:10px;">
					  <div class="col-md-2 text-right"></div>
					  <div class="col-md-2"><span>等待初审借款<a  href="#" onclick="doClick('borrowingLoan/memberBorrow.htm?&p=1&loanState=firstAudit','${currentMember.memberId}')" class="navbar-link"><span class="badge">${borrowingLoanNumFirstAudit}</span></a>个</span></div>
					  
					  
					  <%-- <div class="col-md-2"><span>等待复审借款<a href="#" class="navbar-link"><span class="badge">${borrowingLoanNumSecondAuditor}</span></a>个</span></div> --%>
					  <div class="col-md-2"><span>招标中的借款<a href="#" onclick="doClick('borrowingLoan/memberBorrow.htm?&p=1&loanState=tendering','${currentMember.memberId}')" class="navbar-link"><span class="badge">${borrowingLoanNumTendering}</span></a>个</span></div>
					   
					   
					  <div class="col-md-3"><span>正在还款的借款<a href="#" onclick="doClick('borrowingLoan/memberBorrow.htm?&p=1&loanState=repaymenting','${currentMember.memberId}')" class="navbar-link"><span class="badge">${borrowingLoanNumRepaymenting}</span></a>个</span></div>
					  <div class="col-md-2" style="padding-left: 0px;"><span>已还完的借款<a href="#" onclick="doClick('borrowingLoan/memberBorrow.htm?&p=1&loanState=completed','${currentMember.memberId}')" class="navbar-link"><span class="badge">${borrowingLoanNumCompleted}</span></a>个</span></div>
					                            
					</div>
					<div class="row" style="padding:10px;">
					  <div class="col-md-2 text-right"></div>
					  <div class="col-md-2"><span>未申请认证<a href="#" onclick="doClick('member/memberAuth.htm?&p=0','${currentMember.memberId}')" class="navbar-link"><span class="badge">${authNumNoapply}</span></a>个</span></div>
					   
					  
					  <div class="col-md-2"><span>审核中认证<a href="#" onclick="doClick('member/memberAuth.htm?&p=0','${currentMember.memberId}')" class="navbar-link"><span class="badge">${authNumAuthstr}</span></a>个</span></div>
					
					  <div class="col-md-3"><span>通过审核认证<a href="#" onclick="doClick('member/memberAuth.htm?&p=0','${currentMember.memberId}')" class="navbar-link"><span class="badge">${authNumPass}</span></a>个</span></div>
					
					  <div class="col-md-2" style="padding-left: 0px;"><span>审核失败认证<a href="#" onclick="doClick('member/memberAuth.htm?&p=0','${currentMember.memberId}')" class="navbar-link"><span class="badge">${authNumFailure}</span></a>个</span></div>
				
					</div>
			        </div>
			        <div style="margin:40px;text-align:center;vertical-align: middle;">
			        <table style="width:800px;padding: 10px;">
			        	<tr style="padding: 10px;">
			        		<td><img alt="" src="${ctx}/resources/images/member/chongzhi.jpg"></td>
			        		<td><img alt="" src="${ctx}/resources/images/member/daichu.jpg"></td>
			        		<td><img alt="" src="${ctx}/resources/images/member/zhaiquanzhuanrang.jpg"></td>
			        		<td><img alt="" src="${ctx}/resources/images/member/huankuan.jpg"></td>
			        		<td><img alt="" src="${ctx}/resources/images/member/daishoukuan.jpg"></td>
			        		<td><img alt="" src="${ctx}/resources/images/member/zijinliushui.jpg"></td>
			        		<td><img alt="" src="${ctx}/resources/images/member/jiekuan.jpg"></td>
			        	</tr>
			        	<tr style="height:40px;margin: 10px;">
			        		<td><a href="javascript:checkRechargeWithdraw('${currentMember.memberId}','${ctx}/financeMember/rechargeWithdraw.htm?p=1');" class="navbar-link"><span>我要充值</span></a></td>
			        		<td><a href="${ctx}/investment/index.htm?&p=1" class="navbar-link"><span>我要贷出</span></a></td>
			        		<td><a href="#" onclick="doClick('bankingStatistics/memberBankingStatistics.htm','${currentMember.memberId}')"  class="navbar-link"><span>投资统计</span></a></td>
			        		<td><a href="#" onclick="doClick('borrowingLoan/memberBorrow.htm?&p=1&loanState=repaymenting','${currentMember.memberId}')"  class="navbar-link"><span>我要还款</span></a></td>
			        		<td><a href="#" onclick="doClick('receivablesNotes/memberReceivablesNotes.htm?&p=1&loanStates=repaymentingBorrow','${currentMember.memberId}')"  class="navbar-link"><span>待收款</span></a></td>
			        		<td><a href="#" onclick="checkRechargeWithdraw('${currentMember.memberId}','${ctx}/financeMember/rechargeWithdraw.htm?p=1');"  class="navbar-link"><span>资金流水</span></a></td>
			        		<td><a href="${ctx}/borrow.htm" class="navbar-link"><span>我要借款</span></a></td>
			        	</tr>
			        </table>
			        </div>
			        <blockquote>
					       	<h5 class="text-danger"><strong>账户详情：</strong></h5>
					</blockquote>
					<table class="table table-bordered" style="padding: 10px;">
						<tr>
			        		<td colspan="3"><span><strong>账户总汇：</strong></span></td>
			        	</tr>
			        	<tr >
			        		<td><span>账户总额：￥<fmt:formatNumber value='${financeMemberData.amount}' pattern='#,#00.00'/></span></td>
			        		<td><span>可用余额：￥<fmt:formatNumber value='${financeMemberData.usableMoney}' pattern='#,#00.00'/></span></td>
			        		<td><span>冻结金额：￥<fmt:formatNumber value='${financeMemberData.frozenMoney}' pattern='#,#00.00'/></span></td>
			        	</tr>
			        	<tr>
			        		<td><span>投标奖励：￥<fmt:formatNumber value='${memberStatisticsData.tenderAwards}' pattern='#,#00.00'/></span></td>
			        		<td><span>线下冲值奖励：￥<fmt:formatNumber value='${memberStatisticsData.uplineDeltaAwards}' pattern='#,#00.00'/></span></td>
			        		<td><span>续投奖励：￥<fmt:formatNumber value='${memberStatisticsData.continueAwards}' pattern='#,#00.00'/></span></td>
			        	</tr>
			        	<tr>
			        		<td colspan="3"><span><strong>投资总汇：</strong></span></td>
			        	</tr>
			        	<tr >
			        		<td><span>已收总额：￥<fmt:formatNumber value='${memberStatisticsData.alreadyIncomeTotal}' pattern='#,#00.00'/></span></td>
			        		<td><span>已收本金：￥<fmt:formatNumber value='${memberStatisticsData.alreadyIncomePrincipal}' pattern='#,#00.00'/></span></td>
			        		<td><span>已收利息：￥<fmt:formatNumber value='${memberStatisticsData.alreadyIncomeInterest}' pattern='#,#00.00'/></span></td>
			        	</tr>
			        	<tr>
			        		<td><span>待收总额：￥<fmt:formatNumber value='${memberStatisticsData.waitIncomeTotal}' pattern='#,#00.00'/></span></td>
			        		<td><span>待收本金：￥<fmt:formatNumber value='${memberStatisticsData.waitIncomePrincipal}' pattern='#,#00.00'/></span></td>
			        		<td><span>待收利息：￥<fmt:formatNumber value='${memberStatisticsData.waitIncomeInterest}' pattern='#,#00.00'/></span></td>
			        	</tr>
			        	<tr>
			        		<td colspan="3"><span><strong>借款总汇：</strong></span></td>
			        	</tr>
			        	<tr >
			        		<td><span>已还总额：￥<fmt:formatNumber value='${memberStatisticsData.alreadyTotal}' pattern='#,#00.00'/></span></td>
			        		<td><span>已还本金：￥<fmt:formatNumber value='${memberStatisticsData.alreadyPrincipal}' pattern='#,#00.00'/></span></td>
			        		<td><span>已还利息：￥<fmt:formatNumber value='${memberStatisticsData.alreadyInterest}' pattern='#,#00.00'/></span></td>
			        	</tr>
			        	<tr>
			        		<td><span>待还总额：￥<fmt:formatNumber value='${memberStatisticsData.waitAlsoTotal}' pattern='#,#00.00'/></span></td>
			        		<td><span>待还本金：￥<fmt:formatNumber value='${memberStatisticsData.waitAlsoPrincipal}' pattern='#,#00.00'/></span></td>
			        		<td><span>待还利息：￥<fmt:formatNumber value='${memberStatisticsData.waitAlsoInterest}' pattern='#,#00.00'/></span></td>
			        	</tr>
			        	<tr>
			        		<td colspan="3"><span><strong>额度总汇：</strong></span></td>
			        	</tr>
			        	<tr >
			        		<td><span>借款总额度：￥<fmt:formatNumber value='${memberStatisticsData.totalBorrowings}' pattern='#,#00.00'/></span></td>
			        		<td><span>可用信用额度：￥<fmt:formatNumber value='${currentMember.creditamount}' pattern='#,#00.00'/></span></td>
			        		<td><span></span></td>
			        	</tr>
			        </table>
				  </div>
				</div>
	    	</div>
	    </div>
	    <hr class="featurette-divider2">
	   
	    </div>
	     <jsp:include page="../foot.jsp"/>
	    <!-- CONTAINER START======================== -->
	    <!-- 测试提交======================== -->
	    <script>
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
		 }; 
	    </script>
</body>
</html>