-- WHERE : 특정 레코드를 선택하는 조건절
SELECT * FROM Customers;

SELECT * FROM Customers
WHERE Country = 'Mexico';

SELECT * FROM Customers
WHERE Country = 'UK';

SELECT * FROM Customers
WHERE Country = 'France';

SELECT * FROM Customers
WHERE Country = 'Mexico';

SELECT * FROM Customers
WHERE CustomerID = 3;

SELECT * FROM Customers
WHERE Country = 'france'; -- 대소문자 구분안함

SELECT CustomerName FROM Customers
WHERE Country = 'france';

-- 문제1) Country 가 USA인 공급자 이름(SupplierName)과 주소(Address)를 공급자 테이블(Suppliers)에서 조회하기
SELECT supplierName, address FROM Suppliers WHERE Country = 'USA';


