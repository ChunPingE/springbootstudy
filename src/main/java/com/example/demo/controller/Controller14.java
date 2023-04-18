package com.example.demo.controller;

import java.sql.*;
import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;

@Controller
@RequestMapping("sub14")
public class Controller14 {
	@Value("${spring.datasource.url}")
	private String url;
	@Value("${spring.datasource.username}")
	private String dbId;
	@Value("${spring.datasource.password}")
	private String pwd;

	// //sub14/link1?keyword=or
	@RequestMapping("link1")
	public String method1(String keyword, Model model) {
		String sql = "SELECT customerid, customername, address FROM Customers "
				+ "WHERE CustomerName LIKE ? ";

		if (keyword == null) {
			keyword = "";
		}

		List<Customer> list = new ArrayList<>();
		try {
			Connection con = DriverManager.getConnection(url, dbId, pwd);
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "%" + keyword + "%");
			ResultSet rs = pstmt.executeQuery();

			try (con; pstmt; rs;) {
				while (rs.next()) {
					Customer customer = new Customer();
					customer.setId(rs.getInt("customerid"));
					customer.setName(rs.getString("customername"));
					customer.setAddress(rs.getString("address"));
					list.add(customer);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		model.addAttribute("customerList", list);

		return "/sub13/link1";
	}

	// 추가업무 : ConatctName에도 키워드 조회 추가
	// 1.쿼리수정
	// 2.pstmt에 2번째 물음표에 set하는 코드추가
	// 3.Customer 자바빈 contactName 프로퍼티 추가
	// 4./.sub13/link1 뷰에 contactName 속성 출력하는 테이블 열 추가
	@RequestMapping("link2")
	public String method2(String keyword, Model model) {
		String sql = "SELECT customerId, customerName, contactName, address FROM Customers "
				+ "WHERE customerName LIKE ? OR contactName LIKE ?";

		if (keyword == null) {
			keyword = "";
		}
		List<Customer> list = new ArrayList<>();
		try {
			Connection con = DriverManager.getConnection(url, dbId, pwd);
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "%" + keyword + "%");
			pstmt.setString(2, "%" + keyword + "%");
			ResultSet rs = pstmt.executeQuery();

			try (con; pstmt; rs;) {
				while (rs.next()) {
					Customer customer = new Customer();
					customer.setId(rs.getInt("customerId"));
					customer.setName(rs.getString("customerName"));
					customer.setAddress(rs.getString("address"));
					customer.setContactName(rs.getString("contactName"));
					list.add(customer);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		model.addAttribute("customerList", list);

		return "/sub13/link1";
	}

}
