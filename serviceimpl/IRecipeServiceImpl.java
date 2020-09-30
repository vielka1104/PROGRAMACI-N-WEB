package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IRecipeDao;
import pe.edu.upc.entity.Recipe;
import pe.edu.upc.service.IRecipeService;

@Named
@RequestScoped
public class IRecipeServiceImpl implements IRecipeService {
 
	@Inject
	private IRecipeDao rD;
	
	@Override
	public void insert(Recipe receta) {
		rD.insert(receta);
		
	}

	@Override
	public List<Recipe> list() {
		return rD.list();
	}

	

	@Override
	public void update(Recipe receta) {
		rD.update(receta);
	}

	@Override
	public List<Recipe> findby(Recipe receta) {
		return rD.findby(receta);
	}

	@Override
	public void delete(int idRecipe) {
		rD.delete(idRecipe);	
	}

}
