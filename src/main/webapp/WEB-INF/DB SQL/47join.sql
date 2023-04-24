DROP TABLE TABLEB;

CREATE TABLE TableA (
	Num1 INT
);

CREATE TABLE TableB (
	Num2 INT
);

INSERT INTO TableA (Num1) VALUES(1);
INSERT INTO TableA (Num1) VALUES(2);
INSERT INTO TableA (Num1) VALUES(3);
INSERT INTO TableA (Num1) VALUES(4);
INSERT INTO TableA (Num1) VALUES(5);

INSERT INTO TableB (Num2) VALUES(3), (4), (5), (6), (7);

SELECT * FROM TableA; -- 1 2 3 4 5
SELECT * FROM TableB; -- 3 4 5 6 7

SELECT * FROM TableA JOIN TableB; -- cartesian product

SELECT * FROM TableA A INNER JOIN TableB B ON A.Num1 = B.Num2; 

SELECT * FROM TableA A LEFT JOIN TableB B ON A.Num1 = B.Num2;  -- LEFT(OUTER) JOIN

SELECT * FROM TableA A RIGHT JOIN TableB B ON A.Num1 = B.Num2; 




