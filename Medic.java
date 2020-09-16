package pe.edu.upc.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "Medic")
@PrimaryKeyJoinColumn(referencedColumnName = "idMedic")
public class Medic extends UserCit {

	@Column(name = "numcmpMedic", nullable = false, unique = true)
	private int numcmpMedic;
	
	@Column(name="uniMedic",nullable=false, length=50)
	private String uniMedic;

	@ManyToOne
	@JoinColumn(name = "idSpeciality", nullable = false)
	private Specialties speciality;

	public Medic() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Medic(int idUser, int dniUser, String usernameUser, String passwordUser, String nameUser,
			String lastNameUser, Date birthdateUser, String adressUser, int cellUser, String emailUser,
			String genUser) {
		super(idUser, dniUser, usernameUser, passwordUser, nameUser, lastNameUser, birthdateUser, adressUser, cellUser,
				emailUser, genUser);
		// TODO Auto-generated constructor stub
	}

	public Medic(int numcmpMedic, Specialties speciality) {
		super();
		this.numcmpMedic = numcmpMedic;
		this.speciality = speciality;
	}

	public int getNumcmpMedic() {
		return numcmpMedic;
	}

	public void setNumcmpMedic(int numcmpMedic) {
		this.numcmpMedic = numcmpMedic;
	}

	public Specialties getSpeciality() {
		return speciality;
	}

	public void setSpeciality(Specialties speciality) {
		this.speciality = speciality;
	}

}
