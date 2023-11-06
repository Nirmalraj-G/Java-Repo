package FullStack;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main (String args[]) {
		Scanner myObj = new Scanner (System.in);
		
		System.out.println("Enter any Number:");
		int n = myObj.nextInt();
		int a=1,b=0,c;
		
		for(int i=1; i<=n; i++) {
			c = a + b;
			a = b;
			b = c;
			
			System.out.print(a+" ");
		}
	}
}
