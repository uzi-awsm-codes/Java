/*4.Write a program that performs the following actions:
    Read n strings as input.
    Create an arraylist to store the above n strings in this arraylist.
    Write a function convertToStringArray which accepts the arraylist as input.
    The function should sort the elements (strings) present in the arraylist and convert them into a string array.
    Return the array.*/
package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class coll4ArlistToArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of strings");
		int n = sc.nextInt();
		
		ArrayList<String> alist=new ArrayList<String>(); 
		
		System.out.println("Enter strings");
		for(int i=0; i<n; i++) {
			alist.add(sc.next());
		}
		sc.nextLine();
		
		convertToStringArray(alist);
		
		sc.close();

	}
	
	public static void convertToStringArray(ArrayList<String> alist) {
		//System.out.println(alist);
		Collections.sort(alist); 
		
		String arr[] = new String[alist.size()];              
		for(int j =0;j<alist.size();j++){
		  arr[j] = alist.get(j);
		}

		
		for(String k: arr)
		{
			System.out.println(k);
		}
		
	}
}
