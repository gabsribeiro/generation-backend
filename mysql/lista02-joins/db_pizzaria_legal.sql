CREATE DATABASE db_pizzaria_legal;
USE db_pizzaria_legal;
CREATE TABLE tb_categoria(
	id INT PRIMARY KEY AUTO_INCREMENT,
    tipo VARCHAR(50),
    add_borda BOOLEAN
);
CREATE TABLE tb_pizza(
	id_pizza INT PRIMARY KEY AUTO_INCREMENT,
    sabor VARCHAR(50),
    quantidade INT(5),
    add_queijo BOOLEAN,
	refrigerante BOOLEAN,
    preco FLOAT(6,2),
    id_categoria INT, FOREIGN KEY(id_categoria) REFERENCES tb_categoria(id)
);
INSERT INTO tb_categoria VALUES
(NULL, "SALGADA - BROTINHO", true),
(NULL, "SALGADA - GRANDE", true),
(NULL, "SALGADA - BROTINHO", false),
(NULL, "SALGADA - GRANDE", false),
(NULL, "DOCE - BROTINHO", true),
(NULL, "DOCE - GRANDE", true),
(NULL, "DOCE - BROTINHO", false),
(NULL, "DOCE - GRANDE", false);

INSERT INTO tb_pizza VALUES
(NULL, "MUSSARELA", 2, true, true, 49.90, 2),
(NULL, "PORTUGUESA", 1, false, false, 49.90, 2),
(NULL, "BACON", 1, true, false, 34.90, 3),
(NULL, "PALMITO", 2, false, true, 55.90, 4),
(NULL, "ATUM", 1, false, false, 49.90, 4),
(NULL, "ROMEU E JULIETA", 1, false, true, 32.90, 5),
(NULL, "BANANA COM CANELA", 2, false, true, 52.90, 8),
(NULL, "NUTELLA", 1, false, false, 35.90, 7);

SELECT * FROM tb_pizza WHERE preco>45.00;
SELECT * FROM tb_pizza WHERE preco>29.00 and preco<60.00;
SELECT * FROM tb_pizza WHERE sabor LIKE "%C%";
SELECT * FROM tb_pizza INNER JOIN tb_categoria ON tb_categoria.id = tb_pizza.id_categoria;