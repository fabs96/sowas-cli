package pe.edu.upn.clinica.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upn.clinica.model.entity.Cita;
import pe.edu.upn.clinica.model.entity.Clinica;
import pe.edu.upn.clinica.model.entity.Especialidad;
import pe.edu.upn.clinica.model.repository.EspecialidadRepository;
import pe.edu.upn.clinica.service.EspecialidadService;

@Service
public class EspecialidadServiceImpl implements EspecialidadService{
	@Autowired
	private EspecialidadRepository especialidadRepository;
	@Transactional(readOnly=true)
	@Override
	public List<Especialidad> findAll() throws Exception {
		// TODO Auto-generated method stub
		return especialidadRepository.findAll();
	}
	@Transactional(readOnly=true)
	@Override
	public Optional<Especialidad> findById(String id) throws Exception {
		// TODO Auto-generated method stub
		return especialidadRepository.findById(id);
	}
	@Transactional
	@Override
	public Especialidad save(Especialidad entity) throws Exception {
		// TODO Auto-generated method stub
		return especialidadRepository.save(entity);
	}
	@Transactional
	@Override
	public Especialidad update(Especialidad entity) throws Exception {
		// TODO Auto-generated method stub
		return especialidadRepository.save(entity);
	}
	@Transactional
	@Override
	public void deleteById(String id) throws Exception {
		// TODO Auto-generated method stub
		especialidadRepository.deleteById(id);
	}
	@Transactional
	@Override
	public void deleteAll() throws Exception {
		// TODO Auto-generated method stub
		especialidadRepository.deleteAll();
	}
	@Override
	public void deleteById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Optional<Cita> findById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
