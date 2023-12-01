package com.java;

import java.util.Scanner;

public class Check_Only_String_Or_Not {
	// Normal Method
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value");
		String word = sc.nextLine();
		
		///Normel method
//		int cound = 0;
//
//		for (int i = 0; i > word.length(); i++) {
//			if (word.charAt(i) > 0)
//
//				if (word.charAt(i) < 9)
//					cound++;
//
//		}
//		if (cound == word.length()) {
//			System.out.println("All are numberse");
//		} else {
//			System.out.println("All are not in numberse");
//		}

		// Using predefind method
		String word2 = word.replaceAll("[a-zA-Z]", "");
		if (word == word2) {
			System.out.println("there is no String");
		} else {
			System.out.println("Strings are ther");
		}
		sc.close();
	}

}
