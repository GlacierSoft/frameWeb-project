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
					        <li><a href="${ctx}/aboutUs.htm">公司简介</a></li>
					        <li><a href="${ctx}/announcement/announcement.htm?&p=1">网站公告</a></li>
						    <li class="active"><a href="${ctx}/news/news.htm?&p=1">网站新闻</a></li>
					        <li><a href="${ctx}/hiring/hiring.htm?&p=1">招纳贤士</a></li>
					        <li><a href="${ctx}/contactUs.htm">联系我们</a></li>
					        <li><a href="${ctx}/others/otherAddress.htm">公司地图</a></li>
					        <li><a href="${ctx}/others/others.htm">其他业务</a></li>
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
				    <h3 class="panel-title">关于我们 / 网站新闻</h3>
				  </div>
				  <div class="panel-body">
			          <h2>网站新闻</h2>
			          <div>
			           <p>我们是一支在互联网和金融领域非常优秀的团队！我们有梦有理想，我们积极乐观，脚踏实地，充满激情！如果你也和我们一样，那么欢迎你加入我们的团队！</p>
			           <p></p>
			          </div>
			          
			          <h3  style="padding-top: 20px;">新闻列表</h3>
				      
			          <div>
				          <table class="table table-hover">
				          	<tbody>
				          		<c:forEach items="${newsDatas.rows}" var="news">
						          <tr>
						            <td class="col-md-7">${news.webNewsTheme}</td>
						            <td class="col-md-3"><fmt:formatDate value="${news.createTime}" type="both"/></td>
						          	<td class="col-md-2"><a href="#" onclick="doClick('${news.webNewsId}');">查看详细</a></td>
						          </tr>
					      		</c:forEach>
					      	</tbody>
					      	<tfoot>
					          <tr>
					            <th colspan="3">
					            
					            	<div align="right">
									    <ul id='pageNews'></ul>
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
	
	//构建表单
	function doClick(str){
		// 创建Form  
	    var form = $('<form></form>');  
		// 设置属性  
	    form.attr('action', '<%=basePath%>news/newsDetail.htm');  
	    form.attr('method', 'post');  
	    // form的target属性决定form在哪个页面提交  (_self -> 当前页面 _blank -> 新页面)  
	    form.attr('target', '_self');  
	    // 创建Input  
	    var my_input = $('<input type="text" name="webNewsId" />');  
	    my_input.attr('value', str);  
	    // 附加到Form  
	    form.append(my_input); 
	    //表单设置隐藏
	    form.css('display','none');
	    //表单的构建 完成并提交
	    form.appendTo(document.body).submit();
	 }

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
	
	var element = $('#pageNews');
	
	//设置分页的总页数
	var total=${newsDatas.total}/10;
	if(parseInt(total)==total){
		var total = parseInt(total);
	}else {
		var total = parseInt(total)+1;
	}
	
	var options = {
	    bootstrapMajorVersion:3,
	    currentPage: ${newsDatas.p},
	    numberOfPages: 5,
	    totalPages:total,
	    pageUrl: function(type, page, current){
	    	return "${ctx}/news/news.htm?"+composeUrlParams()+"&p="+page;
	    	}
	}
	
	element.bootstrapPaginator(options);
	})
</script>
	    
	    
  </body>
</html>