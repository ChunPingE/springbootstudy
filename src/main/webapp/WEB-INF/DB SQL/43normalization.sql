-- normalization (정규화)
-- 1NF (first normal form) 첫번째 정규화 (215쪽)
-- 규칙1) 열은 원자적 값만을 포함한다.
-- 규칙2) 같은 데이터가 여러 열에 반복되지 말아야 한다.
-- 규칙3) 각 행은 유일무이한 식별자인 기본키를
--        가지고 있어야 한다.

-- 책 (216쪽~217쪽)
-- *기본키 : 각 레코드를 다른 레코드와 구분하는 열
-- 1)기본키는 NULL이 될 수 없습니다.
-- 2)기본키는 레코드가 삽입될 때 값이 있어야 합니다.
-- 3)기본키는 간결해야 합니다.
-- 4)기본키의 값은 변경 불가입니다.
-- > 기본키를 위한 열을 새로만들기

-- 예제) 학생명, 전화번호
CREATE TABLE Student (
	Id INT PRIMARY KEY AUTO_INCREMENT, -- 인위적 키 컬럼
	Name VARCHAR(50)
);
CREATE TABLE StudentPhone (
	Id INT PRIMARY KEY AUTO_INCREMENT,
	StudentId INT,
	Phone VARCHAR(50)
);

-- 예제) 교재 정보를 저장할 테이블 작성하기
-- 책이름, 출판사, 발행일, 저자, 가격 + 기본키로 id 저자가 여러명일수 있다.
CREATE TABLE Book (
	Id INT PRIMARY KEY AUTO_INCREMENT,
	Title VARCHAR(50),
    Publisher VARCHAR(50),
    Published DATE,
    Price INT,
    Info VARCHAR(100)
);

CREATE TABLE BookWriter (
	Id INT PRIMARY KEY AUTO_INCREMENT,
	BookId INT,
    Writer VARCHAR(50)
);

-- 두번째 정규화 2NF (second noraml form)
-- 책 369쪽
-- 규칙1) 1.1NF(제1정규형)여야한다.
-- 규칙2) 부분적 함수 의존이 없다.

-- 세번째 정규화 3NF (third noraml form)
-- 규칙1) 2NF(제2정규형)이어야한다.
-- 규칙2) 이행적 종속이 없어야한다.
