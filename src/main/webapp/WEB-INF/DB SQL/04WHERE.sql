-- = 같다
-- <> != 같지않다
SELECT * FROM Customers; -- 91개
SELECT * FROM Customers WHERE Country = 'Mexico'; -- 9개
SELECT * FROM Customers WHERE Country <> 'Mexico'; -- 86개
SELECT * FROM Customers WHERE Country != 'Mexico';

-- 문제 나라가 USA가 아닌 공급자들 조회
SELECT * FROM Suppliers WHERE country != 'USA';

-- > 크다
SELECT * FROM Products WHERE Price > 10.00;

SELECT productName FROM Products WHERE ProductName > 'u'; -- 문자구분없이 u 이후

SELECT * FROM Employees WHERE BirthDate > '1960-01-01';

-- < 작다
SELECT * FROM Employees WHERE BirthDate < '1960-01-01';

SELECT * FROM Products WHERE Price < 5.00;

SELECT * FROM Customers WHERE customername < 'c';

-- <= : 작거나 같다
-- >= : 크거나 같다

SELECT * FROM Products
WHERE price >= 10.00;

SELECT * FROM Products
WHERE price <= 10.00;

SELECT * FROM Employees
WHERE birthdate <= '1958-09-19';

SELECT productname FROM Products WHERE productid = 5;
