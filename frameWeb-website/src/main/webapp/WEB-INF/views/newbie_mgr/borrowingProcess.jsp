<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%><!-- 引入jstl解析标签 -->
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %><!-- 引入自定义权限标签 -->
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
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
  <jsp:include page="../nav_mgr/navNewbie.jsp"/>
       
	    <div class="container">
	  	<div class="row">
		    <div class="col-md-2">
			    <div class="panel-group" id="accordion">
			    	<div class="panel panel-default">
				  		<div class="bs-example">
					      <ul class="nav nav-pills nav-stacked" style="max-width: 300px;">
					        <li class="active"><a href="${ctx}/borrowingProcess.htm">借款流程</a></li>
					        <li><a href="${ctx}/investmentProcess.htm">投资流程</a></li>
					        <li><a href="${ctx}/riskGuarantee.htm">风险保障</a></li>
					      </ul>
				  		</div>
					</div>
				  	<div class="panel panel-default">
						<img src="${pageContext.request.contextPath}/resources/images/newbie/about001.jpg" alt="联系我们">
					</div>
					<div class="panel panel-default">
						<img src="${pageContext.request.contextPath}/resources/images/index/weixin.jpg" width="163" height="163" alt="联系我们">
						<p>扫描二维码关注冰川贷微信，获取冰川贷最新动态 </p>
					</div>
			  	</div>
	  		</div>
	    	<div class="col-md-10">
	    		<div class="panel panel-default">
				  <div class="panel-heading">
				    <h3 class="panel-title">新手引导/ 借款流程</h3>
				  </div>
				  <div class="panel-body">
			          
			          <div  class="xs_guide_content">
				         <div style="width:886px; height:111px; text-align:right;"><img src="${pageContext.request.contextPath}/resources/images/newbie/borrowing_title001.png" /></div>
				         <div style="width:886px; font-size:14px; line-height:24px; color:#666666;">
				           <span style="font-size:24px; color:#10abe1;">冰川贷</span>作为山西省首家P2P网络借贷平台，为有资金需求和理财需求的用户提供了一个快速、高效、公平、透明的网络借贷信息服务平台。用户可以在冰川贷上发布借款请求；也可以把自己的闲余资金通过冰川贷出借给信用良好有资金需求的用户，在获得良好的资金回报率的同时帮助了他人。专业担保公司对于投资者本金全程担保，大大降低投资者的借出风险。
				         </div>
				         <div><img src="${pageContext.request.contextPath}/resources/images/newbie/borrowing001.png"/></div>
				         <div style="width:886px; height:111px; text-align:right; clear:both"><img src="${pageContext.request.contextPath}/resources/images/newbie/borrowing_title002.png" /></div>
				         <div style="width:886px; height:60px; text-align:center; font-size:22px; color:#6d6e71; clear:both">简单3步，开始借款</div>
				         <div style="width:886px; margin:0 auto; clear:both;font-size:16px;">
				           <div style="width:165px; height:200px; text-align:center; float:left; margin-left:30px;"><a href="${ctx}/intoregister.htm"><img src="${pageContext.request.contextPath}/resources/images/newbie/borrowing002.png"><br><br>第一步 填写注册资料 </div>
				           <div style="width:165px; height:200px; text-align:center; float:left; margin-left:160px;"><a href="${ctx}/member/memberAuth.htm?&p=0"><img src="${pageContext.request.contextPath}/resources/images/newbie/borrowing003.png"><br><br>第二步 各项认证 </div>
				           <div style="width:165px; height:200px; text-align:center; float:left;  margin-left:150px;"><a href="${ctx}/borrow.htm"><img src="${pageContext.request.contextPath}/resources/images/newbie/borrowing004.png"><br><br>第三步 发布借款 </div>
				         </div>
				         <div style="width:886px; height:100px; line-height:100px; text-align:center; clear:both; padding-top:20px;"><a href="${ctx}/intoregister.htm"><img src="${pageContext.request.contextPath}/resources/images/newbie/borrowing009.png" /></a></div>
				         <div style="width:886px; height:111px; text-align:right; clear:both"><img src="${pageContext.request.contextPath}/resources/images/newbie/borrowing_title003.png" /></div>
				         
				         <div style="width:886px; height:194px; text-align:left; clear:both">
				           <div style="width:225px; text-align:center; float:left;"><a href="${ctx}/borrowingLoan/borrowLiuZhuan.htm"><img src="${pageContext.request.contextPath}/resources/images/newbie/borrowing005.png"></a></div>
				           <div style="width:660px; text-align:left; float:left; color:#58595b; line-height:30px;">
				            <div style="width:660px;clear:both; font-size:24px;"><a href="${ctx}/borrowingLoan/borrowLiuZhuan.htm">流转标</a></div>
				            <span style="clear:both; font-size:14px; color:#6d6e71;">
				债权人将手中的债权拆分成小额等份的债权转让给众多投资者,并且承诺到期进行还款的一种理财标种，称为流转标。投资者对于流转标的购买份额最小为100元/份，流转期限由借款人确定,流转的周期不同，回报收益不同；通常流转期限越长，回报收益则越高。
				            </span>
				            </div>
				         </div>
				         
				         <div style="width:886px; height:194px; text-align:left; clear:both; padding-left:60px;">            
				            <div style="width:600px; text-align:left; float:left; color:#58595b; line-height:30px;">
				            <div style="width:600px;clear:both; font-size:24px;"><a href="${ctx}/borrowingLoan/borrowDiYa.htm">抵押标</a></div>
				            <span style="clear:both; font-size:14px; color:#6d6e71;">
				抵质押借款标显示"抵"字标记，是冰川贷经过线下严格核查借款人资产负债、抵押担保（房产、土地抵押等）、优质资产和股权等有价证券质押担保手续，然后通过平台发布借款需求，冰川贷对借贷方提供连带担保责任的业务品种，确保风险控制在最低水平。
				            </span>
				            </div>
				            <div style="width:225px; text-align:center; float:left;"><a href="${ctx}/borrowingLoan/borrowDiYa.htm"><img src="${pageContext.request.contextPath}/resources/images/newbie/borrowing006.png"></a></div>
				         </div>
				         
				         <div style="width:886px; height:194px; text-align:left; clear:both">
				           <div style="width:225px; text-align:center; float:left;"><a href="${ctx}/borrowingLoan/borrowXinYong.htm"><img src="${pageContext.request.contextPath}/resources/images/newbie/borrowing007.png"></a></div>
				            <div style="width:660px; text-align:left; float:left; color:#58595b; line-height:30px;">
				            <div style="width:660px;clear:both; font-size:24px;"><a href="${ctx}/borrowingLoan/borrowXinYong.htm">信用标</a></div>
				            <span style="clear:both; font-size:14px; color:#6d6e71;">
				信用借款标显示"信"字标记，是一种免抵押、免担保、纯信用，最高授信为10万元的小额个人信用借款标,主要面向公务员、医生或教师等机关企事业单位的在编人员。如借款人到期还款出现困难，逾期第30~33天由网站风险金补偿，债权转让为冰川贷网站所有。
				            </span>
				            </div>
				         </div>
				         
				         <div style="width:886px; height:194px; text-align:left; clear:both; padding-left:60px;">            
				            <div style="width:600px; text-align:left; float:left; color:#58595b; line-height:30px;">
				            <div style="width:600px;clear:both; font-size:24px;"><a href="${ctx}/borrowingLoan/borrowJingZhi.htm">净值标</a></div>
				            <span style="clear:both; font-size:14px; color:#6d6e71;">
				净值借款标显示"净"字标记，允许发布的最大金额为净资产，净资产小于200000元不能发标。发布净值借款标用于临时周转，可以循环借款，但用户提现将受到限制。他是一种相对安全系数很高的借款标，因此利率方面可能比较低，用户可以借助此标放大自己的资金杠杆。
				            </span>
				            </div>
				            <div style="width:225px; text-align:center; float:left;"><a href="${ctx}/borrowingLoan/borrowJingZhi.htm"><img src="${pageContext.request.contextPath}/resources/images/newbie/borrowing008.png"></a></div>
				         </div>
				       </div>
			          
				  </div>
				</div>
	    	</div>
	    </div>
	    <hr class="featurette-divider2">
	    
	    </div>
	    <jsp:include page="../foot.jsp"/>
  </body>
</html>