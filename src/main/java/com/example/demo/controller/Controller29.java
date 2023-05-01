package com.example.demo.controller;

import java.io.*;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.*;

import lombok.*;

@Controller
@RequestMapping("sub29")
public class Controller29 {

	// 경로 : /sub29/link1?name=
	@GetMapping("link1")
	public void method1() {

	}

	// 경로 : /sub29/link2
	@PostMapping("link2")
	public void method2(@RequestParam("myfile") MultipartFile file) {
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getSize());
	}

	// 경로 : /sub29/link3
	@GetMapping("link3")
	public void method3() {
		// link3으로 포워드
	}

	@PostMapping("link4")
	public void method4(@RequestParam("files") MultipartFile[] files) {
		for (MultipartFile file : files) {

			System.out.println(file.getOriginalFilename());
			System.out.println(file.getSize());
		}
	}

	@GetMapping("link5")
	public void method5() {
	}

	@PostMapping("link6")
	public void method6(@RequestParam("files") MultipartFile[] files) {
		for (MultipartFile file : files) {
			System.out.println(file.getOriginalFilename());
			System.out.println(file.getSize());
		}
	}

	@GetMapping("link7")
	public void method7() {
	}

	@Data
	static class Sub29Dto {
		private String name;
		private Integer age;
	}

	@PostMapping("link8")
	public void method8(@RequestParam("files") MultipartFile[] files,
			String name, Integer age, Sub29Dto dto) {

		System.out.println(dto);
		System.out.println(name);
		System.out.println(age);
		for (MultipartFile file : files) {
			System.out.println(file.getOriginalFilename());
			System.out.println(file.getSize());
		}
	}

	@GetMapping("link9")
	public void method9() {
	}

	@PostMapping("link10")
	public void method10(@RequestParam("file1") MultipartFile file) {

		try (InputStream fis = file.getInputStream();
				BufferedInputStream bis = new BufferedInputStream(fis)) {

			String targetFileName = "copy_" + file.getOriginalFilename();

			try (FileOutputStream fos = new FileOutputStream(targetFileName);
					BufferedOutputStream bos = new BufferedOutputStream(fos)) {
				byte[] data = new byte[1024];
				while (true) {
					int len = bis.read(data);
					if (len == -1) {
						break;
					}
					bos.write(data, 0, len);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@PostMapping("link11")
	public void method11(@RequestParam("file1") MultipartFile file) {

		try {
			File target = new File("F:/study/copy11_" + file.getOriginalFilename());
			file.transferTo(target);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
