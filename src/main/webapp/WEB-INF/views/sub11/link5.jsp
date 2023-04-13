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
	<h1>직원 목록</h1>
	<ul>
		<c:forEach items="${employees}" var="employe" varStatus="st">
			<li>${st.index + 1}번 직원 : ${employe}</li>
		</c:forEach>
	</ul>
</body>
</html>
