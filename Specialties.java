package pe.edu.upc.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Specialties")
public class Specialties {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idSpecialty;

	@Column(name="nameSpecialty",nullable=false, length=45)
	private String nameSpecialty;

	public Specialties() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Specialties(int idSpecialty, String nameSpecialty) {
		super();
		this.idSpecialty = idSpecialty;
		this.nameSpecialty = nameSpecialty;
	}

	public int getIdSpecialty() {
		return idSpecialty;
	}

	public void setIdSpecialty(int idSpecialty) {
		this.idSpecialty = idSpecialty;
	}

	public String getNameSpecialty() {
		return nameSpecialty;
	}

	public void setNameSpecialty(String nameSpecialty) {
		this.nameSpecialty = nameSpecialty;
	}

}
