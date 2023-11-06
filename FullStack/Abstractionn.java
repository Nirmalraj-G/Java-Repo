package FullStack;

abstract class Atm{
	abstract void cash();	
}
abstract class Withdraw extends Atm{
	abstract void PinChange();
	
	void balanceChek() {
		System.out.println("Your available balance is 19376634567");
	}	
	void verification() {
		System.out.println("Pin has been Verified");
	}
}

public class Abstractionn extends Withdraw {

	@Override
	void PinChange() {
		System.out.println("Enter the New Pin:");
		
	}

	@Override
	void cash() {
		System.out.println("Debited Rs:100000");
		
	}
	public static void main(String args[]) {
		Abstractionn myObj = new Abstractionn();
		
		myObj.PinChange();
		myObj.verification();
		myObj.cash();
		myObj.balanceChek();
	}	
}
