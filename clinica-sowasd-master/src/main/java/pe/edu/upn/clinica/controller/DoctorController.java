package pe.edu.upn.clinica.controller;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import pe.edu.upn.clinica.model.entity.Doctor;
import pe.edu.upn.clinica.model.entity.Especialidad;
import pe.edu.upn.clinica.model.entity.Paciente;
import pe.edu.upn.clinica.service.DoctorService;
import pe.edu.upn.clinica.service.EspecialidadService;
import pe.edu.upn.clinica.service.PacienteService;


@Controller
@RequestMapping("/doctor")
@SessionAttributes( {"doctor", "paciente" } )
public class DoctorController {

	@Autowired
	private DoctorService doctorService;
	
	@Autowired
	private EspecialidadService especialidadService;
	
	@Autowired
	private PacienteService pacienteService;
	
	@GetMapping
	public String inicio(Model model) {
		try {
			List<Doctor> doctores = doctorService.findAll();
			model.addAttribute("doctores", doctores);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "/doctor/inicio";
	}
	
	@GetMapping("/edit/{id}")
	public String editar(@PathVariable("id") String id, Model model) {
		try {
			Optional<Doctor> optional = doctorService.findById(id);
			if (optional.isPresent()) {
				
				List<Especialidad> especialidades 
					= especialidadService.findAll(); 
				
				model.addAttribute("medico", optional.get());
				model.addAttribute("especialidades", especialidades);
			} else {
				return "redirect:/medico";
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return "/medico/edit";
	}
	@PostMapping("/save")
	public String save(@ModelAttribute("doctor") Doctor doctor, 
			Model model, SessionStatus status) {
		try {
			doctorService.save(doctor);
			status.setComplete();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "redirect:/doctor";
	}
	@GetMapping("/nuevo")
	public String nuevo(Model model) {
		Doctor doctor = new Doctor();
		model.addAttribute("doctor", doctor);
		try {
			List<Paciente> paciente = 
					pacienteService.findAll();
			model.addAttribute("paciente", paciente);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "/doctor/nuevo";
	}
	@GetMapping("/del/{id}")
	public String eliminar(@PathVariable("id") String id, Model model) {
		try {
			Optional<Doctor> doctor = doctorService.findById(id);
			if(doctor.isPresent()) {
				doctorService.deleteById(id);
			}
		} catch (Exception e) {
			
			model.addAttribute("dangerDel", "ERROR - Violación contra el principio de Integridad referencia");
			try {
				List<Doctor> doctores = doctorService.findAll();
				model.addAttribute("doctores", doctores);
			} catch (Exception e2) {
				// TODO: handle exception
			} 
			return "/doctor/inicio";
		}
		return "redirect:/doctor";
	}
	@GetMapping("/info/{id}")
	public String info(@PathVariable("id") String id, Model model) {
		try {
			Optional<Doctor> doctor = doctorService.findById(id);
			if(doctor.isPresent()) {
				model.addAttribute("doctor", doctor.get());
			} else {
				return "redirect:/doctor";
			}
		} catch (Exception e) {

		}	
		
		return "/doctor/info";
	}
	

	
}























