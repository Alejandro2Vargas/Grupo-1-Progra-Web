package pe.edu.upc.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.Entities.Modelo;
import pe.edu.upc.Entities.Vehiculo;
import pe.edu.upc.Service.IModeloService;
import pe.edu.upc.Service.IVehiculoService;

@Named
@RequestScoped
public class VehiculoController {

	@Inject
	private IVehiculoService vService;
	
	@Inject
	private IModeloService moService;
	
	private Vehiculo vehiculo;
	private Modelo modelo;
	
	List<Vehiculo> listaVehiculos;
	List<Modelo> listaModelos;
	
	@PostConstruct
	public void init() {
		this.listaVehiculos= new ArrayList<Vehiculo>();
		this.listaModelos= new ArrayList<Modelo>();
		this.vehiculo= new Vehiculo();
		this.modelo= new Modelo();
		this.listModelo();
		this.listVehiculo();
		
	}

	public String newVehiculo() {
		this.setVehiculo(new Vehiculo());
		return "vehiculo.xhtml";
				
	}
	
	public void listModelo() {
		listaModelos= moService.list();
	}
	
	public void insertVehiculo() {
		vService.insert(vehiculo);
		this.listVehiculo();
		
	}
	
	public void listVehiculo() {
		listaVehiculos= vService.list();
	}
	
	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public Modelo getModelo() {
		return modelo;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}

	public List<Vehiculo> getListaVehiculos() {
		return listaVehiculos;
	}

	public void setListaVehiculos(List<Vehiculo> listaVehiculos) {
		this.listaVehiculos = listaVehiculos;
	}

	public List<Modelo> getListaModelos() {
		return listaModelos;
	}

	public void setListaModelos(List<Modelo> listaModelos) {
		this.listaModelos = listaModelos;
	}
	
}
