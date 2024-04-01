-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 30-03-2024 a las 06:29:39
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `limpieza`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Administrador`
--

CREATE TABLE `Administrador` (
  `administradorId` int(11) NOT NULL,
  `personaId` char(9) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cat_colonias`
--

CREATE TABLE `cat_colonias` (
  `cve_incr_cp` int(11) NOT NULL,
  `cve_codpost` char(5) DEFAULT NULL,
  `nombre_colonia` varchar(100) DEFAULT NULL,
  `tipo_asentamiento` varchar(100) DEFAULT NULL,
  `municipio` varchar(100) DEFAULT NULL,
  `estado` varchar(100) DEFAULT NULL,
  `ciudad` varchar(100) DEFAULT NULL,
  `lat` varchar(40) DEFAULT NULL,
  `lon` varchar(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Cuadrilla`
--

CREATE TABLE `Cuadrilla` (
  `cuadrillaId` int(11) NOT NULL,
  `jefeCuadrillaId` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `HistorialTrabajos`
--

CREATE TABLE `HistorialTrabajos` (
  `historialTrabajosId` int(11) NOT NULL,
  `cveColonia` int(11) NOT NULL,
  `cuadrillaId` int(11) NOT NULL,
  `descripcion` text DEFAULT NULL,
  `comentarios` text DEFAULT NULL,
  `rutaImagen` text DEFAULT NULL,
  `fechaAgendada` date DEFAULT NULL,
  `estatus` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `JefeCuadrilla`
--

CREATE TABLE `JefeCuadrilla` (
  `jefeCuadrillaId` int(11) NOT NULL,
  `personaId` char(9) NOT NULL,
  `sector` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Persona`
--

CREATE TABLE `Persona` (
  `personaId` char(9) NOT NULL,
  `rol` char(1) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `apellidoPaterno` varchar(50) NOT NULL,
  `apellidoMaterno` varchar(50) NOT NULL,
  `salario` int(11) NOT NULL,
  `nombreUsuario` varchar(50) NOT NULL,
  `contraseña` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Trabajador`
--

CREATE TABLE `Trabajador` (
  `trabajadorId` int(11) NOT NULL,
  `personaId` char(9) NOT NULL,
  `cuadrillaId` int(11) NOT NULL,
  `especialidad` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `Administrador`
--
ALTER TABLE `Administrador`
  ADD PRIMARY KEY (`administradorId`),
  ADD KEY `Administrador_ibfk_1` (`personaId`);

--
-- Indices de la tabla `cat_colonias`
--
ALTER TABLE `cat_colonias`
  ADD PRIMARY KEY (`cve_incr_cp`);

--
-- Indices de la tabla `Cuadrilla`
--
ALTER TABLE `Cuadrilla`
  ADD PRIMARY KEY (`cuadrillaId`),
  ADD KEY `Cuadrilla_JefeCuadrilla_fk1` (`jefeCuadrillaId`);

--
-- Indices de la tabla `HistorialTrabajos`
--
ALTER TABLE `HistorialTrabajos`
  ADD PRIMARY KEY (`historialTrabajosId`),
  ADD KEY `HistorialTrabajos_ibfk_1` (`cveColonia`),
  ADD KEY `HistorialTrabajos_ibfk_2` (`cuadrillaId`);

--
-- Indices de la tabla `JefeCuadrilla`
--
ALTER TABLE `JefeCuadrilla`
  ADD PRIMARY KEY (`jefeCuadrillaId`),
  ADD KEY `personaId` (`personaId`);

--
-- Indices de la tabla `Persona`
--
ALTER TABLE `Persona`
  ADD PRIMARY KEY (`personaId`);

--
-- Indices de la tabla `Trabajador`
--
ALTER TABLE `Trabajador`
  ADD PRIMARY KEY (`trabajadorId`),
  ADD KEY `Trabajador_ibfk_1` (`personaId`),
  ADD KEY `Trabajador_ibfk_2` (`cuadrillaId`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `Administrador`
--
ALTER TABLE `Administrador`
  MODIFY `administradorId` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `Cuadrilla`
--
ALTER TABLE `Cuadrilla`
  MODIFY `cuadrillaId` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `HistorialTrabajos`
--
ALTER TABLE `HistorialTrabajos`
  MODIFY `historialTrabajosId` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `JefeCuadrilla`
--
ALTER TABLE `JefeCuadrilla`
  MODIFY `jefeCuadrillaId` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `Trabajador`
--
ALTER TABLE `Trabajador`
  MODIFY `trabajadorId` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `Administrador`
--
ALTER TABLE `Administrador`
  ADD CONSTRAINT `Administrador_ibfk_1` FOREIGN KEY (`personaId`) REFERENCES `Persona` (`personaId`);

--
-- Filtros para la tabla `Cuadrilla`
--
ALTER TABLE `Cuadrilla`
  ADD CONSTRAINT `Cuadrilla_JefeCuadrilla_fk1` FOREIGN KEY (`jefeCuadrillaId`) REFERENCES `JefeCuadrilla` (`jefeCuadrillaId`);

--
-- Filtros para la tabla `HistorialTrabajos`
--
ALTER TABLE `HistorialTrabajos`
  ADD CONSTRAINT `HistorialTrabajos_ibfk_1` FOREIGN KEY (`cveColonia`) REFERENCES `cat_colonias` (`cve_incr_cp`),
  ADD CONSTRAINT `HistorialTrabajos_ibfk_2` FOREIGN KEY (`cuadrillaId`) REFERENCES `Cuadrilla` (`cuadrillaId`);

--
-- Filtros para la tabla `JefeCuadrilla`
--
ALTER TABLE `JefeCuadrilla`
  ADD CONSTRAINT `JefeCuadrilla_ibfk_1` FOREIGN KEY (`personaId`) REFERENCES `Persona` (`personaId`);

--
-- Filtros para la tabla `Trabajador`
--
ALTER TABLE `Trabajador`
  ADD CONSTRAINT `Trabajador_ibfk_1` FOREIGN KEY (`personaId`) REFERENCES `Persona` (`personaId`),
  ADD CONSTRAINT `Trabajador_ibfk_2` FOREIGN KEY (`cuadrillaId`) REFERENCES `Cuadrilla` (`cuadrillaId`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
