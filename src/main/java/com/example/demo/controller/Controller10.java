package com.example.demo.controller;

import java.util.*;

import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;

import jakarta.servlet.http.*;

@Controller
@RequestMapping("sub10")
public class Controller10 {

	@RequestMapping("link1")
	public void method01(String name) {// @RequestParam String name
		// String name = request.getParameter("name");
	}

	@RequestMapping("link2")
	public void method02(Dto04 dto) { // =@ModelAttribute Dto04 dto
		/*
		 * Dto04 dto = new Dto04(); dto.setName(request.getParameter("name"));
		 * dto.setAge(Integer.parseInt(request.getParameter("age")));
		 * request.setAttribute("dto04", dto));
		 */
	}

	// 경로 : /sub10/link3?model=ray&price=3.14&name=son&age=22
	@RequestMapping("link3")
	public void method03(@ModelAttribute("model") String model, @ModelAttribute("price") double price, Dto04 obj, Model modelMap) {
		//modelMap.addAttribute("model", model);
		//modelMap.addAttribute("price", price);
	}
	
	@RequestMapping("link4")
	public void method04() {
		//1.request pram 수집가공
		//2. bussiness logic
		//data를 생성(create) 읽기(read) 수정(update) 삭제(delete)
		//crud
		//3 add attribute
		//4 forward
	}

}
