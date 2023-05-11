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











