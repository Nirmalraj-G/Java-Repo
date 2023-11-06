package FullStack;

import java.util.Scanner;

public class BioData {
	public static void main(String args[]) {
		Scanner myData = new Scanner(System.in);
		
		System.out.println("Enter your name:");
		String name = myData.next();
		System.out.println("Enter your age:");
		int age = myData.nextInt();
		System.out.println("Enter your address");
		String address = myData.nextLine();
		String address1 = myData.nextLine();
		String address2 = myData.nextLine();
		String address3 = myData.nextLine();
		System.out.println("Enter your phNumber");
		long phNumber = myData.nextLong();
		System.out.println("Enter your cgpa");
		float cgpa = myData.nextFloat();
	}

}
