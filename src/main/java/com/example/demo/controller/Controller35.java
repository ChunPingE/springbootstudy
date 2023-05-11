package com.example.demo.controller;

import java.util.*;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import lombok.*;

@Controller
@RequestMapping("sub35")
public class Controller35 {

	@GetMapping("ajax1")
	public void ajax1() {
	}

	@PostMapping("link1")
	public void method1() {
		System.out.println("포스트 요청 잘 받음");
	}

	@PostMapping("link2")
	public void method2() {
		System.out.println("메소드2 일함");
	}

	// sub35/link3?name=손
	@PostMapping("link3")
	public void method3(String name) {
		System.out.println("name: " + name);
	}

	@PostMapping("link4")
	public void method4(String address, Double price) {
		System.out.println("address: " + address);
		System.out.println("price: " + price);
	}

	@Data
	static class Dto1 {
		private String name;
		private Double score;
		private String email;
	}

	@PostMapping("link5")
	public void method5(Dto1 dto) {
		System.out.println(dto);
	}

	@Data
	static class Dto2 {
		private String address;
		private String product;
		private Double price;
	}

	@PostMapping("link6")
	public void method6(Dto2 dto) {
		System.out.println(dto);
	}

	// json 요청데이터는
	// @RequestBody Map이나
	// @RequestBody javaBean으로 받음
	@PostMapping("link7")
	public void method7(@RequestBody Map map) {
		System.out.println("메소드7 실행됨");
		System.out.println(map);
	}

	@PostMapping("link8")
	public void method8(@RequestBody Map data) {
		System.out.println(data.get("address"));
		System.out.println(data.get("name"));
	}

	// {"age":26, "name":"park", "married": false}
	@PostMapping("link9")
	public void method9(@RequestBody Map data) {
		System.out.println(data.get("age"));
		System.out.println(data.get("name"));
		System.out.println(data.get("married"));

		System.out.println(data.get("age").getClass().getSimpleName()); // Integer
		System.out.println(data.get("name").getClass().getSimpleName()); // String
		System.out.println(data.get("married").getClass().getSimpleName()); // Booelan
	}

	@PostMapping("link10")
	public void method10(@RequestBody Map<String, Object> map) {
		System.out.println(map.get("address")); // null
		System.out.println(map.get("name")); // 30
		System.out.println(map.get("age")); // 손흥민
	}

	@PostMapping("link11")
	public void method11(@RequestBody Map<String, Object> map) {
		System.out.println(map); // {book={title=java, price=300}, address=seoul}
		System.out.println(map.get("book").getClass().getSimpleName()); // LinkedHashMap

		Map<String, Object> book = (Map<String, Object>) map.get("book");
		System.out.println(book.get("title")); // java
		System.out.println(book.get("price")); // 300
	}

	@PostMapping("link12")
	public void method12(@RequestBody Map<String, Object> map) {
		System.out.println(map);

		ArrayList<Object> list = (ArrayList<Object>) map.get("food");
		for (Object food : list) {
			System.out.println(food);
		}
	}

	// ["pizza", "coke", "coffee"]
	@PostMapping("link13")
	public void method13(@RequestBody List<String> list) {
		System.out.println(list);
	}
	
	// [{"name":"강백호", "pos":"파포"}, {"name":"서태웅", "pos":"스포"}]
	@PostMapping("link14")
	public void method14(@RequestBody List<Map<String, Object>> data) {
		System.out.println(data);
	}

}