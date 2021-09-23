package pe.edu.upc.DaoImpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.Dao.IMarcaDao;
import pe.edu.upc.Entities.Marca;

public class MarcaDaoImpl implements IMarcaDao{

	@PersistenceContext(unitName = "NewCarNewLife")
	private EntityManager em;

	@Transactional
	public void insert(Marca ma) {
		// TODO Auto-generated method stub
		try {
			em.persist(ma);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			System.out.println("Error al insertar");
		}
	}

	@SuppressWarnings("unchecked")
	public List<Marca> list() {
		// TODO Auto-generated method stub
		List<Marca> lista = new ArrayList<Marca>();
		try {
			Query q = em.createQuery("select m from Marca m");
			lista = (List<Marca>) q.getResultList();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			System.out.println("Error al insertar");
		}
		return lista;
	}
	
	
	
}
