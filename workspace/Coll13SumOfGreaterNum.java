/*13.Given an int array and a number as input, write a program to add all the elements in the array greater than the given number. Finally reverse the digits of the obtained sum and print it.
Input Array = {10,15,20,25,30,100}
Number = 15
sum = 20 + 25 + 30 + 100 = 175
output = 571*/
package com.collection;

import java.util.Scanner;

public class Coll13SumOfGreaterNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		int a[]= new int[n];
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println("Enter the number");
		int big = sc.nextInt();
		int sum = 0;
		int rev = 0;
		
		for(int i=0; i<n; i++) {
			if(a[i]>big)
				sum = sum + a[i];
		}
		System.out.println("Sum = "+sum);
		
		int r =0;
		while(sum != 0)
		{
			r = sum%10;
			sum = sum/10;
			rev = rev*10 + r; 
		}
		System.out.println("Reverse = "+rev);
		
		sc.close();

	}

}
