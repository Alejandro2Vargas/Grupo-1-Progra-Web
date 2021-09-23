package pe.edu.upc.Entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Vehiculo")
public class Vehiculo {
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Cplaca;
	
	@ManyToOne
	@JoinColumn(name = "Cmodelo", nullable = false)
	private Modelo modelo;
	
	@Column(name = "Qllantas", length = 20, nullable = false)
	private int Qllanta;
	
	private Date Dfabricacion;

	public Vehiculo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vehiculo(int cplaca, Modelo modelo, int qllanta, Date dfabricacion) {
		super();
		Cplaca = cplaca;
		this.modelo = modelo;
		Qllanta = qllanta;
		Dfabricacion = dfabricacion;
	}

	public int getCplaca() {
		return Cplaca;
	}

	public void setCplaca(int cplaca) {
		Cplaca = cplaca;
	}

	public Modelo getModelo() {
		return modelo;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}

	public int getQllanta() {
		return Qllanta;
	}

	public void setQllanta(int qllanta) {
		Qllanta = qllanta;
	}

	public Date getDfabricacion() {
		return Dfabricacion;
	}

	public void setDfabricacion(Date dfabricacion) {
		Dfabricacion = dfabricacion;
	}
	
	
}
