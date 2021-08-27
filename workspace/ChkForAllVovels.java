/*10.Write a program to read a String and check if that String contains all the vowels. Print “yes” if the string contains all vowels else print “no”.*/

package com.string;

public class ChkForAllVovels {

	static int checkIfAllVowels(String str) {

		int[] chk = new int[5];

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == 'A' || str.charAt(i) == 'a')
				chk[0] = 1;

			else if (str.charAt(i) == 'E' || str.charAt(i) == 'e')
				chk[1] = 1;

			else if (str.charAt(i) == 'I' || str.charAt(i) == 'i')
				chk[2] = 1;

			else if (str.charAt(i) == 'O' || str.charAt(i) == 'o')
				chk[3] = 1;

			else if (str.charAt(i) == 'U' || str.charAt(i) == 'u')
				chk[4] = 1;
		}

		for (int i = 0; i < 5; i++) {
			if (chk[i] == 0) {
				return 1;
			}
		}
		return 0;
	}

	static void checkIfAllVowelsArePresent(String str) {

		if (checkIfAllVowels(str) == 1)
			System.out.print("Not Accepted\n");
		else
			System.out.print("Accepted\n");
	}

	public static void main(String[] args) {
		String str = "aeioubc";
		checkIfAllVowelsArePresent(str);
	}
}