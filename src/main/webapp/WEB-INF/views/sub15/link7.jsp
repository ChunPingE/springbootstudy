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
	<h1>공급자 추가</h1>
	<form action="/sub15/link8">
		공급자 이름 : <input type="text" name="name"/> <br />
		도시 : <input type="text" name="city"/> <br />
		나라 : <input type="text" name="country"/> <br />
		<input type="submit" value="전송" />
	</form>
</body>
</html>