-- alias : 별칭

SELECT * FROM Customers;
SELECT CustomerID AS ID, CustomerName AS name FROM Customers;

SELECT CustomerID ID, CustomerName name FROM Customers;

SELECT CustomerID ID, CustomerName name FROM Customers ORDER BY CustomerID;
SELECT CustomerID ID, CustomerName name FROM Customers ORDER BY ID;

SELECT Country, COUNT(Customerid) FROM Customers GROUP BY Country;

SELECT Country, COUNT(Customerid) NumOfCustomer FROM Customers GROUP BY Country;

-- keyword 사용시 backtick
SELECT COUNTRY, CustomerName AS `FROM` FROM Customers;

SELECT `COUNTRY`, `CustomerName` AS `FROM` FROM `Customers`;






