package pe.edu.upn.clinica.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.edu.upn.clinica.model.entity.Authority;

public interface AuthorityRepository extends JpaRepository<Authority, Long>{

}
