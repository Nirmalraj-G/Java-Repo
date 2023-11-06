package FullStack;

import java.util.Scanner;

public class PrimeNumber {
	public static void main (String args[]) {
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int a = myObj.nextInt();
		int b = a % 2;
		
		if(b == 1) {
			System.out.println("Prime number");
		}else {
			System.out.println("NOt a Prime number");
		}
	}
}