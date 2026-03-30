CREATE TABLE telefone (
    id INTEGER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,

    ddd VARCHAR(3) NOT NULL,
    numero VARCHAR(15) NOT NULL,
    tipo VARCHAR(20) NOT NULL,

    pessoa_id INT NOT NULL,

    CONSTRAINT fk_telefone_pessoa
        FOREIGN KEY (pessoa_id)
        REFERENCES pessoa(id),

    CONSTRAINT uk_telefone_pessoa_numero
        UNIQUE (pessoa_id, ddd, numero)
);