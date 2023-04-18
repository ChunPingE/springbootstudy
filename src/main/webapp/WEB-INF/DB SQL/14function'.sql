-- 내장 함수
-- COUNT - 레코드 수 리턴
SELECT * FROM Customers;

SELECT COUNT(CustomerID) FROM Customers; -- 91
SELECT COUNT(CustomerName) FROM Customers; -- 91
SELECT COUNT(Country) FROM Customers; -- 91
SELECT COUNT(CustomerID) FROM Customers WHERE Country = 'Brazil'; -- 9

-- DISTINCT : 중복 제거
SELECT Country from Customers; -- 91개
SELECT DISTINCT Country from Customers; -- 21개
SELECT COUNT(DISTINCT Country) from Customers; -- 21

-- 전체 직원 수
SELECT Count(*) FROM Employees;

-- 상파울로에 사는 고객 수
SELECT Count(CustomerID) FROM Customers WHERE City = 'São Paulo';

-- 공급자(suppliers)가 있는 나라 수(중복제거)
SELECT COUNT(DISTINCT Country) FROM Suppliers;
SELECT COUNT(*) FROM (SELECT DISTINCT Country FROM Suppliers) N;




