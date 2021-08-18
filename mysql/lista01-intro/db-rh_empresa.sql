CREATE DATABASE rh_empresa;

CREATE TABLE funcionaries (
	id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(30),
    salario VARCHAR(10),
    cargo VARCHAR(20),
    setor VARCHAR(20)
);

INSERT INTO funcionaries(id,nome,salario,cargo,setor) VALUES (NULL, "Luciano Camargo da Silva", "1875,00","Auxiliar de RH", "RH");
INSERT INTO funcionaries(id,nome,salario,cargo,setor) VALUES (NULL, "Silvia Maria Snaider", "7489,00","Engenheira Sênior", "Engenharia Química");
INSERT INTO funcionaries(id,nome,salario,cargo,setor) VALUES (NULL, "Marcos Pereira Alencar", "1750,00","Estagiário Química", "Engenharia Química");
INSERT INTO funcionaries(id,nome,salario,cargo,setor) VALUES (NULL, "Adriano Lúcio Martinez", "4275,00","Engenheiro Pleno", "Eng. de Produção");
INSERT INTO funcionaries(id,nome,salario,cargo,setor) VALUES (NULL, "Kátia Pereira da Luz", "3875,00","Gerente de RH", "RH");

SELECT * FROM funcionaries;
SELECT * FROM funcionaries WHERE salario>"2000";
SELECT * FROM funcionaries WHERE salario<"2000";
UPDATE funcionaries SET salario="4325,00" WHERE id=4;