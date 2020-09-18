package pe.edu.upc.daointerface;

import java.util.List;

import pe.edu.upc.entity.Reserve_State;

public interface IReserve_StateDao {
	
	public void insert(Reserve_State estado);
	public List<Reserve_State> list();
	public void update(Reserve_State estado);
	public void delete(Reserve_State estado);

}
