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
	<h1>sub7의 link7.jsp입니다.</h1>
	<p>나이 : ${age}</p>
	<p>나라 : ${country}</p>
	<p>영화목록 </p>
	<ul>
		<c:forEach items="${movieList}" var="movie">
			<li>${movie}</li>
		</c:forEach>
	</ul>
</body>
</html>