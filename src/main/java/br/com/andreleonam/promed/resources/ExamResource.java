package br.com.andreleonam.promed.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.andreleonam.promed.domain.Exam;
import br.com.andreleonam.promed.services.ExamService;

@RestController
@RequestMapping(value="/exams")
public class ExamResource {

	@Autowired
	private ExamService service;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Exam obj = service.find(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
