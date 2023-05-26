<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<script src="http://code.jquery.com/jquery-latest.js"></script>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">后台登录</h1>
	<p align="center" style="color: red;">
		<strong>${errMsg}</strong>
	</p>

	<div style="text-align: center">
		<form:form action="loginDo" method="post" modelAttribute="user">

			<label for="username">用户名:</label>
			<form:input path="username" id="username" />
			<br>
			<br>
			<label for="password">密 &nbsp;&nbsp;&nbsp;码:</label>
			<form:input path="password" id="password" />
			<br>
			<br>
			<input type="submit" value="登 录">
		</form:form>
	</div>
</body>
</html>