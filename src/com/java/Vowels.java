package com.java;

public class Vowels {
	public static void main(String args[]) {
		String vo = "Hello World";
		int vowels = 0;
		int nonVowels = 0;
		for (int i = 0; i < vo.length(); i++) {
			char ch = vo.charAt(i);
			if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O'
					|| ch == 'U' || ch == 'u') {

				vowels++;

			} else {
				nonVowels++;
			}

		}
		System.out.println("vowels is :" + vowels);
		System.out.println("Non vowels is :" + nonVowels);
	}

}
