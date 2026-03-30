package br.com.andreleonam.promed.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
}
