package pe.edu.upc.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="Reserve")
public class Reserve {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idReserve;
	
	@Column(name="descriptionReserve",nullable=false,length=50)
	private String descriptionReserve;
	
	@Column(name="dateReserve",nullable=false)
	private Date dateReserve;
	
	@Column(name="hourReserve",nullable=false)
	private java.sql.Date hourReserve;
	
	
	@ManyToOne
	@JoinColumn(name="idReserveState")
	private Reserve_State reservaState;
	
	@ManyToOne
	@JoinColumn(name="idMedic")
	private Medic medico;
	
	@ManyToOne
	@JoinColumn(name="idPatient")
	private Patient paciente;

	@ManyToOne
	@JoinColumn(name="idRecipe")
	private Recipe idRecipe;

	public Reserve() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Reserve(int idReserve, String descriptionReserve, Date dateReserve, java.sql.Date hourReserve,
			Reserve_State reservaState, Medic medico, Patient paciente, Recipe idRecipe) {
		super();
		this.idReserve = idReserve;
		this.descriptionReserve = descriptionReserve;
		this.dateReserve = dateReserve;
		this.hourReserve = hourReserve;
		this.reservaState = reservaState;
		this.medico = medico;
		this.paciente = paciente;
		this.idRecipe = idRecipe;
	}

	public int getIdReserve() {
		return idReserve;
	}

	public void setIdReserve(int idReserve) {
		this.idReserve = idReserve;
	}

	public String getDescriptionReserve() {
		return descriptionReserve;
	}

	public void setDescriptionReserve(String descriptionReserve) {
		this.descriptionReserve = descriptionReserve;
	}

	public Date getDateReserve() {
		return dateReserve;
	}

	public void setDateReserve(Date dateReserve) {
		this.dateReserve = dateReserve;
	}

	public java.sql.Date getHourReserve() {
		return hourReserve;
	}

	public void setHourReserve(java.sql.Date hourReserve) {
		this.hourReserve = hourReserve;
	}

	public Reserve_State getReservaState() {
		return reservaState;
	}

	public void setReservaState(Reserve_State reservaState) {
		this.reservaState = reservaState;
	}

	public Medic getMedico() {
		return medico;
	}

	public void setMedico(Medic medico) {
		this.medico = medico;
	}

	public Patient getPaciente() {
		return paciente;
	}

	public void setPaciente(Patient paciente) {
		this.paciente = paciente;
	}

	public Recipe getIdRecipe() {
		return idRecipe;
	}

	public void setIdRecipe(Recipe idRecipe) {
		this.idRecipe = idRecipe;
	}
	
	
	


}
