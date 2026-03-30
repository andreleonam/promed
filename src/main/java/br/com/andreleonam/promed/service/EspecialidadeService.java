package br.com.andreleonam.promed.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.andreleonam.promed.domain.entity.Especialidade;
import br.com.andreleonam.promed.exception.ResourceNotFoundException;
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
    
    public List<Especialidade> listar() {
        return repository.findAll();
    }
    
    public Especialidade buscarPorId(Integer id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Especialidade não encontrada"));
    }
}
