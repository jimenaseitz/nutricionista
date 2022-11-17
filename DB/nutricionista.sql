-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 15-11-2022 a las 00:03:27
-- Versión del servidor: 10.4.25-MariaDB
-- Versión de PHP: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `nutricionistaultimo`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `comida`
--

CREATE TABLE `comida` (
  `id_comida` int(11) NOT NULL,
  `nombre` varchar(25) NOT NULL,
  `detalle` varchar(100) NOT NULL,
  `calorias` int(11) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `comida`
--

INSERT INTO `comida` (`id_comida`, `nombre`, `detalle`, `calorias`, `estado`) VALUES
(10, 'Pollo', 'parrilla', 100, 1),
(12, 'Tomate', 'parrilla', 100, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `dieta`
--

CREATE TABLE `dieta` (
  `id_dieta` int(11) NOT NULL,
  `id_paciente` int(11) NOT NULL,
  `iniciodieta` date NOT NULL,
  `findieta` date NOT NULL,
  `pesoBuscado` double NOT NULL,
  `limiteCalorico` int(1) NOT NULL,
  `pesoInicial` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `dieta`
--

INSERT INTO `dieta` (`id_dieta`, `id_paciente`, `iniciodieta`, `findieta`, `pesoBuscado`, `limiteCalorico`, `pesoInicial`) VALUES
(8, 4, '2022-11-09', '2022-11-08', 10.5, 22, 10.5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `itemcomidas`
--

CREATE TABLE `itemcomidas` (
  `id_itemcomida` int(11) NOT NULL,
  `id_dieta` int(11) NOT NULL,
  `id_comida` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `itemcomidas`
--

INSERT INTO `itemcomidas` (`id_itemcomida`, `id_dieta`, `id_comida`) VALUES
(7, 8, 10),
(10, 8, 12);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `paciente`
--

CREATE TABLE `paciente` (
  `id_paciente` int(11) NOT NULL,
  `dni` int(11) NOT NULL,
  `apellido` varchar(50) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `domicilio` varchar(100) NOT NULL,
  `telefono` int(12) NOT NULL,
  `altura` double NOT NULL,
  `pesoActual` double NOT NULL,
  `fechaNacimiento` date NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `paciente`
--

INSERT INTO `paciente` (`id_paciente`, `dni`, `apellido`, `nombre`, `domicilio`, `telefono`, `altura`, `pesoActual`, `fechaNacimiento`, `estado`) VALUES
(4, 26912333, 'Lopez Pujato', 'Pablo Javier', 'carmen', 2147483647, 2.05, 75, '0000-00-00', 1),
(6, 33825432, 'Sanchez', 'Tomas', 'catamarca ', 15245, 1.8, 70, '0000-00-00', 1),
(8, 44321123, 'Sehitz', 'Jimena', 'catamarca ', 15245, 1.8, 70, '0000-00-00', 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `comida`
--
ALTER TABLE `comida`
  ADD PRIMARY KEY (`id_comida`),
  ADD UNIQUE KEY `nombre` (`nombre`) USING BTREE;

--
-- Indices de la tabla `dieta`
--
ALTER TABLE `dieta`
  ADD PRIMARY KEY (`id_dieta`),
  ADD UNIQUE KEY `idPaciente_2` (`id_paciente`,`findieta`),
  ADD KEY `idPaciente` (`id_paciente`);

--
-- Indices de la tabla `itemcomidas`
--
ALTER TABLE `itemcomidas`
  ADD PRIMARY KEY (`id_itemcomida`),
  ADD UNIQUE KEY `idDieta_2` (`id_dieta`,`id_comida`) USING BTREE,
  ADD KEY `idDieta` (`id_dieta`),
  ADD KEY `idComida` (`id_comida`);

--
-- Indices de la tabla `paciente`
--
ALTER TABLE `paciente`
  ADD PRIMARY KEY (`id_paciente`),
  ADD UNIQUE KEY `dni` (`dni`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `comida`
--
ALTER TABLE `comida`
  MODIFY `id_comida` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT de la tabla `dieta`
--
ALTER TABLE `dieta`
  MODIFY `id_dieta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT de la tabla `itemcomidas`
--
ALTER TABLE `itemcomidas`
  MODIFY `id_itemcomida` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `paciente`
--
ALTER TABLE `paciente`
  MODIFY `id_paciente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `dieta`
--
ALTER TABLE `dieta`
  ADD CONSTRAINT `dieta_ibfk_1` FOREIGN KEY (`id_paciente`) REFERENCES `paciente` (`id_paciente`);

--
-- Filtros para la tabla `itemcomidas`
--
ALTER TABLE `itemcomidas`
  ADD CONSTRAINT `itemcomidas_ibfk_1` FOREIGN KEY (`id_dieta`) REFERENCES `dieta` (`id_dieta`),
  ADD CONSTRAINT `itemcomidas_ibfk_2` FOREIGN KEY (`id_comida`) REFERENCES `comida` (`id_comida`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
