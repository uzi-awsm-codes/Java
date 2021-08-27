/*9.Write a program to print the given pattern.
5 4 3 2 1
4 3 2 1
3 2 1
2 1
1*/

package com.Statements;

import java.util.Scanner;

public class ForPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		for (int i = 5; i >= 1; i--)  {
			for (int j = i; j >=1; j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
            	
		sc.close();
	}
}
