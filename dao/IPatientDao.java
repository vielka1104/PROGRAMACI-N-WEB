package pe.edu.upc.dao;

import java.util.List;
import java.util.Optional;


import pe.edu.upc.entity.Patient;

public interface IPatientDao {
	Integer insert(Patient customer) throws Exception;

	Integer update(Patient customer) throws Exception;

	Integer delete(Patient customer) throws Exception;

	List<Patient> findAll() throws Exception;

	Optional<Patient> findById(Patient customer) throws Exception;

	List<Patient> findByName(String name) throws Exception;

	Optional<Patient> findByDni(String dni) throws Exception;
}