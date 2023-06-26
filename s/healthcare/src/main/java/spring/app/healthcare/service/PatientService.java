package spring.app.healthcare.service;

import spring.app.healthcare.dto.PatientDetailsDTO;
import spring.app.healthcare.entity.PatientEntity;
import spring.app.healthcare.exception.PatientPostApisException;

public interface PatientService {

	public PatientEntity addPatient(PatientDetailsDTO patientDetailsDTO) throws PatientPostApisException;
}
