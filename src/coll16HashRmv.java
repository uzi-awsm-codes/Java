/*16. Given a method with a HashMap<Integer,string> as input. 
  Write code to remove all the entries having keys multiple of 4 and return the size of the final hashmap.*/
package com.collection.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class coll16HashRmv {
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
		
//		Iterator<Integer> itr = hm.keySet().iterator();
//		
//		while (itr.hasNext()) {
//			int j = itr.next();
//			System.out.println(j);
//			if (j % 4 == 0) {
//				hm.remove(j);
//				//j=itr.previous();
//			}
//		}
		
		 Iterator<Map.Entry<Integer, String>> iterator = hm.entrySet().iterator(); 
			
			while (iterator.hasNext()) {
				Map.Entry<Integer, String> entry = iterator.next(); 
				int j = entry.getKey();
				if (j % 4 == 0) {
					iterator.remove();
				}
			}
		System.out.println(hm);
		
		sc.close();
	}	
}
