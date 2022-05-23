package com.c1evaluation;
import java.util.Scanner;

public class Course {

	int courseId;
	String courseName;
	int courseFee;
	
	void displayCourseDetails() {
		System.out.println("Course Id: "+courseId);
		System.out.println("Course Name: "+courseName);
		System.out.println("Course Fee: "+courseFee);
	}
	
	static void authenticate(String username, String password) {
		if(username == "Admin" && password=="1234") {

			Scanner sc = new Scanner(System.in);
			
			Course c1 = new Course();
			System.out.println("Course Id: "); 
			c1.courseId = sc.nextInt();
			System.out.println("Course Name: ");
			c1.courseName = sc.next();
			
			System.out.println("Course Fee: ");
			c1.courseFee = sc.nextInt();
			
			c1.displayCourseDetails();
		}
		else {
			System.out.println("Invalid Username or password");
		}
	}
	
	public static void main(String[] args) {
		authenticate("Admin","1234");  //valid username and password
		authenticate("Niraj","1235");  //invalid usename and password
	}

}
