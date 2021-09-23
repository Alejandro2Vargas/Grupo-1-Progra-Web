package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import pe.edu.upc.dao.IDistritoDao;
import pe.edu.upc.entities.Distrito;

public class Distritoimpl implements IDistritoDao {

	@PersistenceContext(unitName = "ParteDepartamento")
	private EntityManager em;

	public void insert(Distrito d) {
		// TODO Auto-generated method stub
		try {

			em.persist(d);

		} catch (Exception e) {
			System.out.println("Error al insertar");
		}
	}

	@SuppressWarnings("unchecked")
	public List<Distrito> list() {
		// TODO Auto-generated method stub

		List<Distrito> lista = new ArrayList<Distrito>();

		try {

			Query q = em.createQuery("select d from Distrito d");
			lista = (List<Distrito>) q.getResultList();

		} catch (Exception e) {
			System.out.println("Error al insertar");
		}

		return lista;
	}

}
