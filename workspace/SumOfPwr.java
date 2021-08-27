/*15.Create a class with a method to find the difference between the sum of the squares and the square of the sum of the first n natural numbers.For Example if n is 10,you have to find 
(1^2+2^2+3^2+….9^2+10^2)- (1+2+3+4+5…+9+10)^2 */
package com.Statements;

import java.util.Scanner;
public class SumOfPwr {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n = sc.nextInt();
		
		int sum=0, pwrsum=0;
		
		for(int i=1; i<=n ; i++) {
			pwrsum =  pwrsum + (int) Math.pow(i, 2);
			sum = sum +i;
		}
		
		int diff = pwrsum - (int) Math.pow(sum, 2);
		
		System.out.println("Diff = "+diff);
		//System.out.println("pwr of sum = "+Math.pow(sum, 2));System.out.println("sum of pwr = "+pwrsum);
		
		sc.close();
	}

}
