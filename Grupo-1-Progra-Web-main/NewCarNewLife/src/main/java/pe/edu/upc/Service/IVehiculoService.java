package pe.edu.upc.Service;

import java.util.List;

import pe.edu.upc.Entities.Vehiculo;

public interface IVehiculoService {

	public void insert(Vehiculo v);
	public List<Vehiculo> list();
}
