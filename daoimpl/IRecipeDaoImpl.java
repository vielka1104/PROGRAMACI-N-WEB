package pe.edu.upc.daoimpl;


import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IRecipeDao;
import pe.edu.upc.entity.Recipe;



@Named
@RequestScoped
public class IRecipeDaoImpl implements  IRecipeDao {


	
	@PersistenceContext(name="tpWeb")
	private EntityManager em;

	@Override
	@Transactional
	public void insert(Recipe receta) {
		try {
			
			em.persist(receta);
		} catch (Exception e) {
			System.out.println("Error al insertar receta");
		}
		
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public List<Recipe> list() {
		List <Recipe> lista=new ArrayList<Recipe>();
		try {
			Query q= em.createQuery("from Recipe r");
			lista=(List<Recipe>)q.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar receta");
		}
		return lista;
	}

	@Override
	@Transactional
	public void update(Recipe receta) {
		
		try {
			em.merge(receta);
		} catch (Exception e) {
			System.out.println("Error al actualizar receta");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Recipe> findby(Recipe receta) {
		List<Recipe> lista = new ArrayList<Recipe>();
		try {

			Query q = em.createQuery("from Recipe r where r.idRecipe= ?1");
			q.setParameter(1, receta.getIdRecipe());
			lista = (List<Recipe>) q.getResultList();

		} catch (Exception e) {
			System.out.println("Error al encontrar receta");
		}
		return lista;
	}

	@Override
	@Transactional
	public void delete(int idRecipe) {
		Recipe r = new Recipe();
		try {
			r = em.getReference(Recipe.class, idRecipe);
			em.remove(r);
		} catch (Exception e) {
			System.out.println("Error al eliminar receta");
		}
	}

}
