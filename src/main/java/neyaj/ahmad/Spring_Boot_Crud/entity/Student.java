package neyaj.ahmad.Spring_Boot_Crud.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="student1")
public class Student {
	
	@Id
	private String name;
	private String address;
	private String phone;
	private String dob;
	public Student() {}
	public Student(String name, String address, String phone, String dob) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.dob = dob;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	
	
	
	

}
