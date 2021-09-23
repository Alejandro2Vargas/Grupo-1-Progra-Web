package pe.edu.upc.Entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Modelo")
public class Modelo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Cmodelo;
	
	@Column(name = "nameModelo",length = 50,nullable = false)
	private String Nmodelo;
	
	@ManyToOne
	@JoinColumn(name = "Cmarca", nullable = false)
	private Marca marca;

	public Modelo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Modelo(int cmodelo, String nmodelo, Marca marca) {
		super();
		Cmodelo = cmodelo;
		Nmodelo = nmodelo;
		this.marca = marca;
	}

	public int getCmodelo() {
		return Cmodelo;
	}

	public void setCmodelo(int cmodelo) {
		Cmodelo = cmodelo;
	}

	public String getNmodelo() {
		return Nmodelo;
	}

	public void setNmodelo(String nmodelo) {
		Nmodelo = nmodelo;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Cmodelo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Modelo other = (Modelo) obj;
		return Cmodelo == other.Cmodelo;
	}
	
	
}
