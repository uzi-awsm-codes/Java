/*3. Read a string as input and remove vowels from even position in the string.*/
package com.string;

import java.util.Scanner;
import java.util.Arrays; 
import java.util.List; 

public class RemoveVowl3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string");
		String str = sc.nextLine();
		
		Character vowels[] = {'a', 'e', 'i', 'o', 'u','A','E','I','O','U'}; 
		List<Character> al = Arrays.asList(vowels);
		StringBuffer sb = new StringBuffer(str);
		
		for(int i=1; i<sb.length(); i=i+2)
		{ 
			if(al.contains(sb.charAt(i))){ 
                sb.deleteCharAt(i);
                i--;
             } 
			
		}
		
		System.out.println(sb);
		
		sc.close();
	}

}
