package pe.edu.upn.clinica.model.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "paciente")
public class Paciente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer id;

	@Column(name = "nom_paciente", length = 25, nullable = false)
	private String nombre;

	@Column(name = "fec_nac_paciente")
	@Temporal(TemporalType.DATE)
	private Date fechaNacimiento;

	@Column(name = "dir_paciente", length = 50, nullable = true)
	private String direccion;

	@Column(name = "telefono")
	private Integer telefono;

	@Column(name = "genero")
	private String genero;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cita_id")
	private Cita cita;

	@OneToMany(mappedBy = "paciente", fetch = FetchType.LAZY)
	private List<Doctor> doctores;

	@OneToMany(mappedBy = "paciente", fetch = FetchType.LAZY)
	private List<ResultadoLaboratorio> resultados;

	@OneToOne
	private Farmacia farmacia;
	
	@OneToOne
	private Usuario usuario;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "horario_atencion")
	private HorarioAtencion horarioAtencion;
	
	

	public Paciente() {
		doctores = new ArrayList<>();
	}

	public void addDoctor(Doctor doctor) {
		doctor.setPaciente(this);
		doctores.add(doctor);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
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

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Cita getCita() {
		return cita;
	}

	public void setCita(Cita cita) {
		this.cita = cita;
	}

	public List<Doctor> getDoctores() {
		return doctores;
	}

	public void setDoctores(List<Doctor> doctores) {
		this.doctores = doctores;
	}

	public void setHorarioAtencion(HorarioAtencion horarioAtencion) {
		// TODO Auto-generated method stub
		this.horarioAtencion = horarioAtencion;
		
	}

}
