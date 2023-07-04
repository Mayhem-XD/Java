SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Tables */

DROP TABLE IF EXISTS addrBook;
DROP TABLE IF EXISTS user;




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



