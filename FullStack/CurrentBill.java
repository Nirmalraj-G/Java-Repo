package FullStack;

import java.util.Scanner;

public class CurrentBill {
	public static void main(String args[]) {
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Enter your unit:");
		int unit = myObj.nextInt();
		
		System.out.println("Enter unit value:");
		long value = myObj.nextLong();
		
		if(unit <= 300) {
			System.out.println("You NO need to pay the bill");
		}else {
			System.out.println("You have to pay " + (value*unit));
		}
	}

}
