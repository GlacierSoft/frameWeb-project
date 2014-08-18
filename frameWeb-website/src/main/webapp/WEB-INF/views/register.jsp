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
    <link href="${ctx}/resources/css/email.css" type="text/css" rel="stylesheet" /> 
    <script src="${ctx}/resources/js/register/emailAutoComplete.js"></script>
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
  <jsp:include page="nav_mgr/navRegister.jsp"/>

   <div id="danger_alert" style="width:100%;position: absolute;top:0px;z-index:5000;display: none;">
      <div class="alert alert-danger fade in">
        <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
        <h4 style="text-align:center;"></h4>
      </div> 
    </div>
      <div class="container">
      	<div class="panel panel-primary">
		  <div class="panel-heading panel-title">会员注册</div>
		  <div class="panel-body">
      		<form id="registerForm" class="form-horizontal" role="form" action="${pageContext.request.contextPath}/register.htm" method="post" onsubmit="return validaForm();">
			  <div class="form-group">
			    <label for="email" class="col-sm-2 control-label">常用邮箱</label>
			    <div class="col-sm-6 parentCls" style="float: left; width: 800px">
			      <input type="text" onfocus="this.type='email'"  class="form-control inputElem" autocomplete="off"  style="float: left;width: 428px;height: 35px"  id="email_form-group" name="email" placeholder="常用邮箱"  maxlength="21" required  value="${member.email}"  />
			    </div>
			  </div>
			  <div class="form-group">
			    <label for="memberName" class="col-sm-2 control-label">用户名</label>
			    <div class="col-sm-6" style="float: left; width: 800px">
			      <input type="text"   class="form-control" style="float: left;width: 428px" id="memberName_form-group"
			      onbeforepaste="clipboardData.setData('text',clipboardData.getData('text').replace(/[\u4e00-\u9fa5]/g,''))" onkeyup="this.value=this.value.replace(/[\u4e00-\u9fa5]/g,'')" 
			       name="memberName" placeholder="用户名" value="${member.memberName}" maxlength="12"/>
			    </div>
			  </div>
			  <div class="form-group">
			    <label for="memberPassword" class="col-sm-2 control-label">密码</label>
			    <div class="col-sm-6" style="float: left; width: 800px">
			      <input  type="text" onfocus="this.type='password'" autocomplete="off"  maxlength="12" class="form-control" style="float: left;width: 428px" id="memberPassword_form-group" name="memberPassword" placeholder="密码长度不能小于6个字符" required value="${member.memberPassword}"/>
			    </div>
			  </div>
			  <div class="form-group">
			    <label for="comfirPassword" class="col-sm-2 control-label">确认密码</label>
			    <div class="col-sm-6" style="float: left; width: 800px">
			      <input type="password" maxlength="12" class="form-control" style="float: left;width: 428px" id="comfirPassword_form-group" placeholder="再次确认密码" required value="${member.memberPassword}"/>
			    </div>
			  </div>
		  	<div class="form-group">
				<label id="login_kaptcha_span" class="col-sm-2 control-label ">验证码</label>
				<div class="col-sm-2">
					<input type="text" id="captcha" name="captcha" maxlength="4" class="form-control" placeholder="验证码" required />
				</div>
				<div class="col-sm-2" style="width: 500px" >
					<img style="width:120px;height:32px;float: left;" class="img-responsive" id="login_kaptcha" src="${ctx}/resources/images/kaptcha.jpg" />
					<div style="margin-top:10px;"><a id="login_kaptchas" href="#">&nbsp;换一张</a></div>
				 </div> 
			</div>
			  <div class="form-group">
			    <div class="col-sm-offset-2 col-sm-10">
			      <button id="register_form-group"  class="btn btn-primary">免 费 注 册</button>
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
				//表单验证
				validaForm = function(){
					var $memberName = $('#memberName_form-group');
					var $memberPassword = $('#memberPassword_form-group');
					var $comfirPassword = $('#comfirPassword_form-group');
					if($memberName.val().length > 10){
						$memberName.addClass("has-error");
						$memberName.focus();
						
						$('#danger_alert').fadeIn();
						$('#danger_alert h4').html('用户名不能大于10位！');
						setTimeout(function(){//延迟3秒隐藏
							$('#danger_alert').fadeOut();
						},3000)
						return false;
					}
					 
					if($memberPassword.val().length < 6 || $memberPassword.val().length > 12){
						$memberPassword.addClass("has-error");
						$memberPassword.focus();
						
						$('#danger_alert').fadeIn();
						$('#danger_alert h4').html('密码不能小于6位或者不能大于12位！');
						setTimeout(function(){//延迟3秒隐藏
							$('#danger_alert').fadeOut();
						},3000)
						return false;
					}
					if(($memberPassword.val()) !== ($comfirPassword.val())){
						$memberPassword.addClass("has-error");
						$memberPassword.focus();
						
						$('#danger_alert').fadeIn();
						$('#danger_alert h4').html('密码输入不一致，请重新输入！');
						setTimeout(function(){//延迟3秒隐藏
							$('#danger_alert').fadeOut();
						},3000)
						return false;
					}
					
					
					 $("#eml").remove();  
	     			 var str=$("#email_form-group").val(); 
	     			 var reg = /^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+((.[a-zA-Z0-9_-]{2,3}){1,2})$/;
	     		     var boo= reg.test(str);
	     		     if(str==""){
	     		    	$("#email_form-group").after("<label id='eml' style='color: red'>*注册邮箱不能为空</label>");
	     				  return false;
	     		     }  
	     		    if(boo==false){
	     		    	$("#email_form-group").after("<label id='eml' style='color: red'>*邮箱格式不正确</label>");
	     		    	 return false;
	     		     }else{ 
	     		    	$.ajax({
	      				   type: "POST",
	      				   url: ctx+"/confinMenberName.json",
	      				   dataType: "json",
	      				   data: 'str='+str+"&action=E",
	      			       success: function(date) {  
	      			    	  if(date.success==false){ //改用户已被注册
	      			              $("#email_form-group").after("<label id='eml' style='color: red'>&nbsp;&nbsp;该邮箱已被注册</label>");
	      			    	      return false;
	      			    	  } 
	      			   }  
	      			});  
	     		  }   
					
					var $captcha = $('#captcha');
					if($captcha.val().length < 4){
						$('#captcha_form_group').addClass("has-error");
						$captcha.focus();
						
						$('#danger_alert').fadeIn();
						$('#danger_alert h4').html('验证码不能小于4位！');
						setTimeout(function(){//延迟3秒隐藏
							$('#danger_alert').fadeOut();
						},3000)
						return false;
					}
					
					$('#register_form-group').attr('disabled', 'disabled').html('注册中...');
					return true;
				};
				
				//$("#loginForm").submit();//自动登录，方便测试，后期删除
			});
		</script>
		
		<script type="text/javascript">
		//输入框得到焦点
		 $("#email_form-group").focus(function(){
			 $("#eml").remove(); 
		 });
   
		 $("#memberName_form-group").focus(function(){
			 $("#name1").remove(); 
			 $("#name2").remove(); 
		 });
		 //用户名验证 
		 $("#memberName_form-group").blur(function(){ 
			 $("#name1").remove();  
			 $("#name2").remove(); 
			 var str=$(this).val(); 
		     if(str==""){
		     	 $(this).after("<label id='name1' style='color: red'>*用户名不能为空</label>");
				  return;
		     }  
		     $.ajax({
				   type: "POST",
				   url: ctx+"/confinMenberName.json",
				   dataType: "json",
				   data: 'str='+str+"&action=N",
			       success: function(date) {  
			    	  if(date.success==false){ //改用户已被注册
			              $("#memberName_form-group").after("<label id='name2' style='color: red'>&nbsp;&nbsp;该用户名已被注册</label>");
			    	  }
			   } 
			});
		     
		 });  
		 
		 $("#comfirPassword_form-group").focus(function(){ 
			 $("#password2").remove(); 
			 $("#password2s").remove(); 
		 });
		 //确认密码验证 
		 $("#comfirPassword_form-group").blur(function(){ 
			 $("#password2").remove(); 
			 $("#password2s").remove(); 
			 var password2=$(this).val(); 
			 var password1=$("#memberPassword_form-group").val(); 
		     if(password1==""){
		    	 $("#password2").remove(); 
				 $("#password2s").remove(); 
		       return;
		     }else if(password1.length<6){ 
		    	 $("#password2").remove(); 
				 $("#password2s").remove(); 
				 return;
		     }else if(password2==""){ 
		    	 $(this).after("<label id='password2s' style='color: red'>*确认密码不能为空</label>");
		         return; 
			 }else if(password1!=password2){ 
		     	 $(this).after("<label id='password2' style='color: red'>*两次密码输入不一致</label>"); 
		      }
		     
		 });  
		 $("#memberPassword_form-group").focus(function(){
			 $("#password1").remove(); 
		 });
		 //密码验证 
		 $("#memberPassword_form-group").blur(function(){ 
			 $("#password1").remove(); 
			 var str=$(this).val(); 
		     if(str==""){
		     	 $(this).after("<label id='password1' style='color: red'>*密码不能为空</label>");
				  return;
		     } 
		     if(str.length<6){
		     	 $(this).after("<label id='password1' style='color: red'>*密码长度不能小于6</label>");
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
		 
			var errorCaptcha = '${errorCaptcha}';
			var usernameRepeat = '${usernameRepeat}';
			var emailRepeat = '${emailRepeat}';
			if(errorCaptcha != ""){
				$('#danger_alert').fadeIn();
				$('#danger_alert h4').html('验证码错误，请重新输入！');
		 	  	$('#captcha_form_group').addClass("has-error");
		 	  	$('#captcha').focus();
			}
			if(emailRepeat != ""){
				$('#danger_alert').fadeIn();
				$('#danger_alert h4').html('该邮箱已注册，请重新输入！');
		 	  	$('#email_form-group').addClass("has-error");
		 	  	$('#email_form-group').focus();
			}
			if(usernameRepeat != ""){
				$('#danger_alert').fadeIn();
				$('#danger_alert h4').html('用户名重复，请重新输入！');
		 	  	$('#memberName_form-group').addClass("has-error");
		 	  	$('#memberName_form-group').focus();
			}
			setTimeout(function(){//延迟3秒隐藏
				$('#danger_alert').fadeOut();
			},3000)
		</script>
  </body>
</html>

