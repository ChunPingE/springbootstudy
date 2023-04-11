package com.example.demo.controller;

import java.io.*;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import jakarta.servlet.http.*;

@Controller
@RequestMapping("sub4")
public class Controller04 {
	// method argument(parameter)

	// 경로 : /sub4/link
	@RequestMapping("link1")
	public void method01(HttpServletRequest request) {
		// 1. request parametr 수집 / 가공
		String name = request.getParameter("name");
		String age = request.getParameter("age");

		System.out.println("name: " + name);
		System.out.println("age: " + age);

		// 2. business logic

		// 3. add attribute

		// 4. foward/ redirect
	}

	// 경로 /sub/link2
	// address emial파라미터 출력하는 메소드 작성
	// 경로 : /sub4/link
	@RequestMapping("link2")
	public void method02(HttpServletRequest request) throws IOException {
		// 1. request parametr 수집 / 가공
		String address = request.getParameter("address");
		String email = request.getParameter("email");

		System.out.println("address: " + address);
		System.out.println("email: " + email);

	}

	@RequestMapping("link3")
	public void method03(@RequestParam("address") String address) throws IOException {
		System.out.println("address: " + address);
	}

	@RequestMapping("link4")
	public void method04(@RequestParam("age") String myage) {
		System.out.println("age: " + myage);
		int age = Integer.parseInt(myage);
		System.out.println("int age: " + age);
	}

	@RequestMapping("link5")
	public void method05(@RequestParam("score") int score) {
		System.out.println("score: " + score);
	}
}
