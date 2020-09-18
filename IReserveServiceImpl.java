package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerface.IReserveDao;
import pe.edu.upc.entity.Reserve;
import pe.edu.upc.serviceinterface.IReserveService;

@Named
@RequestScoped
public class IReserveServiceImpl implements IReserveService {

	@Inject
	private IReserveDao rD;

	@Override
	public void insert(Reserve reserva) {
		rD.insert(reserva);

	}

	@Override
	public List<Reserve> list() {

		return rD.list();
	}

	@Override
	public void delete(Reserve reserva) {

		rD.delete(reserva);

	}

	@Override
	public void update(Reserve reserva) {
		rD.update(reserva);

	}

}
