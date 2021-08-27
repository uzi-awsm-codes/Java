/*1.A Company provides an initial training for all its employees, once they join the company. During the training phase they call the employees as “Associate”. The initial training is conducted for 60 days for each Associate. In these 60 days they learn various technologies. The first 20 days they learn “Core skills”, the next 20 days they learn “Advanced modules” and the final 20 days they go to the “Project phase”.  Help the Company to find in which phase the associates are in.
Create a class Associate with associateId(int),associateName(String),workStatus(String).
Include getters and setters and constructors.
Add a method trackAssociateStatus
 - This method takes the number of days as argument and sets the work status of the associate based on the number of days. If the number of days is greater than 60 days then set the work status as “Deployed in project”.
 In the Main class, create an object for the Associate class; Get the details assign the value for its attributes using the setters. Invoke the trackAssociateStatus method and find the work status and display the details.*/

package com.ooc;

import java.util.Scanner;

class Associate{
	int associateId;
	String associateName;
	String workStatus;
	
	public int getAssociateId() {
		return associateId;
	}
	public void setAssociateId(int associateId) {
		this.associateId = associateId;
	}
	public String getAssociateName() {
		return associateName;
	}
	public void setAssociateName(String associateName) {
		this.associateName = associateName;
	}
	public String getWorkStatus() {
		return workStatus;
	}
	public void setWorkStatus(String workStatus) {
		this.workStatus = workStatus;
	}
	
	void trackAssociateStatus(int days) {
		
		if(days>60)
			setWorkStatus("Deployed in project");
		else
			setWorkStatus("Not in project");
		
		System.out.println(workStatus);
	}
	
}

public class OOCb1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Associate as=new Associate();
		
		as.setAssociateId(11);
		as.setAssociateName("uzi");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of days");
		as.trackAssociateStatus(sc.nextInt());
		sc.close();
	}

}
