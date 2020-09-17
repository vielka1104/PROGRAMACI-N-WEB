package pe.edu.upc.serviceinterface;

import java.util.List;

import pe.edu.upc.entity.UserCit;

public interface IUserCitService {
	
	public void insert(UserCit usuario);
	
	public List<UserCit> list();
	
	public void update(UserCit usuario);
	
	public void delete(UserCit usuario);

}
