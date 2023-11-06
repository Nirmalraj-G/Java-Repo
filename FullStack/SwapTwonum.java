package FullStack;

import java.util.Scanner;

public class SwapTwonum {
	public static void main(String args[]) {
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Enter any number : ");
		int a = myObj.nextInt();
		System.out.println("Enter any number : ");
		int b = myObj.nextInt();
		System.out.println("Before swapping: a = " + a + ", b = "+b);
		a = a + b;
		b = a - b;
	    a = a - b;
	     System.out.println("After swapping: a = " + a + ", b = "+b);
	}
}
