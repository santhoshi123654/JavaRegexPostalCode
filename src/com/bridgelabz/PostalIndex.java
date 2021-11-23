package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PostalIndex {
	
	public static void main(String[] args) {
		
		String pattern = "^[1-9]{1}[0-9]{2}(\\s)?[0-9]{3}$";
		String Pincode = "400 888";
		System.out.println(Pattern.matches(pattern, Pincode));
		String pincode2 = "500068";
		System.out.println(Pattern.matches(pattern, pincode2));
	}
}
