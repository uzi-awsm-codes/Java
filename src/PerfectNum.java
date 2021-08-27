/*14.Write a program to find whether the given number is a perfect Number.
 A number is a perfect number if the sum of the proper divisors of the number is equal to the number itself.*/
package com.Statements;

import java.util.Scanner;

public class PerfectNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, n, Sum = 0 ;
		Scanner sc = new Scanner(System.in);		
		System.out.println("\n Please Enter any Number: ");
		n = sc.nextInt();

		for(i = 1 ; i < n/2 ; i++) {
			if(n % i == 0)  {
				Sum = Sum + i;
			}
		}
		if (Sum == n) {
			System.out.format("\n% d is a Perfect Number", n);
		}
		else {
			System.out.format("\n% d is NOT a Perfect Number", n);
		}
		sc.close();
	}

}
