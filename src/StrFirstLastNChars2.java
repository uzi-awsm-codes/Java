/*2.Write a program to read a string and a positive integer n as input and construct a string with first n and last n characters in the given string.*/
package com.string;

import java.util.Scanner;

public class StrFirstLastNChars2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string");
		String str = sc.nextLine();
		System.out.println("Enter the n");
		int n = sc.nextInt();
		
		int len = str.length();
		
		String s1 = str.substring(0,n);
		String s2 = str.substring(len-n,len);
		
		System.out.println(s1.concat(s2));
		
		sc.close();
	}

}
