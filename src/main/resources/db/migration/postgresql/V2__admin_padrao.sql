INSERT INTO empresa (id, cnpj, data_atualizacao, data_criacao, razao_social)
VALUES (1, '85550058000161', CURRENT_DATE, CURRENT_DATE, 'Resende IT');

INSERT INTO funcionario (id, cpf, data_atualizacao, data_criacao, email, nome,
perfil, qtd_horas_almoco, qtd_horas_trabalho_dia, senha, valor_hora, empresa_id)
VALUES (1, '01440746133', CURRENT_DATE, CURRENT_DATE, 'diogo.resende@resende.com', 'ADMIN', 'ROLE_ADMIN', NULL, NULL,
'$2a$10$K/HxILiEdJZ0lUgingrTWeauQCJeK.Z3mUKuGxkQLtVDiY/IFkgxe', NULL,
(SELECT id FROM empresa WHERE cnpj = '85550058000161'));
