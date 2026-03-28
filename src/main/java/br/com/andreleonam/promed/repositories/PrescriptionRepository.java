package br.com.andreleonam.promed.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.andreleonam.promed.domain.Prescription;

@Repository
public interface PrescriptionRepository extends JpaRepository<Prescription, Integer>{

}
