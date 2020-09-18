package pe.edu.upc.serviceinterface;

import java.util.List;

import pe.edu.upc.entity.Specialties;

public interface ISpecialtiesService {
	
	public void insert(Specialties especialidad);
	public List<Specialties> list();
	public void update(Specialties especialidad);
	public void delete(Specialties especialidad);

}
