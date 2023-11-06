package FullStack;

import java.util.Scanner;

public class ArithmaticOperator {
	public static void main(String args[]) {
		Scanner addNum = new Scanner(System.in);
		
		System.out.println("Enter First num_1");
		int num_1 = addNum.nextInt();
		System.out.println("Enter Second num_2");
		int num_2 = addNum.nextInt();
		System.out.println( "Addition is  " + (num_1 + num_2));
		System.out.println("Multiplication is " + (num_1 * num_2));
		System.out.println("subtration is " +(num_1 - num_2));
		System.out.println("Division is "  + (num_1 / num_2));
		System.out.println("Modolus is " + (num_1 % num_2));
	}

}
