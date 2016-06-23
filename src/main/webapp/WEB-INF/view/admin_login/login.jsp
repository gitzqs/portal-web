<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/view/jspf/taglibs.jsp" %>
<!DOCTYPE html>
<html lang="en" class="no-js">
    <head>
	
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>portal-web后台登录</title>
        <!-- CSS -->
        <link rel='stylesheet' href='http://fonts.googleapis.com/css?family=PT+Sans:400,700'>
        <link rel="stylesheet" href="${ctx}/css/admin_login/reset.css">
        <link rel="stylesheet" href="${ctx}/css/admin_login/supersized.css">
        <link rel="stylesheet" href="${ctx}/css/admin_login/style.css">
        <style type="text/css">
        	body {
        		background-image : url(/portal-web/images/admin_login/login-background.jpg);
        	}
        </style>
        
        <!-- Javascript -->
        <script src="${ctx}/js/jquery.min.js"></script>
        <script src="${ctx}/js/admin_login/supersized-init.js"></script>
        <script src="${ctx}/js/admin_login/supersized.3.2.7.min.js"></script>
        <script src="${ctx}/js/admin_login/scripts.js"></script>
        <script src="${ctx}/js/admin_login/login.js"></script>

    </head>

    <body>

        <div class="page-container">
            <h1>portal-web后台管理系统</h1>
            <form action="${ctx}/admin/handleLogin" method="post" id="loginForm">
            	<span style="color:red">${error}</span>
                <input type="text" name="username" id="username" class="username" placeholder="登录名">
                <input type="password" name="password" id="password" class="password" placeholder="密码">
            </form>
            <button onclick="loginSubmit();">登录</button>
        </div>

    </body>

</html>

