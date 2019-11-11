package pe.edu.upn.clinica.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upn.clinica.model.entity.Cita;
import pe.edu.upn.clinica.model.entity.Clinica;
import pe.edu.upn.clinica.model.repository.ClinicaRepository;
import pe.edu.upn.clinica.service.ClinicaService;


@Service
public class ClinicaServiceImpl implements ClinicaService{

	@Autowired
	private ClinicaRepository clinicaRepository;
	
	
	@Transactional
	@Override
	public void deleteAll() throws Exception {
		// TODO Auto-generated method stub
		clinicaRepository.deleteAll();
		
	}
	@Override
	public Optional<Clinica> findById(String id) throws Exception {
		// TODO Auto-generated method stub
		return clinicaRepository.findById(id);
	}
	@Override
	public Clinica save(Clinica entity) throws Exception {
		// TODO Auto-generated method stub
		return clinicaRepository.save(entity);
	}
	@Override
	public Clinica update(Clinica entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void deleteById(String id) throws Exception {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<Clinica> findAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
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
