<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
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
					<th width="50">이름</th>
					<th width="50">나이</th>
					<th width="50">가격</th>
					<th width="100">생일</th>
					<th width="200">입력일</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${memberList}" var="member">
					<tr align="center">
						<td>${member.name }</td>
						<td>${member.age }</td>
						<td>${member.price }</td>
						<td>${member.birth }</td>
						<td>${member.inserted}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

</body>
</html>