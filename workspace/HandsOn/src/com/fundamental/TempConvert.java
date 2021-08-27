/*2.Write a program to convert given temperature from Fahrenheit to Centigrade. 
Formula:
C/5 = (F-32)/9
C stands for Centigrade.
F stands for Fahrenheit.
The output should be displayed correct to 2 decimal places.*/
package com.fundamental;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        double f = 0.0, c = 0.0; 
        
        System.out.println("Enter temperatur in Fahrenheit");
        f = sc.nextDouble(); 
        
        c = ((f - 32) * 5 / 9); 
  
        System.out.println("value of temperature in celsius:" + Math.round(c)); 
        sc.close();
	}

}

