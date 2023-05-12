$("#btn1").click(function() {
	$.ajax("/sub39/link1", {
		success: function() {
			console.log("성공");
		},
		error: function() {
			console.log("실패");
		},
		complete: function() {
			console.log("성공이든 실패든");
		}
	});
})

$("#btn2").click(function() {
	$.ajax("/sub39/link2", {
		success: function() {
			console.log("성공");
		},
		error: function() {
			console.log("실패");
		},
		complete: function() {
			console.log("성공이든 실패든");
		}
	});
})

$("#btn3").click(function() {
	//성공(200) 응답을 받아서 콘솔에 성공!!!!출력하기
	$.ajax("/sub39/link3", {
		success: function() {
			console.log("성공!!!");
		}
	});
})

$("#btn4").click(function() {
	//실패(500) 응답을 받아서 콘솔에 실패!!!출력되게하기
	$.ajax("/sub39/link4", {
		error: function() {
			console.log("실패!!!!");
		}
	});
})

$("#btn5").click(function() {
	$.ajax("/sub39/link1")
		.done(function() {
			console.log("done 메소드사용, 성공!!")
		})
		.fail(function() {
			console.log("fail 메소드사용, 실패!!")
		})
		.always(function() {
			console.log("always 메소드사용, 성공이든 실패든")
		});
})

$("#btn6").click(function() {
	$.ajax("/sub39/link2")
		.done(function() {
			console.log("done 메소드사용, 성공!!")
		})
		.fail(function() {
			console.log("fail 메소드사용, 실패!!")
		})
		.always(function() {
			console.log("always 메소드사용, 성공이든 실패든")
		});
})

$("#btn7").click(function() {
	$.ajax("/sub39/link3")
	.done(function(){
		console.log("성공!!!!");
	});
})

$("#btn8").click(function() {
	$.ajax("/sub39/link4")
	.fail(function(){
		console.log("실패!!!!");
	});
})



