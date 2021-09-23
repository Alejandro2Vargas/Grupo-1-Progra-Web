package pe.edu.upc.Dao;

import java.util.List;

import pe.edu.upc.Entities.Vehiculo;

public interface IVehiculoDao {

	public void insert(Vehiculo v);
	public List<Vehiculo> list();
}
