<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h1>직원 목록</h1>
		<table border="1">
			<thead>
				<tr height="40">
					<th width="50" align="center">아이디</th>
					<th width="200" align="center">이름</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${employeeList}" var="employee">
					<tr height="40">
						<td width="50" align="center">${employee.employeeId}</td>
						<td width="200" align="center">${employee.lastName} ${employee.firstName}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>