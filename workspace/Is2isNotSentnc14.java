/*14.Given a string input, write a program to replace every appearance of the word "is" by "is not". If the word "is" is immediately preceeded or followed by a letter no change should be made to the string .*/
package com.string;

import java.util.Scanner;

public class Is2isNotSentnc14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a sentence");
        String sentence = sc.nextLine();
//        String str[] = sentence.split(" "); 
        String rs = sentence.replace(" is ", " is not ");
        
//        for (String i:str)
//        	if(i.equals("is")) {
//        		
//        	}
		System.out.println(rs);
        
		sc.close();
	}

}
