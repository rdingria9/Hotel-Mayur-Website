-- MySQL dump 10.13  Distrib 5.6.22, for Win32 (x86)
--
-- Host: localhost    Database: project
-- ------------------------------------------------------
-- Server version	5.6.22-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `contact`
--

DROP TABLE IF EXISTS `contact`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `contact` (
  `name` char(20) NOT NULL,
  `email` varchar(50) NOT NULL,
  `message` varchar(256) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contact`
--

LOCK TABLES `contact` WRITE;
/*!40000 ALTER TABLE `contact` DISABLE KEYS */;
INSERT INTO `contact` VALUES ('abcd','abcd@gmail.com','hello'),('fdfs','fsdf@gmail.com','dfdf'),('akhil','ahuja.com','kjgrbrngaksvntvseu'),('null','null','null'),('null','null','null'),('null','null','null'),('null','null','null'),('null','null','null'),('null','null','null'),('null','null','null'),('null','null','null'),('null','null','null'),('tushar','abcd@gmail.com','hjjljdsdcbkkonh'),('drishti','dt@gmail.com','jygutkkiuliou'),('ashish','a@gmail.com','uhedkfhckjdashkkjsa'),('kuntal','kuntal@gmail.com','hello,nice to meet u!!'),('akhil','ahuja@gmail.com','abcd');
/*!40000 ALTER TABLE `contact` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `customer` (
  `cid` tinyint(4) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `email` varchar(255) NOT NULL,
  `Address` char(255) NOT NULL,
  `rtype` char(4) NOT NULL,
  `datefrom` varchar(20) NOT NULL,
  `dateto` varchar(20) NOT NULL,
  `status` char(10) DEFAULT NULL,
  `price` int(11) NOT NULL,
  PRIMARY KEY (`cid`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` VALUES (1,'akhil','akhil@gmail.com','','','','','Booked',8500),(2,'manish','manish@gmail.com','','','','','Booked',8500),(3,'varsha','varsha@gmail.com','','','','','Booked',8500),(4,'akhil','abc@gmail.com','slkd;lsakk','2NAC','2015-03-06','2015-03-07','Booked',8500),(5,'kanchi','kanchi@gmail.com','ldhhakjsghkjdkj','3NAC','2015-03-13','2015-03-14','Booked',8500),(6,'narayan','na@gmail.com','sklhg;kjhavbgsljkhvjgrkh','3NAC','2015-03-12','2015-03-13','Booked',8500),(7,'ashish','a@gmail.com','akhlskakjdhakjdhfkjakdnkjd','2AC','2015-03-17','2015-03-18','Booked',8500),(8,'kuntal s','kuntal@gmail.com','unr,mumbai','3AC','2015-03-18','2015-03-19','Booked',8500),(9,'tushar kataria','toshikataria.tk@gmail.com','/ksdhkjgmjfadsagkjk','2AC','2015-03-26','2015-03-27','Booked',8500),(10,'aa','abc@gmail.com','unr','3NAC','2015-03-21','2015-03-22','Booked',8500),(11,'manish ahuja','m@gmail.com','abcd','2NAC','2015-03-19','2015-03-20','Booked',8500),(12,'Drishti','dt@gmail.com','mumbai','2NAC','2015-03-30','2015-03-31','Booked',8500),(13,'Akhil','akhil@gmail.com','mumbai','3AC','2015-04-03','2015-04-04','Booked',8500),(14,'Tushar','tushar@gmail.com','Delhi','3NAC','2015-04-04','2015-04-05','Booked',8500),(15,'Sumeet','sumeet@gmail.com','Pune','3AC','2015-04-08','2015-04-09','Booked',8500),(16,'Narain','narain@gmail.com','Kashmir','2AC','2015-04-07','2015-04-08','Booked',11250);
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dis`
--

DROP TABLE IF EXISTS `dis`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dis` (
  `discount` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dis`
--

LOCK TABLES `dis` WRITE;
/*!40000 ALTER TABLE `dis` DISABLE KEYS */;
INSERT INTO `dis` VALUES ('10');
/*!40000 ALTER TABLE `dis` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `login` (
  `name` varchar(30) NOT NULL,
  `pass` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `login`
--

LOCK TABLES `login` WRITE;
/*!40000 ALTER TABLE `login` DISABLE KEYS */;
INSERT INTO `login` VALUES ('admin','3456');
/*!40000 ALTER TABLE `login` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rate`
--

DROP TABLE IF EXISTS `rate`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `rate` (
  `rtype` varchar(10) NOT NULL,
  `rate` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rate`
--

LOCK TABLES `rate` WRITE;
/*!40000 ALTER TABLE `rate` DISABLE KEYS */;
INSERT INTO `rate` VALUES ('2AC',11250),('2NAC',7500),('3AC',13125),('3NAC',11250);
/*!40000 ALTER TABLE `rate` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `room`
--

DROP TABLE IF EXISTS `room`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `room` (
  `cid` tinyint(4) NOT NULL,
  `rid` tinyint(4) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`rid`),
  KEY `cid` (`cid`),
  CONSTRAINT `room_ibfk_1` FOREIGN KEY (`cid`) REFERENCES `customer` (`cid`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `room`
--

LOCK TABLES `room` WRITE;
/*!40000 ALTER TABLE `room` DISABLE KEYS */;
INSERT INTO `room` VALUES (1,1),(1,3),(2,2),(3,4);
/*!40000 ALTER TABLE `room` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `roomcategory`
--

DROP TABLE IF EXISTS `roomcategory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `roomcategory` (
  `rid` tinyint(4) NOT NULL,
  `rtype` varchar(4) NOT NULL,
  `status` tinyint(1) DEFAULT NULL,
  `stype` tinyint(1) DEFAULT NULL,
  `rate` decimal(5,0) DEFAULT NULL,
  KEY `rid` (`rid`),
  CONSTRAINT `roomcategory_ibfk_1` FOREIGN KEY (`rid`) REFERENCES `room` (`rid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `roomcategory`
--

LOCK TABLES `roomcategory` WRITE;
/*!40000 ALTER TABLE `roomcategory` DISABLE KEYS */;
/*!40000 ALTER TABLE `roomcategory` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `season`
--

DROP TABLE IF EXISTS `season`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `season` (
  `stype` varchar(10) DEFAULT NULL,
  `srate` decimal(5,0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `season`
--

LOCK TABLES `season` WRITE;
/*!40000 ALTER TABLE `season` DISABLE KEYS */;
INSERT INTO `season` VALUES ('off',8000),('moderate',7500),('peak',14000);
/*!40000 ALTER TABLE `season` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-04-03  1:10:12
