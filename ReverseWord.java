package day2;

public class ReverseWord {
	public static void main(String[] args) {
		String s = "Ramya Krishnan";
		String rev = "";
		int l = s.length();
		for (int i = l-1; i >= 0; i--) {
			char c = s.charAt(i);
			rev = rev+c;
		}
	System.out.println(rev);
	}

}
