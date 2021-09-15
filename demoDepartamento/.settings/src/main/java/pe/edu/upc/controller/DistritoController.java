package pe.edu.upc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Distrito;
import pe.edu.upc.entities.Provincia;
import pe.edu.upc.service.IDistritoService;
import pe.edu.upc.service.IProvinciaService;

@Named
@RequestScoped
public class DistritoController {

	@Inject
	private IDistritoService dService;

	@Inject
	private IProvinciaService pService;

	private Distrito distrito;
	private Provincia provincia;

	List<Distrito> listaDistrito;
	List<Provincia> listaProvincia;

	@PostConstruct
	public void init() {
		this.listaDistrito = new ArrayList<Distrito>();
		this.listaProvincia = new ArrayList<Provincia>();
		this.distrito = new Distrito();
		this.provincia = new Provincia();
		this.listDistrito();
		this.listProvincia();
	}

	public String newDistrito() {
		this.setDistrito(new Distrito());
		return "distrito.xhtml";
	}

	public void insertDistrito() {
		dService.insert(distrito);
		this.listDistrito();

	}

	public void listDistrito() {
		listaDistrito = dService.list();
	}

	public void listProvincia() {
		listaProvincia = pService.list();
	}

	public Distrito getDistrito() {
		return distrito;
	}

	public void setDistrito(Distrito distrito) {
		this.distrito = distrito;
	}

	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}

	public List<Distrito> getListaDistrito() {
		return listaDistrito;
	}

	public void setListaDistrito(List<Distrito> listaDistrito) {
		this.listaDistrito = listaDistrito;
	}

	public List<Provincia> getListaProvincia() {
		return listaProvincia;
	}

	public void setListaProvincia(List<Provincia> listaProvincia) {
		this.listaProvincia = listaProvincia;
	}

}
