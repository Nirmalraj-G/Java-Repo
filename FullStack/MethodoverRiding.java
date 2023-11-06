package FullStack;

class Parentt{
	void display() {
		System.out.println("Hello Everyone");
	}
}
class Childd extends Parentt{
	void display() {
		super.display();
		System.out.println("Welcome to my World");
	}
}

public class MethodoverRiding {
	public static void main(String args[]) {
		Childd chs = new Childd();
		chs.display();
	}
}
