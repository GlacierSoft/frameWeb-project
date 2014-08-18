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
					        <li><a href="${ctx}/borrowingProcess.htm">借款流程</a></li>
					        <li><a href="${ctx}/investmentProcess.htm">投资流程</a></li>
					        <li class="active"><a href="${ctx}/riskGuarantee.htm">风险保障</a></li>
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
				    <h3 class="panel-title">新手引导/ 风险保障</h3>
				  </div>
				  <div class="panel-body">
			          
			          <div  class="xs_guide_content xs_guide_content3">
				        <div style="width:886px; height:111px; text-align:right;"><img src="${pageContext.request.contextPath}/resources/images/newbie/risk_title001.png" /></div>
				        <div style="width:886px; font-size:16px; line-height:24px; color:#666666;">
				           本金和投资收益是投资人在<span style="font-size:24px; color:#10abe1;">冰川贷</span>平台的根本利益，为保护投资人在冰川贷的投资安全，我们采取了多项措施。
				           
				         </div>
				         
				         <div style="width:886px; font-size:16px; line-height:24px; color:#666666; clear:both; padding-top:20px;">
				           <div style="width:886px; height:120px; clear:both;">
				            <div style="width:170px; height:100px; margin:10px; float:left; text-align:center">
				             <img src="${pageContext.request.contextPath}/resources/images/newbie/risk001.png">
				            </div>
				            <div style="width:650px; height:100px; float:left;">
				             <div style="width:650px; height:40px; float:left; line-height:24px; font-size:24px; color:#959595; margin-top:10px;">
				               多年综合金融经验
				             </div>
				              <div style="width:650px; height:40px; float:left; line-height:24px; font-size:14px; color:#959595; ">
				               多年综合金融行业经验，为冰川贷业务开展奠定坚实基础。
				             </div>
				            </div>
				           </div>
				            
				            <div style="width:886px; height:120px; clear:both;">
				            <div style="width:170px; height:100px; margin:10px; float:left; text-align:center">
				             <img src="${pageContext.request.contextPath}/resources/images/newbie/risk002.png">
				            </div>
				            <div style="width:650px; height:100px; float:left;">
				             <div style="width:650px; height:40px; float:left; line-height:40px; font-size:24px; color:#959595; margin-top:20px;">
				               标准专业化团队
				             </div>
				              <div style="width:650px; height:40px; float:left; line-height:24px; font-size:14px; color:#959595; ">
				               冰川贷团队成员由国内专业金融机构、法律行业、经济研究和电子商务等领域的专业人士组成，确保专业化水准。
				             </div>
				            </div>
				           </div>
				           
				           <div style="width:886px; height:120px; clear:both;">
				            <div style="width:170px; height:100px; margin:10px; float:left; text-align:center">
				             <img src="${pageContext.request.contextPath}/resources/images/newbie/risk003.png">
				            </div>
				            <div style="width:650px; height:100px; float:left;">
				             <div style="width:650px; height:40px; float:left; line-height:40px; font-size:24px; color:#959595; margin-top:20px;">
				               多重防护网，防范交易风险
				             </div>
				              <div style="width:650px; height:40px; float:left; line-height:24px; font-size:14px; color:#959595; ">
				               冰川贷发布的投资服务都会经过专业机构严格的内部审核，同时有第三方担保公司提供担保。对一些风险稍大的交易，冰川贷还会对投资人和融资人设立更高的审核标准，确保只有合格的投资者才能参与。
				             </div>
				            </div>
				           </div>
				           
				           <div style="width:886px; height:120px; clear:both;">
				            <div style="width:170px; height:100px; margin:10px; float:left; text-align:center">
				             <img src="${pageContext.request.contextPath}/resources/images/newbie/risk004.png">
				            </div>
				            <div style="width:650px; height:100px; float:left;">
				             <div style="width:650px; height:40px; float:left; line-height:40px; font-size:24px; color:#959595; margin-top:20px;">
				               安全监管体系
				             </div>
				              <div style="width:650px; height:40px; float:left; line-height:24px; font-size:14px; color:#959595; ">
				               第一级：冰川贷自身的风险管控体系，从制度、流程、系统等方面全面保护投资者的利益；<br>
				第二级：冰川贷完善的内控合规和稽核监察体系；
				             </div>
				            </div>
				           </div>
				            
				           </div>
				           
				           <div style="width:886px; height:111px; text-align:right;"><img src="${pageContext.request.contextPath}/resources/images/newbie/risk_title002.png" /></div>
				        <div style="width:886px; font-size:16px; line-height:24px; color:#666666;">
				           为保障投资者的资金安全，<span style="font-size:24px; color:#10abe1;">冰川贷</span>&nbsp;采用多管齐下的资金管理措施。          
				           
				         </div>
				         
				         <div style="width:886px; font-size:16px; line-height:24px; color:#666666; clear:both; padding-top:20px;">
				           <div style="width:886px; height:120px; clear:both;">
				            <div style="width:170px; height:100px; margin:10px; float:left; text-align:center">
				             <img src="${pageContext.request.contextPath}/resources/images/newbie/risk005.png">
				            </div>
				            <div style="width:650px; height:100px; float:left;">
				             <div style="width:650px; height:40px; float:left; line-height:24px; font-size:24px; color:#959595; margin-top:10px;">
				               手机短信实时提醒
				             </div>
				              <div style="width:650px; height:40px; float:left; line-height:24px; font-size:14px; color:#959595; ">
				               手机认证实时提醒；修改密码实时提醒；提现审核实时提醒。
				             </div>
				            </div>
				           </div>
				            
				            <div style="width:886px; height:120px; clear:both;">
				            <div style="width:170px; height:100px; margin:10px; float:left; text-align:center">
				             <img src="${pageContext.request.contextPath}/resources/images/newbie/risk006.png">
				            </div>
				            <div style="width:650px; height:100px; float:left;">
				             <div style="width:650px; height:40px; float:left; line-height:40px; font-size:24px; color:#959595; margin-top:20px;">
				               账户安全
				             </div>
				              <div style="width:650px; height:40px; float:left; line-height:24px; font-size:14px; color:#959595; ">
				               认证及绑定账户转账；实时查询账户详情。
				             </div>
				            </div>
				           </div>
				           
				           <div style="width:886px; height:120px; clear:both;">
				            <div style="width:170px; height:100px; margin:10px; float:left; text-align:center">
				             <img src="${pageContext.request.contextPath}/resources/images/newbie/risk007.png">
				            </div>
				            <div style="width:650px; height:100px; float:left;">
				             <div style="width:650px; height:40px; float:left; line-height:40px; font-size:24px; color:#959595; margin-top:20px;">
				               系统安全
				             </div>
				              <div style="width:650px; height:40px; float:left; line-height:24px; font-size:14px; color:#959595; ">
				               内部严格的资金管理流程和完善安全的系统。
				             </div>
				            </div>
				           </div>
				           
				           <div style="width:886px; height:120px; clear:both;">
				            <div style="width:170px; height:100px; margin:10px; float:left; text-align:center">
				             <img src="${pageContext.request.contextPath}/resources/images/newbie/risk008.png">
				            </div>
				            <div style="width:650px; height:100px; float:left;">
				             <div style="width:650px; height:40px; float:left; line-height:40px; font-size:24px; color:#959595; margin-top:20px;">
				               国际领先网站加密技术
				             </div>
				              <div style="width:650px; height:40px; float:left; line-height:24px; font-size:14px; color:#959595; ">
				               
				             </div>
				            </div>
				           </div>
				            
				         </div>
				           
				           <div style="width:886px; height:111px; text-align:right;"><img src="${pageContext.request.contextPath}/resources/images/newbie/risk_title003.png" /></div>
				        <div style="width:886px; font-size:16px; line-height:30px; color:#666666;">
				           <span style="font-size:24px; color:#10abe1;">冰川贷</span>保证客户的个人信息不被人擅自或意外取得、处理或删除。采取各种实际措施保证个人信息不会被保管超过合理的期限 , 本公司将遵守所有关于可辨识个人信息保存的法规要求。        
				           
				         </div>
				         
				         <div style="width:886px; font-size:16px; line-height:24px; color:#666666; clear:both; padding-top:20px;">
				           <div style="width:886px; height:120px; clear:both;">
				            <div style="width:170px; height:100px; margin:10px; float:left; text-align:center">
				             <img src="${pageContext.request.contextPath}/resources/images/newbie/risk009.png">
				            </div>
				            <div style="width:650px; height:100px; float:left;">
				             <div style="width:650px; height:40px; float:left; line-height:24px; font-size:24px; color:#959595; margin-top:10px;">
				               数据安全承诺
				             </div>
				              <div style="width:650px; height:40px; float:left; line-height:24px; font-size:14px; color:#959595; ">
				               冰川贷采取各种合适的物理、电子和管理方面的措施来保护数据，以实现对数据安全的承诺。
				             </div>
				            </div>
				           </div>
				            
				            <div style="width:886px; height:120px; clear:both;">
				            <div style="width:170px; height:100px; margin:10px; float:left; text-align:center">
				             <img src="${pageContext.request.contextPath}/resources/images/newbie/risk010.png">
				            </div>
				            <div style="width:650px; height:100px; float:left;">
				             <div style="width:650px; height:40px; float:left; line-height:40px; font-size:24px; color:#959595; margin-top:20px;">
				               支持安全套接层协议和128位加密技术
				             </div>
				              <div style="width:650px; height:40px; float:left; line-height:24px; font-size:14px; color:#959595; ">
				               这种加密技术是互联网上保护数据安全的行业标准，让客户在进行会员管理、个人账户管理、充值等涉及敏感信息的操作时，信息被自动加密，然后才被安全地通过互联网发送出去。
				             </div>
				            </div>
				           </div>
				           
				           <div style="width:886px; height:120px; clear:both;">
				            <div style="width:170px; height:100px; margin:10px; float:left; text-align:center">
				             <img src="${pageContext.request.contextPath}/resources/images/newbie/risk011.png">
				            </div>
				            <div style="width:650px; height:100px; float:left;">
				             <div style="width:650px; height:40px; float:left; line-height:40px; font-size:24px; color:#959595; margin-top:20px;">
				               数字签名技术
				             </div>
				              <div style="width:650px; height:40px; float:left; line-height:24px; font-size:14px; color:#959595; ">
				               网站之间的页面跳转以及数据的发送采用数字签名技术来保证信息以及来源的不可否认性。
				             </div>
				            </div>
				           </div>
				           
				           <div style="width:886px; height:120px; clear:both;">
				            <div style="width:170px; height:100px; margin:10px; float:left; text-align:center">
				             <img src="${pageContext.request.contextPath}/resources/images/newbie/risk012.png">
				            </div>
				            <div style="width:650px; height:100px; float:left;">
				             <div style="width:650px; height:40px; float:left; line-height:40px; font-size:24px; color:#959595; margin-top:20px;">
				               集中的影像存储服务
				             </div>
				              <div style="width:660px; height:40px; float:left; line-height:24px; font-size:14px; color:#959595; ">
				               采用集中的影像存储服务来保证合同等文件信息的存储，有效避免被篡改以及删除，并可以实现永久保存。
				             </div>
				            </div>
				           </div>
				            
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