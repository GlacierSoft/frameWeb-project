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
          <h2>信用借款</h2>
          <p>成为借款人，按照要求完善信用信息，获得信用认证后，通过发标进行借款，最快2.5小时可获得所需资金。</p>
          <p><a class="btn btn-default" href="${ctx}/borrowingProcess.htm" role="button">查看详情 >></a></p>
        </div><!-- /.col-lg-4 -->
        <div class="col-lg-4">
          <img src="${pageContext.request.contextPath}/resources/images/index/4.jpg" alt="Generic placeholder image">
          <h2>投资理财</h2>
          <p>成为理财人，通过主动投标或加入优选理财计划将资金进行出借投资，可获得预期12%-14%的稳定年化收益。</p>
          <p><a class="btn btn-default" href="${ctx}/investmentProcess.htm" role="button">查看详情 >></a></p>
        </div><!-- /.col-lg-4 -->
        <div class="col-lg-4">
          <img src="${pageContext.request.contextPath}/resources/images/index/6.jpg"  alt="Generic placeholder image">
          <h2>安全保障</h2>
          <p>所有投资标的100%适用本金保障计划，如遇借款人违约，人人贷将通过风险备用金有效保障理财人的本金安全。</p>
          <p><a class="btn btn-default" href="${ctx}/riskGuarantee.htm" role="button">查看详情 >></a></p>
        </div><!-- /.col-lg-4 -->
      </div><!-- /.row -->

	  <h3>投资列表</h3>
      <div class="row featurette">
        <div class="col-md-12">
          <table class="table table-bordered" id="tabsTemp">
	        <thead>
	          <tr>
	            <th>借款标题</th>
	            <th>信用等级</th>
	            <th>借款类型</th>
	            <th>年利率</th>
	            <th>借款金额</th>
	            <th>借款期限</th>
	            <th>借款状态</th>
	            <th>投标进度</th>
	          </tr>
	        </thead>
	        <tbody>
          		<c:forEach items="${borrowingDatas.rows}" var="borrowingLoan" varStatus="status">
		          <tr>
		            <td><a href="${ctx}/investment/investmentdetail.htm?loanId=${borrowingLoan.loanId }&memberId=${borrowingLoan.memberId }&p=1">
			        	${borrowingLoan.loanTitle }
			        	</a>
			        </td>
		            <td><img id="creditPhotoDivImg" src="${borrowingLoan.creditPhoto}" style="width: 34px;height: 24px ;" /></td>
		            <td>${borrowingLoan.loanTenderDisplay}</td>
	    			<td><fmt:formatNumber value='${borrowingLoan.loanApr*100}' pattern='#0'/>%</td>
		            <td><fmt:formatNumber value='${borrowingLoan.loanTotal}' pattern='#,#00.00'/>&nbsp;元</td>
		            <td>${borrowingLoan.waitBidDeadlines}个月</td>
					<td>
		            	<span id="borrowingLoan_loanState2${status.index}"></span>
		        		<script type="text/javascript">
				       		$('#borrowingLoan_loanState2'+${status.index}).html(renderGridValue('${borrowingLoan.loanState }',fields.loanState));
				    	</script>
	    			</td>
	    			<td align="center">
	    				<div style="position:absolute; padding-left: 45px;">
	    					<span id="alrTenderPro${status.index}" ><fmt:formatNumber value='${borrowingLoan.alrTenderPro*100}' pattern='#0.00'/></span>%</div>
		            	<div class="progress" style="border: 1px solid #DDDDDD;">
			        		<div id="progressBar${status.index}" class="progress-bar progress-bar-warning" role="progressbar" aria-valuenow="${borrowingLoan.alrTenderPro*100}" aria-valuemin="0" aria-valuemax="100" style="width: ${borrowingLoan.alrTenderPro*100}%"></div>
						</div>
					</td>
		          </tr>
	      		</c:forEach>
	      	</tbody>
	      	<tfoot>
	          <tr>
	            <th colspan="8"><h4 align="center"><a  href="${ctx}/investment/index.htm?&p=1" >查看更多投资理财项目 >></a></h4></th>
	          </tr>
	        </tfoot>
	      </table>
        </div>
      </div>

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