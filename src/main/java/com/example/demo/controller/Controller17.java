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
			try (con; pstmt;) {
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
			try (con; pstmt;) {
				int count = pstmt.executeUpdate();
				System.out.println(count + "개의 행 업데이트");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@RequestMapping("link3")
	public void method3(int id, Supplier supplier) {
		String sql = "UPDATE Suppliers SET "
				+ "SupplierName = ?, "
				+ "ContactName = ?, "
				+ "Address = ?, "
				+ "City = ?,"
				+ "PostalCode = ?,"
				+ "Country = ?, "
				+ "Phone = ? "
				+ "WHERE SupplierId = ?";
		try {
			Connection con = DriverManager.getConnection(url, dbId, pwd);
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, supplier.getSupplierName());
			pstmt.setString(2, supplier.getContactName());
			pstmt.setString(3, supplier.getAddress());
			pstmt.setString(4, supplier.getCity());
			pstmt.setString(5, supplier.getPostalCode());
			pstmt.setString(6, supplier.getCountry());
			pstmt.setString(7, supplier.getPhone());
			pstmt.setInt(8, id);

			try (con; pstmt;) {
				int count = pstmt.executeUpdate();
				System.out.println(count + "개의 행 업데이트");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// /sub17/link4?id=36
	@RequestMapping("link4")
	public void method4(int id, Model model) {
		String sql = "SELECT * FROM Suppliers WHERE SupplierId = ?";
		Supplier supplier = null;
		try {
			Connection con = DriverManager.getConnection(url, dbId, pwd);
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			try (con; pstmt; rs;) {
				if (rs.next()) {
					supplier = new Supplier();
					supplier.setSupplierId(rs.getInt("supplierId"));
					supplier.setSupplierName(rs.getString("supplierName"));
					supplier.setContactName(rs.getString("contactName"));
					supplier.setAddress(rs.getString("address"));
					supplier.setCity(rs.getString("city"));
					supplier.setPostalCode(rs.getString("postalCode"));
					supplier.setCountry(rs.getString("country"));
					supplier.setPhone(rs.getString("phone"));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		model.addAttribute("supplier", supplier);
		System.out.println(supplier.getSupplierName());
		System.out.println(supplier.getContactName());
	}

	// 고객조회
	@RequestMapping("link5")
	public void method5(int id, Model model) {
		String sql = "SELECT * FROM Customers WHERE customerId = ?";
		Customer customer = null;

		try {
			Connection con = DriverManager.getConnection(url, dbId, pwd);
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();

			try (rs; pstmt; con;) {
				if (rs.next()) {
					customer = new Customer();
					customer.setCustomerId(rs.getInt("customerId"));
					customer.setCustomerName(rs.getString("customerName"));
					customer.setContactName(rs.getString("contactName"));
					customer.setAddress(rs.getString("address"));
					customer.setCity(rs.getString("city"));
					customer.setPostalCode(rs.getString("postalCode"));
					customer.setCountry(rs.getString("country"));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		model.addAttribute("customer", customer);
	}

	// 고객수정
	@RequestMapping("link6")
	public void method6(Customer customer) {
		String sql = "UPDATE Customers SET "
				+ "customerName = ?, "
				+ "contactName = ?, "
				+ "address = ?,"
				+ "city = ?,"
				+ "postalCode = ?, "
				+ "Country = ? "
				+ "WHERE customerId = ?";

		try {
			Connection con = DriverManager.getConnection(url, dbId, pwd);
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, customer.getCustomerName());
			pstmt.setString(2, customer.getContactName());
			pstmt.setString(3, customer.getAddress());
			pstmt.setString(4, customer.getCity());
			pstmt.setString(5, customer.getPostalCode());
			pstmt.setString(6, customer.getCountry());
			pstmt.setInt(7, customer.getCustomerId());
			try (pstmt; con;){
				int count = pstmt.executeUpdate();
				System.out.println(count + "개의 행 업데이트");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
