package com.example.demo.controller;

import java.io.*;
import java.util.*;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

@Controller
@RequestMapping("sub6")
public class Controller06 {
	// 1. request parm 얻기/가공
	// 2. business logic 실행
	// 3. add attribute
	// 4. fowrad / redirect

	@RequestMapping("link1")
	public String method01() {
		System.out.println("link1 메소드 일함");
		return "forward:/sub6/link2";
	}

	@RequestMapping("link2")
	public void method02() {
		System.out.println("link2 메소드 일함");
	}

	// 경로 : /sub6/link3
	// method3 작성 forward /sub6/link2
	@RequestMapping("link3")
	public String method03() {
		System.out.println("link3 메소드 일함");
		return "forward:/sub6/link2";
	}

	@RequestMapping("link4")
	public void method04(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("link4에서 일함");
		String view = "/WEB-INF/views/abc.jsp";
		request.getRequestDispatcher(view).forward(request, response);
	}

	@RequestMapping("link5")
	public String method05() {
		System.out.println("link5에서 일함");
		return "forward:/WEB-INF/views/abc.jsp";
	}

	@RequestMapping("link6")
	public String method06() {
		System.out.println("link6에서 일함");
		return "abc";
	}

	// 경로 : /sub6/link7
	// method7 작성
	// forward /WEB-INF-views/def.jsp
	@RequestMapping("link7")
	public String method07() {
		System.out.println("link7에서 일함");
		return "def";
	}

	// 경로 : /sub6/link8
	@RequestMapping("link8")
	public void method08() {
		System.out.println("8번 메소드 일함");
		// default view name : /sub6/link8
		// return "/sub6/link8";
	}

	// 경로 : /sub6/link8
	@RequestMapping("link9")
	public String method09() {
		System.out.println("9번 메소드 일함");
		return "/sub6/link9";
	}

	// 경로 : /sub6/link10
	@RequestMapping("link10")
	public String method10() {
		System.out.println("10번 메소드 일함");
		return null;
	}

	// 경로 : /sub6/link11
	// method11 작성
	// WEB-INF/views/sub6/link11.jsp 로 포워드

	// 경로 : /sub6/link11
	@RequestMapping("link11")
	public void method11() {
		System.out.println("11번 메소드 일함");
	}

	/*
	 * // 경로 : /sub6/link11
	 * 
	 * @RequestMapping("link11") public String method11() {
	 * System.out.println("11번 null 메소드 일함"); return null; }
	 * 
	 * // 경로 : /sub6/link11
	 * 
	 * @RequestMapping("link11") public String method11() {
	 * System.out.println("11번 String return 메소드 일함"); return "/sub/link11"; }
	 */

	// 경로 : /sub6/link12?name=park&age=33
	// method12
	// 1.request param 수집 / 가공
	// 2. business logic(생략)
	// 3. add attribute(생략)
	// 4. /WEB-INF/views/sub6/link12.jsp로 포워드

	@RequestMapping("link12")
	public void method12(String name, int age) {
	}

}
