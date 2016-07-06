<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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

	<form:form commandName="sysUser" action="/sysuser/validate/action"
		method="post">
		<fieldset>
			用户名：
			<form:input path="username" />
			<form:errors path="username" />
			<input type="submit" value="提交">
		</fieldset>
	</form:form>

</body>
</html>