package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IProvinciaDao;
import pe.edu.upc.entities.Provincia;
import pe.edu.upc.service.IProvinciaService;

@Named
@RequestScoped
public class ProvinciaServiceImpl implements IProvinciaService {

	@Inject
	private IProvinciaDao pDao;

	@Override
	public void insert(Provincia vc) {
		// TODO Auto-generated method stub

		pDao.insert(vc);
	}

	@Override
	public List<Provincia> list() {
		// TODO Auto-generated method stub
		return pDao.list();
	}

}
