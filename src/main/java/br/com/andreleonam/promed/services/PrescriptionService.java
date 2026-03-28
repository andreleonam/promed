package br.com.andreleonam.promed.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.andreleonam.promed.domain.Prescription;
import br.com.andreleonam.promed.repositories.PrescriptionRepository;

@Service
public class PrescriptionService {

	@Autowired
	private PrescriptionRepository repo;
	
	public Prescription find(Integer id) {
		Optional<Prescription> obj = repo.findById(id);
		return obj.orElse(null);
	}	
}

