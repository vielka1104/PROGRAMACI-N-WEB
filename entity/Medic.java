package pe.edu.upc.entity;




import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Medic")
public class Medic {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idMedic;

	@Column(name = "numcmpMedic", nullable = false, unique = true)
	private int numcmpMedic;
	
	@Column(name="uniMedic",nullable=false, length=50)
	private String uniMedic;

	@Column(name="speciality",nullable=false, length=50)
	private String speciality;
	
	@Column(name="nameMedic",nullable=false, length=50)
	private String nameMedic;
	
	
	
	
	public Medic() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Medic(int idMedic, int numcmpMedic, String uniMedic, String speciality) {
		super();
		this.idMedic = idMedic;
		this.numcmpMedic = numcmpMedic;
		this.uniMedic = uniMedic;
		this.speciality = speciality;
	}



	public int getIdMedic() {
		return idMedic;
	}




	public void setIdMedic(int idMedic) {
		this.idMedic = idMedic;
	}




	public int getNumcmpMedic() {
		return numcmpMedic;
	}




	public void setNumcmpMedic(int numcmpMedic) {
		this.numcmpMedic = numcmpMedic;
	}




	public String getUniMedic() {
		return uniMedic;
	}




	public void setUniMedic(String uniMedic) {
		this.uniMedic = uniMedic;
	}




	public String getSpeciality() {
		return speciality;
	}




	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}








	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idMedic;
		result = prime * result + numcmpMedic;
		result = prime * result + ((speciality == null) ? 0 : speciality.hashCode());
		result = prime * result + ((uniMedic == null) ? 0 : uniMedic.hashCode());
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
		Medic other = (Medic) obj;
		if (idMedic != other.idMedic)
			return false;
		if (numcmpMedic != other.numcmpMedic)
			return false;
		if (speciality == null) {
			if (other.speciality != null)
				return false;
		} else if (!speciality.equals(other.speciality))
			return false;
		if (uniMedic == null) {
			if (other.uniMedic != null)
				return false;
		} else if (!uniMedic.equals(other.uniMedic))
			return false;
		return true;
	}









	

	
	

}
