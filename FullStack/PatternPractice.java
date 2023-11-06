package FullStack;

import java.util.Scanner;

public class PatternPractice {
	public static void main(String args[]) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter the value:");
		int row = myObj.nextInt();
		
		int i,j,k;
//		for(i=1; i<=row; i++) {
//			for(j=1; j<=i+1; j++) {
//				System.out.print(" ");
//			}for(k=row; k>=i; k--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		for(i=1; i<=row; i++) {
			for(j=1; j<=row-i; j++) {
				System.out.print("*");
//			}for(k=1; k<=row-1; k++) {
//				System.out.print("*");
			}
			System.out.println();
		}
//		for(i=1; i<=row; i++) {
//			for(j=1; j<=row-i; j++) {
//				System.out.print(" ");
//			}for(k=1; k<=i; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//			
//		}

		
	}
}
