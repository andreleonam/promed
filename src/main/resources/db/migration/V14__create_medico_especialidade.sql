CREATE TABLE medico_especialidade (
    id INTEGER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,

    medico_id INT NOT NULL,
    especialidade_id INT NOT NULL,

    titulo VARCHAR(30),
    descricao_titulo VARCHAR(255),
    data_obtencao DATE,

    CONSTRAINT fk_me_medico
        FOREIGN KEY (medico_id)
        REFERENCES medico(id)
        ON DELETE CASCADE,

    CONSTRAINT fk_me_especialidade
        FOREIGN KEY (especialidade_id)
        REFERENCES especialidade(id)
        ON DELETE CASCADE,

    CONSTRAINT uk_medico_especialidade
        UNIQUE (medico_id, especialidade_id)
);