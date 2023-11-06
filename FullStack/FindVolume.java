package FullStack;

public class FindVolume {
	static int myBox(int l, int b, int h) {
		return l*b*h;
	}
	
	public static void main(String args[]) {
		int var = myBox(10, 5, 12);
		System.out.println(var);
	}
}
