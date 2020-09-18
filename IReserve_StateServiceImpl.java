package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerface.IReserve_StateDao;
import pe.edu.upc.entity.Reserve_State;
import pe.edu.upc.serviceinterface.IReserve_StateService;

@Named
@RequestScoped
public class IReserve_StateServiceImpl implements IReserve_StateService {
	
	@Inject
	private IReserve_StateDao rsD;

	@Override
	public void insert(Reserve_State estado) {
		rsD.insert(estado);
		
	}

	@Override
	public List<Reserve_State> list() {
		
		return rsD.list();
	}

	@Override
	public void update(Reserve_State estado) {
		rsD.update(estado);
		
	}

	@Override
	public void delete(Reserve_State estado) {
		
		rsD.delete(estado);
		
	}

}
