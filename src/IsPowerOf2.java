/*2.Check whether given number is a power of 2 or not .If yes Print 'Yes' else 'No'.*/

package com.Statements;

import java.util.Scanner;

public class IsPowerOf2 {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number ");
		int num = sc.nextInt();
		
		double pow = (Math.log(num) / Math.log(2));
		
		if(Math.ceil(pow) == Math.floor(pow))
			System.out.println("Yes");
		else
			System.out.println("No");
		
		sc.close();
	}
}		



