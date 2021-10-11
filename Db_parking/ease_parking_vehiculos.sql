-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: ease_parking
-- ------------------------------------------------------
-- Server version	8.0.22

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `vehiculos`
--

DROP TABLE IF EXISTS `vehiculos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vehiculos` (
  `idVehiculos` int NOT NULL AUTO_INCREMENT,
  `placa` varchar(255) NOT NULL,
  `tipoVehiculo` varchar(45) NOT NULL,
  `idPlazasVehiculo` int NOT NULL,
  `horaEntrada` datetime NOT NULL,
  `horaSalida` datetime DEFAULT NULL,
  PRIMARY KEY (`idVehiculos`),
  UNIQUE KEY `idPlazasVehiculo_UNIQUE` (`idPlazasVehiculo`),
  KEY `vehiculoPlaza_idx` (`idPlazasVehiculo`),
  CONSTRAINT `vehiculoPlaza` FOREIGN KEY (`idPlazasVehiculo`) REFERENCES `plazas` (`idPlazas`)
) ENGINE=InnoDB AUTO_INCREMENT=91 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vehiculos`
--

LOCK TABLES `vehiculos` WRITE;
/*!40000 ALTER TABLE `vehiculos` DISABLE KEYS */;
INSERT INTO `vehiculos` VALUES (2,'pkg5988','moto',3,'2021-10-09 09:00:00','2021-10-09 10:00:00'),(3,'z73','Carro',5,'2021-10-09 21:24:00','2021-10-09 22:24:00'),(4,'sdfr4','Carro',2,'2019-02-03 00:00:00','2019-10-03 00:00:00'),(13,'sdf4535','Carro',6,'2021-10-09 14:00:00','2021-10-09 15:00:00'),(27,'yyy','Moto',4,'2021-10-09 18:05:00','2021-10-09 19:05:00'),(63,'yyy','Moto',7,'2021-10-09 18:05:00','2021-10-09 19:05:00'),(64,'yyyyaaaaa','Moto',8,'2021-10-09 18:19:00','2021-10-09 19:19:00'),(65,'vdgsee','Carro',9,'2021-10-09 17:53:00','2021-10-09 17:53:00'),(66,'yit08c','Moto',10,'2021-10-09 18:00:00','2021-10-09 19:00:00'),(89,'pqek','Carro',16,'2021-10-10 19:45:00','2021-10-10 20:46:00');
/*!40000 ALTER TABLE `vehiculos` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-10-10 21:27:34
