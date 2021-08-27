/*8.Obtain two strings S1,S2 from user as input. Your program should form a string of  “long+short+long”, with the shorter string inside of the longer String.*/
package com.string;

import java.util.Scanner;

public class StrConcatLngSrtLng8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string 1");
		String str1 = sc.nextLine();
		System.out.println("Enter the string 2");
		String str2 = sc.nextLine();
		
		String str;
		int len1=str1.length();
		int len2=str2.length();
		
		if(len1>len2) {
			str=str1 + str2 + str1;
		}
		else {
			str=str2 + str1 + str2;
		}
		
		System.out.println(str);
		sc.close();
	}

}
