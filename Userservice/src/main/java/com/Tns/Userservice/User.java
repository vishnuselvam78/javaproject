package com.Tns.Userservice;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity

public class User {  
	
	private Integer User_Id;
	private String User_name;
	private String User_location;
	private String User_mailid;
	private String User_phnno;
	private String placement_locatiom;
	private String office_name;
	public User() {
		 
		super();
		// TODO Auto-generated constructor stub
	}
	public User(Integer user_Id, String user_name, String user_location, String user_mailid, String user_phnno,
			String placement_locatiom, String office_name) {
		super();
		User_Id = user_Id;
		User_name = user_name;
		User_location = user_location;
		User_mailid = user_mailid;
		User_phnno = user_phnno;
		this.placement_locatiom = placement_locatiom;
		this.office_name = office_name;
	}
	
	@Id
	@GeneratedValue
	
	public Integer getUser_Id() {
		return User_Id;
	}
	public void setUser_Id(Integer user_Id) {
		User_Id = user_Id;
	}
	public String getUser_name() {
		return User_name;
	}
	public void setUser_name(String user_name) {
		User_name = user_name;
	}
	public String getUser_location() {
		return User_location;
	}
	public void setUser_location(String user_location) {
		User_location = user_location;
	}
	public String getUser_mailid() {
		return User_mailid;
	}
	public void setUser_mailid(String user_mailid) {
		User_mailid = user_mailid;
	}
	public String getUser_phnno() {
		return User_phnno;
	}
	public void setUser_phnno(String user_phnno) {
		User_phnno = user_phnno;
	}
	public String getPlacement_locatiom() {
		return placement_locatiom;
	}
	public void setPlacement_locatiom(String placement_locatiom) {
		this.placement_locatiom = placement_locatiom;
	}
	public String getOffice_name() {
		return office_name;
	}
	public void setOffice_name(String office_name) {
		this.office_name = office_name;
	}
	@Override
	public String toString() {
		return "User [User_Id=" + User_Id + ", User_name=" + User_name + ", User_location=" + User_location
				+ ", User_mailid=" + User_mailid + ", User_phnno=" + User_phnno + ", placement_locatiom="
				+ placement_locatiom + ", office_name=" + office_name + "]";
	}
	
	
	

}
