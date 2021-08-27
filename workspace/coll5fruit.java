/*5.
1.Read m strings as input (fruit names).
2.Create an arraylist to store the above m strings in this arraylist.
3.Read n strings as input (fruit names).
4.Create an arraylist to store the above n strings in this arraylist.
5.Write a function fruitSelector which accepts the arraylists as input.
6.Remove all fruits whose name ends with 'a' or 'e' from first arrayList and remove all fruits whose name begins  with 'm' or 'a' from second arrayList then combine the two lists and return the final output as a String array.
7.If the array is empty the program will print as “No fruit found”*/
package com.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class coll5fruit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter m");
		int m = sc.nextInt();
		
		ArrayList<String> fruit1=new ArrayList<String>(); 
		
		System.out.println("Enter m num of strings");
		for(int i=0; i<m; i++) 
			fruit1.add(sc.next());
		sc.nextLine();
		
		System.out.println("Enter n");
		int n = sc.nextInt();
		
		ArrayList<String> fruit2=new ArrayList<String>(); 
		
		System.out.println("Enter n num of strings");
		for(int i=0; i<n; i++) 
			fruit2.add(sc.next());
		sc.nextLine();
		
		fruitSelector(fruit1, fruit2);
		sc.close();

	}

	private static void fruitSelector(ArrayList<String> fruit1, ArrayList<String> fruit2) {
		// TODO Auto-generated method stub
		
		ArrayList<String> fruit=new ArrayList<String>(); 
		
		for(int j =0;j<fruit1.size();j++){
			  String a=fruit1.get(j);
			  //System.out.println(a.charAt(a.length()-1));
			  if(a.charAt(a.length()-1)=='a' || a.charAt(a.length()-1)=='e') {
				  fruit1.remove(a);
				  j--;
			  }
			}
		
		for(int k =0;k<fruit2.size();k++){
			  String b=fruit2.get(k);
			  //System.out.println(a.charAt(a.length()-1));
			  if(b.charAt(0)=='m' || b.charAt(0)=='a') {
				  fruit2.remove(b);
				  k--;
			  }
			}
		
		fruit.addAll(fruit1);
		fruit.addAll(fruit2);
		
		System.out.println(fruit);
		
	
	}
}
