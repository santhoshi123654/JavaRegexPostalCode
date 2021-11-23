package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PostalIndex {
	
	public static void main(String[] args) {
		
		String pattern = "^[1-9]{1}[0-9]{5}$";
		String Pincode = "A400088";
		System.out.println(Pattern.matches(pattern, Pincode));
	}
}
