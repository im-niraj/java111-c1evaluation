package com.c1evaluation;

public class Immutable {

	public static void main(String[] args) {
//		String Immutable
//		Immutable means Once value assign we cann't reassign or change the value of that object
		
		String str  = "Welcome";
		String str2  = "Welcome";
		// str has value "Welcome" 
		// but str2 has "Welcome" value's address because str2 object has not created
		// if some one do change the value of str2 = "welcome back" then str also changed
		// that is why Java is immutable 
		System.out.println(str);
		System.out.println(str2);
		
		String abc = str.concat("to the Java"); // but we can assinge it to another address with new value
		System.out.println(abc);
		
		
//		method #1 of string  charAt
		String s1 = "hello";
		System.out.println(s1.charAt(2)); // l

//		method #2 of string  length
		String s2 = "Washington";
		System.out.println(s2.length());  // 10
		
//		method #3 of string  endsWith
		String s3 = "Uttarakhand";
		// endsWith returns boolean value
		System.out.println(s3.endsWith("Utt"));// false
		System.out.println(s3.endsWith("d"));// true
		System.out.println(s3.endsWith("khand"));// true
		
//		method #4 of string  equals
		String s4 = "Mirzapur";
		String s411 = "Varanasi";
		String s41 = "Mirzapur";
		// equals returns true or false 
		System.out.println(s4.equals(s411));// false
		System.out.println(s4.equals(s41));// true
		
		
//		method #5 of string  
		char ch[] = {'A','P','P','L','E'};
		String sh = new String(ch);
		System.out.println(sh);
	}

}
