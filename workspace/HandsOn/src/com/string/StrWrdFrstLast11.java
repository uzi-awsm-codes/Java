/*11.Write a program to read a string containing multiple words find the first and last words, if they are same, return the length and if not return the sum of length of the two words.*/
package com.string;

import java.util.Scanner;

public class StrWrdFrstLast11 {
	
    public static void main(String[] args) {
    	
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a sentence");
	        String sentence = sc.nextLine();
	        String a[] = sentence.split(" "); 
	  
	        if (a[0].length() == a[a.length - 1].length())
	            System.out.println(a[0].length());
	        
	        else
	            System.out.println(a[0].length() + a[a.length - 1].length()); 
	        sc.close();
	    }
}

