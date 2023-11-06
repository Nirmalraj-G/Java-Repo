package FullStack;

class Goa{
	int rs = 15000;
	
	void enjoyment() {
		System.out.println("Vibing with Friends");
	}
}

class Tanjore extends Goa{
	int ex = 1000;
	
	void worship() {
		System.out.println("Lord Shivan");
	}
}

class LosVegas extends Tanjore{
	int doll = 100000;
	
	void visiting() {
		System.out.println("Vibing in beach with Fun activitys");
	}
}





public class MultileveiInheritance {
	public static void main(String args[]) {
		LosVegas myObj = new LosVegas();
		
		System.out.println(myObj.rs);
		System.out.println(myObj.doll);
		System.out.println(myObj.ex);
		
		myObj.enjoyment();
		myObj.visiting();
		myObj.worship();
		
		Tanjore myObj1 = new Tanjore();
		
		System.out.println(myObj1.rs);
		System.out.println(myObj1.ex);
		
		myObj1.enjoyment();
		myObj1.worship();
		
		Goa myObj2 = new Goa();
		
		System.out.println(myObj2.rs);
		myObj2.enjoyment();
	}
}
