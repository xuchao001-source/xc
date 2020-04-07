$("#login").click(function(){
	var usercode=$("#usercode").val();
	var password=$("#password").val();
	if(usercode==''||password==''){
		alert("登录账号或登录密码不能为空!");
	}else if(usercode.length<7 || password.length<6){
		alert("输入正确的账号长度或密码长度");
	}else{
		$.post("GetUsers",{usercode:usercode,password:password},function(e){
			if(e=='NO'){
				alert("登录失败,登录账号或者密码错误,请重新输入!");
				$("#usercode").val("");
				$("#password").val("");
			}else{
				alert("登录成功!");
				location.href="HomePage";
			}
		})
	}
})