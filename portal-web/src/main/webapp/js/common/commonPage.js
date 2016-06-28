var strPath = window.document.location.pathname;
var postPath = strPath.substring(0, strPath.substr(1).indexOf('/') + 1);

//ajax请求获取数据展示到页面上
function bindData(){
	$.ajax({
		type : 'get',
		dataType : 'json',
		url : postPath + "/base/bindData",
		data : {
			pageNum : 0,
			pageSize : 3
		},
		ajaxStart : function(){$("#load").show();},
		complete : function(){$("#load").hide();},
		success : function(data){
			//清空原有数据
			$("#tbody_data").html("");
			//加入现有数据
			showData(data);
			//设置尾部导航
			setPageBar(data,1,3);
		}
	});
}

//数据展示
function showData(data){
	var rows = data.rows;
	$.each(rows,function(i,item){
		$("#tbody_data").append("<tr class='gradeX warning'><td>"+item.NAME+"</td><td>"
				+item.URL+"</td><td>"+item.LEVEL+"</td><td>"+item.HIGH_ID+"</td></tr>");
	});
}

function setPageBar(data,curPage,pageSize){
	var total = data.total;
	
	var total_size = Math.ceil(total/pageSize);
	
	//当前页为第一页
	if(curPage == 1){
		$("#pageBar").append("<span><a href='javascript:void(0);' class='pageBarNoSelect'>首页</a></span>");
		$("#pageBar").append("<span><a href='javascript:void(0);' class='pageBarNoSelect'>上一页</a></span>");
		$("#pageBar").append("<span style='float:left'>第"+curPage+"页&nbsp;共"+total_size+"页</span>");
		$("#pageBar").append("<span><a href='javascript:nextPage(\""+curPage+"\");' class='pageBarSelected'>下一页</a></span>");
		$("#pageBar").append("<span><a href='javascript:lastPage(\""+total_size+"\");' class='pageBarSelected'>尾页</a></span>");
	}
	/*if(curPage == total_size){
		$("#pageBar").append("<span><a href='javascript:firstPage(\""+1+"\");' class='pageBarSelected'>首页</a></span>");
		$("#pageBar").append("<span><a href='javascript:prePage(\""+curPage+"\");' class='pageBarSelected'>上一页</a></span>");
		$("#pageBar").append("<span>第"+curPage+"页&nbsp;共"+total_size+"页</span>");
		$("#pageBar").append("<span><a href='javascript:void(0);' class='pageBarNoSelect'>下一页</a></span>");
		$("#pageBar").append("<span><a href='javascript:void(0);' class='pageBarNoSelect'>尾页</a></span>");
	}else{
		$("#pageBar").append("<span><a href='javascript:firstPage(\""+1+"\");' class='pageBarSelected'>首页</a></span>");
		$("#pageBar").append("<span><a href='javascript:prePage(\""+curPage+"\");' class='pageBarSelected'>上一页</a></span>");
		$("#pageBar").append("<span>第"+curPage+"页&nbsp;共"+total_size+"页</span>");
		$("#pageBar").append("<span><a href='javascript:nextPage(\""+curPage+"\");' class='pageBarSelected'>下一页</a></span>");
		$("#pageBar").append("<span><a href='javascript:lastPage(\""+total_size+"\");' class='pageBarSelected'>尾页</a></span>");
	}*/
	
	
}