package day1;

public class FibonacciSeries {
	public static void main(String[] args) {
		int n=10;
		int a=0, b=1;
		for (int i = 1; i <=n; i++) {
			int c = a+b;
			System.out.println(c);
			a=b;
			b=c;
			
		}
	}

}
