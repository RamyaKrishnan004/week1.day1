package day2;

public class FindTypes {
	public static void main(String[] args) {
		String r = "oops java";
		int length = r.length();
		char [] ch = r.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = i+1; j < ch.length; j++) {
				if (ch[i]==ch[j]) 
				{
					System.out.println("occurance characters are : " + ch[j]);
					break;
					
				}
				
			}
			
		}
		
	}

}
