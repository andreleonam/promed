package br.com.andreleonam.promed.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.andreleonam.promed.domain.entity.Especialidade;

//repository/EspecialidadeRepository.java
public interface EspecialidadeRepository extends JpaRepository<Especialidade, Integer> {
}
