<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/view/jspf/taglibs.jsp" %>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>portal 后台</title>
<link type="text/css" rel="stylesheet" href="${ctx}/css/admin/style.css" />
<script type="text/javascript" src="${ctx}/js/admin/jquery-1.8.3.min.js"></script>
<script type="text/javascript" src="${ctx}/js/admin/menu.js"></script>
</head>

<body>
<div class="top"></div>
<div id="header">
	<div class="logo">portal后台管理</div>
	<div class="navigation">
		<ul>
		 	<li>欢迎您！</li>
			<li><a href="">张山</a></li>
			<li><a href="">修改密码</a></li>
			<li><a href="">设置</a></li>
			<li><a href="">退出</a></li>
		</ul>
	</div>
</div>
<div id="content">
	<div class="left_menu">
				<ul id="nav_dot">
      <li>
          <a href="javascript:popMemu('listOne');"><h4 class="M1"><span></span>系统公告</h4></a>
          <div id="listOne" class="list-item none">
            <a href=''>系统公告1</a>
            <a href=''>系统公告2</a>
            <a href=''>系统公告3</a>
            <a href=''>系统公告4</a>
          </div>
        </li>
  </ul>
		</div>
		<div class="m-right">
			<div class="right-nav">
					<ul>
							<li><img src="${ctx}/images/admin/home.png"></li>
								<li style="margin-left:25px;">您当前的位置：</li>
								<li><a href="#">系统公告</a></li>
								<li>1111</li>
								<li><a href="#">最新公告</a></li>
						</ul>
			</div>
			<div class="main">
				
			</div>
		</div>
</div>
<div class="bottom"></div>
</body>

<script type="text/javascript">
	//弹出、收回下拉框
	function popMemu(list){
		var className = $("#"+list).attr('class');
		if(className == 'list-item none'){
			$("#"+list).attr('class','list-item');
			return ;
		}
		if(className == 'list-item'){
			$("#"+list).attr('class','list-item none');
			return ;
		}
	}
</script>
</html>
