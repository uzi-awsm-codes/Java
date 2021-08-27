/*10.Given an Integer array, find out sum of Even and odd Numbers individually and find the maximum.*/

package com.Statements;

import java.util.Scanner;

public class SumEvenOddArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a number ");
		int n = sc.nextInt();
		
		int arr[]= new int[n];
		int oddsum=0, evnsum=0;
		
		System.out.println("Enter the array ");
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
	
		
		for(int i=0; i<n; i++) {
			
			if(arr[i] % 2 == 0) {
				evnsum = evnsum + arr[i];
	         }
			else {
				oddsum = oddsum + arr[i];
			}
					
		}
		System.out.println("Sum of odd nums "+oddsum);
		System.out.println("Sum od evn nums "+evnsum);
		
		sc.close();
	}

}
