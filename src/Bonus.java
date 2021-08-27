/*5.Given the basic salary as input, write a program to calculate the bonus and display it.
The bonus will be calculated based on the below category.
Basic>20000 bonus=17%of basic+1500
Basic>15000 bonus=15%of basic+1200
Basic>10000 bonus=12%of basic+1000
for rest bonus=8%of basic+500*/

package com.fundamental;

import java.util.Scanner;

public class Bonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int bonus;
		
		System.out.println("Enter basic salary");
		int salary = sc.nextInt();
		
		
		if (salary >=20000)
			bonus = (salary * 17/100) + 1500;
		else if (salary >= 15000 && salary < 20000)
			bonus = (salary * 15/100) + 1200;
		else if (salary >= 10000 && salary < 15000)
			bonus = (salary * 12/100) + 1000;
		else
			bonus = (salary * 8/100) + 500;
			
			
		System.out.println("Bonus = "+bonus);
		sc.close();
	}

}
