package spring.app.healthcare.serviceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.app.healthcare.dto.PatientDetailsDTO;
import spring.app.healthcare.entity.PatientEntity;
import spring.app.healthcare.repository.PatientRepository;
import spring.app.healthcare.service.PatientService;

@Service
public class PatientImpl implements PatientService {
	@Autowired
	PatientRepository patientRepository;

	@Override
	public PatientEntity addPatient(PatientDetailsDTO patientDetailsDTO) throws Exception {
		List<PatientEntity> entity = patientRepository.findByname(patientDetailsDTO.getName());
		if(!entity.isEmpty())
		{
			throw new Exception("Alert");
		}else {
			PatientEntity pentity = new PatientEntity();
			pentity.setName(patientDetailsDTO.getName());
			pentity.setAge(patientDetailsDTO.getAge());
			pentity.setAddress(patientDetailsDTO.getAddress());
			 return patientRepository.save(pentity);
		}
		  
	}
}
