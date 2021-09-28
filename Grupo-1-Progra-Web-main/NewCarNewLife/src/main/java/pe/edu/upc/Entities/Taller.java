package pe.edu.upc.Entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Taller {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Ctaller;

	@Column(name = "nameTaller", length = 50, nullable = false)
	private String Ntaller;

	@Column(name = "lat", length = 50, nullable = false)
	private String lat;

	@Column(name = "log", length = 50, nullable = false)
	private String log;

	@Column(name = "Qcapacidad", length = 50, nullable = false)
	private int Qcapacidad;

	@Column(name = "Tdireccion", nullable = false)
	private String Tdireccion;

	@ManyToOne
	@JoinColumn(name = "Cdistrito", nullable = false)
	private int Distrito;

	@ManyToOne
	@JoinColumn(name = "Cestado", nullable = false)
	private int Estado_Taller_Cestado;

	@ManyToOne
	@JoinColumn(name = "Ccategoria", nullable = false)
	private int Categoria_Ccategoria;

	public Taller(int ctaller, String ntaller, String lat, String log, int qcapacidad, String tdireccion, int distrito,
			int estado_Taller_Cestado, int categoria_Ccategoria) {
		super();
		Ctaller = ctaller;
		Ntaller = ntaller;
		this.lat = lat;
		this.log = log;
		Qcapacidad = qcapacidad;
		Tdireccion = tdireccion;
		Distrito = distrito;
		Estado_Taller_Cestado = estado_Taller_Cestado;
		Categoria_Ccategoria = categoria_Ccategoria;
	}

	public Taller() {
		super();
		// TODO Auto-generated constructor stub
	}

	// getters and setters
	public int getCtaller() {
		return Ctaller;
	}

	public void setCtaller(int ctaller) {
		Ctaller = ctaller;
	}

	public String getNtaller() {
		return Ntaller;
	}

	public void setNtaller(String ntaller) {
		Ntaller = ntaller;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getLog() {
		return log;
	}

	public void setLog(String log) {
		this.log = log;
	}

	public int getQcapacidad() {
		return Qcapacidad;
	}

	public void setQcapacidad(int qcapacidad) {
		Qcapacidad = qcapacidad;
	}

	public String getTdireccion() {
		return Tdireccion;
	}

	public void setTdireccion(String tdireccion) {
		Tdireccion = tdireccion;
	}

	public int getDistrito() {
		return Distrito;
	}

	public void setDistrito(int distrito) {
		Distrito = distrito;
	}

	public int getEstado_Taller_Cestado() {
		return Estado_Taller_Cestado;
	}

	public void setEstado_Taller_Cestado(int estado_Taller_Cestado) {
		Estado_Taller_Cestado = estado_Taller_Cestado;
	}

	public int getCategoria_Ccategoria() {
		return Categoria_Ccategoria;
	}

	public void setCategoria_Ccategoria(int categoria_Ccategoria) {
		Categoria_Ccategoria = categoria_Ccategoria;
	}

}
