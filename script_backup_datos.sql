/*SELECT * FROM `db-sistema`.cat_categorias;*/

/*INSERT INTO `db-sistema`.`cat_categorias` (`nom_categoria_prod`, `desc_categoria_prod`) VALUES ('bebidas', 'todo tipo de bebidas');
INSERT INTO `db-sistema`.`cat_categorias` (`nom_categoria_prod`, `desc_categoria_prod`) VALUES ('panificados', 'todo tipo de panificados');
INSERT INTO `db-sistema`.`cat_categorias` (`nom_categoria_prod`, `desc_categoria_prod`) VALUES ('electrodomesticos', 'todo tipo de electrodomesticos');
INSERT INTO `db-sistema`.`cat_categorias` (`nom_categoria_prod`, `desc_categoria_prod`) VALUES ('jardineria', 'todo tipo de jardineria');
INSERT INTO `db-sistema`.`cat_categorias` (`nom_categoria_prod`, `desc_categoria_prod`) VALUES ('Libreria', 'Articulos de Librería');
INSERT INTO `db-sistema`.`cat_categorias` (`nom_categoria_prod`, `desc_categoria_prod`) VALUES ('Categoria de Prueba', 'Descripción de la categoria de prueba');
*/


/*SELECT * FROM `db-sistema`.cat_proveedores;*/

/*INSERT INTO `db-sistema`.`cat_proveedores` (`nom_proveedor`, `dir_proveedor`, `telefono_proveedor`, `email_proveedor`, `contacto_proveedor`) VALUES ('Distribuidor de Bebidas', 'Avenida Champagnat 666', '261-5067780', 'distrosol@aol.com', 'Horario Garmendia');
INSERT INTO `db-sistema`.`cat_proveedores` (`nom_proveedor`, `dir_proveedor`, `telefono_proveedor`, `email_proveedor`, `contacto_proveedor`) VALUES ('Distribuidor de Panificados', 'Avenida San Martin Sur 1012', '261-5067781', 'amanecer@speedy.com', 'Lucrecia Fernandez');
INSERT INTO `db-sistema`.`cat_proveedores` (`nom_proveedor`, `dir_proveedor`, `telefono_proveedor`, `email_proveedor`, `contacto_proveedor`) VALUES ('Distribuidor de Electrodomesticos', 'Avenida Las Heras 123', '261-5159780', 'salamone@arlink.com', 'Sabrina Toriano');
INSERT INTO `db-sistema`.`cat_proveedores` (`nom_proveedor`, `dir_proveedor`, `telefono_proveedor`, `email_proveedor`, `contacto_proveedor`) VALUES ('Distribuidor de Jardineria', 'Avenida Los Puquios 53', '261-5080808', 'jardinlospuquios@entel.com', 'Patricia Funes Gonzalez');
*/

/*SELECT * FROM `db-sistema`.cat_productos;*/

INSERT INTO `db-sistema`.`cat_productos` (`id_prod`, `nombre_prod`, `desc_prod`, `stock_prod`, `foto_prod`, `unidad_prod`, `precio_compra_prod`, `precio_venta_prod`, `existencias_prod`, `id_categoria_prod`, `id_proveedor`) VALUES ('36', 'Desmalezadora Bosch', 'Desmalezadora Orbital de 5200 r.p.m.', 500, null, 'pieza', 1000, 2500, 600, 10, 4);
INSERT INTO `db-sistema`.`cat_productos` (`id_prod`, `nombre_prod`, `desc_prod`, `stock_prod`, `foto_prod`, `unidad_prod`, `precio_compra_prod`, `precio_venta_prod`, `existencias_prod`, `id_categoria_prod`, `id_proveedor`) VALUES ('69', 'Holla a Presion', 'Marmicoc de 15 Litros', 100, null, 'pieza', 100, 150, 1500, 9, 3);
INSERT INTO `db-sistema`.`cat_productos` (`id_prod`, `nombre_prod`, `desc_prod`, `stock_prod`, `foto_prod`, `unidad_prod`, `precio_compra_prod`, `precio_venta_prod`, `existencias_prod`, `id_categoria_prod`, `id_proveedor`) VALUES ('123', 'Coca-Cola', 'Cola Cola sin Azucares', 10, null, 'pieza', 2, 10, 120, 7, 1);
INSERT INTO `db-sistema`.`cat_productos` (`id_prod`, `nombre_prod`, `desc_prod`, `stock_prod`, `foto_prod`, `unidad_prod`, `precio_compra_prod`, `precio_venta_prod`, `existencias_prod`, `id_categoria_prod`, `id_proveedor`) VALUES ('4848', 'Tortilla', 'Tortilla Santiagueña asada', 20, null, 'pieza', 5, 15, 55, 8, 2);
