CREATE TABLE papel (
    id INTEGER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,

    pessoa_id INT NOT NULL,

    CONSTRAINT fk_papel_pessoa
        FOREIGN KEY (pessoa_id)
        REFERENCES pessoa(id)
);