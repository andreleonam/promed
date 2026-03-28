package br.com.andreleonam.promed.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.andreleonam.promed.domain.Medicine;
import br.com.andreleonam.promed.services.MedicineService;

@RestController
@RequestMapping(value="/medicines")
public class MedicineResource {

	@Autowired
	private MedicineService service;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Medicine obj = service.find(id);
		return ResponseEntity.ok().body(obj);
	}
}	
