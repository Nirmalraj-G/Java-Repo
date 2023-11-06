package FullStack;

import java.util.Scanner;

public class Patterns {
	public static void main(String args[]) {
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Enter the No of rows:");
		int row = myObj.nextInt();
		
//		for(int i=0; i<=row; i++) {
//			for(int j=0; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		Rectangle pattern
//		int i,j,k;
//		for(i=1; i<=row; i++) {
//			for(j=1; j<=row-i; j++) {
//				System.out.print(" ");
//			}for (k=1; k<=i*2-1; k++) {
//				System.out.print("N");
//			}
//			System.out.println();
//		}
//		for(int i=0; i<=row-1; i++) {
		
//			for(int j=row; j>=i; j--) {
//			System.out.print(" ");
//			}
//			for(int k=1; k<=i+1; k++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
//		C letter pattern
//		int a,b,c;
//		for(a=1; a<=row; a++) {
//			System.out.print("* ");
//		}for(b=1; b<=row; b++) {
//			
//			System.out.println("*");
//		}for(c=0; c<=row; c++) {
//			System.out.print("* ");
//		}
		
//		Left angle triangle
//		int i,j;
//		for(i=1; i<=row; i++) {
//			for(j=1; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		Left angle reverse triangle
//		int i,j;
//		for(i=1; i<=row; i++) {
//			for(j=1; j<=row-i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
//		Right angle triangle
//		int i,j,k;
//		for(i=1; i<=row; i++) {
//			for(j=1; j<=row-i; j++) {
//				System.out.print(" ");
//			}for(k=1; k<=i; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		for(int i=0; i<row; i++){
			for(int j=0; j<row; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
