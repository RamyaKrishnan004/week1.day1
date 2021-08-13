package day2;

public class MyCalculator {
		public static void main(String[] args) {
			Calculator cal = new Calculator();
			cal.add(3, 4, 5);
			cal.sub(100, 72);
			cal.mul(12, 36);
			cal.div(1000, 24);
			System.out.println("calculated value is "+ cal.add(3, 4, 5));
			System.out.println("calculated value is "+ cal.sub(100, 72));
			System.out.println("calculated value is "+ cal.mul(12, 36));
			System.out.println("calculated value is "+ cal.div(1000, 24));
			
		}
}
