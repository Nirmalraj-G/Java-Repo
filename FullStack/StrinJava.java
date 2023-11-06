package FullStack;

public class StrinJava {
	public static void main(String args[]) {
		String alphabets = "abcdefghijklmnopqrstuvwxyz";
//		To find length of the string
		System.out.println("The Length of the String is " + alphabets.length());
//		To convert UpperCase
		System.out.println(alphabets.toUpperCase());
//		To convert LowerCase
		System.out.println(alphabets.toLowerCase());
//		To find index value
		System.out.println("Index of given value " + alphabets.indexOf( "n"));
//		To ADD to string two methods:
		String x = "5";
		String y = "5";
		System.out.println(x + y );
		System.out.println(x.concat(y));
//		To print special symbols
		String sym = "Hello \"Everyone\" good morning ";
		System.out.println(sym);
//		To print particular index position value
		System.out.println(sym.charAt(7));
//		To Check  the String is present are not using ending word result in T/F
		String N1 = "Nirmal";
		String N2 = "Gowthaman";
		String N3 = "Asis Nova";
		System.out.println(N3.endsWith("Nova"));
//		To compare two string
		System.out.println(N1.compareTo(N3));
//		TO check given string is equal or not
		System.out.println(N2.equals(N1));
//		To replace the word or letter
		System.out.println(N3.replace("Nova", "nova"));
//		To print using index value
		System.out.println(N2.substring(0,4));
//		TO check given string is empty
		String d = " ";
		System.out.println(d.isEmpty());
//		To check given string is blank
		System.out.println(d.isBlank());
		
		
	}
	
}
