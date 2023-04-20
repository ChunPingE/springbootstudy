package com.example.demo.controller;

import java.sql.*;
import java.sql.Date;
import java.time.*;
import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;

@Controller
@RequestMapping("sub19")
public class Controller19 {
	@Value("${spring.datasource.url}")
	private String url;
	@Value("${spring.datasource.username}")
	private String dbId;
	@Value("${spring.datasource.password}")
	private String pwd;

	@RequestMapping("link1")
	public void method1() throws Exception {
		String sql = "INSERT INTO MyTable30 (Col1, Col2) VALUES (?,?)";

		try (Connection con = DriverManager.getConnection(url, dbId, pwd);
				PreparedStatement pstmt = con.prepareStatement(sql);) {

			pstmt.setInt(1, 99);
			pstmt.setString(2, "hello");
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "개 행이 입력됨");
		}
	}

	@RequestMapping("link2")
	public void method2() throws Exception {
		String sql = "INSERT INTO MyTable30 (Col1, Col2) VALUES (?,?)";

		try (Connection con = DriverManager.getConnection(url, dbId, pwd);
				PreparedStatement pstmt = con.prepareStatement(sql);) {

			// pstmt.setInt(1, 99);
			// pstmt.setString(2, "hello");
			pstmt.setString(1, "888");
			pstmt.setInt(2, 12345);
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "개 행이 입력됨");
		}
	}

	@RequestMapping("link3")
	public void method3() throws Exception {
		String sql = "INSERT INTO MyTable31 (Col1, Col2) VALUES (?,?)";

		try (Connection con = DriverManager.getConnection(url, dbId, pwd);
				PreparedStatement pstmt = con.prepareStatement(sql);) {
			// pstmt.setString(1, "1923-03-01");
			// pstmt.setString(2, "1811-11-12 23:50:49");
			pstmt.setDate(1, Date.valueOf("2023-03-01"));
			pstmt.setTimestamp(2, Timestamp.valueOf("2000-01-01 22:22:11"));
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "개 행이 입력됨");
		}
	}

	// 경로 /sub19/link5
	// MyTable32에 새 레코드 추가
	@RequestMapping("link5")
	public void method4() throws Exception {
		String sql = "INSERT INTO MyTable32 VALUES (?,?,?,?,?)";

		try (Connection con = DriverManager.getConnection(url, dbId, pwd);
				PreparedStatement pstmt = con.prepareStatement(sql);) {
			pstmt.setString(1, "park");
			pstmt.setInt(2, 26);
			pstmt.setDouble(3, 123.45);
			pstmt.setDate(4, Date.valueOf("1998-01-05"));
			pstmt.setTimestamp(5, Timestamp.valueOf("2023-04-20 09:42:59"));

			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "개 행이 입력됨");
		}
	}

	@RequestMapping("link6")
	public void method6() {
		// forward to form
		// /WEB-INF/vies/sub19/link6.jsp
	}

	@RequestMapping("link7")
	public void method7(String name, String age, String price, String birth, String inserted) throws Exception {
		String sql = "INSERT INTO MyTable32 VALUES (?,?,?,?,?)";

		try (Connection con = DriverManager.getConnection(url, dbId, pwd);
				PreparedStatement pstmt = con.prepareStatement(sql);) {
			pstmt.setString(1, name);
			pstmt.setString(2, age);
			pstmt.setString(3, price);
			pstmt.setString(4, birth);
			pstmt.setString(5, inserted);

			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "개 행이 입력됨");
		}
	}

	@RequestMapping("link8")
	public void method8(String name, int age, double price, LocalDate birth, LocalDateTime inserted) throws Exception {
		String sql = "INSERT INTO MyTable32 VALUES (?,?,?,?,?)";

		try (Connection con = DriverManager.getConnection(url, dbId, pwd);
				PreparedStatement pstmt = con.prepareStatement(sql);) {
			pstmt.setString(1, name);
			pstmt.setInt(2, age);
			pstmt.setDouble(3, price);
			pstmt.setDate(4, Date.valueOf(birth));
			pstmt.setTimestamp(5, Timestamp.valueOf(inserted));

			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "개 행이 입력됨");
		}
	}

	@RequestMapping("link9")
	public void method9() {
	}

	@RequestMapping("link10")
	public void method10(Dto06 myTable33) throws Exception {
		String sql = "INSERT INTO MyTable33 VALUES (?,?,?,?,?)";

		try (Connection con = DriverManager.getConnection(url, dbId, pwd);
				PreparedStatement pstmt = con.prepareStatement(sql);) {
			pstmt.setString(1, myTable33.getTitle());
			pstmt.setDate(2, Date.valueOf(myTable33.getPublished()));
			pstmt.setInt(3, myTable33.getPrice());
			pstmt.setTimestamp(4, Timestamp.valueOf(myTable33.getUpdated()));
			pstmt.setDouble(5, myTable33.getWeight());
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "개 행이 입력됨");
		}
	}

	@RequestMapping("link11")
	public void method11() throws Exception {
		String sql = "SELECT * FROM MyTable33";
		try (Connection con = DriverManager.getConnection(url, dbId, pwd);
				PreparedStatement pstmt = con.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();) {
			if (rs.next()) {
				String title = rs.getString("title");
				String published = rs.getString("published");
				String price = rs.getString("price");
				String updated = rs.getString("updated");
				String weight = rs.getString("weight");

				System.out.println("제목:" + title);
				System.out.println("출판일:" + published);
				System.out.println("가격:" + price);
				System.out.println("수정일:" + updated);
				System.out.println("무게:" + weight);
			}
		}
	}

	@RequestMapping("link12")
	public void method12() throws Exception {
		String sql = "SELECT * FROM MyTable33";
		try (Connection con = DriverManager.getConnection(url, dbId, pwd);
				PreparedStatement pstmt = con.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();) {
			if (rs.next()) {
				String title = rs.getString("title");
				LocalDate published = rs.getDate("published").toLocalDate();
				int price = rs.getInt("price");
				LocalDateTime updated = rs.getTimestamp("updated").toLocalDateTime();
				double weight = rs.getDouble("weight");

				System.out.println("제목:" + title);
				System.out.println("출판일:" + published);
				System.out.println("가격:" + price);
				System.out.println("수정일:" + updated);
				System.out.println("무게:" + weight);
			}
		}
	}

	// MyTable32의 데이터 조회후 출력하는 13번 메소드 작성
	@RequestMapping("link13")
	public void method13() throws Exception {
		String sql = "SELECT * FROM MyTable32";
		try (Connection con = DriverManager.getConnection(url, dbId, pwd);
				PreparedStatement pstmt = con.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();) {
			if (rs.next()) {
				String name = rs.getString("name");
				int age = rs.getInt("age");
				double price = rs.getDouble("price");
				LocalDate birth = rs.getDate("birth").toLocalDate();
				LocalDateTime inserted = rs.getTimestamp("inserted").toLocalDateTime();

				System.out.println("이름:" + name);
				System.out.println("나이:" + age);
				System.out.println("가격:" + price);
				System.out.println("생일:" + birth);
				System.out.println("입력일:" + inserted);
			}
		}
	}

	// MyTable32의 데이터 조회후 출력하는 13번 메소드 작성
	@RequestMapping("link14")
	public void method14(Model model) throws Exception {
		// 1.request param수집가공
		// 2.bussiness logic(crud)

		String sql = "SELECT * FROM MyTable32";
		List<Dto05> list = new ArrayList<>();
		try (Connection con = DriverManager.getConnection(url, dbId, pwd);
				PreparedStatement pstmt = con.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();) {
			while (rs.next()) {
				Dto05 o = new Dto05();
				String name = rs.getString("name");
				int age = rs.getInt("age");
				double price = rs.getDouble("price");
				LocalDate birth = rs.getDate("birth").toLocalDate();
				LocalDateTime inserted = rs.getTimestamp("inserted").toLocalDateTime();

				o.setName(name);
				o.setAge(age);
				o.setPrice(price);
				o.setBirth(birth);
				o.setInserted(inserted);
				list.add(o);
			}
		}
		// 3.add attribute
		model.addAttribute("memberList", list);
		// 4.forward/redirect
	}
	
	// /sub19/link15 MyTable33에 있는 데이터들 jsp에서 보여주기
	@RequestMapping("link15")
	public void method15(Model model) throws Exception {
		String sql = "SELECT * FROM MyTable33";
		List<Dto06> list = new ArrayList<>();
		try (Connection con = DriverManager.getConnection(url, dbId, pwd);
				PreparedStatement pstmt = con.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();) {
			while (rs.next()) {
				Dto06 dto06 = new Dto06();
				dto06.setTitle(rs.getString("title"));
				dto06.setPublished(rs.getDate("published").toLocalDate());
				dto06.setPrice(rs.getInt("price"));
				dto06.setUpdated(rs.getTimestamp("updated").toLocalDateTime());
				dto06.setWeight(rs.getDouble("weight"));
				list.add(dto06);
			}
		}
		model.addAttribute("bookList", list);
	}

}
