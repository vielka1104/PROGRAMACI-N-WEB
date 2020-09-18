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

import pe.edu.upc.daointerface.IRecipeDao;
import pe.edu.upc.entity.Recipe;

@Named
@RequestScoped
public class IRecipeDaoImpl implements Serializable, IRecipeDao {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(name="finalWeb")
	private EntityManager em;

	@Transactional
	public void insert(Recipe receta) {
		try {
			
			em.persist(receta);
		} catch (Exception e) {
			System.out.println("Error al insertar receta");
		}
		
	}

	@SuppressWarnings("unchecked")
	public List<Recipe> list() {
		List <Recipe> lista=new ArrayList<Recipe>();
		try {
			Query q= em.createQuery("from Recipe");
			lista=(List<Recipe>)q.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar receta");
		}
		return lista;
	}

	@Transactional
	public void delete(Recipe receta) {
		try {
			em.remove(receta);
		} catch (Exception e) {
			System.out.println("Error al eliminar receta");
		}
		
	}

	@Transactional
	public void update(Recipe receta) {
		// TODO Auto-generated method stub
		
	}

}
