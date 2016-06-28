<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/view/jspf/taglibs.jsp" %>
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
	
	function changeDiv(url){
		$("#rightDiv").load("${ctx}"+url);
	}
</script>
	<div class="left_menu">
	<ul id="nav_dot">
	<c:forEach items="${urlList}" var="list" varStatus="status">
      <li>
          <a href="javascript:popMemu('${status.index +1}');" style="text-decoration:none;"><h4 class="M1"><span></span>${list.name}</h4></a>
          <div id="${status.index +1 }" class="list-item none">
          	<c:forEach items="${list.sList }" var="sList">
            <a href="javascript:changeDiv('${sList.url}');">${sList.name}</a>
            </c:forEach>
          </div>
        </li>
     </c:forEach>
  </ul>
</div>
