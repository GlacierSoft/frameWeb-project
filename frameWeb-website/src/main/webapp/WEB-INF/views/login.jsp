<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="org.apache.shiro.web.filter.authc.FormAuthenticationFilter"%>
<%@ page import="org.apache.shiro.authc.LockedAccountException"%>
<%@ page import="com.glacier.basic.exception.IncorrectCaptchaException"%>
<!-- 引入jstl解析标签 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
%>
<!DOCTYPE html>
<html lang="zh-cn">
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>冰川网贷平台</title>
   	<!-- 引入公用的js和样式库 -->
	<jsp:include page="inc.jsp"/>
	<!-- Custom styles for this template -->
    <link href="${ctx}/resources/css/signin.css" rel="stylesheet">
    <style type="text/css">
		body {
		    padding-top: 100px;
		}
	</style>
	<script type="text/javascript">
    
    function reloadValidateCode(){
        $("#validateCodeImg").attr("src","<%=basePath%>/validateCode.htm?data=" + new Date() + Math.floor(Math.random()*24));
    }
    
    </script>
  </head>

  <body>
  <jsp:include page="nav_mgr/navLogin.jsp"/>
  	 <div id="danger_alert" style="width:100%;position: absolute;top:0px;z-index:5000;display: none;">
      <div class="alert alert-danger fade in">
        <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
        <h4 style="text-align:center;"></h4>
      </div> 
    </div>
    <div id="success_alert" style="width:100%;position: absolute;top:0px;z-index:5000;display: none;">
	      <div class="alert alert-success fade in">
	        <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
	        <h4 style="text-align:center;"></h4>
	      </div> 
	    </div>
     <div class="container">
      	<div class="panel panel-primary">
		  <div class="panel-heading panel-title">会员登录</div>
		  <div class="panel-body">
      		<form id="loginForm" class="form-horizontal" role="form" action="${pageContext.request.contextPath}/login.htm" method="post" onsubmit="return validaForm();">
			  <div class="form-group">
			    <label for="username" class="col-sm-2 control-label">用户名</label>
			    <div class="col-sm-6" style="float: left; width: 800px">
			      <input type=text    class="form-control" style="float: left;width: 428px" id="username" name="username" placeholder="请输入用户名或邮箱" value="${member.memberName}" required  />
			    </div>
			  </div>
			  <div class="form-group">
			    <label for="password" class="col-sm-2 control-label">密码</label>
			    <div class="col-sm-6"  style="float: left; width: 800px">
			      <input type="password"  class="form-control" style="float: left;width: 428px" id="password" name="password" placeholder="请输入密码" value="${member.memberPassword}" required /> 
			    </div>
			     
			  </div>

				<div class="form-group">
					<label id="login_kaptcha_span" class="col-sm-2 control-label ">验证码</label>
					<div class="col-sm-2">
						<input type="text" id="captcha" name="captcha" maxlength="4" class="form-control" placeholder="输入验证码" required />
					</div>
					 <div class="col-sm-2" style="width: 500px" >
					<img style="width:120px;height:32px;float: left;" class="img-responsive" id="login_kaptcha" src="${ctx}/resources/images/kaptcha.jpg" />
					<div style="margin-top:10px;"><a id="login_kaptchas" href="#">&nbsp;换一张</a></div>
				 </div> 
				</div>
			  <div class="form-group">
			    <label for="inputPassword" class="col-sm-5 control-label" style="margin-left: 20px">还没加入冰川网贷？<a href="${ctx}/intoregister.htm" class="navbar-link">立即注册</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="${ctx}/retrievePasswordEmail.htm">忘记密码?</a>
			   </label>
			    <div class="col-sm-2"></div>
			  </div>
			  <div class="form-group">
			    <div class="col-sm-offset-2 col-sm-10">
			      <button  id="login_submit" type="submit" style="width: 120px" class="btn btn-primary btn-lg">登录</button>
			    </div>
			  </div>
			</form>
			</div>
		</div>
		 
      </div>
      <jsp:include page="foot.jsp"/>
		<script type="text/javascript">
			$(function() {
				$(".alert").alert();
				
				$('#login_kaptcha').click(function() {  
					$('#captcha').val('');
		        	$(this).hide().attr('src','${pageContext.request.contextPath}/resources/images/kaptcha.jpg?' + Math.floor(Math.random() * 100)).fadeIn();     
			    });
				
				//超链接换图片
				$('#login_kaptchas').click(function() {   
					$('#captcha').val('');
		        	$("#login_kaptcha").hide().attr('src','${pageContext.request.contextPath}/resources/images/kaptcha.jpg?' + Math.floor(Math.random() * 100)).fadeIn();     
			    });
				
				
				var registerName = '${registerName}';
				if(registerName != ''){
					$('#success_alert').fadeIn();
					$('#success_alert h4').html('注册成功！请重新登录');
					setTimeout(function(){//延迟3秒隐藏
						$('#success_alert').fadeOut();
					},6000)
				}
				
				
				var userEmail = '${userEmail}';
				if(userEmail != ''){
					$('#success_alert').fadeIn();
					$('#success_alert h4').html('密码设置成功！请重新登录');
					setTimeout(function(){//延迟3秒隐藏
						$('#success_alert').fadeOut();
					},6000)
				}
				
				/* $('#captcha').val('').keyup(function() {
				    var target = this;
				    if (target.value.length === 4) {
				        if(validaForm()){
				        	$("#loginForm").submit();
				        }
				    }
				}); */
				
				//表单验证
				validaForm = function(){
					var $username = $('#username');
					if($username.val() === ''){
						$('#userrname_form_group').addClass("has-error");
						$username.focus();
						return false;
					}
					var $password = $('#password');
					if($password.val() === ''){
						$('#password_form_group').addClass("has-error");
						$password.focus();
						return false;
					}
					
					var $captcha = $('#captcha');
					if($captcha.val().length < 4){
						$('#captcha_form_group').addClass("has-error");
						$captcha.focus();
						return false;
					}
					
					$('#login_submit').attr('disabled', 'disabled').html('登录中...');
					return true;
				}; 
			  //输入框得到焦点,用户名验证
				 $("#username").focus(function(){
					 $("#nameinfo").remove(); 
				 });
				//用户名去焦点前台验证
				  $("#username").blur(function(){ 
					  if($(this).val()==""){
					     	  $(this).after("<label id='nameinfo' style='color: red'>*用户名 不能为空</label>");
							  return;
					     }
				  });
				
		         $("#password").focus(function(){
				    $("#password1").remove(); 
			     });
			     //密码验证 
			     $("#password").blur(function(){  
				     if($(this).val()==""){
			         	  $(this).after("<label id='password1' style='color: red'>*密码不能为空</label>");
					  return;
			          } 
			     });
				 //验证码验证 
				 $("#captcha").focus(function(){
					 $("#captchaInfo").remove(); 
				 });
				 //验证码验证 
				 $("#captcha").blur(function(){ 
					 $("#captchaInfo").remove(); 
					 var str=$(this).val(); 
				     if(str==""){
				     	$(this).after("<label id='captchaInfo' style='color: red'>*请输入验证码</label>");
						  return;
				     } else if(str.length<4){
				    	$(this).after("<label id='captchaInfo' style='color: red'>*验证码长度小于4</label>");
				    }
				 });    
			});
		</script>
		<%
			String error = (String) request.getAttribute(FormAuthenticationFilter.DEFAULT_ERROR_KEY_ATTRIBUTE_NAME);
			if(error != null){
				 System.out.println("error");
		%>
			<script type="text/javascript">
				$('#danger_alert').fadeIn();
				<% 
				 	if(error.contains("DisabledAccountException")){
		 	    %>
				 	  	$('#danger_alert h4').html('用户已被屏蔽，请登录其他用户！');
				 	  	$('#username_form_group').addClass("has-error");
				 	  	$('#username').focus();
				 	   <%
					}else if(error.contains("IncorrectCaptchaException")){
					    %>
				 	  	$('#danger_alert h4').html('验证码错误，请重新输入！');
				 	  	$('#captcha_form_group').addClass("has-error");
				 	  	$('#captcha').focus();
				 	   <%
					}else{
					    %>
					    $('#danger_alert h4').html('用户名或密码错误，请重新输入！');
					    $('#password_form_group').addClass("has-error");
					    $('#password').focus();
				 	   <%
					}
						%>
				setTimeout(function(){//延迟3秒隐藏
					$('#danger_alert').fadeOut();
				},3000)
			</script>
		<%
			}
		%>
  </body>
</html>

