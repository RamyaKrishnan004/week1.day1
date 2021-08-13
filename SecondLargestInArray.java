package day2;

import java.util.Arrays;

public class SecondLargestInArray {
  public static void main(String[] args) {    
	  int[] arrNum = {12,45,23,64, 100,24};    
	  Arrays.sort(arrNum);
		System.out.println(" Largest element in the array:" + arrNum[arrNum.length-1]);
		System.out.println(" Second Largest element in the array:" + arrNum[arrNum.length-2]);	

	}

}