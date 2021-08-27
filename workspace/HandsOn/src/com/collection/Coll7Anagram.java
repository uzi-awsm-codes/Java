/*7.Write a program to check whether the two given strings are anagrams.
Note: Rearranging the letters of a word or phrase to produce a new word or phrase, using all the original letters exactly once is called Anagram."*/
package com.collection;

import java.util.Arrays;
import java.util.Scanner;
 
public class Coll7Anagram {
	 static boolean areAnagram(char[] str1, char[] str2)
	    {
	        int n1 = str1.length;
	        int n2 = str2.length;
	 
	        if (n1 != n2)
	            return false;

	        Arrays.sort(str1);
	        Arrays.sort(str2);

	        for (int i = 0; i < n1; i++)
	            if (str1[i] != str2[i])
	                return false;
	 
	        return true;
	    }
	 
	    public static void main(String args[])
	    {
	    	Scanner sc = new Scanner(System.in);
	    	
	    	System.out.println("Enter 2 strings");
	    	String str1 = sc.nextLine();
	    	String str2 = sc.nextLine();
	    	
	        char arr1[] = str1.toCharArray();
	        char arr2[] = str2.toCharArray();
	       
	        // Function Call
	        if (areAnagram(arr1, arr2))
	            System.out.println("Are anagram");
	        else
	            System.out.println("Not anagram");
	        
	        sc.close();
	    }

}

