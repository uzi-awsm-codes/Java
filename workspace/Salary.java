/*1.Karen got salary for this month and she spends 20% of her salary for food and 30% of her salary for travel. If she takes care of other shifts she will get 2% of the salary per day. Given her salary and the number of shifts she handled. Calculate how much she can save in her pocket after spending all these? Get salary and number of shifts as input and find the saving.*/
package com.fundamental;

import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		double salary = 0, shifts = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Salary");
		salary = sc.nextInt();
		System.out.println("Enter Shifts");
		shifts = sc.nextInt();
		
		double food=(salary * 20/100);
		double trvl=(salary * 30/100);
		System.out.println("food "+ food);
		System.out.println("travel "+ trvl);
		
		double savings = salary - food - trvl + (salary * shifts * 2/100);
		System.out.println("Savings "+ savings);
		
		sc.close();
	}
}
