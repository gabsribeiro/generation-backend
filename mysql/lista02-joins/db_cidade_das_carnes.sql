CREATE DATABASE db_cidade_das_carnes;
USE db_cidade_das_carnes;
CREATE TABLE tb_categoria(
	id INT PRIMARY KEY AUTO_INCREMENT,
    tipo VARCHAR(50),
    modo VARCHAR(50)
);
CREATE TABLE tb_produto(
	id_produto INT PRIMARY KEY AUTO_INCREMENT,
    carne VARCHAR(50),
    peso VARCHAR(50),
    preco DECIMAL(10,6),
    id_categoria INT, FOREIGN KEY (id_categoria) REFERENCES tb_categoria(id)    
);
INSERT tb_categoria (id, tipo, modo) VALUES
(NULL, "CARNE BOVINA", "PEÇA INTEIRA"),
(NULL, "CARNE BOVINA", "FILÉ"),
(NULL, "FRANGO", "COM OSSO"),
(NULL, "FRANGO", "SEM OSSO"),
(NULL, "CARNE DE PORCO", "PEÇA INTEIRA"),
(NULL, "CARNE DE PORCO", "MOÍDA");

INSERT tb_produto (id_produto, carne, peso, preco, id_categoria) VALUES
(NULL, "COSTELA", "3kg", 74.90, 1),
(NULL, "ALCATRA", "2kg", 86.70, 2),
(NULL, "COXÃO DURO", "1kg", 32.90, 2),
(NULL, "MÚSCULO", "1kg", 34.90, 1),
(NULL, "PEITO DE FRANGO", "1kg", 15.90, 4),
(NULL, "COXA DE FRANGO", "3kg", 13.90, 3),
(NULL, "BISTECA DE PORCO", "2kg", 74.90, 5),
(NULL, "LINGUIÇA", "4kg", 74.90, 6);

SELECT * FROM tb_produto WHERE preco > 50;
SELECT * FROM tb_produto WHERE preco> 3 AND preco<60;
SELECT * FROM tb_produto WHERE carne LIKE "C%";
SELECT * FROM tb_produto INNER JOIN tb_categoria ON tb_categoria.id=tb_produto.id_categoria;