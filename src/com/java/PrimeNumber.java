package com.java;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number to check if it's prime: ");
		int number = scanner.nextInt();

		if (isPrime(number)) {
			System.out.println(number + " is a prime number.");
		} else {
			System.out.println(number + " is not a prime number.");
		}

		scanner.close();
	}

	 //Function to check if a number is prime
	public static boolean isPrime(int number) {
		if (number <= 1) {
			return false;
		}
		// Check from 2 to sqrt(number)
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

}
