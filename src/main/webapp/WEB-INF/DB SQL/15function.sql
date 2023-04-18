-- MIN, MAX
SELECT MIN(CustomerID) FROM Customers; -- 1

SELECT MAX(CustomerID) FROM Customers; -- 91

SELECT MIN(Price) FROM Products; -- 2.5
SELECT MAX(Price) FROM Products; -- 263.5

-- 가장 나이 많은 직원의 생년월일
SELECT MIN(BirthDate) FROM Employees;
-- 가장 어린 직원의 생년월일
SELECT MAX(BirthDate) FROM Employees;

-- 3번 카테고리에 가장 비싼 상품의 가격
SELECT MAX(Price) FROM Products WHERE CategoryID = 3; -- 81

-- 5번 카테고리에 가장 싼 상품의 가격
SELECT MIN(Price) FROM Products WHERE CategoryID = 5; -- 7





