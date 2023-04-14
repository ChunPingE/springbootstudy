<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>sub12 link3</h1>
	<ul>
		<c:forEach items="${shipperNames}" var="name">
			<li>${name}</li>
		</c:forEach>
	</ul>
</body>
</html>