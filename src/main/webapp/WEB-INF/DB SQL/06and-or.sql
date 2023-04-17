SELECT * FROM Customers;

-- AND
SELECT * FROM Customers WHERE CustomerID > 4 AND Country = 'Germany';

SELECT * FROM Employees WHERE LastName >= 'M' AND BirthDate >= '1960-01-01';

-- Products 에서 카테고리 id가 2이고 가격이 20.00이상인 상품을 조회해보기
SELECT * FROM Products WHERE CategoryID = 2 AND Price >= 20.00;

-- 1950-01-01 ~ 1959-12-31 사이태어난 직원 조회하기
SELECT * FROM Employees WHERE BirthDate >= '1950-01-01' AND BirthDate <= '1959-12-31';

SELECT * FROM Customers WHERE Country = 'Germany' OR Country = 'france';

-- 도시가 london 또는 madrid에 있는 고객 조회
SELECT * FROM Customers WHERE City = 'london' OR City = 'madrid';

-- 카테고리가 1번 또는 2번인 상품들 조회
SELECT * FROM Products WHERE CategoryID = 1 OR CategoryID = 2;

