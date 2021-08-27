/*6.Write a program that takes two ArrayLists as input and  finds out all elements present either in A or B, but not in both.*/
package com.collection;

import java.util.ArrayList;
import java.util.Scanner; 

public class Coll6NotCommonArrList {

    public static void main(String[] args) 
    { 
    	Scanner sc = new Scanner(System.in);
    	
//    	String str1 = sc.nextLine();
//   	String str2 = sc.nextLine();
//        String str[] = strings.split(" ");
        
//        List nl = new ArrayList();
//        nl = Arrays.asList(str);
    	
        ArrayList<String> list1 = new ArrayList<String>(); 

        list1.add("hello"); 
        list1.add("world"); 

        System.out.println("List1: "+ list1); 
   
        ArrayList<String> list2 = new ArrayList<String>(); 

        list2.add("hello"); 
        list2.add("user"); 
        System.out.println("List2: "+ list2); 
  
        ArrayList<String> comn = (ArrayList<String>) list1.clone();

        comn.retainAll(list2); 
        System.out.println("Common elements: "+ comn); 
        
        list1.removeAll(comn);
        list2.removeAll(comn);
        
        System.out.println("List1: "+ list1); 
        System.out.println("List2: "+ list2);

		sc.close();
    } 
} 