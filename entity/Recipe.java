package pe.edu.upc.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Recipe")
public class Recipe {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idRecipe;
	
	@Column(name="descRecipe",nullable=false)
	private String descRecipe;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="idRecipe")
	private Reserve idReserve;
	

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descRecipe == null) ? 0 : descRecipe.hashCode());
		result = prime * result + idRecipe;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Recipe other = (Recipe) obj;
		if (descRecipe == null) {
			if (other.descRecipe != null)
				return false;
		} else if (!descRecipe.equals(other.descRecipe))
			return false;
		if (idRecipe != other.idRecipe)
			return false;
		return true;
	}
	
	

}
