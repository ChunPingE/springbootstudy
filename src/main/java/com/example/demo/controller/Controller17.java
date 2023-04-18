package com.example.demo.controller;

import java.io.*;
import java.sql.*;
import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;

import jakarta.servlet.http.*;

@Controller
@RequestMapping("sub17")
public class Controller17 {
	@Value("${spring.datasource.url}")
	private String url;
	@Value("${spring.datasource.username}")
	private String dbId;
	@Value("${spring.datasource.password}")
	private String pwd;

	// /sub17/link1?id=35&name=서태웅
	@RequestMapping("link1")
	public void method1(int id, String name) {
		String sql = "UPDATE Suppliers SET SupplierName = ? WHERE SupplierId = ?";
		try {
			Connection con = DriverManager.getConnection(url, dbId, pwd);
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setInt(2, id);
			try (con; pstmt;){
				int count = pstmt.executeUpdate();
				System.out.println(count + "개의 행 업데이트");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// /sub17/link2?id=35&address=seoul로 바꾸는 메소드
	@RequestMapping("link2")
	public void method2(int id, String address) {
		String sql = "UPDATE Suppliers SET address = ? WHERE SupplierId = ?";
		try {
			Connection con = DriverManager.getConnection(url, dbId, pwd);
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, address);
			pstmt.setInt(2, id);
			try (con; pstmt;){
				int count = pstmt.executeUpdate();
				System.out.println(count + "개의 행 업데이트");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
