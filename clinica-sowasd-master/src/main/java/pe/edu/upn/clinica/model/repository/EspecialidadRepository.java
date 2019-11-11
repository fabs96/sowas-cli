package pe.edu.upn.clinica.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upn.clinica.model.entity.Clinica;
import pe.edu.upn.clinica.model.entity.Especialidad;

@Repository
public interface EspecialidadRepository 
	extends JpaRepository<Especialidad, String> {

}
