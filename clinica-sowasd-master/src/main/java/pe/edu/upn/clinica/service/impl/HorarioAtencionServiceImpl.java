package pe.edu.upn.clinica.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upn.clinica.model.entity.Cita;
import pe.edu.upn.clinica.model.entity.HorarioAtencion;
import pe.edu.upn.clinica.model.repository.HorarioAtencionRepository;
import pe.edu.upn.clinica.service.HorarioAtencionService;


@Service
public class HorarioAtencionServiceImpl implements HorarioAtencionService{
	@Autowired
	private HorarioAtencionRepository horarioAtencionRepository;
	@Transactional(readOnly=true)
	@Override
	public List<HorarioAtencion> findAll() throws Exception {
		// TODO Auto-generated method stub
		return horarioAtencionRepository.findAll();
	}
	@Transactional(readOnly=true)
	@Override
	public Optional<HorarioAtencion> findById(String id) throws Exception {
		// TODO Auto-generated method stub
		return horarioAtencionRepository.findById(id);
	}
	@Transactional
	@Override
	public HorarioAtencion save(HorarioAtencion entity) throws Exception {
		// TODO Auto-generated method stub
		return horarioAtencionRepository.save(entity);
	}
	@Transactional
	@Override
	public HorarioAtencion update(HorarioAtencion entity) throws Exception {
		// TODO Auto-generated method stub
		return horarioAtencionRepository.save(entity);
	}
	@Transactional
	@Override
	public void deleteById(String id) throws Exception {
		// TODO Auto-generated method stub
		horarioAtencionRepository.deleteById(id);
	}
	@Transactional
	@Override
	public void deleteAll() throws Exception {
		// TODO Auto-generated method stub
		horarioAtencionRepository.deleteAll();
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
