package pe.edu.upn.clinica.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import pe.edu.upn.clinica.model.entity.Cita;


@Repository
public interface CitaRepository extends JpaRepository<Cita, Integer> {
	
	

}
