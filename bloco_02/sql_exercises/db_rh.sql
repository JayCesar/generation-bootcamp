CREATE DATABASE db_rh;

USE db_rh;

CREATE TABLE tb_rh(
	id bigint auto_increment,
		nome varchar(255) not null,
        sobrenome varchar(255) not null,
		dataNascimento varchar(255) not null,
        bairro varchar(255) not null,
        salario decimal(6,2),
	PRIMARY KEY(id)
);

INSERT INTO tb_rh(nome, sobrenome, dataNascimento, bairro, salario) values ("Júlio", "Batista", "10/03/1998", "Ermelino Matarazzo", 3000.00);
INSERT INTO tb_rh(nome, sobrenome, dataNascimento, bairro, salario) values ("Amanda", "Cilene", "06/06/2003", "Tatuapé", 1800.00);
INSERT INTO tb_rh(nome, sobrenome, dataNascimento, bairro, salario) values ("Matheus", "Oliveira", "09/05/2000", "Patriarca", 1500.00);
INSERT INTO tb_rh(nome, sobrenome, dataNascimento, bairro, salario) values ("Antônio", "Almeida", "11/03/1993", "Guilhermina", 900.00);
INSERT INTO tb_rh(nome, sobrenome, dataNascimento, bairro, salario) values ("Geovana", "Pereira", "25/02/1995", "República", 600.00);
INSERT INTO tb_rh(nome, sobrenome, dataNascimento, bairro, salario) values ("Luciana", "Goncalves", "24/03/2000", "Luz", 200.00);

SELECT * FROM tb_rh;

SELECT * FROM tb_rh WHERE salario < 2000.00;

UPDATE tb_rh SET nome = "Liliam" WHERE id = 2;
UPDATE tb_rh SET nome = "Lucas" WHERE id = 3;
UPDATE tb_rh SET nome = "José" WHERE id = 4;

SELECT * FROM tb_rh;