package pe.edu.upn.clinica.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upn.clinica.model.entity.Cita;
import pe.edu.upn.clinica.model.entity.Paciente;
import pe.edu.upn.clinica.model.repository.PacienteRepository;
import pe.edu.upn.clinica.service.PacienteService;

@Service
public class PacienteServiceImpl implements PacienteService {
	
	@Autowired
	private PacienteRepository pacienteRepository;
	
	@Transactional(readOnly=true)
	@Override
	public List<Paciente> findAll() throws Exception {
		// TODO Auto-generated method stub
		return pacienteRepository.findAll();
	}
	@Transactional(readOnly=true)
	@Override
	public Optional<Paciente> findById(String id) throws Exception {
		// TODO Auto-generated method stub
		return pacienteRepository.findById(id);
	}
	@Transactional
	@Override
	public Paciente save(Paciente entity) throws Exception {
		// TODO Auto-generated method stub
		return pacienteRepository.save(entity);
	}
	@Transactional
	@Override
	public Paciente update(Paciente entity) throws Exception {
		// TODO Auto-generated method stub
		return pacienteRepository.save(entity);
	}
	@Transactional
	@Override
	public void deleteById(String id) throws Exception {
		// TODO Auto-generated method stub
		pacienteRepository.deleteById(id);
	}
	@Transactional
	@Override
	public void deleteAll() throws Exception {
		// TODO Auto-generated method stub
		pacienteRepository.deleteAll();
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
