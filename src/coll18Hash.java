package com.collection.hashmap;
/*18.Given input as HashMap, value consists of marks and rollno as key.Find the sum of the lowest three subject marks from the HashMap.*/

import java.util.*;

public class coll18Hash {
	public static void main(String[] args) {
		System.out.println("enter an no of subjects");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 0, sum = 0;
		
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (i = 0; i < n; i++) {
			hm.put(sc.nextInt(), sc.nextInt());
		}
		Iterator<Integer> itr = hm.values().iterator();
		while (itr.hasNext()) {
			al.add(itr.next());
		}
		
		Collections.sort(al);
		System.out.println(al);
		
		for (i = 0; i < 3; i++) {
			sum = sum + al.get(i);
		}
		
		System.out.println(sum);
		sc.close();
	}
}