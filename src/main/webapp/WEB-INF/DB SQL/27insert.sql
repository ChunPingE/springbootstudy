SELECT * FROM Customers ORDER BY CustomerID DESC;

SELECT * FROM Employees ORDER BY 1 DESC;

INSERT INTO Employees (EmployeeId, lastName, firstName) VALUES(11, '박지성', '두개의심장');

INSERT INTO Employees (lastName, firstName) VALUES('차범근', '차붐');

-- 테이블 정보 보기
DESC Employees;

-- customers 테이블의 자동증가 컬럼을 찾기
DESC Customers; -- CustomerID

INSERT INTO Customers (CustomerName, ContactName) VALUES ('정대만', 'daeman');

SELECT * FROM Customers ORDER BY 1 DESC;

SELECT * FROM Suppliers ORDER BY 1 DESC;
-- 새 공급자 데이터추가 (supplierID, supplierName, City)
-- 자동증가 컬럼은 직접 값을 넣지 않고 추가하기
DESC Suppliers;

INSERT INTO Suppliers (SupplierName, City) VALUES ('son', 'london');

SELECT * FROM Customers ORDER BY 1 DESC;

SELECT customerId, customerName, address FROM Customers ORDER BY CustomerID DESC LIMIT 10;
INSERT INTO Suppliers(SupplierName, City, Country) VALUES ('강백호', '서울', '대한민국');

SELECT * FROM Suppliers ORDER BY 1 DESC;

