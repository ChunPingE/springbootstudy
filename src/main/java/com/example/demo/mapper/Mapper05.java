package com.example.demo.mapper;

import org.apache.ibatis.annotations.*;

import com.example.demo.domain.*;

@Mapper
public interface Mapper05 {

	@Update("UPDATE MyTable39 SET Col2 = '수정된 값', Col3 = 99999")
	int sql1();
	
	@Update("UPDATE MyTable39 SET Col2 = #{val1}, Col3 = #{val2} "
			+ "WHERE Col1 = #{key}")
	int sql2(int key, String val1, int val2);

	@Update("UPDATE Customers SET CustomerName = #{name}, Country = #{country} "
			+ "WHERE CustomerId = #{id}")
	int sql3(int id, String name, String country);
	
	@Update("UPDATE Customers SET "
			+ "CustomerName = #{name}, "
			+ "ContactName = #{contactName}, "
			+ "Address = #{address}, "
			+ "City = #{city}, "
			+ "PostalCode = #{postalCode}, "
			+ "Country = #{country} "
			+ "WHERE CustomerId = #{id} ")
	int sql4(Customer customer);

	@Select("SELECT CustomerId id, CustomerName name, ContactName, Address, City, Country, PostalCode "
			+ "FROM Customers WHERE CustomerId = #{id}")
	Customer sql5(int id);
	
	@Select("SELECT EmployeeId,lastName, firstName, Birthdate birth, Photo, Notes "
			+ "FROM Employees WHERE EmployeeId = #{id}")
	Employee sql6(int id);
	
	@Update("UPDATE Employees SET "
			+ "lastName = #{lastName}, "
			+ "firstName = #{firstName}, "
			+ "birthdate = #{birth}, "
			+ "photo = #{photo}, "
			+ "notes = #{notes} "
			+ "WHERE employeeId = #{employeeId}")
	int sql7(Employee employee);
}



