package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IProvinciaDao;
import pe.edu.upc.entities.Provincia;

public class ProvinciaImpl implements IProvinciaDao {

	@PersistenceContext(unitName = "ParteDepartamento")
	private EntityManager em;

	@Transactional
	public void insert(Provincia p) {
		// TODO Auto-generated method stub

		try {

			em.persist(p);

		} catch (Exception e) {
			System.out.println("Error al insertar");
		}
	}

	@SuppressWarnings("unchecked")
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
