/*9.Given a date as a string input in the format dd-mm-yy, write a program to extract the month and to print the month name in upper case.*/
package com.collection;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Coll9ExtractFromString {

		public static void main(String[] args) throws ParseException {

		    Scanner sc = new Scanner(System.in);
		    System.out.println("Enter Date in dd-mm-yy formate");
		    String s1 = sc.nextLine();
		    
		    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yy");
		    SimpleDateFormat sdf1 = new SimpleDateFormat("MMMM");
		    Date d = sdf.parse(s1);
		    String s = sdf1.format(d);
		    System.out.println(sdf);
		    System.out.println(d);
		    System.out.println(sdf1);
		    System.out.println(s.toUpperCase());
		    sc.close();
		  }

}


