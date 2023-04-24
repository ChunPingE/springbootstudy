CREATE TABLE MyTable34 (
	Col1 INT,
    Col2 VARCHAR(30)
);

INSERT INTO MyTable34(Col1, Col2) VALUES (99, 'hello');

SELECT * FROM MyTable34;

CREATE TABLE MyTable35(
	Col1 DEC(4,2),
    Col2 VARCHAR(20)
);

SELECT * FROM MyTable35;

DESC MyTable35;

CREATE TABLE MyTable36(
	Col1 INT,
    Col2 VARCHAR(50),
    Col3 DEC(10,2)
);

INSERT INTO MyTable36(Col1, Col2, Col3) VALUES(22,'hello',3.14);

SELECT * FROM MyTable36;

CREATE TABLE MyTable37(
	Age INT, 
    Name VARCHAR(15), 
    Score DEC(5,2)
); 

SELECT * FROM MyTable37;
DESC MyTable37;

CREATE TABLE MyTable38(
	Col1 INT, 
    Col2 INT, 
    Col3 VARCHAR(200),
    Col4 VARCHAR(200),
    Col5 DEC(10,3),
	Col6 DEC(10,3)
); 

SELECT * FROM MyTable38;

CREATE TABLE MyTable39 (
	Col1 INT PRIMARY KEY AUTO_INCREMENT,
    Col2 VARCHAR(300),
    Col3 INT
);

INSERT INTO MyTable39 (Col2, Col3)
VALUES ('hello', 99);

SELECT * FROM MyTable39;
DESC MyTable39;

CREATE TABLE MyTable40 (
	id INT PRIMARY KEY AUTO_INCREMENT,
    age INT,
    name VARCHAR(10),
    Score DEC(10,2)
);

SELECT * FROM Employees;

desc Employees;