/*13.Given a string, startIndex and length, write a program to extract the substring from right to left. Assume the last character has index 0.*/
package com.string;

import java.util.Scanner;

public class ExtractStr13 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter string");
        String str = scan.next();
        System.out.println("Enter start index");
        int startIndex = scan.nextInt();
        System.out.println("Enter length");
        int len = scan.nextInt();
        
        String str1 = "";
        
        for (int i = startIndex - 1; i >= startIndex - len; i--) {
            str1 = str1 + str.charAt(i);
        }
        
        System.out.println(str1);
        scan.close();
    }
}