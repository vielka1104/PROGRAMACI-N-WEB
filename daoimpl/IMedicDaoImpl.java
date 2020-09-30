package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IMedicDao;
import pe.edu.upc.entity.Medic;

@Named
@RequestScoped
public class IMedicDaoImpl implements IMedicDao {

	@PersistenceContext(name = "tpWeb")
	private EntityManager em;

	@Override
	@Transactional
	public void insert(Medic medico) {
		try {
			em.persist(medico);
		} catch (Exception e) {
			System.out.println("Error al insertar medico");
		}

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Medic> list() {
		List <Medic>lista= new ArrayList<Medic>();
		try {
		Query q=em.createQuery("from Medic");
		lista=(List<Medic>)q.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar medicos");
		}

		return lista;
	}

	@Override
	@Transactional
	public void update(Medic medico) {
		try {
			em.merge(medico);
		} catch (Exception e) {
			System.out.println("Error al actualizar medico");
		}

	}

	@Override
	@Transactional
	public void delete(int idUser) {
		Medic m=new Medic();
		try {
			m=em.getReference(Medic.class, idUser);
			em.remove(m);

		} catch (Exception e) {
			System.out.println("Error al eliminar medico");
		}

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Medic> findby(Medic medico) {
		List <Medic>lista= new ArrayList<Medic>();
		try {
			Query q=em.createQuery("from Medic m where m.nameUser like ?1 or m.Specialty like ?1");
			q.setParameter(1, "%"+medico.getSpeciality()+"%");
			lista=(List<Medic>)q.getResultList();

		} catch (Exception e) {
			System.out.println("Error al encontrar medico");
		}

		return lista;
	}

}
