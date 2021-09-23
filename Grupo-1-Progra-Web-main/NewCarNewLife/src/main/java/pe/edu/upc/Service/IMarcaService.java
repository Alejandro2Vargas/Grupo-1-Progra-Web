package pe.edu.upc.Service;

import java.util.List;

import pe.edu.upc.Entities.Marca;

public interface IMarcaService {

	public void insert(Marca ma);
	
	public List<Marca> list();
}
