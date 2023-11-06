package FullStack;

import java.util.Scanner;

public class IfElseSta {
	public static void main (String args[]) {
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Enter your age:");
		int age = myObj.nextInt();
		if(age>=18) {
			System.out.println("Your are eligible for Voting");
		}else {
			System.out.println("Your are not eligible");
		}
	}
}
