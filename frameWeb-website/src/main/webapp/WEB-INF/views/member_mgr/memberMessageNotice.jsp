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
					    <div id="collapseOne" class="panel-collapse collapse in">
					      <div class="panel-body">
					        <div class="btn-group-vertical">
					          <a href="${ctx}/member/index.htm" class="btn btn-default" role="button">我的主页</a>
					          <a href="#" onclick="checkRechargeWithdraw('${currentMember.memberId}','${ctx}/financeMember/rechargeWithdraw.htm?p=1');" class="btn btn-default" role="button">充值提现</a>
					          <a href="#" onclick="checksMember('${currentMember.memberId}','${ctx}/member/memberAuth.htm?&p=0');" class="btn btn-default" role="button">平台认证</a>
					          <a href="#" onclick="checksMember('${currentMember.memberId}','${ctx}/messageNotice/intoMessageNotice.htm?&p=1');" class="btn btn-info" role="button">站内信</a>
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
				    <h3 class="panel-title">系统消息</h3>
				  </div>
				  <div class="panel-body">
				  <div id="messageNoticeList">
				  <div style="padding-top:10px;padding-bottom: 20px;">
				  	<a id="deleteMessageNotice" href="javascript:void(0);" class="btn btn-primary" role="button">删除</a>
					<a id="markRead" href="javascript:void(0);" class="btn btn-primary" role="button">标记为已读</a>
					<a id="markUnread" href="javascript:void(0);" class="btn btn-primary" role="button">标记为未读</a>
					<a href="${ctx}/messageNotice/intoMessageNotice.htm?&p=1&letterstatus=unread" class="btn btn-primary" role="button">未读信息</a>
					<a href="${ctx}/messageNotice/intoMessageNotice.htm?&p=1&letterstatus=read" class="btn btn-primary" role="button">已读信息</a>
				  </div>
				  	<table id="messageNoticeTable" class="table table-bordered" style="text-align:center;vertical-align: middle;">
				  		<thead>
				  			<tr>
				              <td><input id="totalCheckbox" name="totalCheckbox" type="checkbox" value="" /></td>
				              <td><strong>标记</strong></td>
				              <td><strong>发件人</strong></td>
				              <td><strong>标题</strong></td>
				              <td><strong>发送时间</strong></td>
				            </tr>
				  		</thead>
				         	<tbody>
							<c:if test="${empty messageNoticeDatas.rows}">
							<tr>
					            <td colspan="5"><strong>暂无信息</strong></td>
					          </tr>
							</c:if>	  		
							<c:if test="${!empty messageNoticeDatas.rows}">  		
				            <c:forEach items="${messageNoticeDatas.rows}" var="messageNotice" varStatus="status">
						      	<tr>
						      	  	<td>
									<input name="messageNoticeIds" onclick="checkMessageNoticeIds();" type="checkbox" value="${messageNotice.messageNoticeId}">
									</td>	
					              <td id="messageNotice_letterstatus${status.index}">
					              <script type="text/javascript">
					             $('#messageNotice_letterstatus'+${status.index}).html(renderGridValue('${messageNotice.letterstatus}',fields.letterstatus));
					              </script>
					              </td>
					              <td>${messageNotice.senderDisplay}</td>
					              <td>
					              	<a id="messageNotice_tilte${status.index}" class="${messageNotice.messageNoticeId}" href="javascript:void(0);">${messageNotice.title}</a>
					              	<script type="text/javascript">
										    $("#messageNotice_tilte"+${status.index}).bind('click', function(){   
										    	var valCalss=$("#messageNotice_tilte"+${status.index}).attr("class");//这里获取class值，也就是获取messageNoticeId
										    	$.ajax({
													   type: "GET",
													   url: ctx+"/messageNotice/messageNoticeDetail.json?messageNoticeId="+valCalss,
													   dataType: "json",
									 			   	 success: function(r) {
									 			   		 $("#nav_messageNoticCount").html(${messageNoticCount});
									 			   		 $("#messageNoticeList").hide();
									 			   		 $("#sender").html(r.senderDisplay);
									 			   		 $("#addressee").html(r.addresseeDisplay);
									 			   		 $("#title").html(r.title);
									 			   		 $("#sendTime").html(r.sendtime);
									 			   		 $("#content").html(r.content);
									 			   		 $("#messageNoticeDetailTable").show();
									                 },
									                 error: function() {
									                     alert("查看详细出错！");
									                 }
													});
										    });
										</script>
					              </td>
					              <td><fmt:formatDate value="${messageNotice.sendtime}" type="both"/></td>
					            </tr>
					      	</c:forEach>
					      	</c:if>	
				            </tbody>
				            <c:if test="${!empty messageNoticeDatas.rows}">  
				            <tfoot>
					          <tr>
					            <th colspan="5">
					            	<div align="right">
									    <ul id='pagemessageNotice'></ul>
									</div>
								</th>
					          </tr>
					        </tfoot>
					       </c:if>	
				        </table><!-- display:block; -->
				       </div>
				        <table id="messageNoticeDetailTable" class="table" style="display:none;margin-top:20px;text-align:center;vertical-align: middle;">
				        	<tr>
				              <td>发件人：</td>
				              <td><span id="sender" style="float: left;"></span></td>
				              <td></td>
				              <td></td>
				            </tr>
				            <tr>
				              <td>收件人：</td>
				              <td><span id="addressee" style="float: left;"></span></td>
				              <td></td>
				              <td></td>
				            </tr>
				            <tr>
				              <td>标题：</td>
				              <td><span id="title" style="float: left;" ></span></td>
				              <td></td>
				              <td></td>
				            </tr>
				            <tr>
				              <td>日期：</td>
				              <td><span id="sendTime" style="float: left;"></span></td>
				              <td></td>
				              <td></td>
				            </tr>
				            <tr>
				              <td>内容：</td>
				              <td><span id="content" style="float: left;"></span></td>
				              <td></td>
				              <td></td>
				            </tr>
				            <tr>
				              <!-- <td> <a id="" href="javascript:void(0);" class="btn btn-default" role="button" onclick="$('#messageNoticeList').show();$('#messageNoticeDetailTable').hide();">返回</a></td> -->
				              <td> <a id="messageNoticeListReturn" href="javascript:void(0);" class="btn btn-primary" role="button" >返回</a></td>
				              <td></td>
				              <td></td>
				              <td></td>
				            </tr>
				        </table>
				        
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
  	
  	//定义成全局变量
	 var valp = '';//获取p参数，也就是第几页
	 var letterstatus = '';////获取letterstatus参数
	 var messageNoticeIds = [];//删除的id标识
	 
	  <!-- 分页显示表格数据 开始 -->
		$(function(){
			//获得浏览器参数
			$.extend({
				getUrlVars: function(){
					var vars = [], hash;
					var hashes = window.location.href.slice(window.location.href.indexOf('?') + 1).split('&');
					for(var i = 0; i < hashes.length; i++){
						hash = hashes[i].split('=');
						vars.push(hash[0]);
						
						vars[hash[0]] = hash[1];
						
					}
					//console.log(vars);
					return vars;
				},
				getUrlVar: function(name){
					return $.getUrlVars()[name];
				}
			});
		
		//封装浏览器参数
		var composeUrlParams=function(){
			var param='';
			$.each($.getUrlVars(), function(i, item) {
				if(item!='p'){
					var val=$.getUrlVar(item);
					if(val) param += "&" + item+"="+val;
				}
			});
			//获取p参数，也就是第几页,不是分页功能的代码，
			$.each($.getUrlVars(), function(i, item) {
				if(item=='p'){
					valp=$.getUrlVar(item);
					return false;
				}
			});
			//到这里结束，这部分不是分页代码
			return param;
		}
		
		var elementpagemessageNotice = $('#pagemessageNotice');
		
		//积分的设置分页的总页数
		var totalmessageNotice=${messageNoticeDatas.total}/10;
		if(parseInt(totalmessageNotice)==totalmessageNotice){
			var totalmessageNotice = parseInt(totalmessageNotice);
		}else {
			var totalmessageNotice = parseInt(totalmessageNotice)+1;
		}
		var messageNoticeOptions = {
		    bootstrapMajorVersion:3,
		    currentPage: ${messageNoticeDatas.p},
		    numberOfPages: 10,
		    totalPages:totalmessageNotice,
		    pageUrl: function(type, page, current){
		    	return "${ctx}/messageNotice/intoMessageNotice.htm?"+composeUrlParams()+"&p="+page;
		    	}
		}
		elementpagemessageNotice.bootstrapPaginator(messageNoticeOptions);
		
		//点击查询未读信息返回的按钮
		 $("#messageNoticeListReturn").bind('click', function(){   
	  		//window.location.href="${ctx}/messageNotice/intoMessageNotice.htm?&p="+valp;
	  		window.location.href="${ctx}/messageNotice/intoMessageNotice.htm?"+composeUrlParams()+"&p="+valp;
	  		
	    }); 
		})
	<!-- 分页显示表格数据 结束 -->
	$("#totalCheckbox").attr("checked",false);	
	//点击总的复选框触发事件
	$("#totalCheckbox").change(function() {
		var checked = $("#totalCheckbox").is(":checked");
        if(checked) {
      	    $("input[name='messageNoticeIds']").prop("checked",true);
         }else{
      	    $("input[name='messageNoticeIds']").prop("checked",false);
         }
     });
	
	//判断全选时标题的复选框是否勾住
	function checkMessageNoticeIds(){
		var messageNoticeIdsTrue = $("input[name=messageNoticeIds]:checked").length;
		var messageNoticeIdsCount = $("input[name=messageNoticeIds]").length;
		if(parseInt(messageNoticeIdsTrue) == parseInt(messageNoticeIdsCount)){
			$("input[name='totalCheckbox']").prop("checked",true);
		}else{
			$("input[name='totalCheckbox']").prop("checked",false);
		}
	}
	
	//点击删除信息按钮
  	$("#deleteMessageNotice").bind('click', function(){   
  		$('input:checkbox:checked').each(function() {
  			messageNoticeIds.push($(this).val());
        });
  		if(messageNoticeIds.length == 0){
  			promptdialog("请选择要删除的信息");
  			return false;
  		}
  		if(messageNoticeIds.length > 0){
  			var data = "确定要将所选的信件删除";
  			var url = "${ctx}/messageNotice/intoMessageNotice.htm?&p=1&delete=delete&messageNoticeIds="+messageNoticeIds;
  			messagedialog(data,url);
  		}
    });
	//点击将信息标记为未读按钮
  	$("#markUnread").bind('click', function(){   
  		/* $("input[name='messageNoticeIds']:checked").each(function() {messageNoticeIds.push($(this).val());}); */
  		$("input[name='messageNoticeIds']:checked").each(function() {
  			messageNoticeIds.push($(this).val());
        });
  		if(messageNoticeIds.length == 0){
  			promptdialog("请选择要标记的内容");
  			return false;
  		}
  		if(messageNoticeIds.length > 0){
  			var data = "确定要将所选的信件标记为未读";
  			var url = "${ctx}/messageNotice/intoMessageNotice.htm?&p="+valp+"&unread=unread&messageNoticeIds="+messageNoticeIds;
  			messagedialog(data,url);
  			//window.location.href="${ctx}/messageNotice/intoMessageNotice.htm?&p=1&unread=unread&messageNoticeIds="+messageNoticeIds;
  		}
    });
  //点击将信息标记为已读按钮
  	$("#markRead").bind('click', function(){   
  		$("input[name='messageNoticeIds']:checked").each(function() {
  			messageNoticeIds.push($(this).val());
        });
  		if(messageNoticeIds.length == 0){
  			promptdialog("请选择要标记的内容");
  			return false;
  		}
  		if(messageNoticeIds.length > 0){
  			var data = "确定要将所选的信件标记为已读";
  			var url = "${ctx}/messageNotice/intoMessageNotice.htm?&p="+valp+"&read=read&messageNoticeIds="+messageNoticeIds;
  			messagedialog(data,url);
  			//window.location.href="${ctx}/messageNotice/intoMessageNotice.htm?&p=1&read=read&messageNoticeIds="+messageNoticeIds;
  		}
    });
		//警告对话框
		function promptdialog(data){
			KindEditor.ready(function(K) {
			var dialog = K.dialog({
					        width : 300,
					        title : '警告',
					        body : '<div style="margin:10px;color:red;"><strong>'+data+'</strong></div>',
					        css : {
				                border : '1px solid #A0A0A0',
				                background : 'red'
				       	 	},
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
		//信息提示对话框
		function messagedialog(data,url){
			KindEditor.ready(function(K) {
			var dialog = K.dialog({
					        width : 300,
					        title : '信息提示',
					        body : '<div style="margin:10px;"><strong>'+data+'</strong></div>',
					        css : {
				                border : '1px solid #A0A0A0',
				                background : 'red'
				       	 	},
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
	</script>
</html>