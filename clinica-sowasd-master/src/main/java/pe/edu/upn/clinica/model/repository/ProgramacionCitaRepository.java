package pe.edu.upn.clinica.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upn.clinica.model.entity.ProgramacionCita;
@Repository
public interface ProgramacionCitaRepository extends JpaRepository<ProgramacionCita, String> {

}
