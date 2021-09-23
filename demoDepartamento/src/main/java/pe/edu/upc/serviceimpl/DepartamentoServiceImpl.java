package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IDepartamentoDao;
import pe.edu.upc.entities.Departamento;
import pe.edu.upc.service.IDepartamentoService;

@Named
@RequestScoped
public class DepartamentoServiceImpl implements IDepartamentoService {

	@Inject
	private IDepartamentoDao vDao;

	public void insert(Departamento vc) {
		// TODO Auto-generated method stub

		vDao.insert(vc);
	}

	public List<Departamento> list() {
		// TODO Auto-generated method stub
		return vDao.list();
	}

}
