package pe.edu.upc.DaoImpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.Dao.IProvinciaDao;
import pe.edu.upc.Entities.Provincia;

public class ProvinciaImpl implements IProvinciaDao {

	@PersistenceContext(unitName = "NewCarNewLife")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Provincia p) {
		// TODO Auto-generated method stub

		try {

			em.persist(p);

		} catch (Exception e) {
			System.out.println("Error al insertar");
		}
	}

	
	@SuppressWarnings("unchecked")
	@Override
	public List<Provincia> list() {
		// TODO Auto-generated method stub

		List<Provincia> lista = new ArrayList<Provincia>();

		try {

			Query q = em.createQuery("select p from Provincia p");
			lista = (List<Provincia>) q.getResultList();

		} catch (Exception e) {
			System.out.println("Error al insertar");
		}

		return lista;
	}

}
