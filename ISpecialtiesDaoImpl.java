package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import pe.edu.upc.daointerface.ISpecialtiesDao;
import pe.edu.upc.entity.Specialties;

@Named
@RequestScoped
public class ISpecialtiesDaoImpl implements Serializable, ISpecialtiesDao {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@PersistenceContext
	private EntityManager em;

	public void insert(Specialties especialidad) {
		try {
			em.persist(especialidad);
		} catch (Exception e) {
			System.out.println("Error al insertar nueva especialidad");
		}

	}

	@SuppressWarnings({ "unchecked", "unused" })
	public List<Specialties> list() {
		List<Specialties> lista = new ArrayList<Specialties>();
		try {
			Query q = em.createQuery("from Specialties s");
			lista = (List<Specialties>) q.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar especialidades");

		}
		return null;
	}

	public void update(Specialties especialidad) {
		// TODO Auto-generated method stub

	}

	public void delete(Specialties especialidad) {
		try {
			em.getTransaction().begin();
			em.remove(especialidad);
			em.getTransaction().commit();
		} catch (Exception e) {
			System.out.println("Error al eliminar especialidad");
		}

	}

}
