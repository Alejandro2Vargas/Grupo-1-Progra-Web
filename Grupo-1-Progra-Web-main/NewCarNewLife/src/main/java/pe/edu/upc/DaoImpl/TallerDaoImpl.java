package pe.edu.upc.DaoImpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.Dao.ITallerDao;
import pe.edu.upc.Entities.Taller;

public class TallerDaoImpl implements ITallerDao {

	@PersistenceContext()
	private EntityManager em;

	@Transactional
	public void insert(Taller t) {
		// TODO Auto-generated method stub
		try {
			em.persist(t);

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al insertar");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Taller> list() {
		// TODO Auto-generated method stub

		List<Taller> lista = new ArrayList<Taller>();

		try {
			Query q = em.createQuery("select t from Taller t");
			lista = (List<Taller>) q.getResultList();

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al insertar");
		}

		return lista;
	}

}
