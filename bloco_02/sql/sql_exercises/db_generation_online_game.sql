CREATE DATABASE db_generation_game_online;

USE db_generation_game_online;

CREATE TABLE tb_classes (
  id INT AUTO_INCREMENT ,
  nome VARCHAR(255) NOT NULL,
  descricao VARCHAR(255), 
  PRIMARY KEY (id)
);

INSERT INTO tb_classes (nome, descricao) VALUES
('Romaro', 'Personagem com alto nível de conhecimento.'), 
('Lutador', 'Personagem mestre em Karatê'),
('Musculoso', 'Personagem com alto nível de força'), 
('Águia', 'Personagem com poder de voo'), 
('Corredor', 'Personagem com alto nível de velocidade'); 

SELECT * FROM tb_classes;

CREATE TABLE tb_personagens (
  id INT AUTO_INCREMENT,
  PRIMARY KEY (id),
  nome VARCHAR(50) NOT NULL,
  nivel INT,
  poder_ataque INT,
  poder_defesa INT,
  classe_id INT,
  FOREIGN KEY (classe_id) REFERENCES tb_classes(id)
);

INSERT INTO tb_personagens (nome, nivel, poder_ataque, poder_defesa, classe_id)
VALUES
('Geraldo, o sábio', 10, 3000, 2500, 1), 
('Ronaldo, o Lutador', 20, 1900, 1200, 2),
('James, o Musculoso', 30, 3500, 2500, 3),
('Thompsom', 5, 40, 200, 4),
('Jenny', 15, 50, 600, 5);

-- Personagens com poder de ataque maior que 200
SELECT * FROM tb_personagens WHERE poder_ataque > 200;

-- Personagens com poder de defesa entre 300 e 2600
SELECT * FROM tb_personagens WHERE poder_defesa BETWEEN 300 AND 2600;

-- Personagens com a letra 'T' no atributo nome
SELECT * FROM tb_personagens WHERE nome LIKE '%T%';

-- Inner Join entre tb_personagens e tb_classes
SELECT tb_personagens.*, tb_classes.nome AS classe FROM tb_personagens
INNER JOIN tb_classes ON tb_personagens.classe_id = tb_classes.id;

-- Inner Join entre tb_personagens e tb_classes para uma classe específicad
SELECT tb_personagens.*, tb_classes.nome AS classe FROM tb_personagens
INNER JOIN tb_classes ON tb_personagens.classe_id = tb_classes.id
WHERE tb_classes.nome = 'Musculoso';
