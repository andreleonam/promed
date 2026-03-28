package br.com.andreleonam.promed.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.andreleonam.promed.domain.Exam;
import br.com.andreleonam.promed.repositories.ExamRepository;

@Service
public class ExamService {

	@Autowired
	private ExamRepository repo;
	
	public Exam find(Integer id) {
		Optional<Exam> obj = repo.findById(id);
		return obj.orElse(null);
	}	
}
