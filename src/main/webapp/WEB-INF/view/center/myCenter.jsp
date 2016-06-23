<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/view/jspf/taglibs.jsp" %>
<!DOCTYPE html>
<html>
<head>
<title>center</title>
<meta name="viewport" content="width=device-width, initial-scale=1">

<link href="${ctx}/css/bootstrap.css" rel='stylesheet' type='text/css' />
<link href="${ctx}/css/center/style.css" rel="stylesheet" type="text/css" media="all" />
<link href='http://fonts.googleapis.com/css?family=Maven+Pro:400,700,500,900' rel='stylesheet' type='text/css'>

<script type="application/x-javascript">
	 addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } 
</script>

<script src="${ctx}/js/jquery.min.js"></script>
<script type="text/javascript" src="${ctx}/js/center/move-top.js"></script>
<script type="text/javascript" src="${ctx}/js/center/easing.js"></script>
<script type="text/javascript">
			jQuery(document).ready(function($) {
				$(".scroll").click(function(event){		
					event.preventDefault();
					$('html,body').animate({scrollTop:$(this.hash).offset().top},1200);
				});
			});
</script>
<script>
			$("span.menu").click(function(){
				$(".top-menu ul").slideToggle("slow" , function(){
				});
			});
</script>
<script src="${ctx}/js/center/jquery.wmuSlider.js"></script> 
<script>
       $('.example1').wmuSlider();         
</script> 	   
 <script type="text/javascript">
		jQuery(document).ready(function($) {
			$(".scroll").click(function(event){		
				event.preventDefault();
				$('html,body').animate({scrollTop:$(this.hash).offset().top},1200);
			});
		});
</script>
 <!-- footer-->
   <script type="text/javascript">
		$(document).ready(function() {
				$().UItoTop({ easingType: 'easeOutQuart' });
							
		});
   </script>
