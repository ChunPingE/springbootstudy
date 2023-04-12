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
	<h1>sub7의 link4.jsp입니다.</h1>
	<h1>${list[0]}</h1>
	<h1>${list[1]}</h1>
	
	<hr />
	
	<c:forEach items="${list}" var="item">
		<h1>${item}</h1>
	</c:forEach>
</body>
</html>