package FullStack;

class Number{
	void display() {
		try {
			String str = "Two";
			int num = Integer.parseInt(str);
		} catch(NumberFormatException e) {
			System.out.println(e);
		}
		System.out.println("Errow cleared");
	}
}

public class NumberExcept {
	
	public static void main (String args[]) {
		Number num = new Number();
		num.display();
	}
}
