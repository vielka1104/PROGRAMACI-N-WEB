package pe.edu.upc.serviceinterface;

import java.util.List;

import pe.edu.upc.entity.Recipe;

public interface IRecipeService {
	public void insert (Recipe receta);
	public List<Recipe>list();
	public void delete(Recipe receta);
	public void update(Recipe receta);


}
