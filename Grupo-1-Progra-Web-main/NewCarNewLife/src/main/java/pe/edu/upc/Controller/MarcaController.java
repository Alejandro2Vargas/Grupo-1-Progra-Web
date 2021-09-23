package pe.edu.upc.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.Entities.Marca;
import pe.edu.upc.Service.IMarcaService;

@Named
@RequestScoped
public class MarcaController {
	
	@Inject
	private IMarcaService mService;

	private Marca marca;
	
	List<Marca> listaMarcas;
	
	@PostConstruct
	private void init() {
		this.listaMarcas = new ArrayList<Marca>();
		this.marca = new Marca();
		this.list();
	}
	
	public String newMarca() {
		this.setMarca(new Marca());
		return "marca.xhtml";
	}
	
	public void insert() {
		try {
			mService.insert(marca);
			this.list();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	
	public void list() {
		listaMarcas = mService.list();
	}
	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public List<Marca> getListaMarcas() {
		return listaMarcas;
	}

	public void setListaMarcas(List<Marca> listaMarcas) {
		this.listaMarcas = listaMarcas;
	}
	
	
	

}
