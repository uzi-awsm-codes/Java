/*12.Write a program which takes two arrays of the same size as a input and compares the first element of first array with the first element of second array and stores the largest of these into the first element of the output array. Repeat the process till the last element of the first array is checked with the last element of the second array.*/

package com.Statements;

import java.util.Arrays;
import java.util.Scanner;

public class BigIn2Arr {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of arrays");
		int n = sc.nextInt();
		
		int arr1[]=new int[n];
		int arr2[]=new int[n];
		int opArr[]=new int[n];
				
		System.out.println("Enter the elements of ");
		System.out.println("Array1");
		for(int i=0; i<n; i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.println("Array2");
		for(int i=0; i<n; i++)
		{
			arr2[i]=sc.nextInt();
		}
		
		for(int i=0; i<n; i++)
		{
			opArr[i]=(arr1[i]>arr2[i])?arr1[i]:arr2[i];
		}
		
		System.out.println("output array\n" + Arrays.toString(opArr));
				
		sc.close();
	}
}
