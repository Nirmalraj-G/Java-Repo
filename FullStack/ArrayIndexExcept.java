package FullStack;

public class ArrayIndexExcept {

	public static void main(String args[]) {
		
		int a [] = {1,2,3,4,5,};
		
		try {
			int b[] = new int[5];
			b[6] = 12;
			System.out.println(b);
		}catch(ArrayIndexOutOfBoundsException obj) {
			System.out.println(obj);
		}
		System.out.println(a);
	}
}
