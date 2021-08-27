/*6.John is working in a bank. He has created account details transaction in a file and protected it with a password. He sent the file to his manager for review. The file is protected with a password. 
  The password is the sum of Prime numbers. Write a method to generate the password.*/

package com.Statements;

import java.util.Scanner;

public class SumOfPrime { 
	
	public static boolean isPrime(int n) {
		for(int i=2 ; i<=Math.sqrt(n) ; i++) {
			if(n%i == 0)
				return false;
		}	
		return true;
	}
	
	public static void main(String args[]) 
	{ 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the nth term");
		int n = sc.nextInt();
		
		int sum = 0;
		
		for(int i=2 ; i<=n ; i++) {
			if(isPrime(i)) {
				sum = sum + i;
			}				
		}
		 		
		System.out.println("Sum of 1st N prime numbers are :" + sum); 
		sc.close();	
	} 
	
} 

