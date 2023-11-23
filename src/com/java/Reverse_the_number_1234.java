package com.java;

public class Reverse_the_number_1234 {
	public static void main(String[] arms) {
		int num = 1234;
		int reminter = 0;
		while (num > 0) {
			int n = num % 10;
			reminter = (reminter * 10) + n;
			num /= 10;
		}
		System.out.println(reminter);
	}

}
