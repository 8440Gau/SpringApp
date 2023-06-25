package spring.app.healthcare.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import spring.app.healthcare.entity.PatientEntity;

@Repository
public interface PatientRepository extends JpaRepository<PatientEntity, Long> {
	
	//@Query("Select p from PATIENT_DETAILS p where p.patient_address=? AND p.patient_name =? ")
	List<PatientEntity> findByname(String name);

}
