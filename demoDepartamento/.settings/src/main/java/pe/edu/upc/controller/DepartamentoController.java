package pe.edu.upc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Departamento;
import pe.edu.upc.service.IDepartamentoService;

@Named
@RequestScoped
public class DepartamentoController {

	@Inject
	private IDepartamentoService dService;

	// atributos de la clase
	private Departamento departamento;

	List<Departamento> listaDepartamento;

	// get y set
	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<Departamento> getListaDepartamento() {
		return listaDepartamento;
	}

	public void setListaDepartamento(List<Departamento> listaDepartamento) {
		this.listaDepartamento = listaDepartamento;
	}

//constructor 
	@PostConstruct
	public void init() {
		this.listaDepartamento = new ArrayList<Departamento>();
		this.departamento = new Departamento();
		this.List();
	}
	// metodos atender peticiones

	public String newDepartamento() {
		this.setDepartamento(new Departamento());
		return "departamento.xhtml";
	}

	public void insert() {
		try {

			dService.insert(departamento);
			this.List();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void List() {
		listaDepartamento = dService.list();
	}

}
