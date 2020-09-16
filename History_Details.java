package pe.edu.upc.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="History_Details")
public class History_Details {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idDetails;
	
	@ManyToOne
	@JoinColumn(name="idReserve",nullable=false)
	private Reserve idReserve;
	
	@ManyToOne
	@JoinColumn(name="idDetails", nullable=false)
	private History_Patient idHistory_Patient;
	

	public History_Details() {
		super();
		// TODO Auto-generated constructor stub
	}

	public History_Details(int idDetails, Reserve idReserve, History_Patient idHistory_Patient) {
		super();
		this.idDetails = idDetails;
		this.idReserve = idReserve;
		this.idHistory_Patient = idHistory_Patient;
	}

	public int getIdDetails() {
		return idDetails;
	}

	public void setIdDetails(int idDetails) {
		this.idDetails = idDetails;
	}

	public Reserve getIdReserve() {
		return idReserve;
	}

	public void setIdReserve(Reserve idReserve) {
		this.idReserve = idReserve;
	}

	public History_Patient getIdHistory_Patient() {
		return idHistory_Patient;
	}

	public void setIdHistory_Patient(History_Patient idHistory_Patient) {
		this.idHistory_Patient = idHistory_Patient;
	}

	
	
	

}
