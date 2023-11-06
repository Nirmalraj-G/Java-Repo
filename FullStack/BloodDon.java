package FullStack;

import java.util.Scanner;

public class BloodDon {
	public static void main(String args[]) {
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Enter your age: ");
		int age = myObj.nextInt();
		System.out.println("Enter your weight: ");
		int weight = myObj.nextInt();
		
		if(age>=18) {
			if(weight>=45) {
				System.out.println("You are eligible for Blood Donation");
			}else {
				System.out.println("Your weiht is below 45 so NOT eligible");
			}
		}else {
			System.out.println("Your age is below 18 so NOT eligible");
		}
	}

}
