package br.com.andreleonam.promed.domain.entity;

import br.com.andreleonam.promed.domain.enums.TipoTelefone;
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
@Table(name = "telefone",
       uniqueConstraints = {
           @UniqueConstraint(name = "uk_telefone_pessoa_numero",
                   columnNames = {"pessoa_id", "ddd", "numero"})
       })
public class Telefone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 3, nullable = false)
    private String ddd;

    @Column(length = 15, nullable = false)
    private String numero;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private TipoTelefone tipo;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "pessoa_id", nullable = false)
    private Pessoa pessoa;

    // ================= CONSTRUTORES =================

    public Telefone() {
    }

    public Telefone(Integer id, String ddd, String numero, TipoTelefone tipo, Pessoa pessoa) {
        this.id = id;
        this.ddd = ddd;
        this.numero = numero;
        this.tipo = tipo;
        this.pessoa = pessoa;
    }

    // ================= GETTERS / SETTERS =================

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        if (ddd != null) {
            ddd = ddd.replaceAll("\\D", "");
        }
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        if (numero != null) {
            numero = numero.replaceAll("\\D", "");
        }
        this.numero = numero;
    }

    public TipoTelefone getTipo() {
        return tipo;
    }

    public void setTipo(TipoTelefone tipo) {
        this.tipo = tipo;
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
        if (!(o instanceof Telefone)) return false;
        Telefone that = (Telefone) o;
        return id != null && id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}