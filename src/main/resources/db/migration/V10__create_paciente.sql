CREATE TABLE paciente (
    id INT PRIMARY KEY,

    profissao VARCHAR(100),

    CONSTRAINT fk_paciente_papel
        FOREIGN KEY (id)
        REFERENCES papel(id)
        ON DELETE CASCADE
);