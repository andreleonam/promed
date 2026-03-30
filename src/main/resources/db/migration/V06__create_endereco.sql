CREATE TABLE endereco (
    id INTEGER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    logradouro VARCHAR(150) NOT NULL,
    numero VARCHAR(10) NOT NULL,
    complemento VARCHAR(100),
    bairro VARCHAR(100) NOT NULL,
    cep VARCHAR(8) NOT NULL,

    cidade_id INT NOT NULL,
    pessoa_id INT UNIQUE,

    CONSTRAINT fk_endereco_cidade
        FOREIGN KEY (cidade_id)
        REFERENCES cidade(id),

    CONSTRAINT fk_endereco_pessoa
        FOREIGN KEY (pessoa_id)
        REFERENCES pessoa(id)
);