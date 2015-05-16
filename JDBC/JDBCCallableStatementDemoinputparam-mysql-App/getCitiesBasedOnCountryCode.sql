DELIMITER $$
 
CREATE PROCEDURE world.getCitiesBasedOnCountryCode (IN CITY_COUNTRY_CODE_INPUT CHAR(35))

BEGIN
 		SELECT * from city where CountryCode=CITY_COUNTRY_CODE_INPUT;      
 
END$$
 
DELIMITER ;



CALL `getCitiesBasedOnCountryCode`('IND');

CALL `getCitiesBasedOnCountryCode`('PAK');
