CREATE TABLE funcionario (
    id INT PRIMARY KEY,

    cargo VARCHAR(100),
    data_admissao DATE,
    data_desligamento DATE,

    CONSTRAINT fk_funcionario_papel
        FOREIGN KEY (id)
        REFERENCES papel(id)
        ON DELETE CASCADE
);