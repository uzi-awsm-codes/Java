/*3.In a given input number , find out the factorial of each individual digit and assign it to output array.*/

package com.Statements;

import java.util.Arrays;
import java.util.Scanner;

public class FactOfDigts {
	public static int fact(int n) {
		int i,fact=1;      
		for(i=1;i<=n;i++){    
		      fact=fact*i;    
		}  
		return fact;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number ");
		int num = sc.nextInt();
		int n=String.valueOf(num).length();
		
		int fact[]=new int[n];
		
		int dig=0;
		int i=n-1;
		while (num != 0) { 
	            dig = num % 10; 
	            fact[i] = fact(dig);
	            i=i-1;
	            num = num / 10; 
	        } 
		
		System.out.println(Arrays.toString(fact));
		
		sc.close();

	}

}
