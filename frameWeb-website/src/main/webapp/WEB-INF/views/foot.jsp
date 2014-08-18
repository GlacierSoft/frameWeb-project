<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<% 
response.setContentType("text/html;charset=UTF-8");
request.setCharacterEncoding("utf-8"); 
%>
<%    
String path = request.getContextPath();    
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";    
%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link href="<%=basePath %>resources/css/foot/footOne.css" type="text/css" rel="stylesheet" />
<script src="<%=basePath %>resources/js/foot/footOne.js"></script>

</head>
<style>
.foot_div{width:100%;height:300px;border-top: 2px solid #11ACE2;background-color: #373A3F;font-family: "微软雅黑";color: #808080}  

.foot_youqing{width: 1200px;border-bottom: 2px solid #808080;float: left;}

.foot_kefu_left_one_ul ,.foot_kefu_left_one_ul li,.foot_kefu_left_two_ul,.foot_kefu_left_two_ul li{list-style: none;}

.foot_kefu_left_one_ul li{float:left; /* 往左浮动 */padding-right: 20px;line-height:50px;}
.foot_kefu_left_two_ul li{float:left; /* 往左浮动 */padding-right: 20px;line-height:50px; }
.foot_kefu_left_one_ul li a,.foot_kefu_left_two_ul li a{color: #808080;font-family: "微软雅黑";text-decoration: none;}
.foot_kefu_left_one_ul li a:HOVER,.foot_kefu_left_two_ul li a:HOVER {color: #11ACE2}
.ul_first,.ul_kefu_first{font-size: 18px;color:#808080; }

.foot_kefu{border-bottom: 2px solid #808080;width: 1200px; height: 95px;float: left;}
.foot_kefu_left{float: left;height: 95px;width: 796px;border: 0px solid red;float: left;}
.foot_kefu_right{float: left;height: 95px;width: 400px;border: 0px solid red;float: left;}
.foot_kefu_left_one{width: 800px;height:40px;border: 0px solid blue;float: left;}
.foot_kefu_left_two{width: 800px;height:50px;border: 0px solid white;float: left;}

.foot_other{width: 1200px;height:110px;border: 0px solid red;float: left;}
.foot_other_one{width: 900px;margin-left: 200px;height: 30px;border: 0px solid white;line-height: 30px;color:#808080;float: left; }
.foot_other_two{width: 600px;margin-left:300px;height: 30px;border: 0px solid white;line-height: 30px;color: #808080;float: left;}
.foot_other_three{width: 750px;margin-left: 200px;height: 40px;border: 0px solid white;vertical-align: middle;float:left;margin-top: 10px;}

.foot_other_three_ul,.foot_other_three_ul li{list-style: none;}
.foot_other_three_ul li{float:left; /* 往左浮动 */padding-right: 20px;line-height:40px; }

.Div_Test_One a:HOVER {color:#428BC9;}
.Div_Test_One a{color:  #808080;text-decoration: none;}

.foot_youqing_one{font-size: 18px;color:#808080 ;border: 0px solid green;width: 100px;height: 35px;float: left;margin-top: 15px;line-height: 35px;margin-bottom: 5px;}
.Div_Test_One{margin-top: 25px;width: 1100px;border: 0px solid red;float: left;margin-bottom: 20px;}

.foot_div_middle{}



</style> 
<body>
   <!--底部样式  -->
   <div class="foot_div" >
   
       <div class="container marketing">
         <!--友情链接(可循环内容)  -->
           <div class="foot_youqing">   
               <div class="foot_youqing_one">
                                                                      友情链接 : 
               </div>
               <div class="Div_Test_One" >
               </div>
            </div>   
           <!-- 客服服务 --> 
          <div class="foot_kefu">
                <div class="foot_kefu_left">
                     <div class="foot_kefu_left_one">
                        <ul class="foot_kefu_left_one_ul">
                            <li><a href="http://www.glaciersoft.cn/index.html">公司介绍</a></li>
                            <li><a href="http://www.glaciersoft.cn/index.html">合作伙伴</a></li>
                            <li><a href="http://www.glaciersoft.cn/index.html">安全保障</a></li>
                            <li><a href="http://www.glaciersoft.cn/index.html">冰川文化</a></li>
                            <li><a href="http://www.glaciersoft.cn/index.html">媒体报道</a></li>
                            <li><a href="http://www.glaciersoft.cn/index.html">联系报道</a></li>
                        </ul>
                     </div>
                     <div class="foot_kefu_left_two">
                          <ul class="foot_kefu_left_two_ul">
                            <li class="ul_kefu_first">客服服务 : </li>
                            <li><a href="http://www.glaciersoft.cn/index.html" ><img src="<%=basePath %>resources/images/foot/weibohui.png" style="width: 45px;height: 35px;"  id="img_one"></a></li>
                            <li class="li_test"><img src="<%=basePath %>resources/images/foot/weixinghui.png" id="img_two"  style="width: 45px;height: 35px;"></li>
                            <li><a href="http://www.glaciersoft.cn/index.html" ><img src="<%=basePath %>resources/images/foot/fenxianghui.png" id="img_three"  style="width: 45px;height: 35px;"></a></li>
                            <li><a target="_blank" href="http://wpa.qq.com/msgrd?v=3&uin=1060344404&site=qq&menu=yes"><img src="<%=basePath %>resources/images/foot/qiehui.png" id="img_four"  style="width: 43px;height: 35px;"></a></li>
                        </ul>
                     </div>
                </div>
                <div class="foot_kefu_right"> 
                      <div style="float: right;margin-top: 10px;">
                           <img src="<%=basePath %>resources/images/foot/erweima.png">
                      </div>
                      <div style="float: right;margin-top: 10px;">
                        <div style="flaot：right;text-align: right;padding-right: 5px;color:#808080;">客服电话</div>
                        <div style="flaot：right;font-size: 20px;text-align: right;padding-right: 5px;color:#808080;">400-080-3000</div>
                        <div style="flaot：right;text-align: right;padding-right: 5px;color:#808080;">24小时全天服务</div>
                      </div>
                </div>
          </div>
             
         <!--公司其它  -->
         <div class="foot_other">
             <div class="foot_other_one">地址：珠海市唐家镇哈工大路一号工大集团新经济资源开发港博士楼A301E 客服电话：400-080-3000 备案号：粤ICP备13002521号-1 </div>
             <div class="foot_other_two">珠海冰川-创建于贰零壹肆年 @2014 珠海冰川股份有限公司 版权所有 </div>
             <div class="foot_other_three">
                <ul class="foot_other_three_ul">
                     <li><a href=""><img src="<%=basePath %>resources/images/foot/foot_one.png" id="img_ones" style="width:90px;height: 40px;"></a></li>
                     <li><a href=""><img src="<%=basePath %>resources/images/foot/foot_two.png" id="img_twos" style="width:90px;height: 40px;"></a></li>
                     <li><a href=""><img src="<%=basePath %>resources/images/foot/foot_three.png" id="img_threes" style="width:90px;height: 40px;"></a></li>
                     <li><a href=""><img src="<%=basePath %>resources/images/foot/foot_four.png" id="img_fours" style="width:90px;height: 40px;"></a></li>
                     <li><a href=""><img src="<%=basePath %>resources/images/foot/foot_five.png" id="img_fives" style="width:90px;height: 40px;"></a></li>
                     <li><a href=""><img src="<%=basePath %>resources/images/foot/foot_six.png" id="img_sixs" style="width:90px;height: 40px;"></a></li>
                </ul>
             </div>
         </div>
         
          <!--二维码 -->
       <div class="foot_erweima" style="position:absolute;margin-top: 40px;margin-left: 155px; ">
            <img  id="this_erweima" src="<%=basePath %>resources/images/foot/erweima.png" title="扫一扫有惊喜!!" style="display: none">
       </div>
      </div>
   </div>
       
       
       
     <!-- 客服数据 --> 
     <div id="keFu_daohang" style="top:200px;width:70px;right:8px;position:fixed;z-index:9999;box-shadow:0px 0px 10px rgba(0, 0, 0, 0.3);border: 0px solid red;">
          <div style="width: 60px;height: 60px;float: right;border: 0px solid  red;margin-top: 5px;">
               <img title="点击展开客服列表" src="<%=basePath %>resources/images/foot/one.png" id="KeFuDivOne" style="cursor: pointer;">
          </div>
          <div style="width: 60px;height: 60px;float: right;border: 0px solid  red;margin-top: 5px;" >
                <img title="点击返回主页" src="<%=basePath %>resources/images/foot/two.png" id="KeFuDivTwo" style="cursor: pointer;">
          </div>
          <div style="width: 60px;height: 60px;float: right;border: 0px solid  red;margin-top: 5px;">
               <img title="点击回到顶部" src="<%=basePath %>resources/images/foot/three.png" id="KeFuDivThree" style="cursor: pointer;">
          </div>
     </div>
     
     <!--  客服展示页-->
     <Div id="keFu_Show" style="top:200px;width:183px;right:8px;position:fixed;display: none;">
          <Div style="width:150px;border: 6px solid #009CE7;border-radius:10px;background: #FFFFFF;float: right;" >
	          <Div style="float:left;margin-top: 10px;margin-left: 8px;width: 120px;height:40px;line-height:40px;border-top: 3px solid #00724F;text-align: center;color: #009CE7;background: #E4E4E5;">
	                 QQ在线咨询
	          </Div>
	          <Div style="float:left;margin-top: 5px;margin-left: 8px;width: 120px;height:30px;line-height:30px;border: 0px solid #00724F;text-align: center;color: #009CE7;background: #FFFFFF">
	               <img  src="<%=basePath %>resources/images/foot/zixun.png"> 在线咨询
	          </Div>
	           <Div style="float:left;margin-left: 8px;width: 120px;height:30px;line-height:30px;border: 0px solid #00724F;text-align: center;color: #009CE7;background: #FFFFFF">
	               <a href="http://qiao.baidu.com/v3/?module=default&controller=im&action=index&ucid=7542571&type=n&siteid=5128180" target="_blank"><img  src="<%=basePath %>resources/images/foot/zixun.png">商桥交谈</a>
	          </Div>
	          <Div  id="KeFu_PutIn" style="float:left;width:120px;margin-top: 5px;margin-left: 8px;line-height:32px;border: 0px solid #00724F;text-align: center;color: #009CE7;vertical-align:middle;">
                   <!--<a href="http://qiao.baidu.com/v3/?module=default&controller=im&action=index&ucid=7542571&type=n&siteid=5128180" target="_blank"></a> -->
	          </Div>
	          <Div style="float:left;margin-top: 10px;margin-left: 8px;width: 120px;height:30px;line-height:30px;border-top: 3px solid #E5E4E2;text-align: center;color: #009CE7;border-bottom: 3px solid #E5E4E2;">
	                                                      电话咨询
	          </Div>
	          <Div style="float:left;margin-left: 8px;width: 120px;height:40px;line-height:40px;text-align: center;color: #009CE7;border-bottom: 3px solid #E5E4E2;">
	               <img src="<%=basePath %>resources/images/foot/kefu_dianhua.png">0756 - 3628802
	          </Div>
	          <Div style="float:left;margin-left: 8px;width: 120px;height:35px;line-height:35px;text-align: center;color: #009CE7;border-bottom: 3px solid #E5E4E2;color: #FE8405;">
	               <img src="<%=basePath %>resources/images/foot/kefu_zixun.png"><a href="http://www.glaciersoft.cn/index.html" target="_blank">点我咨询</a>
	          </Div>
         </Div>
         
         <div style="width:30px;height:350px;border: 0px solid #009CE7;float: right;margin-bottom: 20px;">
                  <Div style="width:30px;height: 140px;border:0px solid blue;background: #16A6EC;color: white;text-align: center;margin-top: 100px;border-radius:5px;">
                      <a href="#" onclick="DoHide();" style="color: white;text-decoration: none;"><img src="<%=basePath %>resources/images/foot/online_kufu.png">在</br>线</br>客</br>服</br>>></a>
                  </Div>
          </div>
          
          
     
     </Div>
   
     
       
<script type="text/javascript">
     
       $("#img_one").mouseover(function(){$("#img_one").attr("src","<%=basePath %>resources/images/foot/weibo.png");}).mouseout(function(){$("#img_one").attr("src","<%=basePath %>resources/images/foot/weibohui.png");});
       $("#img_three").mouseover(function(){$("#img_three").attr("src","<%=basePath %>resources/images/foot/fenxiang.png");}).mouseout(function(){$("#img_three").attr("src","<%=basePath %>resources/images/foot/fenxianghui.png");});
       $("#img_four").mouseover(function(){$("#img_four").attr("src","<%=basePath %>resources/images/foot/qie.png");}).mouseout(function(){$("#img_four").attr("src","<%=basePath %>resources/images/foot/qiehui.png");});
       
       $("#img_ones").mouseover(function(){$("#img_ones").attr("src","<%=basePath %>resources/images/foot/foot_one_s.png");}).mouseout(function(){$("#img_ones").attr("src","<%=basePath %>resources/images/foot/foot_one.png");});
       $("#img_twos").mouseover(function(){$("#img_twos").attr("src","<%=basePath %>resources/images/foot/foot_two_s.png");}).mouseout(function(){$("#img_twos").attr("src","<%=basePath %>resources/images/foot/foot_two.png");});
       $("#img_threes").mouseover(function(){$("#img_threes").attr("src","<%=basePath %>resources/images/foot/foot_three_s.png");}).mouseout(function(){$("#img_threes").attr("src","<%=basePath %>resources/images/foot/foot_three.png");});
       $("#img_fours").mouseover(function(){$("#img_fours").attr("src","<%=basePath %>resources/images/foot/foot_four_s.png");}).mouseout(function(){$("#img_fours").attr("src","<%=basePath %>resources/images/foot/foot_four.png");});
       $("#img_fives").mouseover(function(){$("#img_fives").attr("src","<%=basePath %>resources/images/foot/foot_five_s.png");}).mouseout(function(){$("#img_fives").attr("src","<%=basePath %>resources/images/foot/foot_five.png");});
       $("#img_sixs").mouseover(function(){$("#img_sixs").attr("src","<%=basePath %>resources/images/foot/foot_six_s.png");}).mouseout(function(){$("#img_sixs").attr("src","<%=basePath %>resources/images/foot/foot_six.png");});

      $("#KeFuDivOne").click(function(){
    	   $("#keFu_daohang").hide();
    	   $("#keFu_Show").show();
       });
      
       function DoHide(){
    	   $("#keFu_Show").hide();
    	   $("#keFu_daohang").show();
       };
       
       $("#KeFuDivTwo").click(function(){
    	   location.href="<%=basePath%>/index.htm";
       });
       
       $("#KeFuDivThree").click(function(){
    	   $('body,html').animate({scrollTop:0},1000);
       });
       
       
        //微信二维码
        $(".li_test").bind({mouseenter:function(e){
	     	 $("#this_erweima").attr("style","display:block");
      	     $("#img_two").attr("src","<%=basePath %>resources/images/foot/weixing.png");
         },mouseleave:function(e){
           $("#this_erweima").attr("style","display:none");
           $("#img_two").attr("src","<%=basePath %>resources/images/foot/weixinghui.png");
     	}});
        
        $(function(){
    	   //友情链接数据读取
    	    $.ajax({
    	    	type:"post",
    	    	url:"<%=basePath%>link/list.json",
    	    	dataType:"json",
    	    	success:function(data){
    	    		//循环开始 
    	    		$.each(data.rows,function(index,comment){
    	    			    //alert("链接名称:"+comment.webLinkName+" 链接地址:"+comment.webLinkUrl); 
    	    		        $("<span style='padding-top: 20px;padding-right: 15px;color: #808080;'><a href='http://"+comment.webLinkUrl+"' target='_blank'>"+comment.webLinkName+"</a></span>").appendTo(".Div_Test_One");
    	    		  });
    	    	}
    	    });
    	   
    	   
    	    $.ajax({
     		   type:"post",
     		   url:"<%=basePath%>service/list.json",
     		   dataType:"json",
     		   success:function(data){
     		        //循环开始
     		        $.each(data.rows,function(i,v){
                           //alert("客服姓名:"+v.webServiceName+" 客服QQ:"+v.webServiceQq);   	
     		               $("<a target='_blank' href='http://wpa.qq.com/msgrd?v=3&uin="+v.webServiceQq+"&site=qq&menu=yes'><img border='0' src='http://wpa.qq.com/pa?p=2:1203807137:51' alt='点击这里给我发消息' title='点击这里给我发消息'/></a>").appendTo("#KeFu_PutIn");     
     		       });
     		   }
     		});
    	   
    	   
    	 });
       </script>
       
</body>
</html>
