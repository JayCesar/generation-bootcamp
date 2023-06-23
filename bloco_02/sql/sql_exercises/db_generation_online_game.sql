CREATE DATABASE db_generation_online_game;

USE db_generation_online_game;

CREATE TABLE tb_classes (
	id INT AUTO_INCREMENT,
    tipo VARCHAR(255) NOT NULL,
    descricao VARCHAR(255),
    poder_de_ataque INT,
    poder_de_defesa INT,
    PRIMARY KEY (id)
);

INSERT INTO tb_classes (tipo, descricao, poder_de_ataque, poder_de_defesa) VALUES
("Defensor", "Sua principal característica é defender", 10, 90),
("Lançador", "Fornece armas lançando para o ar", 20, 30),
("Lutador", "Possui chutes e socos poderosos", 50, 30),
("Professor", "Sua sabedoria pode manipular o adversário", 70, 30);

CREATE TABLE tb_personagens(
	id bigint auto_increment,
    PRIMARY KEY (id),
    nome VARCHAR(50) NOT NULL,
	idade INT,
    nivel INT,
    classe_id INT NOT NULL,
	FOREIGN KEY (classe_id) REFERENCES tb_classes(id)
);

