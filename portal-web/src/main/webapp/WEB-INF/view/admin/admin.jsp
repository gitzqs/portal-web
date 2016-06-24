<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/view/jspf/taglibs.jsp" %>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>portal 后台</title>
<link type="text/css" rel="stylesheet" href="${ctx}/css/admin/style.css" />
<link href="${ctx}/css/bootstrap.css" rel="stylesheet">
<script type="text/javascript" src="${ctx}/js/admin/jquery-1.8.3.min.js"></script>
<script type="text/javascript" src="${ctx}/js/admin/menu.js"></script>
<script type="text/javascript">
	function changeRightDiv(){
		$("#rightDiv").load("${ctx}/home/sys");
	}
</script>
</head>
<body onload="changeRightDiv()">
<div class="top"></div>
<div id="header">
	<div class="logo">portal后台管理</div>
	<div class="navigation">
		<ul>
		 	<li>欢迎您！</li>
			<li><a href="">${username}</a></li>
			<li><a href="">退出</a></li>
		</ul>
	</div>
</div>
<div id="content">
		<!-- 导航  begin-->
		<%@ include file="/WEB-INF/view/base/navigation.jsp" %>
		<!-- 导航 end -->
		<!-- 右边栏 begin -->
		<div class="m-right" id="rightDiv">
		<%-- <jsp:include page="/WEB-INF/view/admin/center/personal_profile.jsp" flush="true"/> --%>
		</div>
		<!-- 右边栏 end -->
</div>
<div class="bottom"></div>
</body>


</html>
