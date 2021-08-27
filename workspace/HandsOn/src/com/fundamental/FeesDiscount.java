/*8.Student Fees is calculated according to the student's 10th marks. The student will get discount in fees as follows :
Marks discount(%)
>90         -  50%
81-90      - 25%
70-80      - 10%
<70         -  0%
Calculate the fees according to above table.
Note:
Formula : fees - (fees* discount(%))*/

package com.fundamental;

import java.util.Scanner;

public class FeesDiscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int discount = 0, fees = 10000;
		
		System.out.println("Enter marks of student");
		int marks = sc.nextInt();
		
		
		if (marks >90)
			discount = 50;
		else if (marks >= 81 && marks <= 90)
			discount = 25;
		else if (marks >= 70 && marks <= 80 )
			discount = 10;
		else
			discount = 0;
			
		fees = fees - (fees * discount/100);	
		
		System.out.println("discount = "+discount);
		System.out.println("fees = "+fees);
		
		sc.close();
	}

}
