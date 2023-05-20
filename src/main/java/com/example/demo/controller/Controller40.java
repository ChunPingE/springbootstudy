package com.example.demo.controller;

import java.time.*;
import java.util.*;

import org.eclipse.tags.shaded.org.apache.regexp.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;
import com.example.demo.mapper.*;

@Controller
@RequestMapping("sub40")
public class Controller40 {

	@GetMapping("link1")
	public void method1() {
	}

	@PostMapping("link1")
	public void method2(Integer x, Integer y, String op) {
		if (op.equals("plus")) {
			System.out.println(x + y);
		} else {
			System.out.println(x - y);
		}
		//서비스에 op넘겨서 알아서 하도록 해야할듯
	}
}