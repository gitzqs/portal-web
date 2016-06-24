<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/view/jspf/taglibs.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
  <link href="${ctx}/css/admin/new.css" rel="stylesheet">
</head>
<body>
		<div class="right-nav">
			<ul>
				<li><img src="${ctx}/images/admin/home.png"></li>
				<li style="margin-left:25px;">您当前的位置：</li>
				<li>个人简介</li>
			</ul>
		</div>
		<div class="main">
			<div class="row">
				<div class="col-lg-12 col-md-12">
					<div class="widget">
						<div class="widget-header">
							<div class="title">
								个人简介 
							</div>
						</div>
						<div class="widget-body">
							<form class="form-horizontal no-margin">
								<div class="form-group">
									<label for="userName" class="col-sm-2 control-label">姓名</label>
									<div class="col-sm-10">
										<input type="text" class="form-control" id="userName">
									</div>
								</div>
								
								<div class="form-group">
									<label for="userName" class="col-sm-2 control-label">职业</label>
									<div class="col-sm-10">
										<input type="text" class="form-control" id="profession">
									</div>
								</div>
								
								<div class="form-group">
									<label for="userName" class="col-sm-2 control-label">年龄</label>
									<div class="col-sm-10">
										<input type="text" class="form-control" id="age">
									</div>
								</div>
								
								<div class="form-group">
									<label for="userName" class="col-sm-2 control-label">手机号码</label>
									<div class="col-sm-10">
										<input type="text" class="form-control" id="mobile">
									</div>
								</div>
								
								<div class="form-group">
									<label for="userName" class="col-sm-2 control-label">邮箱</label>
									<div class="col-sm-10">
										<input type="text" class="form-control" id="email">
									</div>
								</div>

								<!-- <div class="form-group">
									<label for="pwd" class="col-sm-2 control-label">DOB</label>
									<div class="col-sm-10">
										<div class="row">
											<div class="col-md-4 col-sm-4 col-xs-4">
												<select id="DateOfBirthMonth" class="form-control">

												</select>
											</div>
											<div class="col-md-4 col-sm-4 col-xs-4">
												<select name="DateOfBirth_Day" class="form-control">

												</select>
											</div>
											<div class="col-md-4 col-sm-4 col-xs-4">
												<select name="DateOfBirth_Year" class="form-control">

												</select>
											</div>
										</div>
									</div>
								</div> -->
								<div class="form-group">
									<div class="col-sm-offset-2 col-sm-10">
										<button type="submit" class="btn btn-info">保存</button>
									</div>
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
</body>
</html>