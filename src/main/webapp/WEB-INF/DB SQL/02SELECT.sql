-- 모든 필드
SELECT * FROM Customers;

-- CustomerName필드만
SELECT CUSTOMERNAME FROM Customers;
SELECT ContactName FROM Customers;
SELECT Country FROM Customers;
SELECT CustomerName, ContactName FROM Customers;
SELECT Country, CustomerName, ContactName FROM Customers;

-- 문제1) Employees 테이블에서 BirthDate, FirstName, LastName을 조회해보기
SELECT BirthDate, FirstName, LastName FROM Employees;

SELECT categoryid, categoryname FROM Categories;

SELECT * FROM Suppliers;
SELECT supplierid, suppliername, address, city, phone FROM Suppliers;




