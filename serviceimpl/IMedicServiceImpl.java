package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IMedicDao;
import pe.edu.upc.entity.Medic;
import pe.edu.upc.service.IMedicService;

@Named
@RequestScoped
public class IMedicServiceImpl implements IMedicService{
	
	@Inject
	private IMedicDao mD;

	@Override
	public void insert(Medic medico) {
		mD.insert(medico);
		
	}

	@Override
	public List<Medic> list() {
		return mD.list();
	}

	@Override
	public void update(Medic medico) {
		mD.update(medico);
		
	}

	@Override
	public void delete(int idUser) {
		mD.delete(idUser);
		
	}

	@Override
	public List<Medic> findby(Medic medico) {
		return mD.findby(medico);
	}

}
