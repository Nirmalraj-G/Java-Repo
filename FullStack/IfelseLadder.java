package FullStack;

import java.util.Scanner;

public class IfelseLadder {
	public static void main (String args[]) {
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Enter your mark:");
		int mark = myObj.nextInt();
		
		if(mark>=90 && mark<=100) {
			System.out.println("Grade A");
		}else if(mark>=80 && mark<=89) {
			System.out.println("Grade B");
		}else if(mark>=70 && mark<=79) {
			System.out.println("Grade C");
		}else if(mark>=60 && mark<=69) {
			System.out.println("Grade D");
		}else if(mark>=50 && mark<=59) {
			System.out.println("Grade E");
		}else if(mark>=35 && mark<=49) {
			System.out.println("Grade F");
		}else {
			System.out.println("Fail");
		}
	}
}
