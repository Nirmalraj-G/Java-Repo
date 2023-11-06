package FullStack;

import java.util.Scanner;

public class SunTiming {
	public static void main(String args[]) {
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Enter the timing:");
		int timing = myObj.nextInt();
		
		if(timing>=7 && timing<=9) {
			System.out.println("Now the time is " + (timing)+ " and Temprature is medium");
		}else if (timing>=10 && timing<=12) {
			System.out.println("Now the time is " + (timing)+ " Temprature is little high");
		}else if (timing>=13 && timing<=16) {
			System.out.println("Now the time is " + (timing)+ " Temprature is high");
		}else if (timing>=17 && timing<=23) {
			System.out.println("Now the time is " + (timing)+ " Moon as arrived Temprature is low");
		}else {
			System.out.println("Now the time is " + (timing)+ " So the Temperature goes Down");
		}
	}
}
