-- UNIQUE 중복 허용 안함
CREATE TABLE MyTable21 (
	Col1 INT,
    Col2 INT UNIQUE
);

INSERT INTO MyTable21 (Col1, Col2) VALUES (1,1); -- ok
INSERT INTO MyTable21 (Col1, Col2) VALUES (2,2); -- ok
INSERT INTO MyTable21 (Col1, Col2) VALUES (2,3); -- ok
INSERT INTO MyTable21 (Col1, Col2) VALUES (4,3); -- fail

SELECT * FROM MyTable21;

-- 예제
CREATE TABLE MyTable22 (
	Ssn VARCHAR(13) UNIQUE,
	Name VARCHAR(20)
);

INSERT INTO MyTable22 (Ssn, Name) VALUES ('1', '정대만'); -- ok
INSERT INTO MyTable22 (Ssn, Name) VALUES ('1', '송태섭'); -- fail
INSERT INTO MyTable22 (Ssn, Name) VALUES (NULL, '채소연'); -- OK
INSERT INTO MyTable22 (Ssn, Name) VALUES (NULL, '강백호'); -- OK

SELECT * FROM MyTable22;

CREATE TABLE MyTable23(
	Col1 VARCHAR(20) NOT NULL UNIQUE DEFAULT ''
);


