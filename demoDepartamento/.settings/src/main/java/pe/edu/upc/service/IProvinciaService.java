package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entities.Provincia;

public interface IProvinciaService {

	public void insert(Provincia vc);
	public List<Provincia> list();
	
}