CREATE TABLE especialidade (
    id INTEGER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,

    nome VARCHAR(100) NOT NULL,

    CONSTRAINT uk_especialidade_nome UNIQUE (nome)
);