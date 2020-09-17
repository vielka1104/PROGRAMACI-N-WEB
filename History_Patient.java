package pe.edu.upc.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "History_Patient")
public class History_Patient {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idHistory_Patient;
	
	@Column(name="monthHistory", nullable=false)
	private Date monthHistory;

	public History_Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public History_Patient(int idHistory_Patient, Date monthHistory) {
		super();
		this.idHistory_Patient = idHistory_Patient;
		this.monthHistory = monthHistory;
	}

	public int getIdHistory_Patient() {
		return idHistory_Patient;
	}

	public void setIdHistory_Patient(int idHistory_Patient) {
		this.idHistory_Patient = idHistory_Patient;
	}

	public Date getMonthHistory() {
		return monthHistory;
	}

	public void setMonthHistory(Date monthHistory) {
		this.monthHistory = monthHistory;
	}


	

	
	
	

}
