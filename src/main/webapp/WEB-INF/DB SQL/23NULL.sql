SELECT * FROM Products ORDER BY 1 DESC;

-- 	IFNULL : NULL이면 다른값으로 변경
SELECT IFNULL(0,100);
SELECT IFNULL('KIM', 'LEE'); -- NULL
SELECT IFNULL(NULL, 100); -- 100

SELECT ProductID, ProductName, SupplierID, CategoryID, UNIT, IFNULL(Price, 0) Price FROM Products ORDER BY 1 DESC;

SELECT AVG(Price) Average FROM Products WHERE CategoryID = 2; -- 23.0625
SELECT AVG(IFNULL(Price, 0)) Average FROM Products WHERE CategoryID = 2; -- 19.76

-- 고객 테이블에서 CustomerID, CustomerName, ContactName, Address조회
-- ContactName이 NULL이면 'Anonymous'로 Address가 NULL이면 'Homeless'로 조회

SELECT CustomerID, CustomerName, IFNULL(ContactName, 'Anonymous') ContactName, IFNULL(Address, 'Homeless') Address FROM Customers;
