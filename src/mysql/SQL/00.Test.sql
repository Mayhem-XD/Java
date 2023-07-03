SELECT * FROM countrylanguage;	# countryCode, Language, Isofficial, Percentage

SELECT * FROM countrylanguage WHERE Isofficial='T';

SELECT * FROM countrylanguage WHERE Isofficial='T' AND Percentage>=90;

