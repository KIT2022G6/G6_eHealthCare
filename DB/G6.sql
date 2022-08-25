-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: ehealthcare_g6
-- ------------------------------------------------------
-- Server version	8.0.29

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
-- Table structure for table `appointment`
--

DROP TABLE IF EXISTS `appointment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `appointment` (
  `appointmentid` varchar(255) NOT NULL,
  `id` bigint DEFAULT NULL,
  `p_ord` int NOT NULL,
  `p_roo` int NOT NULL,
  `p_vsi` date DEFAULT NULL,
  `doctorid` varchar(255) DEFAULT NULL,
  `patientid` varchar(255) DEFAULT NULL,
  `recordid` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`appointmentid`),
  KEY `FKrni1ea9yguo96jtpbnov75o5l` (`doctorid`),
  KEY `FK45u34ll44t8g0iedip6slmemt` (`patientid`),
  KEY `FKrkjt2ymipiot64jmbfh6havou` (`recordid`),
  CONSTRAINT `FK45u34ll44t8g0iedip6slmemt` FOREIGN KEY (`patientid`) REFERENCES `patient` (`patientid`),
  CONSTRAINT `FKrkjt2ymipiot64jmbfh6havou` FOREIGN KEY (`recordid`) REFERENCES `medical_record` (`recordid`),
  CONSTRAINT `FKrni1ea9yguo96jtpbnov75o5l` FOREIGN KEY (`doctorid`) REFERENCES `doctor` (`doctorid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `appointment`
--

