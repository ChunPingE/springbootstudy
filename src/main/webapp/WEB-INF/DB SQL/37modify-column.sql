-- MODIFY COLUMN : 컬럼 타입 변경
ALTER TABLE MyTable13 MODIFY COLUMN Col20 VARCHAR(40);

ALTER TABLE MyTable13 MODIFY COLUMN Col13 VARCHAR(3); -- 에러, 위험

-- 연습 아무 컬럼이나 타입 변경하기
ALTER TABLE MyTable13 
MODIFY COLUMN Col9 VARCHAR(20);

ALTER TABLE MyTable13 
MODIFY COLUMN Col8 VARCHAR(9) FIRST;

-- 연습 MyTable13 의 아무 컬럼의 위치 변경
ALTER TABLE MyTable13
MODIFY COLUMN Col20 INT AFTER Col13;


SELECT * FROM MyTable13;

DESC MyTable13;