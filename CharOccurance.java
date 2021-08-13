package day2;

public class CharOccurance {
	public static void main(String[] args) {
	String s = "Welcome To Java Class Tommorow At 2.30 pm";  
	int count = 0; 	 
	int count1 = 0;  
	int count2 = 0;   
	for (int i = 0; i < s.length(); i++) {   
	if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
	{ 
			count++; 
		} 
	else if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
	{ 
			count1++;    
	  	}
	 else if (s.charAt(i) >= '0' && s.charAt(i) <= '9') 
	{ 
		 	count2++;    
	    }
	
	  }  
	System.out.println("total no of small letters:" + count);  
	System.out.println("total no of capital letters:" + count1);   
	System.out.println("total no of digits :" + count2);  
	}
	}  
	 


