package com.java;

import java.util.Scanner;

public class Reverse_the_Num_using_Scanner_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");

		try {
			int rev = sc.nextInt();
			int remainter = 0;
			while (rev > 0) {
				int n = (rev % 10);
				remainter = (remainter * 10) + n;
				rev /= 10;
			}
			System.out.println(remainter);
		} //catch (InputMismatchException e) //--> it is use for only "InputMismatchException"
		catch (Exception e)  //--> it is use for all exception 
		{
			System.out.println("Invalid input. Please enter a valid number.");
		}

		sc.close();
	}

}
