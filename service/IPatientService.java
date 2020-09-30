package pe.edu.upc.service;

import java.util.List;
import java.util.Optional;

import pe.edu.upc.entity.Patient;



public interface IPatientService {
	Integer insert(Patient customer) throws Exception;

	Integer update(Patient customer) throws Exception;

	Integer delete(Patient customer) throws Exception;

	List<Patient> getAll() throws Exception;

	Optional<Patient> getOne(Patient customer) throws Exception;

	List<Patient> findCustomerByName(String name) throws Exception;

	Optional<Patient> findCustomerByDni(String dni) throws Exception;

}
