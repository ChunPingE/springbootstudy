-- 테이블 삭제

-- DROP TABLE 테이블 삭제

DESC MyTable01;
DROP TABLE MyTable01; -- 주의!!!

-- 연습 MyTable02, MyTable03 테이블 지우기
DROP TABLE MyTable02; -- 주의!!!
DROP TABLE MyTable03; -- 주의!!!

-- TRUNCATE : 테이블 유지 데이터 삭제 
-- 복구 불가능하기 때문에 매우 주의하자 왠만해선 사용하지말자
SELECT * FROM MyTable04;
DESC MyTable04;
TRUNCATE TABLE MyTable04;
