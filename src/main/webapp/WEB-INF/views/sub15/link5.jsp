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
	<h1>새 직원 입력</h1>
	<form action="/sub15/link6" method="post" >
		firstName : <input type="text" name="firstName"/> <br />
		lastName : <input type="text" name="lastName"/> <br />
		<input type="submit" value="전송" />
	</form>

</body>
</html>