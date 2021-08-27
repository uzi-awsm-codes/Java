/*19.Given a HashMap as input, write a program to perform the following operation : If the keys are divisible by 3 then remove that key and its values and print the number of remaining keys in the hashmap.*/
package com.collection.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class coll19HashRmvSize {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter n");
		int s = sc.nextInt();

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		System.out.println("Enter");
		for (int i = 0; i < s; i++) {
			hm.put(sc.nextInt(), sc.next());
			sc.nextLine();
		}
		System.out.println(hm);
		
		Iterator<Map.Entry<Integer, String>> iterator = hm.entrySet().iterator(); 
		
		while (iterator.hasNext()) {
			Map.Entry<Integer, String> entry = iterator.next(); 
			int j = entry.getKey();
			if (j % 3 == 0) {
				iterator.remove();
			}
		}
		System.out.println(hm.size());
		
		sc.close();
	}	
}
