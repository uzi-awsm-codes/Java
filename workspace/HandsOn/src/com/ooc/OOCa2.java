/*
2) The task is to get the details of the vehicle and display the details using a menu driven application.
Write a Java program to Implement this task.
Create a class Vehicle
Include the following protected data members / attributes:
make – of type String
vehicleNumber – of type String
fuelType – of type String
fuelCapacity - of type Integer
cc – of type Integer
 
Include the following public methods
Create a constructor that initializes all the data members --- public Vehicle(String make,String vehicleNumber,String fuelType,Integer fuelCapacity,Integer cc)
-displayMake – Display the make of the vehicle
-"displayBasicInfo" – display basic information of the vehicle.
"displayDetailInfo" – An empty method.
 
Create a class TwoWheeler that extends Vehicle
kickStartAvailable – of type Boolean.
-"displayDetailInfo" – displays the availability of kick start.

create a class FourWheeler that extends Vehicle
audioSystem – of type String.
numberOfDoors – of type Integer.
-"displayDetailInfo" - displays the audio system and number of doors.
-displayDetailInfo - overridden method
Include getter setters for all the classes.

Create a main class to test the classes defined above.
*/
package com.ooc;

import java.util.Scanner;

class Vehicle{
	protected String make;
	protected String vehicleNumber;
	protected String fuelType;
	protected int fuelCapacity;
	protected int cc;
	
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public int getFuelCapacity() {
		return fuelCapacity;
	}
	public void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	
	public Vehicle(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc) {
		super();
		this.make = make;
		this.vehicleNumber = vehicleNumber;
		this.fuelType = fuelType;
		this.fuelCapacity = fuelCapacity;
		this.cc = cc;
	}
	
	void displayMake() {
		System.out.println(" make : "+make);
	}
	void displayBasicInfo() {
		System.out.println("\n make : "+make+"\n vehicleNumber : "+vehicleNumber+"\n fuelType : "+fuelType+"\n fuelCapacity : "+fuelCapacity+"\n cc : "+cc);		
	}
	void displayDetailInfo() {
		
	}
	
}

class TwoWheeler extends Vehicle{
	boolean kickStartAvailable;
		
	public TwoWheeler(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc,
			boolean kickStartAvailable) {
		super(make, vehicleNumber, fuelType, fuelCapacity, cc);
		this.kickStartAvailable = kickStartAvailable;
	}

	
	public void setKickStartAvailable(boolean kickStartAvailable) {
		this.kickStartAvailable = kickStartAvailable;
	}

	public boolean getKickStartAvailable() {
		return kickStartAvailable;
	}


	public boolean isKickStartAvailable() {
		return kickStartAvailable;
	}

	void displayDetailInfo() {
		System.out.println();
		System.out.println(" kickStartAvailable : " +kickStartAvailable);
	}
}

class FourWheeler extends Vehicle{
	String audioSystem;
	int numberOfDoors;
	
	public FourWheeler(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc, String audioSystem,
			int numberOfDoors) {
		super(make, vehicleNumber, fuelType, fuelCapacity, cc);
		this.audioSystem = audioSystem;
		this.numberOfDoors = numberOfDoors;
	}
	
	public String getAudioSystem() {
		return audioSystem;
	}
	public void setAudioSystem(String audioSystem) {
		this.audioSystem = audioSystem;
	}
	public int getNumberOfDoors() {
		return numberOfDoors;
	}
	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}
	
	@Override
	void displayDetailInfo() {
		System.out.println();
		System.out.println(" audioSystem : " +audioSystem+ "\n numberOfDoors : " +numberOfDoors);
	}
	
}


public class OOCa2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		TwoWheeler tw = new TwoWheeler("june 2016", "KA16EJ2101", "Petrol", 5, 110, true);
		FourWheeler fw = new FourWheeler("dec 2001", "KA16AS4101", "Petrol", 27, 800, "panasonic", 4);
		
		System.out.println("Enter your choice \n1. two wheeler \n2. four wheeler");
		int ch = sc.nextInt();
		
		switch(ch)
		{
		case 1: tw.displayMake();
				tw.displayBasicInfo();
				tw.displayDetailInfo();
				break;
		
		case 2: fw.displayMake();
				fw.displayBasicInfo();
				fw.displayDetailInfo();
				break;
		}
		
		sc.close();
	}

}
