package day2;

public class OddIndexToUpperCase {
	public static void main(String[] args) {
		String r = "welcome";
		char[] word = r.toCharArray();
		for (int i = 0; i < word.length; i++) {
			if (i%2 !=0) {
				System.out.print(Character.toUpperCase(word[i]));
				}
				else {
			
				System.out.print(word[i]);
			}
				
			}
			
		}
	}

