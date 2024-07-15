package com.java;

import java.util.Arrays;
import java.util.Collections;

public class Array_Ascending_Descending_Order {

	public static void main(String[] args) {
		//int[] a = { 20, 10, 50, 70, 40, 60, 30 };
		Integer [] arr = { 20, 10, 50, 70, 40, 60, 30 };
		Arrays.sort(arr);
		System.out.println("Ascending order: " + Arrays.toString(arr));
		
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println("Descending order :" + Arrays.toString(arr));
	}
}
