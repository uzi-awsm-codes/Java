/*6. Given the cubic capacity(CC) of a bike. Write a function to return the mileage/litre for the given Cubic Capacity(CC). The mileage will be calculated as follows:

if CC is between 100 and 125, mileage is 75
if CC is between 126 and 135, mileage is 70
if CC is between 136 and 150, mileage is 60
if CC is between 151 and 200, mileage is 50
if CC is between 201 and 220, mileage is 35 */

package com.fundamental;

import java.util.Scanner;

public class CCmilage {

	public static int milage(int cc){
		int mil=0;
		
		if (cc >= 100 && cc <= 125)
			mil= 75;
		else if (cc >= 126 && cc <= 135)
			mil= 70;
		else if (cc >= 136 && cc <= 150)
			mil= 60;
		else if (cc >= 151 && cc <= 200)
			mil= 50;
		else if (cc >= 201 && cc <= 220)
			mil= 35;
		
		return mil;
			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter CC of the bike");
		int cc = sc.nextInt();
		
		System.out.println("milage = "+milage(cc));
		
		sc.close();
	}

}
