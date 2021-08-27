/*8.Write a  program to print the multiplication table of an integer n upto m rows using a for loop.*/

package com.Statements;

import java.util.Scanner;

public class MulTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Table of number ");
		int n = sc.nextInt();
		
		System.out.print("Enter a range of table ");
		int m = sc.nextInt();
		
		for (int i = 1; i <= m; ++i)  
            System.out.println(n + " * " + i + " = " + n * i); 
				
		sc.close();
	}
}
