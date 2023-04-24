-- UPDATE : 레코드 수정

SELECT * FROM Customers WHERE CustomerID = 1;

UPDATE Customers -- 테이블명
SET CustomerName = '서태웅' -- 변경할 컬럼과 값
WHERE CustomerID = 1; -- 변경할 레코드 조건

UPDATE Customers
SET CustomerName = '정대만', City= 'Seoul', Country = 'Korea'
WHERE CustomerID = 1; 

-- 1번 공급자의 이름 도시 나라 변경
SELECT * FROM Suppliers WHERE SupplierID = 1;

UPDATE Suppliers SET SupplierName = 'park', city = 'goyang', Country = 'Korea' WHERE SupplierID = 1;

SELECT * FROM Suppliers WHERE COUNTRY = 'USA';

UPDATE Suppliers SET SupplierName= '채치수', Country = 'France' WHERE COUNTRY = 'USA';

SELECT * FROM Suppliers WHERE Country = 'FRANCE';

SELECT * FROM Suppliers;

UPDATE Suppliers SET ContactName = '북산', City = 'Seoul';

UPDATE Suppliers SET PostalCode = concat('J', PostalCode) WHERE Country = 'Japan';

INSERT INTO Products VALUES (1, 'cake', NULL, NULL, NULL, 300);
INSERT INTO Products VALUES (2, 'pizza', NULL, NULL, NULL, 100);

SELECT * FROM Products;

SELECT * FROM Customers;

UPDATE Products SET Price = Price * 1300;