package pe.edu.upc.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "Patient")
@PrimaryKeyJoinColumn(referencedColumnName = "idPatient")
public class Patient extends UserCit {

	@Column(name = "allergyPatient", length = 50)
	private String allergyPatient;
	

	@ManyToOne
	@JoinColumn(name="idHistory_Patient")
	private History_Patient historialPatient;

	public String getAllergyPatient() {
		return allergyPatient;
	}

	public void setAllergyPatient(String allergyPatient) {
		this.allergyPatient = allergyPatient;
	}

	public History_Patient getHistory_Patient() {
		return historialPatient;
	}

	public void setIdHistory_Patient(History_Patient historialPatient) {
		this.historialPatient = historialPatient;
	}

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Patient(int idUser, int dniUser, String usernameUser, String passwordUser, String nameUser,
			String lastNameUser, Date birthdateUser, String adressUser, int cellUser, String emailUser,
			String genUser) {
		super(idUser, dniUser, usernameUser, passwordUser, nameUser, lastNameUser, birthdateUser, adressUser, cellUser,
				emailUser, genUser);
		// TODO Auto-generated constructor stub
	}

}
