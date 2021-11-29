CREATE DATABASE  IF NOT EXISTS `marcadorweb` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `marcadorweb`;
-- MySQL dump 10.13  Distrib 8.0.27, for Win64 (x86_64)
--
-- Host: localhost    Database: marcadorweb
-- ------------------------------------------------------
-- Server version	8.0.27

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
-- Table structure for table `carpeta`
--

DROP TABLE IF EXISTS `carpeta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `carpeta` (
  `idCarpeta` int NOT NULL,
  `nombreCarpeta` varchar(45) NOT NULL,
  `descCarpeta` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`idCarpeta`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `carpeta`
--

LOCK TABLES `carpeta` WRITE;
/*!40000 ALTER TABLE `carpeta` DISABLE KEYS */;
INSERT INTO `carpeta` VALUES (0,'Default','Carpeta por defecto'),(1,'Noticias','Tus sitios para enterarte de lo que pasa en el mundo'),(2,'Estudio','No pierdas tus apuntes y recursos para estudiar'),(3,'Compras','Tiendas para ir de shopping desde tu pieza'),(4,'Cultura','Eventos, museos, conciertos, y sitios culturales'),(5,'Social','Redes sociales, mensajes e interaccion'),(6,'Ocio','Peliculas, juegos, y sitios para pasar un buen rato');
/*!40000 ALTER TABLE `carpeta` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `marcador`
--

DROP TABLE IF EXISTS `marcador`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `marcador` (
  `idMarcador` int NOT NULL AUTO_INCREMENT,
  `nombreMarcador` varchar(45) NOT NULL,
  `url` varchar(200) NOT NULL,
  `fechaCreacion` date NOT NULL,
  `fechaUltimoUso` date NOT NULL,
  `descMarcador` varchar(60) DEFAULT NULL,
  `colorMarcador` varchar(8) NOT NULL,
  `usuario` int NOT NULL,
  `carpeta` int DEFAULT NULL,
  PRIMARY KEY (`idMarcador`),
  KEY `fk_usuario_idx` (`usuario`),
  KEY `fk_carpeta_idx` (`carpeta`),
  CONSTRAINT `fk_carpeta` FOREIGN KEY (`carpeta`) REFERENCES `carpeta` (`idCarpeta`),
  CONSTRAINT `fk_usuario` FOREIGN KEY (`usuario`) REFERENCES `usuario` (`idUsuario`)
) ENGINE=InnoDB AUTO_INCREMENT=38 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `marcador`
--

LOCK TABLES `marcador` WRITE;
/*!40000 ALTER TABLE `marcador` DISABLE KEYS */;
INSERT INTO `marcador` VALUES (18,'Amazon','www.amazon.com','2021-11-10','2021-11-20','Compras, libros, peliculas','Amarillo',22,3),(19,'Spotify','www.spotify.com','2021-11-11','2021-11-20','Canciones','Verde',22,0),(20,'Duoc','www.duoc.cl','2021-11-12','2021-11-20','Instituto Profesional Duoc UC','Amarillo',22,2),(21,'Netflix','www.netflix.com','2021-11-13','2021-11-21','Peliculas y series','Rosa',22,6),(22,'Scribd','www.scribd.com/','2021-11-14','2021-11-21','Libros y pdfs','Lila',22,2),(23,'Instagram','www.instagram.com','2021-11-15','2021-11-21','Red social','Rosa',22,5),(24,'Facebook','https://www.facebook.com/','2021-11-16','2021-11-28','Red social','Lila',22,5),(27,'PrimeVideo','www.primevideo.com/','2021-11-17','2021-11-22','Peliculas y series','Amarillo',22,6),(28,'Reddit','www.reddit.com','2021-11-18','2021-11-22','Comunidades, red social, contenido','Verde',22,5),(29,'Discord','www.discord.com','2021-11-19','2021-11-23','Comunidades, chat, videollamadas','Lila',22,5),(30,'Meganoticias','www.meganoticias.cl','2021-11-20','2021-11-23','Noticias mega','Verde',22,1),(31,'Baburizza','www.museobaburizza.cl/','2021-11-21','2021-11-23','Museo Baburizza Valparaiso','Rosa',22,4),(32,'PcdV','www.parquecultural.cl/','2021-11-22','2021-11-24','Parque Cultural de Valparaiso','Verde',22,4),(33,'MemoriaChilena','www.memoriachilena.gob.cl','2021-11-23','2021-11-24','Archivo, articulos, biblioteca','Lila',22,4),(34,'MercadoLibre','www.mercadolibre.cl','2021-11-24','2021-11-24','Compras en linea','Amarillo',22,3),(35,'Gmail','www.gmail.com','2021-11-25','2021-11-25','Correo electronico','Rosa',22,0),(36,'Youtube','www.youtube.com','2021-11-26','2021-11-26','Videos, musica, contenido','Rosa',22,6),(37,'w3schools','www.w3schools.com/','2021-11-27','2021-11-27','Cursos de progamacion y ejercicios','Verde',22,2);
/*!40000 ALTER TABLE `marcador` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuario` (
  `idUsuario` int NOT NULL AUTO_INCREMENT,
  `nombreUsuario` varchar(45) NOT NULL,
  `clave` varchar(45) NOT NULL,
  `correo` varchar(45) NOT NULL,
  `genero` bit(1) DEFAULT NULL,
  PRIMARY KEY (`idUsuario`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (22,'PATRICIO VILLARROEL','qwe123','patricio@gmail.com',_binary ''),(23,'NOEMI MERARI','1234567','noemi@gmail.com',_binary '\0');
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'marcadorweb'
--

--
-- Dumping routines for database 'marcadorweb'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-11-29  0:02:09
