package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerface.IReserveDao;
import pe.edu.upc.entity.Reserve;

public class IReserveDaoImpl implements Serializable, IReserveDao {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(name="finalWeb")
	private EntityManager em;


	@Transactional
	public void insert(Reserve reserva) {
		try {
			
		} catch (Exception e) {
			System.out.println("Error al insertar reserva");
		}
		
	}

	@SuppressWarnings("unchecked")
	public List<Reserve> list() {
		List <Reserve> lista= new ArrayList<Reserve>();
		try {
			Query q= em.createQuery("from Reserve");
			lista=(List<Reserve>)q.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar reserva");
		}
		return lista;
	}


	@Transactional
	public void delete(Reserve reserva) {
		try {
			em.remove(reserva);
		} catch (Exception e) {
			System.out.println("Error al eliminar reserva");
		}
		
	}


	@Transactional
	public void update(Reserve reserva) {
		try {
			
		} catch (Exception e) {
			System.out.println("Error al actulizar reserva");
		}
		
	}

}
