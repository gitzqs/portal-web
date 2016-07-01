<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/view/jspf/taglibs.jsp" %>
<link href="${ctx}/css/center/new.css" rel="stylesheet">
<script type="text/javascript" src="${ctx}/js/bootstrap.min.js"></script>
<script type="text/javascript" src="${ctx}/js/common/commonPage.js"></script>
<script type="text/javascript">
	/* 数据展示*/
	function showData(data){
		var rows = data.rows;
		$.each(rows,function(i,item){
			$("#tbody_data").append("<tr class='gradeX warning'><td>"+item.NAME+"</td><td>"
					+item.URL+"</td><td>"+item.LEVEL+"</td><td>"+item.HIGH_NAME+"</td></tr>");
		});
	}
	$(function(){
		bindData(0,'sysUrlService');
	});
</script>
<style type="text/css">
	.pageBarSelected{
		background : #3693cf;
		color : white;
		padding : 5px 10px;
		float : left;
		margin-right:5px;
		text-decoration:none;
	}
	.pageBarNoSelect{
		background : #ccc;
		color : white;
		padding : 5px 10px;
		float : left;
		margin-right:5px;
		text-decoration:none;
	}
	.pageBarSpan{
		float:left;
		margin-top:5px;
		margin-left:5px;
		margin-right:5px;
	}
</style>

			<div class="right-nav">
					<ul>
							<li><img src="${ctx}/images/admin/home.png"></li>
								<li style="margin-left:25px;">您当前的位置：</li>
								<li>系统管理</li>
						</ul>
			</div>
	<div class="main">
		<input type="hidden" id="offset" name="offset" value="0"/>
		<input type="hidden" id="rows" name="rows" value="10"/>
		<div class="dashboard-container">

			<div class="container">
				<!-- Row Start -->
				<div class="row">
					<div class="col-lg-12 col-md-12">
						<div class="widget">
							<div class="widget-header">
								
							</div>
							<div class="widget-body">
								<div id="dt_example" class="example_alt_pagination">
									<table
										class="table table-condensed table-striped table-hover table-bordered pull-left"
										id="data-table">

										<thead>
											<tr>
												<th style="width: 17%">菜单名称</th>
												<th style="width: 20%">菜单路径</th>
												<th style="width: 16%">级别</th>
												<th style="width: 16%" class="hidden-phone">上级菜单</th>
											</tr>
										</thead>
										<tbody id="tbody_data">
										
										</tbody>
										<tfoot id="load">
											<tr>
												<td align="center" colspan="11"><img
													src="${ctx}/images/jiazai.gif" /></td>
											</tr>
										</tfoot>
									</table>
									<div class="clearfix" id="pageBar"></div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>