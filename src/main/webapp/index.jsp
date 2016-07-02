<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>登陆</title>
</head>
<body>
	<div>${shiroLoginFailure }</div>
	<form method="post" action="login">
		<p>
			用户名：<input type="text" name="username">
		</p>
		<p>
			密码：<input type="password" name="password">
		</p>
		<p>
			<input type="submit" value="登录">
		</p>
	</form>
</body>
</html>