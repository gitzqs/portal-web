var strPath = window.document.location.pathname;
var postPath = strPath.substring(0, strPath.substr(1).indexOf('/') + 1);

//ajax�����ȡ����չʾ��ҳ����
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
			//���ԭ������
			$("#tbody_data").html("");
			//������������
			showData(data);
			//����β������
			setPageBar(data,1,3);
		}
	});
}

//����չʾ
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
	
	//��ǰҳΪ��һҳ
	if(curPage == 1){
		$("#pageBar").append("<span><a href='javascript:void(0);' class='pageBarNoSelect'>��ҳ</a></span>");
		$("#pageBar").append("<span><a href='javascript:void(0);' class='pageBarNoSelect'>��һҳ</a></span>");
		$("#pageBar").append("<span style='float:left'>��"+curPage+"ҳ&nbsp;��"+total_size+"ҳ</span>");
		$("#pageBar").append("<span><a href='javascript:nextPage(\""+curPage+"\");' class='pageBarSelected'>��һҳ</a></span>");
		$("#pageBar").append("<span><a href='javascript:lastPage(\""+total_size+"\");' class='pageBarSelected'>βҳ</a></span>");
	}
	/*if(curPage == total_size){
		$("#pageBar").append("<span><a href='javascript:firstPage(\""+1+"\");' class='pageBarSelected'>��ҳ</a></span>");
		$("#pageBar").append("<span><a href='javascript:prePage(\""+curPage+"\");' class='pageBarSelected'>��һҳ</a></span>");
		$("#pageBar").append("<span>��"+curPage+"ҳ&nbsp;��"+total_size+"ҳ</span>");
		$("#pageBar").append("<span><a href='javascript:void(0);' class='pageBarNoSelect'>��һҳ</a></span>");
		$("#pageBar").append("<span><a href='javascript:void(0);' class='pageBarNoSelect'>βҳ</a></span>");
	}else{
		$("#pageBar").append("<span><a href='javascript:firstPage(\""+1+"\");' class='pageBarSelected'>��ҳ</a></span>");
		$("#pageBar").append("<span><a href='javascript:prePage(\""+curPage+"\");' class='pageBarSelected'>��һҳ</a></span>");
		$("#pageBar").append("<span>��"+curPage+"ҳ&nbsp;��"+total_size+"ҳ</span>");
		$("#pageBar").append("<span><a href='javascript:nextPage(\""+curPage+"\");' class='pageBarSelected'>��һҳ</a></span>");
		$("#pageBar").append("<span><a href='javascript:lastPage(\""+total_size+"\");' class='pageBarSelected'>βҳ</a></span>");
	}*/
	
	
}