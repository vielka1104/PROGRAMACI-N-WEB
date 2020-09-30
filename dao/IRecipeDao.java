package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Recipe;

public interface IRecipeDao {
	
	public void insert (Recipe receta);
	public List<Recipe>list();
	public void update(Recipe receta);
	public List<Recipe> findby(Recipe receta);
	public void delete(int idRecipe);

}
