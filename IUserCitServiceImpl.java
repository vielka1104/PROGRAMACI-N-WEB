package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerface.IUserCitDao;
import pe.edu.upc.entity.UserCit;
import pe.edu.upc.serviceinterface.IUserCitService;


@Named
@RequestScoped
public class IUserCitServiceImpl implements IUserCitService {
	
	@Inject
	private IUserCitDao uD;

	@Override
	public void insert(UserCit usuario) {
		uD.insert(usuario);
		
	}

	@Override
	public List<UserCit> list() {
		// TODO Auto-generated method stub
		return uD.list();
	}

	public void update(UserCit usuario) {
		uD.update(usuario);
	}

	public void delete(UserCit usuario) {
		uD.update(usuario);
		
	}

}
