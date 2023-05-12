$("#btn1").click(function() {
	const obj = {
		name: "정대만",
		age: 40
	};

	$.ajax("/sub36/link1", {
		method: "post",
		contentType: "application/json",
		data: JSON.stringify(obj)
	});
})

$("#btn2").click(function() {
	const obj = {
		name: "park",
		email: "park@naver.com",
		score: "90.98",
		married: false
	};

	$.ajax("/sub36/link2", {
		method: "post",
		contentType: "application/json",
		data: JSON.stringify(obj)
	});
})

$("#btn3").click(function() {
	const data = {
		name: "태웅",
		hobby: [
			"독서",
			"농구",
			"음악감상"
		]
	};

	$.ajax("/sub36/link3", {
		method: "post",
		contentType: "application/json",
		data: JSON.stringify(data)
	});
})

$("#btn4").click(function() {
	const data = {
		phone: [
			"갤럭시",
			"아이폰",
			"LG"
		]
	}

	$.ajax("/sub36/link4", {
		method: "post",
		contentType: "application/json",
		data: JSON.stringify(data)
	});
})

$("#btn5").click(function() {
	const data = {
		title: "java",
		publisher: "한빛",
		writer: {
			name: "정대만",
			age: 44
		}
	}

	$.ajax("/sub36/link5", {
		method: "post",
		contentType: "application/json",
		data: JSON.stringify(data)
	});
})

$("#btn6").click(function() {
	const data = {
		city: "고양시",
		price: 10000,
		etc: {
			name: "park",
			email: "park@gmail.com",
			score: 99.9,
			married: false
		}
	}

	$.ajax("/sub36/link6", {
		method: "post",
		contentType: "application/json",
		data: JSON.stringify(data)
	});
})


$("#btn7").click(function() {
	const data = [
		{
			name: "park",
			age: 26
		},
		{
			name: "can",
			age: 1700
		},
		{
			name: "uni",
			age: 4
		}
	]

	$.ajax("/sub36/link7", {
		method: "post",
		contentType: "application/json",
		data: JSON.stringify(data)
	});
})

//////////////////

$("#btn8").click(function() {
	const name = $("#inputName1").val();
	const age = $("#inputAge").val();
	const data = {
		name: name,
		age: age
	};

	$.ajax("/sub36/link1", {
		method: "post",
		contentType: "application/json",
		data: JSON.stringify(data)
	});
})

$("#btn9").click(function() {
	const name = $("#inputName2").val();
	const email = $("#inputEmail2").val();
	const score = $("#inputScore2").val();
	//const married = document.querySelector("#inputMarried2").checked;
	const married = $("#inputMarried2").is(":checked");
	const data = {
		name: name,
		email: email,
		score: score,
		married: married
	}

	$.ajax("/sub36/link2", {
		method: "post",
		contentType: "application/json",
		data: JSON.stringify(data)
	});
})






