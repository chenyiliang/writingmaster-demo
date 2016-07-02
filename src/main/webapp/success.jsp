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
<title>管理</title>
<link rel="stylesheet" href="/static/dbadmin/imgs/styles.css"
	type="text/css" media="screen" title="no title" charset="utf-8">
<link rel="stylesheet" type="text/css"
	href="/static/dhtmlx/skins/web/dhtmlx.css" />
<script src="/static/dhtmlx/codebase/dhtmlx.js"></script>
<script src="/static/dhtmlx/dbadmin/logic/init.js"
	type="text/javascript" charset="utf-8"></script>
<style type="text/css" media="screen">
html, body {
	height: 100%;
	padding: 0px;
	margin: 0px;
	overflow: hidden;
}
</style>
</head>
<body id="index" onload="init()"></body>
</html>