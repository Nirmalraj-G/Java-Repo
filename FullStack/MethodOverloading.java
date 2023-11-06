package FullStack;

public class MethodOverloading {
	
	static int  myMethod(int x,int y) {
		return x+y;
	}
	
	static double myMethod(double a, double b, double c) {
		return a+b+c;
	}
	static long myMethod(long d, long f) {
		return d-f;
	}
	
	public static void main(String args[]) {
		int var = myMethod(4, 5);
		
		double var1 = myMethod(2, 4, 5);
		
		long var2 = myMethod(11L, 1L);
		
		System.out.println(var);
		System.out.println(var1);
		System.out.println(var2);
	}
}
