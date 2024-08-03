package com.java;

public class Each_Word_Of_1st_Letter_Capital {
	public static void main(String args[]) {
		String S1 = "wellcome to java";
		String S2 = "";
		String[] S3 = S1.split(" ");
		for (String S4 : S3) {
			char ch = S4.charAt(0);
			char a = Character.toUpperCase(ch);
			String b = S4.substring(1);
			S2 = S2 + a + b + " ";
		}
		System.out.println(S2);

	}

}
