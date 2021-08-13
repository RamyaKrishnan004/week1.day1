package day2;



public class Palindrome {
	public static void main(String[] args) {
		String r = "Malayalam";
		String rev = "";
		char[] v = r.toCharArray();
		int l = v.length;
		for (int i = l-1; i >= 0; i--) {
			char c = v[i];
			rev = rev+c;
		}
		if (r.equalsIgnoreCase(rev)) {
			System.out.println("is Palindrome");
		}
		else {
			System.out.println("is not a Palindrome");
		}
	}}

		
	     
