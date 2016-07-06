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
<link rel="stylesheet" type="text/css"
	href="/static/planeui/css/planeui.css" />
<link rel="stylesheet" type="text/css"
	href="/static/planeui/css/login.css" />
</head>
<body>
	<form action="/upload/action" enctype="multipart/form-data"
		method="post">
		<input type="file" name="file"><input type="submit" value="上传">
	</form>

</body>
</html>