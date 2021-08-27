/*3.Create an interface IVehicle with the below methods:
drive();
turnLeft();
brake();
Create another interface IPublicTransport with a method 
getNumberOfPeople();
Create a class MotorisedVehicle.java with a method checkMotor() which prints the message “The motor of the vehicle is in good condition”
Create a class Car.java which extends the MotorisedVehicle class and implements the IVehicle interface. This method should print appropriate messages in the implemented methods. (Ex. “The car is in brake mode” etc)
Create a class Train.java which implements both the IVehicle and IPublicTransport interfaces. The implemented methods should print appropriate messages (Ex. “The train is turning left” etc)
Create a new Interface IAdvancedVehicle that extends the IVehicle interface and add accelerate() method in the new interface.
Test all these methods in a main class.*/

package com.ooc;

interface IVehicle{
	void drive();
	void turnLeft();
	void brake();
}

interface IPublicTransport{
	void getNumberOfPeople();
}

class MotorisedVehicle{
	
	void checkMotor() {
		System.out.println("The motor of the vehicle is in good condition");
	}
}

class Car extends MotorisedVehicle implements IVehicle{

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void turnLeft() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void brake() {
		// TODO Auto-generated method stub
		
	}
	//System.out.println("The car is in brake mode");
}

class Train implements IVehicle, IPublicTransport{
	


	@Override
	public void drive() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void turnLeft() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void brake() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getNumberOfPeople() {
		// TODO Auto-generated method stub
		
	}
	//write in function System.out.println("The train is turning left");
}

interface IAdvancedVehicle extends IVehicle{
	default void accelerate() {
		
		
	}
	
}


public class OOCb3InterfaceX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
