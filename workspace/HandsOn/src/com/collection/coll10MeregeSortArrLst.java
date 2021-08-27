/*10.Write a code to read two int array lists of size 5 each as input and to merge the two arrayLists, sort the merged arraylist in ascending order and fetch the elements at 2nd, 6th and 8th index into a new arrayList and return the final ArrayList. */
package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class coll10MeregeSortArrLst {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		ArrayList<Integer> ans = new ArrayList<Integer>();
		
		System.out.println("Enter 5 sized array1");
		for (int i = 0; i < 5; i++)
			al1.add(sc.nextInt());
		
		System.out.println("Enter 5 sized array2");
		for (int j = 0; j < 5; j++)
			al2.add(sc.nextInt());
		
		ans.addAll(al1);
		ans.addAll(al2);
		Collections.sort(ans);
		
		

		System.out.println("Merge sorted array list"+ ans);
		System.out.println(ans.get(2));
		System.out.println(ans.get(6));
		System.out.println(ans.get(8));
		
		sc.close();
	}
}
