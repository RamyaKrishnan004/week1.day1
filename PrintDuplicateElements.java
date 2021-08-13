package day2;

public class PrintDuplicateElements {
public static void main(String[] args) {
	int[] array = {1,2,3,3,4,4,2,5,6,7,8,7};
	System.out.println("Duplicate elements in given array : ");
	for (int i = 0; i < array.length; i++) {
		for (int j = i+1; j < array.length; j++) {
			if (array[i]==array[j]) {
				System.out.println(array[j]);
			}
		}
	}
}
}
