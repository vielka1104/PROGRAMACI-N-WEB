package pe.edu.upc.daointerface;

import java.util.List;

import pe.edu.upc.entity.Reserve;

public interface IReserveDao {
	
	public void insert (Reserve reserva);
	public List<Reserve>list();
	public void delete(Reserve reserva);
	public void update(Reserve reserva);

}
