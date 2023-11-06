package FullStack;

import java.util.Scanner;

public class MonkeyGame {
	public static void main (String args[]) {
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Enter the time:");
		int time = myObj.nextInt();
		
		if(time >= 6 && time<=11) {
			System.out.println("Monkey has escaped from Crocodile");
		}else if (time >=11 && time<=15) {
			System.out.println("Crocodile are awake so monkey cant escape");
		}else if(time>=15 && time<=19) {
			System.out.println("Monkey has escaped from Crocodile");
		}else if (time>=19 && time<=24) {
			System.out.println("Crocodile are awake so monkey cant escape");
		}else {
			System.out.println("Both are Sleeping");
		}
	}
}
