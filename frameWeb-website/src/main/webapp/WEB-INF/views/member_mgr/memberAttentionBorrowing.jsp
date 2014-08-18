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
					          <a href="${ctx}/member/index.htm" class="btn btn-default" role="button">我的主页</a>
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
							  <a  href="#" onclick="doClick('borrowingLoan/memberBorrow.htm?p=1&loanState=repaymenting','${currentMember.memberId}');" class="btn btn-default" role="button">还款管理</a>
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
					      	  <a href="#" onclick="doClick('investment/memberTenderNotes.htm?p=1&loanStates=sucessBorrow','${currentMember.memberId}');" class="btn btn-default" role="button">我的投标</a>
			                  <a href="#" onclick="doClick('attentionBorrowing/memberAttentionBorrowing.htm?p=1','${currentMember.memberId}');" class="btn btn-info" role="button">我关注的借款</a>
			                  <a href="#" onclick="doClick('bankingStatistics/memberBankingStatistics.htm','${currentMember.memberId}');" class="btn btn-default" role="button">投资统计</a>
					      </div>
					    </div>
					  </div>
					</div>
				</div>
	    	</div>
	    	<div class="col-md-10">
	    		<div class="panel panel-default">
				  <div class="panel-heading">
				    <h3 class="panel-title">我关注的借款</h3>
				  </div>
				  <div class="panel-body">
				  <div id="attentionBorrowingList">
					   <div class="panel panel-default">
						  <div class="panel-heading">
						    <h4 class="panel-title"><strong>条件筛选</strong></h3>
						  </div>
						  <div class="panel-body"><!-- style="text-align:center;vertical-align: middle;" -->
						     <form id="attentionBorrowingForm"  class=" form-horizontal" role="form"  method="post" action="${ctx}/attentionBorrowing/memberAttentionBorrowing.htm?p=1" >
						      <div class="form-group">
						        <label for="cardId" class="col-sm-2 control-label" >发布时间</label>
							    <div class="col-sm-4">
								    <div class="input-group date form_datetime" data-link-field="dtp_input1">
					                    <input id="loanDateCreateStartTime" name="loanDateCreateStartTime" class="form-control" size="16" type="text" value="<fmt:formatDate value="${attentionBorrowingQueryDTO.loanDateCreateStartTime}" type="both"/>" readonly>
					                    <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
										<span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
					                </div>
						      		<input type="hidden" id="dtp_input3" name="memberId" value="${currentMember.memberId}" />
							    </div>
							    <label for="cardId" class="col-sm-1 control-label" style="text-align:center;vertical-align: middle;">到</label>
							    <div class="col-sm-4">
							    	<div class="input-group date form_datetime" data-link-field="dtp_input1">
					                    <input id="loanDateCreateEndTime" name="loanDateCreateEndTime" class="form-control" size="16" type="text" value="<fmt:formatDate value="${attentionBorrowingQueryDTO.loanDateCreateEndTime}" type="both"/>" readonly>
					                    <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
										<span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
					                </div>
							    </div>
							    <label for="cardId" class="col-sm-1 control-label" ></label>
							  </div>
							   <div class="form-group">
							    <label for="loanTitle" class="col-sm-1 control-label" >标题</label>
							     <div class="col-sm-3"><input type="text" class="form-control" id="loanTitle" name="loanTitle" value="${attentionBorrowingQueryDTO.loanTitle}"  placeholder="借款标题"  /></div>
							    <div class="col-sm-3 text-center"><button id="sucessBorrowFormButton" type="submit" class="btn btn-primary btn-lg btn-block">查&nbsp;&nbsp;询</button></div>
							    <div class="col-sm-3">
					            <button id="sucessBorrowFormButton" onclick="re()" type="reset" class="btn btn-primary btn-lg btn-block">重置条件</button>
							    </div>
							  	<div class="col-sm-2"></div>
							  	</div>
						     </form>
						  </div>
						</div>
					   <table id="attentionBorrowingTable" class="table table-bordered" style="text-align:center;vertical-align: middle;">
				  		<thead>
				  			<tr>
				              <td width=144px>标题</td>
				              <td>类型</td>
				              <td width="90px">还款方式</td>
				              <td>金额（元）</td>
				              <td>年利率</td>
				              <td>期限</td>
				              <td>发布时间</td>
				        	  <td width="135px">进度/剩余时间</td>
				              <td>信用等级</td>
				              <td>操作</td>
				            </tr>
				  		</thead>
				         	<tbody>
							<c:if test="${empty returnResultAttentionBorrowing.rows}">
							<tr>
					            <td colspan="10"><strong>暂无信息</strong></td>
					          </tr>
							</c:if>	  		
							<c:if test="${!empty returnResultAttentionBorrowing.rows}">  		
				            <c:forEach items="${returnResultAttentionBorrowing.rows}" var="attentionBorrowing" varStatus="status">
						      	<tr>
					              <td  style="border-bottom-width:0px;display:block;width:144px; height:43px; text-align:center; heword-break:keep-all;white-space:nowrap;overflow:hidden;text-overflow:ellipsis;">
					              <a href="#" onclick="doClicks('investment/investmentdetail.htm?p=1','${attentionBorrowing.loanId }','${attentionBorrowing.loanMemberId }')">
					                 ${attentionBorrowing.loanTitle}
					              </a>
					              </td>
					              <td>${attentionBorrowing.loanTenderDisplay}</td>
					              <td>${attentionBorrowing.repaymentTypeDisplay}</td>
					              <td>￥<fmt:formatNumber value="${attentionBorrowing.loanTotal}" pattern="#,#00.00"/></td>
					              <td><fmt:formatNumber value="${attentionBorrowing.loanApr}" pattern="#0.00%"/>%</td>
					              <td>${attentionBorrowing.loanDeadlinesId}个月</td>
					              <td><fmt:formatDate value="${attentionBorrowing.loanDate}" type="both"/></td>
					              <td><fmt:formatNumber value='${attentionBorrowing.alrTenderPro}' pattern='#0.00%'/>/剩余时间</td>
								  <td><img id="creditPhotoDivImg"  src="${attentionBorrowing.creditPhoto}" style="width: 34px;height: 24px ;" /></td>
								  <td><a href="#" onclick="doClickDelete('attentionBorrowing/delAttentionBorrowing.json','${currentMember.memberId}','${attentionBorrowing.attentionBorrowingId}')">删除</a></td>
					              </tr>
					      	</c:forEach>
					      	</c:if>	<!-- <span id="alrTenderPro${status.index}"><fmt:formatNumber value='${borrowingLoan.alrTenderPro*100}' pattern='#0.00'/></span>% -->
				            </tbody>
				            <c:if test="${!empty returnResultAttentionBorrowing.rows}">  
				            <tfoot>
					          <tr>
					            <th colspan="10">
					            	<div align="right">
									    <ul id='pageattentionBorrowing'></ul>
									</div>
								</th>
					          </tr>
					        </tfoot>
					       </c:if>	
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
    
    //构建表单
	function doClickDelete(url,str,attentionBorrowingId){
		// 创建Form  
		var form = $('<form></form>');  
		// 设置属性  
	    form.attr('action', '<%=basePath%>'+url);  
	    form.attr('method', 'post');  
	    // form的target属性决定form在哪个页面提交  (_self -> 当前页面 _blank -> 新页面)  
	    form.attr('target', '_self');  
	    // 创建Input  
	    var my_input = $('<input type="text" name="memberId" />');  

	    var at_input = $('<input type="text" name="attentionBorrowingId" />');  
	    my_input.attr('value', str);  
	    at_input.attr('value', attentionBorrowingId);
	    // 附加到Form  
	    form.append(my_input);   
	    form.append(at_input);  
	    //表单的构建是否 完成
	    form.appendTo(document.body).submit();
	 }
	 //构建表单
	function doClicks(url,loanId,str){
		// 创建Form  
		var form = $('<form></form>');  
		// 设置属性  
	    form.attr('action', '<%=basePath%>'+url);  
	    form.attr('method', 'post');  
	    // form的target属性决定form在哪个页面提交  (_self -> 当前页面 _blank -> 新页面)  
	    form.attr('target', '_self');  
	    // 创建Input  
	    var my_input = $('<input type="text" name="memberId" />'); 
	    var loanId_input = $('<input type="text" name="loanId" />'); 
	    my_input.attr('value', str);  
	    loanId_input.attr('value', loanId);
	    // 附加到Form  
	    form.append(my_input);  
	    form.append(loanId_input);  
	    //表单的构建是否 完成
	    form.appendTo(document.body).submit();
	 }
  	//bootstrap日期控件
  	$(".form_datetime").datetimepicker({
  		language:  'zh-CN',
        format: "yyyy-mm-dd",
        autoclose: true,
        todayBtn: true,
        todayHighlight: true,
        minView: 2,
        pickerPosition: "bottom-left"
    });
  	
  	
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
			return param;
		}
		
		var elementpageattentionBorrowing = $('#pageattentionBorrowing');

		//投标的设置分页的总页数
			var totalattentionBorrowing=${returnResultAttentionBorrowing.total}/10;
			if(parseInt(totalattentionBorrowing)==totalattentionBorrowing){
				var totalattentionBorrowing = parseInt(totalattentionBorrowing);
			}else {
				var totalattentionBorrowing = parseInt(totalattentionBorrowing)+1;
			}
			//关注借款的
			var attentionBorrowingOptions = {
			    bootstrapMajorVersion:3,
			    currentPage: ${returnResultAttentionBorrowing.p},
			    numberOfPages: 10,
			    totalPages:totalattentionBorrowing,
			    pageUrl: function(type, page, current){
			    	return "${ctx}/attentionBorrowing/memberAttentionBorrowing.htm?"+composeUrlParams()+"p="+page;
			    	}
			}
			
			//关注借款的
			elementpageattentionBorrowing.bootstrapPaginator(attentionBorrowingOptions);
		})
	<!-- 分页显示表格数据 结束 -->
	
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
		};
		//重置按钮
		function re(){  
			$("#loanTitle").attr("value","").attr("placeholder","借款标题");
	  		$("#loanDateCreateStartTime").attr("value","");
	  		$("#loanDateCreateEndTime").attr("value","");
		}
	</script>
</html>
