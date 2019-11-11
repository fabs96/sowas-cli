package pe.edu.upn.clinica.model.entity;

import java.util.ArrayList;
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
import javax.persistence.Table;

@Entity
@Table(name = "horarioatencion")
public class HorarioAtencion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "horario_id")
	private Integer id;

	@Column(name = "dia")
	private Integer dia;

	@Column(name = "Hora")
	private Integer hora;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "clinica")
	private Clinica clinica;
	
	@OneToMany(mappedBy = "horarioAtencion",fetch = FetchType.LAZY)
	private List<Paciente> pacientes;
	
	public HorarioAtencion() {
		pacientes = new ArrayList<>();
	}
	
	public void addPacientes(Paciente paciente) {
		paciente.setHorarioAtencion(this);
		pacientes.add(paciente);
	}
	public Integer getDia() {
		return dia;
	}

	public void setDia(Integer dia) {
		this.dia = dia;
	}

	public Integer getHora() {
		return hora;
	}

	public void setHora(Integer hora) {
		this.hora = hora;
	}

	public Clinica getClinica() {
		return clinica;
	}

	public void setClinica(Clinica clinica) {
		this.clinica = clinica;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
