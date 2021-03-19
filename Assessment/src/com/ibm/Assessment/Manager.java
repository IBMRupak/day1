package com.ibm.Assessment;

public class Manager extends Employee{
	public Manager(int ID,String name)
	{
		super(ID,name);
	}
	
	void assignedBug(Bug bug)
	{
		bug.setBugstatus(BugStatus.Assigned);
		System.out.println("The bug has been assigned by the developer whose status is: "bug.getBugstatus());
	}
	
	void acknowledgeReport()
	{
		System.out.println("The report is ackowledged");
	}
	
}
	