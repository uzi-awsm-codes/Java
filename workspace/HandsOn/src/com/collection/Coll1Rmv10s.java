/*Write a program to read an integer array and remove all 10s from the array, shift the other elements towards left and fill the trailing empty positions by 0 so that the modified array is of the same length of the given array. (Do with list)*/
package com.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Coll1Rmv10s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		int i, k = 0;
		int a[] = new int[n];
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for (i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		for (i = 0; i < n; i++) {
			if (a[i] != 10) {
					al.add(a[i]);
			}
		}
		if (al.size() < n) {
			k = n - al.size();
			for (i = 0; i < k; i++) {
				al.add(0);
			}
		}
		System.out.println(al);
		sc.close();
	}

}
