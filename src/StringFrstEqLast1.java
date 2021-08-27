/*1.Write a program to read a string and to test whether first and last character are same. The string is said to be be valid if the 1st and last character are the same. Else the string is said to be invalid.*/
package com.string;

import java.util.Scanner;

public class StringFrstEqLast1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string");
		String str = sc.nextLine();
		
		int n = str.length();
		if(str.charAt(0) == str.charAt(n-1))
			System.out.println("Valid");
		else
			System.out.println("Invalid");
		sc.close();
		
	}
}
