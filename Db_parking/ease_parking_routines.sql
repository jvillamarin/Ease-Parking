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
-- Temporary view structure for view `vistafacturas`
--

DROP TABLE IF EXISTS `vistafacturas`;
/*!50001 DROP VIEW IF EXISTS `vistafacturas`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `vistafacturas` AS SELECT 
 1 AS `idFacturas`,
 1 AS `idVehiculosFacturas`,
 1 AS `valorTotal`,
 1 AS `idOperariosFacturas`,
 1 AS `username`,
 1 AS `password`,
 1 AS `nombre`,
 1 AS `apellido`,
 1 AS `email`,
 1 AS `tipo_identificacion`,
 1 AS `identificacion`,
 1 AS `telefono`,
 1 AS `placa`,
 1 AS `tipoVehiculo`,
 1 AS `idPlazasVehiculo`,
 1 AS `horaEntrada`,
 1 AS `horaSalida`*/;
SET character_set_client = @saved_cs_client;

--
-- Final view structure for view `vistafacturas`
--

/*!50001 DROP VIEW IF EXISTS `vistafacturas`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `vistafacturas` AS select `facturas`.`idFacturas` AS `idFacturas`,`facturas`.`idVehiculosFacturas` AS `idVehiculosFacturas`,`facturas`.`valorTotal` AS `valorTotal`,`facturas`.`idOperariosFacturas` AS `idOperariosFacturas`,`operarios`.`username` AS `username`,`operarios`.`password` AS `password`,`operarios`.`nombre` AS `nombre`,`operarios`.`apellido` AS `apellido`,`operarios`.`email` AS `email`,`operarios`.`tipo_identificacion` AS `tipo_identificacion`,`operarios`.`identificacion` AS `identificacion`,`operarios`.`telefono` AS `telefono`,`vehiculos`.`placa` AS `placa`,`vehiculos`.`tipoVehiculo` AS `tipoVehiculo`,`vehiculos`.`idPlazasVehiculo` AS `idPlazasVehiculo`,`vehiculos`.`horaEntrada` AS `horaEntrada`,`vehiculos`.`horaSalida` AS `horaSalida` from ((`facturas` join `operarios` on((`facturas`.`idOperariosFacturas` = `operarios`.`idOperarios`))) join `vehiculos` on((`facturas`.`idVehiculosFacturas` = `vehiculos`.`idVehiculos`))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-10-10 21:27:35
