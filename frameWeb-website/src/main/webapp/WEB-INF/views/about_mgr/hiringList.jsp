<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%><!-- 引入jstl解析标签 -->
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %><!-- 引入自定义权限标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
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
		ol, ul {
		    list-style: none outside none;
		    margin: 0;
    		padding: 0;
		}
	</style>
  </head>

  <body>
  <jsp:include page="../nav_mgr/navAbout.jsp"/>
       
	    <div class="container">
		  	<div class="row">
		    	<div class="col-md-12">
		    		<div class="panel panel-default">
					  <div class="panel-heading">
					    <h3 class="panel-title">关于我们 / 招纳贤士</h3>
					  </div>
					  <div class="panel-body">
				          
				          <h3  style="padding-top: 20px;">招聘职位</h3>
					      
				          <div>
					          <table class="table table-hover">
					          	<c:forEach items="${hiringDatas.rows}" var="hiring">
							        <tbody>
							          <tr>
							            <td class="col-md-9">${hiring.webHiringTheme}</td>
							            <td class="col-md-3"><fmt:formatDate value="${hiring.createTime}" type="both"/></td>
							          </tr>
							      	</tbody>
						      	</c:forEach>
						      	<tfoot>
						          <tr>
						            <th colspan="2">
						            
						            	<div align="right">
										    <ul id='pageHiring'></ul>
										</div>
	
									</th>
						          </tr>
						        </tfoot>
						      </table>
					      </div>
	
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
	
	var element = $('#pageHiring');
	
	//设置分页的总页数
	var total=${hiringDatas.total}/5;
	if(parseInt(total)==total){
		var total = parseInt(total);
	}else {
		var total = parseInt(total)+1;
	}
	
	var options = {
	    bootstrapMajorVersion:3,
	    currentPage: ${hiringDatas.p},
	    numberOfPages: 5,
	    totalPages:total,
	    pageUrl: function(type, page, current){
	    	return "${ctx}/hiring/hiringList.htm?"+composeUrlParams()+"&p="+page;
	    	}
	}
	
	element.bootstrapPaginator(options);
	})
</script>

  </body>
</html>