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
	<a name="top"></a>
	<div class="pui-layout pui-flexbox pui-flex-column login-layout">
		<div class="pui-layout pui-flex login-main">
			<div
				class="pui-layout pui-layout-fixed pui-layout-fixed-1200 login-main-con">
				<div class="login-panel">
					<form class="pui-form login-form" action="/login" method="post">
						<div class="pui-form-group">
							<h1 class="pui-text-white pui-text-normal">
								<i class="planeui-logo-2x pui-text-xxxxxl"></i> 登录 Login
							</h1>
							<div role="username">
								<input type="text" name="username" maxlength="16"
									class="pui-unbordered" placeholder="用户名" /> <i
									class="fa fa-user pui-text-blue"></i>
							</div>
						</div>
						<div class="pui-form-group">
							<div role="password">
								<input type="password" name="password" maxlength="16"
									class="pui-unbordered" placeholder="密码" /> <i
									class="fa fa-lock pui-text-blue"></i>
							</div>
						</div>
						<div class="pui-form-group">
							<div role="vcode">
								<input type="text" name="vcode" maxlength="4"
									class="pui-unbordered" placeholder="验证码" /> <i
									class="fa fa-shield pui-text-blue"></i> <img src="/captcha.jpg"
									id="vcode-img" width="100px" />
							</div>
						</div>
						<div class="pui-form-group">
							<input type="submit" name="submit"
								class="pui-btn pui-btn-default pui-bg-blue-800 pui-unbordered"
								value="登录" /> <span><a href="#"
								class="pui-text-white pui-text-xs">忘记密码？</a></span>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>