/*17.Given a method with a HashMap<int, float> as input. Write code to find out avg of all values whose keys are even numbers. Round the average to two decimal places and return as output.package */
package com.collection.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class coll17FloatRound {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter n");
		int s = sc.nextInt();
		float sum = 0;
		int count = 0;
		HashMap<Integer, Float> hm = new HashMap<Integer, Float>();
		
		System.out.println("Enter");
		for (int i = 0; i < s; i++) {
			hm.put(sc.nextInt(), sc.nextFloat());
		}
		System.out.println(hm);
		
		Iterator<Integer> itr = hm.keySet().iterator();
		
			while (itr.hasNext()) {
				int j = itr.next();
				if (j % 2 == 0) {
					sum += hm.get(j);
					count++;
				}
			}
			
		float avg = sum / count;	
		System.out.format("%.2f / %d \n", sum, count);	
//		System.out.println(sum+ "/"+ count);
//		System.out.println(avg);
		System.out.format("%.2f", avg);	
			
			
		
		sc.close();
	}
}