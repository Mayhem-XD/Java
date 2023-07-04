##########################################################
#
#   데이터 정의 언어(DDL: Data Definition Language)
#
##########################################################

/*
 * 1. Table 생성

CREATE TABLE 테이블명 (
	필드명 데이터타입 [NOT NULL] [KEY] [DEFAULT 값] [Extra],
	필드명 데이터타입 [NOT NULL] [KEY] [DEFAULT 값] [Extra],
	...
) [Extra];
 *
 */
/* Create Tables */

CREATE TABLE addrBook
(
	id int NOT NULL AUTO_INCREMENT,
	name varchar(10) NOT NULL,
	tel varchar(14) NOT NULL,
	nickname varchar(20) DEFAULT '별명',
	PRIMARY KEY (id)
);

# 사용자 테이블 생성 

CREATE TABLE if NOT EXISTS `users`
(
	uid VARCHAR(12) NOT NULL,
	pwd CHAR(44) NOT NULL,
	uname VARCHAR(8) NOT NULL,
	email VARCHAR(30),
	regDate DATE DEFAULT (CURRENT_DATE),
	isDeleted INT DEFAULT 0,
	PRIMARY KEY (uid)
);

/*
 * 2. 테이블 조회
 */
# 데이터베이스 내의 테이블 목록
SHOW TABLES;

# 테이블 구조
DESC addrbook;			# Describe

/*
 * 3. 테이블 삭제 (DROP)
 */
# koreancity 테이블 삭제
DROP TABLE koreancity;

# datetable 테이블 내용 삭제
TRUNCATE datetable;

# test DATABASE 삭제
DROP DATABASE test;

/*
 * 4. 테이블 이름 변경 (RENAME)
 */
# koreanCity -> korCity 
RENAME TABLE koreanCity TO korCity;

/*
 * 5. 테이블 구조 변경 (ALTER)
 */
# users 테이블에 tel 항목 추가
ALTER TABLE users 
	ADD tel VARCHAR(14);
	
# users 테이블에 email 을 not null 로 변경
ALTER TABLE users 
	CHANGE email email VARCHAR(30) NOT NULL;

# users 테이블에 tel 항목 삭제
ALTER TABLE users 
	DROP tel;

/*
 * 6. View 생성
 */
# 인구 600만 이상인 도시로 largeCity 뷰 생성
CREATE VIEW largeCity
	AS SELECT * FROM city WHERE Population >= 6000000
	WITH CHECK OPTION;	# 조회용도만으로 사용

# 서울의 인구를 8900000으로 변경하면 에러가 발생(Check option 위배)
UPDATE largeCity SET Population=8900000 WHERE ID=2331;

# city 테이블에서 변경하면 largeCity에도 반영이 됨
UPDATE city SET Population=9900000 WHERE ID=2331;
























