CREATE DATABASE Departamentos;
USE Departamentos;
CREATE TABLE  departamento
(
ID int (100) auto_increment PRIMARY KEY,
codigo_departamento varchar(50),
nombre_departamento varchar(60),
encargado_departamento varchar(60),
telefono_departamento varchar(15),
correo_departamento varchar(40)
)engine=InnoDB default charset=latin1;

USE Departamentos;
Select * From departamento;