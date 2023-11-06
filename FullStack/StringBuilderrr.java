package FullStack;

public class StringBuilderrr {

	public static void main(String args[]) {
		StringBuilder myObj = new StringBuilder("Hii How are Youy!!");
		StringBuilder myObj2 = new StringBuilder("Ankara nova");
		System.out.println(myObj.capacity());
		System.out.println(myObj.charAt(6));
		System.out.println(myObj.codePointAt(6));
		System.out.println(myObj.codePointBefore(1));
		System.out.println(myObj.codePointCount(2, 6));
		System.out.println(myObj.compareTo(myObj2));
		System.out.println(myObj2.equals(myObj));
		System.out.println(myObj.hashCode());
		System.out.println(myObj2.hashCode());
		System.out.println(myObj.indexOf("a"));
		System.out.println(myObj.indexOf("h", 4));
		System.out.println(myObj2.length());
//		System.out.println(myObj.trimToSize());
	}
}
