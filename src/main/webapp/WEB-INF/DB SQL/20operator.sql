-- + - * / %

-- 환율 * 1300 해서 원화로 상품가격 조회하기
SELECT ProductName, Price * 1300 wonPrice FROM Products;

SELECT ProductName, Price / 100 FROM Products;
SELECT ProductName, Price + 100 FROM Products;
SELECT ProductName, Price - 100 FROM Products;

-- 문자열 연결
SELECT CONCAT(City, ',', Country) cityOfCountry FROM Customers;
SELECT CONCAT(City, ' ', Country) cityOfCountry FROM Customers;

-- 직원 이름 "fristName, LastName" 형식으로 조회
SELECT CONCAT(firstName, ', ', lastName) FROM Employees;

-- 원화(*1300)로 10만원 이상인 상품들 조회하기
SELECT ProductName, Price*1300 korPrice FROM Products GROUP BY ProductName HAVING korPrice > 100000;

SELECT * FROM Products WHERE Price >= 100000/1300;

SELECT * FROM Products
WHERE Price*1300 >= 100000;
SELECT * FROM Products
WHERE Price >= 100000 / 1300;
SELECT ProductId, 
ProductName, 
SupplierID, 
CategoryID, 
Price dollor,
Price * 1300 won FROM Products
WHERE Price >= 100000 / 1300;
SELECT *,
Price * 1300 won FROM Products
WHERE Price >= 100000 / 1300;

-- 부분 문자열 : substring
-- 첫번째 파라미터 : 원본 문자열
-- 두번째 파라미터 : 시작 인덱스
-- 세번째 파라미터 : 길이
SELECT substring('hello world', 3 , 3); -- 1번index부터싲가

-- 고객 이름 앞에서 3글자만 조회하기
SELECT substring(CustomerName, 1, 3) From Customers;

-- 고객테이블에서 고객명, 나라이름(앞 3글자만 )조회
SELECT CustomerName, substring(Country, 1, 3) Country FROM Customers;