package FullStack;

import java.util.Scanner;

public class Pub {
	public static void main(String args[]) {
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Enter your age: ");
		int age = myObj.nextInt();
		
		
		if(age>=18) {
			System.out.println("Do you have MemberShip card: ");
			String card = myObj.next();
			
			if(card.equals("yes")) {
				System.out.println("You are Eligible for 10% Discount");
			}else if(card.equals("no")) {
				System.out.println("You are Eligible for 5% Discount");
			}
		}else {
			System.out.println("Sorry You are Not Eligible for any Discount");
		}
	}
}
