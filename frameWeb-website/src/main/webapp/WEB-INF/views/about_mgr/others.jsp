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
		ol, ul {
		    list-style: none outside none;
		    margin: 0;
    		padding: 0;
		}
		.IpNumber{
		  width: 260px;height: 40px;border-radius:5px;border: 1px solid #CCCCCC;
		}
		.BorrowAgreeDiv{
		  wdith:860px;margin-left: 60px;height: 20px;border: 0px solid red;line-height: 20px;font-size: 12px;
		}
		
		.table_one tr td{border:1px solid black;text-align: center;color: black;}
		
		.ManageMoneyDiv{width: 860px;margin-left: 60px;border: 0px solid red;font-size: 14px;margin-bottom: 20px;}
		
	</style>
  </head>

  <body>
    <jsp:include page="../nav_mgr/navAbout.jsp"/>
       
	    <div class="container">
	  	<div class="row">
		    <div class="col-md-2">
			    <div class="panel-group" id="accordion">
			    	<div class="panel panel-default">
				  		<div class="bs-example">
					      <ul class="nav nav-pills nav-stacked" style="max-width: 300px;">
					        <li><a href="${ctx}/aboutUs.htm" >公司简介</a></li>
					        <li><a href="${ctx}/announcement/announcement.htm?&p=1">网站公告</a></li>
						    <li><a href="${ctx}/news/news.htm?&p=1">网站新闻</a></li>
					        <li><a href="${ctx}/hiring/hiring.htm?&p=1">招纳贤士</a></li>
					        <li><a href="${ctx}/contactUs.htm">联系我们</a></li>
					        <li><a href="${ctx}/others/otherAddress.htm">公司地图</a></li>
					        <li class="active"><a href="${ctx}/others/others.htm">其他业务</a></li>
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
				    <h3 class="panel-title">关于我们 /其他业务</h3>
				  </div>
				  <div class="panel-body">
				   <c:choose>
				   
				      <c:when test="${str == 'IPNumber'}">  
				     	<div style="padding-top:10px;padding-bottom: 20px;">
				     	   <a id="repaymenting" href="${ctx}/others/others.htm?&str=IPNumber" class="btn btn-success" role="button">IP地址查询</a>
						   <a id="completed" href="${ctx}/others/others.htm?&str=TellNumber" class="btn btn-primary" role="button">手机号码查询</a>
						   <a id="completed_two" href="${ctx}/others/others.htm?&str=BorrowAgree" class="btn btn-primary" role="button">借款协议范本</a>
						   <a id="completed_three" href="${ctx}/others/others.htm?&str=ManageMoney" class="btn btn-primary" role="button">如何理财</a>
						   <div style="width:920px;height:40px;border: 0px solid black;margin-top: 20px;line-height: 40px;">
						        <form action="${ctx}/others/FindIPAddress" method="Post" id="form_IpNUmber">
						            <label>IP地址 ： </label>
						            <input type="text"  id="IpNumber_one" name="IP" class="IpNumber" placeholder="请输入合法IP地址" value="${ResoutIP}">&nbsp;
						            <input type="button" id="IPNUmberCommit" class="btn btn-primary" value="查询">&nbsp;
						            <button class="btn btn-primary" id="CleanIPNumber">重置</button>&nbsp;
						        </form>
						   </div>
						   <div style="width:920px;height:30px;border: 0px solid black;margin-top: 25px;line-height: 30px;background-color: #F5F5F5;padding-left: 20px;">
						                                     查询结果：  
						             <c:if test="${Resout==null}">
						                 <input type="text" style="background: #F5F5F5;border: 0px;color: red;height: 30px;width: 250px;" value="暂无消息" readonly="readonly" id="IpNUmber_invest_First">
						             </c:if>
						             <c:if test="${Resout!=null}">
						                 <input type="text" style="background: #F5F5F5;border: 0px;color: red;height: 30px;width: 250px;" value="${Resout }" readonly="readonly" id="IpNumber_invest_Second">
						             </c:if>
						   </div>
						</div>
					 </c:when>
					 
					 
					 <c:when test="${str == 'TellNumber'}">  
				     	<div style="padding-top:10px;padding-bottom: 20px;">
				     	   <a id="repaymenting" href="${ctx}/others/others.htm?&str=IPNumber" class="btn btn-primary" role="button">IP地址查询</a>
						   <a id="completed" href="${ctx}/others/others.htm?&str=TellNumber" class="btn btn-success" role="button">手机号码查询</a>
						   <a id="completed_two" href="${ctx}/others/others.htm?&str=BorrowAgree" class="btn btn-primary" role="button">借款协议范本</a>
						   <a id="completed_three" href="${ctx}/others/others.htm?&str=ManageMoney" class="btn btn-primary" role="button">如何理财</a>
						   <div style="width:920px;height:40px;border: 0px solid black;margin-top: 20px;line-height: 40px;">
						        <form action="${ctx}/others/FindTellAddress" method="post" id="form_mobile">
						            <label>请输入手机号 ： </label>
						            <input type="text"  id="TellNumberOne" name="mobileNumber" class="IpNumber" placeholder="请输入合法手机号" value="${ mobileNumber}" >&nbsp;
						            <input type="button" id="TellPhone_Commit" value="查询" class="btn btn-primary">&nbsp;
						            <button class="btn btn-primary" id="TellPhone_Clean" type="reset">重置</button>&nbsp;
						        </form>
						   </div>
						   <div style="width:920px;height:30px;border: 0px solid black;margin-top: 25px;line-height: 30px;background-color: #F5F5F5;padding-left: 20px;">
						                                     查询结果：
						                   <c:if test="${PhoneNumberAddress==null }">
						                    <input type="text" style="background: #F5F5F5;border: 0px;color: red;height: 30px;" value="暂无消息" readonly="readonly" id="Phone_Text"> 
						                   </c:if>
						                   <c:if test="${PhoneNumberAddress!=null }">
						                    <input type="text" style="background: #F5F5F5;border: 0px;color: red;height: 30px;width: 560px;" value="${PhoneNumberAddress}" readonly="readonly" id="Phone_Text_warn"> 
						                   </c:if>
						                
						   </div>
						</div>
					 </c:when>
					 
					<c:when test="${str=='ManageMoney'}">
					     <a id="repaymenting" href="${ctx}/others/others.htm?&str=IPNumber" class="btn btn-primary" role="button">IP地址查询</a>
						 <a id="completed" href="${ctx}/others/others.htm?&str=TellNumber" class="btn btn-primary" role="button">手机号码查询</a>
						 <a id="completed_two" href="${ctx}/others/others.htm?&str=BorrowAgree" class="btn btn-primary" role="button">借款协议范本</a>
					     <a id="completed_three" href="${ctx}/others/others.htm?&str=ManageMoney" class="btn btn-success" role="button">如何理财</a>
					     <div style="width:920px;height:250px;border: 0px solid black;margin-top: 20px;">
					            <h4 style="color: black;font-weight: bold;text-align: center;">如何理财</h4>       
					              <div class="ManageMoneyDiv">只需30秒，就可以注册冰川网贷网站用户.</div>
					              <div class="ManageMoneyDiv">像网上购物一样网银充值即可。</div>
					              <div class="ManageMoneyDiv">根据自己的喜好，和对回报率的要求，选择借款，直接投标即可。 </div>
					              <div class="ManageMoneyDiv" style="color:red;">注： 您还可以选择申请VIP会员，每年只需交10元的会费，就可以享受100%本金保障，体验投资零风险！</div>
					     </div>
					</c:when>
					 
					 
					 
					 
					  <c:when test="${str == 'BorrowAgree'}">  
				     	<div style="padding-top:10px;padding-bottom: 20px;">
				     	   <a id="repaymenting" href="${ctx}/others/others.htm?&str=IPNumber" class="btn btn-primary" role="button">IP地址查询</a>
						   <a id="completed" href="${ctx}/others/others.htm?&str=TellNumber" class="btn btn-primary" role="button">手机号码查询</a>
						   <a id="completed_two" href="${ctx}/others/others.htm?&str=BorrowAgree" class="btn btn-success" role="button">借款协议范本</a>
						   <a id="completed_three" href="${ctx}/others/others.htm?&str=ManageMoney" class="btn btn-primary" role="button">如何理财</a>
						   <div style="width:920px;height:1000px;border: 0px solid black;margin-top: 20px;">
						       <h2 style="font-size: 20px;text-align: center;color: black;font-weight: bold;">借款协议</h2>
						       <div class="BorrowAgreeDiv">合同编号: <b><u>P2P—</u></b></div>
						       <div class="BorrowAgreeDiv">签约日期:</div>
						       <div class="BorrowAgreeDiv">协议三方定义: </div>
						       <div class="BorrowAgreeDiv">贷出者: 　暂无贷出者 ，以下称“贷出方”；</div>
						       <div class="BorrowAgreeDiv">管理方: 冰川网贷，以下称“管理方”。</div>
						       <div class="BorrowAgreeDiv"></div>
						       <div class="BorrowAgreeDiv">郑重承诺:</div>
						       <div class="BorrowAgreeDiv">贷出者:</div>
						       <div class="BorrowAgreeDiv"></div>
						       <div class="BorrowAgreeDiv">暂无数据:</div>
						       
						       <div style="wdith:860;margin-left: 60px;height: 100px;border: 0px solid red;line-height: 20px;font-size: 12px;">
						          <table style="width: 860px;height: 100px;border: 1px solid black;text-align: center;" class="table_one">
						               <tr style="background: #D9D9D9">
						                   <td>出借人名称</td><td> 借出金额(人民币) </td><td> 借款期限 </td><td> 年利率 </td><td> 借款开始日期 </td><td> 借款到期日期 </td><td> </td><td>  总还款本息(人民币)  </td>
						               </tr>
						               <tr>
						                   <td>总金额：</td><td>￥</td><td></td><td></td><td></td><td></td><td>总还本息：</td><td>￥</td>
						               </tr>
						          </table>
						       </div>
						       
						       <div class="BorrowAgreeDiv"></div>
						       <div class="BorrowAgreeDiv">借入者 : <b><u>(身份证号码： )</u></b></div>
						       <div class="BorrowAgreeDiv">管理方: <b><u>冰川网贷</u></b></div>
						       <div class="BorrowAgreeDiv">三方约定:</div>
						       <div class="BorrowAgreeDiv">由管理方负责将贷出方的款项划转至借款方开立的账户。 </div>
						       <div class="BorrowAgreeDiv">第一条 借款基本信息 </div>
						       
						        <div style="wdith:560;margin-left: 200px;height: 200px;border: 0px solid red;line-height: 20px;font-size: 12px;">
						          <table style="width: 560px;height: 200px;border: 1px solid black;" class="table_one">
						               <tr style="background: #D9D9D9"> <td>出借人名称</td><td>出借人名称</td></tr>
						                <tr ><td> 借款本金数额: </td><td></td></tr>
						                <tr style="background: #D9D9D9"><td> 应偿还本息数额: </td><td>￥</td></tr>
						                <tr > <td> 还款分期月数: </td><td></td></tr>
						                <tr style="background: #D9D9D9"><td> 借款利率: </td><td>￥</td></tr>
						                <tr ><td> 还款方式: </td><td></td></tr>
						                 <tr ><td>  借款描述: : </td><td></td></tr>
						                 <tr style="background: #D9D9D9"><td>  还款日: </td><td>每月日（24：00前，节假日不顺延）</td></tr>
						                 <tr ><td>还款起止日期: </td><td>至 止</td></tr>
						          </table>
						       </div>
						       
						       <div class="BorrowAgreeDiv"></div>
						       <div class="BorrowAgreeDiv">分期还款列表</div>
						       <div class="BorrowAgreeDiv"></div>
						       
						       <div class="BorrowAgreeDiv">暂无数据 :</div>
						       <div class="BorrowAgreeDiv"></div>
						       <div style="wdith:860;margin-left: 60px;height: 40px;border: 0px solid red;line-height: 20px;font-size: 12px;">
						         <table style="width: 860px;height: 30px;border: 1px solid black;text-align: center;" class="table_one">
						                <tr style="background: #D9D9D9">
						                   <td>期数</td><td> 年利率 </td><td> 应还时间 </td><td> 应还本息 </td><td> 还款本金 </td><td> 还款利息 </td>
						               </tr>
						          </table>
						        </div>
						       <div class="BorrowAgreeDiv"></div>
						       
						       <div class="BorrowAgreeDiv">第二条 各方权利和义务</div>
						       <div class="BorrowAgreeDiv">贷出方的权利和义务 : </div>
						       <div class="BorrowAgreeDiv">贷出者: 　暂无贷出者 </div>
						       <div class="BorrowAgreeDiv">借入者:     ()</div>
						       <div class="BorrowAgreeDiv">通信地址：<b><u>珠海香洲区</u></b></div>
						       <div class="BorrowAgreeDiv">管理方：冰川网贷<b><u>冰川网贷</u></b></div>
						   </div>
						</div>
					 </c:when>
					 
					</c:choose>
				 </div>
				</div>
	    	</div>
	    </div>
	    <hr class="featurette-divider2">
	    </div>
	    <jsp:include page="../foot.jsp"/>
