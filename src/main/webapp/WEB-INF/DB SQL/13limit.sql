-- LIMIT 3 위에서 부터 3개

-- LIMIT n, m n번부터 m개

SELECT * FROM Customers ORDER BY CustomerID LIMIT 3; -- 1~3고객
SELECT * FROM Customers ORDER BY CustomerID LIMIT 0, 3; -- 0번부터 3개 1~3번고객
SELECT * FROM Customers ORDER BY CustomerID LIMIT 3, 3; -- 3번부터 3개 4~6번고객 

-- 두 번째로 나이가 많은 직원 조회ALTER
SELECT * FROM Employees ORDER BY BirthDate LIMIT 1, 1;

-- 2번 카테고리 상품 중 두번째로 가격이 비싼 상품 조회
SELECT * FROM Products WHERE CategoryID = 2 ORDER BY Price DESC LIMIT 1, 1;


