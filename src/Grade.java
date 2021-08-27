/*7.Write a program to find if the student is eligible for first, second or third grade universities by finding the average of their marks. Read marks in five subjects as input, calculate average and based on the average calculate grade.
Grade should be calculated as given below :
Average >80 First Grade University
Average >60 Second Grade University
Otherwise Third Grade University*/

package com.fundamental;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the marks of 5 subjects");
		System.out.println("sub 1");
		int sub1 = sc.nextInt();
		System.out.println("sub 2");
		int sub2 = sc.nextInt();
		System.out.println("sub 3");
		int sub3 = sc.nextInt();
		System.out.println("sub 4");
		int sub4 = sc.nextInt();
		System.out.println("sub 5");
		int sub5 = sc.nextInt();
		
		double avg =(double) (sub1 + sub2 + sub3 + sub4 + sub5)/5;
		
		System.out.println("Average = "+avg);
		
		if (avg >= 80)
			System.out.println("First Grade University");
		else if (avg >= 60 && avg < 80)
			System.out.println("Second Grade University");
		else
			System.out.println("Third Grade University");
		
		sc.close();
	}

}
