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
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "doctor")
public class Doctor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
    private Integer id;
	
	@Column(name= "nombre")
    private String nombre;
    
	@Column(name= "genero")
    private String genero;
    
    @ManyToOne(fetch = FetchType.LAZY)
	 @JoinColumn(name = "doctor_id")
	private Paciente paciente;
    
    @OneToMany(mappedBy = "doctor", fetch = FetchType.LAZY)
	private List<Especialidad> especialidades;
    
    @OneToOne
    private Usuario usuario;
    
    public Doctor() {
		especialidades=new ArrayList<>();
	}
	public void addEspecialidad(Especialidad especialidad) {
		especialidad.setDoctor(this);
		especialidades.add(especialidad);
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public List<Especialidad> getEspecialidades() {
		return especialidades;
	}
	public void setEspecialidades(List<Especialidad> especialidades) {
		this.especialidades = especialidades;
	}
    

}
