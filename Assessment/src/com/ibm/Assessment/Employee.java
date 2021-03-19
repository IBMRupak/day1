package com.ibm.Assessment;

public class Employee {
	int ID;
	String name;
	String email;
	int mobileno;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name==null||name.trim().equals("")) {
			System.out.println("Please enter correct name");
		}
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getMobileno() {
		return mobileno;
	}
	public void setMobileno(int mobileno) {
		this.mobileno = mobileno;
	}
	public Employee(int iD, String name) {
		super();
		ID = iD;
		this.name = name;
		
	}
	
}
