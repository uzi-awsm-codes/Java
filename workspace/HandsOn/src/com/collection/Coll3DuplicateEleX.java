/*3.Write a program to read a integer array, Remove the duplicate elements and display sum of even numbers in the output. If input array contain only odd number then return -1.*/

// use set
package com.collection;

import java.util.Arrays;
import java.util.Scanner;

public class Coll3DuplicateEleX {
	
	 static void sumEvn(int[] a) {
		 int sum = 0;
		 for(int i=0; i<a.length; i++) {
				
				if(a[i] % 2 == 0) {
					sum = sum + a[i];
		         }
		 }
		 
		 if (sum==0)
			 System.out.println(" Even sum = -1");
		 else
			 System.out.println(" Even sum = "+sum);
	 }
	 
	 static void unique_array(int[] a)
	    {
	        System.out.println("Original Array : ");
	         
	        for (int i = 0; i < a.length; i++)
	        {
	            System.out.print(a[i]+"\t");
	        }
	        
	        int n = a.length;
	                
	        for (int i = 0; i < n; i++) 
	        {
	            for (int j = i+1; j < n; j++)
	            {            
	                if(a[i] == a[j])
	                {
	                    a[j] = a[n-1];
	                    n--;
	                    j--;
	                }
	            }
	        }
	        
	        int[] a1 = Arrays.copyOf(a, n);
	         
	        System.out.println();
	         
	        System.out.println("Array with unique values : ");
	         
	        for (int i = 0; i < a1.length; i++)
	        {
	            System.out.print(a1[i]+"\t");
	        }
	         
	        System.out.println();
	        
	        sumEvn(a1);
	    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		
		int a[]= new int[n];
		
		for(int i=0; i<n; i++)
		{
			a[i] = sc.nextInt();
		}
		
		unique_array(a);
	
        sc.close();
	}

}
