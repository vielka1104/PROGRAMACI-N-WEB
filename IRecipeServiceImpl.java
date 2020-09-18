package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.inject.Inject;

import pe.edu.upc.daointerface.IRecipeDao;
import pe.edu.upc.entity.Recipe;
import pe.edu.upc.serviceinterface.IRecipeService;

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
	public void delete(Recipe receta) {
		
		rD.delete(receta);
		
	}

	@Override
	public void update(Recipe receta) {
		
		rD.update(receta);
		
	}

}
