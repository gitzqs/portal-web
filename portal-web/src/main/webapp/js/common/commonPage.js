var strPath = window.document.location.pathname;
var postPath = strPath.substring(0, strPath.substr(1).indexOf('/') + 1);

var pageSize = 10;

//ajax请求获取数据展示到页面上
function bindData(pageNum,service){
	$.ajax({
		type : 'get',
		dataType : 'json',
		url : postPath + "/base/bindData",
		data : {
			pageNum : pageNum,
			pageSize : pageSize,
			service : service
		},
		ajaxStart : function(){$("#load").show();},
		complete : function(){$("#load").hide();},
		success : function(data){
			//清空原有数据
			$("#tbody_data").html("");
			//加入现有数据
			showData(data);
			//设置尾部导航
			var curPage = Math.ceil((pageNum+1)/pageSize);
			setPageBar(data,curPage,pageSize);
		}
	});
}



function setPageBar(data,curPage,pageSize){
	var total = data.total;
	
	var total_size = Math.ceil(total/pageSize);
	$("#pageBar").empty();
	//当只有1页时
	if(total_size <=1){
		$("#pageBar").append("<span><a href='javascript:void(0);' class='pageBarNoSelect'><<</a></span>");
		$("#pageBar").append("<span><a href='javascript:void(0);' class='pageBarNoSelect'><</a></span>");
		$("#pageBar").append("<span class='pageBarSpan'>1/1</span>");
		$("#pageBar").append("<span><a href='javascript:void(0);' class='pageBarNoSelect'>></a></span>");
		$("#pageBar").append("<span><a href='javascript:void(0);' class='pageBarNoSelect'>>></a></span>");
	}else{
		//当前页为第一页
		if(curPage == 1){
			$("#pageBar").append("<span><a href='javascript:void(0);' class='pageBarNoSelect'><<</a></span>");
			$("#pageBar").append("<span><a href='javascript:void(0);' class='pageBarNoSelect'><</a></span>");
			$("#pageBar").append("<span class='pageBarSpan'>"+curPage+"/"+total_size+"</span>");
			$("#pageBar").append("<span><a href='javascript:nextPage("+curPage+");' class='pageBarSelected'>></a></span>");
			$("#pageBar").append("<span><a href='javascript:lastPage(\""+total_size+"\");' class='pageBarSelected'>>></a></span>");
		}else if(curPage == total_size){
			$("#pageBar").append("<span><a href='javascript:firstPage(\""+1+"\");' class='pageBarSelected'><<</a></span>");
			$("#pageBar").append("<span><a href='javascript:prePage("+curPage+");' class='pageBarSelected'><</a></span>");
			$("#pageBar").append("<span class='pageBarSpan'>"+curPage+"/"+total_size+"</span>");
			$("#pageBar").append("<span><a href='javascript:void(0);' class='pageBarNoSelect'>></a></span>");
			$("#pageBar").append("<span><a href='javascript:void(0);' class='pageBarNoSelect'>>></a></span>");
		}else{
			$("#pageBar").append("<span><a href='javascript:firstPage(\""+1+"\");' class='pageBarSelected'><<</a></span>");
			$("#pageBar").append("<span><a href='javascript:prePage("+curPage+");' class='pageBarSelected'><</a></span>");
			$("#pageBar").append("<span class='pageBarSpan'>"+curPage+"/"+total_size+"</span>");
			$("#pageBar").append("<span><a href='javascript:nextPage("+curPage+");' class='pageBarSelected'>></a></span>");
			$("#pageBar").append("<span><a href='javascript:lastPage(\""+total_size+"\");' class='pageBarSelected'>>></a></span>");
		}
	}	
}

//下一页
function nextPage(curPage){
	var newPageNum = curPage*pageSize +1;
	bindData(newPageNum);
}

//上一页
function prePage(curPage){
	var newPageNum = (curPage-2)*pageSize+1;
	bindData(newPageNum);
}

//首页
function firstPage(page){
	bindData(0);
}
//尾页
function lastPage(size){
	var newPageNum = (size-1)*pageSize +1;
	bindData(newPageNum);
}