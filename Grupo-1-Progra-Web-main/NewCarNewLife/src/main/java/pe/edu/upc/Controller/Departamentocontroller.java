package pe.edu.upc.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.Entities.Departamento;
import pe.edu.upc.Service.IDepartamentoService;

@Named
@RequestScoped
public class Departamentocontroller {

	@Inject
	private IDepartamentoService dService;

	private Departamento departamento;
	
	List<Departamento> listaDepartamentos;
	
	@PostConstruct
	private void init() {
		this.listaDepartamentos = new ArrayList<Departamento>();
		this.departamento = new Departamento();
		this.list();
	}
	
	public String newDepartamento() {
		this.setDepartamento(new Departamento());
		return "departamento.xhtml";
	}
	
	public void insert() {
		try {
			dService.insert(departamento);
			this.list();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	
	public void list() {
		listaDepartamentos = dService.list();
	}
	
	
	

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<Departamento> getListaDepartamentos() {
		return listaDepartamentos;
	}

	public void setListaDepartamentos(List<Departamento> listaDepartamentos) {
		this.listaDepartamentos = listaDepartamentos;
	}

	// get y set
	

}
