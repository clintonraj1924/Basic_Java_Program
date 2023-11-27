package com.java;

import java.util.Scanner;

public class Reverse_string_using_Scanner_class {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");

		String word = sc.nextLine();
		String word2 = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			word2 = word2 + word.charAt(i);
		}
		System.out.println(word2);
		sc.close();
	}

}
