USE `world`;
DROP procedure IF EXISTS `getAllCities`;

DELIMITER $$
USE `world`$$
CREATE PROCEDURE `getAllCities` ()
BEGIN
  select * from city;
END$$

DELIMITER ;

call getAllCities();