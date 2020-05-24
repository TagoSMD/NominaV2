CREATE DATABASE Empleados;
USE Empleados;
CREATE TABLE  empleado
(
ID int (100) auto_increment PRIMARY KEY,
codigo_empleado varchar(50),
nombre_empleado varchar(60),
apellido_empleado varchar(30),
telefono_empleado varchar(15),
correo_empleado varchar(30),
dirreccion_empleado varchar(40),
dpi_empleado varchar(10),
estado_empleado varchar(10),
sueldo_empleado varchar(15),
cargo_empleado varchar(10)
)engine=InnoDB default charset=latin1;

USE Empleados;
Select * From empleado;