-- ALTER TABLE : 테이블 변경

CREATE TABLE MyTable13 (
	Col1 INT,
    Col2 INT
);

-- 컬럼 추가 ADD COLUMN
ALTER TABLE MyTable13
ADD COLUMN Col3 VARCHAR(10);

ALTER TABLE MyTable13
ADD COLUMN Col4 DEC(10,2);

-- MyTable13 5번째 컬럼추가하기
ALTER TABLE MyTable13
ADD COLUMN Col5 INT;

-- 첫 번째 컬럼으로 추가
ALTER TABLE MyTable13
ADD COLUMN Col6 INT FIRST;

ALTER TABLE MyTable13
ADD COLUMN Col7 INT FIRST;

-- 중간에 컬럼 추가하기
ALTER TABLE MyTable13
ADD COLUMN Col8 INT AFTER Col7;

-- 첫번째 컬럼으로 하나 추가
-- 컬럼을 중간에 추가

ALTER TABLE MyTable13
ADD COLUMN Col9 INT FIRST;
ALTER TABLE MyTable13
ADD COLUMN Col10 INT AFTER Col9;

DESC MyTable13;