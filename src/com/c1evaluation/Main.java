package com.c1evaluation;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Students you want to enter ");
		int numberOfStudent = sc.nextInt();
		for(int i=0; i<numberOfStudent; i++) {
			System.out.println("==================================");
			System.out.println("Enter the Roll Number : ");
			int roll = sc.nextInt();
			
			System.out.println("Enter the Name : ");
			String name = sc.next();
			
			System.out.println("Enter the marks : ");
			int marks = sc.nextInt();
			
			Student std = new Student();
			std.setRollNumber(roll);
			std.setStudentName(name);
			std.setMarks(marks);
			std.displayDetail(i+1);
		}
	}

}
