CREATE TABLE pessoa (
    id INTEGER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,

    nome VARCHAR(150) NOT NULL,
    data_nascimento DATE,

    estado_civil VARCHAR(20),
    escolaridade VARCHAR(30),
    status_cadastro VARCHAR(20),
    tipo_prioridade VARCHAR(20),

    email VARCHAR(150),

    cpf VARCHAR(11),
    rg VARCHAR(20),
    orgao_expedidor VARCHAR(20),

    CONSTRAINT uk_pessoa_cpf UNIQUE (cpf)
);