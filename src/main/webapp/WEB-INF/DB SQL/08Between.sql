SELECT * FROM Customers WHERE CustomerID >= 10 AND CustomerID < 20;

SELECT * FROM Customers WHERE CustomerID BETWEEN 10 AND 19;

-- 50년대 생 직원들 조회하기
SELECT * FROM Employees WHERE BirthDate >= '1950-01-01' AND BirthDate <= '1959-12-31';
SELECT * FROM Employees WHERE BirthDate BETWEEN '1950-01-01' AND '1959-12-31';

-- 50년대 생이 아닌 직원 조회하기
SELECT * FROM Employees WHERE NOT (BirthDate BETWEEN '1950-01-01' AND '1959-12-31');

-- 가격이 10달러 대인 상품 조회하기 10.00~19.99
SELECT * FROM Products WHERE Price BETWEEN 10.00 AND 19.99;