package pe.edu.upc.DaoImpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.Dao.IModeloDao;
import pe.edu.upc.Entities.Modelo;

public class ModeloDaoImpl implements IModeloDao{
	
	@PersistenceContext(unitName = "NewCarNewLife")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Modelo mo) {
		// TODO Auto-generated method stub
		try {
			em.persist(mo);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al insertar");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Modelo> list() {
		// TODO Auto-generated method stub
		List<Modelo> lista = new ArrayList<Modelo>();
		try {
			Query q = em.createQuery("select mo from Modelo mo");
			lista=(List<Modelo>) q.getResultList();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al insertar");
		}
		return lista;
	}
	
	
	

}
