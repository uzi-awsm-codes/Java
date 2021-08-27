class TypeCastingDemo
{
public static void main(String []args)
{
int a=130,b;
byte c,d=40;
char ch='A';
double x=67.89,y;
float z;
float a1=89.67f;
long var=1234567800000L;
System.out.println("Implicit casting");
b=d;
System.out.println("byte assigned to int="+b);
z=a;
System.out.println("int assigned to float="+z);
b=ch;
System.out.println("char assigned to int="+b);
System.out.println("Explicit casting");
c=(byte)a;
System.out.println("int assigned to byte="+c);
a=(int)a1;
System.out.println("float assigned to int="+a);
//b=ch;
//System.out.println("char assigned to int="+b);
}
}

Operators.java

class Operators {
	public static void main(String[] args) {
		int a = 5;
		int b = 10, c;
		c = a + b;
		int res = (a > b) ? a : b;
		System.out.println("Sum=" + c);
		System.out.println("Maximum=" + res);
	}
}

Employee.java

class Employee
{
//instance variables
long empId=1001;
double empSalary=35000.00;
float empTax=2.5f;
int empDaysOfWork=25;
//instane methods
void calculateTax()
{
float taxRate=10.5f;
System.out.println("The tax rate of the employee is"+taxRate);
}
public static void main(String[] args)
{

Employee emp=new Employee();
System.out.println("Employee id: "+emp.empId);
System.out.println("Salary :"+emp.empSalary);
System.out.println("Tax :"+emp.empTax);
System.out.println("No.of Days worked : "+emp.empDaysOfWork);
//System.out.println("Tax Rate:"+taxRate);
emp.calculateTax();
}
public void putData() {
	// TODO Auto-generated method stub
	
}
}