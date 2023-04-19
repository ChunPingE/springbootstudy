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
	<h1>${supplier.supplierId }번 공급자 수정</h1>
	<form action="/sub17/link3" method="post">
		<!-- (input[name][value]+br)*7+input:s -->
		<input type="text" name="supplierName" value="${supplier.supplierName}" />
		<br />
		<input type="text" name="contactName" value="${supplier.contactName }" />
		<br />
		<input type="text" name="address" value="${supplier.address }" />
		<br />
		<input type="text" name="city" value="${supplier.city }" />
		<br />
		<input type="text" name="postalCode" value="${supplier.postalCode }" />
		<br />
		<input type="text" name="country" value="${supplier.country }" />
		<br />
		<input type="text" name="phone" value="${supplier.phone }" />
		<br />
		<input type="hidden" name="id" value="${supplier.supplierId }" />
		<input type="submit" value="수정" />
	</form>

</body>
</html>