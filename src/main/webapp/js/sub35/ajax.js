$("#button1").click(function() {
	$.ajax("/sub35/link1", { method: "post" });
})

$("#button2").click(function() {
	$.ajax("/sub35/link2", { method: "post" });
})

$("#button3").click(function() {
	$.ajax("/sub35/link3", {
		method: "post",
		data: "name=손"
	});
})

$("#button4").click(function() {
	$.ajax("/sub35/link4", {
		method: "post",
		data: "address=고양시&price=99.77"
	});
})

$("#button5").click(function() {
	$.ajax("/sub35/link5", {
		method: "post",
		data: "name=발&score=7.5&email=val@google.com"
	});
})

$("#button6").click(function() {
	$.ajax("/sub35/link6", {
		method: "post",
		data: "address=고양시&product=house&price=10000"
	});
})

$("#button7").click(function() {

	const obj = { name: "son" };

	$.ajax("/sub35/link7", {
		method: "post",
		//data: '{"name":"son"}',
		data: JSON.stringify(obj),
		contentType: "application/json"
	});
})

$("#button8").click(function() {
	const data = {
		address: "고양시",
		name: "박지성"
	};

	$.ajax("/sub35/link8", {
		method: "post",
		contentType: "application/json",
		data: JSON.stringify(data)
		//data: '{"address":"고양시", "name":"박지성"}'
	});
})

$("#button9").click(function() {
	const data = {
		age: 26,
		name: "park",
		married: false
	}

	$.ajax("/sub35/link9", {
		method: "post",
		contentType: "application/json",
		data: JSON.stringify(data)
		//data: '{"age":26, "name":"park", "married": false}'
	});
})

$("#button10").click(function() {
	const data = {
		address: null,
		age: 30,
		name: "손흥민"
	}

	$.ajax("/sub35/link10", {
		method: "post",
		contentType: "application/json",
		data: JSON.stringify(data)
		//data: '{"address" : null, "age" : 30, "name":"손흥민"}'
	});
})

$("#button11").click(function() {
	const data = {
		book: { title: "java", "price": 300 },
		address: "seoul"
	}

	$.ajax("/sub35/link11", {
		method: "post",
		contentType: "application/json",
		data: JSON.stringify(data)
		//data: '{"book": {"title":"java", "price":300}, "address":"seoul"}'
	});
})

$("#button12").click(function() {
	const data = {
		food: [
			"pizza",
			"coke",
			"coffee"
		],
		store: "피자스쿨"
	}

	$.ajax("/sub35/link12", {
		method: "post",
		contentType: "application/json",
		data: JSON.stringify(data)
		//data: '{"food" : ["pizza", "coke", "coffee"]}, "store" : "피자스쿨"'
	});
})

$("#button13").click(function() {
	const data = ["pizza", "coke", "coffee"];

	$.ajax("/sub35/link13", {
		method: "post",
		contentType: "application/json",
		data: JSON.stringify(data)
		//data: '["pizza", "coke", "coffee"]'
	});
})

$("#button14").click(function() {
	const data = [
		{ "name": "강백호", "pos": "파포" },
		{ "name": "서태웅", "pos": "스포" }
	]
	$.ajax("/sub35/link14", {
		method: "post",
		contentType: "application/json",
		data: JSON.stringify(data)
		//data: '[{"name":"강백호", "pos":"파포"}, {"name":"서태웅", "pos":"스포"}]'
	});
})














