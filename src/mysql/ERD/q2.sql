SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Tables */

DROP TABLE IF EXISTS address;
DROP TABLE IF EXISTS members;




/* Create Tables */

CREATE TABLE address
(
	aid int NOT NULL AUTO_INCREMENT,
	city varchar(18),
	country varchar(32) NOT NULL,
	mid varchar(12) NOT NULL,
	PRIMARY KEY (aid)
);


CREATE TABLE members
(
	mid varchar(12) NOT NULL,
	password char(60) NOT NULL,
	uname varchar(12) NOT NULL,
	email varchar(32),
	regDate date DEFAULT (CURRENT_DATE),
	isDeleted int DEFAULT 0,
	PRIMARY KEY (mid)
);



/* Create Foreign Keys */

ALTER TABLE address
	ADD FOREIGN KEY (mid)
	REFERENCES members (mid)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;



