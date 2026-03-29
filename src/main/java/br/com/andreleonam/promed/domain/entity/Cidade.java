package br.com.andreleonam.promed.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "cidade")
public class Cidade {

	@Id
	@Column(name = "codigo")
	private Integer codigo;

	@Column(name = "nome")
	private String nome;

	@ManyToOne
	@JoinColumn(name = "estado_id")
	private Estado estado;

	public Cidade() {
	}

	public Cidade(Integer codigo, String nome, Estado estado) {
		this.codigo = codigo;
		this.nome = nome;
		this.estado = estado;
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

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof Cidade))
			return false;
		Cidade that = (Cidade) o;
		return codigo != null && codigo.equals(that.codigo);
	}

	@Override
	public int hashCode() {
		return getClass().hashCode();
	}
}
