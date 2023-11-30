package com.java;

public class Print_Only_Int {
	public static void main(String[] args) {
		String word = "Nagercoil 629002";
		
		//regex in java   \s -->	Find a whitespace character
		System.out.println(word.replaceAll("[a-zA-Z\\s]", ""));
	}

}
