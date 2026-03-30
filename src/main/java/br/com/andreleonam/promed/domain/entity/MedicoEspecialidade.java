package br.com.andreleonam.promed.domain.entity;

import java.time.LocalDate;

import br.com.andreleonam.promed.domain.enums.TituloEspecialidade;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "medico_especialidade",
       uniqueConstraints = {
           @UniqueConstraint(name = "uk_medico_especialidade",
                   columnNames = {"medico_id", "especialidade_id"})
       })
public class MedicoEspecialidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "medico_id", nullable = false)
    private Medico medico;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "especialidade_id", nullable = false)
    private Especialidade especialidade;

    @Enumerated(EnumType.STRING)
    @Column(length = 30)
    private TituloEspecialidade titulo;

    @Column(name = "descricao_titulo", length = 255)
    private String descricaoTitulo;

    @Column(name = "data_obtencao")
    private LocalDate dataObtencao;

    // ================= CONSTRUTORES =================

    public MedicoEspecialidade() {
    }

    public MedicoEspecialidade(Medico medico, Especialidade especialidade) {
        this.medico = medico;
        this.especialidade = especialidade;
    }

    // ================= GETTERS / SETTERS =================

    public Integer getId() {
        return id;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Especialidade getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }

    public TituloEspecialidade getTitulo() {
        return titulo;
    }

    public void setTitulo(TituloEspecialidade titulo) {
        this.titulo = titulo;
    }

    public String getDescricaoTitulo() {
        return descricaoTitulo;
    }

    public void setDescricaoTitulo(String descricaoTitulo) {
        this.descricaoTitulo = descricaoTitulo;
    }

    public LocalDate getDataObtencao() {
        return dataObtencao;
    }

    public void setDataObtencao(LocalDate dataObtencao) {
        this.dataObtencao = dataObtencao;
    }

    // ================= EQUALS / HASHCODE =================

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MedicoEspecialidade)) return false;
        MedicoEspecialidade that = (MedicoEspecialidade) o;
        return id != null && id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}