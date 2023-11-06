package FullStack;
//Default constructor
public class ConstructorCon {
	
	String Name;
	int age;
	
	public ConstructorCon() {
		Name = "Nirmal";
		age = 22;
	}
//	Parameterized constructor
	public ConstructorCon(String str, int n ) {
		Name = str;
		age = n;
		
	}
//	Copy Constructor
	public ConstructorCon(ConstructorCon other) {
		Name = other.Name;
		age = other.age;
	}
	
	
	public static void main(String args[]) {
		
//		Default Constructor
		ConstructorCon myObj = new ConstructorCon();
		System.out.println(myObj.Name);
		System.out.println(myObj.age);
		
//		parameterized constructor
		ConstructorCon myObj1 = new ConstructorCon("Gowthaman",22);
		System.out.println(myObj1.Name);
		System.out.println(myObj1.age);
		
//		Copy Constructor
		System.out.println("Copy constructor");
		ConstructorCon myObj2 = new ConstructorCon(myObj1);
		System.out.println(myObj2.Name);
		System.out.println(myObj2.age);
	}
}
