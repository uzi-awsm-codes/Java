/*12.Write a program to read a string that contains a sentence and read a word. Check the number of occurances of that word in the sentence.*/
package com.string;

import java.util.Scanner;

public class SrhWrdInSentnce12 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a sentence");
        String sentence = scan.nextLine();
        System.out.println("Enter the word to be searched");
        String word = scan.next();
        int count = 0;
        String str[] = sentence.split(" "); 
  
        for (int i = 0; i < str.length; i++)  
            if (word.equals(str[i])) 
                count++; 
  
        System.out.println(count);
        
        scan.close();
    }
}