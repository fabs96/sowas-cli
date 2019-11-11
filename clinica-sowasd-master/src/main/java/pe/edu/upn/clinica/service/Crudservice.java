package pe.edu.upn.clinica.service;

import java.util.List;
import java.util.Optional;

import pe.edu.upn.clinica.model.entity.Cita;

public interface Crudservice<T, ID> {
	List<T> findAll() throws Exception;
	Optional<T> findById( String id ) throws Exception;
	T save( T entity ) throws Exception;
	T update( T entity ) throws Exception;	
	void deleteById( String id ) throws Exception;
	void deleteAll() throws Exception;
	void deleteById(Integer id) throws Exception;
	Optional<Cita> findById(Integer id) throws Exception;
}