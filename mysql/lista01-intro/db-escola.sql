CREATE DATABASE escola;

CREATE TABLE alunes (
	id_aluno INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(40),
    turma VARCHAR(5),
    periodo VARCHAR(10),
    nota_final FLOAT(3,2)   
);

INSERT INTO alunes VALUES
(NULL, "Marina Luz Martins", "6ªB", "Manhã", 8.75),
(NULL, "Luis Henrique Machado", "6ªB", "Manhã", 7.25),
(NULL, "Kaique Moreira da Silva", "7ªD", "Tarde", 9.00),
(NULL, "Nayara da Silva Pereira", "5ªC", "Manhã", 6.75),
(NULL, "Bruna Gonçalles", "6ªA", "Manhã", 8.75),
(NULL, "Camila Martins Holn", "8ªB", "Tarde", 7.50),
(NULL, "Lucas Souza Santos", "6ªE", "Manhã", 6.25),
(NULL, "Ricardo Nunes Brasil", "8ªC", "Tarde", 7.75);

SELECT * FROM alunes WHERE nota_final>7.00;
SELECT * FROM alunes WHERE nota_final<7.00;

UPDATE alunes SET nota=9.25 WHERE id_aluno=3;