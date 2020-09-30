package pe.edu.upc.daoimpl;


import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IReserveDao;
import pe.edu.upc.entity.Reserve;




@Named
@RequestScoped
public class IReserveDaoImpl implements  IReserveDao {


	
	@PersistenceContext(name="tpWeb")
	private EntityManager em;

	@Override
	@Transactional
	public void insert(Reserve reserva) {
		try {
			em.persist(reserva);
		} catch (Exception e) {
			System.out.println("Error al insertar reserva");
		}
		
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public List<Reserve> list() {
		List <Reserve> lista= new ArrayList<Reserve>();
		try {
			Query q= em.createQuery("from Reserve r");
			lista=(List<Reserve>)q.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar reserva");
		}
		return lista;
	}


	@Override
	@Transactional
	public void update(Reserve reserva) {
		try {
			em.merge(reserva);
		} catch (Exception e) {
			System.out.println("Error al actulizar reserva");
		}
		
	}

	@Override
	@Transactional
	public void delete(int idReserva) {
		Reserve r = new Reserve();
		try {
			r = em.getReference(Reserve.class, idReserva);
			em.remove(r);
		} catch (Exception e) {
			System.out.println("Error al eliminar reserva");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Reserve> findby(Reserve reserva) {
		List<Reserve> lista = new ArrayList<Reserve>();
		try {

			Query q = em.createQuery("from Reserve r where r.idReserve= ?1");
			q.setParameter(1, reserva.getIdReserve());
			lista = (List<Reserve>) q.getResultList();

		} catch (Exception e) {
			System.out.println("Error al encontrar Reserva");
		}
		
		return lista;
	}

}
