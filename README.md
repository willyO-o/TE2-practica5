# Bienvenido, Practica 5 Patron de diseño DAO
----
#### Autor: WIlly Chana


----

## Instrucciones

Ejecutar los comandos para crear la base de datos :
--
-- Estructura de tabla para la tabla `productos`
--
CREATE DATABASE bd_almacen;

CREATE TABLE `productos` (
  `id` int(11) NOT NULL,
  `descripcion` varchar(250) NOT NULL,
  `stock` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `productos`
--

INSERT INTO `productos` (`id`, `descripcion`, `stock`) VALUES
(1, 'Celular Samsung Galaxy S10, RAM 8Gb, ROM 128Gb', 10),
(2, 'TV Smart 43\'\' UN43J5202AGXZS Disfruta del Full HD en su maxima expresion Calidad de imagen Full HD', 2),
(3, 'Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. ', 12),
(4, 'Tablet 10\'\' Haier, 4 gb RAM , 16 gb ROM', 2),
(5, 'Cargador 30W, marca Huawei USB tipo-C', 6);

--

ALTER TABLE `productos`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `id` (`id`);


--
ALTER TABLE `productos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;



`Nota: el proyecto se desarrollo con con NetBeans 8.2, Glash Fish 5 y Java 7 y MySQL.`

----


----
## fecha
* 31-Abril-2020  

----
## capturas

principal

![image](https://user-images.githubusercontent.com/56971398/83364253-05f69e80-a36e-11ea-9955-4d0eb19a94f6.png)


agregar/editar Producto

![03](https://user-images.githubusercontent.com/56971398/82600500-00ce6e00-9b7c-11ea-8d49-23a2bbb8f2b2.png)

estructura del proyecto



