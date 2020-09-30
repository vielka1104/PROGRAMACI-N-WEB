package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;


import pe.edu.upc.dao.IPatientDao;
import pe.edu.upc.entity.Patient;
import pe.edu.upc.service.IPatientService;


@Named
public class PatientServiceImpl implements IPatientService, Serializable {

	private static final long serialVersionUID = 1L;
	@Inject
	private IPatientDao cD;

	@Transactional
	@Override
	public Integer insert(Patient t) throws Exception {
		return cD.insert(t);
	}

	@Transactional
	@Override
	public Integer update(Patient t) throws Exception {
		return cD.update(t);
	}

	@Transactional
	@Override
	public Integer delete(Patient t) throws Exception {
		return cD.delete(t);
	}

	@Override
	public List<Patient> getAll() throws Exception {
		return cD.findAll();
	}

	@Override
	public Optional<Patient> getOne(Patient t) throws Exception {
		return cD.findById(t);
	}

	@Override
	public List<Patient> findCustomerByName(String name) throws Exception {
		return cD.findByName(name);
	}

	@Override
	public Optional<Patient> findCustomerByDni(String dni) throws Exception {
		return cD.findByDni(dni);
	}
}
