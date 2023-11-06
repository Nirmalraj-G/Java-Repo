package FullStack;

public class ArithmeticExcept {

	public static void main(String args[]) {
		
		int a = 10;
		int b = 0;
		
		try {
			int c = a/b;
			System.out.println(c);
		} catch(Exception ex) {
			System.out.println(ex);
		}
		System.out.println("hello everyone");
	}
}
