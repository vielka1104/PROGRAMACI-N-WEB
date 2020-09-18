package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerface.IReserve_StateDao;
import pe.edu.upc.entity.Reserve_State;


@Named
@RequestScoped
public class IReserve_StateDaoImpl  implements Serializable, IReserve_StateDao {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(name="finalWeb")
	private EntityManager em;

	@Transactional
	public void insert(Reserve_State estado) {
		try {
			em.persist(estado);
		} catch (Exception e) {
			System.out.println("Error al insertar nuevo estado");
		}
		
	}

	@SuppressWarnings("unchecked")
	public List<Reserve_State> list() {
		List<Reserve_State> lista=new ArrayList<Reserve_State>();
		try {
			Query q= em.createQuery("from Reserve_State");
			lista= (List<Reserve_State>)q.getResultList();
			
		} catch (Exception e) {
			System.out.println("Error al listar estados");
		}
		return lista;
	}

	@Transactional
	public void update(Reserve_State estado) {
		
		
	}

	@Transactional
	public void delete(Reserve_State estado) {
		try {
			em.getTransaction().begin();
			em.remove(estado);
			em.getTransaction().commit();
		} catch (Exception e) {
			System.out.println("Error al eliminar");
		}
	}

}
