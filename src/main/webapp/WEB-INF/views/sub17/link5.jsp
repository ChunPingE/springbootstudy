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
	<h1>${customer.customerId }번 고객 수정</h1>
	<form action="/sub17/link6" method="post">
		<!-- (input[name][value]+br)*7+input:s -->
		<input type="text" name="customerName" value="${customer.customerName}" />
		<br />
		<input type="text" name="contactName" value="${customer.contactName }" />
		<br />
		<input type="text" name="address" value="${customer.address }" />
		<br />
		<input type="text" name="city" value="${customer.city }" />
		<br />
		<input type="text" name="postalCode" value="${customer.postalCode }" />
		<br />
		<input type="text" name="country" value="${customer.country }" />
		<br />
		<input type="hidden" name="customerId" value="${customer.customerId}" />
		<input type="submit" value="수정" />
	</form>

</body>
</html>