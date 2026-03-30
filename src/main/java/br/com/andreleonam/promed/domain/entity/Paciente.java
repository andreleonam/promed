package br.com.andreleonam.promed.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "paciente")
public class Paciente extends Papel {

    @Column(length = 100)
    private String profissao;

    // ================= CONSTRUTORES =================

    public Paciente() {
    }

    public Paciente(Integer id, Pessoa pessoa, String profissao) {
        super(id, pessoa);
        this.profissao = profissao;
    }

    // ================= GETTERS / SETTERS =================

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
}