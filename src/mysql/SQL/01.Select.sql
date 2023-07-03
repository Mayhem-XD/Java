##############################################
#
# 데이터 조작 언어(DML: Data Manipulation Language)
#
##############################################
/*
 * 1. Select
 */
USE world;	# 사용할 데이터베이스 선택
SHOW TABLES; # 현 데이터 베이스에 있는 테이블 조회
DESC city;		# city 테이블의 구조 보기

/*
SELECT 필드명 
    FROM 테이블명
    JOIN 테이블명
    ON 조인 조건
    WHERE 조건
    GROUP BY 필드명
    HAVING 그룹 조건
    ORDER BY 필드명 순서
    LIMIT 숫자 OFFSET 숫자;
*/
SELECT * FROM city;     # city 테이블에 있는 내용을 전부 가져오기
SELECT `Name`, Population FROM city;	# 필드명 보존하고 싶을때 `back quote` 사용
/*
 *	조회 조건
 */
SELECT * FROM city WHERE countryCode='KOR';
SELECT `name`,district,population FROM city WHERE countryCode='KOR';
SELECT * FROM city WHERE countryCode='KOR' AND population > 1000000;		# 필드명은 대소문자 구분 안함	
SELECT * FROM city WHERE district='seoul';

SELECT distinct district FROM city WHERE countrycode='KOR';		# 고유한 값 - distinct

# 수도권 도시(서울, 인천, 경기)
SELECT * FROM city WHERE district='seoul' OR district='Inchon' OR district='Kyonggi';

# 국내 1000000 도시중 인구수가 홀수인 도시
SELECT * FROM city WHERE countrycode='KOR' AND population>=1000000 AND population%2=1;

# 국내 인구수가 500000~1000000 사이 도시
SELECT * FROM city WHERE countrycode='KOR' AND population<=1000000 AND population>=500000;
SELECT * FROM city WHERE countrycode='KOR' AND population BETWEEN 500000 AND 1000000;	# 경계값 포함

# 충청남북도의 도시
SELECT * FROM city WHERE district='Chungchongbuk' OR district='Chungchongnam';
SELECT * FROM city WHERE district LIKE 'Chungchong%';		# % - wild card, 이때는 like 연산자를 사용함

/*
 *	1.2 순서(Order) 
 */
# 전세계 인구수가 800만 이상인 도시를 내림차순으로 조회
SELECT * FROM city WHERE population>=8000000 ORDER BY population DESC;

# 국내 100만 이상인 도시를 오름차순으로 조회
SELECT * FROM city WHERE countrycode='KOR' AND population>=1000000 ORDER BY population;		# ASC 생략

# 국내 50만 이상인 도시를 광역시도 오름차순, 인구수 내림차순으로 조회
SELECT * FROM city WHERE countrycode='KOR' AND population>=500000 
ORDER BY district ASC, population DESC;

# 전세계 인구수 Top 10 도시
SELECT * FROM city ORDER BY Population DESC LIMIT 10;

# 국내 인구수 Top 5 도시
SELECT * FROM city WHERE countrycode='KOR' ORDER BY Population DESC LIMIT 5;

# 국내 인구수 Top 11~20
SELECT * FROM city WHERE CountryCode = 'KOR' ORDER BY Population DESC LIMIT 10 OFFSET 10; 	# 앞에서 10개를 건너 뛰고, 10개를 보여줌 limit과 offset은 sql 표준 아니라 db마다 다를 수도있음

/*
 *  1.4 함수
 */
# 현재 시각
SELECT NOW();		#	2023-07-03 14:54:32

# 국내 도시의 개수 - 레코드의 개수
SELECT COUNT(*) FROM city WHERE CountryCode = 'KOR';

# 국내 도시 인구 최소/최대
SELECT MAX(Population), MIN(Population) FROM city WHERE CountryCode = 'KOR';

# 국내 도시 인구 평균
SELECT ROUND(AVG(Population)) FROM city WHERE CountryCode = 'KOR';
SELECT ROUND(AVG(Population)) AS avgPopulation FROM city WHERE CountryCode = 'KOR';

/*
 *  1.5 그룹핑(Grouping)
 */
# 국내 광역시도별 도시의 개수
SELECT district, COUNT(*) FROM city WHERE CountryCode = 'KOR' GROUP BY district;

# 국내 광역시도별 도시의 개수 내림차순으로
SELECT district, COUNT(*) FROM city WHERE CountryCode = 'KOR' GROUP BY district ORDER BY COUNT(*) DESC;

# 도시의 개수가 많은 나라 Top 10
SELECT countrycode, COUNT(*) FROM city GROUP BY countrycode ORDER BY COUNT(*) DESC LIMIT 10;

# 도시의 평균 인구가 높은 나라 Top 10
SELECT countrycode,ROUND(AVG(population)) AS avgPopulation FROM city 
GROUP BY countrycode ORDER BY avgPopulation DESC LIMIT 10;

# 경기도의 도시이름
SELECT GROUP_CONCAT(`Name`) FROM city WHERE District = 'Kyonggi';

# 국내 광역시도 이름
SELECT GROUP_CONCAT(District) FROM city WHERE CountryCode = 'KOR';

/*
 *  1.6 그룹조건
 */

# 국내 도시의 개수가 5개 이상인 도의 평균 인구수
SELECT District, ROUND(AVG(Population)), COUNT(*) FROM city WHERE CountryCode = 'KOR'
GROUP BY District HAVING COUNT(*) >= 5;

# 국내 도시의 개수가 5개 이상인 도의 평균 인구수 Top 5
SELECT District, ROUND(AVG(Population)), COUNT(*) FROM city WHERE CountryCode = 'KOR'
GROUP BY District HAVING COUNT(*) >= 5 ORDER BY AVG(Population) DESC LIMIT 5;

# 도시의 개수가 100개 이상인 국가의 도시인구 평균을 내림차순으로 정렬
SELECT CountryCode, ROUND(AVG(Population)), COUNT(*) FROM city
GROUP BY CountryCode HAVING COUNT(*) >= 100 ORDER BY AVG(Population) DESC;
SELECT CountryCode, ROUND(AVG(Population)) avgPop, COUNT(*) FROM city
GROUP BY CountryCode HAVING COUNT(*) >= 100 ORDER BY avgPop DESC;

# 

































