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
@RequestMapping("sub18")
public class Controller18 {
	@Value("${spring.datasource.url}")
	private String url;
	@Value("${spring.datasource.username}")
	private String dbId;
	@Value("${spring.datasource.password}")
	private String pwd;

	// 트랜젝션 없이 실행
	@RequestMapping("link1")
	public void method1() {
		String sql1 = "UPDATE Bank SET money = money - 5000 "
				+ "WHERE customerName = 'A'";
		String sql2 = "UPDATE Bank SET money = money + 5000 "
				+ "WHERE customerName = 'B'";

		try {
			Connection con = DriverManager.getConnection(url, dbId, pwd);
			Statement stmt3 = con.createStatement();

			Statement stmt1 = con.createStatement();
			Statement stmt2 = con.createStatement();

			stmt1.executeUpdate(sql1);
			stmt2.executeUpdate(sql2);

			System.out.println("이체완료");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 트랜젝션 설정없이 중간에 exception 발생
	@RequestMapping("link2")
	public void method2() {
		String sql1 = "UPDATE Bank SET money = money - 5000 "
				+ "WHERE customerName = 'A'";
		String sql2 = "UPDATE Bank SET money = money + 5000 "
				+ "WHERE customerName = 'B'";

		try {
			Connection con = DriverManager.getConnection(url, dbId, pwd);

			Statement stmt1 = con.createStatement();
			Statement stmt2 = con.createStatement();

			try (con; stmt1; stmt2;) {
				stmt1.executeUpdate(sql1);

				// exception 발생
				int a = 3 / 0;

				stmt2.executeUpdate(sql2);
			}

			System.out.println("이체완료");

		} catch (Exception e) {
			System.out.println("이체실패");
			e.printStackTrace();
		}
	}

	// 트랜젝션 설정 후 모두 성공
	@RequestMapping("link3")
	public void method3() {
		String sql1 = "UPDATE Bank SET money = money - 5000 "
				+ "WHERE customerName = 'A'";
		String sql2 = "UPDATE Bank SET money = money + 5000 "
				+ "WHERE customerName = 'B'";

		try (Connection con = DriverManager.getConnection(url, dbId, pwd);
				Statement stmt1 = con.createStatement();
				Statement stmt2 = con.createStatement();) {
			con.setAutoCommit(false);

			stmt1.executeUpdate(sql1);
			stmt2.executeUpdate(sql2);

			con.commit();

			System.out.println("이체완료");

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("이체실패");
		}
	}

	// 트랜젝션 설정 후 모두 실패
	@RequestMapping("link4")
	public void method4() throws Exception {
		String sql1 = "UPDATE Bank SET money = money - 5000 "
				+ "WHERE customerName = 'A'";
		String sql2 = "UPDATE Bank SET money = money + 5000 "
				+ "WHERE customerName = 'B'";

		Connection con = DriverManager.getConnection(url, dbId, pwd);

		try (con;
				Statement stmt1 = con.createStatement();
				Statement stmt2 = con.createStatement();) {
			con.setAutoCommit(false);

			stmt1.executeUpdate(sql1);

			//exception 발생
			int a = 3 / 0;

			stmt2.executeUpdate(sql2);

			con.commit();

			System.out.println("이체완료");

		} catch (Exception e) {
			System.out.println("이체실패");
			con.rollback();
			e.printStackTrace();
		}
	}

}
