-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 12-12-2022 a las 13:29:06
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
-- Base de datos: `nutricionista`
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
(56, 'Pata muslo Pollo', 'Pata muslo cocinado al vapor', 250, 1),
(57, 'Pata pollo', 'Pata cocinada al Horno', 100, 1),
(58, 'alas de Pollo', 'la cocción se realiza al horno', 50, 1),
(59, 'Porción de tomates Cherry', 'La porción contiene 6 tomates cuyo peso es de 10gr', 10, 1),
(60, 'zapallitos zuquini', 'Los mismos se deben cocinar al vapor por un tiempo de 30 min .', 300, 1),
(61, 'Nuez porción', 'nuez descarozada por 10 gr.', 15, 1),
(63, 'Aceitunas verdes 10', 'Aceitunas descarozadas 5 gr', 5, 1);

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
  `limiteCalorico` int(11) NOT NULL,
  `pesoInicial` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `dieta`
--

INSERT INTO `dieta` (`id_dieta`, `id_paciente`, `iniciodieta`, `findieta`, `pesoBuscado`, `limiteCalorico`, `pesoInicial`) VALUES
(126, 13, '2022-08-04', '2022-08-11', 70.1, 1000, 80),
(127, 13, '2021-12-16', '2021-12-23', 85, 50, 70),
(128, 14, '2021-12-01', '2021-12-08', 70, 500, 75),
(129, 14, '2019-12-12', '2019-12-19', 80, 1000, 90),
(130, 15, '2020-12-10', '2020-12-17', 70, 500, 80),
(131, 15, '2022-12-12', '2022-12-19', 60, 550, 70);

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
(157, 127, 63),
(158, 127, 61),
(159, 126, 61),
(160, 126, 60),
(161, 126, 63),
(162, 126, 59),
(163, 126, 61),
(164, 126, 59),
(165, 129, 59),
(166, 129, 60),
(167, 129, 60),
(168, 129, 60),
(169, 129, 58),
(170, 128, 58),
(171, 130, 58),
(172, 130, 56),
(173, 130, 58),
(174, 130, 57),
(175, 131, 57),
(176, 131, 56),
(177, 131, 63),
(178, 131, 63),
(179, 131, 57);

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
(13, 26912333, 'LOPEZ PUJATO', 'PABLO JAVIER', 'VIRGEN DEL CARMEN 123', 266438373, 1.75, 75, '1978-10-06', 1),
(14, 33450340, 'SANCHEZ', 'TOMÁS', 'URQUIZA 420', 254212332, 1.7, 70, '1995-08-11', 1),
(15, 33820430, 'SHAITZ', 'JIMENA', 'los paraisos 2050', 266125444, 1.65, 60, '2000-12-30', 1),
(16, 33840530, 'BIOLATTI', 'ANA LUZ', 'Villa del Carmen', 358562110, 1.65, 65, '2019-06-13', 1);

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
  MODIFY `id_comida` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=64;

--
-- AUTO_INCREMENT de la tabla `dieta`
--
ALTER TABLE `dieta`
  MODIFY `id_dieta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=132;

--
-- AUTO_INCREMENT de la tabla `itemcomidas`
--
ALTER TABLE `itemcomidas`
  MODIFY `id_itemcomida` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=180;

--
-- AUTO_INCREMENT de la tabla `paciente`
--
ALTER TABLE `paciente`
  MODIFY `id_paciente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

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
  ADD CONSTRAINT `itemcomidas_ibfk_1` FOREIGN KEY (`id_dieta`) REFERENCES `dieta` (`id_dieta`) ON DELETE CASCADE,
  ADD CONSTRAINT `itemcomidas_ibfk_2` FOREIGN KEY (`id_comida`) REFERENCES `comida` (`id_comida`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
