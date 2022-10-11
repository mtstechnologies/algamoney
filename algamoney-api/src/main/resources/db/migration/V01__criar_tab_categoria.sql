CREATE TABLE categoria (
	codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO categoria (nome) values ('Lazer');
INSERT INTO categoria (nome) values ('Informática');
INSERT INTO categoria (nome) values ('Eletrodomésticos');
INSERT INTO categoria (nome) values ('Eletronicos');
INSERT INTO categoria (nome) values ('Cama e Mesa');
INSERT INTO categoria (nome) values ('Alimentação');
INSERT INTO categoria (nome) values ('Outros');