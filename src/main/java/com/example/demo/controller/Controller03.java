package com.example.demo.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("sub3")
public class Controller03 {
	
	//sping mvc request handler method
	
	@RequestMapping("link1")
	public void method1() {
		System.out.println("/sub3/link1에서 집에가고 싶다는 요청중");
	}
	
	@RequestMapping("link2")
	public void method2() {
		System.out.println("/sub3/link2에서 됐다는 요청중");
	}
}
