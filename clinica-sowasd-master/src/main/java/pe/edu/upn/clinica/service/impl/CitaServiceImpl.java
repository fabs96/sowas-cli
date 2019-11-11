package pe.edu.upn.clinica.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upn.clinica.model.entity.Cita;
import pe.edu.upn.clinica.model.entity.Clinica;
import pe.edu.upn.clinica.model.repository.CitaRepository;
import pe.edu.upn.clinica.model.repository.ClinicaRepository;
import pe.edu.upn.clinica.service.CitaService;
import pe.edu.upn.clinica.service.ClinicaService;

@Service
public class CitaServiceImpl implements CitaService {
	
	@Autowired
	private CitaRepository citaRepository;
	
    @Transactional(readOnly=true)
	@Override
	public List<Cita> findAll() throws Exception {
		// TODO Auto-generated method stub
		return citaRepository.findAll();
	}
    @Transactional(readOnly=true)
	@Override
	public Optional<Cita> findById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return citaRepository.findById(id);
	}
    @Transactional
	@Override
	public Cita save(Cita entity) throws Exception {
		// TODO Auto-generated method stub
		return citaRepository.save(entity);
	}
    @Transactional
	@Override
	public Cita update(Cita entity) throws Exception {
		// TODO Auto-generated method stub
		return citaRepository.save(entity);
	}
    @Transactional
	@Override
	public void deleteById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		citaRepository.deleteById(id);
	}
    @Transactional
	@Override
	public void deleteAll() throws Exception {
		// TODO Auto-generated method stub
		citaRepository.deleteAll();
	}
	@Override
	public Optional<Cita> findById(String id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void deleteById(String id) throws Exception {
		// TODO Auto-generated method stub
		
	}
	

}
