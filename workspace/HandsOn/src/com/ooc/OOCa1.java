/*1)-Create a class named Student.Include the following protected member variables.
-name,id,age,grade,address
-Include appropriate getters and setters
Include a default constructor and a 5-argument constructor. The order of arguments in the 5- argument constructor is name, id, age, grade and address.
-Include the following public methods in the Student class.
void display()
-Display the details of the student.
boolean isPassed()
A student is said to have passed if his/her grade is above 50. This method returns true if the student has passed.

-Create a subclass of Student named UGStudent .
-Include the following private member variables.
degree
stream
-Include appropriate getters / setters
Include a default constructor and a 7-argument constructor. The order of arguments in the 7-argument constructor is name, id, age, grade, address, degree and stream.
 Include the following public methods in the UGStudent class. void display()
Display the details of the ug student in the format as specified in the output. boolean isPassed()
A ug student is said to have passed if his/her grade is above 70. This method returns true if the student has passed.

Create another subclass of Student named PGStudent .
Include the following private member variables.
specialization
noOfPapersPublished
Include appropriate getters / setters
Include a default constructor and a 7-argument constructor. The order of arguments in the 7-argument constructor is name, id, age, grade, address, specialization and number of papers published.
 Include the following public methods in the PGStudent class.
void display()
Display the details of the pg student in the format as specified in the output.
boolean isPassed()
A pg student is said to have passed if his/her grade is above 70 and if he/she has published atleast 2 papers.This method returns true if the student has passed.
Create a class called Main to test the above classes.
*/
package com.ooc;

class Student{
	protected String name;
	protected String id;
	protected int age;
	protected int grade;
	protected String address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	
	public Student(String name, String id, int age, int grade, String address) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
		this.grade = grade;
		this.address = address;
		//System.out.println("hello");
		
	}
	public Student() {
		super();
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void display() {
		System.out.println("\n name "+name+"\n id "+id+"\n age "+age+"\n grade "+grade+"\n address "+address);
	}
	public boolean isPassed() {
		boolean res = false;
		if(grade > 50)
			res = true;
		return res;
	}
	
}

class UGStudent extends Student{
	private String degree;
	private String stream;
	
	public UGStudent(String name, String id, int age, int grade, String address, String degree, String stream) {
		super(name, id, age, grade, address);
		this.degree = degree;
		this.stream = stream;
		//super.display();
	}
	
	public UGStudent() {
		super();
	}
	
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	public void display() {
		System.out.println("\n name "+name+"\n id "+id+"\n age "+age+"\n grade "+grade+"\n address "+address+"\n degree "+degree+"\n stream "+stream);
	}
	public boolean isPassed() {
		boolean res = false;
		if(grade > 70)
			res = true;
		return res;
	}
	
	
}

class PGStudent extends Student{
	private String specialization;
	private int noOfPapersPublished;
	
	public PGStudent() {
		super();
	}
	
	public PGStudent(String name, String id, int age, int grade, String address, String specialization,int noOfPapersPublished) {
		super(name, id, age, grade, address);
		this.specialization = specialization;
		this.noOfPapersPublished = noOfPapersPublished;
	}

	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public int getNoOfPapersPublished() {
		return noOfPapersPublished;
	}
	public void setNoOfPapersPublished(int noOfPapersPublished) {
		this.noOfPapersPublished = noOfPapersPublished;
	}
	public void display() {
		System.out.println("\n name "+name+"\n id "+id+"\n age "+age+"\n grade "+grade+"\n address "+address+"\n specialization "+specialization+"\n noOfPapersPublished "+noOfPapersPublished);
	}
	public boolean isPassed() {
		boolean res = false;
		if(grade > 70 && noOfPapersPublished >=2)
			res = true;
		return res;
	}
	
}

public class OOCa1 {
	public static void main(String[] args) {
		Student s1 = new Student("uzair","cs102",20,60,"hassan");
		UGStudent s2 = new UGStudent("shree", "cs073",22, 70, "mysore","be","cs");
		PGStudent s3 = new PGStudent("sona", "ec073",24, 80, "mysore","ms",3);
		
		s1.display();
		System.out.println("Is passed "+s1.isPassed());
		s2.display();
		System.out.println("Is passed "+s2.isPassed());
		s3.display();
		System.out.println("Is passed "+s3.isPassed());
	}
}
