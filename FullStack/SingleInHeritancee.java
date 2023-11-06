package FullStack;

class Parent{
	int az = 10;
	
	void myMethods() {
		System.out.println("Im the base class");
	}
}
class Childs extends Parent{
	int bx = 11;
	void myMethod2() {
		System.out.println("Im the child class");
	}
}


public class SingleInHeritancee {
	public static void main(String args[]) {
		Childs myObj = new Childs();
		System.out.println(myObj.az);
		System.out.println(myObj.bx);
		myObj.myMethods();
		myObj.myMethod2();
	}
	
}
