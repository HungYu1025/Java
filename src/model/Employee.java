package model;

import java.io.Serializable;

public class Employee implements Serializable{
	private Integer id; 
	private String employeeusername;
	private String password;
	private String employeename;
	private String gender;
	private String city;
	private String area;
	private String road;
	private String email;
	private String phone;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String employeeusername, String password, String employeename, String gender, String city, String area,
			String road, String email, String phone) {
		super();
		this.employeeusername = employeeusername;
		this.password = password;
		this.employeename = employeename;
		this.gender = gender;
		this.city = city;
		this.area = area;
		this.road = road;
		this.email = email;
		this.phone = phone;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEmployeeusername() {
		return employeeusername;
	}

	public void setEmployeeusername(String employeeusername) {
		this.employeeusername = employeeusername;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getRoad() {
		return road;
	}
	public void setRoad(String road) {
		this.road = road;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

}