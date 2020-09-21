package pe.edu.upc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.UserCit;
import pe.edu.upc.serviceinterface.IUserCitService;

@Named
@RequestScoped
public class UserCitController {

	@Inject
	private IUserCitService uService;

	private UserCit u;

	List<UserCit> listUserCit;

	@PostConstruct
	public void innit() {

		this.u = new UserCit();
		this.listUserCit = new ArrayList<UserCit>();

		this.list();
	}

	public void list() {
		// TODO Auto-generated method stub

	}

	public String newUserCit() {
		this.setU(new UserCit());
		return "laboratory.html";

	}

	public void insert() {

		try {
			uService.insert(u);
			this.list();
			this.cleanUserCit();
		} catch (Exception e) {
			System.out.println("Error al insertar en el controller");
		}

	}

	public IUserCitService getuService() {
		return uService;
	}

	public void setuService(IUserCitService uService) {
		this.uService = uService;
	}

	public UserCit getU() {
		return u;
	}

	public void setU(UserCit u) {
		this.u = u;
	}

	public List<UserCit> getListUserCit() {
		return listUserCit;
	}

	public void setListUserCit(List<UserCit> listUserCit) {
		this.listUserCit = listUserCit;
	}

	public void cleanUserCit() {
		this.innit();
	}

}
