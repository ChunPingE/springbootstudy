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
	<h1>sub7의 link6.jsp입니다.</h1>
	<h1>이름 : ${name}</h1>
	<h1>직업 : ${job}</h1>
	<h1>취미: </h1>
	<ul>
		<c:forEach items="${hobby}" var="item">
			<li>${item}</li>
		</c:forEach>
	</ul>
</body>
</html>