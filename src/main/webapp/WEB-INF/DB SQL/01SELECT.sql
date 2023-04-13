-- SELECT
-- 데이터 읽기(가져오기)

-- table (행, 열)
-- 행(row, record)
-- 열(column, field, attribute)

-- SELECT
-- FROM 테이블
-- 쿼리 끝에 ; 작성

-- Customers 테이블에서 모든 레코드(행)과 모든 필드(열)을 가져와라
SELECT * FROM Customers;

use w3schools;

-- 문제1) Employees 테이블에서 모든 행과 모든 열을 읽기
SELECT * FROM Employees;
SELECT * FROM Products;
SELECT * FROM Orders;
SELECT * FROM OrderDetails;

-- 작성관습
-- sql은 대소문자 구분안함
-- 키워드 대문자 테이블명, 컬럼명은 소문자
