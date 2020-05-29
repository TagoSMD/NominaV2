CREATE DATABASE NominaE;
USE NominaE;
CREATE TABLE  nomina
(
ID int (100) auto_increment PRIMARY KEY,
nombre_empleado varchar(60),
puesto_empleado varchar(30),
sueldo_empleado varchar(10),
bonificacion_empleado varchar(10),
igss_empleado varchar(15),
otros_empleado varchar(10),
sueldoe_empleados varchar(10),
horase_empleados varchar(15),
isr_empleados varchar(10),
descuentos_empleados varchar(10)
)engine=InnoDB default charset=latin1;

USE NominaE;
Select * From nomina;