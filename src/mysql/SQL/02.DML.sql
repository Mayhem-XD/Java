##########################################################
#
#   데이터 조작 언어(DML: Data Manipulation Language)
#
##########################################################

 /* 
  * 2. 수정(UPDATE)

UPDATE 테이블명
	SET 필드명=값[, 필드명=값, 필드명=값, ...]
	WHERE 조건;
  */

UPDATE city SET `Name`='수원',Population=1200000 WHERE ID=2340;
SELECT * FROM city WHERE district='Kyonggi';

/*
 * 3. 생성(INSERT) 

INSERT INTO 테이블명 (필드명)
	VALUES (필드값);
 */
# 강원도 속초시 추가
INSERT INTO city(`Name`,countrycode,district)
	VALUES ('속초','KOR','Kang-won');
SELECT * FROM city WHERE district='Kang-won';

INSERT INTO city
	VALUES (DEFAULT,'속초','KOR','Kang-won',100000);
SELECT * FROM city WHERE district='Kang-won';

INSERT INTO city
	VALUES (5000,'속초','KOR','Kang-won',100000);			# auto increment 값을 가지더라도 임의의 값 부여 가
SELECT * FROM city WHERE district='Kang-won';

# 여러건의 데이터 입력
# 경기도에 화성시와 의정부시 추가

INSERT INTO city VALUES 
    (DEFAULT, '화성', 'KOR', 'Kyonggi', 500000),
	(DEFAULT, '의정부', 'KOR', 'Kyonggi', 300000);

# 대량 데이터 입력
# 국내 도시만으로 된 새로운 테이블을 생성하고 기존 테이블의 데이터로 채우기
CREATE TABLE if NOT EXISTS koreanCity LIKE city;
INSERT INTO koreanCity
	SELECT * FROM city WHERE CountryCode='KOR';
	
/* 
 * 4. 삭제(DELETE) 

DELETE FROM 테이블명
	WHERE 조건
*/
	
# ID=4080 인 레코드 삭제
DELETE FROM city WHERE ID=4080;

# 4081 <= ID <=5000 인 레코드 삭제
DELETE FROM city
	WHERE ID >= 4081 AND ID <= 5000;
DELETE FROM city
	WHERE 4081 between AND 5000;

# 인구수가 10만 미만인 도시를 삭제
DELETE FROM city
	WHERE Population < 100000;	
	
	
	





