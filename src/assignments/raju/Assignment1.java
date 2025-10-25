package assignments.raju;

import java.util.Arrays;

public class Assignment1 {

	public static String sortString(String str) {
		char[] charArray = str.toCharArray();
		Arrays.sort(charArray);
		return new String(charArray);
	}

	// Write a program to check whether the given strings are anagrams
	// Ex: listen <-> silent, demo <-> mode, java <-> python
	public static void checkAnagrams(String str1, String str2) {  
		// demo and mode  -> demo demo, java and  python -> aajv hnopty, listen silent -> eilnst  eilnst
		if (sortString(str1).equals(sortString(str2))) {
			System.out.println(str1 + " and " + str2 + " are Anagrams");
		} else {
			System.out.println(str1 + " and " + str2 + " are not Anagrams");
		}
	}

	public static void main(String[] args) {
		checkAnagrams("listen", "silent");
		checkAnagrams("demo", "mode");
		checkAnagrams("java", "python");
	}

}
