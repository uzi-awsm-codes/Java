/*4.Write a program to find the sum of the odd digits in a number.*/

package com.Statements;

import java.util.Scanner;

public class SumOfOddDigs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    int sum = 0, dig = 0;
	    
	    System.out.print("Enter a number ");
	    int num = sc.nextInt();
	      
	    while(num!=0) {
	         dig = num%10;

	         if(dig % 2 != 0) {
	            sum = sum + dig;
	         }
	         num = num / 10;
	      }
	      System.out.println("The sum of odd digits "+ sum);
	    
		sc.close();
	}
}

