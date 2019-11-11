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
@Table(name = "programacion")
public class ProgramacionCita {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="programa_id")
	private Integer id;
    
	@Column(name= "Fecha_cita")
	 private Integer fechacita;
	 
	 @OneToMany(mappedBy = "programacionCita", fetch = FetchType.LAZY)
		private List<TipoAtencion> tipoatenciones;
	 
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "cita")
		private Cita cita;

		 public ProgramacionCita() {
				tipoatenciones=new ArrayList<>();
			}
			public void addTipoAtencion(TipoAtencion tipoatencion) {
				tipoatencion.setProgramacionCita(this);
				tipoatenciones.add(tipoatencion);
			}

		public Integer getFechacita() {
			return fechacita;
		}

		public void setFechacita(Integer fechacita) {
			this.fechacita = fechacita;
		}

		public List<TipoAtencion> getTipoatencion() {
			return tipoatenciones;
		}

		public void setTipoatencion(List<TipoAtencion> tipoatencion) {
			this.tipoatenciones = tipoatencion;
		}

		public Cita getCita() {
			return cita;
		}

		public void setCita(Cita cita) {
			this.cita = cita;
		}











	

}
