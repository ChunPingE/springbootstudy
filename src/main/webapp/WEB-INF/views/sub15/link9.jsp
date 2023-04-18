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
	<h1>새고객 등록</h1>
	<form action="/sub15/link10" method="post">
		이름 : <input type="text" name="name" /> <br />
		계약명 : <input type="text" name="contactName" /> <br />
		주소 : <input type="text" name="address" /> <br />
		<input type="submit" value="등록" />
	</form>
</body>
</html>