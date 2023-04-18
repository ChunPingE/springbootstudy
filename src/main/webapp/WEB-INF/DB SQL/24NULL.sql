-- NULL과 연산은 모두 FALSE
SELECT * FROM Products WHERE CategoryID = 2; -- 14개

SELECT * FROM Products WHERE CategoryID = 2 AND Price >= 25.00; -- 4개
SELECT * FROM Products WHERE CategoryID = 2 AND Price < 25.00; -- 10x 8개
SELECT * FROM Products WHERE CategoryID = 2 AND IFNULL(Price, 0) < 25.00; -- 10개

 SELECT ProductName, PRICE * 1300 FROM Products WHERE CategoryID = 2; -- 산술연산 결과도 NULL