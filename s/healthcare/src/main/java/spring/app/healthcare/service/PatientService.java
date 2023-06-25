package spring.app.healthcare.service;

import spring.app.healthcare.dto.PatientDetailsDTO;
import spring.app.healthcare.entity.PatientEntity;

public interface PatientService {

	public PatientEntity addPatient(PatientDetailsDTO patientDetailsDTO) throws Exception;
}
