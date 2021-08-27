/*2. Write a program to read a string and return a modified string based on the following rules.
Return the String without the first 2 chars except when
1.	keep the first char if it is 'j'
2.	keep the second char if it is 'b'.
*/
package com.collection;

import java.util.Scanner;

public class coll2StrValid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the string");
		String a = sc.nextLine();
		
		if(a.charAt(1) != 'b')
		{
			a=a.substring(0,1)+a.substring(2);
		}
		
		if(a.charAt(0) != 'j')
		{
			a=a.substring(1);
		}
		
		
		
		System.out.println(a);
		
		sc.close();
	}

}
