<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script src="http://code.jquery.com/jquery-latest.js"></script>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<h1>客户信息列表</h1>

	<a href="addCustomer">
		<button>新增</button>
	</a>
	<br>
	<br>
	<table border="1" width="100%" cellpadding="0" cellspacing="0">
		<tr>
			<th>全选</th>
			<th>客户编号</th>
			<th>客户名称</th>
			<th>客户负责人</th>
			<th>客户信息来源</th>
			<th>客户所属行业</th>
			<th>创建日期</th>
		</tr>
		<c:forEach items="${list }" var="temp">
			<tr>
				<th><input type="checkbox"></th>
				<th>${temp.customerid }</th>
				<th>${temp.customername }</th>
				<th>${temp.cust_user_id }</th>
				<th>${temp.cust_source }</th>
				<th>${temp.cust_industry }</th>
				<th>${temp.cust_createdate }</th>
			</tr>
		</c:forEach>
	</table>
</body>
</html>