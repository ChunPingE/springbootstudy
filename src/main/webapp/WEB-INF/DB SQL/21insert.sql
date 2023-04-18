-- insert : 테이블에 새 레코드 입력

SELECT * FROM Customers;
INSERT INTO Customers(Customerid, CustomerName, Contactname, Address, city, postalcode, country)
Values(92, '박지성', '두개의심장', 'london', 'seoul', '1234567', 'Korea');

-- 모든 컬럼에 값을 넣을 때 컬럼명 생략 가능
INSERT INTO Customers
Values(93, '차범근', '차붐', '프랑크푸르트', 'seoul', '123134', 'Korea');

INSERT INTO Customers(Customerid, CustomerName, city, country)
Values(94, '송태섭', 'Tokyo', 'Japan');

SELECT * FROM Suppliers;
-- surpplier테이블에 30번째 공급자 추가(모든열)
-- Suppier테이블에 31번째 공급자 Supplierid,suppliername, city, country
INSERT INTO Suppliers Values(30, 'park', 'chun', 'goyang', 'goyansi', '980105', 'Korea', '(010)123-457');
INSERT INTO Suppliers(Supplierid, suppliername, city, country) VALUES (31, 'KIM', 'seoul', 'Korea');

SELECT * FROM Suppliers WHERE ContactName IS NULL;

SELECT * FROM Suppliers WHERE ContactName IS NOT NULL;

SELECT * FROM Suppliers WHERE NOT ContactName IS NULL;

-- CUSTMERS 테이블에서 Address 컬럼이 null인 레코드 조회
SELECT * FROM Customers WHERE ADDRESS IS NULL;

-- CUSTMERS 테이블에서 Address 컬럼이 null이 아닌 레코드 조회
SELECT * FROM Customers WHERE ADDRESS IS NOT NULL;

-- 집계함수에서 NULL 제외
SELECT COUNT(CustomerID) FROM Customers; -- 94
SELECT COUNT(Address) FROM Customers; -- 93

SELECT COUNT(*) FROM Customers;

-- 공급자 테이블에서 Supplierid 컬럼의 값 수 구하기
-- 공급자 테이블에서 ContactName 컬럼의 값 수 구하기

SELECT COUNT(SupplierID) FROM Suppliers; -- 31
SELECT COUNT(ContactName) FROM Suppliers; -- 30

SELECT * FROM Products ORDER BY 1 DESC;

INSERT INTO Products VALUES (78, 'cake', 12, 2, '조각', NULL);

INSERT INTO Products(Productid, ProductName, Supplierid, categoryid, unit) 
VALUES (79, 'pizza', 12, 2, '조각');

SELECT * FROM Products WHERE CategoryID = 2 ORDER BY 1 DESC;
SELECT SUM(Price) FROM Products WHERE CategoryID = 2; -- 276.75

SELECT AVG(Price) FROM Products WHERE CategoryID = 2; -- 23.062500