package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.inject.Inject;

import pe.edu.upc.dao.IDistritoDao;
import pe.edu.upc.entities.Distrito;
import pe.edu.upc.service.IDistritoService;

public class DistritoServiceImpl implements IDistritoService {

	@Inject
	private IDistritoDao dDao;

	public void insert(Distrito d) {
		// TODO Auto-generated method stub
		dDao.insert(d);
	}

	public List<Distrito> list() {
		// TODO Auto-generated method stub
		return dDao.list();
	}

}
