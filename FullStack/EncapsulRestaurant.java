package FullStack;

public class EncapsulRestaurant {
	public static void main(String args[]) {
		
		EnCapsulation myObj = new EnCapsulation();
		
		myObj.setFood("Beef Briyani");
		myObj.setPrice(280);
		
		System.out.println(myObj.getFood());
		System.out.println(myObj.getPrice());
	}
}
