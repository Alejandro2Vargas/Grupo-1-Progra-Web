package pe.edu.upc.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.Entities.Departamento;
import pe.edu.upc.Entities.Provincia;
import pe.edu.upc.Service.IDepartamentoService;
import pe.edu.upc.Service.IProvinciaService;

@Named
@RequestScoped
public class ProvinciaController {

	// metodos
	@Inject
	private IProvinciaService pService;
	@Inject
	private IDepartamentoService dService;

	// atributos

	List<Provincia> listaProvincias;
	List<Departamento> listaDepartamentos;

	private Provincia provincia;
	private Departamento departamento;

	// constructor
	@PostConstruct
	public void init() {
		this.listaProvincias = new ArrayList<Provincia>();
		this.listaDepartamentos = new ArrayList<Departamento>();
		this.provincia = new Provincia();
		this.departamento = new Departamento();
		this.listDepartamento();
		this.listProvincia();

	}

	// metodos personalizados

	public String newProvincia() {

		this.setProvincia(new Provincia());

		return "Provincia.xhtml";
	}

	public void listDepartamento() {

		listaDepartamentos = dService.list();

	}

	public void insertProvincia() {
		pService.insert(provincia);
		this.listProvincia();
	}

	public void listProvincia() {
		listaProvincias = pService.list();
	}

	public List<Provincia> getListaProvincias() {
		return listaProvincias;
	}

	public void setListaProvincias(List<Provincia> listaProvincias) {
		this.listaProvincias = listaProvincias;
	}

	public List<Departamento> getListaDepartamentos() {
		return listaDepartamentos;
	}

	public void setListaDepartamentos(List<Departamento> listaDepartamentos) {
		this.listaDepartamentos = listaDepartamentos;
	}

	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	// get y set
	
	

}
