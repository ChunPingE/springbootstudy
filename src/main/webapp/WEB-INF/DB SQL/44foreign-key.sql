CREATE TABLE Student (
	Id INT PRIMARY KEY AUTO_INCREMENT,
	Name VARCHAR(50)
);

CREATE TABLE StudentPhone (
	Id INT PRIMARY KEY AUTO_INCREMENT,
	StudentId INT,
    Phone VARCHAR(50),
    -- foreign key (외래키 참조키)
    FOREIGN KEY (StudentId) REFERENCES Student(Id)
);

DESC Student;
DESC StudentPhone;

-- 데이터 입력
INSERT INTO Student (Name) VALUES ('손흥민');
INSERT INTO Student (Name) VALUES ('박지성');

SELECT * from Student;

INSERT INTO StudentPhone (StudentId, Phone) VALUES (1, '010-9999-8888');
INSERT INTO StudentPhone (StudentId, Phone) VALUES (2, '010-8888-9999');

SELECT * from StudentPhone;

INSERT INTO StudentPhone (StudentId, Phone) VALUES (3, '010-8888-9999'); -- fail


INSERT INTO StudentPhone (StudentId, Phone) VALUES (NULL, '010-8888-9999'); -- ok

ALTER TABLE StudentPhone
MODIFY COLUMN StudentId INT NOT NULL;

INSERT INTO StudentPhone (StudentId, Phone) VALUES (NULL, '010-8888-9999'); -- fail

INSERT INTO StudentPhone (StudentId, Phone) VALUES (1, '010-7777-7777');

DELETE FROM StudentPhone WHERE StudentId = 2;

DELETE FROM Student WHERE Id = 2;







