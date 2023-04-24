DESC MyTable10;

-- SHOW CREATE TABLE : 테이블 생성 명령 보기
SHOW CREATE TABLE MyTable11;
CREATE TABLE `MyTable11` (
   `Title` varchar(50) DEFAULT NULL,
   `Writer` varchar(20) DEFAULT NULL,
   `Publisher` varchar(20) DEFAULT NULL,
   `Published` date DEFAULT NULL,
   `Price` int(11) DEFAULT NULL,
   `Extra` varchar(100) DEFAULT NULL
 ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
 
 DESC MyTable11;
 
 --
 CREATE TABLE MyTable12 AS SELECT * FROM MyTable10;
 DESC MyTable12;