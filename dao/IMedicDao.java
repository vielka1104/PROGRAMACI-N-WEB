package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Medic;

public interface IMedicDao {
	public void insert(Medic medico);
	public List<Medic> list();
	public void update(Medic medico);
	public void delete(int idUser);
	public List<Medic>findby(Medic medico);
	

}
