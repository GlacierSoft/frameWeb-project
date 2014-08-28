<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入jstl解析标签 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- 获取项目根path -->
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

    	<!-- NAVBAR START============================= -->
	    <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
	      <div class="container">
	        <div class="navbar-header">
	          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
	            <span class="sr-only">Toggle navigation</span>
	            <span class="icon-bar"></span>
	            <span class="icon-bar"></span>
	            <span class="icon-bar"></span>
	          </button>
	          <a class="navbar-brand" href="${ctx}/index.htm">冰川网站模板</a>
	        </div>
	        <div class="navbar-collapse collapse">
	          <ul id="topNavBar" class="nav navbar-nav">
	            <script type="text/javascript">
	            	//页面进来即刻加载
	            	$(function(){
	            	    $.ajax({
	            	    	type:"post",
	            	    	url:"${ctx}/nav/levelWebNav.json",
	            	    	dataType:"json",
	            	    	success:function(data){
	            	    		//循环开始 
	            	    		$.each(data,function(index,comment){
	            	    		        if(index==0){
	            	    		        	$("<li class='active'><a id='navABar"+index+"' href='${ctx}/index.htm'>"+comment.webNavName+"</a></li>").appendTo("#topNavBar");
	            	    		        }else{
	            	    		        	$("<li id='nav"+index+"' class='dropdown' onclick='getWebNavPname(\""+comment.webNavId+"\",this);'><a id='navABar"+index+"' href='${ctx}"+comment.webNavUrl+"'  class='dropdown-toggle' data-toggle='dropdown'>"+comment.webNavName+"</a></li>").appendTo("#topNavBar");
	            	    		        }
	            	    		  });
	            	    	}
	            	    });
	            	});
	            	//点击时取出子项
	            	function getWebNavPname(webNavId,obj){
	            		var id = $(obj).attr('id');//获取Id属性
	            		$.post("${ctx}/nav/list.json","webNavId="+webNavId,function(data){
	            			//构建一个UL元素
	            			if(data!=""){
	            				var ul="<ul class='dropdown-menu'>";
	            			}
	            			$.each(data,function(i,v){
	            				ul+="<li onclick='clickBackGrounp(\""+id+"\")'><a href='${ctx}"+v.webNavUrl+"'>"+v.webNavName+"</a></li>";
	            			});
	            			if(data!=""){
	            				ul+="<ul>";
	            				$("#"+id).append(ul);//追加内容在某个元素结束前
	            			}
	            		},"json");
	            	}
	            	
	            	function clickBackGrounp(id){
	            		var ulNum = $("#topNavBar>li").length;
	            		$("#"+id).addClass("active");
	            	}
	            </script>
	          </ul>
	          	<p class="navbar-text navbar-right">
	          	<c:choose>
				   <c:when test="${empty currentMember}">  
		         		<span>您好！| <a href="${ctx}/login.htm" class="navbar-link">登录</a> |</span>
		         		<span><a href="${ctx}/intoregister.htm" class="navbar-link">注册</a></span>
				   </c:when>
			   	<c:otherwise> 
				   		<span>您好！${currentMember.memberName}
				   		  <c:choose>
				   		      <c:when test="${empty currentMember.memberRealName}">
				   		     	 <a  href="${ctx}/member/memberDetail.htm?&p=1" class="navbar-link">
				   		         <span id="nav_messageNoticCount" class="badge">${messageNoticCount}</span>
				   		         </a>  
				   		      </c:when>
				   		      <c:otherwise>
				   		      	 <a  href="${ctx}/messageNotice/intoMessageNotice.htm?&p=1" class="navbar-link">
				   		         <span id="nav_messageNoticCount" class="badge">${messageNoticCount}</span>
				   		        </a> 
				   		      </c:otherwise>
				   		 </c:choose>|</span>
				   		<span><a href="${ctx}/member/index.htm" class="navbar-link">个人中心</a> |</span>
				   		<span><a href="${ctx}/logout.htm" class="navbar-link">退出</a></span>
				   </c:otherwise>
				</c:choose>
   				</p>
	        </div>
	      </div>
	    </nav>
	    <!-- NAVBAR END============================= -->
