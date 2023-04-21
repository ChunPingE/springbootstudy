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
@RequestMapping("sub22")
public class Controller22 {

	@Autowired
	private Mapper03 mapper;

	@RequestMapping("link1")
	public void method1() {
		int cnt1 = mapper.sql1(77, "java");
		int cnt2 = mapper.sql1(88, "spring");
		int cnt3 = mapper.sql1(99, "css");

		System.out.println(cnt1);
		System.out.println(cnt2);
		System.out.println(cnt3);
	}

	@RequestMapping("link2")
	public void method2() {
		int cnt = mapper.sql2(99.99, "korean");
		System.out.println(cnt);
	}

	// /sub22/link3?val1=98.98&val2=송태섭
	@RequestMapping("link3")
	public void method3(Double val1, String val2) {
		int cnt = mapper.sql2(val1, val2);
		System.out.println(cnt);
	}

	@RequestMapping("link4")
	public void method4() {
		Dto09 dto = new Dto09();
		dto.setProp1(300);
		dto.setProp2("hello mybatis");
		dto.setProp3(33.33);
		int cnt = mapper.sql3(dto);
		System.out.println(cnt);
	}

	@RequestMapping("link5")
	public void method5() {
		Dto10 dto = new Dto10();
		dto.setAge(26);
		dto.setName("park");
		dto.setScore(100.00);
		int cnt = mapper.sql4(dto);
		System.out.println(cnt + "행이 입력되었습니다.");
	}

	// /sub22/link6?age=77&name=park&score=88.88
	@RequestMapping("link6")
	public void method6(Dto10 dto) {
		int cnt = mapper.sql4(dto);
		System.out.println(cnt + "행이 입력되었습니다.");
	}

	// MyTable36에 데이터 추가될 수 있게 코드 수정하기
	// /sub22/link7?prop1=10&prop2=son&prop3=10.00
	@RequestMapping("link7")
	public void method7(Dto09 dto) {
		int cnt = mapper.sql3(dto);
		System.out.println(cnt + "행이 입력되었습니다.");
	}

	// /sub22/link8?prop1=10&name=son&score=10.00
	@RequestMapping("link8")
	public void method8() {
		Dto09 dto9 = new Dto09();
		Dto10 dto10 = new Dto10();
		dto9.setProp1(10);
		dto10.setName("son");
		dto10.setScore(10.00);
		int cnt = mapper.sql5(dto9, dto10);
		System.out.println(cnt + "행이 입력되었습니다.");
	}
	
	@RequestMapping("link9")
	public void method9() {
		Dto09 dto1 = new Dto09();
		Dto10 dto2 = new Dto10();
		dto1.setProp1(10);
		dto1.setProp2("son");
		dto1.setProp3(10.00);
		dto2.setAge(20);
		dto2.setName("park");
		dto2.setScore(20.00);
		int cnt = mapper.sql6(dto1, dto2);
		System.out.println(cnt + "행이 입력되었습니다.");
	}
	
	// /sub22/link10?prop1=7&prop2=lunch&prop3=3.14&age=8&name=song&score=3.14
	@RequestMapping("link10")
	public void method9(Dto09 p1, Dto10 p2) {
		int cnt = mapper.sql6(p1, p2);
		System.out.println(cnt + "행이 입력되었습니다.");
	}
	
		
}
