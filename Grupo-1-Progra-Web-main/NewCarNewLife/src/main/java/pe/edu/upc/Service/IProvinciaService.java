package pe.edu.upc.Service;

import java.util.List;

import pe.edu.upc.Entities.Provincia;

public interface IProvinciaService {

	public void insert(Provincia p);
	public List<Provincia> list();
	
}