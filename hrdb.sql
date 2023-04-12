/*
SQLyog Community v13.2.0 (64 bit)
MySQL - 8.0.23 : Database - hrdb
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`hrdb` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `hrdb`;

/*Table structure for table `h_user` */

DROP TABLE IF EXISTS `h_user`;

CREATE TABLE `h_user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(50) DEFAULT NULL,
  `password` char(32) DEFAULT NULL,
  `salt` char(36) DEFAULT NULL,
  `is_delete` int DEFAULT NULL,
  `phone` varchar(20) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `gender` int DEFAULT NULL,
  `avatar` varchar(100) DEFAULT NULL,
  `created_user` varchar(50) DEFAULT NULL,
  `created_time` datetime DEFAULT NULL,
  `modified_user` varchar(50) DEFAULT NULL,
  `modified_time` datetime DEFAULT NULL,
  `role` int NOT NULL DEFAULT '0',
  `name` varchar(10) DEFAULT NULL,
  `age` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `h_user` */

insert  into `h_user`(`id`,`username`,`password`,`salt`,`is_delete`,`phone`,`email`,`gender`,`avatar`,`created_user`,`created_time`,`modified_user`,`modified_time`,`role`,`name`,`age`) values 
(3,'2582532130','3a760ae71d94d38e62cd3ab8e99d2d76','55e46e6e-4b16-4a14-8af4-435b7b32e8a0',0,NULL,NULL,2,NULL,'2582532130','2023-03-29 20:43:26','2582532130','2023-03-29 20:43:26',0,NULL,NULL),
(4,'123456','e6641978f1347b52e6dd4a5a599b32e9','1cce52f2-fd0a-4d75-8234-e62f2ecb2991',0,'15559759282','1359751672@qq.com',1,NULL,'123456','2023-04-08 00:23:45','123456','2023-04-11 03:09:14',0,'邓小龙',20),
(5,'123456789','a8aae99bea0c94ef68e84e78621731e7','9bf30c14-f22c-4fea-a978-5a7a53cc1dbe',0,NULL,NULL,2,NULL,'123456789','2023-04-09 16:49:13','123456789','2023-04-09 16:49:13',1,NULL,NULL),
(6,'Admin1','c315b5a4725dcdf0684b299646d061a9','4e3258c5-e37e-4d4f-816a-bde9e1b0d866',0,NULL,NULL,2,NULL,'Admin1','2023-04-10 17:18:48','Admin1','2023-04-10 17:18:48',1,NULL,NULL);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
