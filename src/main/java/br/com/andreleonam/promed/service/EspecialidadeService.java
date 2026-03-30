package br.com.andreleonam.promed.service;

import org.springframework.stereotype.Service;

import br.com.andreleonam.promed.domain.entity.Especialidade;
import br.com.andreleonam.promed.repository.EspecialidadeRepository;

@Service
public class EspecialidadeService {

    private final EspecialidadeRepository repository;

    public EspecialidadeService(EspecialidadeRepository repository) {
        this.repository = repository;
    }

    public Especialidade criar(Especialidade especialidade) {
        return repository.save(especialidade);
    }
}
