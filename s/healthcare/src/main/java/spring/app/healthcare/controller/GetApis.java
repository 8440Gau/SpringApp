package spring.app.healthcare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import spring.app.healthcare.dto.PatientDetailsDTO;
import spring.app.healthcare.exception.PatientPostApisException;
import spring.app.healthcare.service.PatientService;

@RestController
@RequestMapping(value ="FetchPatientDetails")
public class GetApis {
	@Autowired
	PatientService patientService;
	
	@RequestMapping(value= "/fetchPatients", method = RequestMethod.GET)
	public ResponseEntity  findAllPatient(){
    List<PatientDetailsDTO> fetchAll = patientService.findAllPatient();
	return ResponseEntity.ok(fetchAll);
     
	}
	
	@RequestMapping(value= "/fetchSingleRecord/{patientid}", method = RequestMethod.GET)
	public ResponseEntity findSinglePatient(@PathVariable long patientid){
		System.out.println("inside");
    PatientDetailsDTO fetchOneRecord = patientService.findSinglePatient(patientid);
	return ResponseEntity.ok(fetchOneRecord);
     
	}
}
