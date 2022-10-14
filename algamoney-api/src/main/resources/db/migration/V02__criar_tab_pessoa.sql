CREATE TABLE pessoa (
	codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(50) NOT NULL,
	logradouro VARCHAR(50),
	numero VARCHAR(10),
	complemento VARCHAR(50),
	bairro VARCHAR(50),
	cep VARCHAR(20),
	cidade VARCHAR(50),
	estado VARCHAR(3)
	
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


INSERT INTO pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado) 
values ('Maria', 'Ruas das Acácias', '11', 'proximo a praça', 'Dom Pedro', '69037042', 'Manaus', 'AM');


