<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
</head>
<body>
	<div align="center">
		<h1>고객 목록</h1>
		<table border="1">
			<thead>
				<tr height="50">
					<th width="50" align="center">아이디</th>
					<th width="200" align="center">이름</th>
					<th width="250" align="center">주소</th>
					<th width="150" align="center">ContactName</th>					
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${customerList}" var="customer">
					<tr height="50">
						<th width="50" align="center">${customer.customerId}</th>
						<th width="150" align="center">${customer.customerName}</th>
						<th width="250" align="center">${customer.address}</th>
						<c:if test="${not empty customer.contactName}">
							<th width="150" align="center">${customer.contactName}</th>
						</c:if>
						<c:if test="${empty customer.contactName}">
							<th width="150" align="center">-</th>
						</c:if>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<nav aria-label="Page navigation example">
		  <ul class="pagination">
		  	
		  	<c:if test="${currentPageNumber != 1}">
		  	    <li class="page-item">
		  	    	<c:url value="/sub26/link1" var="pageLink" >
			 			<c:param name="page" value="1"></c:param>
					</c:url>
		  	    	<a class="page-link" href="${pageLink}">맨앞</a>
		  	    </li>
	  	    </c:if>
	  	
		  	<c:if test="${prevPageNumber ge 1 }">
		  	    <li class="page-item">
		  	    	<c:url value="/sub26/link1" var="pageLink" >
			 			<c:param name="page" value="${prevPageNumber}"></c:param>
					</c:url>
		  	    	<a class="page-link" href="${pageLink}">이전</a>
		  	    </li>
	  		</c:if>
	  		
		  	<c:forEach begin="${leftPageNumber}" end="${rightPageNumber}" var="pageNumber">
			  	<c:url value="/sub26/link1" var="pageLink" >
			 		<c:param name="page" value="${pageNumber }"></c:param>
				</c:url>
	    		<li class="page-item">
	    			<a class="page-link ${pageNumber eq currentPageNumber ? 'active': '' }" href="${pageLink}">${pageNumber}</a>
    			</li>
		 	</c:forEach>
		 	
		 	<c:if test="${nextPageNumber le lastPageNumber}">
	 		     <li class="page-item">
		  	    	<c:url value="/sub26/link1" var="pageLink" >
			 			<c:param name="page" value="${nextPageNumber}"></c:param>
					</c:url>
		  	    	<a class="page-link" href="${pageLink}">다음</a>
		  	    </li>
	  	    </c:if>
	  	    
	  	    <c:if test="${currentPageNumber != lastPageNumber}">
		  	    <li class="page-item">
		  	    	<c:url value="/sub26/link1" var="pageLink" >
			 			<c:param name="page" value="${lastPageNumber}"></c:param>
					</c:url>
		  	    	<a class="page-link" href="${pageLink}">맨뒤</a>
		  	    </li>
	  	    </c:if>
		  </ul>
		</nav>
	</div>
	
	
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
</body>
</html>