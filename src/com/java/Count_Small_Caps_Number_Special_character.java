package com.java;

import java.util.Scanner;

public class Count_Small_Caps_Number_Special_character {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		// Hello World, tomorrow 5.00 pm go to Office!

		int count = 0;
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;

		String str = sc.nextLine();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				count++;
			} else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				count1++;
			} else if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				count2++;
			} else {
				count3++;
			}

		}
		System.out.println("Capital letter: " + count);
		System.out.println("Small letter: " + count1);
		System.out.println("Number: " + count2);
		System.out.println("Specal Char: " + count3);
		sc.close();

	}

}
