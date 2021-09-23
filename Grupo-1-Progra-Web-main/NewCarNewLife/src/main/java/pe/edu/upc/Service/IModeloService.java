package pe.edu.upc.Service;

import java.util.List;

import pe.edu.upc.Entities.Modelo;

public interface IModeloService {

	public void insert(Modelo mo);
	public List<Modelo> list();
}
