
package com.ibm.Assessment;

public class Bug {
	private int id;
	private String name;
	private String location;
	private String type;
	private BugStatus bugstatus;
	
	public BugStatus getBugstatus() {
		return bugstatus;
	}
	public void setBugstatus(BugStatus bugstatus) {
		this.bugstatus = bugstatus;
	}
	public Priority getPriority() {
		return priority;
	}
	public void setPriority(Priority priority) {
		this.priority = priority;
	}

	private Priority priority;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
//TODO	
	

	
public Bug(int id, String name, String location, String type, BugStatus bugstatus, Priority priority) {
	super();
	this.id = id;
	this.name = name;
	this.location = location;
	this.type = type;
	this.bugstatus = bugstatus;
	this.priority = priority;
}
}
