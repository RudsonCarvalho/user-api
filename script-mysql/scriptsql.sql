/*SCRIPT MY SQL*/

CREATE DATABASE USER_DB;

USE USER_DB;

CREATE TABLE TB_USUARIOS
(
	ID INT PRIMARY KEY AUTO_INCREMENT
,	NOME VARCHAR(100)
, 	EMAIL VARCHAR(100)
, 	`STATUS` boolean
, 	DATA_CADASTRO timestamp DEFAULT CURRENT_TIMESTAMP
, 	DATA_ATUALIZACAO timestamp DEFAULT 0 
);

INSERT INTO TB_USUARIOS (NOME, EMAIL, STATUS, DATA_CADASTRO) VALUES('RUDSON CARVALHO', 'RUDSON.CARVALHO@GMAIL.COM', 1, NULL),
('SIMONE CARVALHO', 'SIMONE.CARVALHO@GMAIL.COM', 1, NULL);


SELECT * FROM  TB_USUARIOS;
