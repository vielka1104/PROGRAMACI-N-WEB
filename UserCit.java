package pe.edu.upc.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="UserCit")
@Inheritance(strategy = InheritanceType.JOINED)

public class UserCit {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idUser;
	
	@Column(name="dniUser",nullable=false,unique=true)
	private int dniUser;
	
	@Column(name="usernameUser",nullable=false,unique=true,length=45)
	private String usernameUser;
	
	@Column(name="passwordUser",nullable=false,length=45)
	private String passwordUser;
	
	@Column(name="nameUser",nullable=false,length=50)
	private String nameUser;
	
	@Column(name="lastNameUser",nullable=false,length=50)
	private String lastNameUser;
	
	@Column(name="birthdateUser",nullable=false)
	private Date birthdateUser;
	
	@Column(name="adressUser",nullable=false,length=200)
	private String adressUser;
	
	@Column(name="cellUser",nullable=false,unique=true)
	private int  cellUser;
	
	@Column(name="emailUser",nullable=false,unique=true,length=30)
	private String emailUser;
	
	@Column(name="genUser",nullable=false,length=1)
	private String genUser;
	
	
	
	public UserCit() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserCit(int idUser, int dniUser, String usernameUser, String passwordUser, String nameUser,
			String lastNameUser, Date birthdateUser, String adressUser, int cellUser, String emailUser,
			String genUser) {
		super();
		this.idUser = idUser;
		this.dniUser = dniUser;
		this.usernameUser = usernameUser;
		this.passwordUser = passwordUser;
		this.nameUser = nameUser;
		this.lastNameUser = lastNameUser;
		this.birthdateUser = birthdateUser;
		this.adressUser = adressUser;
		this.cellUser = cellUser;
		this.emailUser = emailUser;
		this.genUser = genUser;
	}
	public int getIdUser() {
		return idUser;
	}
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	public int getDniUser() {
		return dniUser;
	}
	public void setDniUser(int dniUser) {
		this.dniUser = dniUser;
	}
	public String getUsernameUser() {
		return usernameUser;
	}
	public void setUsernameUser(String usernameUser) {
		this.usernameUser = usernameUser;
	}
	public String getPasswordUser() {
		return passwordUser;
	}
	public void setPasswordUser(String passwordUser) {
		this.passwordUser = passwordUser;
	}
	public String getNameUser() {
		return nameUser;
	}
	public void setNameUser(String nameUser) {
		this.nameUser = nameUser;
	}
	public String getLastNameUser() {
		return lastNameUser;
	}
	public void setLastNameUser(String lastNameUser) {
		this.lastNameUser = lastNameUser;
	}
	public Date getBirthdateUser() {
		return birthdateUser;
	}
	public void setBirthdateUser(Date birthdateUser) {
		this.birthdateUser = birthdateUser;
	}
	public String getAdressUser() {
		return adressUser;
	}
	public void setAdressUser(String adressUser) {
		this.adressUser = adressUser;
	}
	public int getCellUser() {
		return cellUser;
	}
	public void setCellUser(int cellUser) {
		this.cellUser = cellUser;
	}
	public String getEmailUser() {
		return emailUser;
	}
	public void setEmailUser(String emailUser) {
		this.emailUser = emailUser;
	}
	public String getGenUser() {
		return genUser;
	}
	public void setGenUser(String genUser) {
		this.genUser = genUser;
	}
	
	
	

}
