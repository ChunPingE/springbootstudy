-- transaction 하나의 업무단위
-- 하나의 transaction 여러 insert update delete 명령문으로 구성 될 수 있다.

-- 이체 업무 (A -> B)
-- A의돈은 -5000원 update
-- B의 돈은 +5000 update

CREATE TABLE Bank (
	customerName VARCHAR(255),
    money INT DEFAULT 0
);

SELECT * FROM Bank;

INSERT INTO Bank VALUES ('A', 100000);
INSERT INTO Bank VALUES ('B', 100000);

-- 이체 5000원 (A -> B)
UPDATE Bank SET money = money - 5000
WHERE customerName = 'A';
UPDATE Bank SET money = money + 5000
WHERE customerName = 'B';

-- COMMIT : 트랜젝션완료
-- ROLLBACK : 트랜젝션 실패(트랜젝션 시작완료 이전으로 돌아가기)

-- 자동 커밋 (autocommit)
SET autocommit = 0; -- 자동 커밋 비활성화(disable)
SET autocommit = 1; -- 자동 커밋 활성화 (enable)

SELECT @@AUTOCOMMIT;

UPDATE Bank SET money = money - 5000
WHERE customerName = 'A';
UPDATE Bank SET money = money + 5000
WHERE customerName = 'B';

-- 이체시 오류(A->B)
UPDATE Bank SET money = money - 5000
WHERE customerName = 'A';
-- 오류 생겼다고 가정

ROLLBACK;

UPDATE Bank SET money = money + 5000
WHERE customerName = 'B';

