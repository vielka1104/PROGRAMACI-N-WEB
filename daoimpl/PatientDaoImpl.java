package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;


import pe.edu.upc.dao.IPatientDao;
import pe.edu.upc.entity.Patient;

@Named
public class PatientDaoImpl implements IPatientDao, Serializable {

	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName = "tpWeb")
	private EntityManager em;

	public Integer insert(Patient t) throws Exception {
		em.persist(t);
		return t.getId();
	}

	public Integer update(Patient t) throws Exception {
		em.merge(t);
		return t.getId();
	}

	public Integer delete(Patient t) throws Exception {
		em.remove(t);
		return 1;
	}

	@SuppressWarnings("unchecked")
	public List<Patient> findAll() throws Exception {
		List<Patient> customers = new ArrayList<Patient>();

		Query q = em.createQuery("SELECT p FROM Patient p");
		customers = (List<Patient>) q.getResultList();
		return customers;
	}

	@SuppressWarnings("unchecked")
	public Optional<Patient> findById(Patient t) throws Exception {

		Patient customerFound = new Patient();

		List<Patient> customers = new ArrayList<Patient>();
		Query q = em.createQuery("FROM Patient p where p.id = ?1");
		q.setParameter(1, t.getId());

		customers = (List<Patient>) q.getResultList();

		if (customers != null && !customers.isEmpty()) {
			customerFound = customers.get(0);
		}

		return Optional.of(customerFound);

	}

	public List<Patient> findByName(String name) throws Exception {
		return em.createQuery("from Patient where name like :name", Patient.class)
				.setParameter("name", "%" + name + "%").getResultList();
	}

	public Optional<Patient> findByDni(String dni) throws Exception {
		Patient customer;
		TypedQuery<Patient> customerExist = em.createQuery("Select c from Patient p  where p.dni =:dni",
				Patient.class);
		customerExist.setParameter("dni", dni);
		customer = customerExist.getSingleResult();

		return Optional.of(customer);
	}

}