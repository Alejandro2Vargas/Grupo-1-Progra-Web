package pe.edu.upc.Service;

import java.util.List;

import pe.edu.upc.Entities.Taller;

public interface ITallerService {

	public void insert(Taller t);

	public List<Taller> list();

}
