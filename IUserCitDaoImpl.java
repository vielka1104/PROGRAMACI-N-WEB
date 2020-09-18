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

import pe.edu.upc.daointerface.IUserCitDao;
import pe.edu.upc.entity.UserCit;

@Named
@RequestScoped
public class IUserCitDaoImpl implements Serializable, IUserCitDao {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@PersistenceContext(name = "finalWeb")
	private EntityManager em;

	@Transactional
	public void insert(UserCit usuario) {

		try {

			em.persist(usuario);
		} catch (Exception e) {

			System.out.println("Error al insertar Usuario");
		}

	}

	@SuppressWarnings({ "unchecked" })
	public List<UserCit> list() {
		List<UserCit> lista = new ArrayList<UserCit>();
		try {

			Query q = em.createQuery("from UserCit u");
			lista = (List<UserCit>) q.getResultList();

		} catch (Exception e) {
			System.out.println("Error al listar Usuarios");
		}

		return lista;
	}
	@Transactional
	public void update(UserCit usuario) {
		usuario = em.find(usuario.getClass(), usuario.getIdUser());
		try {
			/*
			 * em.getTransaction().begin(); usuario.setAdressUser(adressUser);
			 * usuario.setBirthdateUser(birthdateUser); usuario.setCellUser(cellUser);
			 * usuario.setDniUser(dniUser); usuario.setEmailUser(emailUser);
			 * usuario.setGenUser(genUser); usuario.setLastNameUser(lastNameUser);
			 * usuario.setNameUser(nameUser); usuario.setPasswordUser(passwordUser);
			 * usuario.setUsernameUser(usernameUser); em.getTransaction().commit();
			 */

		} catch (Exception e) {
			System.out.println("Error al actualizar usuario");
		}

	}
	@Transactional
	public void delete(UserCit usuario) {
		usuario = em.find(usuario.getClass(), usuario.getIdUser());
		try {
			em.getTransaction().begin();
			em.remove(usuario);
			em.getTransaction().commit();
		} catch (Exception e) {
			System.out.println("Error al eliminar usuario");
		}

	}

}
