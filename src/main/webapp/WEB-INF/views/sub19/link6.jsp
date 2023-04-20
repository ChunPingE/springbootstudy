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
	<h1>입력 폼</h1>
		<form action="/sub19/link7" method="post">
		이름 : <input type="text" name="name" /> <br />
		나이 : <input type="number" name="age"/> <br />
		가격 : <input type="text" name="price" /> <br />
		생일 : <input type="date" name="birth"/> <br />
		입력일 : <input type="datetime-local" name="inserted"/> <br />
		<input type="submit" value="link7로 전송" />
	</form>
	
	<hr />
	
	<form action="/sub19/link8" method="post">
		이름 : <input type="text" name="name" /> <br />
		나이 : <input type="number" name="age"/> <br />
		가격 : <input type="text" name="price" /> <br />
		생일 : <input type="date" name="birth"/> <br />
		입력일 : <input type="datetime-local" name="inserted"/> <br />
		<input type="submit" value="link8로 전송" />
	</form>
</body>
</html>