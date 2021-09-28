package pe.edu.upc.ServiceImpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.Id;

import pe.edu.upc.Dao.ITallerDao;
import pe.edu.upc.Entities.Taller;
import pe.edu.upc.Service.ITallerService;

@SuppressWarnings("unused")
@Named
@RequestScoped
public class TallerServiceImpl implements ITallerService {

	@Inject
	private ITallerDao tDao;

	@Override
	public void insert(Taller t) {
		// TODO Auto-generated method stub

		tDao.insert(t);

	}

	@Override
	public List<Taller> list() {
		// TODO Auto-generated method stub
		return tDao.list();
	}

}