</head>
<body>
    <div class="header">
	       <div class="header-top">
		   <div class="container">
		       <div class="logo">
			      <a href=""><img src="${ctx}/images/center/logo.png" class="img-responsive" alt="" /></a>
			   </div>
			   <div class="top-menu">
			   <span class="menu"> </span>
			      <ul>
				      <li><a href="#aboutus" class="scroll">个人简介</a></li>
					  <li><a href="#work" class="scroll">工作经历</a></li>
					  <li><a href="#clients" class="scroll">项目案例</a></li>
					  <li><a href="#contact" class="scroll">未完待续</a></li>
					  <div class="clearfix"></div>
				  </ul>
			   </div>
		
			   <div class="clearfix"></div>
		   </div>
	   </div>
    
	<div class="index-banner">
	  <div class="container">
       	   <div class="wmuSlider example1">
			   <div class="wmuSliderWrapper">
				   <article style="position: relative; width: 100%; opacity: 1;"> 
				   	   <div class="banner-wrap">
				   	      <div class="bannertop_box">
                               <h1>您好,<span>我是${name}。</span></h1>
								<label>${profession}</label>
								<p>when unknown printer took galley of type Ipsum is not simply random text.</p>
				   		 	    <p>There are many variations passages of Lorem available, images etc. </p>
							    <p>The standard since <span class="bold">1500s</span> template. Ihope you enjoy it!<span class="bold block">Lorem Ipsum.</span></p>
				   		 	</div>
							
				   		 	<div class="banner_right">
				   		 		<img src="${ctx}/images/center/slider-img4.jpg" class="img-responsive" alt="" />
				   		 	</div>
				   		 	<div class="clearfix"></div>
				   		</div>
				   </article>
				 </div>
            </div>
                    	      
      </div>
	  </div>
	  </div>


  <div class="content">
  <!-- about-section-starts -->
    <div class="about-section" id="aboutus">
	    <div class="about-section-head text-center">
		   <div class="container">
		      <h3>个人简介</h3>
			  <p>Well, you can write something about yourself. For example, full name,  age, your geolocation and etc. And specific of your work. Maybe your work focused on UI / Web / Graphic or Motion design. I don't know :)</p>
		   </div>
		</div>
		<div class="about-section-grids">
		    <div class="about-section-top-grid">
			   <div class="container">
			       <div class="col-md-3 about-section-top-left-grid">
				      <h4>Software</h4>
				   </div>
				   <div class="col-md-9 about-section-top-right-grid">
				      <p>Ps | Ai | Id | Ae | Mu | Cinema4d | 3dsMax + Vray</p>
				   </div>
				   <div class="clearfix"></div>
			   </div>
			</div>
			<div class="about-section-middle-grid">
			   <div class="container">
			       <div class="col-md-3 about-section-middle-left-grid">
				      <h4>Skills</h4>
				   </div>
				   <div class="col-md-9 about-section-middle-right-grid">
				      <p>Conceptual thinking | Web | Illustration | Identity | Team work</p>
				   </div>
				   <div class="clearfix"></div>
			   </div>
			</div>
			<div class="about-section-bottom-grid">
			   <div class="container">
			       <div class="col-md-3 about-section-bottom-left-grid">
				      <h4>Hobby</h4>
				   </div>
				   <div class="col-md-9 about-section-bottom-right-grid">
				      <p>Music | Movies | Sport | Art | Photography</p>
				   </div>
				   <div class="clearfix"></div>
			   </div>
			</div>
		</div>
	</div>
	
	<div class="work-section" id="work">
	    <div class="container">
		  <div class="work-section-head text-center">
		     <h3>工作经历</h3>
		  </div>
		  <div id="portfoliolist">
					<div class="portfolio card mix_all" data-cat="card" style="display: inline-block; opacity: 1;">
						 <div class="portfolio-wrapper">	
							<a class="lightbox" href="#goofy">
								   <img src="${ctx}/images/center/pic1.jpg" class="img-responsive" alt="" />
						  	
								</a> 
								<div class="lightbox-target" id="goofy">
								<img src="${ctx}/images/center/pic1.jpg" class="img-responsive" alt="" />
								   <a class="lightbox-close" href="#"></a>
								</div>
						 </div>

					</div>				
					<div class="portfolio app mix_all" style="display: inline-block; opacity: 1;">
						<div class="portfolio-wrapper">		
							<a class="lightbox" href="#goofy">
								   <img src="${ctx}/images/center/pic2.jpg" class="img-responsive" alt="" />
						  
								</a> 
					    </div>
					</div>		
					<div class="portfolio web mix_all" data-cat="web" style="display: inline-block; opacity: 1;">
						<div class="portfolio-wrapper">		
							<a class="lightbox" href="#goofy">
								   <img src="${ctx}/images/center/pic3.jpg" class="img-responsive" alt="" />
	
								</a>

					</div>	
					</div>					
					<div class="portfolio icon mix_all" data-cat="icon" style="display: inline-block; opacity: 1;">
						<div class="portfolio-wrapper">		
							<a class="lightbox" href="#goofy">
								   <img src="${ctx}/images/center/pic4.jpg" class="img-responsive" alt="" /><div class="b-wrapper">
						  	</div>
								</a> 
					    </div>

					</div>
					<div class="portfolio icon mix_all" data-cat="icon" style="display: inline-block; opacity: 1;">
						<div class="portfolio-wrapper">		
							<a class="lightbox" href="#goofy">
								   <img src="${ctx}/images/center/pic5.jpg" class="img-responsive" alt="" />
	
								</a>  
					    </div>

					</div>
					<div class="portfolio app mix_all" data-cat="app" style="display: inline-block; opacity: 1;">
						<div class="portfolio-wrapper">		
							<a class="lightbox" href="#goofy">
								   <img src="${ctx}/images/center/pic6.jpg" class="img-responsive" alt=""/>
								</a> 
					    </div>
					</div>			
					<div class="portfolio card mix_all" data-cat="card" style="display: inline-block; opacity: 1;">
						<div class="portfolio-wrapper">		
							<a class="lightbox" href="#goofy">
								   <img src="${ctx}/images/center/pic7.jpg" class="img-responsive" alt=""/>
								</a> 
					    </div>
					</div>	
					<div class="portfolio card mix_all" data-cat="card" style="display: inline-block; opacity: 1;">
						<div class="portfolio-wrapper">		
							<a class="lightbox" href="#goofy">
								   <img src="${ctx}/images/center/pic8.jpg" class="img-responsive" alt=""/>
								</a> 
					    </div>
					</div>	
					<div class="portfolio icon mix_all" style="display: inline-block; opacity: 1;">
						<div class="portfolio-wrapper">		
							<a class="lightbox" href="#goofy">
								   <img src="${ctx}/images/center/pic9.jpg" class="img-responsive" alt=""/>
								</a> 
					    </div>
						</div>
