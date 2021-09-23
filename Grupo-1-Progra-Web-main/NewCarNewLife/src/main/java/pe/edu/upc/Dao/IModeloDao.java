package pe.edu.upc.Dao;

import java.util.List;

import pe.edu.upc.Entities.Modelo;

public interface IModeloDao {

	public void insert(Modelo mo);
	public List<Modelo> list();
}
