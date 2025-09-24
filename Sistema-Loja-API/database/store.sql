DROP TABLE IF EXISTS `cliente`;

CREATE TABLE `cliente` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) NOT NULL,
  `cpf` varchar(15) NOT NULL,
  `rua` varchar(100) NOT NULL,
  `numero` int NOT NULL,
  `complemento` varchar(30) DEFAULT NULL,
  `bairro` varchar(100) NOT NULL,
  `cep` varchar(15) NOT NULL,
  `cidade` varchar(100) NOT NULL,
  `telefone` varchar(30) NOT NULL,
  `email` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=56 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


LOCK TABLES `cliente` WRITE;

INSERT INTO `cliente` VALUES (1,'Camila Bontempo','11322266603','Av dos Curios',501,'Bloco 18 Ap 403','Pontal','38055100','Uberaba','99460013','camila.frrr1@hotmail.com');

UNLOCK TABLES;


DROP TABLE IF EXISTS `faixa`;

CREATE TABLE `faixa` (
  `id` int NOT NULL AUTO_INCREMENT,
  `altura` decimal(6,2) NOT NULL,
  `largura` decimal(6,2) NOT NULL,
  `texto` varchar(200) NOT NULL,
  `cor_faixa` varchar(50) NOT NULL,
  `cor_texto` varchar(50) NOT NULL,
  `valor_faixa` decimal(9,2) NOT NULL,
  `pedido` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=39 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
LOCK TABLES `faixa` WRITE;

INSERT INTO `faixa` VALUES (1,50.00,150.00,'Arthur é chato','green','black',60.00,1);
UNLOCK TABLES;
DROP TABLE IF EXISTS `hibernate_sequence`;

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
LOCK TABLES `hibernate_sequence` WRITE;
INSERT INTO `hibernate_sequence` VALUES (56);
UNLOCK TABLES;

DROP TABLE IF EXISTS `pedido`;
CREATE TABLE `pedido` (
  `id` int NOT NULL AUTO_INCREMENT,
  `data` datetime NOT NULL,
  `previsao_entrega` datetime DEFAULT NULL,
  `valor_servico` decimal(9,2) NOT NULL,
  `valor_sinal` decimal(9,2) NOT NULL,
  `data_inicio_prod` datetime DEFAULT NULL,
  `data_fim_prod` datetime DEFAULT NULL,
  `data_real_entrega` datetime DEFAULT NULL,
  `status` char(2) DEFAULT NULL,
  `cliente` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=40 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


LOCK TABLES `pedido` WRITE;
;
INSERT INTO `pedido` VALUES (1,'2020-11-21 15:00:00','2020-11-27 15:00:00',100.00,50.00,'2020-11-22 15:00:00','2020-11-27 15:00:00','2020-11-28 15:00:00','F',1);
;
UNLOCK TABLES;

