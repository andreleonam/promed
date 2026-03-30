CREATE TABLE medico (
    id INT PRIMARY KEY,

    crm VARCHAR(20) NOT NULL,

    CONSTRAINT fk_medico_funcionario
        FOREIGN KEY (id)
        REFERENCES funcionario(id)
        ON DELETE CASCADE
);