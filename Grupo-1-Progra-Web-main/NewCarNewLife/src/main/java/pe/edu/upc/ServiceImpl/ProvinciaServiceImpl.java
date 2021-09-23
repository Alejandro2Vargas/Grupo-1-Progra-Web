package pe.edu.upc.ServiceImpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.Dao.IProvinciaDao;
import pe.edu.upc.Entities.Provincia;
import pe.edu.upc.Service.IProvinciaService;

@Named
@RequestScoped
public class ProvinciaServiceImpl implements IProvinciaService {

	@Inject
	private IProvinciaDao pDao;

	@Override
	public void insert(Provincia p) {
		// TODO Auto-generated method stub

		pDao.insert(p);
	}

	@Override
	public List<Provincia> list() {
		// TODO Auto-generated method stub
		return pDao.list();
	}

}
