package br.com.andreleonam.promed.domain.dto;

public class EspecialidadeResponseDTO {

    private Integer id;
    private String nome;

    public EspecialidadeResponseDTO(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
}
