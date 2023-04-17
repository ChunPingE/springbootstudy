-- order by : 결과의 순서르 정할때 사용

SELECT CustomerId, CustomerName, ContactName -- colum명들
From Customers -- table
Where CustomerID < 10 -- 선택할 records의 조건
ORDER BY ContactName ASC;

SELECT CustomerId, CustomerName, ContactName -- colum명들
From Customers -- table
Where CustomerID < 10 -- 선택할 records의 조건
ORDER BY ContactName DESC;

SELECT * From Customers
ORDER BY CustomerName DESC;

SELECT * From Customers
ORDER BY Country ASC;

-- 모든 상품을 가격순으로 조회(낮은 가격이 먼저 조회)
SELECT * FROM Products ORDER BY PRICE;

-- 모든 직원 생년월일 순 조회 (어린 직원이 먼저 조회)
SELECT * FROM Employees ORDER BY BirthDate DESC;

-- 컬럼 INDEX사용
SELECT * FROM Products ORDER BY 6;
SELECT * FROM Products ORDER BY PRICE;

-- 컬럼 INDEX 사용해서 고객을 도시 이름 순 정렬 조회
SELECT * FROM Customers ORDER BY 5;

-- 여러 컬럼 기준 정렬 가능
SELECT * FROM Customers ORDER BY Country, City;

-- 여러 컬럼 기준으로 정렬시 컬럼당 오름차순 내림차순 지정가능
SELECT * FROM Customers ORDER BY Country ASC, City DESC;
SELECT * FROM Customers ORDER BY Country DESC, City ASC;
SELECT * FROM Customers ORDER BY Country DESC, City DESC;

-- 상품을 카테고리(오름차순) 가격(내림차순)으로 정렬조회
SELECT * FROM Products ORDER BY CategoryID ASC, Price DESC;



