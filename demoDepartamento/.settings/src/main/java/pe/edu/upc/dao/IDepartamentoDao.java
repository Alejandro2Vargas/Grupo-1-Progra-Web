package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entities.Departamento;

public interface IDepartamentoDao {

	public void insert(Departamento d);

	public List<Departamento> list();

}
