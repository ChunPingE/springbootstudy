package com.example.demo.mapper;

import java.time.*;
import java.util.*;

import org.apache.ibatis.annotations.*;

import com.example.demo.domain.*;

@Mapper
public interface Mapper01 {
	@Select("SELECT CustomerName FROM Customers WHERE CustomerID = 1")
	String method1();

	@Select("SELECT FirstName FROM Employees WHERE EmployeeID = 1")
	String method2();

	@Select("SELECT SupplierName From Suppliers WHERE SupplierID = 1")
	String method3();

	@Select("SELECT CustomerName From Customers WHERE CustomerID = #{id}")
	String method4(int id);

	@Select("SELECT lastName From Employees WHERE EmployeeID = #{employeeId}")
	String method5(int employeeId);

	@Select("SELECT Price From MyTable33 LIMIT 1")
	int method6();

	@Select("SELECT Weight From MyTable33 LIMIT 1")
	Double method7();

	@Select("SELECT Published From MyTable33 LIMIT 1")
	LocalDate method8();

	@Select("SELECT updated From MyTable33 LIMIT 1")
	LocalDateTime method9();

	@Select("SELECT * From MyTable33 LIMIT 1")
	// 컬럼명(대소문자 구분없이)과 매치되는 빈의 프로퍼티명
	Dto06 method10();

	@Select("SELECT * FROM MyTable32 LIMIT 1")
	Dto05 method11();

	@Select("SELECT CustomerID , "
			+ "CustomerName, "
			+ "contactName, "
			+ "address, "
			+ "city, "
			+ "postalCode, "
			+ "Country "
			+ "FROM Customers WHERE customerId = 7")
	Customer method12();

	@Select("SELECT supplierId , "
			+ "supplierName, "
			+ "contactName, "
			+ "address, "
			+ "city, "
			+ "postalCode, "
			+ "phone "
			+ "FROM Suppliers WHERE supplierId = 7")
	Supplier method13();

	@Select("SELECT employeeId, LastName, FirstName, Birthdate birth, Photo, Notes "
			+ "FROM Employees WHERE employeeId = 5")
	Employee method14();

	/*
	 * @Select("SELECT * FROM MyTable33") List<Dto06> method12();
	 */
}
