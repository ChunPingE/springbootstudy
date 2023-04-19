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
@RequestMapping("sub15")
public class Controller15 {
	@Value("${spring.datasource.url}")
	private String url;
	@Value("${spring.datasource.username}")
	private String dbId;
	@Value("${spring.datasource.password}")
	private String pwd;

	@RequestMapping("link1")
	public void method1() {
		// 새 고객 데이터 추가하기
		String sql = "INSERT INTO Customers(customerId, customerName, city) "
				+ "VALUES (92,'서태웅','부산')";

		// INSERT UPDATE DELTE는
		// Statement의 executeUpdate 메소드 사용
		// 리턴 값은 영향을 미친 레코드 수
		try {
			Connection con = DriverManager.getConnection(url, dbId, pwd);
			PreparedStatement pstmt = con.prepareStatement(sql);
			int count = pstmt.executeUpdate();

			try (con; pstmt;) {
				System.out.println(count);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// /sub15/link2 요청시 10번째 직원 추가하기
	// 컬럼 : EmployeeId, lastName, firstName

	@RequestMapping("link2")
	public void method2() {
		String sql = "INSERT INTO Employees (EmployeeId, lastName, firstName) "
				+ "VALUES(10, '백호', '강')";
		try {
			Connection con = DriverManager.getConnection(url, dbId, pwd);
			PreparedStatement pstmt = con.prepareStatement(sql);
			int count = pstmt.executeUpdate();

			try (con; pstmt;) {
				System.out.println(count);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// http://localhost:8080/sub15/link3?customerName=송태섭&city=부산&country=한국
	@RequestMapping("link3")
	public void method3(
			@RequestParam("customerName") String customerName,
			@RequestParam("city") String city,
			@RequestParam("country") String country,
			HttpServletResponse response) throws IOException {

		String sql = "INSERT INTO Customers(customerName, city, Country) "
				+ "VALUES (?, ?, ?)";

		try {
			Connection con = DriverManager.getConnection(url, dbId, pwd);
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, customerName);
			pstmt.setString(2, city);
			pstmt.setString(3, country);

			try (con; pstmt;) {
				int count = pstmt.executeUpdate();
				System.out.println(count);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		response.sendRedirect("/sub15/listcon");
	}

	// /sub15/link4>firstName=박지성&lastName=두개의 심장
	// 직원정보 추가
	@RequestMapping("link4")
	public void method4(String firstName, String lastName) {
		String sql = "INSERT INTO Employees(firstName, lastName) "
				+ "VALUES (?, ?)";

		try {
			Connection con = DriverManager.getConnection(url, dbId, pwd);
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, firstName);
			pstmt.setString(2, lastName);

			try (con; pstmt;) {
				int count = pstmt.executeUpdate();
				System.out.println(count);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@RequestMapping("link5")
	public void method5() {
		// form이 있는 view로 포워드
		// view : /WEB-INF/vies/sub15/link5.jsp
	}

	@RequestMapping("link6")
	public void method6(String firstName, String lastName) {
		String sql = "INSERT INTO Employees(firstName, lastName) "
				+ "VALUES (?, ?)";

		try {
			Connection con = DriverManager.getConnection(url, dbId, pwd);
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, firstName);
			pstmt.setString(2, lastName);

			try (con; pstmt;) {
				int count = pstmt.executeUpdate();
				System.out.println(count);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 경로 : /sub15/link7 form이 있는 jsp로 포워드
	@RequestMapping("link7")
	public void method7() {
	}

	// 경로 : /sub15/link8 처리메소드
	@RequestMapping("link8")
	public void method8(String name, String city, String country) {
		// 3개 메소드 파라미터 활용해서 supplier테이블에 레코드추가
		String sql = "INSERT INTO Suppliers(SupplierName, City, Country) "
				+ "VALUES (?, ?, ?)";

		try {
			Connection con = DriverManager.getConnection(url, dbId, pwd);
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, city);
			pstmt.setString(3, country);

			try (con; pstmt;) {
				int count = pstmt.executeUpdate();
				System.out.println(count + "행이 추가되었습니다.");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@RequestMapping("link9")
	public void method9() {
	}

	@RequestMapping("link10")
	public void method10(@ModelAttribute("customer") Customer customer) {

		String sql = "INSERT INTO Customers(customerName, contactName, address) "
				+ "VALUES (?, ?, ?)";

		try {
			Connection con = DriverManager.getConnection(url, dbId, pwd);
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, customer.getCustomerName());
			pstmt.setString(2, customer.getContactName());
			pstmt.setString(3, customer.getAddress());
			try (con; pstmt;) {
				int count = pstmt.executeUpdate();
				System.out.println(count + "행이 추가되었습니다.");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 경로 : /sub15/link11 view로 포워드
	@RequestMapping("link11")
	public void method11() {

	}

	// 경로 : /sub15/link12
	@RequestMapping("link12")
	@ResponseBody
	public String method12(Supplier supplier) {
		int keyValue = 0;
		String sql = "INSERT INTO Suppliers (supplierName, contactName, address, city, postalCode, country, phone) "
				+ "VALUES(?,?,?,?,?,?,?)";
		try {
			Connection con = DriverManager.getConnection(url, dbId, pwd);
			PreparedStatement pstmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			pstmt.setString(1, supplier.getSupplierName());
			pstmt.setString(2, supplier.getContactName());
			pstmt.setString(3, supplier.getAddress());
			pstmt.setString(4, supplier.getCity());
			pstmt.setString(5, supplier.getPostalCode());
			pstmt.setString(6, supplier.getCountry());
			pstmt.setString(7, supplier.getPhone());
			int count = pstmt.executeUpdate();

			// 자동생성된 컬럼(키)값 얻기
			ResultSet key = pstmt.getGeneratedKeys();

			try (con; pstmt; key;) {
				if (key.next()) {
					keyValue = key.getInt(1);
				}
				System.out.println(count + "행이 업데이트되었습니다.");
				System.out.println(keyValue);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return keyValue + "번 공급자 데이터 입력됨";
	}

	// 연습
	@RequestMapping("insert")
	public void insertform() {
	}

	@RequestMapping("listcon")
	public String listcon(@ModelAttribute("customerList") ArrayList<Customer> list) {

		String sql = "SELECT customerId, customerName, city FROM Customers ORDER BY CustomerID DESC LIMIT 10";
		// List<Customer> list = new ArrayList<>();
		try {
			Connection con = DriverManager.getConnection(url, dbId, pwd);
			PreparedStatement pstmt = con.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();

			try (con; pstmt; rs;) {
				while (rs.next()) {
					Customer customer = new Customer();
					customer.setCustomerId(rs.getInt("customerId"));
					customer.setCustomerName(rs.getString("customerName"));
					customer.setAddress(rs.getString("city"));
					list.add(customer);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		// model.addAttribute("customerList", list);
		return "/sub15/list";
	}

}
