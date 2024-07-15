package com.java;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Remove_Duplicate_In_Array {

	/*
	 * Using a Set: You can convert the array to a Set, which automatically removes 
	 * duplicates because Sets do not allow duplicate elements.
	 */
	public static void main(String[] args) {
		int a[]= {30,50,40,30,10,20,40,50,50,10,20};
		Set<Integer> set = new HashSet<>();
        for (int num : a) {
            set.add(num);
        }
        Integer[] uniqueArray = set.toArray(new Integer[0]);
        System.out.println(Arrays.toString(uniqueArray));

	}

}
