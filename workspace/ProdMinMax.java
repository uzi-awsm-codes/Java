package com.Statements;

import java.util.Arrays;
import java.util.Scanner;

public class ProdMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of elements you wants to enter :" );
		int n=sc.nextInt();

		int arr[]=new int[n];

		for(int i=0;i<arr.length;i++)
		{
			System.out.print("["+(i+1)+"] element :" );
			arr[i]=sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		System.out.println("Maximum value is : " +arr[n-1]);
		System.out.println("Minimum value is : " +arr[0]);
		
		System.out.println("Product of min max : "+ arr[0] * arr[n-1]);
	
		sc.close();
	}
}
