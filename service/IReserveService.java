package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Reserve;

public interface IReserveService {
	public void insert (Reserve reserva);
	public List<Reserve>list();
	public void update(Reserve reserva);
	public void delete(int idReserva);
	public List<Reserve>findby(Reserve reserva);

}
