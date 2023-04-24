-- DATABASE(Schema) : 테이블이 있는곳

-- CREATE DATABASE : database 만들기

CREATE DATABASE mydb;
USE mydb; -- 사용
CREATE TABLE MyTable11 (
	Title VARCHAR(10),
    Price INT
);

-- 데이터베이스 지우기 : DROP DATABASE 데이트베이스명
-- 주의 아래의 테이블, 데이터 모두 날아가니 주의하기

DROP DATABASE mydb;

-- 연습 mydb1 데이터베이스 만들기
-- mydb1에 새로운 테이블 만들기
-- mydb1 데이터베이스 삭제하기
-- w3schools 데이터베이스 사용하기

CREATE DATABASE mydb1;
CREATE TABLE MyTable01(
	Title VARCHAR(10),
    Price INT
);
DROP DATABASE mydb1;
USE w3schools;

SELECT * FROM MyTable10; -- 현재 DB
SELECT * FROM w3schools.MyTable10 -- 다른 DB