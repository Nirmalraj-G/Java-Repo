package FullStack;

import java.util.Scanner;

public class PalindromeProgram {
	public static void main (String args[] ) {
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Enter the anything:");
		String a = myObj.next();
		String rev = " ";
		for(int i=a.length()-1; i>=0; i--) {
			rev = rev+a.charAt(i);
		}
		System.out.println(a);
	}
}
