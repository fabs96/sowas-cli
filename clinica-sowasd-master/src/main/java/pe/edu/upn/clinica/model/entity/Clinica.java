package pe.edu.upn.clinica.model.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;

import javax.persistence.Table;

@Entity
@Table(name = "clinica")
public class Clinica {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "clinica_id")
	private Integer id;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "dir_paciente", length = 50, nullable = true)
	private String direccion;

	@Column(name = "Telefono")
	private Integer telefono;

	@OneToMany(mappedBy = "clinica")
	private List<HorarioAtencion> horarioatenciones;

	public Clinica() {
		horarioatenciones = new ArrayList<>();
	}

	public void addPacientes(HorarioAtencion horarioatencion) {
		horarioatencion.setClinica(this);
		horarioatenciones.add(horarioatencion);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<HorarioAtencion> getHorariosatencion() {
		return horarioatenciones;
	}

	public void setHorariosatencion(List<HorarioAtencion> horariosatencion) {
		this.horarioatenciones = horariosatencion;
	}

}
