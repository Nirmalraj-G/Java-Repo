package FullStack;

import java.util.Scanner;

public class FactorialNumber {
	public static void main (String args[]) {
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int n = myObj.nextInt();
		int f =1;
		
		for(int i=1; i<=n; i++)
		{
			f = f*i;
			
		}
		System.out.print(f);
	}
	
}
