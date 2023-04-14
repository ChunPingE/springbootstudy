package com.example.demo.controller;

import java.sql.*;
import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("sub12")
public class Controller12 {
	@Value("${spring.datasource.url}")
	private String url;
	@Value("${spring.datasource.username}")
	private String dbId;
	@Value("${spring.datasource.password}")
	private String pwd;

	@RequestMapping("link1")
	public void method1() {
		String sql = "SELECT lastName FROM Employees";

		try {
			Connection con = DriverManager.getConnection(url, dbId, pwd);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);

			try (con; st; rs;) {
				System.out.println(rs.next()); // true
				System.out.println(rs.getString("lastName"));
				System.out.println(rs.next()); // true
				System.out.println(rs.getString("lastName"));
				System.out.println(rs.next()); // true
				System.out.println(rs.getString("lastName"));
				System.out.println(rs.next()); // true
				System.out.println(rs.getString("lastName"));
				System.out.println(rs.next()); // true
				System.out.println(rs.getString("lastName"));
				System.out.println(rs.next()); // true
				System.out.println(rs.getString("lastName"));
				System.out.println(rs.next()); // true
				System.out.println(rs.getString("lastName"));
				System.out.println(rs.next()); // true
				System.out.println(rs.getString("lastName"));
				System.out.println(rs.next()); // true
				System.out.println(rs.getString("lastName"));
				System.out.println(rs.next()); // false
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@RequestMapping("link2")
	public void method2() {
		String sql = "SELECT lastName FROM Employees";

		try {
			Connection con = DriverManager.getConnection(url, dbId, pwd);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);

			try (con; st; rs;) {
				while (rs.next()) {
					System.out.println(rs.getString("lastName"));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// SELECT shipperName FROM Shippers
	@RequestMapping("link3")
	public void method3(Model model) {

		String sql = "SELECT shipperName FROM Shippers";
		List<String> list = new ArrayList<>();
		try {
			Connection con = DriverManager.getConnection(url, dbId, pwd);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);

			try (con; st; rs;) {
				while (rs.next()) {
					list.add(rs.getString("shipperName"));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		model.addAttribute("shipperNames", list);
	}

	// SELECT shipperName FROM Shippers
	@RequestMapping("link4")
	public void method4() {
		String sql = "SELECT * FROM Customers";
		try {
			Connection con = DriverManager.getConnection(url, dbId, pwd);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);

			try (con; st; rs;) {
				rs.next();
				System.out.println(rs.getString("customername"));
				System.out.println(rs.getString("contactname"));
				System.out.println(rs.getString("customername"));

				rs.next();
				System.out.println(rs.getString("customername"));
				System.out.println(rs.getString("contactname"));
				System.out.println(rs.getString("customername"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@RequestMapping("link5")
	public void method5() {
		String sql = "SELECT * FROM Customers";
		try {
			Connection con = DriverManager.getConnection(url, dbId, pwd);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);

			try (con; st; rs;) {
				while (rs.next()) {
					System.out.println("############");
					System.out.println(rs.getString("customername"));
					System.out.println(rs.getString("contactname"));
					System.out.println(rs.getString("customername"));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@RequestMapping("link6")
	public void method6() {
		String sql = "SELECT * FROM Products WHERE ProductId <= 3";
		try {
			Connection con = DriverManager.getConnection(url, dbId, pwd);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);

			try (con; st; rs;) {
				while (rs.next()) {
					System.out.println("############");
					System.out.println(rs.getInt("productid"));
					System.out.println(rs.getString("productname"));
					System.out.println(rs.getDouble("price"));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// SELECT * FROM Customers WHERE customerid < 4
	// customerid는 int 타입 customername 은 string타입으로 가져오기

	@RequestMapping("link7")
	public void method7() {
		String sql = "SELECT * FROM Customers WHERE customerid < 4";
		try {
			Connection con = DriverManager.getConnection(url, dbId, pwd);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);

			try (con; st; rs;) {
				while (rs.next()) {
					// System.out.println(rs.getInt("customerid"));
					// System.out.println(rs.getString("customername"));
					System.out.println(rs.getInt(1));
					System.out.println(rs.getString(2));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@RequestMapping("link8")
	public void method8() {
		String sql = "SELECT lastname, firstname FROM Employees WHERE EmployeeID < 4";
		try {
			Connection con = DriverManager.getConnection(url, dbId, pwd);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);

			try (con; st; rs;) {
				while (rs.next()) {
					String lastname = rs.getString(1);
					String firstname = rs.getString(2);

					System.out.println(lastname + ", " + firstname);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@RequestMapping("link9")
	public void method9() {
		String sql = "SELECT customerId, customerName, country FROM Customers WHERE customerId < 4";
		try {
			Connection con = DriverManager.getConnection(url, dbId, pwd);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);

			try (con; st; rs;) {
				while (rs.next()) {
					System.out.println("###############");
					int customerId = rs.getInt(1);
					String customerName = rs.getString(2);
					String country = rs.getString(3);
					System.out.println(customerId + ", " + customerName + ", " + country);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
