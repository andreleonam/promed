package br.com.andreleonam.promed.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.andreleonam.promed.domain.dto.EspecialidadeRequestDTO;
import br.com.andreleonam.promed.domain.dto.EspecialidadeResponseDTO;
import br.com.andreleonam.promed.domain.entity.Especialidade;
import br.com.andreleonam.promed.service.EspecialidadeService;

@RestController
@RequestMapping("/api/v1/especialidades")
public class EspecialidadeController {

    private final EspecialidadeService service;

    public EspecialidadeController(EspecialidadeService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<EspecialidadeResponseDTO> criar(@RequestBody EspecialidadeRequestDTO dto) {

        Especialidade especialidade = new Especialidade();
        especialidade.setNome(dto.getNome());

        Especialidade salva = service.criar(especialidade);

        EspecialidadeResponseDTO response =
                new EspecialidadeResponseDTO(salva.getId(), salva.getNome());

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
    
    @GetMapping
    public ResponseEntity<List<EspecialidadeResponseDTO>> listar() {

        List<Especialidade> lista = service.listar();

        List<EspecialidadeResponseDTO> response = lista.stream()
                .map(e -> new EspecialidadeResponseDTO(e.getId(), e.getNome()))
                .toList();

        return ResponseEntity.ok(response);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<EspecialidadeResponseDTO> buscar(@PathVariable Integer id) {

        Especialidade esp = service.buscarPorId(id);

        EspecialidadeResponseDTO response =
                new EspecialidadeResponseDTO(esp.getId(), esp.getNome());

        return ResponseEntity.ok(response);
    }
}
