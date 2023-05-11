package com.example.demo.controller;

import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import lombok.*;

@Controller
@RequestMapping("sub34")
public class Controller34 {

	@GetMapping("ajax1")
	public void ajax1() {
	}

	@GetMapping("link1")
	@ResponseBody
	public String method1() {
		System.out.println("헬로 ajax");
		return "첫번째 응답 데이터";
	}

	@GetMapping("link2")
	@ResponseBody
	public void method2() {
		System.out.println("get 요청 link2");
	}

	@GetMapping("link3")
	@ResponseBody
	public void method3(@RequestParam("name") String name) {
		System.out.println("link3 메소드가 일함");
		System.out.println("name: " + name);
	}

	@GetMapping("link4")
	@ResponseBody
	public void method4(String address) {
		System.out.println("link4 메소드가 일함");
		System.out.println("address: " + address);
	}

	// /sub34/link5?name=손&age=22
	@GetMapping("link5")
	@ResponseBody
	public void method5(String name, Integer age) {
		System.out.println("link5 메소드가 일함");
		System.out.println("name: " + name);
		System.out.println("age: " + age);
	}

	@GetMapping("link6")
	@ResponseBody
	public void method6(String food, Double price) {
		System.out.println("link6 메소드가 일함");
		System.out.println("food: " + food);
		System.out.println("price: " + price);
	}

	// /sub34/link7?address=seoul&name=park&age=33
	@GetMapping("link7")
	@ResponseBody
	public void method7(@ModelAttribute Dto1 dto) {
		System.out.println(dto);
	}

	@Data
	class Dto1 {
		private String address;
		private String name;
		private Integer age;
	}

	@Data
	class Dto2 {
		private Double price;
		private String prodcut;
		private String category;
	}

	@GetMapping("link8")
	@ResponseBody
	public void method8(Dto2 dto) {
		System.out.println(dto);
	}

}