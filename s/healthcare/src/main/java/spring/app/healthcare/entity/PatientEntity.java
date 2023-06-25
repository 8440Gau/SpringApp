package spring.app.healthcare.entity;

import java.io.Serializable;

import org.hibernate.boot.jaxb.hbm.internal.RepresentationModeConverter;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="PATIENT_DETAILS", schema ="springapp")
public class PatientEntity extends RepresentationModeConverter implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="PATIENT_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int patientId;
	@Column(name="PATIENT_NAME")
	private String name;
	@Column(name="PATIENT_AGE")
	private String age;
	@Column(name="PATIENT_ADDRESS")
	private String Address;
	
	
	
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "PatientDAO [patientId=" + patientId + ", name=" + name + ", age=" + age + ", Address=" + Address + "]";
	}
	
	
	

}
