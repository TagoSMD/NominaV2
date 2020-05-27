CREATE DATABASE puestos1;
USE puestos1;
CREATE TABLE  puesto
(
id int (11)auto_increment primary key,
codigo_puesto varchar(10),
nombre_puesto varchar(40),
nombre_empleado varchar(50),
estatus_puesto varchar(5)
)engine=InnoDB default charset=latin1;

USE puestos1;
Select * From puesto;