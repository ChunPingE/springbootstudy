package com.example.demo.mapper;

import org.apache.ibatis.annotations.*;

import com.example.demo.domain.*;

@Mapper
public interface Mapper11 {
	
	@Select("""
			SELECT c.CategoryId, c.CategoryName, c.Description, p.ProductName 
			FROM Categories c LEFT JOIN Products p
			ON c.CategoryId = p.CategoryId
			WHERE c.CategoryId = #{id}
			""")
	@ResultMap("categoryResult")
	Category sql1(int id);
	
	@Select("""
			SELECT c.CategoryID, c.CategoryName, c.Description, p.ProductName, p.Price
			FROM Categories c LEFT JOIN Products p
			ON c.CategoryID = p.CategoryID
			WHERE c.CategoryId = #{id}
			""")
	@ResultMap("categoryResultMap")
	Category sql2(int id);
	
	@Select("""
			SELECT s.SupplierID, s.SupplierName, s.ContactName, s.Address, s.City, s.PostalCode, s.Country, s.Phone, p.ProductName, p.Price 
			FROM Suppliers s LEFT JOIN Products p 
			ON s.SupplierID = p.SupplierID  
			WHERE s.SupplierID = #{id}
			""")
	@ResultMap("supplierResult")
	SupplerView sql3(int id);
}



