<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h1>고객 목록</h1>
		<table border="1">
			<thead>
				<tr height="50">
					<th width="50" align="center">아이디</th>
					<th width="200" align="center">이름</th>
					<th width="250" align="center">주소</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${customerList}" var="customer">
					<tr height="50">
						<th width="50" align="center">${customer.id}</th>
						<th width="150" align="center">${customer.name}</th>
						<th width="250" align="center">${customer.address}</th>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	
</body>
</html>