/*11.
1.	Read 2n numbers as input where the first number represents a key and second one as value. Both the numbers are of type integers.
2.	Write a function getAverageOfOdd to find out average of all values whose keys are represented by odd numbers.
*/
package com.collection.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class coll11HashAvg {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter n");
		int s = sc.nextInt();
		int sum = 0, count = 0;
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		
		System.out.println("Enter");
		for (int i = 0; i < s; i++) {
			hm.put(sc.nextInt(), sc.nextInt());
		}
		System.out.println(hm);
		
		Iterator<Integer> itr = hm.keySet().iterator();
		
			while (itr.hasNext()) {
				int j = itr.next();
				if (j % 2 != 0) {
					sum += hm.get(j);
					count++;
				}
			}
			
			
			System.out.println(sum+ "/"+ count);
			System.out.println(sum / count);
			
			
		
		sc.close();
	}
}