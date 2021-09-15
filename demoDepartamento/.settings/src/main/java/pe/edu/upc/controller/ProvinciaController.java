package pe.edu.upc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Departamento;
import pe.edu.upc.entities.Provincia;
import pe.edu.upc.service.IDepartamentoService;
import pe.edu.upc.service.IProvinciaService;

@Named
@RequestScoped
public class ProvinciaController {

	// metodos
	@Inject
	private IProvinciaService pService;

	@Inject
	private IDepartamentoService vService;

	// atributos

	List<Provincia> listaProvincia;
	List<Departamento> listaDepartamento;

	private Provincia provincia;
	private Departamento departamento;

	// constructor
	@PostConstruct
	public void init() {
		this.listaProvincia = new ArrayList<Provincia>();
		this.listaDepartamento = new ArrayList<Departamento>();
		this.provincia = new Provincia();
		this.departamento = new Departamento();
		this.listaDepartamento();
		this.listaProvincia();

	}

	// metodos personalizados

	public String newProvincia() {

		this.setProvincia(new Provincia());

		return "provincia.xhtml";
	}

	public void listaDepartamento() {

		listaDepartamento = vService.list();

	}

	public void insertProvincia() {
		pService.insert(provincia);
		this.listaProvincia();
	}

	public void listaProvincia() {
		listaProvincia = pService.list();
	}

	// get y set
	public List<Provincia> getListaProvincia() {
		return listaProvincia;
	}

	public void setListaProvincia(List<Provincia> listaProvincia) {
		this.listaProvincia = listaProvincia;
	}

	public List<Departamento> getListaDepartamento() {
		return listaDepartamento;
	}

	public void setListaDepartamento(List<Departamento> listaDepartamento) {
		this.listaDepartamento = listaDepartamento;
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

}
