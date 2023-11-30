package com.java;

public class Print_Only_String {
	public static void main(String[] agrs) {
		String word = "Nagercoil 629002";
		System.out.println(word.replaceAll("[0-9]", ""));
	}
}
