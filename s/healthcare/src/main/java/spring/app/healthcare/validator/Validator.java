package spring.app.healthcare.validator;

import spring.app.healthcare.dto.PatientDetailsDTO;

public class Validator {

	public String verifyField(PatientDetailsDTO patientDetailsDTO) {
		StringBuffer errormessage = new StringBuffer();
		
		if (patientDetailsDTO.getName().length() == 0) {
			errormessage.append("Name must not be null,");
		}
		else if (patientDetailsDTO.getAddress().length() > 20) {
			errormessage.append("Address must be within 10 char,");
		}
		else if( patientDetailsDTO.getAddress().length() ==0) {
			errormessage.append("lenght is Zero,");
		}else{
			
		}
		return errormessage.toString();
	}

}
