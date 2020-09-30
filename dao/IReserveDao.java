package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Reserve;

public interface IReserveDao {
	
	public void insert (Reserve reserva);
	public List<Reserve>list();
	public void update(Reserve reserva);
	public void delete(int idReserva);
	public List<Reserve>findby(Reserve reserva);

}
