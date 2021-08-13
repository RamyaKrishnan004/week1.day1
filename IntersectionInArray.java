package day2;

public class IntersectionInArray {
public static void main(String[] args) {
	int[] array1 = {1,2,4,5,6,7,8};
	int[] array2 = {1,3,5,7};
	System.out.println("Intersection of two arrays :: ");
	for (int i = 0; i < array1.length; i++) {
		for (int j = 0; j < array2.length; j++) {
			if (array1[i]==array2[j]) {
				System.out.println(array2[j]);
				
			}
			
		}
		
	}
			
}
}
