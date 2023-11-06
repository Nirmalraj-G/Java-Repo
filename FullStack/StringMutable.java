package FullStack;

public class StringMutable {

	public static void main(String args[]) {
		
		StringBuffer myObj = new StringBuffer("Nirmal");
		
		System.out.println(myObj);
		System.out.println(myObj.append("raj"));
		System.out.println(myObj.insert(6, "R"));
		System.out.println(myObj.delete(6, 7));
		System.out.println(myObj.reverse());
		System.out.println(myObj.length());
		
		
	}
}
