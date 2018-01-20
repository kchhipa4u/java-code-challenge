package com.fundamentals.string;

/*
 * First two strings (s1 & s2) are compile time constants hence they will go to Pool. While last one will be created on 
 * heap as s1.length is not compile time constant so compiler will leave this to JVM who eventually put this on heap.
 * o/p :-
 * 
 */
public class StringComparisonChallenge {

	public static void main(String[] args) {
		String s1 = "five5";
		String s2 = "five"+"5";
		String s3 = "five"+s1.length();
		System.out.println(s1 == s2);//true
		System.out.println(s1 == s3);//false
		System.out.println(s2 == s3);//false
	}
}