<!-- 分页显示表格数据 -->
<script type="text/javascript">
       
       $(function(){
    	 //重置事件
    	  $("#CleanIPNumber").click(function(){
    		 $("#IpNumber_one").attr("value",""); 
    	  });
    	 $("#TellPhone_Clean").click(function(){
    		 $("#TellNumberOne").attr("value",""); 
    	 });
    	 
    	 //手机号验证
    	 $("#TellPhone_Commit").click(function(){
            var str=$("#TellNumberOne").val();
            if(str){
            	if(!(/^0?(13[0-9]|15[012356789]|18[0236789]|14[57])[0-9]{8}$/.test(str))){
            		$("#Phone_Text").val("手机号格式输入错误!!!");
            		$("#Phone_Text_warn").val("手机号格式输入错误!!!");
            	}else{
            		$("#form_mobile").submit();
            	}
            }else{
            	$("#Phone_Text").val("请正确填写手机号!!!");
            	$("#Phone_Text_warn").val("请正确填写手机号!!!");
            }
    	});
    	 //IP验证
    	 $("#IPNUmberCommit").click(function(){
    		 var str=$("#IpNumber_one").val();
    		 if(str){
    			 if(!(/^(\d{1,2}|1\d\d|2[0-4]\d|25[0-5])\.(\d{1,2}|1\d\d|2[0-4]\d|25[0-5])\.(\d{1,2}|1\d\d|2[0-4]\d|25[0-5])\.(\d{1,2}|1\d\d|2[0-4]\d|25[0-5])$/.test(str))){
   				 $("#IpNUmber_invest_First").val("IP地址格式输入错误!!!");
   	    		 $("#IpNUmber_invest_Second").val("IP地址格式输入错误!!!");  
   			  }else{
   				$("#form_IpNUmber").submit();
   			  }
    		 }else{
    			 $("#IpNUmber_invest_First").val("请正确填写IP号!");
    			 $("#IpNUmber_invest_Second").val("请正确填写IP号!");
    		 }
    	 });
      }); 	 
</script>
</body>
</html>