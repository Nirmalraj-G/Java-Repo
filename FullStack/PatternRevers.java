package FullStack;

import java.util.Scanner;

public class PatternRevers {
	public static void main(String args[]) {
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Enter the No of rows:");
		int row = myObj.nextInt();
		
		for(int i=0; i<=row-i; i++) {
			for(int j=0; j<=row; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
