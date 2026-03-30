package br.com.andreleonam.promed.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "papel")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Papel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "pessoa_id", nullable = false)
    private Pessoa pessoa;

    // ================= CONSTRUTORES =================

    public Papel() {
    }

    public Papel(Integer id, Pessoa pessoa) {
        this.id = id;
        this.pessoa = pessoa;
    }

    // ================= GETTERS / SETTERS =================

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    // ================= EQUALS / HASHCODE =================

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Papel)) return false;
        Papel that = (Papel) o;
        return id != null && id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}