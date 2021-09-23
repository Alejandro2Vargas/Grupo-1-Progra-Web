package pe.edu.upc.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.Entities.Categoria;
import pe.edu.upc.Entities.Propietario;
import pe.edu.upc.Service.ICategoriaService;
import pe.edu.upc.Service.IPropietarioService;

@Named
@RequestScoped
public class propietarioController {

	@Inject
	private IPropietarioService prService;

	@Inject
	private ICategoriaService cService;

	private Propietario propietario;
	private Categoria categoria;


	List<Propietario> listapropietarios;
	List<Categoria> listacategorias;

	@PostConstruct
	public void init() {
		this.listapropietarios = new ArrayList<Propietario>();
		this.listacategorias = new ArrayList<Categoria>();
		this.propietario = new Propietario();
		this.categoria = new Categoria();
		this.listCategoria();
		this.listPropietario();
	}
	
	public String newPropietario() {
		this.setPropietario(new Propietario());
		return "propietario.xhtml";
	}
	
	public void listCategoria() {
		listacategorias=cService.list();
	}
	
	public void insertPropietario() {
		
		try {
			prService.insert(propietario);
			this.listPropietario();
		}catch (Exception e) {
			// TODO: handle exception
			e.getMessage();
		}

	}
	
	public void listPropietario() {

		
		try {
			listapropietarios= prService.list();
		}catch (Exception e) {
			// TODO: handle exception
			e.getMessage();
		}
	}
	
	
	public void cleanPropietario() {
		this.init();
	}
	
	public void delete(Propietario pro) {
		try {
			prService.delete(pro.getCpropietario());
			listPropietario();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			}
	}
	
	public void findByName() {
		try {
			if (propietario.getNpropietario().isEmpty()) {
				this.listPropietario();
			} else {
				listapropietarios = this.prService.finByName(this.getPropietario());
			}
		} catch (Exception e) {
			e.getMessage();
		}
	}
	
	//set y get

	public Propietario getPropietario() {
		return propietario;
	}

	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public List<Propietario> getListapropietarios() {
		return listapropietarios;
	}

	public void setListapropietarios(List<Propietario> listapropietarios) {
		this.listapropietarios = listapropietarios;
	}

	public List<Categoria> getListacategorias() {
		return listacategorias;
	}

	public void setListacategorias(List<Categoria> listacategorias) {
		this.listacategorias = listacategorias;
	}



}
