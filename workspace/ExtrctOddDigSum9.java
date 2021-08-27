/*9.Write a program to input a String array. The input may contain digits and alphabets (“de5g4G7R”). Extract odd digits from each string and find the sum and print the output.For example, if the string is "AKj375A" then take 3+7+5=15 and not as 375 as digit.*/
package com.string;

import java.util.Scanner;

public class ExtrctOddDigSum9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter n");
		int n = sc.nextInt();
		
		String[] sa = new String[n];
		
		System.out.println("Enter array of strings");
		for(int i=0; i<n; i++) {
			sa[i] = sc.next();
		}
		
		int sum = 0;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<sa[i].length(); j++) 
			{
				char ch = sa[i].charAt(j);
				if(Character.isDigit(ch)) {
					int dig=Character.getNumericValue(ch);
					if(dig % 2 !=0) {
						sum = sum + dig;
					}
					
				}
			}
		}
		System.out.println(sum);
		
		sc.close();
	}

}
