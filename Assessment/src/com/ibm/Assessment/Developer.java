package com.ibm.Assessment;

public class Developer extends Employee {
	public Developer(int ID,String name)
	{
		super(ID,name);
	}
	
public void addBug(Bug bug,BugStatus bugstatus )

{
System.out.println("Bug is being added and analysed by the developer");	
setBugReport(bug,bugstatus);
}
public void setBugReport(Bug bug, BugStatus bugstatus)
{
//TODO
}
}