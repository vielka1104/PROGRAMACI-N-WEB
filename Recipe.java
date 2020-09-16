package pe.edu.upc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Recipe")
public class Recipe {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idRecipe;
	
	@Column(name="descRecipe",nullable=false)
	private String descRecipe;

	public Recipe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Recipe(int idRecipe, String descRecipe) {
		super();
		this.idRecipe = idRecipe;
		this.descRecipe = descRecipe;
	}

	public int getIdRecipe() {
		return idRecipe;
	}

	public void setIdRecipe(int idRecipe) {
		this.idRecipe = idRecipe;
	}

	public String getDescRecipe() {
		return descRecipe;
	}

	public void setDescRecipe(String descRecipe) {
		this.descRecipe = descRecipe;
	}
	
	

}
