/*
SQLyog Enterprise - MySQL GUI v8.1 
MySQL - 5.0.81-community-nt : Database - RamJ2EE
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

CREATE DATABASE /*!32312 IF NOT EXISTS*/`RamJ2EE` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `RamJ2EE`;

/*Table structure for table `Employee` */

DROP TABLE IF EXISTS `Employee`;

CREATE TABLE `Employee` (
  `Employee_Id` int(32) NOT NULL,
  `Name` varchar(32) default NULL,
  `Age` int(32) default NULL,
  PRIMARY KEY  (`Employee_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
