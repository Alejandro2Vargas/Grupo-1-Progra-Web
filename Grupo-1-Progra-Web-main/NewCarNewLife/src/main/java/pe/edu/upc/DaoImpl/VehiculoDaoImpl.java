package pe.edu.upc.DaoImpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.Dao.IVehiculoDao;
import pe.edu.upc.Entities.Vehiculo;

public class VehiculoDaoImpl implements IVehiculoDao{

	@PersistenceContext(unitName = "NewCarNewLife")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Vehiculo v) {
		// TODO Auto-generated method stub
		try {
			em.persist(v);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al insertar");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Vehiculo> list() {
		// TODO Auto-generated method stub
		List<Vehiculo> lista = new ArrayList<Vehiculo>();
		try {
			Query q= em.createQuery("select v from Vehiculo v");
			lista=(List<Vehiculo>) q.getResultList();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al listar");
		}
		return lista;
	}
	
	
}
