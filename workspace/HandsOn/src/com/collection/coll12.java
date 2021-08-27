/*12.Write a program to remove all the elements of the given length and return the size of the final array as output. If there is no element of the given length, return the size of the same array as output.*/
package com.collection;

import java.util.Scanner;

public class coll12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter the size of array");
    int n = sc.nextInt();
    
    String[] a = new String[n];
    System.out.println("Enter the String array");
    for (int i = 0; i < n; i++)
      a[i] = sc.next();
    sc.nextLine();
    
    System.out.println("Enter the length of element");
    int m = sc.nextInt();
    
    int u = a.length;
    for (int i = 0; i < a.length; i++) {
      if (a[i].length() == m) {
    	  u--;  
      }
        
    }
    System.out.println(u);
    sc.close();
  }

}
