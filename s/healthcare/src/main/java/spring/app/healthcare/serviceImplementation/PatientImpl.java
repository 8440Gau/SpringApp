package spring.app.healthcare.serviceImplementation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.app.healthcare.dto.PatientDetailsDTO;
import spring.app.healthcare.entity.PatientEntity;
import spring.app.healthcare.exception.PatientPostApisException;
import spring.app.healthcare.repository.PatientRepository;
import spring.app.healthcare.service.PatientService;

@Service
public class PatientImpl implements PatientService {
	@Autowired
	PatientRepository patientRepository;

	@Override
	public PatientEntity addPatient(PatientDetailsDTO patientDetailsDTO) throws PatientPostApisException {
		List<PatientEntity> entity = patientRepository.findByname(patientDetailsDTO.getName());
		System.out.println("entity " + entity);
		if (!entity.isEmpty()) {
			throw new PatientPostApisException("404", "Data ALready Exits");
		} else {
			PatientEntity pentity = new PatientEntity();
			pentity.setName(patientDetailsDTO.getName());
			pentity.setAge(patientDetailsDTO.getAge());
			pentity.setAddress(patientDetailsDTO.getAddress());
			return patientRepository.save(pentity);
		}

	}

	@Override
	public List<PatientDetailsDTO> findAllPatient() {
		List<PatientEntity> entity = patientRepository.findAll();
		List<PatientDetailsDTO> patientdetailsDTOs = new ArrayList<>();
		ModelMapper modelMapper = new ModelMapper();
		entity.stream().filter(Objects::nonNull).forEach(fetchPatientDeatails -> {
			PatientDetailsDTO detailsDTO = modelMapper.map(fetchPatientDeatails, PatientDetailsDTO.class);
			patientdetailsDTOs.add(detailsDTO);
		});
		return patientdetailsDTOs;
	}

	@Override
	public PatientDetailsDTO findSinglePatient(long patientid) {
		PatientEntity patientEntity = patientRepository.findBypatientId(patientid);
		System.out.println(patientEntity);
		ModelMapper modelMapper = new ModelMapper();
		PatientDetailsDTO patientDetailsDTO = modelMapper.map(patientEntity, PatientDetailsDTO.class);
		return patientDetailsDTO;
	}

	@Override
	public List<PatientDetailsDTO> deleteRecord(long deleteid) {
		List<PatientEntity> patientEntity = patientRepository.findAll();
		while(patientEntity.listIterator().hasNext()) {
			System.out.println("patientEntity.listIterator().hasNext() "+ patientEntity.listIterator().hasNext());
			for(int i=0; i<patientEntity.size();i++) {
				
			}
		}
		return null;

	}
	
}