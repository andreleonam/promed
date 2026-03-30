package br.com.andreleonam.promed.domain.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "medico")
public class Medico extends Funcionario {

    @Column(length = 20, nullable = false)
    private String crm;

    @OneToMany(mappedBy = "medico", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<MedicoEspecialidade> especialidades;

    // ================= CONSTRUTORES =================

    public Medico() {
    }

    public Medico(Integer id, Pessoa pessoa, String crm) {
        super(id, pessoa, null);
        this.crm = crm;
    }

    // ================= GETTERS / SETTERS =================

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public List<MedicoEspecialidade> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(List<MedicoEspecialidade> especialidades) {
        this.especialidades = especialidades;
    }
}