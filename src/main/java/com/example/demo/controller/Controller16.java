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
@RequestMapping("sub16")
public class Controller16 {
	@Value("${spring.datasource.url}")
	private String url;
	@Value("${spring.datasource.username}")
	private String dbId;
	@Value("${spring.datasource.password}")
	private String pwd;

	// /sub16/link1?id=30
	@RequestMapping("link1")
	public void method1(int id) {
		String sql = "DELETE FROM Suppliers WHERE SupplierID = ?";
		try {
			Connection con = DriverManager.getConnection(url, dbId, pwd);
			PreparedStatement pstmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			pstmt.setInt(1, id);
			try (con; pstmt;){
				int count = pstmt.executeUpdate();
				System.out.println(count + "개의 행 삭제");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// /sub16/link2?id=30
	// 고객테이블의 데이터 삭제
	@RequestMapping("link2")
	public void method2(int id) {
		String sql = "DELETE FROM Customers WHERE CustomerID = ?";
		try {
			Connection con = DriverManager.getConnection(url, dbId, pwd);
			PreparedStatement pstmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			pstmt.setInt(1, id);
			try (con; pstmt;){
				int count = pstmt.executeUpdate();
				System.out.println(count + "개의 행 삭제");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
}
