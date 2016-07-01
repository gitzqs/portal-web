var strPath = window.document.location.pathname;
var postPath = strPath.substring(0, strPath.substr(1).indexOf('/') + 1);

var pageSize = 10;

//ajax�����ȡ����չʾ��ҳ����
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
			//���ԭ������
			$("#tbody_data").html("");
			//������������
			showData(data);
			//����β������
			var curPage = Math.ceil((pageNum+1)/pageSize);
			setPageBar(data,curPage,pageSize);
		}
	});
}



function setPageBar(data,curPage,pageSize){
	var total = data.total;
	
	var total_size = Math.ceil(total/pageSize);
	$("#pageBar").empty();
	//��ֻ��1ҳʱ
	if(total_size <=1){
		$("#pageBar").append("<span><a href='javascript:void(0);' class='pageBarNoSelect'><<</a></span>");
		$("#pageBar").append("<span><a href='javascript:void(0);' class='pageBarNoSelect'><</a></span>");
		$("#pageBar").append("<span class='pageBarSpan'>1/1</span>");
		$("#pageBar").append("<span><a href='javascript:void(0);' class='pageBarNoSelect'>></a></span>");
		$("#pageBar").append("<span><a href='javascript:void(0);' class='pageBarNoSelect'>>></a></span>");
	}else{
		//��ǰҳΪ��һҳ
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

//��һҳ
function nextPage(curPage){
	var newPageNum = curPage*pageSize +1;
	bindData(newPageNum);
}

//��һҳ
function prePage(curPage){
	var newPageNum = (curPage-2)*pageSize+1;
	bindData(newPageNum);
}

//��ҳ
function firstPage(page){
	bindData(0);
}
//βҳ
function lastPage(size){
	var newPageNum = (size-1)*pageSize +1;
	bindData(newPageNum);
}