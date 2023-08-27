package spring.app.healthcare.dto;

public class PatientDetailsDTO {

	private String name;
	private String age;
	private String Address;
	
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
	@Override
	public String toString() {
		return "PatientDetailsDTO [name=" + name + ", age=" + age + ", Address=" + Address + "]";
	}
	
	
	
	
}
