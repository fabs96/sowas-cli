package pe.edu.upn.clinica.service;

import java.util.List;
import java.util.Optional;

import pe.edu.upn.clinica.model.entity.Usuario;

public interface UsuarioService extends Crudservice<Usuario, Long> {

	List<Usuario> findAll() throws Exception;

	Optional<Usuario> findByUsername(String username);
 
}
