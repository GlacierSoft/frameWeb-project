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
	<jsp:include page="../inc.jsp"/>
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
  <jsp:include page="../nav_mgr/navLogin.jsp"/>
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
		  <div class="panel-heading panel-title">设置新密码</div>
		  	<form  style="height: 270px" id="getPasword" class="form-horizontal" role="form" action="${pageContext.request.contextPath}/setNewPassword.htm" method="post" onsubmit="return validaForm();">
		     <div class="form-group" style="margin-top: 60px">
			    <label for="memberPassword" class="col-sm-2 control-label">密码</label>
			    <div class="col-sm-6" style="float: left; width: 600px">
			      <input type="password"  style="float: left;width: 428px" class="form-control" id="memberPassword_form-group" name="memberPassword" placeholder="密码长度不能小于6个字符"/>
			    </div>
			  </div>
			  <div class="form-group" >
			    <label for="comfirPassword" class="col-sm-2 control-label">确认密码</label>
			    <div class="col-sm-6" style="float: left; width: 600px">
			      <input type="password"  style="float: left;width: 428px" class="form-control" id="comfirPassword_form-group" name="newPassword" placeholder="再次确认密码" />
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
			      <button id="register_form-group" type="button" class="btn btn-primary">提交</button>
			    </div>
			  </div>
			</form>
		</div>
		 
      </div>
      <jsp:include page="../foot.jsp"/>
<script type="text/javascript">
$(function(){ 
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
		//表单   

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
		      }else if(password1.length<6){ 
		    	 $("#password2").remove(); 
				 $("#password2s").remove();  
			   }else if(password2==""){ 
		    	 $(this).after("<label id='password2s' style='color: red'>*确认密码不能为空</label>");
		    	    return;
			   }else if(password1!=password2){ 
		     	 $(this).after("<label id='password2' style='color: red'>*两次密码输入不一致</label>"); 
		         return;
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
		    	    return;
		    }  
		 });  
		 
		 
		 
		 

			//表单验证
			validaForm = function(){ 
				var $memberPassword = $('#memberPassword_form-group');
				var $comfirPassword = $('#comfirPassword_form-group'); 
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
				return true;
				
			};
			
			var errorCaptcha = '${errorCaptcha}'; 
			if(errorCaptcha != ""){
				$('#danger_alert').fadeIn();
				$('#danger_alert h4').html('验证码错误，请重新输入！');
		 	  	$('#captcha_form_group').addClass("has-error");
		 	  	$('#captcha').focus();
		 		setTimeout(function(){//延迟3秒隐藏
					$('#danger_alert').fadeOut();
				},3000)
			}
			 
			$("#register_form-group").click(function(){ 
				var password1=$("#memberPassword_form-group").val(); 
				var password2= $("#comfirPassword_form-group").val();
				var yz=$("#captcha").val();
				if(password1!=""&&password2!=""&&yz!=""){
					if(password1.length>5&&yz.length==4){
						$("#getPasword").submit();
					   return;
					}
				}  
				alert("请正确输入完整信息");
			});
			 
}) 
</script>
 </body>
</html>

 