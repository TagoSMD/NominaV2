CREATE DATABASE NominaEmpleados;
USE NominaEmpleados;

CREATE TABLE  empleados
(
codigo_empleado varchar(50),
nombre_empleado varchar(60),
apellido_empleado varchar(30),
telefono_empleado varchar(15),
correo_empleado varchar(30),
dirreccion_empleado varchar(40),
dpi_empleado varchar(10),
estado_empleado varchar(10),
sueldo_empleado varchar(15),
cargo_empleado varchar(10),
 PRIMARY KEY (nombre_empleado)
)engine=InnoDB default charset=latin1;

CREATE TABLE  departamentos
(
codigo_departamento varchar(50),
nombre_departamento varchar(60),
encargado_departamento varchar(60),
telefono_departamento varchar(15),
correo_departamento varchar(40),
PRIMARY KEY (codigo_departamento)
)engine=InnoDB default charset=latin1;

CREATE TABLE  puestos
(
codigo_puesto varchar(10),
nombre_puesto varchar(40),
nombre_empleado varchar(50),
estatus_puesto varchar(5),
PRIMARY KEY (nombre_puesto)
)engine=InnoDB default charset=latin1;

CREATE TABLE  conceptos
(
codigo_concepto varchar(12),
nombre_concepto varchar(60),
efecto_concepto varchar(60)
)engine=InnoDB default charset=latin1;

CREATE TABLE  nomina
(
nombre_empleado varchar(60),
nombre_puesto varchar(30),
sueldo_empleado varchar(10),
bonificacion_empleado varchar(10),
igss_empleado varchar(15),
otros_empleado varchar(10),
sueldoe_empleados varchar(10),
horase_empleados varchar(15),
isr_empleados varchar(10),
descuentos_empleados varchar(10),
  PRIMARY KEY (nombre_empleado,nombre_puesto),
  FOREIGN KEY (nombre_empleado) REFERENCES empleados(nombre_empleado),
  FOREIGN KEY (nombre_puesto) REFERENCES puestos(nombre_puesto)
)engine=InnoDB default charset=latin1;
