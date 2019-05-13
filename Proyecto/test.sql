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
('   759-150-0002', 'GAVETA', '05/05/2019', 'LA GAVETA NO ABRE', 'LINEA DE CAJA', '07/05/2019');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `equipos`
--

CREATE TABLE `equipos` (
  `CODIGO` varchar(35) NOT NULL,
  `TIPO` text NOT NULL,
  `DESCRIPCION` text NOT NULL,
  `DESTINO` text NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=armscii8;

--
-- Volcado de datos para la tabla `equipos`
--

INSERT INTO `equipos` (`CODIGO`, `TIPO`, `DESCRIPCION`, `DESTINO`) VALUES
('   759-150-0001', 'CPU', 'CPU, MARCA LG,\r\nPARA UTILIZARLO COMO CAJA', 'LINEA DE CAJA'),
('   759-150-0005', 'IMPRESORA FISCAL', 'NUMERO DE POS 025\nZ1B5JJJH', 'CAJA PRINCIPAL'),
('   759-150-0058', 'MOUSE', 'LED, MARCA VIT', 'HABLADORES'),
('   759-150-0024', 'CPU', 'MARCA IBM', 'LINEA DE CAJA'),
('759 150 0022', 'SWITCH', 'MARCA CISCO', 'CCTV'),
('759 150 0014', 'PDT', 'PARA INVENTARIO GENERAL 2019', 'MERCADEO'),
('759 150 0010', 'ROUTER', 'MARCA TP-LINK', 'LIQUIDACION'),
('759 150 0005', 'BALANZA DE CAJA', 'MARCA DIALKA', 'LINEA DE CAJA'),
('759 150 0089', 'GAVETA', 'AUTOMATICA', 'LINEA DE CAJA'),
('   759-150-0045', 'ESCANER', 'TIPO PISTOLA, MARCA LG', 'LIQUIDACION'),
('   759-150-0046', 'SWITCH', 'MARCA CISCO', 'CCTV'),
('   759-150-0047', 'CPU', 'MARCA SAMSUNG', 'SUPERVISORES'),
('   759-150-0010', 'MOUSE', 'dfdsfdsrfewre', 'SUPERVISORES'),
('   759-150-0011', 'MOUSE', 'wseweqweq', 'LIQUIDACION'),
('   759-150-0012', 'SWITCH', 'zc<ds<dn<d', 'CAJA PRINCIPAL');

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

--
-- Volcado de datos para la tabla `tras_externos`
--

INSERT INTO `tras_externos` (`CODIGO`, `EQUIPO`, `FECHA1`, `UBICACION`, `SUCURSAL1`, `SUCURSAL2`, `FECHA2`) VALUES
('   759-150-0003', 'PDT', '05/05/2019', 'SISTEMAS & TI', 'BARINAS', 'MERIDA', '07/05/2019');

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

--
-- Volcado de datos para la tabla `tras_internos`
--

INSERT INTO `tras_internos` (`CODIGO`, `EQUIPO`, `FECHA1`, `UBICACION`, `DESTINO`, `FECHA2`) VALUES
('   759-150-0004', 'MONITOR', '05/05/2019', 'TALENTO HUMANO', 'PRODUCCION', '07/05/2019');

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
