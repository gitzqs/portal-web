var strPath = window.document.location.pathname;
var postPath = strPath.substring(0, strPath.substr(1).indexOf('/') + 1);

//��¼����
function loginSubmit(){
	var username = $("#username").val();
	var password = $("#password").val();
	if(username == '' || username == null){
		alert("�û�������Ϊ�գ�");
		return false;
	}
	if(password == '' || password == null){
		alert("���벻��Ϊ�գ�");
		return false;
	}
	$("#loginForm").submit();
}