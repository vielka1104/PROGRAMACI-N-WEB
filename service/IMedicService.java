package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Medic;

public interface IMedicService {
	
	public void insert(Medic medico);
	public List<Medic> list();
	public void update(Medic medico);
	public void delete(int idUser);
	public List<Medic>findby(Medic medico);
}
