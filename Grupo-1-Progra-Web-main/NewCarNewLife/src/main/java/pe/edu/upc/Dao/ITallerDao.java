package pe.edu.upc.Dao;

import java.util.List;

import pe.edu.upc.Entities.Taller;

public interface ITallerDao {

	public void insert(Taller t);

	List<Taller> list();

}
