package com.example.demo.controller;

import java.util.*;

import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;

import jakarta.servlet.http.*;

@Controller
@RequestMapping("sub9")
public class Controller09 {

	// sub9/link1?name=son&age=20
	@RequestMapping("link1")
	public String method01(HttpServletRequest request, Model model) {
		// 1. request param 수집가공
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));

		Dto04 obj = new Dto04();
		obj.setName(name);
		obj.setAge(age);
		// 2. bussiness logic

		// 3. add attribute
		model.addAttribute("value", obj);

		// 4. forward / redirect
		return "/sub9/link1";
	}

	// /sub9/link2?name=park&age=40
	@RequestMapping("link2")
	public String method02(@ModelAttribute("value") Dto04 dto04) {
		return "/sub9/link1";
	}

	@RequestMapping("link3")
	public void method03(@ModelAttribute("attr") Dto04 dto) {
		// 1.request param수집/가공
		// Dto04 객체 만들기
		// name 요청 파라미터를 위 객체에 세팅
		// age 요청파라미터를 위 객체에 세팅
		// 3.add attribute추가
		// 위객체를 attr 이름으로 model에 추가
		// 4.forward / redirect
		// /WEB-INF/views/sub9/link3.jsp로 포워드
	}

	@RequestMapping("link4")
	public void method04(Dto04 dto) {
		// 1.request param수집/가공
		// Dto04 객체 만들기
		// name 요청 파라미터를 위 객체에 세팅
		// age 요청파라미터를 위 객체에 세팅
		// 3.add attribute추가
		// 위객체를 dto04 이름으로(객체 lowerCamelCase) model에 추가
		// 4.forward / redirect
		// /WEB-INF/views/sub9/link4.jsp로 포워드
	}
	
	// 경로 /sub9/link5?model=V50S&price=200000&company=LG
	@RequestMapping("link5")
	public void method05(Dto02 dto) {
		// 1.request param수집/가공
		// Dto04 객체 만들기
		// name 요청 파라미터를 위 객체에 세팅
		// age 요청파라미터를 위 객체에 세팅
		// 3.add attribute추가
		// 위객체를 dto04 이름으로(객체 lowerCamelCase) model에 추가
		// 4.forward / redirect
		// /WEB-INF/views/sub9/link4.jsp로 포워드
	}

}
