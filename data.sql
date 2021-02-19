INSERT INTO CADASTRO(nome, email, cpf, data_nascimento, senha) 
VALUES('José', 'jose@gmail.com', '12312312312', '1990-01-01', '1234');
INSERT INTO CADASTRO(nome, email, cpf, data_nascimento, senha)
VALUES('Maria', 'maria@gmail.com', '32132131232', '1990-02-01', '1234');
INSERT INTO CADASTRO(nome, email, cpf, data_nascimento, senha)
VALUES('Pedro', 'pedro@gmail.com', '43243243243', '1990-03-01', '4321');

INSERT INTO VACINA(nome, cadastro_id, data_aplicacao, local_aplicacao)
VALUES('vacina1', '1', '2021-01-01 00:10', 'local1');
INSERT INTO VACINA(nome, cadastro_id, data_aplicacao, local_aplicacao)
VALUES('vacina1', '2', '2021-01-01 01:10', 'local2');
INSERT INTO VACINA(nome, cadastro_id, data_aplicacao, local_aplicacao)
VALUES('vacina2', '3', '2021-01-02 12:10', 'local3');