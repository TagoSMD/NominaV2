CREATE DATABASE Conceptos1;
USE Conceptos1;
CREATE TABLE  concepto
(
ID int (100) auto_increment PRIMARY KEY,
codigo_concepto varchar(12),
nombre_concepto varchar(60),
efecto_concepto varchar(60)
)engine=InnoDB default charset=latin1;

USE conceptos1;
Select * From concepto;