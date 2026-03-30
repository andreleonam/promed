CREATE TABLE cidade (
    id INTEGER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    estado_id INT NOT NULL,

    CONSTRAINT fk_cidade_estado
        FOREIGN KEY (estado_id)
        REFERENCES estado(id),

    CONSTRAINT unique_cidade_estado
        UNIQUE (nome, estado_id)
);