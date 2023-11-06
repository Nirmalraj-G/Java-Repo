package FullStack;

public class NullPointerExcept {

	public static void main(String args[]) {
		
		
		String s1 = "Gowthaman";
		String s2 = null;
		try {
			int s3 = s2.length();
			System.out.println(s2);
		}catch (NullPointerException obj) {
			System.out.println(obj);
		}
		System.out.println(s1);
	}
}
