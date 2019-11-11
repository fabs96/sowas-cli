package pe.edu.upn.clinica.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upn.clinica.model.entity.Cita;
import pe.edu.upn.clinica.model.entity.Clinica;

@Repository
public interface ClinicaRepository 	extends JpaRepository<Clinica, String> {

}
