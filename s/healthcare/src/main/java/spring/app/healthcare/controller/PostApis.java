package spring.app.healthcare.controller;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import spring.app.healthcare.dto.MessageDTO;
import spring.app.healthcare.dto.PatientDetailsDTO;
import spring.app.healthcare.exception.PatientPostApisException;
import spring.app.healthcare.service.PatientService;
import spring.app.healthcare.validator.Validator;

@RestController
@RequestMapping(value = "patient")

public class PostApis {
	@Autowired
	private PatientService patientService;
	private static Logger logger = LoggerFactory.getLogger(PostApis.class);

	@RequestMapping(value = "addpatient", method = { RequestMethod.POST, RequestMethod.GET })
	public ResponseEntity addpatient(@RequestBody PatientDetailsDTO patientDetailsDTO) {
		Validator validator = new Validator();
		String errormsg = validator.verifyField(patientDetailsDTO);
        Arrays.asList(errormsg.split("," )).stream().forEach(p-> logger.error(p));
	   if(errormsg.length()==0 ) {
		   try {
			return ResponseEntity.ok(patientService.addPatient(patientDetailsDTO));
		   }catch(PatientPostApisException p) {
			   return ResponseEntity.badRequest().body(p.getErrorMessage());
		   }
	   }
	   return ResponseEntity.badRequest().body(errormsg);   
	}

}
