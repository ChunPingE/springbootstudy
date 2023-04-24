SELECT * FROM Orders;
SELECT * FROM Products; -- 7 / 컬럼6
SELECT * FROM Categories; -- 8 / 컬럼3
SELECT * FROM Suppliers; -- 28 / 컬럼 8

SELECT * FROM Products p JOIN Categories c JOIN Suppliers s; -- 17개열 17864개행

SELECT * FROM Products p JOIN Categories c ON p.CategoryID = c.CategoryID JOIN Suppliers s ON p.SupplierID = s.SupplierID; -- 77

-- 예)1번 상품의 상품명, 카테고리명 공급자명
SELECT p.ProductName, c.CategoryName, s.SupplierName FROM Products p JOIN Categories c ON p.CategoryID = c.CategoryID JOIN Suppliers s ON p.SupplierID = s.SupplierID WHERE p.ProductID = 1;

-- 연습
SELECT * FROM Orders;
SELECT * FROM OrderDetails;
SELECT * FROM Products;

-- 예제 1996-07-04에 주문한 상품 명 조회
SELECT ProductName, PRICE FROM Orders o JOIN OrderDetails d ON o.OrderID = d.OrderID JOIN Products p ON d.ProductID = p.ProductID WHERE o.OrderDate = '1996-07-04';

-- 1996-07-04의 매출조회
SELECT * FROM Orders;
SELECT * FROM OrderDetails;
SELECT * FROM Products;

SELECT SUM(p.Price * d.Quantity) 매출 FROM Orders o JOIN OrderDetails d ON o.OrderID = d.OrderID JOIN Products p ON d.ProductID = p.ProductID WHERE o.OrderDate = '1996-07-04';

-- 일별 매출 조회 (날짜순으로 결과 조회)
SELECT OrderDate, SUM(p.Price * d.Quantity) 매출 FROM Orders o JOIN OrderDetails d ON o.OrderID = d.OrderID JOIN Products p ON d.ProductID = p.ProductID GROUP BY OrderDate;

-- 직원별 처리금액
SELECT * FROM Employees;
SELECT * FROM OrderDetails;
SELECT * FROM Orders;
SELECT * FROM Products;

SELECT e.EmployeeID, concat(e.lastName, ' ', e.firstName ) 이름, SUM(p.Price * d.Quantity) 처리금액
FROM Orders o JOIN OrderDetails d ON o.OrderID = d.OrderID
JOIN Products p ON d.ProductID = p.ProductID
JOIN Employees e ON o.EmployeeID = e.EmployeeID 
GROUP BY e.EmployeeID;

-- 상품별 판매금액
SELECT d.ProductID, ProductName, SUM(p.Price * d.Quantity) 매출 
FROM Orders o JOIN OrderDetails d ON o.OrderID = d.OrderID 
JOIN Products p ON d.ProductID = p.ProductID 
GROUP BY ProductID;

-- 고객별 소비 금액
SELECT c.CustomerID, c.CustomerName, SUM(p.Price * d.Quantity) 소비금액
FROM Orders o JOIN OrderDetails d ON o.OrderID = d.OrderID 
JOIN Customers c ON o.CustomerID = c.CustomerID
JOIN Products p ON d.ProductID = p.ProductID 
GROUP BY c.CustomerID;




