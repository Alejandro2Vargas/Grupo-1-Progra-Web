package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IDepartamentoDao;
import pe.edu.upc.entities.Departamento;

public class DepartamentoImpl implements IDepartamentoDao {

	@PersistenceContext(unitName = "ParteDepartamento")
	private EntityManager em;

	@Transactional
	public void insert(Departamento d) {
		// TODO Auto-generated method stub

		try {

			em.persist(d);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Error al insertar");
		}

	}

	@SuppressWarnings("unchecked")
	public List<Departamento> list() {
		// TODO Auto-generated method stub

		List<Departamento> lista = new ArrayList<Departamento>();

		try {

			Query q = em.createQuery("select v from Departamento v");
			lista = (List<Departamento>) q.getResultList();

		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Error al insertar");
		}

		return lista;
	}

}
