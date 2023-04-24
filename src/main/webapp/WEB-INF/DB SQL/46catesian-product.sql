-- CATESIAN PRODUCT (곱집합) 카테시안 곱
SELECT COUNT(*) FROM Products; -- 77
SELECT COUNT(*) FROM Categories; -- 8

SELECT COUNT(*) FROM Products JOIN Categories; -- Products * Categories 77 * 8 616

SELECT * FROM Products JOIN Categories;

-- ON : 조인조건
SELECT * FROM Products P JOIN Categories C ON P.CategoryID = C.CategoryID; -- 77

-- 조인 후 컬럼 수 : 왼쪽 테이블 컬럼 수 + 오른쪽 테이블 컬럼 수
SELECT ProductName, CategoryName FROM Products P JOIN Categories C ON P.CategoryID = C.CategoryID;

-- 상품명 , 그 상품을 공급하는 공급자명
SELECT * FROM Products;
SELECT * FROM Suppliers;

-- ALIAS 사용으로 코드 줄이기
SELECT P.ProductName, S.SupplierName FROM Products P JOIN Suppliers S ON P.SupplierID = S.SupplierID ORDER BY 2;

-- 








