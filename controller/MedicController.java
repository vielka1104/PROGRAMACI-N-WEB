package pe.edu.upc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Medic;
import pe.edu.upc.service.IMedicService;

@Named
@RequestScoped
public class MedicController {

	@Inject
	private IMedicService mService;
	
	private Medic m;
	
	List <Medic> listMedic;
	
	@PostConstruct
	public void innt() {
		this.m = new Medic();
		this.listMedic = new ArrayList<Medic>();
		this.listMedic();
	}
	
	public String newMedic() {
		this.setM(new Medic());
		return "Medic.html";

	}
	
	public void insert() {
		try {
			mService.insert(m);
			this.listMedic();
		} catch (Exception e) {
			System.out.println("Error al insertar en el controller");
		}
	}
	
	public void listMedic() {
		try {
			listMedic = mService.list();
		} catch (Exception e) {
			System.out.println("Error al listar en el controller");
		}
	}
	
	public String goUpdate(Medic medico) {

		this.setM(medico);
		return "updateMedic.xhtml";
	}
	
	public void update() {
		try {
			mService.update(this.m);
		} catch (Exception e) {
			System.out.println("Error al actualizar en el controller");
		}

	}
		
	public void delete(Medic medico) {
		try {
			mService.delete(medico.getIdMedic());
		} catch (Exception e) {
			System.out.println("Error al eliminar en el controler");
		}
	}
	
	public void findBy() {
		try {
			if (m.getUniMedic().isEmpty()) {
				listMedic = this.mService.list();

			} else {
				listMedic = this.mService.findby(this.getM());
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public Medic getM() {
		return m;
	}

	public void setM(Medic m) {
		this.m = m;
	}

	public List<Medic> getListMedic() {
		return listMedic;
	}

	public void setListMedic(List<Medic> listMedic) {
		this.listMedic = listMedic;
	}
	
	

}
