-- IN 특정 값중에 있으면

SELECT * FROM Customers WHERE Country = 'Germany' OR Country = 'France';

SELECT * FROM Customers WHERE Country IN ('Germany', 'France');

-- 3,5번 카테고리에 속한 상품들 조회
SELECT * FROM Products WHERE CategoryID IN (3,5);

SELECT * FROM Products WHERE CategoryID IN (1,3,5,7);

-- 베를린, 런던, 마드리드, 파리에 있는 고객들 조회하기
SELECT * FROM Customers WHERE City IN ('Berlin', 'London', 'Madrid', 'Paris');

-- 베를린, 런던, 마드리드, 파리에 있지않는 고객들 조회하기
SELECT * FROM Customers WHERE NOT City IN ('Berlin', 'London', 'Madrid', 'Paris');

-- 1,3,5,7 카테고리가 아닌 상품 조회
SELECT * FROM Products WHERE CategoryID NOT IN (1,3,5,7);

