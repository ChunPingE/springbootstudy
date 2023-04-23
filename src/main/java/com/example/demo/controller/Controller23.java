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
@RequestMapping("sub23")
public class Controller23 {

	@Autowired
	private Mapper04 mapper;

	@RequestMapping("link1")
	public void method1() {
		int cnt = mapper.sql1();
		System.out.println(cnt + "개 행 삭제됨");
	}

	// /sub23/link2?id=3
	@RequestMapping("link2")
	public void method2(int id) {
		int cnt = mapper.sql2(id);
		System.out.println(cnt + "개 행 삭제됨");
	}

	// /sub23/link3?key=7
	@RequestMapping("link3")
	// 메소드 만들기
	// 7번 고객 삭제 하기
	public void method3(int key) {
		int cnt = mapper.sql3(key);
		System.out.println(cnt + "개 삭제됨");
	}
}
