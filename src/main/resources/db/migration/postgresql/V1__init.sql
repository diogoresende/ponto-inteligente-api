CREATE TABLE empresa (
    id bigserial not null,
    cnpj character varying(255) not null,
    data_atualizacao timestamp  not null,
    data_criacao timestamp  not null,
    razao_social character varying(255) not null,
    PRIMARY KEY (id)
);

CREATE TABLE funcionario (
    id bigserial not null,
    cpf character varying(255) not null,
    data_atualizacao timestamp  not null,
    data_criacao timestamp  not null,
    email character varying(255) not null,
    nome character varying(255) not null,
    perfil character varying(255) not null,
    qtd_horas_almoco float default null,
    qtd_horas_trabalho_dia float default null,
    senha character varying(255) not null,
    valor_hora numeric(19,2) default null,
    empresa_id bigint default null,
    PRIMARY KEY (id),
    FOREIGN KEY (empresa_id) REFERENCES empresa (id)
);

CREATE TABLE lancamento (
    id bigserial not null,
    data timestamp  not null,
    data_atualizacao timestamp  not null,
    data_criacao timestamp  not null,
    descricao character varying(255) default null,
    localizacao character varying(255) default null,
    tipo character varying(255) not null,
    funcionario_id bigint default null,
    PRIMARY KEY (id),
    FOREIGN KEY (funcionario_id) REFERENCES funcionario (id)
);




