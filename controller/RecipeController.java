package pe.edu.upc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;


import pe.edu.upc.entity.Recipe;
import pe.edu.upc.entity.Reserve;

import pe.edu.upc.service.IRecipeService;
import pe.edu.upc.service.IReserveService;



@Named
@RequestScoped
public class RecipeController {

	@Inject
	private IRecipeService rService;

	private Recipe r;
	
	
	@Inject
	private IReserveService reService;

	List<Recipe> listRecipes;
	
	List<Reserve> listReserve;

	@PostConstruct
	public void innit() {

		this.r = new Recipe();
		this.listRecipes = new ArrayList<Recipe>();
		this.listRecipes();
	}

	public String newRecipe() {
		this.setR(new Recipe());
		return "laboratory.html";

	}

	public void insert() {
		try {
			rService.insert(r);
			this.listRecipes();
		} catch (Exception e) {
			System.out.println("Error al insertar receta en el controller");
		}

	}
	public void listPatient() {
		try {
			listReserve = reService.list();
		} catch (Exception e) {
			System.out.println("Error al listar en el controller");
		}
	}
		
	public void listRecipes() {
		try {
			listRecipes=rService.list();
		} catch (Exception e) {
			System.out.println("Error al listar especialidades en el controller");
		}
	}
	
	public String goUpdate(Recipe receta){
		
		this.setR(receta);
		return "ModificarReceta.xhtml";
	}

	public void update() {
		try {
			rService.update(this.r);
		} catch (Exception e) {
			System.out.println("Error al actualizar receta en el controller");
		}

	}
	
	public void delete(Recipe receta) {
		try {
			rService.delete(r.getIdRecipe());
			this.listRecipes();
		} catch (Exception e) {
			System.out.println("Error al eliminar receta en el controller");
		}
	}
	public void findby() {
		try {
			if (r.getDescRecipe().isEmpty()) {
				listRecipes = this.rService.list();

			} else {
				listRecipes = this.rService.findby(this.getR());
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		
	}

	public void cleanSpecialties() {
		this.innit();
	}



	public Recipe getR() {
		return r;
	}

	public void setR(Recipe r) {
		this.r = r;
	}

	public List<Recipe> getListRecipes() {
		return listRecipes;
	}

	public void setListRecipes(List<Recipe> listRecipes) {
		this.listRecipes = listRecipes;
	}


	

}
