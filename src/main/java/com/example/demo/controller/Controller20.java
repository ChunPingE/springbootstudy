package com.example.demo.controller;

import java.sql.*;
import java.time.*;
import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;
import com.example.demo.mapper.*;

@Controller
@RequestMapping("sub20")
public class Controller20 {

	@Autowired
	private Mapper01 mapper;

	@RequestMapping("link1")
	public void method1() {
		String name = mapper.method1();
		System.out.println(name);
		System.out.println(mapper.method2());
	}

	@RequestMapping("link2")
	public void method2() {
		// Mapper01에 method3작성
		// 1번 공급자의 공급자명 출력
		System.out.println(mapper.method3());
	}

	@RequestMapping("link3")
	public void method3() {
		System.out.println(mapper.method4(3));
	}

	// /sub20/link4?ud=70
	@RequestMapping("link4")
	public void method4(@RequestParam("id") int customerId) {
		System.out.println(mapper.method4(customerId));
	}

	// /sub20/link5?id=2
	@RequestMapping("link5")
	public void method5(int id) {
		String lastName = mapper.method5(id);
		System.out.println(lastName);
	}

	@RequestMapping("link6")
	public void method6() {
		System.out.println(mapper.method6());
		// mapper01 에 method7작성 하나의 row의 weight컬럼의 값리턴

		Double weight = mapper.method7();
		System.out.println(weight);

		LocalDate published = mapper.method8();
		System.out.println(published);

		LocalDateTime updated = mapper.method9();
		System.out.println(updated);
	}

	@RequestMapping("link7")
	public void method7() {
		Dto06 res = mapper.method10();
		System.out.println(res);
	}

	@RequestMapping("link8")
	public void method8() {
		Dto05 res = mapper.method11();
		System.out.println(res);
	}
	
	@RequestMapping("link9")
	public void method9() {
		Customer res = mapper.method12();
		System.out.println(res);
	}
	
	@RequestMapping("link10")
	public void method10() {
		Supplier res = mapper.method13();
		System.out.println(res);
	}
	
	@RequestMapping("link11")
	public void method11() {
		Employee res = mapper.method14();
		System.out.println(res);
	}
	
	
	
	
	
	
	
	
	
	/*
	// /sub19/link15 MyTable33에 있는 데이터들 jsp에서 보여주기
	@RequestMapping("link15")
	public void method15(Model model) throws Exception {
		List<Dto06> list = mapper.method12();
		model.addAttribute("bookList", list);
	}
	*/

}
