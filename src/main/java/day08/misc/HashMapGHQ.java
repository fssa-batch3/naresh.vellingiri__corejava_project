package day08.misc;

import java.util.HashMap;
import java.util.Set;

public class HashMapGHQ {
	static void charNum(String inputString) {
		HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();
		char[] strArray = inputString.toCharArray();
		for (char c : strArray) {
			if (charMap.containsKey(c)) {
				charMap.put(c, charMap.get(c) + 1);
			} else {
				charMap.put(c, 1);
			}
		}
		Set<Character> charInString = charMap.keySet();
		for (Character ch : charInString) {
			if (charMap.get(ch) > 1) {
				System.out.println(ch + " : " + charMap.get(ch));
			}
		}
	}

	public static void main(String[] args) {
		charNum("JavaJ2Ee");
	}
}
