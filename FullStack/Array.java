package FullStack;

public class Array {
	public static void main(String args[]) {
//		single dimension array
		int[]myArray = {1,2,3,4,5};
		
		System.out.println(myArray[2]);
//		Multi Dimension array
		int a[][] = {{1,2,3,4},{5,6,7,8,9}};
		System.out.println(a[1][1]);
	
		String []flower = {"rose","jasmine","lotus","whiterose"};
		flower[(0)] = "redrose";
		System.out.println(flower[(0)]);
	}
}
