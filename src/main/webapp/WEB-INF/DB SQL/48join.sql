DESC Orders;

SELECT * FROM Orders o JOIN Customers c ON o.CustomerID = c.CustomerID; -- 830

SELECT * FROM Orders o RIGHT JOIN Customers c ON o.CustomerID = c.CustomerID; -- 832

SELECT * FROM Orders o RIGHT JOIN Customers c ON o.CustomerID = c.CustomerID WHERE o.OrderID IS NULL; -- 2

-- 주문을 처리한적 없는 직원 조회
DESC Orders;
DESC Employees;

SELECT * FROM Employees e LEFT JOIN Orders o ON e.EmployeeID = o.EmployeeID WHERE o.OrderID IS NULL;












