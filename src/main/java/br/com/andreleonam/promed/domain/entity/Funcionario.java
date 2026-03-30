package br.com.andreleonam.promed.domain.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "funcionario")
public class Funcionario extends Papel {

    @Column(length = 100)
    private String cargo;

    @Column(name = "data_admissao")
    private LocalDate dataAdmissao;

    @Column(name = "data_desligamento")
    private LocalDate dataDesligamento;

    // ================= CONSTRUTORES =================

    public Funcionario() {
    }

    public Funcionario(Integer id, Pessoa pessoa, String cargo) {
        super(id, pessoa);
        this.cargo = cargo;
    }

    // ================= GETTERS / SETTERS =================

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public LocalDate getDataDesligamento() {
        return dataDesligamento;
    }

    public void setDataDesligamento(LocalDate dataDesligamento) {
        this.dataDesligamento = dataDesligamento;
    }
}