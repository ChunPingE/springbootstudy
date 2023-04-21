package com.example.demo.mapper;

import java.util.*;

import org.apache.ibatis.annotations.*;

import com.example.demo.domain.*;

@Mapper
public interface Mapper02 {

	@Select("SELECT CustomerName FROM Customers")
	List<String> sql1();
	
	@Select("SELECT lastName FROM Employees")
	List<String> sql2();
	
	@Select("SELECT lastName, firstName FROM Employees")
	List<Dto07> sql3();
	
	@Select("SELECT productName, price FROM Products")
	List<Dto08> sql4();

	@Select("SELECT productName FROM Products WHERE CategoryId = #{cid}")
	List<String> sql5(int cid);
	
	@Select("SELECT customerName FROM Customers WHERE country = #{country}")
	List<String> sql6(String country);
	
	@Select("SELECT productName, price FROM Products WHERE categoryId = #{cid}")
	List<Dto08> sql7(int cid);
}
