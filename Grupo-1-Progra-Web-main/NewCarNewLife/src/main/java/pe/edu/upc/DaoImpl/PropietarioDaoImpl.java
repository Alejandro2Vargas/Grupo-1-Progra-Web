package pe.edu.upc.DaoImpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.Dao.IpropietarioDao;
import pe.edu.upc.Entities.Propietario;

public class PropietarioDaoImpl implements IpropietarioDao {

	@PersistenceContext(unitName = "NewCarNewLife")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Propietario pr) {
		// TODO Auto-generated method stub
		try {
			em.persist(pr);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al insertar");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Propietario> list() {
		// TODO Auto-generated method stub
		List<Propietario> lista = new ArrayList<Propietario>();

		try {
			Query q = em.createQuery("select pr from Propietario pr");
			lista = (List<Propietario>) q.getResultList();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			System.out.println("Error al listar");
		}

		return lista;
	}

	@Transactional
	@Override
	public void delete(int cpropietario) {
		// TODO Auto-generated method stub
		Propietario pro = new Propietario();
		try {
			pro = em.getReference(Propietario.class, cpropietario);
			em.remove(pro);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<Propietario> finByName(Propietario propietario) {
		List<Propietario> lista=new ArrayList<Propietario>();
		try {
			Query q =em.createQuery("select pr from Propietario pr where pr.npropietario like ?1;");
			q.setParameter(1, "%" + propietario.getNpropietario()+"%");
			lista= (List<Propietario>) q.getResultList();
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		return lista;
	}

}
