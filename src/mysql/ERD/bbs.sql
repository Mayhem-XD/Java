SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Tables */

DROP TABLE IF EXISTS reply;
DROP TABLE IF EXISTS board;
DROP TABLE IF EXISTS user;




/* Create Tables */

CREATE TABLE board
(
	bid int NOT NULL AUTO_INCREMENT,
	title varchar(256) NOT NULL,
	content varchar(4096),
	modTime datetime DEFAULT CURRENT_TIMESTAMP,
	viewCount int DEFAULT 0,
	replyCount int DEFAULT 0,
	uid varchar(12) NOT NULL,
	PRIMARY KEY (bid)
);


CREATE TABLE reply
(
	rid int NOT NULL AUTO_INCREMENT,
	regTime datetime DEFAULT CURRENT_TIMESTEMP,
	comment varchar(256) NOT NULL,
	uid varchar(12) NOT NULL,
	bid int NOT NULL,
	PRIMARY KEY (rid)
);


CREATE TABLE user
(
	uid varchar(12) NOT NULL,
	password char,
	email varchar(32),
	uname varchar(12) NOT NULL,
	regDate date DEFAULT CURRENT_DATE NOT NULL,
	isDeleted int,
	PRIMARY KEY (uid)
);



/* Create Foreign Keys */

ALTER TABLE reply
	ADD FOREIGN KEY (bid)
	REFERENCES board (bid)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE board
	ADD FOREIGN KEY (uid)
	REFERENCES user (uid)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE reply
	ADD FOREIGN KEY (uid)
	REFERENCES user (uid)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;



