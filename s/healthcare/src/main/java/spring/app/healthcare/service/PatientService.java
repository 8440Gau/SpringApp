package spring.app.healthcare.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

import spring.app.healthcare.dto.PatientDetailsDTO;
import spring.app.healthcare.entity.PatientEntity;
import spring.app.healthcare.exception.PatientPostApisException;

public interface PatientService {

	public PatientEntity addPatient(PatientDetailsDTO patientDetailsDTO) throws PatientPostApisException;

	public List<PatientDetailsDTO> findAllPatient();

	public PatientDetailsDTO findSinglePatient(long patientid);
	
	public List<PatientDetailsDTO> deleteRecord( long deleteid);
}
