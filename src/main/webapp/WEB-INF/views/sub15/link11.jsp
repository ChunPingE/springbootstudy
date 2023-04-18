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
	<h1>새 공급자 등록</h1>
	<form action="/sub15/link12" method="post">
		<!-- (input[name]+br)*7+input:s -->
		이름: <input type="text" name="supplierName" />
		<br />
		계약명: <input type="text" name="contactName" />
		<br />
		주소: <input type="text" name="address" />
		<br />
		도시: <input type="text" name="city" />
		<br />
		우편번호: <input type="text" name="postalCode" />
		<br />
		국가: <input type="text" name="country" />
		<br />
		전화번호: <input type="text" name="phone" />
		<br />
		<input type="submit" value="등록" />
	</form>
</body>
</html>