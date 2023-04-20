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
	<h1>MyTable33</h1>
	<form action="/sub19/link10" method="post">
		제목 : <input type="text" name="title"/> <br />
		출판 : <input type="date" name="published"/> <br />
		가격 : <input type="number" name="price" /> <br />
		수정 : <input type="datetime-local" name="updated"/> <br />
		무게 : <input type="text" name="weight"/> <br />
		<input type="submit" value="전송" />
	</form>
</body>
</html>