/*6.Given an array of Strings, write a program to take the last character of each string and make a new String by concatenating it.*/
package com.string;

import java.util.Scanner;

public class StrArLastConcat6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter n");
		int n = sc.nextInt();
		
		String[] sa = new String[n];
		
		System.out.println("Enter array of strings");
		for(int i=0; i<n; i++) {
			sa[i] = sc.next();
		}
		
		String str="";
		
		for(int i=0; i<n; i++) {
			int l = sa[i].length(); //last index
			String s = sa[i].substring(l-1,l); //last char
			str = str.concat(s);
		}
		System.out.println("String : "+str);
		sc.close();
	}
}
