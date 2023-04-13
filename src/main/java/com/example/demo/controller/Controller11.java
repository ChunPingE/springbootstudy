package com.example.demo.controller;

import java.sql.*;

import javax.sql.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("sub11")
public class Controller11 {
	@Value("${spring.datasource.url}")
	private String url;
	@Value("${spring.datasource.name}")
	private String dbId;
	@Value("${spring.datasource.password}")
	private String pwd;

	@RequestMapping("link1")
	public void method01(Model model) {
		// 2. business logic
		// SELECT CustomerName FROM Customers WHERE CustomerID = 1;

		// sql
		String sql = "SELECT customername FROM Customers WHERE CustomerID = 1";

		try ( // DB연결
				Connection connection = DriverManager.getConnection(url, dbId, pwd);
				// Statement 객체 생성
				Statement statement = connection.createStatement();
				// 쿼리 실행
				ResultSet resultSet = statement.executeQuery(sql);) {

			// 쿼리 실행 결과 얻고 쿼리실행 결과 가공
			String name = "";
			if (resultSet.next()) {
				name += resultSet.getString("customername");
			}
			model.addAttribute("customername", name);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@RequestMapping("link2")
	public void method02(Model model) {
		// 2. business logic
		// 아이디 3인 직원의 last name을 조회해보자.

		String employeeName = "";

		String sql = "SELECT lastname FROM Employees WHERE EmployeeId = 3";

		try (Connection con = DriverManager.getConnection(url, dbId, pwd);
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery(sql);) {

			if (rs.next()) {
				employeeName = rs.getString("lastname");
			}

			System.out.println(employeeName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		model.addAttribute("name", employeeName);
	}

	@RequestMapping("link3")
	public void method03(Model model) {
		// id가 5인 상품 이름 조회
		String sql = "SELECT productname FROM Products WHERE productid = 5";
		String productName = "";
		try (Connection con = DriverManager.getConnection(url, dbId, pwd);
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery(sql);) {
			if (rs.next()) {
				productName = rs.getString("productname");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		model.addAttribute("productName", productName);
	}
}
