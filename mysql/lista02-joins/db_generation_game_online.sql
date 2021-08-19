CREATE DATABASE db_generation_game_online;
USE db_generation_game_online;
CREATE TABLE tb_classe(
	id INT PRIMARY KEY AUTO_INCREMENT,
    poder VARCHAR(50),
    elemento VARCHAR(10)
);
CREATE TABLE tb_personagem(
	id_personagem INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(50),
    ataque INT(10),
    defesa INT(10),
    id_classe INT, FOREIGN KEY (id_classe) REFERENCES tb_classe(id)
);
INSERT INTO tb_classe VALUES
(NULL, "Entra em combustão e controla o fogo", "Fogo"),
(NULL, "Congela tudo que toca", "Água"),
(NULL, "Manipula a matéria vegetal", "Terra"),
(NULL, "Controla o vento", "Ar"),
(NULL, "Manipula tudo o que estiver conectado a Terra", "Terra");

INSERT INTO tb_personagem VALUES
(NULL, "Combugnis", 3000, 2500, 1),
(NULL, "Flutaqua", 3500, 1500, 2),
(NULL, "Vegelate", 2000, 1500, 3),
(NULL, "Ventana", 1500, 1000, 4),
(NULL, "Manignis", 3500, 2500, 1),
(NULL, "Impeterra", 3500, 3000, 5),
(NULL, "Caelate", 2500, 2000, 4),
(NULL, "Aquaregi", 3000, 3500, 2);

SELECT * FROM tb_personagem WHERE ataque>2000;
SELECT * FROM tb_personagem WHERE defesa>1000 and defesa<2000;
SELECT * FROM tb_personagem WHERE tb_personagem.nome like "%C%";
SELECT * FROM tb_personagem INNER JOIN tb_classe ON tb_classe.id = tb_personagem.id_classe;
SELECT * FROM tb_personagem WHERE id_classe=2;