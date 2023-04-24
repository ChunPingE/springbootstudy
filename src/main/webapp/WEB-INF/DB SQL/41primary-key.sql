-- PRIMARY KEY : NOT NULL + UNIQUE
CREATE TABLE MyTable24(
	Col1 VARCHAR(20) PRIMARY KEY -- NOT NULL + UNIQUE
);
DESC MyTable24;

CREATE TABLE MyTable25(
	Col1 INT,
    PRIMARY KEY (Col1)
);

CREATE TABLE MyTable26(
	Col1 INT,
    Col2 INT,
    PRIMARY KEY (Col1, Col2) -- 두 컬럼의 조합이 유일
);

DESC MyTable26;

INSERT INTO MyTable26 (Col1, Col2) VALUES (1,1); -- OK
INSERT INTO MyTable26 (Col1, Col2) VALUES (2,2); -- OK
INSERT INTO MyTable26 (Col1, Col2) VALUES (1,2); -- OK

CREATE TABLE MyTable26(
	Col1 INT,
    Col2 INT,
    PRIMARY KEY (Col1),
    PRIMARY KEY (Col2)
); -- 불가능
