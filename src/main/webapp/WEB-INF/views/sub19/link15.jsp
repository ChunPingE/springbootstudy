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
	<div align="center">
		<h1>목록</h1>
		<table border="1">
			<thead>
				<tr align="center">
					<th width="50">제목</th>
					<th width="100">출판일</th>
					<th width="100">가격</th>
					<th width="200">수정일</th>
					<th width="50">무게</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${bookList}" var="book">
					<tr align="center">
						<td>${book.title }</td>
						<td>${book.published }</td>
						<td>${book.price }</td>
						<td>${book.updated }</td>
						<td>${book.weight}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

</body>
</html>