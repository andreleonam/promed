CREATE TABLE documento (
    id INTEGER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,

    numero VARCHAR(50) NOT NULL,
    tipo_documento VARCHAR(30) NOT NULL,
    observacao VARCHAR(255),

    pessoa_id INT NOT NULL,

    CONSTRAINT fk_documento_pessoa
        FOREIGN KEY (pessoa_id)
        REFERENCES pessoa(id),

    CONSTRAINT uk_documento_numero_tipo
        UNIQUE (numero, tipo_documento)
);