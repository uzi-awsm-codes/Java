/*3.Create a class Shape and inherit three classes Square,Triangle and Rectangle. Implement the method double calculateArea() in Shape class and override  the method in the subclasses. Use runtime polymorphism to call the calculateArea() method.*/
package com.ooc;

class Shape{
	double calculateArea(double a, double b) {return 0;}
}

class Square extends Shape{
	double calculateArea(double a, double b) {
		return (a * a);
	}	
}

class Triangle extends Shape{
	double calculateArea(double b, double h) {       
        return (0.5 * b * h);
	}
}

class Rectangle extends Shape{
	double calculateArea(double l, double b) {
		return (l * b);
	}
}

public class OCCa3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square sq = new Square();
		Triangle tri = new Triangle();
		Rectangle req = new Rectangle();
		
		System.out.println(sq.calculateArea(2,2));
		System.out.println(tri.calculateArea(2,3));
		System.out.println(req.calculateArea(2,3));
	}

}
