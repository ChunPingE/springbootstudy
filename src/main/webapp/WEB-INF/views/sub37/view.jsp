<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css" integrity="sha512-iecdLmaskl7CVkqkXNQ/ZH/XLlvWZOJyj7Yy7tcenmpD1ypASozpmT/E0iPtmFIB46ZmdtAc9eNBvH0H/ZpiBw==" crossorigin="anonymous" referrerpolicy="no-referrer" />
</head>
<body>
	<h1>ajax 응답연습</h1>
	<div>
		<button id="btn1">ajax요청</button>
	</div>
	<hr />
	<div>
		<button id="btn2">응답 코드 연습</button>
	</div>
	<hr />
	<div>
		<button id="btn3">응답 코드 연습 2</button>
	</div>
	<hr />
	<div>
		<button id="btn4">응답 헤더 연습</button>
	</div>
	<hr />
	<div>
		<button id="btn5">응답 바디 연습</button>
	</div>
	<hr />
	<div>
		<button id="btn6">응답 바디 연습 2</button>
	</div>
	<hr />
	<div>
		<!-- 응답본문 : 현재 날짜 -->
		<button id="btn7">응답 바디 연습 3</button>
	</div>
	<hr />
	<div>
		<button id="btn8">@ResponseBody</button>
	</div>
	<hr />
	<div>
		<button id="btn9">@ResponseBody 현재 시간</button>
	</div>
	<hr />
	<div>
		<button id="btn10">@ResponseBody JSON</button>
	</div>
	<hr />
	<div>
		<button id="btn11">@ResponseBody JSON 2</button>
	</div>
	<hr />
	<div>
		<button id="btn12">@ResponseBody JSON 3</button>
	</div>
	<hr />
	<div>
		<button id="btn13">응답 본문 {"address":"seoul", "price":3.14 }</button>
	</div>
	<hr />
	<div>
		<button id="btn14">응답 본문</button>
	</div>
	<hr />
	<div>
		<button id="btn15">응답 본문 DTO</button>
	</div>
	<hr />
	<div>
		<button id="btn16">응답 본문 DTO 2</button>
	</div>
	<hr />
	<div>
		<button id="btn17">응답 본문 LIST</button>
	</div>
	<hr />
	<div>
		<button id="btn18">응답 본문 LIST+MAP</button>
	</div>
	<hr />
	<div>
		<button id="btn19">응답 본문 LIST+DTO</button>
	</div>
	<hr />
	<div>
		<button id="btn20">응답 본문 JSON From DB</button>
	</div>
	<hr />
	<div>
		<button id="btn21">응답 본문 JSON From DB 2 </button>
	</div>
	<hr />
	<div>
		<input type="number" id="categoryIdInput" value="1"/>
		<button id="btn22">응답 본문 JSON From DB 3 </button>
		<ul id="productList">
		</ul>
	</div>



	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.4/jquery.min.js" integrity="sha512-pumBsjNRGGqkPzKHndZMaAG+bir374sORyzM3uulLV14lN5LyykqNk8eEeUlUkB3U0M4FApyaHraT65ihJhDpQ==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
	<script src="/js/sub37/response1.js"></script>
</body>
</html>