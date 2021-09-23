package pe.edu.upc.Dao;

import java.util.List;

import pe.edu.upc.Entities.Marca;

public interface IMarcaDao {

	public void insert(Marca ma);
	public List<Marca> list();
}
