/*7.Write a program to that allows the user to enter 'n' numbers and finds the number of negative numbers entered and the number of positive numbers entered.*/

package com.Statements;

import java.util.Scanner;

public class SumOfNegPos {
	

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
		
		int posSum=0, negSum=0;
		
		for(int i : arr) {
			if (i > 0)
				posSum = posSum + i;
			else
				negSum = negSum + i;
		}
		
		System.out.println("Sum of positive numbers : " +posSum);
		System.out.println("Sum of negative numbers : " +negSum);
	
		sc.close();

}
}