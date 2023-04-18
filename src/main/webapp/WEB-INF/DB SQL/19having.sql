-- HAVING : 집계 함수의 조건 설정

SELECT Country, COUNT(Customerid) numOfCustomer FROM Customers GROUP BY Country HAVING numOfCustomer > 5;

-- 상품의 평균 가격이 30 달러 이상인 카테고리 조회
SELECT CategoryID, AVG(Price) PAVG FROM Products GROUP BY CategoryID HAVING PAVG >= 30.00;

-- 카테고리별 상품의 최고 가격이 100달러 이상인 카테고리
SELECT CategoryID, MAX(Price) PMAX FROM Products GROUP BY CategoryID HAVING PMAX >= 100;

