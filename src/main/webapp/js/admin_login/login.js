var strPath = window.document.location.pathname;
var postPath = strPath.substring(0, strPath.substr(1).indexOf('/') + 1);

//登录处理
function loginSubmit(){
	var username = $("#username").val();
	var password = $("#password").val();
	if(username == '' || username == null){
		alert("用户名不能为空！");
		return false;
	}
	if(password == '' || password == null){
		alert("密码不能为空！");
		return false;
	}
	$("#loginForm").submit();
}