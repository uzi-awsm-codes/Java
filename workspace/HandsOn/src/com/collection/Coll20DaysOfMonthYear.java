/*20.Given two inputs year and month (Month is coded as: Jan=0, Feb=1 ,Mar=2 ...), write a program to find out total number of days in the given month for the given year.*/
//use calender class
package com.collection;

import java.util.Calendar;
import java.util.Scanner;

public class Coll20DaysOfMonthYear {

	public static void main(String[] args) {
		int month,year;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter month and year");
		month=scanner.nextInt();
		year=scanner.nextInt();
		Calendar calendar=Calendar.getInstance();
		calendar.set(Calendar.DATE,1);
		calendar.set(Calendar.MONTH, month-1);
		calendar.set(Calendar.YEAR, year);
		System.out.println(calendar.getActualMaximum(Calendar.DATE));
		//System.out.println(calendar.getActualMinimum(Calendar.DATE));
		//System.out.println(calendar.getActualMaximum(Calendar.MONTH));
		scanner.close();
	}

}

/* OR --------------------------------------------------------------------------------------------------------------------
import java.util.Scanner;

public class Coll20DaysOfMonthYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year, month;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter month n year");
		month = sc.nextInt();
		year = sc.nextInt();
		if(month == 0 || month == 2 || month == 4 || month == 6 || month == 7 || month == 9 || month == 11)
			System.out.print("Number of days is 31");
		else if((month == 1) && ((year%400==0) || (year%4==0 && year%100!=0)))
		{
			System.out.print("Number of days is 29");
		}
		else if(month == 1)
		{
			System.out.print("Number of days is 28");
		}
		else
			System.out.println("Number of days is 30");
		sc.close();
	}

}

*/