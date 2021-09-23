package pe.edu.upc.Entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Marca")
public class Marca {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Cmarca;
	
	@Column(name = "nameMarca", length = 50, nullable = false)
	private String Nmarca;

	//construc
	public Marca() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Marca(int cmarca, String nmarca) {
		super();
		Cmarca = cmarca;
		Nmarca = nmarca;
	}

	public int getCmarca() {
		return Cmarca;
	}

	public void setCmarca(int cmarca) {
		Cmarca = cmarca;
	}

	public String getNmarca() {
		return Nmarca;
	}

	public void setNmarca(String nmarca) {
		Nmarca = nmarca;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Cmarca);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Marca other = (Marca) obj;
		return Cmarca == other.Cmarca;
	}
	
	
	
	
	
	
}
