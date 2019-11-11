package pe.edu.upn.clinica.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upn.clinica.model.entity.Cita;
import pe.edu.upn.clinica.model.entity.ProgramacionCita;
import pe.edu.upn.clinica.model.repository.ProgramacionCitaRepository;
import pe.edu.upn.clinica.service.ProgramacionCitaService;

@Service
public class ProgramacionCitaServiceImpl implements ProgramacionCitaService {
	@Autowired
	private ProgramacionCitaRepository programacionCitaRepository;
	@Transactional(readOnly=true)
	@Override
	public List<ProgramacionCita> findAll() throws Exception {
		// TODO Auto-generated method stub
		return programacionCitaRepository.findAll();
	}
	@Transactional(readOnly=true)
	@Override
	public Optional<ProgramacionCita> findById(String id) throws Exception {
		// TODO Auto-generated method stub
		return programacionCitaRepository.findById(id);
	}
	@Transactional
	@Override
	public ProgramacionCita save(ProgramacionCita entity) throws Exception {
		// TODO Auto-generated method stub
		return programacionCitaRepository.save(entity);
	}
	@Transactional
	@Override
	public ProgramacionCita update(ProgramacionCita entity) throws Exception {
		// TODO Auto-generated method stub
		return programacionCitaRepository.save(entity);
	}
	@Transactional
	@Override
	public void deleteById(String id) throws Exception {
		// TODO Auto-generated method stub
		programacionCitaRepository.deleteById(id);
	}
	@Transactional
	@Override
	public void deleteAll() throws Exception {
		// TODO Auto-generated method stub
		programacionCitaRepository.deleteAll();
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
