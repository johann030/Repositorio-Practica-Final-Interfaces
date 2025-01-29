drop database tienda;
create database tienda;
use tienda;
create table clientes(
codigo VARCHAR(6) PRIMARY KEY NOT NULL,
nif VARCHAR(9) UNIQUE NOT NULL,
apellidos VARCHAR(35) NOT NULL,
nombre VARCHAR(15) NOT NULL,
domicilio VARCHAR(40) NOT NULL,
codigoPostal VARCHAR(5) NOT NULL,
localidad VARCHAR(20) NOT NULL,
telefono VARCHAR(9),
movil VARCHAR(9),
fax VARCHAR(9),
mail VARCHAR(60),
totalVentas FLOAT
);

create table proveedores(
codigo VARCHAR(6) PRIMARY KEY NOT NULL,
nif VARCHAR(9) UNIQUE,
apellidos VARCHAR(35),
nombre VARCHAR(15),
domicilio VARCHAR(40),
codigoPostal VARCHAR(5),
localidad VARCHAR(20),
telefono VARCHAR(9),
movil VARCHAR(9),
fax VARCHAR(9),
mail VARCHAR(60),
totalVentas FLOAT
);

create table articulos(
codigo_articulo VARCHAR(6) PRIMARY KEY NOT NULL,
descripcion VARCHAR(25),
stock FLOAT,
stockMinimo FLOAT,
precioCompre FLOAT,
precioVenta FLOAT
);