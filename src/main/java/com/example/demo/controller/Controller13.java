package com.example.demo.controller;

import java.sql.*;
import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;

@Controller
@RequestMapping("sub13")
public class Controller13 {
	@Value("${spring.datasource.url}")
	private String url;
	@Value("${spring.datasource.username}")
	private String dbId;
	@Value("${spring.datasource.password}")
	private String pwd;

	@RequestMapping("link1")
	public void method1(Model model) {
		String sql = "SELECT customerId, customerName, address FROM Customers";
		List<Customer> list = new ArrayList<>();
		try {
			Connection con = DriverManager.getConnection(url, dbId, pwd);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			try (con; st; rs;) {
				while (rs.next()) {
					int id = rs.getInt("customerId");
					String name = rs.getString("customerName");
					String address = rs.getString("address");

					Customer customer = new Customer();
					customer.setCustomerId(id);
					customer.setContactName(name);
					customer.setAddress(address);
					list.add(customer);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		model.addAttribute("customerList", list);
	}

	@RequestMapping("link2")
	public void method2(Model model) {
		String sql = "SELECT employeeid, lastname, firstname FROM Employees";
		List<Employee> list = new ArrayList<>();
		try {
			Connection con = DriverManager.getConnection(url, dbId, pwd);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);

			try (con; st; rs;) {
				while (rs.next()) {
					Employee employee = new Employee();
					employee.setEmployeeId(rs.getInt("employeeid"));
					employee.setLastName(rs.getString("lastname"));
					employee.setFirstName(rs.getString("firstname"));
					list.add(employee);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		model.addAttribute("employeeList", list);
	}

	// 경로 : /sub13/link3?id=
	@RequestMapping("link3")
	public String method3(String id, Model model) {
		String sql = "SELECT customerId, customerName, address FROM Customers WHERE customerId =";
		sql += id;
		List<Customer> list = new ArrayList<>();
		try {
			Connection con = DriverManager.getConnection(url, dbId, pwd);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);

			try (con; st; rs;) {
				while (rs.next()) {
					Customer customer = new Customer();
					customer.setCustomerId(rs.getInt("customerId"));
					customer.setContactName(rs.getString("customerName"));
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
	
	// 경로 : /sub13/link4?id=
	@RequestMapping("link4")
	public String method4(String id, Model model) {
		String sql = "SELECT customerId, customerName, address FROM Customers WHERE customerId = ?";
		List<Customer> list = new ArrayList<>();
		try {
			Connection con = DriverManager.getConnection(url, dbId, pwd);
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			ResultSet rs = pstmt.executeQuery();

			try (con; pstmt; rs;) {
				while (rs.next()) {
					Customer customer = new Customer();
					customer.setCustomerId(rs.getInt("customerId"));
					customer.setContactName(rs.getString("customerName"));
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
	
	@RequestMapping("link5")
	public String method5(int id, Model model) {
		String sql = "SELECT EmployeeId, lastName, firstName FROM Employees WHERE EmployeeId = ?";
		List<Employee> list = new ArrayList<>();
		try {
			Connection con = DriverManager.getConnection(url, dbId, pwd);
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();

			try (con; pstmt; rs;) {
				while (rs.next()) {
					Employee employee = new Employee();
					employee.setEmployeeId(rs.getInt("EmployeeId"));
					employee.setLastName(rs.getString("lastName"));
					employee.setFirstName(rs.getString("firstName"));
					list.add(employee);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		model.addAttribute("employeeList", list);
		return "/sub13/link2";
	}
	
	
}
