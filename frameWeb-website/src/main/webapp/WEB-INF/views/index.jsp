<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- 引入jstl解析标签 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html lang="zh-cn">
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>冰川网贷平台</title>
   	<!-- 引入公用的js和样式库 -->
	<jsp:include page="inc.jsp"/>
	</head>
	<style type="text/css">
		#tabsTemp td,th{
			text-align: center;
		}
		
	</style>
  <body>
  <jsp:include page="nav.jsp"/>

    <!-- Marketing messaging and featurettes ====================== -->
    <div class="container marketing">
    
	    <!-- Carousel ============================== -->
	    <div id="myCarousel" class="carousel slide" data-ride="carousel">
	      <!-- Indicators -->
	      <ol class="carousel-indicators">
	        <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
	        <li data-target="#myCarousel" data-slide-to="1"></li>
	        <li data-target="#myCarousel" data-slide-to="2"></li>
	      </ol>
	      <div class="carousel-inner">
	        <div class="item active">
	          <img src="${pageContext.request.contextPath}/resources/images/index/1.jpg" alt="First slide">
	          <div class="container">
	            <div class="carousel-caption">
	            </div>
	          </div>
	        </div>
	        <div class="item">
	          <img src="${pageContext.request.contextPath}/resources/images/index/2.jpg" alt="Second slide">
	          <div class="container">
	            <div class="carousel-caption">
	            </div>
	          </div>
	        </div>
	        <div class="item">
	          <img src="${pageContext.request.contextPath}/resources/images/index/3.jpg" alt="Third slide">
	          <div class="container">
	            <div class="carousel-caption">
	            </div>
	          </div>
	        </div>
	      </div>
	      <a class="left carousel-control" href="#myCarousel" data-slide="prev"><span class="glyphicon glyphicon-chevron-left"></span></a>
	      <a class="right carousel-control" href="#myCarousel" data-slide="next"><span class="glyphicon glyphicon-chevron-right"></span></a>
	    </div><!-- /.carousel -->

      <!-- Three columns of text below the carousel -->
      <div class="row">
      	<div class="col-lg-4">
          <img src="${pageContext.request.contextPath}/resources/images/index/5.jpg"  alt="Generic placeholder image">
          <h2>Title One</h2>
          <p>Contents</p>
          <p><a class="btn btn-default" href="${ctx}/borrowingProcess.htm" role="button">查看详情 >></a></p>
        </div><!-- /.col-lg-4 -->
        <div class="col-lg-4">
          <img src="${pageContext.request.contextPath}/resources/images/index/4.jpg" alt="Generic placeholder image">
          <h2>Title Two</h2>
          <p>Contents</p>
          <p><a class="btn btn-default" href="${ctx}/investmentProcess.htm" role="button">查看详情 >></a></p>
        </div><!-- /.col-lg-4 -->
        <div class="col-lg-4">
          <img src="${pageContext.request.contextPath}/resources/images/index/6.jpg"  alt="Generic placeholder image">
          <h2>Title Three</h2>
          <p>Contents</p>
          <p><a class="btn btn-default" href="${ctx}/riskGuarantee.htm" role="button">查看详情 >></a></p>
        </div><!-- /.col-lg-4 -->
      </div><!-- /.row -->

 	  <h3>最新公告</h3>
      <div class="row featurette">
        <div class="col-md-12">
          <table class="table table-hover">
	      	<tbody>
	          	<c:forEach items="${announcementDatas.rows}" var="announcement" begin="0" end="4" step="1">
			          <tr>
			            <td class="col-md-8">${announcement.webAnnTheme}</td>
			            <td class="col-md-2"><fmt:formatDate value="${announcement.createTime}" type="both"/></td>
			          	<td class="col-md-2"><a href="${ctx}/announcement/announcementDetail.htm?&webAnnId=${announcement.webAnnId}">查看详细</a></td>
			          </tr>
		      	</c:forEach>
		    </tbody>
	      	<tfoot>
	          <tr>
	            <th colspan="3"><h4 align="center"><a  href="${ctx}/announcement/announcement.htm?&p=1" >查看更多网站公告 >></a></h4></th>
	          </tr>
	        </tfoot>
	      </table>
        </div>
      </div>
      
      <h3>最新新闻</h3>
      <div class="row featurette">
        <div class="col-md-12">
          <table class="table table-hover">
	      	<tbody>
          		<c:forEach items="${newsDatas.rows}" var="news" begin="0" end="4" step="1">
		          <tr>
		            <td class="col-md-8">${news.webNewsTheme}</td>
		            <td class="col-md-2"><fmt:formatDate value="${news.createTime}" type="both"/></td>
		          	<td class="col-md-2"><a href="${ctx}/news/newsDetail.htm?&webNewsId=${news.webNewsId}">查看详细</a></td>
		          </tr>
	      		</c:forEach>
	      	</tbody>
	      	<tfoot>
	          <tr>
	            <th colspan="3"><h4 align="center"><a  href="${ctx}/news/news.htm?&p=1" >查看更多网站新闻 >></a></h4></th>
	          </tr>
	        </tfoot>
	      </table>
        </div>
      </div>
      
      <hr class="featurette-divider2">

      <!-- /END THE FEATURETTES -->
      <!-- /.container -->
	  <!-- FOOTER -->
   </div>
   <jsp:include page="foot.jsp"/>
  </body>
</html>