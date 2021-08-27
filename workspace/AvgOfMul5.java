/*5.Write a program to find the average of multiples of 5 upto 'n'. n is given as input.*/
package com.Statements;

import java.util.Scanner;

public class AvgOfMul5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter upto value");
		int n = sc.nextInt();
		
		int i=0, sum=0;
		
		for(i=1; (5*i)<=n; i++) {
			sum=sum + (5*i);
			System.out.println((5*i)+ " " +i);
		}
		System.out.println("sum = "+sum);
		double avg =(double) sum/(i-1);
		System.out.println("avg = "+avg);
		
		sc.close();
	}

}
