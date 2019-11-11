package pe.edu.upn.clinica.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upn.clinica.model.entity.Cita;
import pe.edu.upn.clinica.model.entity.TipoAtencion;
import pe.edu.upn.clinica.model.repository.TIpoAtencionRepository;
import pe.edu.upn.clinica.service.TipoAtencionService;

@Service
public class TipoAtencionServiceImpl implements TipoAtencionService {
	@Autowired
	private TIpoAtencionRepository tipoAtencionRepository;
	@Transactional(readOnly=true)
	@Override
	public List<TipoAtencion> findAll() throws Exception {
		// TODO Auto-generated method stub
		return tipoAtencionRepository.findAll();
	}
	@Transactional(readOnly=true)
	@Override
	public Optional<TipoAtencion> findById(String id) throws Exception {
		// TODO Auto-generated method stub
		return tipoAtencionRepository.findById(id);
	}
	@Transactional
	@Override
	public TipoAtencion save(TipoAtencion entity) throws Exception {
		// TODO Auto-generated method stub
		return tipoAtencionRepository.save(entity);
	}
	@Transactional
	@Override
	public TipoAtencion update(TipoAtencion entity) throws Exception {
		// TODO Auto-generated method stub
		return tipoAtencionRepository.save(entity);
	}
	@Transactional
	@Override
	public void deleteById(String id) throws Exception {
		// TODO Auto-generated method stub
		tipoAtencionRepository.deleteById(id);
	}
	@Transactional
	@Override
	public void deleteAll() throws Exception {
		// TODO Auto-generated method stub
		tipoAtencionRepository.deleteAll();
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
