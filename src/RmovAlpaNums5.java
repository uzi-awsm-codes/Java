/*5.Write a program to read a string from the user and remove all the alphabets and spaces from the String, andonly store special characters and digit in the output String. Print the output string.*/
package com.string;

import java.util.Scanner;

public class RmovAlpaNums5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string 1");
		String str = sc.nextLine();
		StringBuffer sb = new StringBuffer(str);
		
		for(int j=0; j<sb.length(); j++) {
			char i=sb.charAt(j);
			if((i>=65 && i<=90) || (i>=97 && i<=122) || (i==' ')){
				sb=sb.deleteCharAt(j);
				j--;
			}
		}
		System.out.println(sb);
		sc.close();

	}

}

// Numbers (30–39) Letters (65–90 / 97–122):