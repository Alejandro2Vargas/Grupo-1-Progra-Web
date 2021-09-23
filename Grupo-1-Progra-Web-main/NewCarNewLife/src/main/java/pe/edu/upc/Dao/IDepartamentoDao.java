package pe.edu.upc.Dao;

import java.util.List;

import pe.edu.upc.Entities.Departamento;

public interface IDepartamentoDao {

	public void insert(Departamento d);

	public List<Departamento> list();

}
