package pe.edu.upc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Reserve_State")
public class Reserve_State {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idReserveState;
	
	@Column(name="nameReserve",nullable=false, length=10)
	private String nameReserve;
	
	public Reserve_State() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Reserve_State(int idReserveState, String nameReserve) {
		super();
		this.idReserveState = idReserveState;
		this.nameReserve = nameReserve;
	}
	public int getIdReserveState() {
		return idReserveState;
	}
	public void setIdReserveState(int idReserveState) {
		this.idReserveState = idReserveState;
	}
	public String getNameReserve() {
		return nameReserve;
	}
	public void setNameReserve(String nameReserve) {
		this.nameReserve = nameReserve;
	}
	
	
	
	
}
