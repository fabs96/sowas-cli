package pe.edu.upn.clinica.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name= "farmacia")
public class Farmacia {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="farmacia_id")
	private Integer id;
	
	@Column(name="productos")
	private String productos;
	
	 @OneToOne(mappedBy = "farmacia")
		private Paciente paciente;

	

	public String getProductos() {
		return productos;
	}

	public void setProductos(String productos) {
		this.productos = productos;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	

}
