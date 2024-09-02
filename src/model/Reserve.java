package model;

import java.io.Serializable;
import java.sql.Timestamp;

public class Reserve implements Serializable {
	private Integer id;
	private String username;
	private String membername;
	private String year;
	private String month;
	private String date;
	private String time;
	private String scalpcare;
	private String shampoo;
	private String haircut;
	private String perm;
	private String haircoloring;
	private Timestamp stamp;

	public Reserve() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Reserve(String username, String membername, String year, String month, String date, String time,
			String scalpcare, String shampoo, String haircut, String perm, String haircoloring) {
		super();
		this.username = username;
		this.membername = membername;
		this.year = year;
		this.month = month;
		this.date = date;
		this.time = time;
		this.scalpcare = scalpcare;
		this.shampoo = shampoo;
		this.haircut = haircut;
		this.perm = perm;
		this.haircoloring = haircoloring;
	}

	public Reserve(String year, String month, String date, String time) {
		super();
		this.year = year;
		this.month = month;
		this.date = date;
		this.time = time;
	}
	
	public Reserve(String username,String membername, String year, String month, String date, String time) {
		super();
		this.username = username;
		this.membername = membername;
		this.year = year;
		this.month = month;
		this.date = date;
		this.time = time;
	}
	
	public Reserve(String scalpcare, String shampoo, String haircut, String perm, String haircoloring) {
		super();
		this.scalpcare = scalpcare;
		this.shampoo = shampoo;
		this.haircut = haircut;
		this.haircut = perm;
		this.haircut = haircoloring;
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
		this.username = username;
	}

	public String getMembername() {
		return membername;
	}

	public void setMembername(String membername) {
		this.membername = membername;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
	
	public String getScalpcare() {
		return scalpcare;
	}

	public void setScalpcare(String scalpcare) {
		this.scalpcare = scalpcare;
	}

	public String getShampoo() {
		return shampoo;
	}

	public void setShampoo(String shampoo) {
		this.shampoo = shampoo;
	}

	public String getHaircut() {
		return haircut;
	}

	public void setHaircut(String haircut) {
		this.haircut = haircut;
	}

	public String getPerm() {
		return perm;
	}

	public void setPerm(String perm) {
		this.perm = perm;
	}

	public String getHaircoloring() {
		return haircoloring;
	}

	public void setHaircoloring(String haircoloring) {
		this.haircoloring = haircoloring;
	}
	public Timestamp getStamp() {
		return stamp;
	}

	public void setStamp(Timestamp stamp) {
		this.stamp = stamp;
	}

	public void merge(Reserve other) {
		if (other.getUsername() != null) {
			this.username = other.getUsername();
		}
		if (other.getMembername() != null) {
			this.membername = other.getMembername();
		}
		
		if (other.getYear() != null) {
			this.year = other.getYear();
		}
		if (other.getMonth() != null) {
			this.month = other.getMonth();
		}
		if (other.getDate() != null) {
			this.date = other.getDate();
		}
		if (other.getTime() != null) {
			this.time = other.getTime();
		}
		if (other.getScalpcare() != null) {
			this.scalpcare = other.getScalpcare();
		}
		if (other.getShampoo() != null) {
			this.shampoo = other.getShampoo();
		}
		if (other.getHaircut() != null) {
			this.haircut = other.getHaircut();
		}
		if (other.getPerm() != null) {
			this.perm = other.getPerm();
		}
		if (other.getHaircoloring() != null) {
			this.haircoloring = other.getHaircoloring();
		}
	}

}
