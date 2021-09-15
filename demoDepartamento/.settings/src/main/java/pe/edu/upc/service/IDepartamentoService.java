package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entities.Departamento;

public interface IDepartamentoService {

	public void insert(Departamento vc);
	public List<Departamento> list();
	
}
