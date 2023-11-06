package FullStack;

interface BaseA{
	void display1();
}

interface BaseB{
	void display2();
}

public class InterfaceConc implements BaseA, BaseB {

	@Override
	public void display2() {
		System.out.println("Values of life");
		
	}

	@Override
	public void display1() {
		System.out.println("Money");
		
	}
public static void main(String args[]) {
		
		InterfaceConc ic = new InterfaceConc();
		
		ic.display1();
		ic.display2();
		
	}
}
