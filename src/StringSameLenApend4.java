/*4.Write code to get two strings as input and If strings are of same length simply append them together and return the final string. If given strings are of different length, remove starting characters from the longer string so that both strings are of same length then append them together and return the final string.*/
package com.string;

import java.util.Scanner;

public class StringSameLenApend4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string 1");
		String str1 = sc.nextLine();
		System.out.println("Enter the string 2");
		String str2 = sc.nextLine();
		
		int len1=str1.length();
		int len2=str2.length();
		
		if(len1>len2)
			str1=str1.substring(len1-len2);
		else
			str2=str2.substring(len2-len1);
		
		System.out.println(str1.concat(str2));
			
		
		sc.close();
	}

}