<div class="clearfix"></div>					
				</div>
		  <div class="clearfix"></div>
		  <span class="more">MORE ON <a href="#">BEHANCE</a></span>

		  </div>
		  </div>
		 
	<!-- work-section-ends -->
	<!-- clients-section-starts -->
	   <div class="clients-section" id="clients">
	      <div class="container">
		    <div class="clients-section-head text-center">
			   <h3>项目案例</h3>
			</div>
			<div class="clients-section-grids text-center">
			   <div class="col-md-4 client-section-grid">
			    <img src="${ctx}/images/center/client1.png" alt="" />
			 </div>
			 <div class="col-md-4 client-section-grid">
			    <img src="${ctx}/images/center/client2.png" alt="" />
			 </div>
			 <div class="col-md-4 client-section-grid">
			    <img src="${ctx}/images/center/client3.png" alt="" />
			 </div>
			 <div class="clearfix"></div>
			 <div class="col-md-4 client-section-grid">
			    <img src="${ctx}/images/center/client2.png" alt="" />
			 </div>
			 <div class="col-md-4 client-section-grid">
			    <img src="${ctx}/images/center/client3.png" alt="" />
			 </div>
			 <div class="col-md-4 client-section-grid">
			    <img src="${ctx}/images/center/client1.png" alt="" />
			 </div>
			 <div class="clearfix"></div>
			 <div class="col-md-4 client-section-grid">
			    <img src="${ctx}/images/center/client3.png" alt="" />
			 </div>
			 <div class="col-md-4 client-section-grid">
			    <img src="${ctx}/images/center/client1.png" alt="" />
			 </div>
			 <div class="col-md-4 client-section-grid">
			    <img src="${ctx}/images/center/client2.png" alt="" />
			 </div>
			 <div class="clearfix"></div>
			</div>
		  </div>
	   </div>
	</div>

	<div class="contact-section" id="contact">
	<div class="container">
	    <div class="contact-section-head text-center">
		   <h3>未完待续</h3>
		</div>
		<div class="comments-area">
		    <form>
			   <p> 
			   <label>YOUR NAME</label>
			   <input type="text" value="" >
			   </p>
			   <p> 
			   <label>YOUR EMAIL</label>
			   <input type="text" value="" >
			   </p>
			   <p> 
			   <label>YOUR MESSAGE</label>
			   <textarea></textarea>
			   </p>
			   <div class="submit">
			     <input type="submit" value="submit">
			   </div>
			</form>
		</div>
		<div class="social-icons">
		  <a href="#"><i class="behance-icon"></i></a>
		  <a href="#"><i class="dribble-icon"></i></a>
		  <a href="#"><i class="linkein-icon"></i></a>
		  <a href="#"><i class="vimeo-icon"></i></a>
		  <a href="#"><i class="twitter-icon"></i></a>
		  <a href="#"><i class="facebook-icon"></i></a>
		  <a href="#"><i class="skype-icon"></i></a>
		</div>
	</div>
	</div>
	<!-- contact-section-ends -->
  <!-- content-ends -->
     <!-- footer-->
	<div class="footer">
		<div class="container">
			<div class="copyright">
				<p>&copy; 2014 Template by <a href="http://w3layouts.com" target="target_blank">W3layouts</a></p>
			</div>
		</div>
	</div>
   
		<a href="#" id="toTop" style="display: block;"> <span id="toTopHover" style="opacity: 1;"> </span></a>
</body>
</html>