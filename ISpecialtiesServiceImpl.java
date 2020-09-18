package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerface.ISpecialtiesDao;
import pe.edu.upc.entity.Specialties;
import pe.edu.upc.serviceinterface.ISpecialtiesService;

@Named
@RequestScoped
public class ISpecialtiesServiceImpl implements ISpecialtiesService {
	
	
	@Inject
	private ISpecialtiesDao sD;

	public void insert(Specialties especialidad) {
		
		sD.insert(especialidad);
	}

	public List<Specialties> list() {
	
		return sD.list();
	}

	public void update(Specialties especialidad) {
		sD.update(especialidad);
		
	}

	public void delete(Specialties especialidad) {
		sD.delete(especialidad);
		
	}

}
