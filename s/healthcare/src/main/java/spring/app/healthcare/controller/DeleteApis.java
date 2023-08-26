package spring.app.healthcare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import spring.app.healthcare.service.PatientService;

@RestController
@RequestMapping(value="/deleteRecord")
public class DeleteApis {
	@Autowired
	PatientService ipatientService;
	
	@RequestMapping(value="/delete/{deleteid}", method = RequestMethod.DELETE)
	public ResponseEntity deleteRecord(@PathVariable long deleteid) {
		return null;
		
	}

}
