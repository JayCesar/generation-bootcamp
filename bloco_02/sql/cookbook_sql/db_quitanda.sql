CREATE DATABASE db_quitanda;

USE  db_quitanda;

CREATE TABLE tb_produtos(
	id bigint auto_increment,
    nome varchar(255) not null,
    quantidade int,
    preco decimal not null,
    PRIMARY KEY (id)
);

INSERT INTO tb_produtos(nome, quantidade, preco)
VALUES ("Tomate", 100, 8.00);
INSERT INTO tb_produtos(nome, quantidade, preco) 
values ("maçã",20, 5.00);
INSERT INTO tb_produtos(nome, quantidade, preco) 
values ("laranja",50, 10.00);
INSERT INTO tb_produtos(nome, quantidade, preco) 
values ("banana",200, 12.00);
INSERT INTO tb_produtos(nome, quantidade, preco) 
values ("uva",1200, 30.00);
INSERT INTO tb_produtos(nome, quantidade, preco) 
values ("pêra",500, 2.99);

-- Seleciona tudo da tabela produtos
SELECT * FROM tb_produtos;

-- Seleciona apenas o nome:
SELECT nome FROM tb_produtos;

-- Seleciona nome e preco;
SELECT nome, preco FROM tb_produtos;

-- Seleciona um atributo cujo o id seja 1:
SELECT * FROM tb_produtos WHERE id = 1;

-- Utilizando operadores relacionais
SELECT * FROM tb_produtos WHERE PRECO > 5.00;
SELECT * FROM tb_produtos WHERE PRECO < 5.00;
SELECT * FROM tb_produtos WHERE PRECO = 12.00;

-- WHERE com operadores lógicos
SELECT * FROM tb_produtos WHERE preco > 5.00 AND quantidade < 100;
SELECT * FROM tb_produtos WHERE preco > 10.00 AND quantidade < 900;

-- Desabilitando o modo seguro de atualização do SQL:
SET SQL_SAFE_UPDATES = 0;
-- Assim eu consigo utilizar os comandos UPDATES;

-- Para habilitar o modo seguro novamente, utilize a instrução abaixo:
SET SQL_SAFE_UPDATES = 1;

UPDATE tb_produtos SET preco = 5.00 WHERE ID = 1;
SELECT * FROM tb_produtos WHERE id = 1;

-- Apagando	dados na Tabela
DELETE FROM tb_produtos WHERE ID = 2;

SELECT * FROM tb_produtos;

-- Començado a mexer com DDL -> Linguagem de defininção de dados
ALTER TABLE tb_produtos MODIFY PRECO decimal(6,2);

SELECT * FROM tb_produtos;

-- Adicionando um atributo
ALTER TABLE tb_produtos ADD descricao varchar(255);

SELECT * FROM tb_produtos;

-- Eliminando um atributo:
ALTER TABLE tb_produtos DROP descricao;

SELECT * FROM tb_produtos;

-- Para alterar o nome de um Atributo/Coluna da tabela:
ALTER TABLE tb_produtos CHANGE nome nomeProduto VARCHAR(255);
ALTER TABLE tb_produtos CHANGE nomeProduto nome VARCHAR(255);

-- Ordenando de forma ascendente:
SELECT * FROM tb_produtos ORDER BY nome ASC;

-- Selecionando dados dentro de um determinado valor:
SELECT * FROM tb_produtos WHERE preco BETWEEN 3.00 AND 12.00;

-- Para buscar dados com um texto específico.
-- Neste caso estou buscando os textos que possuem a letra 'l':
SELECT * FROM tb_produtos WHERE nome LIKE "l%";



 


