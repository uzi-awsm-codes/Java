/*15. Write a program to read a string and an integer and return a string based on the below rules.
If input2 is equal or greater than 3 then repeat the first three character of the String by given input2 times, separated by a space.
If input2 is 2 then repeat the first two character of String two times separated by a space,If input2 is 1 then return the first character of the String.*/
package com.string;

import java.util.Scanner;

public class Str15 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the string");
        String str = scan.next();
        System.out.println("Enter the int");
        int a = scan.nextInt();
        String str1 = "";
        
        if (a >= 3) {
            for (int i = 0; i < a; i++)
            	str1 = str1 + str.substring(0,3);
        }
        
        if (a == 2) {
            for (int i = 0; i < 2; i++)
                str1 = str1 + str.substring(0,2) + " ";
        }
        
        if (a == 1)
            str1 = str1 + str.charAt(0);
            
        System.out.println(str1);
        scan.close();
    }
}