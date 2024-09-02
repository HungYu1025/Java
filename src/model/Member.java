package model;

import java.io.Serializable;

public class Member implements Serializable{
	private Integer id;
	private String username;
	private String password;
	private String membername;
	private String gender;
	private String city;
	private String area;
	private String road;
	private String email;
	private String phone;

	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Member(String username, String password, String membername, String gender, String city, String area,
			String road, String email, String phone) {
		super();
		this.username = username;
		this.password = password;
		this.membername = membername;
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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username =username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMembername() {
		return membername;
	}

	public void setMembername(String membername) {
		this.membername = membername;
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
