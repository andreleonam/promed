package br.com.andreleonam.promed.domain.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "estado")
public class Estado {

    @Id
    @Column(name = "codigo")
    private Integer codigo;

    @Column(name = "nome")
    private String nome;

    @Column(name = "sigla")
    private String sigla;

    @OneToMany(mappedBy = "estado")
    private List<Cidade> cidades;

	public Estado() {
	}

	public Estado(Integer codigo, String nome, String sigla, List<Cidade> cidades) {
		this.codigo = codigo;
		this.nome = nome;
		this.sigla = sigla;
		this.cidades = cidades;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public List<Cidade> getCidades() {
		return cidades;
	}

	public void setCidades(List<Cidade> cidades) {
		this.cidades = cidades;
	}

	@Override
	public boolean equals(Object o) {
	    if (this == o) return true;
	    if (!(o instanceof Estado)) return false;
	    Estado that = (Estado) o;
	    return codigo != null && codigo.equals(that.codigo);
	}

	@Override
	public int hashCode() {
	    return getClass().hashCode();
	}
    
    
}
