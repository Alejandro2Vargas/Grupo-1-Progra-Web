package pe.edu.upc.Dao;

import java.util.List;

import javax.annotation.PostConstruct;

import pe.edu.upc.Controller.propietarioController;
import pe.edu.upc.Entities.Propietario;

@SuppressWarnings("unused")
public interface IpropietarioDao {

	public void insert(Propietario pr);

	public void delete(int cpropietario);

	public List<Propietario> list();

	public List<Propietario> finByName(Propietario propietario);

}
