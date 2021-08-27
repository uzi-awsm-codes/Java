/*7.Given a string array (s) and non negative integer (n) and return the number of elements in the array which have same number of characters as the givent int N.*/
package com.string;

import java.util.Scanner;

public class StrArSameLenAsN7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("Enter array size");
//		int a = sc.nextInt();
		
		String[] s = {"ewqe","er","asd","s","er","sdfg"};
				
//		System.out.println("Enter array of strings");
//		for(int i=0; i<a; i++) {
//			s[i] = sc.next();
//		}
		
		System.out.println("Enter n");
		int n = sc.nextInt();
		int count=0;
		
		for(int i=0; i<s.length; i++) {
			if(n == s[i].length()) {
				count++;
			}
			
		}
		System.out.println("Count : "+count);
		sc.close();
	}

}
