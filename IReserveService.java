package pe.edu.upc.serviceinterface;

import java.util.List;

import pe.edu.upc.entity.Reserve;

public interface IReserveService {
	public void insert (Reserve reserva);
	public List<Reserve>list();
	public void delete(Reserve reserva);
	public void update(Reserve reserva);

}
