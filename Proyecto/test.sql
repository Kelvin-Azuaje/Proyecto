-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 25-05-2019 a las 02:18:39
-- Versión del servidor: 10.1.19-MariaDB
-- Versión de PHP: 7.0.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `test`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `averiados`
--

CREATE TABLE `averiados` (
  `CODIGO` varchar(35) NOT NULL,
  `EQUIPO` text NOT NULL,
  `FECHA1` varchar(20) NOT NULL,
  `OBSERVACIONES` text NOT NULL,
  `UBICACION` text NOT NULL,
  `FECHA2` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `averiados`
--

INSERT INTO `averiados` (`CODIGO`, `EQUIPO`, `FECHA1`, `OBSERVACIONES`, `UBICACION`, `FECHA2`) VALUES
('   759-150-0001', 'CPU', '  05 /  05  /  2019', 'SE QUEMO', 'LINEA DE CAJA', '  24 /  05  /  2019');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `equipos`
--

CREATE TABLE `equipos` (
  `CODIGO` varchar(35) NOT NULL,
  `TIPO` text NOT NULL,
  `DESCRIPCION` text NOT NULL,
  `DESTINO` text NOT NULL,
  `FECHA1` varchar(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=armscii8;

--
-- Volcado de datos para la tabla `equipos`
--

INSERT INTO `equipos` (`CODIGO`, `TIPO`, `DESCRIPCION`, `DESTINO`, `FECHA1`) VALUES
('   759-150-0005', 'CPU', 'MARCA LG, PROCESADOR i5', 'LINEA DE CAJA', '  05 /  05  /  2019'),
('   759-150-0004', 'CPU', 'MARCA LG, PROCESADOR i5', 'LINEA DE CAJA', '  05 /  05  /  2019'),
('   759-150-0003', 'CPU', 'MARCA LG, PROCESADOR i5', 'LINEA DE CAJA', '  05 /  05  /  2019'),
('   759-150-0002', 'CPU', 'MARCA LG, PROCESADOR i5', 'LINEA DE CAJA', '  05 /  05  /  2019'),
('   759-150-0001', 'CPU', 'MARCA LG, PROCESADOR i5', 'LINEA DE CAJA', '  05 /  05  /  2019'),
('   759-150-0006', 'CPU', 'MARCA SAMSUNG, PROCESADOR i5', 'LINEA DE CAJA', '  05 /  05  /  2019'),
('   759-150-0007', 'CPU', 'MARCA SAMSUNG, i5', 'LINEA DE CAJA', '  05 /  05  /  2019'),
('   759-150-0008', 'CPU', 'MARCA IBM', 'LINEA DE CAJA', '  05 /  05  /  2019'),
('   759-150-0009', 'CPU', 'MARCA THINKCENTER', 'LINEA DE CAJA', '  05 /  05  /  2019'),
('   759-150-0010', 'CPU', 'MARCA THINKCENTER\nPROCESADOR i4', 'LINEA DE CAJA', '  05 /  05  /  2019');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tras_externos`
--

CREATE TABLE `tras_externos` (
  `CODIGO` varchar(35) NOT NULL,
  `EQUIPO` text NOT NULL,
  `FECHA1` varchar(20) NOT NULL,
  `UBICACION` text NOT NULL,
  `SUCURSAL1` text NOT NULL,
  `SUCURSAL2` text NOT NULL,
  `FECHA2` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tras_internos`
--

CREATE TABLE `tras_internos` (
  `CODIGO` varchar(35) NOT NULL,
  `EQUIPO` text NOT NULL,
  `FECHA1` varchar(20) NOT NULL,
  `UBICACION` text NOT NULL,
  `DESTINO` text NOT NULL,
  `FECHA2` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `ID` int(11) NOT NULL,
  `NOM_USUARIO` varchar(20) NOT NULL,
  `CLAVE` varchar(20) NOT NULL,
  `CARGO` text NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=armscii8;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`ID`, `NOM_USUARIO`, `CLAVE`, `CARGO`) VALUES
(1, 'SoporteBarinas', 'SupportG19', 'Soportista_Senior'),
(2, 'SoporteTecnico', 'SoporteJunior', 'Soportista_Junior'),
(3, 'SoporteMaster', 'SupportM19', 'Soportista_Maestro'),
(4, 'Analista', 'Analista_System', 'Analista_Sistema'),
(5, 'Supervisor', 'BAREG04cORPo*', 'SUPERVISOR');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `averiados`
--
ALTER TABLE `averiados`
  ADD PRIMARY KEY (`CODIGO`);

--
-- Indices de la tabla `equipos`
--
ALTER TABLE `equipos`
  ADD PRIMARY KEY (`CODIGO`);

--
-- Indices de la tabla `tras_externos`
--
ALTER TABLE `tras_externos`
  ADD PRIMARY KEY (`CODIGO`);

--
-- Indices de la tabla `tras_internos`
--
ALTER TABLE `tras_internos`
  ADD PRIMARY KEY (`CODIGO`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
