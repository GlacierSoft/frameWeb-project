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
							  <a 	 href="#" onclick="doClick('borrowingLoan/memberBorrow.htm?&p=1&loanState=repaymenting','${currentMember.memberId}');" class="btn btn-default" role="button">还款管理</a>
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
					      	  <a href="#" onclick="doClick('investment/memberTenderNotes.htm?&p=1&loanStates=sucessBorrow','${currentMember.memberId}')" class="btn btn-default" role="button">我的投标</a>
						      <a href="#" onclick="doClick('attentionBorrowing/memberAttentionBorrowing.htm?&p=1','${currentMember.memberId}')" class="btn btn-default" role="button">我关注的借款</a>
			 	              <a href="#" onclick="doClick('bankingStatistics/memberBankingStatistics.htm','${currentMember.memberId}')" class="btn btn-info" role="button">投资统计</a>
					      </div>
					    </div>
					  </div>
					</div>
				</div>
	    	</div>
	    	<div class="col-md-10">
	    		<div class="panel panel-default">
				  <div class="panel-heading">
				    <h3 class="panel-title">投资统计</h3>
				  </div>
				  <div class="panel-body">
					  <div id="attentionBorrowingList">
					  <table id="attentionBorrowingTable" class="table table-bordered" style="text-align:center;vertical-align: middle;">
				  		<thead>
				  			<tr>
				              <td colspan="4">回报统计</td>
				            </tr>
				  		</thead>
				         	<tbody>
								<tr>
									<td>累计亏盈</td>
				              		<td>投标奖励</td>
				              		<td>成功投标次数</td>
				              		<td>线下冲值奖励</td>
								</tr>
								<tr>
									<td>￥<fmt:formatNumber value='${memberStatisticsDate.cumulativeLossProfit}' pattern='#,#00.00'/></td>
				              		<td>￥<fmt:formatNumber value='${memberStatisticsDate.tenderAwards}' pattern='#,#00.00'/></td>
				              		<td>${memberStatisticsDate.successTender}</td>
				              		<td>￥<fmt:formatNumber value='${memberStatisticsDate.uplineDeltaAwards}' pattern='#,#00.00'/></td>
								</tr>
				            </tbody>
				        </table>
						 <table id="attentionBorrowingTable" class="table table-bordered" style="text-align:center;vertical-align: middle;">
				  		<thead>
				  			<tr>
				              <td colspan="7">个人理财统计</td>
				            </tr>
				  		</thead>
				         	<tbody>
								<tr>
									<td>投资总额</td>
									<td>已收总额</td>
									<td>待收总额</td>
									<td>已收本金</td>
									<td>待收本金</td>
									<td>已收利息</td>
									<td>待收利息</td>
								</tr>
								<tr>
									<td>￥<fmt:formatNumber value='${memberStatisticsDate.investmentTotal}' pattern='#,#00.00'/></td>
									<td>￥<fmt:formatNumber value='${memberStatisticsDate.alreadyIncomeTotal}' pattern='#,#00.00'/></td>
									<td>￥<fmt:formatNumber value='${memberStatisticsDate.waitIncomeTotal}' pattern='#,#00.00'/></td>
									<td>￥<fmt:formatNumber value='${memberStatisticsDate.alreadyIncomePrincipal}' pattern='#,#00.00'/></td>
									<td>￥<fmt:formatNumber value='${memberStatisticsDate.waitIncomePrincipal}' pattern='#,#00.00'/></td>
									<td>￥<fmt:formatNumber value='${memberStatisticsDate.alreadyIncomeInterest}' pattern='#,#00.00'/></td>
									<td>￥<fmt:formatNumber value='${memberStatisticsDate.waitIncomeInterest}' pattern='#,#00.00'/></td>
								</tr>
				            </tbody>
				        </table>  
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