package FullStack;

class Domain{
	int std = 22;
	
	void details() {
		System.out.println("Full Stack Developer");
	}
}
class Traine extends Domain{
	int T = 15;
	void about() {
		System.out.println("Java Trainee");
	}
}
class Advisor extends Domain {
	int No = 22;
	
	void fullStack() {
		System.out.println("Rp-19 Slot-3");
	}
}


public class HierarchicalInheritance {
	public static void main(String args[]) {
		Domain myObj = new Domain();
		
		System.out.println(myObj.std);
		myObj.details();
		
		Traine myObj1 = new Traine();
		System.out.println(myObj1.std);
		System.out.println(myObj1.T);
		myObj1.details();
		myObj1.about();
		
		Advisor myObj2 = new Advisor();
		System.out.println(myObj2.std);
		System.out.println(myObj2.No);
		myObj2.details();
		myObj2.fullStack();
	}
}