LOCK TABLES `appointment` WRITE;
/*!40000 ALTER TABLE `appointment` DISABLE KEYS */;
/*!40000 ALTER TABLE `appointment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `department`
--

DROP TABLE IF EXISTS `department`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `department` (
  `departmentid` varchar(255) NOT NULL,
  `d_charge` int NOT NULL,
  `d_description` varchar(255) DEFAULT NULL,
  `d_name` varchar(255) DEFAULT NULL,
  `id` bigint DEFAULT NULL,
  PRIMARY KEY (`departmentid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `department`
--

LOCK TABLES `department` WRITE;
/*!40000 ALTER TABLE `department` DISABLE KEYS */;
INSERT INTO `department` VALUES ('KK1',344,'enhance viral communities','Ten khoa 1',1),('KK2',582,'engage robust networks','Ten khoa 2',2),('KK3',456,'cultivate customized synergies','Ten khoa 3',3),('KK4',875,'brand virtual content','Ten khoa 4',4),('KK5',447,'morph holistic schemas','Ten khoa 5',5);
/*!40000 ALTER TABLE `department` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `doctor`
--

DROP TABLE IF EXISTS `doctor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `doctor` (
  `doctorid` varchar(255) NOT NULL,
  `d_age` int unsigned DEFAULT NULL,
  `d_email` varchar(255) NOT NULL,
  `d_name` varchar(255) NOT NULL,
  `d_password` varchar(255) NOT NULL,
  `d_phone` varchar(255) NOT NULL,
  `d_username` varchar(255) NOT NULL,
  `id` bigint DEFAULT NULL,
  `fk_departmentid` varchar(255) DEFAULT NULL,
  `fk_scheduleid` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`doctorid`),
  KEY `FKefib84o8fewwus1ouy9ckc8hq` (`fk_departmentid`),
  KEY `FKjiucoxy9pk28roaqc032h2is8` (`fk_scheduleid`),
  CONSTRAINT `FKefib84o8fewwus1ouy9ckc8hq` FOREIGN KEY (`fk_departmentid`) REFERENCES `department` (`departmentid`),
  CONSTRAINT `FKjiucoxy9pk28roaqc032h2is8` FOREIGN KEY (`fk_scheduleid`) REFERENCES `schedule` (`scheduleid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `doctor`
--

LOCK TABLES `doctor` WRITE;
/*!40000 ALTER TABLE `doctor` DISABLE KEYS */;
INSERT INTO `doctor` VALUES ('BS1',46,'Nathanael.1@eheathcare.com','Nathanael','1','1002233959','1',1,'KK2','LLV2'),('BS2',54,'Marielle.2@eheathcare.com','Marielle','1','6611554397','1',2,'KK5','LLV5'),('BS3',47,'Ramona.3@eheathcare.com','Ramona','1','6848997171','1',3,'KK3','LLV3'),('BS4',52,'Avivah.4@eheathcare.com','Avivah','1','1525522419','1',4,'KK1','LLV1'),('BS5',53,'Oby.5@eheathcare.com','Oby','1','8558221943','1',5,'KK4','LLV4'),('BS6',46,'Marjorie.6@eheathcare.com','Marjorie','1','1582342559','1',6,'KK1','LLV1');
/*!40000 ALTER TABLE `doctor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `insurance`
--

DROP TABLE IF EXISTS `insurance`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `insurance` (
  `insuranceid` varchar(255) NOT NULL,
  `i_description` varchar(255) DEFAULT NULL,
  `i_name` varchar(255) DEFAULT NULL,
  `id` bigint DEFAULT NULL,
  PRIMARY KEY (`insuranceid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `insurance`
--

LOCK TABLES `insurance` WRITE;
/*!40000 ALTER TABLE `insurance` DISABLE KEYS */;
/*!40000 ALTER TABLE `insurance` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `med_invoice`
--

DROP TABLE IF EXISTS `med_invoice`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `med_invoice` (
  `med_invoiceid` varchar(255) NOT NULL,
  `id` bigint DEFAULT NULL,
  `medicineid` varchar(255) DEFAULT NULL,
  `precriptionid` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`med_invoiceid`),
  KEY `FK95cyd9tts42a6difkrl1udcp2` (`medicineid`),
  KEY `FKh81896f8bo5ovhell1mftslki` (`precriptionid`),
  CONSTRAINT `FK95cyd9tts42a6difkrl1udcp2` FOREIGN KEY (`medicineid`) REFERENCES `medicine` (`medicineid`),
  CONSTRAINT `FKh81896f8bo5ovhell1mftslki` FOREIGN KEY (`precriptionid`) REFERENCES `prescription` (`prescriptionid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `med_invoice`
--

LOCK TABLES `med_invoice` WRITE;
/*!40000 ALTER TABLE `med_invoice` DISABLE KEYS */;
INSERT INTO `med_invoice` VALUES ('HDT1',1,'LT5','DT4'),('HDT2',2,'LT4','DT1'),('HDT3',3,'LT5','DT6'),('HDT4',4,'LT6','DT3'),('HDT5',5,'LT2','DT2'),('HDT6',6,'LT3','DT3');
/*!40000 ALTER TABLE `med_invoice` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `medical_record`
--

DROP TABLE IF EXISTS `medical_record`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `medical_record` (
  `recordid` varchar(255) NOT NULL,
  `id` bigint DEFAULT NULL,
  `p_dia` varchar(255) DEFAULT NULL,
  `p_his` varchar(255) DEFAULT NULL,
  `prescriptionid` varchar(255) NOT NULL,
  PRIMARY KEY (`recordid`),
  KEY `FK74olstm2ax4yr03ow9t1b6p03` (`prescriptionid`),
  CONSTRAINT `FK74olstm2ax4yr03ow9t1b6p03` FOREIGN KEY (`prescriptionid`) REFERENCES `prescription` (`prescriptionid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `medical_record`
--

LOCK TABLES `medical_record` WRITE;
/*!40000 ALTER TABLE `medical_record` DISABLE KEYS */;
INSERT INTO `medical_record` VALUES ('BA1',1,'ﾟ･✿ヾ╲(｡◕‿◕｡)╱✿･ﾟ','VestibulumAliquet.tiff','DT1'),('BA2',2,'NULL','TurpisElementumLigula.mp3','DT2'),('BA3',3,'‪‪test‪','Pellentesque.gif','DT3'),('BA4',4,'・(￣∀￣)・:*:','NuncPurus.jpeg','DT4'),('BA5',5,',./;\'[]-=','MolestieSedJusto.ppt','DT5'),('BA6',6,'١٢٣','NislUtVolutpat.jpeg','DT6');
/*!40000 ALTER TABLE `medical_record` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `medicine`
--

DROP TABLE IF EXISTS `medicine`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `medicine` (
  `medicineid` varchar(255) NOT NULL,
  `id` bigint DEFAULT NULL,
  `m_exp` date DEFAULT NULL,
  `m_name` varchar(255) DEFAULT NULL,
  `m_pri` int NOT NULL,
  `m_sto` int NOT NULL,
  PRIMARY KEY (`medicineid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `medicine`
--

LOCK TABLES `medicine` WRITE;
/*!40000 ALTER TABLE `medicine` DISABLE KEYS */;
INSERT INTO `medicine` VALUES ('LT1',1,'2024-08-09','Moexipril Hydrochloride',474,25),('LT2',2,'2025-07-02','Nalbuphine Hydrochloride',243,10),('LT3',3,'2024-09-21','NEOMYCIN AND POLYMYXIN B SULFATES AND DEXAMETHASONE',43,68),('LT4',4,'2025-01-12','smart sense allergy and congestion relief',820,80),('LT5',5,'2025-11-25','Oxygen, Refrigerated',363,56),('LT6',6,'2025-02-21','Lucky Super Soft',709,58);
/*!40000 ALTER TABLE `medicine` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `patient`
--

DROP TABLE IF EXISTS `patient`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `patient` (
  `patientid` varchar(255) NOT NULL,
  `id` bigint DEFAULT NULL,
  `pa_address` varchar(255) NOT NULL,
  `pa_bloodtype` varchar(255) NOT NULL,
  `pa_dob` date NOT NULL,
  `pa_full_name` varchar(255) NOT NULL,
  `pa_gender` bit(1) NOT NULL,
  `pa_heartrate` int unsigned DEFAULT NULL,
  `pa_height` int unsigned DEFAULT NULL,
  `pa_password` varchar(255) NOT NULL,
  `pa_phone` varchar(255) NOT NULL,
  `pa_rhesus` bit(1) NOT NULL,
  `pa_username` varchar(255) NOT NULL,
  `pa_weight` int unsigned DEFAULT NULL,
  `insuranceid` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`patientid`),
  KEY `FKhorehjdqbu723ap5n7btiuqsq` (`insuranceid`),
  CONSTRAINT `FKhorehjdqbu723ap5n7btiuqsq` FOREIGN KEY (`insuranceid`) REFERENCES `insurance` (`insuranceid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `patient`
--

LOCK TABLES `patient` WRITE;
/*!40000 ALTER TABLE `patient` DISABLE KEYS */;
/*!40000 ALTER TABLE `patient` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pharmacy`
--

DROP TABLE IF EXISTS `pharmacy`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pharmacy` (
  `pharmacyid` varchar(255) NOT NULL,
  `id` bigint DEFAULT NULL,
  `ph_description` varchar(255) DEFAULT NULL,
  `ph_name` varchar(255) DEFAULT NULL,
  `ph_password` varchar(255) NOT NULL,
  `ph_username` varchar(255) NOT NULL,
  PRIMARY KEY (`pharmacyid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pharmacy`
--

LOCK TABLES `pharmacy` WRITE;
/*!40000 ALTER TABLE `pharmacy` DISABLE KEYS */;
/*!40000 ALTER TABLE `pharmacy` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `prescription`
--

DROP TABLE IF EXISTS `prescription`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `prescription` (
  `prescriptionid` varchar(255) NOT NULL,
  `id` bigint DEFAULT NULL,
  `p_amo` int NOT NULL,
  `p_det` varchar(255) DEFAULT NULL,
  `p_dos` int NOT NULL,
  PRIMARY KEY (`prescriptionid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `prescription`
--

LOCK TABLES `prescription` WRITE;
/*!40000 ALTER TABLE `prescription` DISABLE KEYS */;
INSERT INTO `prescription` VALUES ('DT1',1,45,'Once',1),('DT2',2,25,'Seldom',4),('DT3',3,38,'Yearly',3),('DT4',4,27,'Once',3),('DT5',5,21,'Weekly',6),('DT6',6,16,'Seldom',3);
/*!40000 ALTER TABLE `prescription` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `schedule`
--

DROP TABLE IF EXISTS `schedule`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `schedule` (
  `scheduleid` varchar(255) NOT NULL,
  `id` bigint DEFAULT NULL,
  `sch_date` date DEFAULT NULL,
  `sch_shift` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`scheduleid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `schedule`
--

LOCK TABLES `schedule` WRITE;
/*!40000 ALTER TABLE `schedule` DISABLE KEYS */;
INSERT INTO `schedule` VALUES ('LLV1',1,'2022-04-13','4'),('LLV2',2,'2021-10-21','3'),('LLV3',3,'2022-07-08','1'),('LLV4',4,'2022-05-24','5'),('LLV5',5,'2022-04-06','2'),('LLV6',6,'2021-11-09','6'),('LLV7',7,'2022-07-18','5');
/*!40000 ALTER TABLE `schedule` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `total_invoice`
--

DROP TABLE IF EXISTS `total_invoice`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `total_invoice` (
  `invoiceid` varchar(255) NOT NULL,
  `id` bigint DEFAULT NULL,
  `t_print` date DEFAULT NULL,
  `appointmentid` varchar(255) NOT NULL,
  `med_invoiceid` varchar(255) NOT NULL,
  `pharmacyid` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`invoiceid`),
  KEY `FKqfn5omyxtydk6m86ty8qepq74` (`appointmentid`),
  KEY `FKeitdo4d4u0ge4rlwm0pwrr2hf` (`med_invoiceid`),
  KEY `FKlipx2afi97a0x3sx1p8385xfw` (`pharmacyid`),
  CONSTRAINT `FKeitdo4d4u0ge4rlwm0pwrr2hf` FOREIGN KEY (`med_invoiceid`) REFERENCES `med_invoice` (`med_invoiceid`),
  CONSTRAINT `FKlipx2afi97a0x3sx1p8385xfw` FOREIGN KEY (`pharmacyid`) REFERENCES `pharmacy` (`pharmacyid`),
  CONSTRAINT `FKqfn5omyxtydk6m86ty8qepq74` FOREIGN KEY (`appointmentid`) REFERENCES `appointment` (`appointmentid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `total_invoice`
--

LOCK TABLES `total_invoice` WRITE;
/*!40000 ALTER TABLE `total_invoice` DISABLE KEYS */;
/*!40000 ALTER TABLE `total_invoice` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'ehealthcare_g6'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-08-22 16:59:23
