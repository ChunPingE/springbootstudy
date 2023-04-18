-- DELETE : 테이블의 record지우기
-- 매우 주의!

SELECT * FROM Customers;

-- 검증할 방법 같은 WHERE절로 SELECT해보고 실행시키기
SELECT * FROM Customers WHERE CustomerID = 94;

DELETE FROM Customers -- 지울 테이블명
WHERE CustomerID = 94; -- 지울 레코드의 조건

-- 93번 고객 지우기
-- 78번 상품 지우기
-- 79번 상품 지우기
SELECT * FROM Customers WHERE CustomerID = 93;
DELETE FROM Customers WHERE CustomerID = 93;

DELETE FROM Products WHERE ProductID = 78;
DELETE FROM Products WHERE ProductID = 79;

SELECT * FROM Products;

DELETE FROM Products WHERE CategoryID = 1;

SELECT COUNT(*) FROM Products;

DELETE FROM Products;

-- 고객테이블에서 USA 인 회원 고객들 지우기
DELETE FROM Customers WHERE Country = 'USA';

-- 모든 직원 지우기
DELETE FROM Employees;

SELECT * FROM Employees;








