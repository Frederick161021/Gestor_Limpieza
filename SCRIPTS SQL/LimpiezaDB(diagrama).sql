SET FOREIGN_KEY_CHECKS = 0;
DROP TABLE IF EXISTS `Persona`;
DROP TABLE IF EXISTS `JefeCuadrilla`;
DROP TABLE IF EXISTS `Trabajador`;
DROP TABLE IF EXISTS `Administrador`;
DROP TABLE IF EXISTS `Cuadrilla`;
DROP TABLE IF EXISTS `cat_colonias`;
DROP TABLE IF EXISTS `HistorialTrabajos`;
SET FOREIGN_KEY_CHECKS = 1;

CREATE TABLE `Persona` (
    `personaId` CHAR(9) NOT NULL,
    `rol` CHAR(1) NOT NULL,
    `nombre` VARCHAR(50) NOT NULL,
    `apellidoPaterno` VARCHAR(50) NOT NULL,
    `apellidoMaterno` VARCHAR(50) NOT NULL,
    `salario` INTEGER NOT NULL,
    `nombreUsuario` VARCHAR(50) NOT NULL,
    `contraseña` VARCHAR(50) NOT NULL,
    PRIMARY KEY (`personaId`)
);

CREATE TABLE `JefeCuadrilla` (
    `jefeCuadrillaId` INTEGER AUTO_INCREMENT NOT NULL,
    `personaId` CHAR(9) NOT NULL,
    `sector` VARCHAR(100) NOT NULL,
    PRIMARY KEY (`jefeCuadrillaId`)
);

CREATE TABLE `Trabajador` (
    `trabajadorId` INTEGER AUTO_INCREMENT NOT NULL,
    `personaId` CHAR(9) NOT NULL,
    `cuadrillaId` INTEGER NOT NULL,
    `especialidad` VARCHAR(100) NOT NULL,
    PRIMARY KEY (`trabajadorId`)
);

CREATE TABLE `Administrador` (
    `administradorId` INTEGER AUTO_INCREMENT NOT NULL,
    `personaId` CHAR(9) NOT NULL,
    PRIMARY KEY (`administradorId`)
);

CREATE TABLE `Cuadrilla` (
    `cuadrillaId` INTEGER AUTO_INCREMENT NOT NULL,
    `jefeCuadrillaId` INTEGER NOT NULL,
    `nombre` VARCHAR(50) NOT NULL,
    PRIMARY KEY (`cuadrillaId`)
);

CREATE TABLE `cat_colonias` (
    `cve_incr_cp` INTEGER NOT NULL,
    `cve_codpost` CHAR(5),
    `nombre_colonia` VARCHAR(100),
    `tipo_asentamiento` VARCHAR(100),
    `municipio` VARCHAR(100),
    `estado` VARCHAR(100),
    `ciudad` VARCHAR(100),
    `lat` VARCHAR(40),
    `lon` VARCHAR(40),
    PRIMARY KEY (`cve_incr_cp`)
);

CREATE TABLE `HistorialTrabajos` (
    `historialTrabajosId` INTEGER AUTO_INCREMENT NOT NULL,
    `cveColonia` INTEGER NOT NULL,
    `cuadrillaId` INTEGER NOT NULL,
    `descripcion` TEXT,
    `comentarios` TEXT,
    `rutaImagen` TEXT,
    `fechaAgendada` DATE,
    `estatus` VARCHAR(50) NOT NULL,
    PRIMARY KEY (`historialTrabajosId`)
);
