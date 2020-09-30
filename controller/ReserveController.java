package pe.edu.upc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Medic;
import pe.edu.upc.entity.Reserve;
import pe.edu.upc.service.IMedicService;
import pe.edu.upc.service.IReserveService;

@Named
@RequestScoped
public class ReserveController {
	
	@Inject
	private IReserveService rService;
	
	@Inject
	private IMedicService mService;
	
	private Reserve re;
	
	private Medic m;
	
	List<Reserve> listReserve;
	
	List<Medic> listMedic;
	
	@PostConstruct
	public void innit() {

		this.re = new Reserve();
		this.listReserve = new ArrayList<Reserve>();
		this.listMedic=new ArrayList<Medic>();
		this.listReserve();
		this.listMedic();
	}

	public String newReserve() {
		this.setRe(new Reserve());
		return "registraCita.html";

	}

	public void insert() {
		try {
			rService.insert(re);
			this.listReserve();
		} catch (Exception e) {
			System.out.println("Error al insertar receta en el controller");
		}

	}

		
	public void listReserve() {
		try {
			listReserve=rService.list();
		} catch (Exception e) {
			System.out.println("Error al listar especialidades en el controller");
		}
	}
	
	public void listMedic() {
		try {
			listMedic = mService.list();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public String goUpdate(Reserve reserve){
		
		this.setRe(reserve);
		return "ModificarReceta.xhtml";
	}

	public void update() {
		try {
			rService.update(this.re);
		} catch (Exception e) {
			System.out.println("Error al actualizar receta en el controller");
		}

	}
	
	public void delete(Reserve reserve) {
		try {
			rService.delete(re.getIdReserve());
			this.listReserve();
		} catch (Exception e) {
			System.out.println("Error al eliminar receta en el controller");
		}
	}
	
	public void findby() {
		try {
			if (re.getPaciente().getName().isEmpty()) {
				listReserve = this.rService.list();

			} else {
				listReserve = this.rService.findby(this.getRe());
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		
	}

	public void cleanSpecialties() {
		this.innit();
	}

	

	public List<Reserve> getListReserve() {
		return listReserve;
	}

	public void setListReserve(List<Reserve> listReserve) {
		this.listReserve = listReserve;
	}

	public Reserve getRe() {
		return re;
	}

	public void setRe(Reserve re) {
		this.re = re;
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
