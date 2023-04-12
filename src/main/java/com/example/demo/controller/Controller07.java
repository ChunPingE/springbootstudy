package com.example.demo.controller;

import java.util.*;

import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;

import jakarta.servlet.http.*;

@Controller
@RequestMapping("sub7")
public class Controller07 {

	@RequestMapping("link1")
	public void method1(HttpServletRequest request) {
		// 1. 2.
		// 3. add attribute
		request.setAttribute("myName", "서태웅");
		// 4. /WEB-INF/views/sub7/link1.jsp로 포워드
	}

	@RequestMapping("link2")
	public String method2(Model model) {
		// 1. 2.
		// 3. add attribute
		model.addAttribute("myName", "채치수");
		// 4.forward
		return "/sub7/link1";
	}

	// 경로 : sub7/link3
	// method3작성
	/// WEB-INF/views/sub7/link3.jsp로 포워드
	@RequestMapping("link3")
	public void method3(Model model) {
		model.addAttribute("address", "seoul");
	}

	@RequestMapping("link4")
	public void method4(Model model) {
		model.addAttribute("list", List.of("java", "spring"));
	}

	@RequestMapping("link5")
	public void method5(Model model) {
		Map<String, String> map = new HashMap<>();
		map.put("address", "고양시");
		map.put("age", "26");
		map.put("email", "email@naver.com");

		model.addAttribute("myMap", map);
	}

	@RequestMapping("link6")
	public void method6(Model model) {
		model.addAttribute("name", "이한나");
		model.addAttribute("job", "매니저");
		model.addAttribute("hobby", List.of("영화", "독서", "TV"));
	}

	@RequestMapping("link7")
	public void method7(Model model) {
		model.addAttribute("age", "26");
		model.addAttribute("country", "한국");
		model.addAttribute("movieList", List.of("스즈메의문단속", "던전앤드래곤", "슬램덩크"));
	}
	
	@RequestMapping("link8")
	public void method8(Model model) {
		Dto01 o1 = new Dto01();
		o1.setName("박지성");
		o1.setAge(40);
		model.addAttribute("player", o1);
	}
}
