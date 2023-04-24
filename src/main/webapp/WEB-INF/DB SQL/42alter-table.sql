-- ALTER TABLE MODIFY COLUMN : 제약 사항 추가

CREATE TABLE MyTable28 (
	Col1 INT,
    Col2 INT,
	Col3 INT,
	Col4 INT
);
DESC MyTable28;

ALTER TABLE MyTable28
MODIFY COLUMN Col1 INT UNIQUE;

ALTER TABLE MyTable28
MODIFY COLUMN Col2 INT NOT NULL;

-- Col3에 default 0 제약사항 추가
-- Col4에  not null unique defulat 100 제약사항 추가

ALTER TABLE MyTable28
MODIFY COLUMN Col3 INT DEFAULT 0;

ALTER TABLE MyTable28
MODIFY COLUMN Col4 INT NOT NULL UNIQUE DEFAULT 100;

-- ADD PRIMARY KEY : PRIMARY KEY 추가
CREATE TABLE MyTable29 (
	Col1 INT,
    Col2 INT,
	Col3 INT
);

ALTER TABLE MyTable29
ADD PRIMARY KEY (Col1, Col2);

DESC MyTable29;

-- 오늘
SELECT CustomerName FROM Customers;

SELECT lastName FROM Employees;

DESC Products;

SELECT CustomerName FROM Customers WHERE country = 'canada';

SELECT productName, price FROM Products WHERE categoryId = 4;
