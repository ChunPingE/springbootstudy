package com.example.demo.controller;

import java.lang.annotation.*;
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
@RequestMapping("sub21")
public class Controller21 {

	@Autowired
	private Mapper02 mapper;

	@RequestMapping("link1")
	public void method1() {
		// String sql = "SELECT CustomerName FROM Customers";

		List<String> list = mapper.sql1();
		list.forEach(System.out::println);
	}

	// 경로 : /sub21/link2
	// 직원의 lastName 출력하기
	@RequestMapping("link2")
	public void method2() {
		List<String> list = mapper.sql2();
		list.forEach(System.out::println);
	}

	@RequestMapping("link3")
	public void method3() {
		List<Dto07> names = mapper.sql3();
		names.forEach(System.out::println);
	}

	// 모든 상품의 이름, 가격을 조회해서 콘솔에 출력하기
	@RequestMapping("link4")
	public void method4() {
		List<Dto08> products = mapper.sql4();
		products.forEach(System.out::println);
	}

	@RequestMapping("link5")
	public void method5(int cid) {
		List<String> list = mapper.sql5(cid);
		list.forEach(System.out::println);
	}
	
	// /sub21/link6?country=uk 
	// /sub21/link6?country=canada
	@RequestMapping("link6")
	public void method6(String country) {
		List<String> list = mapper.sql6(country);
		list.forEach(System.out::println);
	}
	
	@RequestMapping("link7")
	public void method7(int cid) {
		List<Dto08> list = mapper.sql7(cid);
		list.forEach(System.out::println);
	}

}
