CREATE DATABASE ecommerce;

CREATE TABLE produtos(
	id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(30),
    preco FLOAT(10),
    categoria VARCHAR(30),
    quantidade INT
);

INSERT INTO produtos VALUES 
(NULL, "Boneca Barbie Bailarina", 29.90, "Brinquedos", 50),
(NULL, "Notebook Acer Aspire 3", 3299.00, "Notebooks", 14),
(NULL, "Smartphone Moto G30", 1899.00, "Celulares", 12),
(NULL, "Jogo de Panelas", 279.90, "Utilidades Domésticas", 20),
(NULL, "Fritadeira Air Fryer", 389.00, "Eletroportáteis", 15),
(NULL, "Espelho", 299.00, "Beleza e Perfumaria", 8),
(NULL, "Creme de Leite Integral", 2.29, "Mercado", 100),
(NULL, "Lavadora de Roupas", 1499.00, "Eletrodomésticos", 15);

SELECT * FROM produtos WHERE preco>500;
SELECT * FROM produtos WHERE preco<500;

UPDATE produtos SET quantidade=20 WHERE id=5;